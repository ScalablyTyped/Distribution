package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationConfiguration extends StObject {
  
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
  implicit class NotificationConfigurationMutableBuilder[Self <: NotificationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopicArn(value: String): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicArnUndefined: Self = StObject.set(x, "TopicArn", js.undefined)
    
    @scala.inline
    def setTopicStatus(value: String): Self = StObject.set(x, "TopicStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicStatusUndefined: Self = StObject.set(x, "TopicStatus", js.undefined)
  }
}
