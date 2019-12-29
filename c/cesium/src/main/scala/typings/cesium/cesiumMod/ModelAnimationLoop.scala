package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModelAnimationLoop extends js.Object

@JSImport("cesium", "ModelAnimationLoop")
@js.native
object ModelAnimationLoop extends js.Object {
  @js.native
  sealed trait MIRRORED_REPEAT extends ModelAnimationLoop
  
  @js.native
  sealed trait NONE extends ModelAnimationLoop
  
  @js.native
  sealed trait REPEAT extends ModelAnimationLoop
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModelAnimationLoop with Double] = js.native
  /* 2 */ @js.native
  object MIRRORED_REPEAT extends TopLevel[MIRRORED_REPEAT with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 1 */ @js.native
  object REPEAT extends TopLevel[REPEAT with Double]
  
}

