package typings.azdata.mod.nb

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDisplayResult
  extends StObject
     with ICellOutput {
  
  /**
    * Mime bundle expected to contain mime type -> contents mappings.
    * This is dynamic and is controlled by kernels, so cannot be more specific
    */
  var data: StringDictionary[js.Any]
  
  /**
    * Optional metadata, also a mime bundle
    */
  @JSName("metadata")
  var metadata_IDisplayResult: js.UndefOr[js.Object] = js.undefined
}
object IDisplayResult {
  
  inline def apply(data: StringDictionary[js.Any], output_type: OutputTypeName): IDisplayResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayResult]
  }
  
  extension [Self <: IDisplayResult](x: Self) {
    
    inline def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
