package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExportOutput extends StObject {
  
  /**
    * Represents the properties of the export.
    */
  var ExportDescription: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.ExportDescription] = js.undefined
}
object DescribeExportOutput {
  
  inline def apply(): DescribeExportOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeExportOutput] (val x: Self) extends AnyVal {
    
    inline def setExportDescription(value: ExportDescription): Self = StObject.set(x, "ExportDescription", value.asInstanceOf[js.Any])
    
    inline def setExportDescriptionUndefined: Self = StObject.set(x, "ExportDescription", js.undefined)
  }
}
