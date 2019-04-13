package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "InfoBoxViewModel")
@js.native
class InfoBoxViewModel () extends js.Object {
  var cameraClicked: Event[js.Array[_]] = js.native
  var cameraIconPath: java.lang.String = js.native
  var closeClicked: Event[js.Array[_]] = js.native
  var description: java.lang.String = js.native
  var enableCamera: scala.Boolean = js.native
  var isCameraTracking: scala.Boolean = js.native
  var maxHeight: scala.Double = js.native
  var showInfo: scala.Boolean = js.native
  var titleText: java.lang.String = js.native
  def maxHeightOffset(offset: scala.Double): java.lang.String = js.native
}

