package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBotAliasesResponse extends StObject {
  
  /**
    * Summary information for the bot aliases that meet the filter criteria specified in the request. The length of the list is specified in the maxResults parameter of the request. If there are more aliases available, the nextToken field contains a token to get the next page of results.
    */
  var botAliasSummaries: js.UndefOr[BotAliasSummaryList] = js.undefined
  
  /**
    * The identifier of the bot associated with the aliases.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * A token that indicates whether there are more results to return in a response to the ListBotAliases operation. If the nextToken field is present, you send the contents as the nextToken parameter of a ListBotAliases operation request to get the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBotAliasesResponse {
  
  inline def apply(): ListBotAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBotAliasesResponse]
  }
  
  extension [Self <: ListBotAliasesResponse](x: Self) {
    
    inline def setBotAliasSummaries(value: BotAliasSummaryList): Self = StObject.set(x, "botAliasSummaries", value.asInstanceOf[js.Any])
    
    inline def setBotAliasSummariesUndefined: Self = StObject.set(x, "botAliasSummaries", js.undefined)
    
    inline def setBotAliasSummariesVarargs(value: BotAliasSummary*): Self = StObject.set(x, "botAliasSummaries", js.Array(value*))
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
