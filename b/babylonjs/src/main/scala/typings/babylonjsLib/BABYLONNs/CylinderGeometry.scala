package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new cylinder geometry
  * @description see http://doc.babylonjs.com/how_to/set_shapes#cylinder-or-cone
  */
@JSGlobal("BABYLON.CylinderGeometry")
@js.native
class CylinderGeometry protected () extends _PrimitiveGeometry {
  /**
    * Creates a new cylinder geometry
    * @param id defines the unique ID of the geometry
    * @param scene defines the hosting scene
    * @param height defines the height of the cylinder
    * @param diameterTop defines the diameter of the cylinder's top cap
    * @param diameterBottom defines the diameter of the cylinder's bottom cap
    * @param tessellation defines the tessellation factor to apply to the cylinder (number of radial sides)
    * @param subdivisions defines the number of subdivisions to apply to the cylinder (number of rings) (1 by default)
    * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
    * @param mesh defines the hosting mesh (can be null)
    * @param side defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
    */
  def this(id: java.lang.String, scene: Scene, /**
    * Defines the height of the cylinder
    */
  height: scala.Double, /**
    * Defines the diameter of the cylinder's top cap
    */
  diameterTop: scala.Double, /**
    * Defines the diameter of the cylinder's bottom cap
    */
  diameterBottom: scala.Double, /**
    * Defines the tessellation factor to apply to the cylinder
    */
  tessellation: scala.Double) = this()
  def this(id: java.lang.String, scene: Scene, /**
    * Defines the height of the cylinder
    */
  height: scala.Double, /**
    * Defines the diameter of the cylinder's top cap
    */
  diameterTop: scala.Double, /**
    * Defines the diameter of the cylinder's bottom cap
    */
  diameterBottom: scala.Double, /**
    * Defines the tessellation factor to apply to the cylinder
    */
  tessellation: scala.Double, /**
    * Defines the number of subdivisions to apply to the cylinder (1 by default)
    */
  subdivisions: scala.Double) = this()
  def this(id: java.lang.String, scene: Scene, /**
    * Defines the height of the cylinder
    */
  height: scala.Double, /**
    * Defines the diameter of the cylinder's top cap
    */
  diameterTop: scala.Double, /**
    * Defines the diameter of the cylinder's bottom cap
    */
  diameterBottom: scala.Double, /**
    * Defines the tessellation factor to apply to the cylinder
    */
  tessellation: scala.Double, /**
    * Defines the number of subdivisions to apply to the cylinder (1 by default)
    */
  subdivisions: scala.Double, canBeRegenerated: scala.Boolean) = this()
  def this(id: java.lang.String, scene: Scene, /**
    * Defines the height of the cylinder
    */
  height: scala.Double, /**
    * Defines the diameter of the cylinder's top cap
    */
  diameterTop: scala.Double, /**
    * Defines the diameter of the cylinder's bottom cap
    */
  diameterBottom: scala.Double, /**
    * Defines the tessellation factor to apply to the cylinder
    */
  tessellation: scala.Double, /**
    * Defines the number of subdivisions to apply to the cylinder (1 by default)
    */
  subdivisions: scala.Double, canBeRegenerated: scala.Boolean, mesh: Nullable[Mesh]) = this()
  def this(id: java.lang.String, scene: Scene, /**
    * Defines the height of the cylinder
    */
  height: scala.Double, /**
    * Defines the diameter of the cylinder's top cap
    */
  diameterTop: scala.Double, /**
    * Defines the diameter of the cylinder's bottom cap
    */
  diameterBottom: scala.Double, /**
    * Defines the tessellation factor to apply to the cylinder
    */
  tessellation: scala.Double, /**
    * Defines the number of subdivisions to apply to the cylinder (1 by default)
    */
  subdivisions: scala.Double, canBeRegenerated: scala.Boolean, mesh: Nullable[Mesh], /**
    * Defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
    */
  side: scala.Double) = this()
  /**
    * Defines the diameter of the cylinder's bottom cap
    */
  var diameterBottom: scala.Double = js.native
  /**
    * Defines the diameter of the cylinder's top cap
    */
  var diameterTop: scala.Double = js.native
  /**
    * Defines the height of the cylinder
    */
  var height: scala.Double = js.native
  /**
    * Defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
    */
  var side: scala.Double = js.native
  /**
    * Defines the number of subdivisions to apply to the cylinder (1 by default)
    */
  var subdivisions: scala.Double = js.native
  /**
    * Defines the tessellation factor to apply to the cylinder
    */
  var tessellation: scala.Double = js.native
}

/**
  * Creates a new cylinder geometry
  * @description see http://doc.babylonjs.com/how_to/set_shapes#cylinder-or-cone
  */
@JSGlobal("BABYLON.CylinderGeometry")
@js.native
object CylinderGeometry extends js.Object {
  def Parse(parsedCylinder: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.CylinderGeometry] = js.native
}

