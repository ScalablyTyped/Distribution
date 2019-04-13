package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CesiumInspector")
@js.native
class CesiumInspector protected () extends js.Object {
  def this(container: java.lang.String, scene: Scene) = this()
  def this(container: stdLib.Element, scene: Scene) = this()
  var container: stdLib.Element = js.native
  var viewModel: CesiumInspectorViewModel = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
}

