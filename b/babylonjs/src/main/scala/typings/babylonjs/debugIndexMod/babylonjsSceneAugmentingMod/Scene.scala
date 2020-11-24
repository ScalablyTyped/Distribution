package typings.babylonjs.debugIndexMod.babylonjsSceneAugmentingMod

import typings.babylonjs.debugLayerMod.DebugLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scene extends js.Object {
  
  /**
    * @hidden
    * Backing field
    */
  var _debugLayer: DebugLayer = js.native
  
  /**
    * Gets the debug layer (aka Inspector) associated with the scene
    * @see https://doc.babylonjs.com/features/playground_debuglayer
    */
  var debugLayer: DebugLayer = js.native
}
object Scene {
  
  @scala.inline
  def apply(_debugLayer: DebugLayer, debugLayer: DebugLayer): Scene = {
    val __obj = js.Dynamic.literal(_debugLayer = _debugLayer.asInstanceOf[js.Any], debugLayer = debugLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
  
  @scala.inline
  implicit class SceneOps[Self <: Scene] (val x: Self) extends AnyVal {
    
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
    def set_debugLayer(value: DebugLayer): Self = this.set("_debugLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugLayer(value: DebugLayer): Self = this.set("debugLayer", value.asInstanceOf[js.Any])
  }
}
