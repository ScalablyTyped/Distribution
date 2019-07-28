package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DepthFunction extends js.Object

@JSImport("cesium", "DepthFunction")
@js.native
object DepthFunction extends js.Object {
  @js.native
  sealed trait ALWAYS extends DepthFunction
  
  @js.native
  sealed trait EQUAL extends DepthFunction
  
  @js.native
  sealed trait GREATER extends DepthFunction
  
  @js.native
  sealed trait GREATER_OR_EQUAL extends DepthFunction
  
  @js.native
  sealed trait LESS extends DepthFunction
  
  @js.native
  sealed trait LESS_OR_EQUAL extends DepthFunction
  
  @js.native
  sealed trait NEVER extends DepthFunction
  
  @js.native
  sealed trait NOT_EQUAL extends DepthFunction
  
  /* 7 */ val ALWAYS: typings.cesium.cesiumMod.DepthFunction.ALWAYS with Double = js.native
  /* 2 */ val EQUAL: typings.cesium.cesiumMod.DepthFunction.EQUAL with Double = js.native
  /* 4 */ val GREATER: typings.cesium.cesiumMod.DepthFunction.GREATER with Double = js.native
  /* 6 */ val GREATER_OR_EQUAL: typings.cesium.cesiumMod.DepthFunction.GREATER_OR_EQUAL with Double = js.native
  /* 1 */ val LESS: typings.cesium.cesiumMod.DepthFunction.LESS with Double = js.native
  /* 3 */ val LESS_OR_EQUAL: typings.cesium.cesiumMod.DepthFunction.LESS_OR_EQUAL with Double = js.native
  /* 0 */ val NEVER: typings.cesium.cesiumMod.DepthFunction.NEVER with Double = js.native
  /* 5 */ val NOT_EQUAL: typings.cesium.cesiumMod.DepthFunction.NOT_EQUAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DepthFunction with Double] = js.native
}

