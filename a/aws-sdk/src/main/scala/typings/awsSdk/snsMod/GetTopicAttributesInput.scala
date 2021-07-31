package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTopicAttributesInput extends StObject {
  
  /**
    * The ARN of the topic whose properties you want to get.
    */
  var TopicArn: topicARN
}
object GetTopicAttributesInput {
  
  @scala.inline
  def apply(TopicArn: topicARN): GetTopicAttributesInput = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTopicAttributesInput]
  }
  
  @scala.inline
  implicit class GetTopicAttributesInputMutableBuilder[Self <: GetTopicAttributesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopicArn(value: topicARN): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
