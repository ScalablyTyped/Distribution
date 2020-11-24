package typings.babylonjs.layersIndexMod

import typings.babylonjs.anon.PartialIGlowLayerOptions
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Layers/index", "GlowLayer")
@js.native
class GlowLayer protected ()
  extends typings.babylonjs.glowLayerMod.GlowLayer {
  /**
    * Instantiates a new glow Layer and references it to the scene.
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    * @param options Sets of none mandatory options to use with the layer (see IGlowLayerOptions for more information)
    */
  def this(name: String, scene: Scene) = this()
  def this(name: String, scene: Scene, options: PartialIGlowLayerOptions) = this()
}
/* static members */
@JSImport("babylonjs/Layers/index", "GlowLayer")
@js.native
object GlowLayer extends js.Object {
  
  /**
    * The default blur kernel size used for the glow.
    */
  var DefaultBlurKernelSize: Double = js.native
  
  /**
    * The default texture size ratio used for the glow.
    */
  var DefaultTextureRatio: Double = js.native
  
  /**
    * Effect Name of the layer.
    */
  val EffectName: String = js.native
  
  /**
    * Creates a Glow Layer from parsed glow layer data
    * @param parsedGlowLayer defines glow layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the glow layer information
    * @returns a parsed Glow Layer
    */
  def Parse(parsedGlowLayer: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.glowLayerMod.GlowLayer = js.native
}
