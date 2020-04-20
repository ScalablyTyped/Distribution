package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterEventTopicRequest extends js.Object {
  /**
    * The Directory ID to remove as a publisher. This directory will no longer send messages to the specified SNS topic.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The name of the SNS topic from which to remove the directory as a publisher.
    */
  var TopicName: typings.awsSdk.directoryserviceMod.TopicName = js.native
}

object DeregisterEventTopicRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, TopicName: TopicName): DeregisterEventTopicRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], TopicName = TopicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterEventTopicRequest]
  }
}

