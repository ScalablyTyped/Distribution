package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CameraEventType extends StObject
@JSImport("cesium", "CameraEventType")
@js.native
object CameraEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraEventType with Double] = js.native
  
  @js.native
  sealed trait LEFT_DRAG extends CameraEventType
  /* 0 */ val LEFT_DRAG: typings.cesium.mod.CameraEventType.LEFT_DRAG with Double = js.native
  
  @js.native
  sealed trait MIDDLE_DRAG extends CameraEventType
  /* 2 */ val MIDDLE_DRAG: typings.cesium.mod.CameraEventType.MIDDLE_DRAG with Double = js.native
  
  @js.native
  sealed trait PINCH extends CameraEventType
  /* 4 */ val PINCH: typings.cesium.mod.CameraEventType.PINCH with Double = js.native
  
  @js.native
  sealed trait RIGHT_DRAG extends CameraEventType
  /* 1 */ val RIGHT_DRAG: typings.cesium.mod.CameraEventType.RIGHT_DRAG with Double = js.native
  
  @js.native
  sealed trait WHEEL extends CameraEventType
  /* 3 */ val WHEEL: typings.cesium.mod.CameraEventType.WHEEL with Double = js.native
}
