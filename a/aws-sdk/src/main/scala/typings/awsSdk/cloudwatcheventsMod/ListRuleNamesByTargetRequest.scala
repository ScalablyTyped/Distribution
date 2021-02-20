package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRuleNamesByTargetRequest extends StObject {
  
  /**
    * The name or ARN of the event bus to list rules for. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[EventBusNameOrArn] = js.native
  
  /**
    * The maximum number of results to return.
    */
  var Limit: js.UndefOr[LimitMax100] = js.native
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.NextToken] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the target resource.
    */
  var TargetArn: typings.awsSdk.cloudwatcheventsMod.TargetArn = js.native
}
object ListRuleNamesByTargetRequest {
  
  @scala.inline
  def apply(TargetArn: TargetArn): ListRuleNamesByTargetRequest = {
    val __obj = js.Dynamic.literal(TargetArn = TargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRuleNamesByTargetRequest]
  }
  
  @scala.inline
  implicit class ListRuleNamesByTargetRequestMutableBuilder[Self <: ListRuleNamesByTargetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventBusName(value: EventBusNameOrArn): Self = StObject.set(x, "EventBusName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBusNameUndefined: Self = StObject.set(x, "EventBusName", js.undefined)
    
    @scala.inline
    def setLimit(value: LimitMax100): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTargetArn(value: TargetArn): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
  }
}
