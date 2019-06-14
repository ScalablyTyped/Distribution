package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DepthFunction extends js.Object

@JSImport("cesium", "DepthFunction")
@js.native
object DepthFunction extends js.Object {
  @js.native
  sealed trait ALWAYS
    extends cesiumLib.cesiumMod.DepthFunction
  
  @js.native
  sealed trait EQUAL
    extends cesiumLib.cesiumMod.DepthFunction
  
  @js.native
  sealed trait GREATER
    extends cesiumLib.cesiumMod.DepthFunction
  
  @js.native
  sealed trait GREATER_OR_EQUAL
    extends cesiumLib.cesiumMod.DepthFunction
  
  @js.native
  sealed trait LESS
    extends cesiumLib.cesiumMod.DepthFunction
  
  @js.native
  sealed trait LESS_OR_EQUAL
    extends cesiumLib.cesiumMod.DepthFunction
  
  @js.native
  sealed trait NEVER
    extends cesiumLib.cesiumMod.DepthFunction
  
  @js.native
  sealed trait NOT_EQUAL
    extends cesiumLib.cesiumMod.DepthFunction
  
  /* 7 */ val ALWAYS: ALWAYS with scala.Double = js.native
  /* 2 */ val EQUAL: EQUAL with scala.Double = js.native
  /* 4 */ val GREATER: GREATER with scala.Double = js.native
  /* 6 */ val GREATER_OR_EQUAL: GREATER_OR_EQUAL with scala.Double = js.native
  /* 1 */ val LESS: LESS with scala.Double = js.native
  /* 3 */ val LESS_OR_EQUAL: LESS_OR_EQUAL with scala.Double = js.native
  /* 0 */ val NEVER: NEVER with scala.Double = js.native
  /* 5 */ val NOT_EQUAL: NOT_EQUAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.DepthFunction with scala.Double] = js.native
}

