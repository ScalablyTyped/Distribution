package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Mesh representing the gorund
     */
@JSImport("babylonjs", "GroundMesh")
@js.native
class GroundMesh protected ()
  extends babylonjsLib.BABYLONNs.GroundMesh {
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

/**
     * Mesh representing the gorund
     */
@JSImport("babylonjs", "GroundMesh")
@js.native
object GroundMesh extends js.Object {
  /**
           * Parses a serialized ground mesh
           * @param parsedMesh the serialized mesh
           * @param scene the scene to create the ground mesh in
           * @returns the created ground mesh
           */
  def Parse(parsedMesh: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.GroundMesh = js.native
}

