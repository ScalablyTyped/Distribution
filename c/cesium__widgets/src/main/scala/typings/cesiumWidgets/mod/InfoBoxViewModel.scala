package typings.cesiumWidgets.mod

import typings.cesiumEngine.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/widgets", "InfoBoxViewModel")
@js.native
open class InfoBoxViewModel () extends StObject {
  
  /**
    * Gets an {@link Event} that is fired when the user clicks the camera icon.
    */
  var cameraClicked: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets the SVG path of the camera icon, which can change to be "crossed out" or not.
    */
  var cameraIconPath: String = js.native
  
  /**
    * Gets an {@link Event} that is fired when the user closes the info box.
    */
  var closeClicked: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets the description HTML for the info box.
    */
  var description: String = js.native
  
  /**
    * Gets or sets whether the camera tracking icon is enabled.
    */
  var enableCamera: Boolean = js.native
  
  /**
    * Gets or sets the status of current camera tracking of the selected object.
    */
  var isCameraTracking: Boolean = js.native
  
  /**
    * Gets or sets the maximum height of the info box in pixels.  This property is observable.
    */
  var maxHeight: Double = js.native
  
  /**
    * Gets the maximum height of sections within the info box, minus an offset, in CSS-ready form.
    * @param offset - The offset in pixels.
    */
  def maxHeightOffset(offset: Double): String = js.native
  
  /**
    * Gets or sets the visibility of the info box.
    */
  var showInfo: Boolean = js.native
  
  /**
    * Gets or sets the title text in the info box.
    */
  var titleText: String = js.native
}
