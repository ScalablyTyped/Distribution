package typings.babylonjs.debugIndexMod.babylonjsSceneAugmentingMod

import typings.babylonjs.debugLayerMod.DebugLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  /**
    * @hidden
    * Backing field
    */
  var _debugLayer: DebugLayer
  /**
    * Gets the debug layer (aka Inspector) associated with the scene
    * @see http://doc.babylonjs.com/features/playground_debuglayer
    */
  var debugLayer: DebugLayer
}

object Scene {
  @scala.inline
  def apply(_debugLayer: DebugLayer, debugLayer: DebugLayer): Scene = {
    val __obj = js.Dynamic.literal(_debugLayer = _debugLayer.asInstanceOf[js.Any], debugLayer = debugLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
}

