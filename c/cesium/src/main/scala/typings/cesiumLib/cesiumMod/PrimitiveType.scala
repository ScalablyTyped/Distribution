package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrimitiveType extends js.Object

@JSImport("cesium", "PrimitiveType")
@js.native
object PrimitiveType extends js.Object {
  @js.native
  sealed trait LINES
    extends cesiumLib.cesiumMod.PrimitiveType
  
  @js.native
  sealed trait LINE_LOOP
    extends cesiumLib.cesiumMod.PrimitiveType
  
  @js.native
  sealed trait LINE_STRIP
    extends cesiumLib.cesiumMod.PrimitiveType
  
  @js.native
  sealed trait POINTS
    extends cesiumLib.cesiumMod.PrimitiveType
  
  @js.native
  sealed trait TRIANGLES
    extends cesiumLib.cesiumMod.PrimitiveType
  
  @js.native
  sealed trait TRIANGLE_FAN
    extends cesiumLib.cesiumMod.PrimitiveType
  
  @js.native
  sealed trait TRIANGLE_STRIP
    extends cesiumLib.cesiumMod.PrimitiveType
  
  /* 1 */ val LINES: LINES with scala.Double = js.native
  /* 2 */ val LINE_LOOP: LINE_LOOP with scala.Double = js.native
  /* 3 */ val LINE_STRIP: LINE_STRIP with scala.Double = js.native
  /* 0 */ val POINTS: POINTS with scala.Double = js.native
  /* 4 */ val TRIANGLES: TRIANGLES with scala.Double = js.native
  /* 6 */ val TRIANGLE_FAN: TRIANGLE_FAN with scala.Double = js.native
  /* 5 */ val TRIANGLE_STRIP: TRIANGLE_STRIP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.PrimitiveType with scala.Double] = js.native
}

