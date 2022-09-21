package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyResponse extends StObject {
  
  /**
    * An object that specifies information about a property.
    */
  var definition: js.UndefOr[PropertyDefinitionResponse] = js.undefined
  
  /**
    * The value of the property.
    */
  var value: js.UndefOr[DataValue] = js.undefined
}
object PropertyResponse {
  
  inline def apply(): PropertyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyResponse]
  }
  
  extension [Self <: PropertyResponse](x: Self) {
    
    inline def setDefinition(value: PropertyDefinitionResponse): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setValue(value: DataValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
