package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportTableToPointInTimeOutput extends js.Object {
  
  /**
    * Contains a description of the table export.
    */
  var ExportDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ExportDescription] = js.native
}
object ExportTableToPointInTimeOutput {
  
  @scala.inline
  def apply(): ExportTableToPointInTimeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTableToPointInTimeOutput]
  }
  
  @scala.inline
  implicit class ExportTableToPointInTimeOutputOps[Self <: ExportTableToPointInTimeOutput] (val x: Self) extends AnyVal {
    
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
    def setExportDescription(value: ExportDescription): Self = this.set("ExportDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportDescription: Self = this.set("ExportDescription", js.undefined)
  }
}
