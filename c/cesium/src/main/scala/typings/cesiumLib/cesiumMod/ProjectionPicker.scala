package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ProjectionPicker")
@js.native
class ProjectionPicker protected () extends js.Object {
  def this(container: java.lang.String, scene: Scene) = this()
  def this(container: stdLib.Element, scene: Scene) = this()
  var container: stdLib.Element = js.native
  var viewModel: ProjectionPickerViewModel = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
}

