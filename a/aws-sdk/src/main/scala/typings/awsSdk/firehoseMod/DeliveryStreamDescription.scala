package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliveryStreamDescription extends js.Object {
  
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
  implicit class DeliveryStreamDescriptionOps[Self <: DeliveryStreamDescription] (val x: Self) extends AnyVal {
    
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
    def setDeliveryStreamARN(value: DeliveryStreamARN): Self = this.set("DeliveryStreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryStreamName(value: DeliveryStreamName): Self = this.set("DeliveryStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryStreamStatus(value: DeliveryStreamStatus): Self = this.set("DeliveryStreamStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryStreamType(value: DeliveryStreamType): Self = this.set("DeliveryStreamType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsVarargs(value: DestinationDescription*): Self = this.set("Destinations", js.Array(value :_*))
    
    @scala.inline
    def setDestinations(value: DestinationDescriptionList): Self = this.set("Destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMoreDestinations(value: BooleanObject): Self = this.set("HasMoreDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: DeliveryStreamVersionId): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimestamp(value: Timestamp): Self = this.set("CreateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTimestamp: Self = this.set("CreateTimestamp", js.undefined)
    
    @scala.inline
    def setDeliveryStreamEncryptionConfiguration(value: DeliveryStreamEncryptionConfiguration): Self = this.set("DeliveryStreamEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryStreamEncryptionConfiguration: Self = this.set("DeliveryStreamEncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setFailureDescription(value: FailureDescription): Self = this.set("FailureDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureDescription: Self = this.set("FailureDescription", js.undefined)
    
    @scala.inline
    def setLastUpdateTimestamp(value: Timestamp): Self = this.set("LastUpdateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateTimestamp: Self = this.set("LastUpdateTimestamp", js.undefined)
    
    @scala.inline
    def setSource(value: SourceDescription): Self = this.set("Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
  }
}
