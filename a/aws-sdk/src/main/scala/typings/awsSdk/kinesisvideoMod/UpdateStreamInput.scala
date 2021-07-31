package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStreamInput extends StObject {
  
  /**
    * The version of the stream whose metadata you want to update.
    */
  var CurrentVersion: Version
  
  /**
    * The name of the device that is writing to the stream.    In the current implementation, Kinesis Video Streams does not use this name.  
    */
  var DeviceName: js.UndefOr[typings.awsSdk.kinesisvideoMod.DeviceName] = js.undefined
  
  /**
    * The stream's media type. Use MediaType to specify the type of content that the stream contains to the consumers of the stream. For more information about media types, see Media Types. If you choose to specify the MediaType, see Naming Requirements. To play video on the console, you must specify the correct video type. For example, if the video in the stream is H.264, specify video/h264 as the MediaType.
    */
  var MediaType: js.UndefOr[typings.awsSdk.kinesisvideoMod.MediaType] = js.undefined
  
  /**
    * The ARN of the stream whose metadata you want to update.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream whose metadata you want to update. The stream name is an identifier for the stream, and must be unique for each account and region.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamName] = js.undefined
}
object UpdateStreamInput {
  
  @scala.inline
  def apply(CurrentVersion: Version): UpdateStreamInput = {
    val __obj = js.Dynamic.literal(CurrentVersion = CurrentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStreamInput]
  }
  
  @scala.inline
  implicit class UpdateStreamInputMutableBuilder[Self <: UpdateStreamInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentVersion(value: Version): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceName(value: DeviceName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    @scala.inline
    def setMediaType(value: MediaType): Self = StObject.set(x, "MediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypeUndefined: Self = StObject.set(x, "MediaType", js.undefined)
    
    @scala.inline
    def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
