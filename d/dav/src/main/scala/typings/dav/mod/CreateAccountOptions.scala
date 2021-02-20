package typings.dav.mod

import typings.dav.davStrings.caldav
import typings.dav.davStrings.carddav
import typings.dav.mod.transport.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccountOptions extends StObject {
  
  /**
    * one of 'caldav' or 'carddav'. Defaults to 'caldav'.
    */
  var accountType: js.UndefOr[caldav | carddav] = js.native
  
  /**
    * list of caldav filters to send with request.
    */
  var filters: js.UndefOr[js.Array[js.Object]] = js.native
  
  /**
    *  whether or not to load dav collections.
    */
  var loadCollections: js.UndefOr[Boolean] = js.native
  
  /**
    * whether or not to load dav objects.
    */
  var loadObjects: js.UndefOr[Boolean] = js.native
  
  /**
    * request sandox.
    */
  var sandbox: js.UndefOr[Sandbox | js.Object] = js.native
  
  /**
    *  some url for server (needn't be base url).
    */
  var server: String = js.native
  
  /**
    * VTIMEZONE calendar object.
    */
  var timezone: js.UndefOr[String] = js.native
  
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.native
}
object CreateAccountOptions {
  
  @scala.inline
  def apply(server: String): CreateAccountOptions = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountOptions]
  }
  
  @scala.inline
  implicit class CreateAccountOptionsMutableBuilder[Self <: CreateAccountOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountType(value: caldav | carddav): Self = StObject.set(x, "accountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountTypeUndefined: Self = StObject.set(x, "accountType", js.undefined)
    
    @scala.inline
    def setFilters(value: js.Array[js.Object]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: js.Object*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setLoadCollections(value: Boolean): Self = StObject.set(x, "loadCollections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadCollectionsUndefined: Self = StObject.set(x, "loadCollections", js.undefined)
    
    @scala.inline
    def setLoadObjects(value: Boolean): Self = StObject.set(x, "loadObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadObjectsUndefined: Self = StObject.set(x, "loadObjects", js.undefined)
    
    @scala.inline
    def setSandbox(value: Sandbox | js.Object): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
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
