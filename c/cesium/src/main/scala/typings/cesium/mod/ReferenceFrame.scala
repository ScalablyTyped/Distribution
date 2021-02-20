package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReferenceFrame extends StObject
@JSImport("cesium", "ReferenceFrame")
@js.native
object ReferenceFrame extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReferenceFrame with Double] = js.native
  
  @js.native
  sealed trait FIXED extends ReferenceFrame
  /* 0 */ val FIXED: typings.cesium.mod.ReferenceFrame.FIXED with Double = js.native
  
  @js.native
  sealed trait INERTIAL extends ReferenceFrame
  /* 1 */ val INERTIAL: typings.cesium.mod.ReferenceFrame.INERTIAL with Double = js.native
}
