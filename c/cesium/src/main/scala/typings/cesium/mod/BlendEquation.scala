package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendEquation extends StObject
@JSImport("cesium", "BlendEquation")
@js.native
object BlendEquation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendEquation & Double] = js.native
  
  @js.native
  sealed trait ADD
    extends StObject
       with BlendEquation
  /* 0 */ val ADD: typings.cesium.mod.BlendEquation.ADD & Double = js.native
  
  @js.native
  sealed trait REVERSE_SUBTRACT
    extends StObject
       with BlendEquation
  /* 2 */ val REVERSE_SUBTRACT: typings.cesium.mod.BlendEquation.REVERSE_SUBTRACT & Double = js.native
  
  @js.native
  sealed trait SUBTRACT
    extends StObject
       with BlendEquation
  /* 1 */ val SUBTRACT: typings.cesium.mod.BlendEquation.SUBTRACT & Double = js.native
}
