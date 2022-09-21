package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "EffectLayer")
@js.native
abstract class EffectLayer protected ()
  extends typings.babylonjs.legacyMod.EffectLayer {
  /**
    * Instantiates a new effect Layer and references it in the scene.
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    */
  def this(/** The Friendly of the effect in the scene */
  name: String) = this()
  def this(
    /** The Friendly of the effect in the scene */
  name: String,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}
/* static members */
object EffectLayer {
  
  @JSImport("babylonjs", "EffectLayer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an effect layer from parsed effect layer data
    * @param parsedEffectLayer defines effect layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the effect layer information
    * @returns a parsed effect Layer
    */
  inline def Parse(parsedEffectLayer: Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.effectLayerMod.EffectLayer = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedEffectLayer.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.effectLayerMod.EffectLayer]
  
  /**
    * @param _
    * @hidden
    */
  inline def _SceneComponentInitialization(scene: typings.babylonjs.sceneMod.Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
