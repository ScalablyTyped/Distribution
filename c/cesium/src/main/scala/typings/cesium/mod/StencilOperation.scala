package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StencilOperation extends StObject
@JSImport("cesium", "StencilOperation")
@js.native
object StencilOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[StencilOperation & scala.Nothing] = js.native
  
  /**
    * Decrements the stencil buffer value, clamping to zero.
    */
  @js.native
  sealed trait DECREMENT
    extends StObject
       with StencilOperation
  /* WebGLConstants.DECR */ val DECREMENT: typings.cesium.mod.StencilOperation.DECREMENT & scala.Nothing = js.native
  
  /**
    * Decrements the stencil buffer value, wrapping to the maximum unsigned byte instead of going below zero.
    */
  @js.native
  sealed trait DECREMENT_WRAP
    extends StObject
       with StencilOperation
  /* WebGLConstants.DECR_WRAP */ val DECREMENT_WRAP: typings.cesium.mod.StencilOperation.DECREMENT_WRAP & scala.Nothing = js.native
  
  /**
    * Increments the stencil buffer value, clamping to unsigned byte.
    */
  @js.native
  sealed trait INCREMENT
    extends StObject
       with StencilOperation
  /* WebGLConstants.INCR */ val INCREMENT: typings.cesium.mod.StencilOperation.INCREMENT & scala.Nothing = js.native
  
  /**
    * Increments the stencil buffer value, wrapping to zero when exceeding the unsigned byte range.
    */
  @js.native
  sealed trait INCREMENT_WRAP
    extends StObject
       with StencilOperation
  /* WebGLConstants.INCR_WRAP */ val INCREMENT_WRAP: typings.cesium.mod.StencilOperation.INCREMENT_WRAP & scala.Nothing = js.native
  
  /**
    * Bitwise inverts the existing stencil buffer value.
    */
  @js.native
  sealed trait INVERT
    extends StObject
       with StencilOperation
  /* WebGLConstants.INVERT */ val INVERT: typings.cesium.mod.StencilOperation.INVERT & scala.Nothing = js.native
  
  /**
    * Does not change the stencil buffer.
    */
  @js.native
  sealed trait KEEP
    extends StObject
       with StencilOperation
  /* WebGLConstants.KEEP */ val KEEP: typings.cesium.mod.StencilOperation.KEEP & scala.Nothing = js.native
  
  /**
    * Replaces the stencil buffer value with the reference value.
    */
  @js.native
  sealed trait REPLACE
    extends StObject
       with StencilOperation
  /* WebGLConstants.REPLACE */ val REPLACE: typings.cesium.mod.StencilOperation.REPLACE & scala.Nothing = js.native
  
  /**
    * Sets the stencil buffer value to zero.
    */
  @js.native
  sealed trait ZERO
    extends StObject
       with StencilOperation
  /* WebGLConstants.ZERO */ val ZERO: typings.cesium.mod.StencilOperation.ZERO & scala.Nothing = js.native
}
