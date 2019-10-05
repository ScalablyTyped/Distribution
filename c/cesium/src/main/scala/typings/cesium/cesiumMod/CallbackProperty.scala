package typings.cesium.cesiumMod

import typings.cesium.cesiumMod.CallbackProperty.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CallbackProperty")
@js.native
class CallbackProperty protected () extends Property {
  def this(callback: Callback, isConstant: Boolean) = this()
  def setCallback(callback: Callback, isConstant: Boolean): Unit = js.native
}

@JSImport("cesium", "CallbackProperty")
@js.native
object CallbackProperty extends js.Object {
  type Callback = js.Function2[/* time */ js.UndefOr[JulianDate], /* result */ js.UndefOr[js.Any], js.Any]
}

