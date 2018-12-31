package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new ground geometry
  * @description see http://doc.babylonjs.com/how_to/set_shapes#ground
  */
@JSImport("babylonjs", "GroundGeometry")
@js.native
class GroundGeometry protected ()
  extends babylonjsLib.BABYLONNs.GroundGeometry {
  /**
    * Creates a new ground geometry
    * @param id defines the unique ID of the geometry
    * @param scene defines the hosting scene
    * @param width defines the width of the ground
    * @param height defines the height of the ground
    * @param subdivisions defines the subdivisions to apply to the ground
    * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
    * @param mesh defines the hosting mesh (can be null)
    */
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
    * Defines the width of the ground
    */
  width: scala.Double, /**
    * Defines the height of the ground
    */
  height: scala.Double, /**
    * Defines the subdivisions to apply to the ground
    */
  subdivisions: scala.Double) = this()
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
    * Defines the width of the ground
    */
  width: scala.Double, /**
    * Defines the height of the ground
    */
  height: scala.Double, /**
    * Defines the subdivisions to apply to the ground
    */
  subdivisions: scala.Double, canBeRegenerated: scala.Boolean) = this()
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
    * Defines the width of the ground
    */
  width: scala.Double, /**
    * Defines the height of the ground
    */
  height: scala.Double, /**
    * Defines the subdivisions to apply to the ground
    */
  subdivisions: scala.Double, canBeRegenerated: scala.Boolean, mesh: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh]) = this()
}

/**
  * Creates a new ground geometry
  * @description see http://doc.babylonjs.com/how_to/set_shapes#ground
  */
@JSImport("babylonjs", "GroundGeometry")
@js.native
object GroundGeometry extends js.Object {
  def Parse(parsedGround: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.GroundGeometry] = js.native
}

