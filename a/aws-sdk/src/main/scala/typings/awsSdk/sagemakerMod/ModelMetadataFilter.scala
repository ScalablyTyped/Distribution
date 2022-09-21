package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelMetadataFilter extends StObject {
  
  /**
    * The name of the of the model to filter by.
    */
  var Name: ModelMetadataFilterType
  
  /**
    * The value to filter the model metadata.
    */
  var Value: String256
}
object ModelMetadataFilter {
  
  inline def apply(Name: ModelMetadataFilterType, Value: String256): ModelMetadataFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelMetadataFilter]
  }
  
  extension [Self <: ModelMetadataFilter](x: Self) {
    
    inline def setName(value: ModelMetadataFilterType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String256): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
