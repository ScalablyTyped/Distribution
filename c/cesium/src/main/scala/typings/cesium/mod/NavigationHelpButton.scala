package typings.cesium.mod

import typings.cesium.anon.InstructionsInitiallyVisible
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "NavigationHelpButton")
@js.native
class NavigationHelpButton protected () extends js.Object {
  def this(options: InstructionsInitiallyVisible) = this()
  var container: Element = js.native
  var viewModel: NavigationHelpButtonViewModel = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

