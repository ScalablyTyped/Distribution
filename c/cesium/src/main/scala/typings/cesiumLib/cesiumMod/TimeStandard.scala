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
  
  val TAI: TAI with java.lang.String = js.native
  val UTC: UTC with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.TimeStandard with java.lang.String] = js.native
}

