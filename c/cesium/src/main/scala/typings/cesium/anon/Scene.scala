package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scene extends StObject {
  
  var lowFrameRateMessage: js.UndefOr[String] = js.native
  
  var scene: typings.cesium.mod.Scene = js.native
}
object Scene {
  
  @scala.inline
  def apply(scene: typings.cesium.mod.Scene): Scene = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
  
  @scala.inline
  implicit class SceneMutableBuilder[Self <: Scene] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLowFrameRateMessage(value: String): Self = StObject.set(x, "lowFrameRateMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowFrameRateMessageUndefined: Self = StObject.set(x, "lowFrameRateMessage", js.undefined)
    
    @scala.inline
    def setScene(value: typings.cesium.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
  }
}
