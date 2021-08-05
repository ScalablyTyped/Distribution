package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBotChannelAssociationsRequest extends StObject {
  
  /**
    * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
    */
  var botAlias: AliasNameOrListAll
  
  /**
    * The name of the Amazon Lex bot in the association.
    */
  var botName: BotName
  
  /**
    * The maximum number of associations to return in the response. The default is 50. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Substring to match in channel association names. An association will be returned if any part of its name matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz." To return all bot channel associations, use a hyphen ("-") as the nameContains parameter.
    */
  var nameContains: js.UndefOr[BotChannelName] = js.undefined
  
  /**
    * A pagination token for fetching the next page of associations. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of associations, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetBotChannelAssociationsRequest {
  
  inline def apply(botAlias: AliasNameOrListAll, botName: BotName): GetBotChannelAssociationsRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBotChannelAssociationsRequest]
  }
  
  extension [Self <: GetBotChannelAssociationsRequest](x: Self) {
    
    inline def setBotAlias(value: AliasNameOrListAll): Self = StObject.set(x, "botAlias", value.asInstanceOf[js.Any])
    
    inline def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNameContains(value: BotChannelName): Self = StObject.set(x, "nameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "nameContains", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
