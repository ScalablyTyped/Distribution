package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new torus geometry
  * @description see http://doc.babylonjs.com/how_to/set_shapes#torus
  */
@JSImport("babylonjs", "TorusGeometry")
@js.native
class TorusGeometry protected ()
  extends babylonjsLib.BABYLONNs.TorusGeometry {
  /**
    * Creates a new torus geometry
    * @param id defines the unique ID of the geometry
    * @param scene defines the hosting scene
    * @param diameter defines the diameter of the torus
    * @param thickness defines the thickness of the torus (ie. internal diameter)
    * @param tessellation defines the tesselation factor to apply to the torus (number of segments along the circle)
    * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
    * @param mesh defines the hosting mesh (can be null)
    * @param side defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
    */
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
    * Defines the diameter of the torus
    */
  diameter: scala.Double, /**
    * Defines the thickness of the torus (ie. internal diameter)
    */
  thickness: scala.Double, /**
    * Defines the tesselation factor to apply to the torus
    */
  tessellation: scala.Double) = this()
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
    * Defines the diameter of the torus
    */
  diameter: scala.Double, /**
    * Defines the thickness of the torus (ie. internal diameter)
    */
  thickness: scala.Double, /**
    * Defines the tesselation factor to apply to the torus
    */
  tessellation: scala.Double, canBeRegenerated: scala.Boolean) = this()
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
    * Defines the diameter of the torus
    */
  diameter: scala.Double, /**
    * Defines the thickness of the torus (ie. internal diameter)
    */
  thickness: scala.Double, /**
    * Defines the tesselation factor to apply to the torus
    */
  tessellation: scala.Double, canBeRegenerated: scala.Boolean, mesh: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh]) = this()
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
    * Defines the diameter of the torus
    */
  diameter: scala.Double, /**
    * Defines the thickness of the torus (ie. internal diameter)
    */
  thickness: scala.Double, /**
    * Defines the tesselation factor to apply to the torus
    */
  tessellation: scala.Double, canBeRegenerated: scala.Boolean, mesh: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh], /**
    * Defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
    */
  side: scala.Double) = this()
}

/**
  * Creates a new torus geometry
  * @description see http://doc.babylonjs.com/how_to/set_shapes#torus
  */
@JSImport("babylonjs", "TorusGeometry")
@js.native
object TorusGeometry extends js.Object {
  def Parse(parsedTorus: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.TorusGeometry] = js.native
}

