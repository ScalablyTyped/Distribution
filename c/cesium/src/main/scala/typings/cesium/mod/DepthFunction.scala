package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DepthFunction extends StObject
@JSImport("cesium", "DepthFunction")
@js.native
object DepthFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DepthFunction with Double] = js.native
  
  @js.native
  sealed trait ALWAYS extends DepthFunction
  /* 7 */ val ALWAYS: typings.cesium.mod.DepthFunction.ALWAYS with Double = js.native
  
  @js.native
  sealed trait EQUAL extends DepthFunction
  /* 2 */ val EQUAL: typings.cesium.mod.DepthFunction.EQUAL with Double = js.native
  
  @js.native
  sealed trait GREATER extends DepthFunction
  /* 4 */ val GREATER: typings.cesium.mod.DepthFunction.GREATER with Double = js.native
  
  @js.native
  sealed trait GREATER_OR_EQUAL extends DepthFunction
  /* 6 */ val GREATER_OR_EQUAL: typings.cesium.mod.DepthFunction.GREATER_OR_EQUAL with Double = js.native
  
  @js.native
  sealed trait LESS extends DepthFunction
  /* 1 */ val LESS: typings.cesium.mod.DepthFunction.LESS with Double = js.native
  
  @js.native
  sealed trait LESS_OR_EQUAL extends DepthFunction
  /* 3 */ val LESS_OR_EQUAL: typings.cesium.mod.DepthFunction.LESS_OR_EQUAL with Double = js.native
  
  @js.native
  sealed trait NEVER extends DepthFunction
  /* 0 */ val NEVER: typings.cesium.mod.DepthFunction.NEVER with Double = js.native
  
  @js.native
  sealed trait NOT_EQUAL extends DepthFunction
  /* 5 */ val NOT_EQUAL: typings.cesium.mod.DepthFunction.NOT_EQUAL with Double = js.native
}
