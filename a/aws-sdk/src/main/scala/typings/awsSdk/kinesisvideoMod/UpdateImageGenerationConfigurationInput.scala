package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateImageGenerationConfigurationInput extends StObject {
  
  /**
    * The structure that contains the information required for the KVS images delivery. If the structure is null, the configuration will be deleted from the stream.
    */
  var ImageGenerationConfiguration: js.UndefOr[typings.awsSdk.kinesisvideoMod.ImageGenerationConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Kinesis video stream from where you want to update the image generation configuration. You must specify either the StreamName or the StreamARN.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream from which to update the image generation configuration. You must specify either the StreamName or the StreamARN.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamName] = js.undefined
}
object UpdateImageGenerationConfigurationInput {
  
  inline def apply(): UpdateImageGenerationConfigurationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateImageGenerationConfigurationInput]
  }
  
  extension [Self <: UpdateImageGenerationConfigurationInput](x: Self) {
    
    inline def setImageGenerationConfiguration(value: ImageGenerationConfiguration): Self = StObject.set(x, "ImageGenerationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setImageGenerationConfigurationUndefined: Self = StObject.set(x, "ImageGenerationConfiguration", js.undefined)
    
    inline def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
