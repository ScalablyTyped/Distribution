package typings.cordovaPluginContacts

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Contact object represents a user's contact. Contacts can be created, stored, or removed
  * from the device contacts database. Contacts can also be retrieved (individually or in bulk)
  * from the database by invoking the navigator.contacts.find method.
  */
trait Contact
  extends StObject
     with ContactProperties {
  
  /**
    * Removes the contact from the device contacts database, otherwise executes an error callback with a ContactError object.
    * @param onSuccess Success callback function invoked on success operation.
    * @param onError Error callback function, invoked when an error occurs.
    */
  def remove(onSuccess: js.Function0[Unit], onError: js.Function1[/* error */ Error, Unit]): Unit
  
  /**
    * Saves a new contact to the device contacts database, or updates an existing contact if a contact with the same id already exists.
    * @param onSuccess Success callback function invoked on success operation with che Contact object.
    * @param onError Error callback function, invoked when an error occurs.
    */
  def save(
    onSuccess: js.Function1[/* contact */ this.type, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): Unit
}
object Contact {
  
  inline def apply(
    remove: (js.Function0[Unit], js.Function1[/* error */ Error, Unit]) => Unit,
    save: (js.Function1[Contact, Unit], js.Function1[/* error */ Error, Unit]) => Unit
  ): Contact = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction2(remove), save = js.Any.fromFunction2(save))
    __obj.asInstanceOf[Contact]
  }
  
  extension [Self <: Contact](x: Self) {
    
    inline def setRemove(value: (js.Function0[Unit], js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    inline def setSave(value: (js.Function1[Contact, Unit], js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "save", js.Any.fromFunction2(value))
  }
}
