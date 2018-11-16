package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendEquation extends js.Object

@JSImport("cesium/Cesium", "BlendEquation")
@js.native
object BlendEquation extends js.Object {
  @js.native
  sealed trait ADD
    extends cesiumLib.cesiumMod.CesiumNs.BlendEquation
  
  @js.native
  sealed trait REVERSE_SUBTRACT
    extends cesiumLib.cesiumMod.CesiumNs.BlendEquation
  
  @js.native
  sealed trait SUBTRACT
    extends cesiumLib.cesiumMod.CesiumNs.BlendEquation
  
}

