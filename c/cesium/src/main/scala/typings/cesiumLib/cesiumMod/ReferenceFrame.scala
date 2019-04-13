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
  
  val FIXED: FIXED with java.lang.String = js.native
  val INERTIAL: INERTIAL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.ReferenceFrame with java.lang.String] = js.native
}

