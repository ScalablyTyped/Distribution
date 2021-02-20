package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendFunction extends StObject
@JSImport("cesium", "BlendFunction")
@js.native
object BlendFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendFunction with Double] = js.native
  
  @js.native
  sealed trait CONSTANT_ALPHA extends BlendFunction
  /* 12 */ val CONSTANT_ALPHA: typings.cesium.mod.BlendFunction.CONSTANT_ALPHA with Double = js.native
  
  @js.native
  sealed trait CONSTANT_COLOR extends BlendFunction
  /* 10 */ val CONSTANT_COLOR: typings.cesium.mod.BlendFunction.CONSTANT_COLOR with Double = js.native
  
  @js.native
  sealed trait DESTINATION_ALPHA extends BlendFunction
  /* 8 */ val DESTINATION_ALPHA: typings.cesium.mod.BlendFunction.DESTINATION_ALPHA with Double = js.native
  
  @js.native
  sealed trait DESTINATION_COLOR extends BlendFunction
  /* 4 */ val DESTINATION_COLOR: typings.cesium.mod.BlendFunction.DESTINATION_COLOR with Double = js.native
  
  @js.native
  sealed trait ONE extends BlendFunction
  /* 1 */ val ONE: typings.cesium.mod.BlendFunction.ONE with Double = js.native
  
  @js.native
  sealed trait ONE_MINUS_CONSTANT_ALPHA extends BlendFunction
  /* 13 */ val ONE_MINUS_CONSTANT_ALPHA: typings.cesium.mod.BlendFunction.ONE_MINUS_CONSTANT_ALPHA with Double = js.native
  
  @js.native
  sealed trait ONE_MINUS_CONSTANT_COLOR extends BlendFunction
  /* 11 */ val ONE_MINUS_CONSTANT_COLOR: typings.cesium.mod.BlendFunction.ONE_MINUS_CONSTANT_COLOR with Double = js.native
  
  @js.native
  sealed trait ONE_MINUS_DESTINATION_ALPHA extends BlendFunction
  /* 9 */ val ONE_MINUS_DESTINATION_ALPHA: typings.cesium.mod.BlendFunction.ONE_MINUS_DESTINATION_ALPHA with Double = js.native
  
  @js.native
  sealed trait ONE_MINUS_DESTINATION_COLOR extends BlendFunction
  /* 5 */ val ONE_MINUS_DESTINATION_COLOR: typings.cesium.mod.BlendFunction.ONE_MINUS_DESTINATION_COLOR with Double = js.native
  
  @js.native
  sealed trait ONE_MINUS_SOURCE_ALPHA extends BlendFunction
  /* 7 */ val ONE_MINUS_SOURCE_ALPHA: typings.cesium.mod.BlendFunction.ONE_MINUS_SOURCE_ALPHA with Double = js.native
  
  @js.native
  sealed trait ONE_MINUS_SOURCE_COLOR extends BlendFunction
  /* 3 */ val ONE_MINUS_SOURCE_COLOR: typings.cesium.mod.BlendFunction.ONE_MINUS_SOURCE_COLOR with Double = js.native
  
  @js.native
  sealed trait SOURCE_ALPHA extends BlendFunction
  /* 6 */ val SOURCE_ALPHA: typings.cesium.mod.BlendFunction.SOURCE_ALPHA with Double = js.native
  
  @js.native
  sealed trait SOURCE_ALPHA_SATURATE extends BlendFunction
  /* 14 */ val SOURCE_ALPHA_SATURATE: typings.cesium.mod.BlendFunction.SOURCE_ALPHA_SATURATE with Double = js.native
  
  @js.native
  sealed trait SOURCE_COLOR extends BlendFunction
  /* 2 */ val SOURCE_COLOR: typings.cesium.mod.BlendFunction.SOURCE_COLOR with Double = js.native
  
  @js.native
  sealed trait ZERO extends BlendFunction
  /* 0 */ val ZERO: typings.cesium.mod.BlendFunction.ZERO with Double = js.native
}
