package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryChannel extends js.Object {
  /**
    * The options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket.
    */
  var configSnapshotDeliveryProperties: js.UndefOr[ConfigSnapshotDeliveryProperties] = js.native
  /**
    * The name of the delivery channel. By default, AWS Config assigns the name "default" when creating the delivery channel. To change the delivery channel name, you must use the DeleteDeliveryChannel action to delete your current delivery channel, and then you must use the PutDeliveryChannel command to create a delivery channel that has the desired name.
    */
  var name: js.UndefOr[ChannelName] = js.native
  /**
    * The name of the Amazon S3 bucket to which AWS Config delivers configuration snapshots and configuration history files. If you specify a bucket that belongs to another AWS account, that bucket must have policies that grant access permissions to AWS Config. For more information, see Permissions for the Amazon S3 Bucket in the AWS Config Developer Guide.
    */
  var s3BucketName: js.UndefOr[String] = js.native
  /**
    * The prefix for the specified Amazon S3 bucket.
    */
  var s3KeyPrefix: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends notifications about configuration changes. If you choose a topic from another account, the topic must have policies that grant access permissions to AWS Config. For more information, see Permissions for the Amazon SNS Topic in the AWS Config Developer Guide.
    */
  var snsTopicARN: js.UndefOr[String] = js.native
}

object DeliveryChannel {
  @scala.inline
  def apply(): DeliveryChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryChannel]
  }
  @scala.inline
  implicit class DeliveryChannelOps[Self <: DeliveryChannel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigSnapshotDeliveryProperties(value: ConfigSnapshotDeliveryProperties): Self = this.set("configSnapshotDeliveryProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigSnapshotDeliveryProperties: Self = this.set("configSnapshotDeliveryProperties", js.undefined)
    @scala.inline
    def setName(value: ChannelName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setS3BucketName(value: String): Self = this.set("s3BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3BucketName: Self = this.set("s3BucketName", js.undefined)
    @scala.inline
    def setS3KeyPrefix(value: String): Self = this.set("s3KeyPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3KeyPrefix: Self = this.set("s3KeyPrefix", js.undefined)
    @scala.inline
    def setSnsTopicARN(value: String): Self = this.set("snsTopicARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnsTopicARN: Self = this.set("snsTopicARN", js.undefined)
  }
  
}

