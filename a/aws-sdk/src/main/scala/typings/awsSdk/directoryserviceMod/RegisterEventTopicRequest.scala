package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterEventTopicRequest extends js.Object {
  /**
    * The Directory ID that will publish status messages to the SNS topic.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The SNS topic name to which the directory will publish status messages. This SNS topic must be in the same region as the specified Directory ID.
    */
  var TopicName: typings.awsSdk.directoryserviceMod.TopicName = js.native
}

object RegisterEventTopicRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, TopicName: TopicName): RegisterEventTopicRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], TopicName = TopicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterEventTopicRequest]
  }
}

