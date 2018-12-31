package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a box geometry
  * @description see http://doc.babylonjs.com/how_to/set_shapes#box
  */
@JSImport("babylonjs", "BoxGeometry")
@js.native
class BoxGeometry protected ()
  extends babylonjsLib.BABYLONNs.BoxGeometry {
  /**
    * Creates a box geometry
    * @param id defines the unique ID of the geometry
    * @param scene defines the hosting scene
    * @param size defines the zise of the box (width, height and depth are the same)
    * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
    * @param mesh defines the hosting mesh (can be null)
    * @param side defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
    */
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
    * Defines the zise of the box (width, height and depth are the same)
    */
  size: scala.Double) = this()
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
    * Defines the zise of the box (width, height and depth are the same)
    */
  size: scala.Double, canBeRegenerated: scala.Boolean) = this()
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
    * Defines the zise of the box (width, height and depth are the same)
    */
  size: scala.Double, canBeRegenerated: scala.Boolean, mesh: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh]) = this()
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
    * Defines the zise of the box (width, height and depth are the same)
    */
  size: scala.Double, canBeRegenerated: scala.Boolean, mesh: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh], /**
    * Defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
    */
  side: scala.Double) = this()
}

/**
  * Creates a box geometry
  * @description see http://doc.babylonjs.com/how_to/set_shapes#box
  */
@JSImport("babylonjs", "BoxGeometry")
@js.native
object BoxGeometry extends js.Object {
  def Parse(parsedBox: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.BoxGeometry] = js.native
}

