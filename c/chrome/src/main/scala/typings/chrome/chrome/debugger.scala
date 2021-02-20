package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugger {
  
  @js.native
  trait Debuggee extends StObject {
    
    /**
      * Optional.
      * Since Chrome 27.
      * The id of the extension which you intend to debug. Attaching to an extension background page is only possible when 'silent-debugger-extension-api' flag is enabled on the target browser.
      */
    var extensionId: js.UndefOr[String] = js.native
    
    /** Optional. The id of the tab which you intend to debug.  */
    var tabId: js.UndefOr[Double] = js.native
    
    /**
      * Optional.
      * Since Chrome 28.
      * The opaque id of the debug target.
      */
    var targetId: js.UndefOr[String] = js.native
  }
  object Debuggee {
    
    @scala.inline
    def apply(): Debuggee = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Debuggee]
    }
    
    @scala.inline
    implicit class DebuggeeMutableBuilder[Self <: Debuggee] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionIdUndefined: Self = StObject.set(x, "extensionId", js.undefined)
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      @scala.inline
      def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    }
  }
  
  type DebuggerDetachedEvent = Event[js.Function2[/* source */ Debuggee, /* reason */ String, Unit]]
  
  type DebuggerEventEvent = Event[
    js.Function3[/* source */ Debuggee, /* method */ String, /* params */ js.UndefOr[js.Object], Unit]
  ]
  
  @js.native
  trait TargetInfo extends StObject {
    
    /** True if debugger is already attached. */
    var attached: Boolean = js.native
    
    /**
      * Optional.
      * Since Chrome 30.
      * The extension id, defined if type = 'background_page'.
      */
    var extensionId: js.UndefOr[String] = js.native
    
    /** Optional. Target favicon URL.  */
    var faviconUrl: js.UndefOr[String] = js.native
    
    /** Target id. */
    var id: String = js.native
    
    /**
      * Optional.
      * Since Chrome 30.
      * The tab id, defined if type == 'page'.
      */
    var tabId: js.UndefOr[Double] = js.native
    
    /** Target page title. */
    var title: String = js.native
    
    /** Target type. */
    var `type`: String = js.native
    
    /** Target URL. */
    var url: String = js.native
  }
  object TargetInfo {
    
    @scala.inline
    def apply(attached: Boolean, id: String, title: String, `type`: String, url: String): TargetInfo = {
      val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetInfo]
    }
    
    @scala.inline
    implicit class TargetInfoMutableBuilder[Self <: TargetInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttached(value: Boolean): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionIdUndefined: Self = StObject.set(x, "extensionId", js.undefined)
      
      @scala.inline
      def setFaviconUrl(value: String): Self = StObject.set(x, "faviconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaviconUrlUndefined: Self = StObject.set(x, "faviconUrl", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
