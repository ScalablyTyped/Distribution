package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSignalingChannelInput extends StObject {
  
  /**
    * The ARN of the signaling channel that you want to describe.
    */
  var ChannelARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the signaling channel that you want to describe.
    */
  var ChannelName: js.UndefOr[typings.awsSdk.kinesisvideoMod.ChannelName] = js.undefined
}
object DescribeSignalingChannelInput {
  
  @scala.inline
  def apply(): DescribeSignalingChannelInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSignalingChannelInput]
  }
  
  @scala.inline
  implicit class DescribeSignalingChannelInputMutableBuilder[Self <: DescribeSignalingChannelInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelARN(value: ResourceARN): Self = StObject.set(x, "ChannelARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelARNUndefined: Self = StObject.set(x, "ChannelARN", js.undefined)
    
    @scala.inline
    def setChannelName(value: ChannelName): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelNameUndefined: Self = StObject.set(x, "ChannelName", js.undefined)
  }
}
