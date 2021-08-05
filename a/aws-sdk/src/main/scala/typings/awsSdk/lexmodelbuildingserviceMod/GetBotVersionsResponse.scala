package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBotVersionsResponse extends StObject {
  
  /**
    * An array of BotMetadata objects, one for each numbered version of the bot plus one for the $LATEST version.
    */
  var bots: js.UndefOr[BotMetadataList] = js.undefined
  
  /**
    * A pagination token for fetching the next page of bot versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetBotVersionsResponse {
  
  inline def apply(): GetBotVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotVersionsResponse]
  }
  
  extension [Self <: GetBotVersionsResponse](x: Self) {
    
    inline def setBots(value: BotMetadataList): Self = StObject.set(x, "bots", value.asInstanceOf[js.Any])
    
    inline def setBotsUndefined: Self = StObject.set(x, "bots", js.undefined)
    
    inline def setBotsVarargs(value: BotMetadata*): Self = StObject.set(x, "bots", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
