package typings.dav.mod

import typings.dav.davStrings.caldav
import typings.dav.davStrings.carddav
import typings.dav.mod.transport.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccountOptions extends StObject {
  
  /**
    * one of 'caldav' or 'carddav'. Defaults to 'caldav'.
    */
  var accountType: js.UndefOr[caldav | carddav] = js.undefined
  
  /**
    * list of caldav filters to send with request.
    */
  var filters: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  /**
    *  whether or not to load dav collections.
    */
  var loadCollections: js.UndefOr[Boolean] = js.undefined
  
  /**
    * whether or not to load dav objects.
    */
  var loadObjects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * request sandox.
    */
  var sandbox: js.UndefOr[Sandbox | js.Object] = js.undefined
  
  /**
    *  some url for server (needn't be base url).
    */
  var server: String
  
  /**
    * VTIMEZONE calendar object.
    */
  var timezone: js.UndefOr[String] = js.undefined
  
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.undefined
}
object CreateAccountOptions {
  
  inline def apply(server: String): CreateAccountOptions = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAccountOptions] (val x: Self) extends AnyVal {
    
    inline def setAccountType(value: caldav | carddav): Self = StObject.set(x, "accountType", value.asInstanceOf[js.Any])
    
    inline def setAccountTypeUndefined: Self = StObject.set(x, "accountType", js.undefined)
    
    inline def setFilters(value: js.Array[js.Object]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: js.Object*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setLoadCollections(value: Boolean): Self = StObject.set(x, "loadCollections", value.asInstanceOf[js.Any])
    
    inline def setLoadCollectionsUndefined: Self = StObject.set(x, "loadCollections", js.undefined)
    
    inline def setLoadObjects(value: Boolean): Self = StObject.set(x, "loadObjects", value.asInstanceOf[js.Any])
    
    inline def setLoadObjectsUndefined: Self = StObject.set(x, "loadObjects", js.undefined)
    
    inline def setSandbox(value: Sandbox | js.Object): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setXhr(value: Transport): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
