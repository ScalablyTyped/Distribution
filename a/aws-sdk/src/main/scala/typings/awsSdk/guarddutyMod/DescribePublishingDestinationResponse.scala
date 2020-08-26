package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePublishingDestinationResponse extends js.Object {
  /**
    * The ID of the publishing destination.
    */
  var DestinationId: String = js.native
  /**
    * A DestinationProperties object that includes the DestinationArn and KmsKeyArn of the publishing destination.
    */
  var DestinationProperties: typings.awsSdk.guarddutyMod.DestinationProperties = js.native
  /**
    * The type of publishing destination. Currently, only Amazon S3 buckets are supported.
    */
  var DestinationType: typings.awsSdk.guarddutyMod.DestinationType = js.native
  /**
    * The time, in epoch millisecond format, at which GuardDuty was first unable to publish findings to the destination.
    */
  var PublishingFailureStartTimestamp: Long = js.native
  /**
    * The status of the publishing destination.
    */
  var Status: PublishingStatus = js.native
}

object DescribePublishingDestinationResponse {
  @scala.inline
  def apply(
    DestinationId: String,
    DestinationProperties: DestinationProperties,
    DestinationType: DestinationType,
    PublishingFailureStartTimestamp: Long,
    Status: PublishingStatus
  ): DescribePublishingDestinationResponse = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any], DestinationProperties = DestinationProperties.asInstanceOf[js.Any], DestinationType = DestinationType.asInstanceOf[js.Any], PublishingFailureStartTimestamp = PublishingFailureStartTimestamp.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePublishingDestinationResponse]
  }
  @scala.inline
  implicit class DescribePublishingDestinationResponseOps[Self <: DescribePublishingDestinationResponse] (val x: Self) extends AnyVal {
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
    def setDestinationId(value: String): Self = this.set("DestinationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationProperties(value: DestinationProperties): Self = this.set("DestinationProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationType(value: DestinationType): Self = this.set("DestinationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublishingFailureStartTimestamp(value: Long): Self = this.set("PublishingFailureStartTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: PublishingStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
  
}

