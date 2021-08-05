package typings.chrome.chrome

import org.scalablytyped.runtime.NumberDictionary
import typings.chrome.chrome.events.Event
import typings.chrome.chrome.tabs.Tab
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Page Action
////////////////////
/**
  * Use the chrome.pageAction API to put icons inside the address bar. Page actions represent actions that can be taken on the current page, but that aren't applicable to all pages.
  * Manifest:  "page_action": {...}
  * @since Chrome 5.
  */
object pageAction {
  
  trait GetDetails extends StObject {
    
    /** Specify the tab to get the title from. */
    var tabId: Double
  }
  object GetDetails {
    
    inline def apply(tabId: Double): GetDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDetails]
    }
    
    extension [Self <: GetDetails](x: Self) {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  trait IconDetails extends StObject {
    
    /**
      * Optional.
      * @deprecated This argument is ignored.
      */
    var iconIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional.
      * Either an ImageData object or a dictionary {size -> ImageData} representing icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals scale, then image with size scale * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.imageData = foo' is equivalent to 'details.imageData = {'19': foo}'
      */
    var imageData: js.UndefOr[ImageData | NumberDictionary[ImageData]] = js.undefined
    
    /**
      * Optional.
      * Either a relative image path or a dictionary {size -> relative image path} pointing to icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals scale, then image with size scale * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.path = foo' is equivalent to 'details.imageData = {'19': foo}'
      */
    var path: js.UndefOr[js.Any] = js.undefined
    
    /** The id of the tab for which you want to modify the page action. */
    var tabId: Double
  }
  object IconDetails {
    
    inline def apply(tabId: Double): IconDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconDetails]
    }
    
    extension [Self <: IconDetails](x: Self) {
      
      inline def setIconIndex(value: Double): Self = StObject.set(x, "iconIndex", value.asInstanceOf[js.Any])
      
      inline def setIconIndexUndefined: Self = StObject.set(x, "iconIndex", js.undefined)
      
      inline def setImageData(value: ImageData | NumberDictionary[ImageData]): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
      
      inline def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
      
      inline def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  type PageActionClickedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
  
  trait PopupDetails extends StObject {
    
    /** The html file to show in a popup. If set to the empty string (''), no popup is shown. */
    var popup: String
    
    /** The id of the tab for which you want to modify the page action. */
    var tabId: Double
  }
  object PopupDetails {
    
    inline def apply(popup: String, tabId: Double): PopupDetails = {
      val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupDetails]
    }
    
    extension [Self <: PopupDetails](x: Self) {
      
      inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  trait TitleDetails extends StObject {
    
    /** The id of the tab for which you want to modify the page action. */
    var tabId: Double
    
    /** The tooltip string. */
    var title: String
  }
  object TitleDetails {
    
    inline def apply(tabId: Double, title: String): TitleDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleDetails]
    }
    
    extension [Self <: TitleDetails](x: Self) {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
