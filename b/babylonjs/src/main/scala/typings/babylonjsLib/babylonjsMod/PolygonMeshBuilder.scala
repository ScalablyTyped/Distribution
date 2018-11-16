package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Builds a polygon
     * @see https://doc.babylonjs.com/how_to/polygonmeshbuilder
     */
@JSImport("babylonjs", "PolygonMeshBuilder")
@js.native
class PolygonMeshBuilder protected ()
  extends babylonjsLib.BABYLONNs.PolygonMeshBuilder {
  /**
           * Creates a PolygonMeshBuilder
           * @param name name of the builder
           * @param contours Path of the polygon
           * @param scene scene to add to
           */
  def this(name: java.lang.String, contours: babylonjsLib.BABYLONNs.Path2, scene: babylonjsLib.BABYLONNs.Scene) = this()
  /**
           * Creates a PolygonMeshBuilder
           * @param name name of the builder
           * @param contours Path of the polygon
           * @param scene scene to add to
           */
  def this(name: java.lang.String, contours: js.Any, scene: babylonjsLib.BABYLONNs.Scene) = this()
  /**
           * Creates a PolygonMeshBuilder
           * @param name name of the builder
           * @param contours Path of the polygon
           * @param scene scene to add to
           */
  def this(name: java.lang.String, contours: js.Array[babylonjsLib.BABYLONNs.Vector2], scene: babylonjsLib.BABYLONNs.Scene) = this()
}

