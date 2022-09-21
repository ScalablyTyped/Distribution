package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyRequest extends StObject {
  
  /**
    * An object that specifies information about a property.
    */
  var definition: js.UndefOr[PropertyDefinitionRequest] = js.undefined
  
  /**
    * The update type of the update property request.
    */
  var updateType: js.UndefOr[PropertyUpdateType] = js.undefined
  
  /**
    * The value of the property.
    */
  var value: js.UndefOr[DataValue] = js.undefined
}
object PropertyRequest {
  
  inline def apply(): PropertyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyRequest]
  }
  
  extension [Self <: PropertyRequest](x: Self) {
    
    inline def setDefinition(value: PropertyDefinitionRequest): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setUpdateType(value: PropertyUpdateType): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
    
    inline def setUpdateTypeUndefined: Self = StObject.set(x, "updateType", js.undefined)
    
    inline def setValue(value: DataValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
