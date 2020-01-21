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
    * The type of the publishing destination. Currently, only S3 is supported.
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
}

