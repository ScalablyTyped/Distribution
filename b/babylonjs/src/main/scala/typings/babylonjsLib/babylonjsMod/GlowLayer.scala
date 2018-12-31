package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The glow layer Helps adding a glow effect around the emissive parts of a mesh.
  *
  * Once instantiated in a scene, simply use the pushMesh or removeMesh method to add or remove
  * glowy meshes to your scene.
  *
  * Documentation: https://doc.babylonjs.com/how_to/glow_layer
  */
@JSImport("babylonjs", "GlowLayer")
@js.native
class GlowLayer protected ()
  extends babylonjsLib.BABYLONNs.GlowLayer {
  /**
    * Instantiates a new glow Layer and references it to the scene.
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    * @param options Sets of none mandatory options to use with the layer (see IGlowLayerOptions for more information)
    */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, options: stdLib.Partial[babylonjsLib.BABYLONNs.IGlowLayerOptions]) = this()
}

/**
  * The glow layer Helps adding a glow effect around the emissive parts of a mesh.
  *
  * Once instantiated in a scene, simply use the pushMesh or removeMesh method to add or remove
  * glowy meshes to your scene.
  *
  * Documentation: https://doc.babylonjs.com/how_to/glow_layer
  */
@JSImport("babylonjs", "GlowLayer")
@js.native
object GlowLayer extends js.Object {
  /**
    * The default blur kernel size used for the glow.
    */
  var DefaultBlurKernelSize: scala.Double = js.native
  /**
    * The default texture size ratio used for the glow.
    */
  var DefaultTextureRatio: scala.Double = js.native
  /**
    * Effect Name of the layer.
    */
  val EffectName: java.lang.String = js.native
  /**
    * Creates a Glow Layer from parsed glow layer data
    * @param parsedGlowLayer defines glow layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the glow layer information
    * @returns a parsed Glow Layer
    */
  def Parse(parsedGlowLayer: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.GlowLayer = js.native
}

