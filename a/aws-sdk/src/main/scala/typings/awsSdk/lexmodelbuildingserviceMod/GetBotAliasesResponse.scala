package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBotAliasesResponse extends StObject {
  
  /**
    * An array of BotAliasMetadata objects, each describing a bot alias.
    */
  var BotAliases: js.UndefOr[BotAliasMetadataList] = js.undefined
  
  /**
    * A pagination token for fetching next page of aliases. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of aliases, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetBotAliasesResponse {
  
  inline def apply(): GetBotAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotAliasesResponse]
  }
  
  extension [Self <: GetBotAliasesResponse](x: Self) {
    
    inline def setBotAliases(value: BotAliasMetadataList): Self = StObject.set(x, "BotAliases", value.asInstanceOf[js.Any])
    
    inline def setBotAliasesUndefined: Self = StObject.set(x, "BotAliases", js.undefined)
    
    inline def setBotAliasesVarargs(value: BotAliasMetadata*): Self = StObject.set(x, "BotAliases", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
