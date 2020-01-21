package typings.cesium.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "VRButton")
@js.native
class VRButton protected () extends js.Object {
  def this(container: String, scene: Scene, vrElement: String) = this()
  def this(container: String, scene: Scene, vrElement: Element) = this()
  def this(container: Element, scene: Scene, vrElement: String) = this()
  def this(container: Element, scene: Scene, vrElement: Element) = this()
  var container: Element = js.native
  var viewModel: VRButtonViewModel = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

