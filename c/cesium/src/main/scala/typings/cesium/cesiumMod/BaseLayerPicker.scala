package typings.cesium.cesiumMod

import typings.cesium.Anon_Globe
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BaseLayerPicker")
@js.native
class BaseLayerPicker protected () extends js.Object {
  def this(container: Element, options: Anon_Globe) = this()
  var container: Element = js.native
  var viewModel: BaseLayerPickerViewModel = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

