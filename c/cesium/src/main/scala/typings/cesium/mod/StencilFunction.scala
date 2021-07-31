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
  def apply(value: Double): js.UndefOr[StencilFunction & Double] = js.native
  
  @js.native
  sealed trait ALWAYS
    extends StObject
       with StencilFunction
  /* 7 */ val ALWAYS: typings.cesium.mod.StencilFunction.ALWAYS & Double = js.native
  
  @js.native
  sealed trait EQUAL
    extends StObject
       with StencilFunction
  /* 2 */ val EQUAL: typings.cesium.mod.StencilFunction.EQUAL & Double = js.native
  
  @js.native
  sealed trait GREATER
    extends StObject
       with StencilFunction
  /* 4 */ val GREATER: typings.cesium.mod.StencilFunction.GREATER & Double = js.native
  
  @js.native
  sealed trait GREATER_OR_EQUAL
    extends StObject
       with StencilFunction
  /* 6 */ val GREATER_OR_EQUAL: typings.cesium.mod.StencilFunction.GREATER_OR_EQUAL & Double = js.native
  
  @js.native
  sealed trait LESS
    extends StObject
       with StencilFunction
  /* 1 */ val LESS: typings.cesium.mod.StencilFunction.LESS & Double = js.native
  
  @js.native
  sealed trait LESS_OR_EQUAL
    extends StObject
       with StencilFunction
  /* 3 */ val LESS_OR_EQUAL: typings.cesium.mod.StencilFunction.LESS_OR_EQUAL & Double = js.native
  
  @js.native
  sealed trait NEVER
    extends StObject
       with StencilFunction
  /* 0 */ val NEVER: typings.cesium.mod.StencilFunction.NEVER & Double = js.native
  
  @js.native
  sealed trait NOT_EQUAL
    extends StObject
       with StencilFunction
  /* 5 */ val NOT_EQUAL: typings.cesium.mod.StencilFunction.NOT_EQUAL & Double = js.native
}
