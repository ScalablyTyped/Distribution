package typings.cesium.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LowFrameRateMessage extends js.Object {
  
  var container: Element | String = js.native
  
  var lowFrameRateMessage: js.UndefOr[String] = js.native
  
  var scene: typings.cesium.mod.Scene = js.native
}
object LowFrameRateMessage {
  
  @scala.inline
  def apply(container: Element | String, scene: typings.cesium.mod.Scene): LowFrameRateMessage = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowFrameRateMessage]
  }
  
  @scala.inline
  implicit class LowFrameRateMessageOps[Self <: LowFrameRateMessage] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: Element | String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene(value: typings.cesium.mod.Scene): Self = this.set("scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowFrameRateMessage(value: String): Self = this.set("lowFrameRateMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowFrameRateMessage: Self = this.set("lowFrameRateMessage", js.undefined)
  }
}
