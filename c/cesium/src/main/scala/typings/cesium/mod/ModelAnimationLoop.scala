package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModelAnimationLoop extends StObject
@JSImport("cesium", "ModelAnimationLoop")
@js.native
object ModelAnimationLoop extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModelAnimationLoop with Double] = js.native
  
  @js.native
  sealed trait MIRRORED_REPEAT extends ModelAnimationLoop
  /* 2 */ val MIRRORED_REPEAT: typings.cesium.mod.ModelAnimationLoop.MIRRORED_REPEAT with Double = js.native
  
  @js.native
  sealed trait NONE extends ModelAnimationLoop
  /* 0 */ val NONE: typings.cesium.mod.ModelAnimationLoop.NONE with Double = js.native
  
  @js.native
  sealed trait REPEAT extends ModelAnimationLoop
  /* 1 */ val REPEAT: typings.cesium.mod.ModelAnimationLoop.REPEAT with Double = js.native
}
