package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTopicRuleDestinationRequest extends StObject {
  
  /**
    * The ARN of the topic rule destination.
    */
  var arn: AwsArn
}
object GetTopicRuleDestinationRequest {
  
  @scala.inline
  def apply(arn: AwsArn): GetTopicRuleDestinationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTopicRuleDestinationRequest]
  }
  
  @scala.inline
  implicit class GetTopicRuleDestinationRequestMutableBuilder[Self <: GetTopicRuleDestinationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AwsArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
