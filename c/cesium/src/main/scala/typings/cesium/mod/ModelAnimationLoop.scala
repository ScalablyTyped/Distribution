package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModelAnimationLoop extends js.Object
@JSImport("cesium", "ModelAnimationLoop")
@js.native
object ModelAnimationLoop extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModelAnimationLoop with Double] = js.native
  
  @js.native
  sealed trait MIRRORED_REPEAT extends ModelAnimationLoop
  /* 2 */ @js.native
  object MIRRORED_REPEAT extends TopLevel[MIRRORED_REPEAT with Double]
  
  @js.native
  sealed trait NONE extends ModelAnimationLoop
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  @js.native
  sealed trait REPEAT extends ModelAnimationLoop
  /* 1 */ @js.native
  object REPEAT extends TopLevel[REPEAT with Double]
}
