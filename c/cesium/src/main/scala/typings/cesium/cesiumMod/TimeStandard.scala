package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeStandard extends js.Object

@JSImport("cesium", "TimeStandard")
@js.native
object TimeStandard extends js.Object {
  @js.native
  sealed trait TAI extends TimeStandard
  
  @js.native
  sealed trait UTC extends TimeStandard
  
  /* 1 */ val TAI: typings.cesium.cesiumMod.TimeStandard.TAI with Double = js.native
  /* 0 */ val UTC: typings.cesium.cesiumMod.TimeStandard.UTC with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeStandard with Double] = js.native
}

