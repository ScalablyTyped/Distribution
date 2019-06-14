package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeStandard extends js.Object

@JSImport("cesium", "TimeStandard")
@js.native
object TimeStandard extends js.Object {
  @js.native
  sealed trait TAI
    extends cesiumLib.cesiumMod.TimeStandard
  
  @js.native
  sealed trait UTC
    extends cesiumLib.cesiumMod.TimeStandard
  
  /* 1 */ val TAI: TAI with scala.Double = js.native
  /* 0 */ val UTC: UTC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.TimeStandard with scala.Double] = js.native
}

