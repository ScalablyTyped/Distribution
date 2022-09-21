package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StencilFunction extends StObject
@JSImport("cesium", "StencilFunction")
@js.native
object StencilFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[StencilFunction & scala.Nothing] = js.native
  
  /**
    * The stencil test always passes.
    */
  @js.native
  sealed trait ALWAYS
    extends StObject
       with StencilFunction
  /* WebGLConstants.ALWAYS */ val ALWAYS: typings.cesium.mod.StencilFunction.ALWAYS & scala.Nothing = js.native
  
  /**
    * The stencil test passes when the masked reference value is equal to the masked stencil value.
    */
  @js.native
  sealed trait EQUAL
    extends StObject
       with StencilFunction
  /* WebGLConstants.EQUAL */ val EQUAL: typings.cesium.mod.StencilFunction.EQUAL & scala.Nothing = js.native
  
  /**
    * The stencil test passes when the masked reference value is greater than the masked stencil value.
    */
  @js.native
  sealed trait GREATER
    extends StObject
       with StencilFunction
  /* WebGLConstants.GREATER */ val GREATER: typings.cesium.mod.StencilFunction.GREATER & scala.Nothing = js.native
  
  /**
    * The stencil test passes when the masked reference value is greater than or equal to the masked stencil value.
    */
  @js.native
  sealed trait GREATER_OR_EQUAL
    extends StObject
       with StencilFunction
  /* WebGLConstants.GEQUAL */ val GREATER_OR_EQUAL: typings.cesium.mod.StencilFunction.GREATER_OR_EQUAL & scala.Nothing = js.native
  
  /**
    * The stencil test passes when the masked reference value is less than the masked stencil value.
    */
  @js.native
  sealed trait LESS
    extends StObject
       with StencilFunction
  /* WebGLConstants.LESS */ val LESS: typings.cesium.mod.StencilFunction.LESS & scala.Nothing = js.native
  
  /**
    * The stencil test passes when the masked reference value is less than or equal to the masked stencil value.
    */
  @js.native
  sealed trait LESS_OR_EQUAL
    extends StObject
       with StencilFunction
  /* WebGLConstants.LEQUAL */ val LESS_OR_EQUAL: typings.cesium.mod.StencilFunction.LESS_OR_EQUAL & scala.Nothing = js.native
  
  /**
    * The stencil test never passes.
    */
  @js.native
  sealed trait NEVER
    extends StObject
       with StencilFunction
  /* WebGLConstants.NEVER */ val NEVER: typings.cesium.mod.StencilFunction.NEVER & scala.Nothing = js.native
  
  /**
    * The stencil test passes when the masked reference value is not equal to the masked stencil value.
    */
  @js.native
  sealed trait NOT_EQUAL
    extends StObject
       with StencilFunction
  /* WebGLConstants.NOTEQUAL */ val NOT_EQUAL: typings.cesium.mod.StencilFunction.NOT_EQUAL & scala.Nothing = js.native
}
