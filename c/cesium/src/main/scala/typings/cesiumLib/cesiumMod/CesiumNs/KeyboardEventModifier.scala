package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyboardEventModifier extends js.Object

@JSImport("cesium/Cesium", "KeyboardEventModifier")
@js.native
object KeyboardEventModifier extends js.Object {
  @js.native
  sealed trait ALT
    extends cesiumLib.cesiumMod.CesiumNs.KeyboardEventModifier
  
  @js.native
  sealed trait CTRL
    extends cesiumLib.cesiumMod.CesiumNs.KeyboardEventModifier
  
  @js.native
  sealed trait SHIFT
    extends cesiumLib.cesiumMod.CesiumNs.KeyboardEventModifier
  
}

