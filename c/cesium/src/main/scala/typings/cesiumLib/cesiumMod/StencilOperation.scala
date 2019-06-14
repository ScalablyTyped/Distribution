package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StencilOperation extends js.Object

@JSImport("cesium", "StencilOperation")
@js.native
object StencilOperation extends js.Object {
  @js.native
  sealed trait DECREMENT
    extends cesiumLib.cesiumMod.StencilOperation
  
  @js.native
  sealed trait DECREMENT_WRAP
    extends cesiumLib.cesiumMod.StencilOperation
  
  @js.native
  sealed trait INCREMENT
    extends cesiumLib.cesiumMod.StencilOperation
  
  @js.native
  sealed trait INCREMENT_WRAP
    extends cesiumLib.cesiumMod.StencilOperation
  
  @js.native
  sealed trait INVERT
    extends cesiumLib.cesiumMod.StencilOperation
  
  @js.native
  sealed trait KEEP
    extends cesiumLib.cesiumMod.StencilOperation
  
  @js.native
  sealed trait REPLACE
    extends cesiumLib.cesiumMod.StencilOperation
  
  @js.native
  sealed trait ZERO
    extends cesiumLib.cesiumMod.StencilOperation
  
  /* 4 */ val DECREMENT: DECREMENT with scala.Double = js.native
  /* 7 */ val DECREMENT_WRAP: DECREMENT_WRAP with scala.Double = js.native
  /* 3 */ val INCREMENT: INCREMENT with scala.Double = js.native
  /* 6 */ val INCREMENT_WRAP: INCREMENT_WRAP with scala.Double = js.native
  /* 5 */ val INVERT: INVERT with scala.Double = js.native
  /* 1 */ val KEEP: KEEP with scala.Double = js.native
  /* 2 */ val REPLACE: REPLACE with scala.Double = js.native
  /* 0 */ val ZERO: ZERO with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.StencilOperation with scala.Double] = js.native
}

