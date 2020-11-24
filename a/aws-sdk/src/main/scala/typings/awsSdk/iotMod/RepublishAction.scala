package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepublishAction extends js.Object {
  
  /**
    * The Quality of Service (QoS) level to use when republishing messages. The default value is 0.
    */
  var qos: js.UndefOr[Qos] = js.native
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn = js.native
  
  /**
    * The name of the MQTT topic.
    */
  var topic: TopicPattern = js.native
}
object RepublishAction {
  
  @scala.inline
  def apply(roleArn: AwsArn, topic: TopicPattern): RepublishAction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepublishAction]
  }
  
  @scala.inline
  implicit class RepublishActionOps[Self <: RepublishAction] (val x: Self) extends AnyVal {
    
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
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: TopicPattern): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQos(value: Qos): Self = this.set("qos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQos: Self = this.set("qos", js.undefined)
  }
}
