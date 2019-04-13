package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "VRButton")
@js.native
class VRButton protected () extends js.Object {
  def this(container: java.lang.String, scene: Scene, vrElement: java.lang.String) = this()
  def this(container: java.lang.String, scene: Scene, vrElement: stdLib.Element) = this()
  def this(container: stdLib.Element, scene: Scene, vrElement: java.lang.String) = this()
  def this(container: stdLib.Element, scene: Scene, vrElement: stdLib.Element) = this()
  var container: stdLib.Element = js.native
  var viewModel: VRButtonViewModel = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
}

