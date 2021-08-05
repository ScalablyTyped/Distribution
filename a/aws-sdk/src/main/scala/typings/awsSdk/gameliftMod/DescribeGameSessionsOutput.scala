package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGameSessionsOutput extends StObject {
  
  /**
    * A collection of objects containing game session properties for each session matching the request.
    */
  var GameSessions: js.UndefOr[GameSessionList] = js.undefined
  
  /**
    * Token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object DescribeGameSessionsOutput {
  
  inline def apply(): DescribeGameSessionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameSessionsOutput]
  }
  
  extension [Self <: DescribeGameSessionsOutput](x: Self) {
    
    inline def setGameSessions(value: GameSessionList): Self = StObject.set(x, "GameSessions", value.asInstanceOf[js.Any])
    
    inline def setGameSessionsUndefined: Self = StObject.set(x, "GameSessions", js.undefined)
    
    inline def setGameSessionsVarargs(value: GameSession*): Self = StObject.set(x, "GameSessions", js.Array(value :_*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
