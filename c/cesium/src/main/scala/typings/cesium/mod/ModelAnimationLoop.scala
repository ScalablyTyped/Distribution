package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModelAnimationLoop extends StObject
@JSImport("cesium", "ModelAnimationLoop")
@js.native
object ModelAnimationLoop extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModelAnimationLoop & Double] = js.native
  
  @js.native
  sealed trait MIRRORED_REPEAT
    extends StObject
       with ModelAnimationLoop
  /* 2 */ val MIRRORED_REPEAT: typings.cesium.mod.ModelAnimationLoop.MIRRORED_REPEAT & Double = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with ModelAnimationLoop
  /* 0 */ val NONE: typings.cesium.mod.ModelAnimationLoop.NONE & Double = js.native
  
  @js.native
  sealed trait REPEAT
    extends StObject
       with ModelAnimationLoop
  /* 1 */ val REPEAT: typings.cesium.mod.ModelAnimationLoop.REPEAT & Double = js.native
}
