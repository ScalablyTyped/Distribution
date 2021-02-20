package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExportInput extends StObject {
  
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
  implicit class DescribeExportInputMutableBuilder[Self <: DescribeExportInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportArn(value: ExportArn): Self = StObject.set(x, "ExportArn", value.asInstanceOf[js.Any])
  }
}
