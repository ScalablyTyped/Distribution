package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGameSessionQueuesOutput extends js.Object {
  
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
  implicit class DescribeGameSessionQueuesOutputOps[Self <: DescribeGameSessionQueuesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGameSessionQueuesVarargs(value: GameSessionQueue*): Self = this.set("GameSessionQueues", js.Array(value :_*))
    
    @scala.inline
    def setGameSessionQueues(value: GameSessionQueueList): Self = this.set("GameSessionQueues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameSessionQueues: Self = this.set("GameSessionQueues", js.undefined)
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
