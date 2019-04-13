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
  
  val LINES: LINES with java.lang.String = js.native
  val LINE_LOOP: LINE_LOOP with java.lang.String = js.native
  val LINE_STRIP: LINE_STRIP with java.lang.String = js.native
  val POINTS: POINTS with java.lang.String = js.native
  val TRIANGLES: TRIANGLES with java.lang.String = js.native
  val TRIANGLE_FAN: TRIANGLE_FAN with java.lang.String = js.native
  val TRIANGLE_STRIP: TRIANGLE_STRIP with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.PrimitiveType with java.lang.String] = js.native
}

