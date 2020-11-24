package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationConfiguration extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the topic.
    */
  var TopicArn: js.UndefOr[String] = js.native
  
  /**
    * The current state of the topic.
    */
  var TopicStatus: js.UndefOr[String] = js.native
}
object NotificationConfiguration {
  
  @scala.inline
  def apply(): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfiguration]
  }
  
  @scala.inline
  implicit class NotificationConfigurationOps[Self <: NotificationConfiguration] (val x: Self) extends AnyVal {
    
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
    def setTopicArn(value: String): Self = this.set("TopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicArn: Self = this.set("TopicArn", js.undefined)
    
    @scala.inline
    def setTopicStatus(value: String): Self = this.set("TopicStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicStatus: Self = this.set("TopicStatus", js.undefined)
  }
}
