package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamInfo extends StObject {
  
  /**
    * A time stamp that indicates when the stream was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * How long the stream retains data, in hours.
    */
  var DataRetentionInHours: js.UndefOr[typings.awsSdk.kinesisvideoMod.DataRetentionInHours] = js.undefined
  
  /**
    * The name of the device that is associated with the stream.
    */
  var DeviceName: js.UndefOr[typings.awsSdk.kinesisvideoMod.DeviceName] = js.undefined
  
  /**
    * The ID of the AWS Key Management Service (AWS KMS) key that Kinesis Video Streams uses to encrypt data on the stream.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.kinesisvideoMod.KmsKeyId] = js.undefined
  
  /**
    * The MediaType of the stream. 
    */
  var MediaType: js.UndefOr[typings.awsSdk.kinesisvideoMod.MediaType] = js.undefined
  
  /**
    * The status of the stream.
    */
  var Status: js.UndefOr[typings.awsSdk.kinesisvideoMod.Status] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the stream.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamName] = js.undefined
  
  /**
    * The version of the stream.
    */
  var Version: js.UndefOr[typings.awsSdk.kinesisvideoMod.Version] = js.undefined
}
object StreamInfo {
  
  @scala.inline
  def apply(): StreamInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamInfo]
  }
  
  @scala.inline
  implicit class StreamInfoMutableBuilder[Self <: StreamInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDataRetentionInHours(value: DataRetentionInHours): Self = StObject.set(x, "DataRetentionInHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRetentionInHoursUndefined: Self = StObject.set(x, "DataRetentionInHours", js.undefined)
    
    @scala.inline
    def setDeviceName(value: DeviceName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setMediaType(value: MediaType): Self = StObject.set(x, "MediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypeUndefined: Self = StObject.set(x, "MediaType", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
