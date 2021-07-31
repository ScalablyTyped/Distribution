package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTopicResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) assigned to the created topic.
    */
  var TopicArn: js.UndefOr[topicARN] = js.undefined
}
object CreateTopicResponse {
  
  @scala.inline
  def apply(): CreateTopicResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTopicResponse]
  }
  
  @scala.inline
  implicit class CreateTopicResponseMutableBuilder[Self <: CreateTopicResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopicArn(value: topicARN): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicArnUndefined: Self = StObject.set(x, "TopicArn", js.undefined)
  }
}
