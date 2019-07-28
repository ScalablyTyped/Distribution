package typings.cesium.cesiumMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CesiumInspector")
@js.native
class CesiumInspector protected () extends js.Object {
  def this(container: String, scene: Scene) = this()
  def this(container: Element, scene: Scene) = this()
  var container: Element = js.native
  var viewModel: CesiumInspectorViewModel = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

