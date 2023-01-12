package typings.chrome.chrome

import org.scalablytyped.runtime.NumberDictionary
import typings.chrome.chrome.events.Event
import typings.chrome.chrome.tabs.Tab
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Action
////////////////////
/**
  * Use the chrome.action API to control the extension's icon in the Google Chrome toolbar.
  * Availability: Since Chrome 88. Manifest v3.
  * Manifest:  "action": {...}
  */
object action {
  
  trait BadgeBackgroundColorDetails extends StObject {
    
    /** An array of four integers in the range [0,255] that make up the RGBA color of the badge. For example, opaque red is [255, 0, 0, 255]. Can also be a string with a CSS value, with opaque red being #FF0000 or #F00. */
    var color: String | ColorArray
    
    /** Optional. Limits the change to when a particular tab is selected. Automatically resets when the tab is closed.  */
    var tabId: js.UndefOr[Double] = js.undefined
  }
  object BadgeBackgroundColorDetails {
    
    inline def apply(color: String | ColorArray): BadgeBackgroundColorDetails = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeBackgroundColorDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BadgeBackgroundColorDetails] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String | ColorArray): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    }
  }
  
  trait BadgeTextDetails extends StObject {
    
    /** Optional. Limits the change to when a particular tab is selected. Automatically resets when the tab is closed.  */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /** Any number of characters can be passed, but only about four can fit in the space. */
    var text: String
  }
  object BadgeTextDetails {
    
    inline def apply(text: String): BadgeTextDetails = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeTextDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BadgeTextDetails] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type BrowserClickedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
  
  type ColorArray = js.Tuple4[Double, Double, Double, Double]
  
  trait PopupDetails extends StObject {
    
    /** The html file to show in a popup. If set to the empty string (''), no popup is shown. */
    var popup: String
    
    /** Optional. Limits the change to when a particular tab is selected. Automatically resets when the tab is closed.  */
    var tabId: js.UndefOr[Double] = js.undefined
  }
  object PopupDetails {
    
    inline def apply(popup: String): PopupDetails = {
      val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupDetails] (val x: Self) extends AnyVal {
      
      inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    }
  }
  
  trait TabDetails extends StObject {
    
    /** Optional. The ID of the tab to query state for. If no tab is specified, the non-tab-specific state is returned.  */
    var tabId: js.UndefOr[Double] = js.undefined
  }
  object TabDetails {
    
    inline def apply(): TabDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabDetails] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    }
  }
  
  trait TabIconDetails extends StObject {
    
    /** Optional. Either an ImageData object or a dictionary {size -> ImageData} representing icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals scale, then image with size scale * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.imageData = foo' is equivalent to 'details.imageData = {'19': foo}'  */
    var imageData: js.UndefOr[ImageData | NumberDictionary[ImageData]] = js.undefined
    
    /** Optional. Either a relative image path or a dictionary {size -> relative image path} pointing to icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals scale, then image with size scale * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.path = foo' is equivalent to 'details.imageData = {'19': foo}'  */
    var path: js.UndefOr[String | NumberDictionary[String]] = js.undefined
    
    /** Optional. Limits the change to when a particular tab is selected. Automatically resets when the tab is closed.  */
    var tabId: js.UndefOr[Double] = js.undefined
  }
  object TabIconDetails {
    
    inline def apply(): TabIconDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabIconDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabIconDetails] (val x: Self) extends AnyVal {
      
      inline def setImageData(value: ImageData | NumberDictionary[ImageData]): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
      
      inline def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
      
      inline def setPath(value: String | NumberDictionary[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    }
  }
  
  trait TitleDetails extends StObject {
    
    /** Optional. Limits the change to when a particular tab is selected. Automatically resets when the tab is closed.  */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /** The string the action should display when moused over. */
    var title: String
  }
  object TitleDetails {
    
    inline def apply(title: String): TitleDetails = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TitleDetails] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
