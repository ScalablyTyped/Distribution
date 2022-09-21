package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGameSessionDetailsOutput extends StObject {
  
  /**
    * A collection of properties for each game session that matches the request.
    */
  var GameSessionDetails: js.UndefOr[GameSessionDetailList] = js.undefined
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object DescribeGameSessionDetailsOutput {
  
  inline def apply(): DescribeGameSessionDetailsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameSessionDetailsOutput]
  }
  
  extension [Self <: DescribeGameSessionDetailsOutput](x: Self) {
    
    inline def setGameSessionDetails(value: GameSessionDetailList): Self = StObject.set(x, "GameSessionDetails", value.asInstanceOf[js.Any])
    
    inline def setGameSessionDetailsUndefined: Self = StObject.set(x, "GameSessionDetails", js.undefined)
    
    inline def setGameSessionDetailsVarargs(value: GameSessionDetail*): Self = StObject.set(x, "GameSessionDetails", js.Array(value*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
