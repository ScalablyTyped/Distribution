package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePlayerSessionsOutput extends StObject {
  
  /**
    * Token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * A collection of objects containing properties for each player session that matches the request.
    */
  var PlayerSessions: js.UndefOr[PlayerSessionList] = js.undefined
}
object DescribePlayerSessionsOutput {
  
  inline def apply(): DescribePlayerSessionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePlayerSessionsOutput]
  }
  
  extension [Self <: DescribePlayerSessionsOutput](x: Self) {
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPlayerSessions(value: PlayerSessionList): Self = StObject.set(x, "PlayerSessions", value.asInstanceOf[js.Any])
    
    inline def setPlayerSessionsUndefined: Self = StObject.set(x, "PlayerSessions", js.undefined)
    
    inline def setPlayerSessionsVarargs(value: PlayerSession*): Self = StObject.set(x, "PlayerSessions", js.Array(value :_*))
  }
}
