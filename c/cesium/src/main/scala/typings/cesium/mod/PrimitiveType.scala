package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrimitiveType extends StObject
@JSImport("cesium", "PrimitiveType")
@js.native
object PrimitiveType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrimitiveType & Double] = js.native
  
  @js.native
  sealed trait LINES
    extends StObject
       with PrimitiveType
  /* 1 */ val LINES: typings.cesium.mod.PrimitiveType.LINES & Double = js.native
  
  @js.native
  sealed trait LINE_LOOP
    extends StObject
       with PrimitiveType
  /* 2 */ val LINE_LOOP: typings.cesium.mod.PrimitiveType.LINE_LOOP & Double = js.native
  
  @js.native
  sealed trait LINE_STRIP
    extends StObject
       with PrimitiveType
  /* 3 */ val LINE_STRIP: typings.cesium.mod.PrimitiveType.LINE_STRIP & Double = js.native
  
  @js.native
  sealed trait POINTS
    extends StObject
       with PrimitiveType
  /* 0 */ val POINTS: typings.cesium.mod.PrimitiveType.POINTS & Double = js.native
  
  @js.native
  sealed trait TRIANGLES
    extends StObject
       with PrimitiveType
  /* 4 */ val TRIANGLES: typings.cesium.mod.PrimitiveType.TRIANGLES & Double = js.native
  
  @js.native
  sealed trait TRIANGLE_FAN
    extends StObject
       with PrimitiveType
  /* 6 */ val TRIANGLE_FAN: typings.cesium.mod.PrimitiveType.TRIANGLE_FAN & Double = js.native
  
  @js.native
  sealed trait TRIANGLE_STRIP
    extends StObject
       with PrimitiveType
  /* 5 */ val TRIANGLE_STRIP: typings.cesium.mod.PrimitiveType.TRIANGLE_STRIP & Double = js.native
}
