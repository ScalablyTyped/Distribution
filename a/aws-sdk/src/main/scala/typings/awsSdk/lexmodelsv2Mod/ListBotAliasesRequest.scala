package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBotAliasesRequest extends StObject {
  
  /**
    * The identifier of the bot to list aliases for.
    */
  var botId: Id
  
  /**
    * The maximum number of aliases to return in each page of results. If there are fewer results than the max page size, only the actual number of results are returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * If the response from the ListBotAliases operation contains more results than specified in the maxResults parameter, a token is returned in the response. Use that token in the nextToken parameter to return the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBotAliasesRequest {
  
  inline def apply(botId: Id): ListBotAliasesRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBotAliasesRequest]
  }
  
  extension [Self <: ListBotAliasesRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
