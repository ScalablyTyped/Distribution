package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClassificationType extends StObject
@JSImport("cesium", "ClassificationType")
@js.native
object ClassificationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClassificationType with Double] = js.native
  
  @js.native
  sealed trait BOTH extends ClassificationType
  /* 0 */ val BOTH: typings.cesium.mod.ClassificationType.BOTH with Double = js.native
  
  @js.native
  sealed trait CESIUM_3D_TILE extends ClassificationType
  /* 1 */ val CESIUM_3D_TILE: typings.cesium.mod.ClassificationType.CESIUM_3D_TILE with Double = js.native
  
  @js.native
  sealed trait TERRAIN extends ClassificationType
  /* 2 */ val TERRAIN: typings.cesium.mod.ClassificationType.TERRAIN with Double = js.native
}
