package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The implemented types of simplification
  * At the moment only Quadratic Error Decimation is implemented
  * @see http://doc.babylonjs.com/how_to/in-browser_mesh_simplification
  */
@JSImport("babylonjs", "SimplificationType")
@js.native
object SimplificationType extends js.Object {
  /* 0 */ val QUADRATIC: babylonjsLib.BABYLONNs.SimplificationType.QUADRATIC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.SimplificationType with scala.Double] = js.native
}

