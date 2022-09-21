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
  def apply(value: scala.Nothing): js.UndefOr[BlendFunction & scala.Nothing] = js.native
  
  /**
    * The blend factor is the constant alpha.
    */
  @js.native
  sealed trait CONSTANT_ALPHA
    extends StObject
       with BlendFunction
  /* WebGLConstants.CONSTANT_ALPHA */ val CONSTANT_ALPHA: typings.cesium.mod.BlendFunction.CONSTANT_ALPHA & scala.Nothing = js.native
  
  /**
    * The blend factor is the constant color.
    */
  @js.native
  sealed trait CONSTANT_COLOR
    extends StObject
       with BlendFunction
  /* WebGLConstants.CONSTANT_COLOR */ val CONSTANT_COLOR: typings.cesium.mod.BlendFunction.CONSTANT_COLOR & scala.Nothing = js.native
  
  /**
    * The blend factor is the destination alpha.
    */
  @js.native
  sealed trait DESTINATION_ALPHA
    extends StObject
       with BlendFunction
  /* WebGLConstants.DST_ALPHA */ val DESTINATION_ALPHA: typings.cesium.mod.BlendFunction.DESTINATION_ALPHA & scala.Nothing = js.native
  
  /**
    * The blend factor is the destination color.
    */
  @js.native
  sealed trait DESTINATION_COLOR
    extends StObject
       with BlendFunction
  /* WebGLConstants.DST_COLOR */ val DESTINATION_COLOR: typings.cesium.mod.BlendFunction.DESTINATION_COLOR & scala.Nothing = js.native
  
  /**
    * The blend factor is one.
    */
  @js.native
  sealed trait ONE
    extends StObject
       with BlendFunction
  /* WebGLConstants.ONE */ val ONE: typings.cesium.mod.BlendFunction.ONE & scala.Nothing = js.native
  
  /**
    * The blend factor is one minus the constant alpha.
    */
  @js.native
  sealed trait ONE_MINUS_CONSTANT_ALPHA
    extends StObject
       with BlendFunction
  /* WebGLConstants.ONE_MINUS_CONSTANT_ALPHA */ val ONE_MINUS_CONSTANT_ALPHA: typings.cesium.mod.BlendFunction.ONE_MINUS_CONSTANT_ALPHA & scala.Nothing = js.native
  
  /**
    * The blend factor is one minus the constant color.
    */
  @js.native
  sealed trait ONE_MINUS_CONSTANT_COLOR
    extends StObject
       with BlendFunction
  /* WebGLConstants.ONE_MINUS_CONSTANT_COLOR */ val ONE_MINUS_CONSTANT_COLOR: typings.cesium.mod.BlendFunction.ONE_MINUS_CONSTANT_COLOR & scala.Nothing = js.native
  
  /**
    * The blend factor is one minus the destination alpha.
    */
  @js.native
  sealed trait ONE_MINUS_DESTINATION_ALPHA
    extends StObject
       with BlendFunction
  /* WebGLConstants.ONE_MINUS_DST_ALPHA */ val ONE_MINUS_DESTINATION_ALPHA: typings.cesium.mod.BlendFunction.ONE_MINUS_DESTINATION_ALPHA & scala.Nothing = js.native
  
  /**
    * The blend factor is one minus the destination color.
    */
  @js.native
  sealed trait ONE_MINUS_DESTINATION_COLOR
    extends StObject
       with BlendFunction
  /* WebGLConstants.ONE_MINUS_DST_COLOR */ val ONE_MINUS_DESTINATION_COLOR: typings.cesium.mod.BlendFunction.ONE_MINUS_DESTINATION_COLOR & scala.Nothing = js.native
  
  /**
    * The blend factor is one minus the source alpha.
    */
  @js.native
  sealed trait ONE_MINUS_SOURCE_ALPHA
    extends StObject
       with BlendFunction
  /* WebGLConstants.ONE_MINUS_SRC_ALPHA */ val ONE_MINUS_SOURCE_ALPHA: typings.cesium.mod.BlendFunction.ONE_MINUS_SOURCE_ALPHA & scala.Nothing = js.native
  
  /**
    * The blend factor is one minus the source color.
    */
  @js.native
  sealed trait ONE_MINUS_SOURCE_COLOR
    extends StObject
       with BlendFunction
  /* WebGLConstants.ONE_MINUS_SRC_COLOR */ val ONE_MINUS_SOURCE_COLOR: typings.cesium.mod.BlendFunction.ONE_MINUS_SOURCE_COLOR & scala.Nothing = js.native
  
  /**
    * The blend factor is the source alpha.
    */
  @js.native
  sealed trait SOURCE_ALPHA
    extends StObject
       with BlendFunction
  /* WebGLConstants.SRC_ALPHA */ val SOURCE_ALPHA: typings.cesium.mod.BlendFunction.SOURCE_ALPHA & scala.Nothing = js.native
  
  /**
    * The blend factor is the saturated source alpha.
    */
  @js.native
  sealed trait SOURCE_ALPHA_SATURATE
    extends StObject
       with BlendFunction
  /* WebGLConstants.SRC_ALPHA_SATURATE */ val SOURCE_ALPHA_SATURATE: typings.cesium.mod.BlendFunction.SOURCE_ALPHA_SATURATE & scala.Nothing = js.native
  
  /**
    * The blend factor is the source color.
    */
  @js.native
  sealed trait SOURCE_COLOR
    extends StObject
       with BlendFunction
  /* WebGLConstants.SRC_COLOR */ val SOURCE_COLOR: typings.cesium.mod.BlendFunction.SOURCE_COLOR & scala.Nothing = js.native
  
  /**
    * The blend factor is zero.
    */
  @js.native
  sealed trait ZERO
    extends StObject
       with BlendFunction
  /* WebGLConstants.ZERO */ val ZERO: typings.cesium.mod.BlendFunction.ZERO & scala.Nothing = js.native
}
