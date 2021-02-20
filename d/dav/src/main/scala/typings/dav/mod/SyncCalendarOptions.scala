package typings.dav.mod

import typings.dav.davStrings.basic
import typings.dav.davStrings.webdav
import typings.dav.mod.transport.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncCalendarOptions extends StObject {
  
  /**
    * list of caldav filters to send with request.
    */
  var filters: js.UndefOr[js.Array[js.Object]] = js.native
  
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.native
  
  /**
    * either 'basic' or 'webdav'. If unspecified, will try to do webdav sync
    * and failover to basic sync if rfc 6578 is not supported by the server.
    */
  var syncMethod: js.UndefOr[basic | webdav] = js.native
  
  /**
    * VTIMEZONE calendar object.
    */
  var timezone: js.UndefOr[String] = js.native
  
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.native
}
object SyncCalendarOptions {
  
  @scala.inline
  def apply(): SyncCalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncCalendarOptions]
  }
  
  @scala.inline
  implicit class SyncCalendarOptionsMutableBuilder[Self <: SyncCalendarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Array[js.Object]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: js.Object*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setSandbox(value: Sandbox): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    @scala.inline
    def setSyncMethod(value: basic | webdav): Self = StObject.set(x, "syncMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncMethodUndefined: Self = StObject.set(x, "syncMethod", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    @scala.inline
    def setXhr(value: Transport): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
