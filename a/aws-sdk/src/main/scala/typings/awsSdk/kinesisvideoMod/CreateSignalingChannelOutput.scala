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
  
  @scala.inline
  def apply(): CreateSignalingChannelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSignalingChannelOutput]
  }
  
  @scala.inline
  implicit class CreateSignalingChannelOutputMutableBuilder[Self <: CreateSignalingChannelOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelARN(value: ResourceARN): Self = StObject.set(x, "ChannelARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelARNUndefined: Self = StObject.set(x, "ChannelARN", js.undefined)
  }
}
