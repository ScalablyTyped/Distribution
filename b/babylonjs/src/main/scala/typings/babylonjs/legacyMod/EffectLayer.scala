package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "EffectLayer")
@js.native
abstract class EffectLayer protected ()
  extends typings.babylonjs.indexMod.EffectLayer {
  /**
    * Instantiates a new effect Layer and references it in the scene.
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    */
  def this(
    /** The Friendly of the effect in the scene */
  name: String,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}
/* static members */
object EffectLayer {
  
  /**
    * Creates an effect layer from parsed effect layer data
    * @param parsedEffectLayer defines effect layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the effect layer information
    * @returns a parsed effect Layer
    */
  @JSImport("babylonjs/Legacy/legacy", "EffectLayer.Parse")
  @js.native
  def Parse(parsedEffectLayer: js.Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.effectLayerMod.EffectLayer = js.native
  
  /** @hidden */
  @JSImport("babylonjs/Legacy/legacy", "EffectLayer._SceneComponentInitialization")
  @js.native
  def _SceneComponentInitialization(scene: typings.babylonjs.sceneMod.Scene): Unit = js.native
}
