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
  def apply(value: Double): js.UndefOr[StencilOperation & Double] = js.native
  
  @js.native
  sealed trait DECREMENT
    extends StObject
       with StencilOperation
  /* 4 */ val DECREMENT: typings.cesium.mod.StencilOperation.DECREMENT & Double = js.native
  
  @js.native
  sealed trait DECREMENT_WRAP
    extends StObject
       with StencilOperation
  /* 7 */ val DECREMENT_WRAP: typings.cesium.mod.StencilOperation.DECREMENT_WRAP & Double = js.native
  
  @js.native
  sealed trait INCREMENT
    extends StObject
       with StencilOperation
  /* 3 */ val INCREMENT: typings.cesium.mod.StencilOperation.INCREMENT & Double = js.native
  
  @js.native
  sealed trait INCREMENT_WRAP
    extends StObject
       with StencilOperation
  /* 6 */ val INCREMENT_WRAP: typings.cesium.mod.StencilOperation.INCREMENT_WRAP & Double = js.native
  
  @js.native
  sealed trait INVERT
    extends StObject
       with StencilOperation
  /* 5 */ val INVERT: typings.cesium.mod.StencilOperation.INVERT & Double = js.native
  
  @js.native
  sealed trait KEEP
    extends StObject
       with StencilOperation
  /* 1 */ val KEEP: typings.cesium.mod.StencilOperation.KEEP & Double = js.native
  
  @js.native
  sealed trait REPLACE
    extends StObject
       with StencilOperation
  /* 2 */ val REPLACE: typings.cesium.mod.StencilOperation.REPLACE & Double = js.native
  
  @js.native
  sealed trait ZERO
    extends StObject
       with StencilOperation
  /* 0 */ val ZERO: typings.cesium.mod.StencilOperation.ZERO & Double = js.native
}
