package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builds a polygon
  * @see https://doc.babylonjs.com/how_to/polygonmeshbuilder
  */
@JSGlobal("BABYLON.PolygonMeshBuilder")
@js.native
class PolygonMeshBuilder protected () extends js.Object {
  /**
    * Creates a PolygonMeshBuilder
    * @param name name of the builder
    * @param contours Path of the polygon
    * @param scene scene to add to
    */
  def this(name: java.lang.String, contours: Path2, scene: Scene) = this()
  def this(name: java.lang.String, contours: js.Any, scene: Scene) = this()
  def this(name: java.lang.String, contours: js.Array[Vector2], scene: Scene) = this()
  var _addToepoint: js.Any = js.native
  var _eholes: js.Any = js.native
  var _epoints: js.Any = js.native
  var _holes: js.Any = js.native
  var _name: js.Any = js.native
  var _outlinepoints: js.Any = js.native
  var _points: js.Any = js.native
  var _scene: js.Any = js.native
  /**
    * Adds a side to the polygon
    * @param positions points that make the polygon
    * @param normals normals of the polygon
    * @param uvs uvs of the polygon
    * @param indices indices of the polygon
    * @param bounds bounds of the polygon
    * @param points points of the polygon
    * @param depth depth of the polygon
    * @param flip flip of the polygon
    */
  var addSide: js.Any = js.native
  /**
    * Adds a whole within the polygon
    * @param hole Array of points defining the hole
    * @returns this
    */
  def addHole(hole: js.Array[Vector2]): PolygonMeshBuilder = js.native
  /**
    * Creates the polygon
    * @param updatable If the mesh should be updatable
    * @param depth The depth of the mesh created
    * @returns the created mesh
    */
  def build(): Mesh = js.native
  def build(updatable: scala.Boolean): Mesh = js.native
  def build(updatable: scala.Boolean, depth: scala.Double): Mesh = js.native
}

