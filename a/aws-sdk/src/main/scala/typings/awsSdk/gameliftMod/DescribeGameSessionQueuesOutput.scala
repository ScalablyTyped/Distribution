package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGameSessionQueuesOutput extends StObject {
  
  /**
    * A collection of objects that describe the requested game session queues.
    */
  var GameSessionQueues: js.UndefOr[GameSessionQueueList] = js.native
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}
object DescribeGameSessionQueuesOutput {
  
  @scala.inline
  def apply(): DescribeGameSessionQueuesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameSessionQueuesOutput]
  }
  
  @scala.inline
  implicit class DescribeGameSessionQueuesOutputMutableBuilder[Self <: DescribeGameSessionQueuesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameSessionQueues(value: GameSessionQueueList): Self = StObject.set(x, "GameSessionQueues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionQueuesUndefined: Self = StObject.set(x, "GameSessionQueues", js.undefined)
    
    @scala.inline
    def setGameSessionQueuesVarargs(value: GameSessionQueue*): Self = StObject.set(x, "GameSessionQueues", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
