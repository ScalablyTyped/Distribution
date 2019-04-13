package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "FullscreenButton")
@js.native
class FullscreenButton protected () extends js.Object {
  def this(container: java.lang.String) = this()
  def this(container: stdLib.Element) = this()
  def this(container: java.lang.String, fullscreenElement: java.lang.String) = this()
  def this(container: java.lang.String, fullscreenElement: stdLib.Element) = this()
  def this(container: stdLib.Element, fullscreenElement: java.lang.String) = this()
  def this(container: stdLib.Element, fullscreenElement: stdLib.Element) = this()
  var container: stdLib.Element = js.native
  var viewModel: FullscreenButtonViewModel = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
}

