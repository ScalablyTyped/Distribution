package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExportOutput extends js.Object {
  
  /**
    * Represents the properties of the export.
    */
  var ExportDescription: js.UndefOr[typings.awsSdk.dynamodbMod.ExportDescription] = js.native
}
object DescribeExportOutput {
  
  @scala.inline
  def apply(): DescribeExportOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportOutput]
  }
  
  @scala.inline
  implicit class DescribeExportOutputOps[Self <: DescribeExportOutput] (val x: Self) extends AnyVal {
    
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
