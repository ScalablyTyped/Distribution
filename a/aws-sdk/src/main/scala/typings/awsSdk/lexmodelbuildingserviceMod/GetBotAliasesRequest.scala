package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBotAliasesRequest extends StObject {
  
  /**
    * The name of the bot.
    */
  var botName: BotName
  
  /**
    * The maximum number of aliases to return in the response. The default is 50. . 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Substring to match in bot alias names. An alias will be returned if any part of its name matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
    */
  var nameContains: js.UndefOr[AliasName] = js.undefined
  
  /**
    * A pagination token for fetching the next page of aliases. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of aliases, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetBotAliasesRequest {
  
  @scala.inline
  def apply(botName: BotName): GetBotAliasesRequest = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBotAliasesRequest]
  }
  
  @scala.inline
  implicit class GetBotAliasesRequestMutableBuilder[Self <: GetBotAliasesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNameContains(value: AliasName): Self = StObject.set(x, "nameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameContainsUndefined: Self = StObject.set(x, "nameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
