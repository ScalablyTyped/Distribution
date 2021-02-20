package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBuiltinSlotTypesResponse extends StObject {
  
  /**
    * If the response is truncated, the response includes a pagination token that you can use in your next request to fetch the next page of slot types.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * An array of BuiltInSlotTypeMetadata objects, one entry for each slot type returned.
    */
  var slotTypes: js.UndefOr[BuiltinSlotTypeMetadataList] = js.native
}
object GetBuiltinSlotTypesResponse {
  
  @scala.inline
  def apply(): GetBuiltinSlotTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBuiltinSlotTypesResponse]
  }
  
  @scala.inline
  implicit class GetBuiltinSlotTypesResponseMutableBuilder[Self <: GetBuiltinSlotTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSlotTypes(value: BuiltinSlotTypeMetadataList): Self = StObject.set(x, "slotTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotTypesUndefined: Self = StObject.set(x, "slotTypes", js.undefined)
    
    @scala.inline
    def setSlotTypesVarargs(value: BuiltinSlotTypeMetadata*): Self = StObject.set(x, "slotTypes", js.Array(value :_*))
  }
}
