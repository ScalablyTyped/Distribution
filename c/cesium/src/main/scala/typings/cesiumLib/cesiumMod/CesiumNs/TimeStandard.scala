package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeStandard extends js.Object

@JSImport("cesium/Cesium", "TimeStandard")
@js.native
object TimeStandard extends js.Object {
  @js.native
  sealed trait TAI
    extends cesiumLib.cesiumMod.CesiumNs.TimeStandard
  
  @js.native
  sealed trait UTC
    extends cesiumLib.cesiumMod.CesiumNs.TimeStandard
  
}

