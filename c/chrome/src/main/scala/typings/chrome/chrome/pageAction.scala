package typings.chrome.chrome

import org.scalablytyped.runtime.NumberDictionary
import typings.chrome.chrome.events.Event
import typings.chrome.chrome.tabs.Tab
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait GetDetails extends StObject {
    
    /** Specify the tab to get the title from. */
    var tabId: Double = js.native
  }
  object GetDetails {
    
    @scala.inline
    def apply(tabId: Double): GetDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDetails]
    }
    
    @scala.inline
    implicit class GetDetailsMutableBuilder[Self <: GetDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IconDetails extends StObject {
    
    /**
      * Optional.
      * @deprecated This argument is ignored.
      */
    var iconIndex: js.UndefOr[Double] = js.native
    
    /**
      * Optional.
      * Either an ImageData object or a dictionary {size -> ImageData} representing icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals scale, then image with size scale * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.imageData = foo' is equivalent to 'details.imageData = {'19': foo}'
      */
    var imageData: js.UndefOr[ImageData | NumberDictionary[ImageData]] = js.native
    
    /**
      * Optional.
      * Either a relative image path or a dictionary {size -> relative image path} pointing to icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals scale, then image with size scale * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.path = foo' is equivalent to 'details.imageData = {'19': foo}'
      */
    var path: js.UndefOr[js.Any] = js.native
    
    /** The id of the tab for which you want to modify the page action. */
    var tabId: Double = js.native
  }
  object IconDetails {
    
    @scala.inline
    def apply(tabId: Double): IconDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconDetails]
    }
    
    @scala.inline
    implicit class IconDetailsMutableBuilder[Self <: IconDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconIndex(value: Double): Self = StObject.set(x, "iconIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconIndexUndefined: Self = StObject.set(x, "iconIndex", js.undefined)
      
      @scala.inline
      def setImageData(value: ImageData | NumberDictionary[ImageData]): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
      
      @scala.inline
      def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  type PageActionClickedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
  
  @js.native
  trait PopupDetails extends StObject {
    
    /** The html file to show in a popup. If set to the empty string (''), no popup is shown. */
    var popup: String = js.native
    
    /** The id of the tab for which you want to modify the page action. */
    var tabId: Double = js.native
  }
  object PopupDetails {
    
    @scala.inline
    def apply(popup: String, tabId: Double): PopupDetails = {
      val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupDetails]
    }
    
    @scala.inline
    implicit class PopupDetailsMutableBuilder[Self <: PopupDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TitleDetails extends StObject {
    
    /** The id of the tab for which you want to modify the page action. */
    var tabId: Double = js.native
    
    /** The tooltip string. */
    var title: String = js.native
  }
  object TitleDetails {
    
    @scala.inline
    def apply(tabId: Double, title: String): TitleDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleDetails]
    }
    
    @scala.inline
    implicit class TitleDetailsMutableBuilder[Self <: TitleDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
