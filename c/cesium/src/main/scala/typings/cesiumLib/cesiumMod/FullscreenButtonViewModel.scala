package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "FullscreenButtonViewModel")
@js.native
class FullscreenButtonViewModel () extends js.Object {
  def this(fullscreenElement: java.lang.String) = this()
  def this(fullscreenElement: stdLib.Element) = this()
  var command: Command = js.native
  var fullscreenElement: stdLib.Element = js.native
  var isFullscreen: scala.Boolean = js.native
  var isFullscreenEnabled: scala.Boolean = js.native
  var tooltip: java.lang.String = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
}

