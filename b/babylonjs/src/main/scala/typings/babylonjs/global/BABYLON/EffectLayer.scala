package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.EffectLayer")
@js.native
abstract class EffectLayer protected ()
  extends typings.babylonjs.BABYLON.EffectLayer {
  /**
    * Instantiates a new effect Layer and references it in the scene.
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    */
  def this(
    /** The Friendly of the effect in the scene */
  name: String,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
}

/* static members */
@JSGlobal("BABYLON.EffectLayer")
@js.native
object EffectLayer extends js.Object {
  /**
    * Creates an effect layer from parsed effect layer data
    * @param parsedEffectLayer defines effect layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the effect layer information
    * @returns a parsed effect Layer
    */
  def Parse(parsedEffectLayer: js.Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.EffectLayer = js.native
  /** @hidden */
  def _SceneComponentInitialization(scene: typings.babylonjs.BABYLON.Scene): Unit = js.native
}

