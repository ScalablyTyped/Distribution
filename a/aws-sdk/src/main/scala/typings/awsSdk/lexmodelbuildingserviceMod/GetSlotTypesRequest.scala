package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSlotTypesRequest extends StObject {
  
  /**
    * The maximum number of slot types to return in the response. The default is 10.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Substring to match in slot type names. A slot type will be returned if any part of its name matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
    */
  var nameContains: js.UndefOr[SlotTypeName] = js.undefined
  
  /**
    * A pagination token that fetches the next page of slot types. If the response to this API call is truncated, Amazon Lex returns a pagination token in the response. To fetch next page of slot types, specify the pagination token in the next request.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetSlotTypesRequest {
  
  @scala.inline
  def apply(): GetSlotTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSlotTypesRequest]
  }
  
  @scala.inline
  implicit class GetSlotTypesRequestMutableBuilder[Self <: GetSlotTypesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNameContains(value: SlotTypeName): Self = StObject.set(x, "nameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameContainsUndefined: Self = StObject.set(x, "nameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
