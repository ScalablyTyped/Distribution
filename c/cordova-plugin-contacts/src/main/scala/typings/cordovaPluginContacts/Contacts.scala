package typings.cordovaPluginContacts

import typings.cordovaPluginContacts.anon.Addresses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contacts extends StObject {
  
  /**
    * The navigator.contacts.create method is synchronous, and returns a new Contact object.
    * This method does not retain the Contact object in the device contacts database,
    * for which you need to invoke the Contact.save method.
    * @param  properties Object with contact fields
    */
  def create(): Contact = js.native
  def create(properties: ContactProperties): Contact = js.native
  
  /**
    * This allows us to use an enumeration when setting the desired fields for the ContactFindOptions.
    * The values will correspond to the type of string literals in ContactFieldType.
    */
  var fieldType: Addresses = js.native
  
  /**
    * The navigator.contacts.find method executes asynchronously, querying the device contacts database
    * and returning an array of Contact objects. The resulting objects are passed to the onSuccess
    * callback function specified by the onSuccess parameter.
    * @param fields The fields parameter specifies the fields to be used as a search qualifier,
    * and only those results are passed to the onSuccess callback function. A zero-length fields parameter
    * is invalid and results in ContactError.INVALID_ARGUMENT_ERROR. A contactFields value of "*" returns all contact fields.
    * @param onSuccess Success callback function invoked with the array of Contact objects returned from the database
    * @param onError Error callback function, invoked when an error occurs.
    * @param options Search options to filter navigator.contacts.
    */
  def find(fields: js.Array[String], onSuccess: js.Function1[/* contacts */ js.Array[Contact], Unit]): Unit = js.native
  def find(
    fields: js.Array[String],
    onSuccess: js.Function1[/* contacts */ js.Array[Contact], Unit],
    onError: js.Function1[/* error */ ContactError, Unit]
  ): Unit = js.native
  def find(
    fields: js.Array[String],
    onSuccess: js.Function1[/* contacts */ js.Array[Contact], Unit],
    onError: js.Function1[/* error */ ContactError, Unit],
    options: ContactFindOptions
  ): Unit = js.native
  def find(
    fields: js.Array[String],
    onSuccess: js.Function1[/* contacts */ js.Array[Contact], Unit],
    onError: Unit,
    options: ContactFindOptions
  ): Unit = js.native
  
  /**
    * The navigator.contacts.pickContact method launches the Contact Picker to select a single contact.
    * The resulting object is passed to the contactSuccess callback function specified by the contactSuccess parameter.
    * @param onSuccess Success callback function invoked with the array of Contact objects returned from the database
    * @param onError Error callback function, invoked when an error occurs.
    */
  def pickContact(
    onSuccess: js.Function1[/* contact */ Contact, Unit],
    onError: js.Function1[/* error */ ContactError, Unit]
  ): Unit = js.native
}
