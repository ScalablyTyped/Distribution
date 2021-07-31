package typings.chrome.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Page Capture
////////////////////
/**
  * Use the chrome.pageCapture API to save a tab as MHTML.
  * Permissions:  "pageCapture"
  * @since Chrome 18.
  */
object pageCapture {
  
  trait SaveDetails extends StObject {
    
    /** The id of the tab to save as MHTML. */
    var tabId: Double
  }
  object SaveDetails {
    
    @scala.inline
    def apply(tabId: Double): SaveDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SaveDetails]
    }
    
    @scala.inline
    implicit class SaveDetailsMutableBuilder[Self <: SaveDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
}
