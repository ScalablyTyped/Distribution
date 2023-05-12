package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExportInput extends StObject {
  
  /**
    * <p>The Amazon Resource Name (ARN) associated with the export.</p>
    */
  var ExportArn: js.UndefOr[String] = js.undefined
}
object DescribeExportInput {
  
  inline def apply(): DescribeExportInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeExportInput] (val x: Self) extends AnyVal {
    
    inline def setExportArn(value: String): Self = StObject.set(x, "ExportArn", value.asInstanceOf[js.Any])
    
    inline def setExportArnUndefined: Self = StObject.set(x, "ExportArn", js.undefined)
  }
}
