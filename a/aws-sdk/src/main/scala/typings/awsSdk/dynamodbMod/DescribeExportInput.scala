package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExportInput extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) associated with the export.
    */
  var ExportArn: typings.awsSdk.dynamodbMod.ExportArn = js.native
}
object DescribeExportInput {
  
  @scala.inline
  def apply(ExportArn: ExportArn): DescribeExportInput = {
    val __obj = js.Dynamic.literal(ExportArn = ExportArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExportInput]
  }
  
  @scala.inline
  implicit class DescribeExportInputOps[Self <: DescribeExportInput] (val x: Self) extends AnyVal {
    
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
  }
}
