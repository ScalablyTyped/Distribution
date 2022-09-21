package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGameSessionQueuesOutput extends StObject {
  
  /**
    * A collection of objects that describe the requested game session queues.
    */
  var GameSessionQueues: js.UndefOr[GameSessionQueueList] = js.undefined
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object DescribeGameSessionQueuesOutput {
  
  inline def apply(): DescribeGameSessionQueuesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameSessionQueuesOutput]
  }
  
  extension [Self <: DescribeGameSessionQueuesOutput](x: Self) {
    
    inline def setGameSessionQueues(value: GameSessionQueueList): Self = StObject.set(x, "GameSessionQueues", value.asInstanceOf[js.Any])
    
    inline def setGameSessionQueuesUndefined: Self = StObject.set(x, "GameSessionQueues", js.undefined)
    
    inline def setGameSessionQueuesVarargs(value: GameSessionQueue*): Self = StObject.set(x, "GameSessionQueues", js.Array(value*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
