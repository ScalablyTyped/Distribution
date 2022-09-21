package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBotsResponse extends StObject {
  
  /**
    * The names and Regions of the Amazon Lex or Amazon Lex V2 bots associated with the specified instance.
    */
  var LexBots: js.UndefOr[LexBotConfigList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.undefined
}
object ListBotsResponse {
  
  inline def apply(): ListBotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBotsResponse]
  }
  
  extension [Self <: ListBotsResponse](x: Self) {
    
    inline def setLexBots(value: LexBotConfigList): Self = StObject.set(x, "LexBots", value.asInstanceOf[js.Any])
    
    inline def setLexBotsUndefined: Self = StObject.set(x, "LexBots", js.undefined)
    
    inline def setLexBotsVarargs(value: LexBotConfig*): Self = StObject.set(x, "LexBots", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
