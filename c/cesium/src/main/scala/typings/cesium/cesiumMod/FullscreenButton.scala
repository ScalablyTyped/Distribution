package typings.cesium.cesiumMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "FullscreenButton")
@js.native
class FullscreenButton protected () extends js.Object {
  def this(container: String) = this()
  def this(container: Element) = this()
  def this(container: String, fullscreenElement: String) = this()
  def this(container: String, fullscreenElement: Element) = this()
  def this(container: Element, fullscreenElement: String) = this()
  def this(container: Element, fullscreenElement: Element) = this()
  var container: Element = js.native
  var viewModel: FullscreenButtonViewModel = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

