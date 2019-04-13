package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StencilFunction extends js.Object

@JSImport("cesium", "StencilFunction")
@js.native
object StencilFunction extends js.Object {
  @js.native
  sealed trait ALWAYS
    extends cesiumLib.cesiumMod.StencilFunction
  
  @js.native
  sealed trait EQUAL
    extends cesiumLib.cesiumMod.StencilFunction
  
  @js.native
  sealed trait GREATER
    extends cesiumLib.cesiumMod.StencilFunction
  
  @js.native
  sealed trait GREATER_OR_EQUAL
    extends cesiumLib.cesiumMod.StencilFunction
  
  @js.native
  sealed trait LESS
    extends cesiumLib.cesiumMod.StencilFunction
  
  @js.native
  sealed trait LESS_OR_EQUAL
    extends cesiumLib.cesiumMod.StencilFunction
  
  @js.native
  sealed trait NEVER
    extends cesiumLib.cesiumMod.StencilFunction
  
  @js.native
  sealed trait NOT_EQUAL
    extends cesiumLib.cesiumMod.StencilFunction
  
  val ALWAYS: ALWAYS with java.lang.String = js.native
  val EQUAL: EQUAL with java.lang.String = js.native
  val GREATER: GREATER with java.lang.String = js.native
  val GREATER_OR_EQUAL: GREATER_OR_EQUAL with java.lang.String = js.native
  val LESS: LESS with java.lang.String = js.native
  val LESS_OR_EQUAL: LESS_OR_EQUAL with java.lang.String = js.native
  val NEVER: NEVER with java.lang.String = js.native
  val NOT_EQUAL: NOT_EQUAL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.StencilFunction with java.lang.String] = js.native
}

