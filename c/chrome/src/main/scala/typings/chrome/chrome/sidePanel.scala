package typings.chrome.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// SidePanel
////////////////////
/**
  * Availability: @since Chrome 114. Manifest v3.
  * https://developer.chrome.com/docs/extensions/reference/sidePanel/
  * Permissions: "sidePanel"
  */
object sidePanel {
  
  trait GetPanelOptions extends StObject {
    
    var tabId: js.UndefOr[Double] = js.undefined
  }
  object GetPanelOptions {
    
    inline def apply(): GetPanelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPanelOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetPanelOptions] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    }
  }
  
  trait PanelBehavior extends StObject {
    
    var openPanelOnActionClick: js.UndefOr[Boolean] = js.undefined
  }
  object PanelBehavior {
    
    inline def apply(): PanelBehavior = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelBehavior]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PanelBehavior] (val x: Self) extends AnyVal {
      
      inline def setOpenPanelOnActionClick(value: Boolean): Self = StObject.set(x, "openPanelOnActionClick", value.asInstanceOf[js.Any])
      
      inline def setOpenPanelOnActionClickUndefined: Self = StObject.set(x, "openPanelOnActionClick", js.undefined)
    }
  }
  
  trait PanelOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var tabId: js.UndefOr[Double] = js.undefined
  }
  object PanelOptions {
    
    inline def apply(): PanelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PanelOptions] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    }
  }
  
  trait SidePanel extends StObject {
    
    var default_path: String
  }
  object SidePanel {
    
    inline def apply(default_path: String): SidePanel = {
      val __obj = js.Dynamic.literal(default_path = default_path.asInstanceOf[js.Any])
      __obj.asInstanceOf[SidePanel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SidePanel] (val x: Self) extends AnyVal {
      
      inline def setDefault_path(value: String): Self = StObject.set(x, "default_path", value.asInstanceOf[js.Any])
    }
  }
}
