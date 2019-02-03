package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The highlight layer Helps adding a glow effect around a mesh.
  *
  * Once instantiated in a scene, simply use the pushMesh or removeMesh method to add or remove
  * glowy meshes to your scene.
  *
  * !!! THIS REQUIRES AN ACTIVE STENCIL BUFFER ON THE CANVAS !!!
  */
@JSImport("babylonjs", "HighlightLayer")
@js.native
class HighlightLayer protected ()
  extends babylonjsLib.BABYLONNs.HighlightLayer {
  /**
    * Instantiates a new highlight Layer and references it to the scene..
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    * @param options Sets of none mandatory options to use with the layer (see IHighlightLayerOptions for more information)
    */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, options: stdLib.Partial[babylonjsLib.BABYLONNs.IHighlightLayerOptions]) = this()
}

/* static members */
@JSImport("babylonjs", "HighlightLayer")
@js.native
object HighlightLayer extends js.Object {
  /**
    * Effect Name of the highlight layer.
    */
  val EffectName: java.lang.String = js.native
  /**
    * Stencil value used for glowing meshes.
    */
  var GlowingMeshStencilReference: scala.Double = js.native
  /**
    * The neutral color used during the preparation of the glow effect.
    * This is black by default as the blend operation is a blend operation.
    */
  var NeutralColor: babylonjsLib.BABYLONNs.Color4 = js.native
  /**
    * Stencil value used for the other meshes in the scene.
    */
  var NormalMeshStencilReference: scala.Double = js.native
  /**
    * Creates a Highlight layer from parsed Highlight layer data
    * @param parsedHightlightLayer defines the Highlight layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the Highlight layer information
    * @returns a parsed Highlight layer
    */
  def Parse(parsedHightlightLayer: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.HighlightLayer = js.native
}

