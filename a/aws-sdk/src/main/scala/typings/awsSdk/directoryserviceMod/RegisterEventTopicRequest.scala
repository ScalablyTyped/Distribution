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
  @scala.inline
  implicit class RegisterEventTopicRequestOps[Self <: RegisterEventTopicRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopicName(value: TopicName): Self = this.set("TopicName", value.asInstanceOf[js.Any])
  }
  
}

