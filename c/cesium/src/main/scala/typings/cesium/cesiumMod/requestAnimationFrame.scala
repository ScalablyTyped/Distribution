package typings.cesium.cesiumMod

import typings.cesium.cesiumMod.requestAnimationFrame.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "requestAnimationFrame")
@js.native
object requestAnimationFrame extends js.Object {
  def apply(callback: Callback): Double = js.native
  type Callback = js.Function1[/* timestamp */ Double, Unit]
}

