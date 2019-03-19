package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoBoxViewModel extends js.Object {
  var cameraClicked: Event[js.Array[_]]
  var cameraIconPath: java.lang.String
  var closeClicked: Event[js.Array[_]]
  var description: java.lang.String
  var enableCamera: scala.Boolean
  var isCameraTracking: scala.Boolean
  var maxHeight: scala.Double
  var showInfo: scala.Boolean
  var titleText: java.lang.String
  def maxHeightOffset(offset: scala.Double): java.lang.String
}

object InfoBoxViewModel {
  @scala.inline
  def apply(
    cameraClicked: Event[js.Array[_]],
    cameraIconPath: java.lang.String,
    closeClicked: Event[js.Array[_]],
    description: java.lang.String,
    enableCamera: scala.Boolean,
    isCameraTracking: scala.Boolean,
    maxHeight: scala.Double,
    maxHeightOffset: scala.Double => java.lang.String,
    showInfo: scala.Boolean,
    titleText: java.lang.String
  ): InfoBoxViewModel = {
    val __obj = js.Dynamic.literal(cameraClicked = cameraClicked, cameraIconPath = cameraIconPath, closeClicked = closeClicked, description = description, enableCamera = enableCamera, isCameraTracking = isCameraTracking, maxHeight = maxHeight, maxHeightOffset = js.Any.fromFunction1(maxHeightOffset), showInfo = showInfo, titleText = titleText)
  
    __obj.asInstanceOf[InfoBoxViewModel]
  }
}

