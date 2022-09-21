package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEntitiesResponse extends StObject {
  
  /**
    * An array of descriptions for the specified entities.
    */
  var descriptions: js.UndefOr[EntityDescriptions] = js.undefined
}
object GetEntitiesResponse {
  
  inline def apply(): GetEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEntitiesResponse]
  }
  
  extension [Self <: GetEntitiesResponse](x: Self) {
    
    inline def setDescriptions(value: EntityDescriptions): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    inline def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
    
    inline def setDescriptionsVarargs(value: EntityDescription*): Self = StObject.set(x, "descriptions", js.Array(value*))
  }
}
