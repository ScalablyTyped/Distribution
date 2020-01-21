package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTopicInput extends js.Object {
  /**
    * The ARN of the topic you want to delete.
    */
  var TopicArn: topicARN = js.native
}

object DeleteTopicInput {
  @scala.inline
  def apply(TopicArn: topicARN): DeleteTopicInput = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteTopicInput]
  }
}

