package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTopic extends js.Object {
  /**
    * The date and time of when you associated your directory with the SNS topic.
    */
  var CreatedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.CreatedDateTime] = js.native
  /**
    * The Directory ID of an AWS Directory Service directory that will publish status messages to an SNS topic.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The topic registration status.
    */
  var Status: js.UndefOr[TopicStatus] = js.native
  /**
    * The SNS topic ARN (Amazon Resource Name).
    */
  var TopicArn: js.UndefOr[typings.awsSdk.directoryserviceMod.TopicArn] = js.native
  /**
    * The name of an AWS SNS topic the receives status messages from the directory.
    */
  var TopicName: js.UndefOr[typings.awsSdk.directoryserviceMod.TopicName] = js.native
}

object EventTopic {
  @scala.inline
  def apply(): EventTopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTopic]
  }
  @scala.inline
  implicit class EventTopicOps[Self <: EventTopic] (val x: Self) extends AnyVal {
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
    def setCreatedDateTime(value: CreatedDateTime): Self = this.set("CreatedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("CreatedDateTime", js.undefined)
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    @scala.inline
    def setStatus(value: TopicStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTopicArn(value: TopicArn): Self = this.set("TopicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicArn: Self = this.set("TopicArn", js.undefined)
    @scala.inline
    def setTopicName(value: TopicName): Self = this.set("TopicName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicName: Self = this.set("TopicName", js.undefined)
  }
  
}

