package typings.cesium.cesiumMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "FullscreenButtonViewModel")
@js.native
class FullscreenButtonViewModel () extends js.Object {
  def this(fullscreenElement: String) = this()
  def this(fullscreenElement: Element) = this()
  var command: Command = js.native
  var fullscreenElement: Element = js.native
  var isFullscreen: Boolean = js.native
  var isFullscreenEnabled: Boolean = js.native
  var tooltip: String = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

