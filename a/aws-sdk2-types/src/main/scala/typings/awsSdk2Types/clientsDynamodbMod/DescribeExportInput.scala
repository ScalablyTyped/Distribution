package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExportInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) associated with the export.
    */
  var ExportArn: typings.awsSdk2Types.clientsDynamodbMod.ExportArn
}
object DescribeExportInput {
  
  inline def apply(ExportArn: ExportArn): DescribeExportInput = {
    val __obj = js.Dynamic.literal(ExportArn = ExportArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExportInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeExportInput] (val x: Self) extends AnyVal {
    
    inline def setExportArn(value: ExportArn): Self = StObject.set(x, "ExportArn", value.asInstanceOf[js.Any])
  }
}
