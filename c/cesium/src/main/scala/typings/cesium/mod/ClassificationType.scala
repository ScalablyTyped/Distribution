package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClassificationType extends js.Object

@JSImport("cesium", "ClassificationType")
@js.native
object ClassificationType extends js.Object {
  @js.native
  sealed trait BOTH extends ClassificationType
  
  @js.native
  sealed trait CESIUM_3D_TILE extends ClassificationType
  
  @js.native
  sealed trait TERRAIN extends ClassificationType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClassificationType with Double] = js.native
  /* 0 */ @js.native
  object BOTH extends TopLevel[BOTH with Double]
  
  /* 1 */ @js.native
  object CESIUM_3D_TILE extends TopLevel[CESIUM_3D_TILE with Double]
  
  /* 2 */ @js.native
  object TERRAIN extends TopLevel[TERRAIN with Double]
  
}

