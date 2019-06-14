package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReferenceFrame extends js.Object

@JSImport("cesium", "ReferenceFrame")
@js.native
object ReferenceFrame extends js.Object {
  @js.native
  sealed trait FIXED
    extends cesiumLib.cesiumMod.ReferenceFrame
  
  @js.native
  sealed trait INERTIAL
    extends cesiumLib.cesiumMod.ReferenceFrame
  
  /* 0 */ val FIXED: FIXED with scala.Double = js.native
  /* 1 */ val INERTIAL: INERTIAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.ReferenceFrame with scala.Double] = js.native
}

