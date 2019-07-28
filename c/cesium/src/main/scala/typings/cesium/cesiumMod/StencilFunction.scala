package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StencilFunction extends js.Object

@JSImport("cesium", "StencilFunction")
@js.native
object StencilFunction extends js.Object {
  @js.native
  sealed trait ALWAYS extends StencilFunction
  
  @js.native
  sealed trait EQUAL extends StencilFunction
  
  @js.native
  sealed trait GREATER extends StencilFunction
  
  @js.native
  sealed trait GREATER_OR_EQUAL extends StencilFunction
  
  @js.native
  sealed trait LESS extends StencilFunction
  
  @js.native
  sealed trait LESS_OR_EQUAL extends StencilFunction
  
  @js.native
  sealed trait NEVER extends StencilFunction
  
  @js.native
  sealed trait NOT_EQUAL extends StencilFunction
  
  /* 7 */ val ALWAYS: typings.cesium.cesiumMod.StencilFunction.ALWAYS with Double = js.native
  /* 2 */ val EQUAL: typings.cesium.cesiumMod.StencilFunction.EQUAL with Double = js.native
  /* 4 */ val GREATER: typings.cesium.cesiumMod.StencilFunction.GREATER with Double = js.native
  /* 6 */ val GREATER_OR_EQUAL: typings.cesium.cesiumMod.StencilFunction.GREATER_OR_EQUAL with Double = js.native
  /* 1 */ val LESS: typings.cesium.cesiumMod.StencilFunction.LESS with Double = js.native
  /* 3 */ val LESS_OR_EQUAL: typings.cesium.cesiumMod.StencilFunction.LESS_OR_EQUAL with Double = js.native
  /* 0 */ val NEVER: typings.cesium.cesiumMod.StencilFunction.NEVER with Double = js.native
  /* 5 */ val NOT_EQUAL: typings.cesium.cesiumMod.StencilFunction.NOT_EQUAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StencilFunction with Double] = js.native
}

