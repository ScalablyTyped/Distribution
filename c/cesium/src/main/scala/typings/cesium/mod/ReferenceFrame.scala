package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReferenceFrame extends js.Object
@JSImport("cesium", "ReferenceFrame")
@js.native
object ReferenceFrame extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReferenceFrame with Double] = js.native
  
  @js.native
  sealed trait FIXED extends ReferenceFrame
  /* 0 */ @js.native
  object FIXED extends TopLevel[FIXED with Double]
  
  @js.native
  sealed trait INERTIAL extends ReferenceFrame
  /* 1 */ @js.native
  object INERTIAL extends TopLevel[INERTIAL with Double]
}
