package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a plane geometry
  * @description see http://doc.babylonjs.com/how_to/set_shapes#plane
  */
@JSGlobal("BABYLON.PlaneGeometry")
@js.native
class PlaneGeometry protected () extends _PrimitiveGeometry {
  /**
    * Creates a plane geometry
    * @param id defines the unique ID of the geometry
    * @param scene defines the hosting scene
    * @param size defines the size of the plane (width === height)
    * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
    * @param mesh defines the hosting mesh (can be null)
    * @param side defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
    */
  def this(id: java.lang.String, scene: Scene, /**
    * Defines the size of the plane (width === height)
    */
  size: scala.Double) = this()
  def this(id: java.lang.String, scene: Scene, /**
    * Defines the size of the plane (width === height)
    */
  size: scala.Double, canBeRegenerated: scala.Boolean) = this()
  def this(id: java.lang.String, scene: Scene, /**
    * Defines the size of the plane (width === height)
    */
  size: scala.Double, canBeRegenerated: scala.Boolean, mesh: Nullable[Mesh]) = this()
  def this(id: java.lang.String, scene: Scene, /**
    * Defines the size of the plane (width === height)
    */
  size: scala.Double, canBeRegenerated: scala.Boolean, mesh: Nullable[Mesh], /**
    * Defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
    */
  side: scala.Double) = this()
  /**
    * Defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
    */
  var side: scala.Double = js.native
  /**
    * Defines the size of the plane (width === height)
    */
  var size: scala.Double = js.native
}

/**
  * Creates a plane geometry
  * @description see http://doc.babylonjs.com/how_to/set_shapes#plane
  */
@JSGlobal("BABYLON.PlaneGeometry")
@js.native
object PlaneGeometry extends js.Object {
  def Parse(parsedPlane: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.PlaneGeometry] = js.native
}

