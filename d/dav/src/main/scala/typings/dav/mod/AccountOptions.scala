package typings.dav.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined dav.dav.Partial<dav.dav.Account> */
trait AccountOptions extends StObject {
  
  var addressBooks: js.UndefOr[js.Array[AddressBook]] = js.undefined
  
  var calendars: js.UndefOr[js.Array[Calendar]] = js.undefined
  
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], Any]] = js.undefined
  
  var credentials: js.UndefOr[Credentials] = js.undefined
  
  var homeUrl: js.UndefOr[String] = js.undefined
  
  var principalUrl: js.UndefOr[String] = js.undefined
  
  var rootUrl: js.UndefOr[String] = js.undefined
  
  var server: js.UndefOr[String] = js.undefined
}
object AccountOptions {
  
  inline def apply(): AccountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountOptions] (val x: Self) extends AnyVal {
    
    inline def setAddressBooks(value: js.Array[AddressBook]): Self = StObject.set(x, "addressBooks", value.asInstanceOf[js.Any])
    
    inline def setAddressBooksUndefined: Self = StObject.set(x, "addressBooks", js.undefined)
    
    inline def setAddressBooksVarargs(value: AddressBook*): Self = StObject.set(x, "addressBooks", js.Array(value*))
    
    inline def setCalendars(value: js.Array[Calendar]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    inline def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
    
    inline def setCalendarsVarargs(value: Calendar*): Self = StObject.set(x, "calendars", js.Array(value*))
    
    inline def setConstructor(value: /* options */ js.UndefOr[AccountOptions] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setHomeUrl(value: String): Self = StObject.set(x, "homeUrl", value.asInstanceOf[js.Any])
    
    inline def setHomeUrlUndefined: Self = StObject.set(x, "homeUrl", js.undefined)
    
    inline def setPrincipalUrl(value: String): Self = StObject.set(x, "principalUrl", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUrlUndefined: Self = StObject.set(x, "principalUrl", js.undefined)
    
    inline def setRootUrl(value: String): Self = StObject.set(x, "rootUrl", value.asInstanceOf[js.Any])
    
    inline def setRootUrlUndefined: Self = StObject.set(x, "rootUrl", js.undefined)
    
    inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
