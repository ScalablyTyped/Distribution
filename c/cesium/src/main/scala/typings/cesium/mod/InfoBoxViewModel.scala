package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "InfoBoxViewModel")
@js.native
class InfoBoxViewModel () extends js.Object {
  var cameraClicked: Event[js.Array[_]] = js.native
  var cameraIconPath: String = js.native
  var closeClicked: Event[js.Array[_]] = js.native
  var description: String = js.native
  var enableCamera: Boolean = js.native
  var isCameraTracking: Boolean = js.native
  var maxHeight: Double = js.native
  var showInfo: Boolean = js.native
  var titleText: String = js.native
  def maxHeightOffset(offset: Double): String = js.native
}

