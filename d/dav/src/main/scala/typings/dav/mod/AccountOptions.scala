package typings.dav.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined dav.dav.Partial<dav.dav.Account> */
trait AccountOptions extends StObject {
  
  var addressBooks: js.UndefOr[js.Array[AddressBook]] = js.undefined
  
  var calendars: js.UndefOr[js.Array[Calendar]] = js.undefined
  
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.undefined
  
  var credentials: js.UndefOr[Credentials] = js.undefined
  
  var homeUrl: js.UndefOr[String] = js.undefined
  
  var principalUrl: js.UndefOr[String] = js.undefined
  
  var rootUrl: js.UndefOr[String] = js.undefined
  
  var server: js.UndefOr[String] = js.undefined
}
object AccountOptions {
  
  @scala.inline
  def apply(): AccountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountOptions]
  }
  
  @scala.inline
  implicit class AccountOptionsMutableBuilder[Self <: AccountOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressBooks(value: js.Array[AddressBook]): Self = StObject.set(x, "addressBooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressBooksUndefined: Self = StObject.set(x, "addressBooks", js.undefined)
    
    @scala.inline
    def setAddressBooksVarargs(value: AddressBook*): Self = StObject.set(x, "addressBooks", js.Array(value :_*))
    
    @scala.inline
    def setCalendars(value: js.Array[Calendar]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
    
    @scala.inline
    def setCalendarsVarargs(value: Calendar*): Self = StObject.set(x, "calendars", js.Array(value :_*))
    
    @scala.inline
    def setConstructor(value: /* options */ js.UndefOr[AccountOptions] => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    @scala.inline
    def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setHomeUrl(value: String): Self = StObject.set(x, "homeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeUrlUndefined: Self = StObject.set(x, "homeUrl", js.undefined)
    
    @scala.inline
    def setPrincipalUrl(value: String): Self = StObject.set(x, "principalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalUrlUndefined: Self = StObject.set(x, "principalUrl", js.undefined)
    
    @scala.inline
    def setRootUrl(value: String): Self = StObject.set(x, "rootUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUrlUndefined: Self = StObject.set(x, "rootUrl", js.undefined)
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
