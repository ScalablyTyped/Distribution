package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamInput extends StObject {
  
  /**
    * The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is 0, indicating that the stream does not persist data. When the DataRetentionInHours value is 0, consumers can still consume the fragments that remain in the service host buffer, which has a retention time limit of 5 minutes and a retention memory limit of 200 MB. Fragments are removed from the buffer when either limit is reached.
    */
  var DataRetentionInHours: js.UndefOr[typings.awsSdk.kinesisvideoMod.DataRetentionInHours] = js.undefined
  
  /**
    * The name of the device that is writing to the stream.   In the current implementation, Kinesis Video Streams does not use this name. 
    */
  var DeviceName: js.UndefOr[typings.awsSdk.kinesisvideoMod.DeviceName] = js.undefined
  
  /**
    * The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt stream data. If no key ID is specified, the default, Kinesis Video-managed key (aws/kinesisvideo) is used.  For more information, see DescribeKey. 
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.kinesisvideoMod.KmsKeyId] = js.undefined
  
  /**
    * The media type of the stream. Consumers of the stream can use this information when processing the stream. For more information about media types, see Media Types. If you choose to specify the MediaType, see Naming Requirements for guidelines. Example valid values include "video/h264" and "video/h264,audio/aac". This parameter is optional; the default value is null (or empty in JSON).
    */
  var MediaType: js.UndefOr[typings.awsSdk.kinesisvideoMod.MediaType] = js.undefined
  
  /**
    * A name for the stream that you are creating. The stream name is an identifier for the stream, and must be unique for each account and region.
    */
  var StreamName: typings.awsSdk.kinesisvideoMod.StreamName
  
  /**
    * A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is optional).
    */
  var Tags: js.UndefOr[ResourceTags] = js.undefined
}
object CreateStreamInput {
  
  @scala.inline
  def apply(StreamName: StreamName): CreateStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamInput]
  }
  
  @scala.inline
  implicit class CreateStreamInputMutableBuilder[Self <: CreateStreamInput] (val x: Self) extends AnyVal {
    
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
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: ResourceTags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
