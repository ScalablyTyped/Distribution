package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "NavigationHelpButtonViewModel")
@js.native
open class NavigationHelpButtonViewModel () extends StObject {
  
  /**
    * Gets the Command that is executed when the button is clicked.
    */
  var command: Command = js.native
  
  /**
    * Gets the Command that is executed when the mouse instructions should be shown.
    */
  var showClick: Command = js.native
  
  /**
    * Gets or sets whether the instructions are currently shown.  This property is observable.
    */
  var showInstructions: Boolean = js.native
  
  /**
    * Gets the Command that is executed when the touch instructions should be shown.
    */
  var showTouch: Command = js.native
  
  /**
    * Gets or sets the tooltip.  This property is observable.
    */
  var tooltip: String = js.native
}
