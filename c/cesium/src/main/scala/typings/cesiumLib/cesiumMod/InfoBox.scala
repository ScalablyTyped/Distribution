package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "InfoBox")
@js.native
class InfoBox protected () extends js.Object {
  def this(container: java.lang.String) = this()
  def this(container: stdLib.Element) = this()
  var container: stdLib.Element = js.native
  var frame: stdLib.HTMLIFrameElement = js.native
  var viewModel: InfoBoxViewModel = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
}

