package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeliveryStreamInput extends StObject {
  
  var AmazonopensearchserviceDestinationConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.AmazonopensearchserviceDestinationConfiguration] = js.undefined
  
  /**
    * Used to specify the type and Amazon Resource Name (ARN) of the KMS key needed for Server-Side Encryption (SSE).
    */
  var DeliveryStreamEncryptionConfigurationInput: js.UndefOr[typings.awsSdk.firehoseMod.DeliveryStreamEncryptionConfigurationInput] = js.undefined
  
  /**
    * The name of the delivery stream. This name must be unique per AWS account in the same AWS Region. If the delivery streams are in different accounts or different Regions, you can have multiple delivery streams with the same name.
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName
  
  /**
    * The delivery stream type. This parameter can be one of the following values:    DirectPut: Provider applications access the delivery stream directly.    KinesisStreamAsSource: The delivery stream uses a Kinesis data stream as a source.  
    */
  var DeliveryStreamType: js.UndefOr[typings.awsSdk.firehoseMod.DeliveryStreamType] = js.undefined
  
  /**
    * The destination in Amazon ES. You can specify only one destination.
    */
  var ElasticsearchDestinationConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.ElasticsearchDestinationConfiguration] = js.undefined
  
  /**
    * The destination in Amazon S3. You can specify only one destination.
    */
  var ExtendedS3DestinationConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.ExtendedS3DestinationConfiguration] = js.undefined
  
  /**
    * Enables configuring Kinesis Firehose to deliver data to any HTTP endpoint destination. You can specify only one destination.
    */
  var HttpEndpointDestinationConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.HttpEndpointDestinationConfiguration] = js.undefined
  
  /**
    * When a Kinesis data stream is used as the source for the delivery stream, a KinesisStreamSourceConfiguration containing the Kinesis data stream Amazon Resource Name (ARN) and the role ARN for the source stream.
    */
  var KinesisStreamSourceConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.KinesisStreamSourceConfiguration] = js.undefined
  
  /**
    * The destination in Amazon Redshift. You can specify only one destination.
    */
  var RedshiftDestinationConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.RedshiftDestinationConfiguration] = js.undefined
  
  /**
    * [Deprecated] The destination in Amazon S3. You can specify only one destination.
    */
  var S3DestinationConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.S3DestinationConfiguration] = js.undefined
  
  /**
    * The destination in Splunk. You can specify only one destination.
    */
  var SplunkDestinationConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.SplunkDestinationConfiguration] = js.undefined
  
  /**
    * A set of tags to assign to the delivery stream. A tag is a key-value pair that you can define and assign to AWS resources. Tags are metadata. For example, you can add friendly names and descriptions or other types of information that can help you distinguish the delivery stream. For more information about tags, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. You can specify up to 50 tags when creating a delivery stream.
    */
  var Tags: js.UndefOr[TagDeliveryStreamInputTagList] = js.undefined
}
object CreateDeliveryStreamInput {
  
  inline def apply(DeliveryStreamName: DeliveryStreamName): CreateDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeliveryStreamInput]
  }
  
  extension [Self <: CreateDeliveryStreamInput](x: Self) {
    
    inline def setAmazonopensearchserviceDestinationConfiguration(value: AmazonopensearchserviceDestinationConfiguration): Self = StObject.set(x, "AmazonopensearchserviceDestinationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAmazonopensearchserviceDestinationConfigurationUndefined: Self = StObject.set(x, "AmazonopensearchserviceDestinationConfiguration", js.undefined)
    
    inline def setDeliveryStreamEncryptionConfigurationInput(value: DeliveryStreamEncryptionConfigurationInput): Self = StObject.set(x, "DeliveryStreamEncryptionConfigurationInput", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStreamEncryptionConfigurationInputUndefined: Self = StObject.set(x, "DeliveryStreamEncryptionConfigurationInput", js.undefined)
    
    inline def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStreamType(value: DeliveryStreamType): Self = StObject.set(x, "DeliveryStreamType", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStreamTypeUndefined: Self = StObject.set(x, "DeliveryStreamType", js.undefined)
    
    inline def setElasticsearchDestinationConfiguration(value: ElasticsearchDestinationConfiguration): Self = StObject.set(x, "ElasticsearchDestinationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchDestinationConfigurationUndefined: Self = StObject.set(x, "ElasticsearchDestinationConfiguration", js.undefined)
    
    inline def setExtendedS3DestinationConfiguration(value: ExtendedS3DestinationConfiguration): Self = StObject.set(x, "ExtendedS3DestinationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setExtendedS3DestinationConfigurationUndefined: Self = StObject.set(x, "ExtendedS3DestinationConfiguration", js.undefined)
    
    inline def setHttpEndpointDestinationConfiguration(value: HttpEndpointDestinationConfiguration): Self = StObject.set(x, "HttpEndpointDestinationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setHttpEndpointDestinationConfigurationUndefined: Self = StObject.set(x, "HttpEndpointDestinationConfiguration", js.undefined)
    
    inline def setKinesisStreamSourceConfiguration(value: KinesisStreamSourceConfiguration): Self = StObject.set(x, "KinesisStreamSourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamSourceConfigurationUndefined: Self = StObject.set(x, "KinesisStreamSourceConfiguration", js.undefined)
    
    inline def setRedshiftDestinationConfiguration(value: RedshiftDestinationConfiguration): Self = StObject.set(x, "RedshiftDestinationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRedshiftDestinationConfigurationUndefined: Self = StObject.set(x, "RedshiftDestinationConfiguration", js.undefined)
    
    inline def setS3DestinationConfiguration(value: S3DestinationConfiguration): Self = StObject.set(x, "S3DestinationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setS3DestinationConfigurationUndefined: Self = StObject.set(x, "S3DestinationConfiguration", js.undefined)
    
    inline def setSplunkDestinationConfiguration(value: SplunkDestinationConfiguration): Self = StObject.set(x, "SplunkDestinationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSplunkDestinationConfigurationUndefined: Self = StObject.set(x, "SplunkDestinationConfiguration", js.undefined)
    
    inline def setTags(value: TagDeliveryStreamInputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
