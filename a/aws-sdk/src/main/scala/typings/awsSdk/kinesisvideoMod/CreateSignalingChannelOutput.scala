package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSignalingChannelOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the created channel.
    */
  var ChannelARN: js.UndefOr[ResourceARN] = js.undefined
}
object CreateSignalingChannelOutput {
  
  inline def apply(): CreateSignalingChannelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSignalingChannelOutput]
  }
  
  extension [Self <: CreateSignalingChannelOutput](x: Self) {
    
    inline def setChannelARN(value: ResourceARN): Self = StObject.set(x, "ChannelARN", value.asInstanceOf[js.Any])
    
    inline def setChannelARNUndefined: Self = StObject.set(x, "ChannelARN", js.undefined)
  }
}
