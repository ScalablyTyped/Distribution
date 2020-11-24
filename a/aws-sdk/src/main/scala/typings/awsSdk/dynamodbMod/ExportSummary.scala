package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportSummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the export.
    */
  var ExportArn: js.UndefOr[typings.awsSdk.dynamodbMod.ExportArn] = js.native
  
  /**
    * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
    */
  var ExportStatus: js.UndefOr[typings.awsSdk.dynamodbMod.ExportStatus] = js.native
}
object ExportSummary {
  
  @scala.inline
  def apply(): ExportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportSummary]
  }
  
  @scala.inline
  implicit class ExportSummaryOps[Self <: ExportSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExportArn(value: ExportArn): Self = this.set("ExportArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportArn: Self = this.set("ExportArn", js.undefined)
    
    @scala.inline
    def setExportStatus(value: ExportStatus): Self = this.set("ExportStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportStatus: Self = this.set("ExportStatus", js.undefined)
  }
}
