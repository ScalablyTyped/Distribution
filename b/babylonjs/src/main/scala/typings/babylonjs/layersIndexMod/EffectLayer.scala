package typings.babylonjs.layersIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Layers/index", "EffectLayer")
@js.native
abstract class EffectLayer protected ()
  extends typings.babylonjs.effectLayerMod.EffectLayer {
  /**
    * Instantiates a new effect Layer and references it in the scene.
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    */
  def this(/** The Friendly of the effect in the scene */
  name: String, scene: Scene) = this()
}

/* static members */
@JSImport("babylonjs/Layers/index", "EffectLayer")
@js.native
object EffectLayer extends js.Object {
  /**
    * Creates an effect layer from parsed effect layer data
    * @param parsedEffectLayer defines effect layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the effect layer information
    * @returns a parsed effect Layer
    */
  def Parse(parsedEffectLayer: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.effectLayerMod.EffectLayer = js.native
  /** @hidden */
  def _SceneComponentInitialization(scene: Scene): Unit = js.native
}

