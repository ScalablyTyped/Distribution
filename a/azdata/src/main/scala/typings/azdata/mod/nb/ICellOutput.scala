package typings.azdata.mod.nb

import typings.azdata.anon.AzdatachartOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICellOutput extends StObject {
  
  var metadata: js.UndefOr[AzdatachartOptions] = js.undefined
  
  var output_type: OutputTypeName
}
object ICellOutput {
  
  inline def apply(output_type: OutputTypeName): ICellOutput = {
    val __obj = js.Dynamic.literal(output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellOutput]
  }
  
  extension [Self <: ICellOutput](x: Self) {
    
    inline def setMetadata(value: AzdatachartOptions): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOutput_type(value: OutputTypeName): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
  }
}
