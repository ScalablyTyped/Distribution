package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendEquation extends StObject
@JSImport("cesium", "BlendEquation")
@js.native
object BlendEquation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendEquation with Double] = js.native
  
  @js.native
  sealed trait ADD extends BlendEquation
  /* 0 */ val ADD: typings.cesium.mod.BlendEquation.ADD with Double = js.native
  
  @js.native
  sealed trait REVERSE_SUBTRACT extends BlendEquation
  /* 2 */ val REVERSE_SUBTRACT: typings.cesium.mod.BlendEquation.REVERSE_SUBTRACT with Double = js.native
  
  @js.native
  sealed trait SUBTRACT extends BlendEquation
  /* 1 */ val SUBTRACT: typings.cesium.mod.BlendEquation.SUBTRACT with Double = js.native
}
