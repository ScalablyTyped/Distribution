package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "InfoBoxViewModel")
@js.native
class InfoBoxViewModel () extends StObject {
  
  var cameraClicked: Event[js.Array[_]] = js.native
  
  var cameraIconPath: String = js.native
  
  var closeClicked: Event[js.Array[_]] = js.native
  
  var description: String = js.native
  
  var enableCamera: Boolean = js.native
  
  var isCameraTracking: Boolean = js.native
  
  var maxHeight: Double = js.native
  
  def maxHeightOffset(offset: Double): String = js.native
  
  var showInfo: Boolean = js.native
  
  var titleText: String = js.native
}
