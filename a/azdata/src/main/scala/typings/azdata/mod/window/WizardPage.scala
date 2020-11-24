package typings.azdata.mod.window

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WizardPage extends ModelViewPanel {
  
  /**
    * A string giving the ID of the page's model view content
    */
  var content: String = js.native
  
  /**
    * Any additional buttons that should be displayed while the page is open
    */
  var customButtons: js.Array[Button] = js.native
  
  /**
    * An optional description for the page. If provided it will be displayed underneath the page title.
    */
  var description: String = js.native
  
  /**
    * Whether the page is enabled. If the page is not enabled, the user will not be
    * able to advance to it. Defaults to true.
    */
  var enabled: Boolean = js.native
  
  /**
    * The title of the page
    */
  var title: String = js.native
}
