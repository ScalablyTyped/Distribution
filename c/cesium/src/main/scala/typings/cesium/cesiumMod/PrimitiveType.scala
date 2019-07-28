package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrimitiveType extends js.Object

@JSImport("cesium", "PrimitiveType")
@js.native
object PrimitiveType extends js.Object {
  @js.native
  sealed trait LINES extends PrimitiveType
  
  @js.native
  sealed trait LINE_LOOP extends PrimitiveType
  
  @js.native
  sealed trait LINE_STRIP extends PrimitiveType
  
  @js.native
  sealed trait POINTS extends PrimitiveType
  
  @js.native
  sealed trait TRIANGLES extends PrimitiveType
  
  @js.native
  sealed trait TRIANGLE_FAN extends PrimitiveType
  
  @js.native
  sealed trait TRIANGLE_STRIP extends PrimitiveType
  
  /* 1 */ val LINES: typings.cesium.cesiumMod.PrimitiveType.LINES with Double = js.native
  /* 2 */ val LINE_LOOP: typings.cesium.cesiumMod.PrimitiveType.LINE_LOOP with Double = js.native
  /* 3 */ val LINE_STRIP: typings.cesium.cesiumMod.PrimitiveType.LINE_STRIP with Double = js.native
  /* 0 */ val POINTS: typings.cesium.cesiumMod.PrimitiveType.POINTS with Double = js.native
  /* 4 */ val TRIANGLES: typings.cesium.cesiumMod.PrimitiveType.TRIANGLES with Double = js.native
  /* 6 */ val TRIANGLE_FAN: typings.cesium.cesiumMod.PrimitiveType.TRIANGLE_FAN with Double = js.native
  /* 5 */ val TRIANGLE_STRIP: typings.cesium.cesiumMod.PrimitiveType.TRIANGLE_STRIP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrimitiveType with Double] = js.native
}

