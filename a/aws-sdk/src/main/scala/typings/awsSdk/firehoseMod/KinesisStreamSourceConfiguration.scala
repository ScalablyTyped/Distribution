package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamSourceConfiguration extends js.Object {
  /**
    * The ARN of the source Kinesis data stream. For more information, see Amazon Kinesis Data Streams ARN Format.
    */
  var KinesisStreamARN: typings.awsSdk.firehoseMod.KinesisStreamARN = js.native
  /**
    * The ARN of the role that provides access to the source Kinesis data stream. For more information, see AWS Identity and Access Management (IAM) ARN Format.
    */
  var RoleARN: typings.awsSdk.firehoseMod.RoleARN = js.native
}

object KinesisStreamSourceConfiguration {
  @scala.inline
  def apply(KinesisStreamARN: KinesisStreamARN, RoleARN: RoleARN): KinesisStreamSourceConfiguration = {
    val __obj = js.Dynamic.literal(KinesisStreamARN = KinesisStreamARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamSourceConfiguration]
  }
  @scala.inline
  implicit class KinesisStreamSourceConfigurationOps[Self <: KinesisStreamSourceConfiguration] (val x: Self) extends AnyVal {
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
    def setKinesisStreamARN(value: KinesisStreamARN): Self = this.set("KinesisStreamARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleARN(value: RoleARN): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
  }
  
}

