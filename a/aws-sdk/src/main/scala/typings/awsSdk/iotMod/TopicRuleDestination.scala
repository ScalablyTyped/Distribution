package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleDestination extends StObject {
  
  /**
    * The topic rule destination URL.
    */
  var arn: js.UndefOr[AwsArn] = js.native
  
  /**
    * Properties of the HTTP URL.
    */
  var httpUrlProperties: js.UndefOr[HttpUrlDestinationProperties] = js.native
  
  /**
    * The status of the topic rule destination. Valid values are:  IN_PROGRESS  A topic rule destination was created but has not been confirmed. You can set status to IN_PROGRESS by calling UpdateTopicRuleDestination. Calling UpdateTopicRuleDestination causes a new confirmation challenge to be sent to your confirmation endpoint.  ENABLED  Confirmation was completed, and traffic to this destination is allowed. You can set status to DISABLED by calling UpdateTopicRuleDestination.  DISABLED  Confirmation was completed, and traffic to this destination is not allowed. You can set status to ENABLED by calling UpdateTopicRuleDestination.  ERROR  Confirmation could not be completed, for example if the confirmation timed out. You can call GetTopicRuleDestination for details about the error. You can set status to IN_PROGRESS by calling UpdateTopicRuleDestination. Calling UpdateTopicRuleDestination causes a new confirmation challenge to be sent to your confirmation endpoint.  
    */
  var status: js.UndefOr[TopicRuleDestinationStatus] = js.native
  
  /**
    * Additional details or reason why the topic rule destination is in the current status.
    */
  var statusReason: js.UndefOr[String] = js.native
}
object TopicRuleDestination {
  
  @scala.inline
  def apply(): TopicRuleDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRuleDestination]
  }
  
  @scala.inline
  implicit class TopicRuleDestinationMutableBuilder[Self <: TopicRuleDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AwsArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setHttpUrlProperties(value: HttpUrlDestinationProperties): Self = StObject.set(x, "httpUrlProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpUrlPropertiesUndefined: Self = StObject.set(x, "httpUrlProperties", js.undefined)
    
    @scala.inline
    def setStatus(value: TopicRuleDestinationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
