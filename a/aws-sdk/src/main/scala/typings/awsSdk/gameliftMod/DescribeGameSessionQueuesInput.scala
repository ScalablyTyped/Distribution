package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGameSessionQueuesInput extends StObject {
  
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. You can request up to 50 results.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  
  /**
    * A list of queue names to retrieve information for. You can use either the queue ID or ARN value. To request settings for all queues, leave this parameter empty. 
    */
  var Names: js.UndefOr[GameSessionQueueNameOrArnList] = js.native
  
  /**
    * A token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this operation. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}
object DescribeGameSessionQueuesInput {
  
  @scala.inline
  def apply(): DescribeGameSessionQueuesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameSessionQueuesInput]
  }
  
  @scala.inline
  implicit class DescribeGameSessionQueuesInputMutableBuilder[Self <: DescribeGameSessionQueuesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: PositiveInteger): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNames(value: GameSessionQueueNameOrArnList): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: GameSessionQueueNameOrArn*): Self = StObject.set(x, "Names", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
