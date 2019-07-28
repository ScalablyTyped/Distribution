package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Iso8601 extends js.Object

@JSImport("cesium", "Iso8601")
@js.native
object Iso8601 extends js.Object {
  @js.native
  sealed trait MAXIMUM_INTERVAL extends Iso8601
  
  @js.native
  sealed trait MAXIMUM_VALUE extends Iso8601
  
  @js.native
  sealed trait MINIMUM_VALUE extends Iso8601
  
  /* 2 */ val MAXIMUM_INTERVAL: typings.cesium.cesiumMod.Iso8601.MAXIMUM_INTERVAL with Double = js.native
  /* 1 */ val MAXIMUM_VALUE: typings.cesium.cesiumMod.Iso8601.MAXIMUM_VALUE with Double = js.native
  /* 0 */ val MINIMUM_VALUE: typings.cesium.cesiumMod.Iso8601.MINIMUM_VALUE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Iso8601 with Double] = js.native
}

