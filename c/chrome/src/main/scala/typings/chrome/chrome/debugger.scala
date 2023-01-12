package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugger {
  
  trait Debuggee extends StObject {
    
    /**
      * Optional.
      * Since Chrome 27.
      * The id of the extension which you intend to debug. Attaching to an extension background page is only possible when 'silent-debugger-extension-api' flag is enabled on the target browser.
      */
    var extensionId: js.UndefOr[String] = js.undefined
    
    /** Optional. The id of the tab which you intend to debug.  */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 28.
      * The opaque id of the debug target.
      */
    var targetId: js.UndefOr[String] = js.undefined
  }
  object Debuggee {
    
    inline def apply(): Debuggee = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Debuggee]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Debuggee] (val x: Self) extends AnyVal {
      
      inline def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
      
      inline def setExtensionIdUndefined: Self = StObject.set(x, "extensionId", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    }
  }
  
  type DebuggerDetachedEvent = Event[js.Function2[/* source */ Debuggee, /* reason */ String, Unit]]
  
  type DebuggerEventEvent = Event[
    js.Function3[/* source */ Debuggee, /* method */ String, /* params */ js.UndefOr[js.Object], Unit]
  ]
  
  trait TargetInfo extends StObject {
    
    /** True if debugger is already attached. */
    var attached: Boolean
    
    /**
      * Optional.
      * Since Chrome 30.
      * The extension id, defined if type = 'background_page'.
      */
    var extensionId: js.UndefOr[String] = js.undefined
    
    /** Optional. Target favicon URL.  */
    var faviconUrl: js.UndefOr[String] = js.undefined
    
    /** Target id. */
    var id: String
    
    /**
      * Optional.
      * Since Chrome 30.
      * The tab id, defined if type == 'page'.
      */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /** Target page title. */
    var title: String
    
    /** Target type. */
    var `type`: String
    
    /** Target URL. */
    var url: String
  }
  object TargetInfo {
    
    inline def apply(attached: Boolean, id: String, title: String, `type`: String, url: String): TargetInfo = {
      val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TargetInfo] (val x: Self) extends AnyVal {
      
      inline def setAttached(value: Boolean): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      inline def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
      
      inline def setExtensionIdUndefined: Self = StObject.set(x, "extensionId", js.undefined)
      
      inline def setFaviconUrl(value: String): Self = StObject.set(x, "faviconUrl", value.asInstanceOf[js.Any])
      
      inline def setFaviconUrlUndefined: Self = StObject.set(x, "faviconUrl", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
