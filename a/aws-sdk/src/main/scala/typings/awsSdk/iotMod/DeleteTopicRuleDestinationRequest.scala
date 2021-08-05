package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTopicRuleDestinationRequest extends StObject {
  
  /**
    * The ARN of the topic rule destination to delete.
    */
  var arn: AwsArn
}
object DeleteTopicRuleDestinationRequest {
  
  inline def apply(arn: AwsArn): DeleteTopicRuleDestinationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTopicRuleDestinationRequest]
  }
  
  extension [Self <: DeleteTopicRuleDestinationRequest](x: Self) {
    
    inline def setArn(value: AwsArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
