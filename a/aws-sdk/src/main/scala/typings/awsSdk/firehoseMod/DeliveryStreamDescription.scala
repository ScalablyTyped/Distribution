package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliveryStreamDescription extends StObject {
  
  /**
    * The date and time that the delivery stream was created.
    */
  var CreateTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the delivery stream. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var DeliveryStreamARN: typings.awsSdk.firehoseMod.DeliveryStreamARN = js.native
  
  /**
    * Indicates the server-side encryption (SSE) status for the delivery stream.
    */
  var DeliveryStreamEncryptionConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.DeliveryStreamEncryptionConfiguration] = js.native
  
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName = js.native
  
  /**
    * The status of the delivery stream. If the status of a delivery stream is CREATING_FAILED, this status doesn't change, and you can't invoke CreateDeliveryStream again on it. However, you can invoke the DeleteDeliveryStream operation to delete it.
    */
  var DeliveryStreamStatus: typings.awsSdk.firehoseMod.DeliveryStreamStatus = js.native
  
  /**
    * The delivery stream type. This can be one of the following values:    DirectPut: Provider applications access the delivery stream directly.    KinesisStreamAsSource: The delivery stream uses a Kinesis data stream as a source.  
    */
  var DeliveryStreamType: typings.awsSdk.firehoseMod.DeliveryStreamType = js.native
  
  /**
    * The destinations.
    */
  var Destinations: DestinationDescriptionList = js.native
  
  /**
    * Provides details in case one of the following operations fails due to an error related to KMS: CreateDeliveryStream, DeleteDeliveryStream, StartDeliveryStreamEncryption, StopDeliveryStreamEncryption.
    */
  var FailureDescription: js.UndefOr[typings.awsSdk.firehoseMod.FailureDescription] = js.native
  
  /**
    * Indicates whether there are more destinations available to list.
    */
  var HasMoreDestinations: BooleanObject = js.native
  
  /**
    * The date and time that the delivery stream was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * If the DeliveryStreamType parameter is KinesisStreamAsSource, a SourceDescription object describing the source Kinesis data stream.
    */
  var Source: js.UndefOr[SourceDescription] = js.native
  
  /**
    * Each time the destination is updated for a delivery stream, the version ID is changed, and the current version ID is required when updating the destination. This is so that the service knows it is applying the changes to the correct version of the delivery stream.
    */
  var VersionId: DeliveryStreamVersionId = js.native
}
object DeliveryStreamDescription {
  
  @scala.inline
  def apply(
    DeliveryStreamARN: DeliveryStreamARN,
    DeliveryStreamName: DeliveryStreamName,
    DeliveryStreamStatus: DeliveryStreamStatus,
    DeliveryStreamType: DeliveryStreamType,
    Destinations: DestinationDescriptionList,
    HasMoreDestinations: BooleanObject,
    VersionId: DeliveryStreamVersionId
  ): DeliveryStreamDescription = {
    val __obj = js.Dynamic.literal(DeliveryStreamARN = DeliveryStreamARN.asInstanceOf[js.Any], DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], DeliveryStreamStatus = DeliveryStreamStatus.asInstanceOf[js.Any], DeliveryStreamType = DeliveryStreamType.asInstanceOf[js.Any], Destinations = Destinations.asInstanceOf[js.Any], HasMoreDestinations = HasMoreDestinations.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryStreamDescription]
  }
  
  @scala.inline
  implicit class DeliveryStreamDescriptionMutableBuilder[Self <: DeliveryStreamDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTimestamp(value: Timestamp): Self = StObject.set(x, "CreateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimestampUndefined: Self = StObject.set(x, "CreateTimestamp", js.undefined)
    
    @scala.inline
    def setDeliveryStreamARN(value: DeliveryStreamARN): Self = StObject.set(x, "DeliveryStreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryStreamEncryptionConfiguration(value: DeliveryStreamEncryptionConfiguration): Self = StObject.set(x, "DeliveryStreamEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryStreamEncryptionConfigurationUndefined: Self = StObject.set(x, "DeliveryStreamEncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryStreamStatus(value: DeliveryStreamStatus): Self = StObject.set(x, "DeliveryStreamStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryStreamType(value: DeliveryStreamType): Self = StObject.set(x, "DeliveryStreamType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinations(value: DestinationDescriptionList): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsVarargs(value: DestinationDescription*): Self = StObject.set(x, "Destinations", js.Array(value :_*))
    
    @scala.inline
    def setFailureDescription(value: FailureDescription): Self = StObject.set(x, "FailureDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureDescriptionUndefined: Self = StObject.set(x, "FailureDescription", js.undefined)
    
    @scala.inline
    def setHasMoreDestinations(value: BooleanObject): Self = StObject.set(x, "HasMoreDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimestamp(value: Timestamp): Self = StObject.set(x, "LastUpdateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimestampUndefined: Self = StObject.set(x, "LastUpdateTimestamp", js.undefined)
    
    @scala.inline
    def setSource(value: SourceDescription): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    @scala.inline
    def setVersionId(value: DeliveryStreamVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
  }
}
