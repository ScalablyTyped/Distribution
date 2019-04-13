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
  
  val DECREMENT: DECREMENT with java.lang.String = js.native
  val DECREMENT_WRAP: DECREMENT_WRAP with java.lang.String = js.native
  val INCREMENT: INCREMENT with java.lang.String = js.native
  val INCREMENT_WRAP: INCREMENT_WRAP with java.lang.String = js.native
  val INVERT: INVERT with java.lang.String = js.native
  val KEEP: KEEP with java.lang.String = js.native
  val REPLACE: REPLACE with java.lang.String = js.native
  val ZERO: ZERO with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.StencilOperation with java.lang.String] = js.native
}

