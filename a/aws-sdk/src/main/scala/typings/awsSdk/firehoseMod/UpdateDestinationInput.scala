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
    * Describes an update to the specified HTTP endpoint destination.
    */
  var HttpEndpointDestinationUpdate: js.UndefOr[typings.awsSdk.firehoseMod.HttpEndpointDestinationUpdate] = js.native
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
    DestinationId: DestinationId
  ): UpdateDestinationInput = {
    val __obj = js.Dynamic.literal(CurrentDeliveryStreamVersionId = CurrentDeliveryStreamVersionId.asInstanceOf[js.Any], DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], DestinationId = DestinationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDestinationInput]
  }
  @scala.inline
  implicit class UpdateDestinationInputOps[Self <: UpdateDestinationInput] (val x: Self) extends AnyVal {
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
    def setCurrentDeliveryStreamVersionId(value: DeliveryStreamVersionId): Self = this.set("CurrentDeliveryStreamVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeliveryStreamName(value: DeliveryStreamName): Self = this.set("DeliveryStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationId(value: DestinationId): Self = this.set("DestinationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setElasticsearchDestinationUpdate(value: ElasticsearchDestinationUpdate): Self = this.set("ElasticsearchDestinationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearchDestinationUpdate: Self = this.set("ElasticsearchDestinationUpdate", js.undefined)
    @scala.inline
    def setExtendedS3DestinationUpdate(value: ExtendedS3DestinationUpdate): Self = this.set("ExtendedS3DestinationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedS3DestinationUpdate: Self = this.set("ExtendedS3DestinationUpdate", js.undefined)
    @scala.inline
    def setHttpEndpointDestinationUpdate(value: HttpEndpointDestinationUpdate): Self = this.set("HttpEndpointDestinationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpEndpointDestinationUpdate: Self = this.set("HttpEndpointDestinationUpdate", js.undefined)
    @scala.inline
    def setRedshiftDestinationUpdate(value: RedshiftDestinationUpdate): Self = this.set("RedshiftDestinationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedshiftDestinationUpdate: Self = this.set("RedshiftDestinationUpdate", js.undefined)
    @scala.inline
    def setS3DestinationUpdate(value: S3DestinationUpdate): Self = this.set("S3DestinationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3DestinationUpdate: Self = this.set("S3DestinationUpdate", js.undefined)
    @scala.inline
    def setSplunkDestinationUpdate(value: SplunkDestinationUpdate): Self = this.set("SplunkDestinationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplunkDestinationUpdate: Self = this.set("SplunkDestinationUpdate", js.undefined)
  }
  
}

