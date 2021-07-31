package typings.cesium.anon

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LowFrameRateMessage extends StObject {
  
  var container: Element | String
  
  var lowFrameRateMessage: js.UndefOr[String] = js.undefined
  
  var scene: typings.cesium.mod.Scene
}
object LowFrameRateMessage {
  
  @scala.inline
  def apply(container: Element | String, scene: typings.cesium.mod.Scene): LowFrameRateMessage = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowFrameRateMessage]
  }
  
  @scala.inline
  implicit class LowFrameRateMessageMutableBuilder[Self <: LowFrameRateMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: Element | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowFrameRateMessage(value: String): Self = StObject.set(x, "lowFrameRateMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowFrameRateMessageUndefined: Self = StObject.set(x, "lowFrameRateMessage", js.undefined)
    
    @scala.inline
    def setScene(value: typings.cesium.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
  }
}
