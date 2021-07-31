package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBotsRequest extends StObject {
  
  /**
    * The maximum number of bots to return in the response that the request will return. The default is 10.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Substring to match in bot names. A bot will be returned if any part of its name matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
    */
  var nameContains: js.UndefOr[BotName] = js.undefined
  
  /**
    * A pagination token that fetches the next page of bots. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of bots, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetBotsRequest {
  
  @scala.inline
  def apply(): GetBotsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotsRequest]
  }
  
  @scala.inline
  implicit class GetBotsRequestMutableBuilder[Self <: GetBotsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNameContains(value: BotName): Self = StObject.set(x, "nameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameContainsUndefined: Self = StObject.set(x, "nameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
