package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReferenceFrame extends js.Object

@JSImport("cesium", "ReferenceFrame")
@js.native
object ReferenceFrame extends js.Object {
  @js.native
  sealed trait FIXED extends ReferenceFrame
  
  @js.native
  sealed trait INERTIAL extends ReferenceFrame
  
  /* 0 */ val FIXED: typings.cesium.cesiumMod.ReferenceFrame.FIXED with Double = js.native
  /* 1 */ val INERTIAL: typings.cesium.cesiumMod.ReferenceFrame.INERTIAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReferenceFrame with Double] = js.native
}

