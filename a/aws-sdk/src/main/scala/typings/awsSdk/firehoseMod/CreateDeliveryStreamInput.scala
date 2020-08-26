package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeliveryStreamInput extends js.Object {
  /**
    * Used to specify the type and Amazon Resource Name (ARN) of the KMS key needed for Server-Side Encryption (SSE).
    */
  var DeliveryStreamEncryptionConfigurationInput: js.UndefOr[typings.awsSdk.firehoseMod.DeliveryStreamEncryptionConfigurationInput] = js.native
  /**
    * The name of the delivery stream. This name must be unique per AWS account in the same AWS Region. If the delivery streams are in different accounts or different Regions, you can have multiple delivery streams with the same name.
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName = js.native
  /**
    * The delivery stream type. This parameter can be one of the following values:    DirectPut: Provider applications access the delivery stream directly.    KinesisStreamAsSource: The delivery stream uses a Kinesis data stream as a source.  
    */
  var DeliveryStreamType: js.UndefOr[typings.awsSdk.firehoseMod.DeliveryStreamType] = js.native
  /**
    * The destination in Amazon ES. You can specify only one destination.
    */
  var ElasticsearchDestinationConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.ElasticsearchDestinationConfiguration] = js.native
  /**
    * The destination in Amazon S3. You can specify only one destination.
    */
  var ExtendedS3DestinationConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.ExtendedS3DestinationConfiguration] = js.native
  /**
    * Enables configuring Kinesis Firehose to deliver data to any HTTP endpoint destination. You can specify only one destination.
    */
  var HttpEndpointDestinationConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.HttpEndpointDestinationConfiguration] = js.native
  /**
    * When a Kinesis data stream is used as the source for the delivery stream, a KinesisStreamSourceConfiguration containing the Kinesis data stream Amazon Resource Name (ARN) and the role ARN for the source stream.
    */
  var KinesisStreamSourceConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.KinesisStreamSourceConfiguration] = js.native
  /**
    * The destination in Amazon Redshift. You can specify only one destination.
    */
  var RedshiftDestinationConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.RedshiftDestinationConfiguration] = js.native
  /**
    * [Deprecated] The destination in Amazon S3. You can specify only one destination.
    */
  var S3DestinationConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.S3DestinationConfiguration] = js.native
  /**
    * The destination in Splunk. You can specify only one destination.
    */
  var SplunkDestinationConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.SplunkDestinationConfiguration] = js.native
  /**
    * A set of tags to assign to the delivery stream. A tag is a key-value pair that you can define and assign to AWS resources. Tags are metadata. For example, you can add friendly names and descriptions or other types of information that can help you distinguish the delivery stream. For more information about tags, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. You can specify up to 50 tags when creating a delivery stream.
    */
  var Tags: js.UndefOr[TagDeliveryStreamInputTagList] = js.native
}

object CreateDeliveryStreamInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName): CreateDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeliveryStreamInput]
  }
  @scala.inline
  implicit class CreateDeliveryStreamInputOps[Self <: CreateDeliveryStreamInput] (val x: Self) extends AnyVal {
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
    def setDeliveryStreamName(value: DeliveryStreamName): Self = this.set("DeliveryStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeliveryStreamEncryptionConfigurationInput(value: DeliveryStreamEncryptionConfigurationInput): Self = this.set("DeliveryStreamEncryptionConfigurationInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryStreamEncryptionConfigurationInput: Self = this.set("DeliveryStreamEncryptionConfigurationInput", js.undefined)
    @scala.inline
    def setDeliveryStreamType(value: DeliveryStreamType): Self = this.set("DeliveryStreamType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryStreamType: Self = this.set("DeliveryStreamType", js.undefined)
    @scala.inline
    def setElasticsearchDestinationConfiguration(value: ElasticsearchDestinationConfiguration): Self = this.set("ElasticsearchDestinationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearchDestinationConfiguration: Self = this.set("ElasticsearchDestinationConfiguration", js.undefined)
    @scala.inline
    def setExtendedS3DestinationConfiguration(value: ExtendedS3DestinationConfiguration): Self = this.set("ExtendedS3DestinationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedS3DestinationConfiguration: Self = this.set("ExtendedS3DestinationConfiguration", js.undefined)
    @scala.inline
    def setHttpEndpointDestinationConfiguration(value: HttpEndpointDestinationConfiguration): Self = this.set("HttpEndpointDestinationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpEndpointDestinationConfiguration: Self = this.set("HttpEndpointDestinationConfiguration", js.undefined)
    @scala.inline
    def setKinesisStreamSourceConfiguration(value: KinesisStreamSourceConfiguration): Self = this.set("KinesisStreamSourceConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKinesisStreamSourceConfiguration: Self = this.set("KinesisStreamSourceConfiguration", js.undefined)
    @scala.inline
    def setRedshiftDestinationConfiguration(value: RedshiftDestinationConfiguration): Self = this.set("RedshiftDestinationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedshiftDestinationConfiguration: Self = this.set("RedshiftDestinationConfiguration", js.undefined)
    @scala.inline
    def setS3DestinationConfiguration(value: S3DestinationConfiguration): Self = this.set("S3DestinationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3DestinationConfiguration: Self = this.set("S3DestinationConfiguration", js.undefined)
    @scala.inline
    def setSplunkDestinationConfiguration(value: SplunkDestinationConfiguration): Self = this.set("SplunkDestinationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplunkDestinationConfiguration: Self = this.set("SplunkDestinationConfiguration", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagDeliveryStreamInputTagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

