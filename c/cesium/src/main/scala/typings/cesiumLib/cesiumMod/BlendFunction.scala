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
  
  /* 12 */ val CONSTANT_ALPHA: CONSTANT_ALPHA with scala.Double = js.native
  /* 10 */ val CONSTANT_COLOR: CONSTANT_COLOR with scala.Double = js.native
  /* 8 */ val DESTINATION_ALPHA: DESTINATION_ALPHA with scala.Double = js.native
  /* 4 */ val DESTINATION_COLOR: DESTINATION_COLOR with scala.Double = js.native
  /* 1 */ val ONE: ONE with scala.Double = js.native
  /* 13 */ val ONE_MINUS_CONSTANT_ALPHA: ONE_MINUS_CONSTANT_ALPHA with scala.Double = js.native
  /* 11 */ val ONE_MINUS_CONSTANT_COLOR: ONE_MINUS_CONSTANT_COLOR with scala.Double = js.native
  /* 9 */ val ONE_MINUS_DESTINATION_ALPHA: ONE_MINUS_DESTINATION_ALPHA with scala.Double = js.native
  /* 5 */ val ONE_MINUS_DESTINATION_COLOR: ONE_MINUS_DESTINATION_COLOR with scala.Double = js.native
  /* 7 */ val ONE_MINUS_SOURCE_ALPHA: ONE_MINUS_SOURCE_ALPHA with scala.Double = js.native
  /* 3 */ val ONE_MINUS_SOURCE_COLOR: ONE_MINUS_SOURCE_COLOR with scala.Double = js.native
  /* 6 */ val SOURCE_ALPHA: SOURCE_ALPHA with scala.Double = js.native
  /* 14 */ val SOURCE_ALPHA_SATURATE: SOURCE_ALPHA_SATURATE with scala.Double = js.native
  /* 2 */ val SOURCE_COLOR: SOURCE_COLOR with scala.Double = js.native
  /* 0 */ val ZERO: ZERO with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.BlendFunction with scala.Double] = js.native
}

