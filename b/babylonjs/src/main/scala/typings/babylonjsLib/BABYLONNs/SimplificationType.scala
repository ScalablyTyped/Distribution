package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SimplificationType extends js.Object

/**
  * The implemented types of simplification
  * At the moment only Quadratic Error Decimation is implemented
  * @see http://doc.babylonjs.com/how_to/in-browser_mesh_simplification
  */
@JSGlobal("BABYLON.SimplificationType")
@js.native
object SimplificationType extends js.Object {
  /** Quadratic error decimation */
  @js.native
  sealed trait QUADRATIC
    extends babylonjsLib.BABYLONNs.SimplificationType
  
  /* 0 */ val QUADRATIC: QUADRATIC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.SimplificationType with scala.Double] = js.native
}

