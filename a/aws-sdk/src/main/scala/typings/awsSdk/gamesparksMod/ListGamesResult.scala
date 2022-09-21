package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGamesResult extends StObject {
  
  /**
    * The list of games.
    */
  var Games: js.UndefOr[GameSummaryList] = js.undefined
  
  /**
    * The token that indicates the start of the next sequential page of results.  Use this value when making the next call to this operation to continue where the last one finished. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.gamesparksMod.NextToken] = js.undefined
}
object ListGamesResult {
  
  inline def apply(): ListGamesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGamesResult]
  }
  
  extension [Self <: ListGamesResult](x: Self) {
    
    inline def setGames(value: GameSummaryList): Self = StObject.set(x, "Games", value.asInstanceOf[js.Any])
    
    inline def setGamesUndefined: Self = StObject.set(x, "Games", js.undefined)
    
    inline def setGamesVarargs(value: GameSummary*): Self = StObject.set(x, "Games", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
