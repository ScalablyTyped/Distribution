package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLogGroupRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the CMK to use when encrypting log data. For more information, see Amazon Resource Names - AWS Key Management Service (AWS KMS).
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
  /**
    * The key-value pairs to use for the tags.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object CreateLogGroupRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName): CreateLogGroupRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLogGroupRequest]
  }
  @scala.inline
  implicit class CreateLogGroupRequestOps[Self <: CreateLogGroupRequest] (val x: Self) extends AnyVal {
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
    def setLogGroupName(value: LogGroupName): Self = this.set("logGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

