package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendFunction extends js.Object

@JSImport("cesium", "BlendFunction")
@js.native
object BlendFunction extends js.Object {
  @js.native
  sealed trait CONSTANT_ALPHA
    extends cesiumLib.cesiumMod.BlendFunction
  
  @js.native
  sealed trait CONSTANT_COLOR
    extends cesiumLib.cesiumMod.BlendFunction
  
  @js.native
  sealed trait DESTINATION_ALPHA
    extends cesiumLib.cesiumMod.BlendFunction
  
  @js.native
  sealed trait DESTINATION_COLOR
    extends cesiumLib.cesiumMod.BlendFunction
  
  @js.native
  sealed trait ONE
    extends cesiumLib.cesiumMod.BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_CONSTANT_ALPHA
    extends cesiumLib.cesiumMod.BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_CONSTANT_COLOR
    extends cesiumLib.cesiumMod.BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_DESTINATION_ALPHA
    extends cesiumLib.cesiumMod.BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_DESTINATION_COLOR
    extends cesiumLib.cesiumMod.BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_SOURCE_ALPHA
    extends cesiumLib.cesiumMod.BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_SOURCE_COLOR
    extends cesiumLib.cesiumMod.BlendFunction
  
  @js.native
  sealed trait SOURCE_ALPHA
    extends cesiumLib.cesiumMod.BlendFunction
  
  @js.native
  sealed trait SOURCE_ALPHA_SATURATE
    extends cesiumLib.cesiumMod.BlendFunction
  
  @js.native
  sealed trait SOURCE_COLOR
    extends cesiumLib.cesiumMod.BlendFunction
  
  @js.native
  sealed trait ZERO
    extends cesiumLib.cesiumMod.BlendFunction
  
  val CONSTANT_ALPHA: CONSTANT_ALPHA with java.lang.String = js.native
  val CONSTANT_COLOR: CONSTANT_COLOR with java.lang.String = js.native
  val DESTINATION_ALPHA: DESTINATION_ALPHA with java.lang.String = js.native
  val DESTINATION_COLOR: DESTINATION_COLOR with java.lang.String = js.native
  val ONE: ONE with java.lang.String = js.native
  val ONE_MINUS_CONSTANT_ALPHA: ONE_MINUS_CONSTANT_ALPHA with java.lang.String = js.native
  val ONE_MINUS_CONSTANT_COLOR: ONE_MINUS_CONSTANT_COLOR with java.lang.String = js.native
  val ONE_MINUS_DESTINATION_ALPHA: ONE_MINUS_DESTINATION_ALPHA with java.lang.String = js.native
  val ONE_MINUS_DESTINATION_COLOR: ONE_MINUS_DESTINATION_COLOR with java.lang.String = js.native
  val ONE_MINUS_SOURCE_ALPHA: ONE_MINUS_SOURCE_ALPHA with java.lang.String = js.native
  val ONE_MINUS_SOURCE_COLOR: ONE_MINUS_SOURCE_COLOR with java.lang.String = js.native
  val SOURCE_ALPHA: SOURCE_ALPHA with java.lang.String = js.native
  val SOURCE_ALPHA_SATURATE: SOURCE_ALPHA_SATURATE with java.lang.String = js.native
  val SOURCE_COLOR: SOURCE_COLOR with java.lang.String = js.native
  val ZERO: ZERO with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.BlendFunction with java.lang.String] = js.native
}

