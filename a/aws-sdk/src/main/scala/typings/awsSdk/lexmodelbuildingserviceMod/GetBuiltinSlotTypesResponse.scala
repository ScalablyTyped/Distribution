package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBuiltinSlotTypesResponse extends StObject {
  
  /**
    * If the response is truncated, the response includes a pagination token that you can use in your next request to fetch the next page of slot types.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of BuiltInSlotTypeMetadata objects, one entry for each slot type returned.
    */
  var slotTypes: js.UndefOr[BuiltinSlotTypeMetadataList] = js.undefined
}
object GetBuiltinSlotTypesResponse {
  
  inline def apply(): GetBuiltinSlotTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBuiltinSlotTypesResponse]
  }
  
  extension [Self <: GetBuiltinSlotTypesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSlotTypes(value: BuiltinSlotTypeMetadataList): Self = StObject.set(x, "slotTypes", value.asInstanceOf[js.Any])
    
    inline def setSlotTypesUndefined: Self = StObject.set(x, "slotTypes", js.undefined)
    
    inline def setSlotTypesVarargs(value: BuiltinSlotTypeMetadata*): Self = StObject.set(x, "slotTypes", js.Array(value :_*))
  }
}
