package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSlotTypesResponse extends StObject {
  
  /**
    * If the response is truncated, it includes a pagination token that you can specify in your next request to fetch the next page of slot types.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of objects, one for each slot type, that provides information such as the name of the slot type, the version, and a description.
    */
  var slotTypes: js.UndefOr[SlotTypeMetadataList] = js.undefined
}
object GetSlotTypesResponse {
  
  inline def apply(): GetSlotTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSlotTypesResponse]
  }
  
  extension [Self <: GetSlotTypesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSlotTypes(value: SlotTypeMetadataList): Self = StObject.set(x, "slotTypes", value.asInstanceOf[js.Any])
    
    inline def setSlotTypesUndefined: Self = StObject.set(x, "slotTypes", js.undefined)
    
    inline def setSlotTypesVarargs(value: SlotTypeMetadata*): Self = StObject.set(x, "slotTypes", js.Array(value*))
  }
}
