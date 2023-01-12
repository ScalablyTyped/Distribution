package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import typings.chrome.chrome.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Script Badge
////////////////////
object scriptBadge {
  
  trait AttentionDetails extends StObject {
    
    var tabId: Double
  }
  object AttentionDetails {
    
    inline def apply(tabId: Double): AttentionDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttentionDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttentionDetails] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetPopupDetails extends StObject {
    
    var tabId: Double
  }
  object GetPopupDetails {
    
    inline def apply(tabId: Double): GetPopupDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPopupDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetPopupDetails] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  type ScriptBadgeClickedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
  
  trait SetPopupDetails extends StObject {
    
    var popup: String
    
    var tabId: Double
  }
  object SetPopupDetails {
    
    inline def apply(popup: String, tabId: Double): SetPopupDetails = {
      val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetPopupDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetPopupDetails] (val x: Self) extends AnyVal {
      
      inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
}
