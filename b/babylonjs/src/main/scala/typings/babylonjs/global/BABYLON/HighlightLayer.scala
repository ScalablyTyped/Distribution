package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.PartialIHighlightLayerOptAlphaBlendingMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.HighlightLayer")
@js.native
open class HighlightLayer protected ()
  extends StObject
     with typings.babylonjs.BABYLON.HighlightLayer {
  /**
    * Instantiates a new highlight Layer and references it to the scene..
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    * @param options Sets of none mandatory options to use with the layer (see IHighlightLayerOptions for more information)
    */
  def this(name: String) = this()
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(name: String, scene: Unit, options: PartialIHighlightLayerOptAlphaBlendingMode) = this()
  def this(
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    options: PartialIHighlightLayerOptAlphaBlendingMode
  ) = this()
}
/* static members */
object HighlightLayer {
  
  @JSGlobal("BABYLON.HighlightLayer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Effect Name of the highlight layer.
    */
  @JSGlobal("BABYLON.HighlightLayer.EffectName")
  @js.native
  val EffectName: /* "HighlightLayer" */ String = js.native
  
  /**
    * Stencil value used for glowing meshes.
    */
  @JSGlobal("BABYLON.HighlightLayer.GlowingMeshStencilReference")
  @js.native
  def GlowingMeshStencilReference: Double = js.native
  inline def GlowingMeshStencilReference_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlowingMeshStencilReference")(x.asInstanceOf[js.Any])
  
  /**
    * The neutral color used during the preparation of the glow effect.
    * This is black by default as the blend operation is a blend operation.
    */
  @JSGlobal("BABYLON.HighlightLayer.NeutralColor")
  @js.native
  def NeutralColor: typings.babylonjs.BABYLON.Color4 = js.native
  inline def NeutralColor_=(x: typings.babylonjs.BABYLON.Color4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NeutralColor")(x.asInstanceOf[js.Any])
  
  /**
    * Stencil value used for the other meshes in the scene.
    */
  @JSGlobal("BABYLON.HighlightLayer.NormalMeshStencilReference")
  @js.native
  def NormalMeshStencilReference: Double = js.native
  inline def NormalMeshStencilReference_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NormalMeshStencilReference")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a Highlight layer from parsed Highlight layer data
    * @param parsedHightlightLayer defines the Highlight layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the Highlight layer information
    * @returns a parsed Highlight layer
    */
  inline def Parse(parsedHightlightLayer: Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.HighlightLayer = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedHightlightLayer.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.HighlightLayer]
}
