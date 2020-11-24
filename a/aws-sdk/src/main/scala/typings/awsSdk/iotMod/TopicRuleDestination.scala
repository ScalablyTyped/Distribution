package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleDestination extends js.Object {
  
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
  implicit class TopicRuleDestinationOps[Self <: TopicRuleDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: AwsArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setHttpUrlProperties(value: HttpUrlDestinationProperties): Self = this.set("httpUrlProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpUrlProperties: Self = this.set("httpUrlProperties", js.undefined)
    
    @scala.inline
    def setStatus(value: TopicRuleDestinationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusReason(value: String): Self = this.set("statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusReason: Self = this.set("statusReason", js.undefined)
  }
}
