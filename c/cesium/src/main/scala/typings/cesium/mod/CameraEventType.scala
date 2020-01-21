package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraEventType extends js.Object

@JSImport("cesium", "CameraEventType")
@js.native
object CameraEventType extends js.Object {
  @js.native
  sealed trait LEFT_DRAG extends CameraEventType
  
  @js.native
  sealed trait MIDDLE_DRAG extends CameraEventType
  
  @js.native
  sealed trait PINCH extends CameraEventType
  
  @js.native
  sealed trait RIGHT_DRAG extends CameraEventType
  
  @js.native
  sealed trait WHEEL extends CameraEventType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraEventType with Double] = js.native
  /* 0 */ @js.native
  object LEFT_DRAG extends TopLevel[LEFT_DRAG with Double]
  
  /* 2 */ @js.native
  object MIDDLE_DRAG extends TopLevel[MIDDLE_DRAG with Double]
  
  /* 4 */ @js.native
  object PINCH extends TopLevel[PINCH with Double]
  
  /* 1 */ @js.native
  object RIGHT_DRAG extends TopLevel[RIGHT_DRAG with Double]
  
  /* 3 */ @js.native
  object WHEEL extends TopLevel[WHEEL with Double]
  
}

