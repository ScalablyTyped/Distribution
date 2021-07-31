package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendFunction extends StObject
@JSImport("cesium", "BlendFunction")
@js.native
object BlendFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendFunction & Double] = js.native
  
  @js.native
  sealed trait CONSTANT_ALPHA
    extends StObject
       with BlendFunction
  /* 12 */ val CONSTANT_ALPHA: typings.cesium.mod.BlendFunction.CONSTANT_ALPHA & Double = js.native
  
  @js.native
  sealed trait CONSTANT_COLOR
    extends StObject
       with BlendFunction
  /* 10 */ val CONSTANT_COLOR: typings.cesium.mod.BlendFunction.CONSTANT_COLOR & Double = js.native
  
  @js.native
  sealed trait DESTINATION_ALPHA
    extends StObject
       with BlendFunction
  /* 8 */ val DESTINATION_ALPHA: typings.cesium.mod.BlendFunction.DESTINATION_ALPHA & Double = js.native
  
  @js.native
  sealed trait DESTINATION_COLOR
    extends StObject
       with BlendFunction
  /* 4 */ val DESTINATION_COLOR: typings.cesium.mod.BlendFunction.DESTINATION_COLOR & Double = js.native
  
  @js.native
  sealed trait ONE
    extends StObject
       with BlendFunction
  /* 1 */ val ONE: typings.cesium.mod.BlendFunction.ONE & Double = js.native
  
  @js.native
  sealed trait ONE_MINUS_CONSTANT_ALPHA
    extends StObject
       with BlendFunction
  /* 13 */ val ONE_MINUS_CONSTANT_ALPHA: typings.cesium.mod.BlendFunction.ONE_MINUS_CONSTANT_ALPHA & Double = js.native
  
  @js.native
  sealed trait ONE_MINUS_CONSTANT_COLOR
    extends StObject
       with BlendFunction
  /* 11 */ val ONE_MINUS_CONSTANT_COLOR: typings.cesium.mod.BlendFunction.ONE_MINUS_CONSTANT_COLOR & Double = js.native
  
  @js.native
  sealed trait ONE_MINUS_DESTINATION_ALPHA
    extends StObject
       with BlendFunction
  /* 9 */ val ONE_MINUS_DESTINATION_ALPHA: typings.cesium.mod.BlendFunction.ONE_MINUS_DESTINATION_ALPHA & Double = js.native
  
  @js.native
  sealed trait ONE_MINUS_DESTINATION_COLOR
    extends StObject
       with BlendFunction
  /* 5 */ val ONE_MINUS_DESTINATION_COLOR: typings.cesium.mod.BlendFunction.ONE_MINUS_DESTINATION_COLOR & Double = js.native
  
  @js.native
  sealed trait ONE_MINUS_SOURCE_ALPHA
    extends StObject
       with BlendFunction
  /* 7 */ val ONE_MINUS_SOURCE_ALPHA: typings.cesium.mod.BlendFunction.ONE_MINUS_SOURCE_ALPHA & Double = js.native
  
  @js.native
  sealed trait ONE_MINUS_SOURCE_COLOR
    extends StObject
       with BlendFunction
  /* 3 */ val ONE_MINUS_SOURCE_COLOR: typings.cesium.mod.BlendFunction.ONE_MINUS_SOURCE_COLOR & Double = js.native
  
  @js.native
  sealed trait SOURCE_ALPHA
    extends StObject
       with BlendFunction
  /* 6 */ val SOURCE_ALPHA: typings.cesium.mod.BlendFunction.SOURCE_ALPHA & Double = js.native
  
  @js.native
  sealed trait SOURCE_ALPHA_SATURATE
    extends StObject
       with BlendFunction
  /* 14 */ val SOURCE_ALPHA_SATURATE: typings.cesium.mod.BlendFunction.SOURCE_ALPHA_SATURATE & Double = js.native
  
  @js.native
  sealed trait SOURCE_COLOR
    extends StObject
       with BlendFunction
  /* 2 */ val SOURCE_COLOR: typings.cesium.mod.BlendFunction.SOURCE_COLOR & Double = js.native
  
  @js.native
  sealed trait ZERO
    extends StObject
       with BlendFunction
  /* 0 */ val ZERO: typings.cesium.mod.BlendFunction.ZERO & Double = js.native
}
