package typings.cordovaPluginContacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  /** Provides access to the device contacts database. */
  var contacts: Contacts
}
object Navigator {
  
  inline def apply(contacts: Contacts): Navigator = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    inline def setContacts(value: Contacts): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
  }
}
