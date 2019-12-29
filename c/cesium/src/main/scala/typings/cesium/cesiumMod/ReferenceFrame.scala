package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReferenceFrame with Double] = js.native
  /* 0 */ @js.native
  object FIXED extends TopLevel[FIXED with Double]
  
  /* 1 */ @js.native
  object INERTIAL extends TopLevel[INERTIAL with Double]
  
}

