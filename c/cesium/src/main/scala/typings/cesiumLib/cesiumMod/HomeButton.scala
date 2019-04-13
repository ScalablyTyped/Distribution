package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "HomeButton")
@js.native
class HomeButton protected () extends js.Object {
  def this(container: java.lang.String, scene: Scene) = this()
  def this(container: stdLib.Element, scene: Scene) = this()
  def this(container: java.lang.String, scene: Scene, duration: scala.Double) = this()
  def this(container: stdLib.Element, scene: Scene, duration: scala.Double) = this()
  var container: stdLib.Element = js.native
  var viewModel: HomeButtonViewModel = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
}

