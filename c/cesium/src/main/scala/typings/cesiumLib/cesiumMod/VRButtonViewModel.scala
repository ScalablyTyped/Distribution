package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "VRButtonViewModel")
@js.native
class VRButtonViewModel protected () extends js.Object {
  def this(scene: Scene, vrElement: java.lang.String) = this()
  def this(scene: Scene, vrElement: stdLib.Element) = this()
  var command: Command = js.native
  var isVREnabled: scala.Boolean = js.native
  var isVRMode: scala.Boolean = js.native
  var tooltip: java.lang.String = js.native
  var vrElement: stdLib.Element = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
}

