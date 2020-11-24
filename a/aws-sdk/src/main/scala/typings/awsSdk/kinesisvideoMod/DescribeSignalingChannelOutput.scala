package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSignalingChannelOutput extends js.Object {
  
  /**
    * A structure that encapsulates the specified signaling channel's metadata and properties.
    */
  var ChannelInfo: js.UndefOr[typings.awsSdk.kinesisvideoMod.ChannelInfo] = js.native
}
object DescribeSignalingChannelOutput {
  
  @scala.inline
  def apply(): DescribeSignalingChannelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSignalingChannelOutput]
  }
  
  @scala.inline
  implicit class DescribeSignalingChannelOutputOps[Self <: DescribeSignalingChannelOutput] (val x: Self) extends AnyVal {
    
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
    def setChannelInfo(value: ChannelInfo): Self = this.set("ChannelInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelInfo: Self = this.set("ChannelInfo", js.undefined)
  }
}
