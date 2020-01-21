package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDestinationInput extends js.Object {
  /**
    * Obtain this value from the VersionId result of DeliveryStreamDescription. This value is required, and helps the service perform conditional operations. For example, if there is an interleaving update and this value is null, then the update destination fails. After the update is successful, the VersionId value is updated. The service then performs a merge of the old configuration with the new configuration.
    */
  var CurrentDeliveryStreamVersionId: DeliveryStreamVersionId = js.native
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName = js.native
  /**
    * The ID of the destination.
    */
  var DestinationId: typings.awsSdk.firehoseMod.DestinationId = js.native
  /**
    * Describes an update for a destination in Amazon ES.
    */
  var ElasticsearchDestinationUpdate: js.UndefOr[typings.awsSdk.firehoseMod.ElasticsearchDestinationUpdate] = js.native
  /**
    * Describes an update for a destination in Amazon S3.
    */
  var ExtendedS3DestinationUpdate: js.UndefOr[typings.awsSdk.firehoseMod.ExtendedS3DestinationUpdate] = js.native
  /**
    * Describes an update for a destination in Amazon Redshift.
    */
  var RedshiftDestinationUpdate: js.UndefOr[typings.awsSdk.firehoseMod.RedshiftDestinationUpdate] = js.native
  /**
    * [Deprecated] Describes an update for a destination in Amazon S3.
    */
  var S3DestinationUpdate: js.UndefOr[typings.awsSdk.firehoseMod.S3DestinationUpdate] = js.native
  /**
    * Describes an update for a destination in Splunk.
    */
  var SplunkDestinationUpdate: js.UndefOr[typings.awsSdk.firehoseMod.SplunkDestinationUpdate] = js.native
}

object UpdateDestinationInput {
  @scala.inline
  def apply(
    CurrentDeliveryStreamVersionId: DeliveryStreamVersionId,
    DeliveryStreamName: DeliveryStreamName,
    DestinationId: DestinationId,
    ElasticsearchDestinationUpdate: ElasticsearchDestinationUpdate = null,
    ExtendedS3DestinationUpdate: ExtendedS3DestinationUpdate = null,
    RedshiftDestinationUpdate: RedshiftDestinationUpdate = null,
    S3DestinationUpdate: S3DestinationUpdate = null,
    SplunkDestinationUpdate: SplunkDestinationUpdate = null
  ): UpdateDestinationInput = {
    val __obj = js.Dynamic.literal(CurrentDeliveryStreamVersionId = CurrentDeliveryStreamVersionId.asInstanceOf[js.Any], DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], DestinationId = DestinationId.asInstanceOf[js.Any])
    if (ElasticsearchDestinationUpdate != null) __obj.updateDynamic("ElasticsearchDestinationUpdate")(ElasticsearchDestinationUpdate.asInstanceOf[js.Any])
    if (ExtendedS3DestinationUpdate != null) __obj.updateDynamic("ExtendedS3DestinationUpdate")(ExtendedS3DestinationUpdate.asInstanceOf[js.Any])
    if (RedshiftDestinationUpdate != null) __obj.updateDynamic("RedshiftDestinationUpdate")(RedshiftDestinationUpdate.asInstanceOf[js.Any])
    if (S3DestinationUpdate != null) __obj.updateDynamic("S3DestinationUpdate")(S3DestinationUpdate.asInstanceOf[js.Any])
    if (SplunkDestinationUpdate != null) __obj.updateDynamic("SplunkDestinationUpdate")(SplunkDestinationUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDestinationInput]
  }
}

