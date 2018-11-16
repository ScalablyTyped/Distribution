package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Intersect extends js.Object

@JSImport("cesium/Cesium", "Intersect")
@js.native
object Intersect extends js.Object {
  @js.native
  sealed trait INSIDE
    extends cesiumLib.cesiumMod.CesiumNs.Intersect
  
  @js.native
  sealed trait INTERSECTING
    extends cesiumLib.cesiumMod.CesiumNs.Intersect
  
  @js.native
  sealed trait OUTSIDE
    extends cesiumLib.cesiumMod.CesiumNs.Intersect
  
}

