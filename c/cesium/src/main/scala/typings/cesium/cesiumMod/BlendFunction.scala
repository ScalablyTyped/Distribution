package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendFunction extends js.Object

@JSImport("cesium", "BlendFunction")
@js.native
object BlendFunction extends js.Object {
  @js.native
  sealed trait CONSTANT_ALPHA extends BlendFunction
  
  @js.native
  sealed trait CONSTANT_COLOR extends BlendFunction
  
  @js.native
  sealed trait DESTINATION_ALPHA extends BlendFunction
  
  @js.native
  sealed trait DESTINATION_COLOR extends BlendFunction
  
  @js.native
  sealed trait ONE extends BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_CONSTANT_ALPHA extends BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_CONSTANT_COLOR extends BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_DESTINATION_ALPHA extends BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_DESTINATION_COLOR extends BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_SOURCE_ALPHA extends BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_SOURCE_COLOR extends BlendFunction
  
  @js.native
  sealed trait SOURCE_ALPHA extends BlendFunction
  
  @js.native
  sealed trait SOURCE_ALPHA_SATURATE extends BlendFunction
  
  @js.native
  sealed trait SOURCE_COLOR extends BlendFunction
  
  @js.native
  sealed trait ZERO extends BlendFunction
  
  /* 12 */ val CONSTANT_ALPHA: typings.cesium.cesiumMod.BlendFunction.CONSTANT_ALPHA with Double = js.native
  /* 10 */ val CONSTANT_COLOR: typings.cesium.cesiumMod.BlendFunction.CONSTANT_COLOR with Double = js.native
  /* 8 */ val DESTINATION_ALPHA: typings.cesium.cesiumMod.BlendFunction.DESTINATION_ALPHA with Double = js.native
  /* 4 */ val DESTINATION_COLOR: typings.cesium.cesiumMod.BlendFunction.DESTINATION_COLOR with Double = js.native
  /* 1 */ val ONE: typings.cesium.cesiumMod.BlendFunction.ONE with Double = js.native
  /* 13 */ val ONE_MINUS_CONSTANT_ALPHA: typings.cesium.cesiumMod.BlendFunction.ONE_MINUS_CONSTANT_ALPHA with Double = js.native
  /* 11 */ val ONE_MINUS_CONSTANT_COLOR: typings.cesium.cesiumMod.BlendFunction.ONE_MINUS_CONSTANT_COLOR with Double = js.native
  /* 9 */ val ONE_MINUS_DESTINATION_ALPHA: typings.cesium.cesiumMod.BlendFunction.ONE_MINUS_DESTINATION_ALPHA with Double = js.native
  /* 5 */ val ONE_MINUS_DESTINATION_COLOR: typings.cesium.cesiumMod.BlendFunction.ONE_MINUS_DESTINATION_COLOR with Double = js.native
  /* 7 */ val ONE_MINUS_SOURCE_ALPHA: typings.cesium.cesiumMod.BlendFunction.ONE_MINUS_SOURCE_ALPHA with Double = js.native
  /* 3 */ val ONE_MINUS_SOURCE_COLOR: typings.cesium.cesiumMod.BlendFunction.ONE_MINUS_SOURCE_COLOR with Double = js.native
  /* 6 */ val SOURCE_ALPHA: typings.cesium.cesiumMod.BlendFunction.SOURCE_ALPHA with Double = js.native
  /* 14 */ val SOURCE_ALPHA_SATURATE: typings.cesium.cesiumMod.BlendFunction.SOURCE_ALPHA_SATURATE with Double = js.native
  /* 2 */ val SOURCE_COLOR: typings.cesium.cesiumMod.BlendFunction.SOURCE_COLOR with Double = js.native
  /* 0 */ val ZERO: typings.cesium.cesiumMod.BlendFunction.ZERO with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendFunction with Double] = js.native
}

