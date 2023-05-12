package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendEquation extends StObject
@JSImport("@cesium/engine", "BlendEquation")
@js.native
object BlendEquation extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[BlendEquation & scala.Nothing] = js.native
  
  /**
    * Pixel values are added componentwise.  This is used in additive blending for translucency.
    */
  @js.native
  sealed trait ADD
    extends StObject
       with BlendEquation
  /* WebGLConstants.FUNC_ADD */ val ADD: typings.cesiumEngine.mod.BlendEquation.ADD & scala.Nothing = js.native
  
  /**
    * Pixel values are given to the maximum function (max(source, destination)).
    *
    * This equation operates on each pixel color component.
    */
  @js.native
  sealed trait MAX
    extends StObject
       with BlendEquation
  /* WebGLConstants.MAX */ val MAX: typings.cesiumEngine.mod.BlendEquation.MAX & scala.Nothing = js.native
  
  /**
    * Pixel values are given to the minimum function (min(source, destination)).
    *
    * This equation operates on each pixel color component.
    */
  @js.native
  sealed trait MIN
    extends StObject
       with BlendEquation
  /* WebGLConstants.MIN */ val MIN: typings.cesiumEngine.mod.BlendEquation.MIN & scala.Nothing = js.native
  
  /**
    * Pixel values are subtracted componentwise (destination - source).
    */
  @js.native
  sealed trait REVERSE_SUBTRACT
    extends StObject
       with BlendEquation
  /* WebGLConstants.FUNC_REVERSE_SUBTRACT */ val REVERSE_SUBTRACT: typings.cesiumEngine.mod.BlendEquation.REVERSE_SUBTRACT & scala.Nothing = js.native
  
  /**
    * Pixel values are subtracted componentwise (source - destination).  This is used in alpha blending for translucency.
    */
  @js.native
  sealed trait SUBTRACT
    extends StObject
       with BlendEquation
  /* WebGLConstants.FUNC_SUBTRACT */ val SUBTRACT: typings.cesiumEngine.mod.BlendEquation.SUBTRACT & scala.Nothing = js.native
}
