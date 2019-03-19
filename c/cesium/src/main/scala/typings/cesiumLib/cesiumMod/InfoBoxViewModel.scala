package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "InfoBoxViewModel")
@js.native
class InfoBoxViewModel ()
  extends cesiumLib.cesiumMod.CesiumNs.InfoBoxViewModel {
  /* CompleteClass */
  override var cameraClicked: cesiumLib.cesiumMod.CesiumNs.Event[js.Array[_]] = js.native
  /* CompleteClass */
  override var cameraIconPath: java.lang.String = js.native
  /* CompleteClass */
  override var closeClicked: cesiumLib.cesiumMod.CesiumNs.Event[js.Array[_]] = js.native
  /* CompleteClass */
  override var description: java.lang.String = js.native
  /* CompleteClass */
  override var enableCamera: scala.Boolean = js.native
  /* CompleteClass */
  override var isCameraTracking: scala.Boolean = js.native
  /* CompleteClass */
  override var maxHeight: scala.Double = js.native
  /* CompleteClass */
  override var showInfo: scala.Boolean = js.native
  /* CompleteClass */
  override var titleText: java.lang.String = js.native
  /* CompleteClass */
  override def maxHeightOffset(offset: scala.Double): java.lang.String = js.native
}

