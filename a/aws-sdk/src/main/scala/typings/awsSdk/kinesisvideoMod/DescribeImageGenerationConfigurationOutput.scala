package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImageGenerationConfigurationOutput extends StObject {
  
  /**
    * The structure that contains the information required for the Kinesis video stream (KVS) images delivery. If this structure is null, the configuration will be deleted from the stream.
    */
  var ImageGenerationConfiguration: js.UndefOr[typings.awsSdk.kinesisvideoMod.ImageGenerationConfiguration] = js.undefined
}
object DescribeImageGenerationConfigurationOutput {
  
  inline def apply(): DescribeImageGenerationConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImageGenerationConfigurationOutput]
  }
  
  extension [Self <: DescribeImageGenerationConfigurationOutput](x: Self) {
    
    inline def setImageGenerationConfiguration(value: ImageGenerationConfiguration): Self = StObject.set(x, "ImageGenerationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setImageGenerationConfigurationUndefined: Self = StObject.set(x, "ImageGenerationConfiguration", js.undefined)
  }
}
