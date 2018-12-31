package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The HemisphericLight simulates the ambient environment light,
  * so the passed direction is the light reflection direction, not the incoming direction.
  */
@JSImport("babylonjs", "HemisphericLight")
@js.native
class HemisphericLight protected ()
  extends babylonjsLib.BABYLONNs.HemisphericLight {
  /**
    * Creates a HemisphericLight object in the scene according to the passed direction (Vector3).
    * The HemisphericLight simulates the ambient environment light, so the passed direction is the light reflection direction, not the incoming direction.
    * The HemisphericLight can't cast shadows.
    * Documentation : http://doc.babylonjs.com/tutorials/lights
    * @param name The friendly name of the light
    * @param direction The direction of the light reflection
    * @param scene The scene the light belongs to
    */
  def this(name: java.lang.String, direction: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

