package typings
package davLib.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "Client")
@js.native
class Client protected () extends js.Object {
  /**
       * Create a new Client object. The client interface allows consumers to set
       * their credentials and transport once and then make authorized requests
       * without passing them to each request. Each of the other, public API
       * methods should be available on Client objects.
       * @param xhr request sender.
       * @param options
       */
  def this(xhr: davLib.davMod.transportNs.Transport) = this()
  /**
       * Create a new Client object. The client interface allows consumers to set
       * their credentials and transport once and then make authorized requests
       * without passing them to each request. Each of the other, public API
       * methods should be available on Client objects.
       * @param xhr request sender.
       * @param options
       */
  def this(xhr: davLib.davMod.transportNs.Transport, options: ClientOptions) = this()
  /**
       * Perform an initial download of a caldav or carddav account's data.
       * @param options
       * @returns a Promise which will be fulfilled with a dav.Account object.
       */
  def createAccount(): js.Promise[Account] = js.native
  /**
       * Perform an initial download of a caldav or carddav account's data.
       * @param options
       * @returns a Promise which will be fulfilled with a dav.Account object.
       */
  def createAccount(options: CreateAccountOptions): js.Promise[Account] = js.native
  /**
       * Create a calendar object on the parameter calendar.
       * @param calendar the calendar to put the object on.
       * @param options
       * @returns a Promise which will be fulfilled when the calendar has been created.
       */
  def createCalendarObject(calendar: Calendar): js.Promise[CalendarObject] = js.native
  /**
       * Create a calendar object on the parameter calendar.
       * @param calendar the calendar to put the object on.
       * @param options
       * @returns a Promise which will be fulfilled when the calendar has been created.
       */
  def createCalendarObject(calendar: Calendar, options: CreateCalendarObjectOptions): js.Promise[CalendarObject] = js.native
  /**
       * Create a vcard object on the parameter address book.
       * @param addressBook the address book to put the object on.
       * @param options
       * @returns a Promise which will be fulfilled when the vcard has been created.
       */
  def createCard(addressBook: AddressBook): js.Promise[AddressBook] = js.native
  /**
       * Create a vcard object on the parameter address book.
       * @param addressBook the address book to put the object on.
       * @param options
       * @returns a Promise which will be fulfilled when the vcard has been created.
       */
  def createCard(addressBook: AddressBook, options: CreateCardOptions): js.Promise[AddressBook] = js.native
  /**
       * Delete the parameter calendar object on the server.
       * @param calendarObject target calendar object.
       * @param options
       * @returns a Promise which will be fulfilled when the calendar has been deleted.
       */
  def deleteCalendarObject(calendarObject: CalendarObject): js.Promise[CalendarObject] = js.native
  /**
       * Delete the parameter calendar object on the server.
       * @param calendarObject target calendar object.
       * @param options
       * @returns a Promise which will be fulfilled when the calendar has been deleted.
       */
  def deleteCalendarObject(calendarObject: CalendarObject, options: DeleteCalendarObjectOptions): js.Promise[CalendarObject] = js.native
  /**
       *
       * Delete the parameter vcard object on the server.
       * @param card target vcard object.
       * @param options
       * @returns a Promise which will be fulfilled when the vcard has been deleted.
       */
  def deleteCard(card: VCard): js.Promise[VCard] = js.native
  /**
       *
       * Delete the parameter vcard object on the server.
       * @param card target vcard object.
       * @param options
       * @returns a Promise which will be fulfilled when the vcard has been deleted.
       */
  def deleteCard(card: VCard, options: DeleteCardOptions): js.Promise[VCard] = js.native
  /**
       * Send a request using this client's transport (and perhaps baseUrl).
       * @param  req dav request.
       * @param options
       * @return a promise that will be resolved with an xhr request after
       * its readyState is 4 or the result of applying an optional request
       * `transformResponse` function to the xhr object after its readyState
       * is 4.
       */
  def send(req: Request, uri: java.lang.String): js.Promise[_] = js.native
  /**
       * Send a request using this client's transport (and perhaps baseUrl).
       * @param  req dav request.
       * @param options
       * @return a promise that will be resolved with an xhr request after
       * its readyState is 4 or the result of applying an optional request
       * `transformResponse` function to the xhr object after its readyState
       * is 4.
       */
  def send(req: Request, uri: java.lang.String, options: ClientSendOptions): js.Promise[_] = js.native
  /**
       * Fetch changes from the remote server to the parameter address books.
       * @param addressBook the address book to fetch changes for.
       * @param options
       * @returns a Promise which will be fulfilled with an updated AddressBook object once sync is complete.
       */
  def syncAddressBook(addressBook: AddressBook): js.Promise[AddressBook] = js.native
  /**
       * Fetch changes from the remote server to the parameter address books.
       * @param addressBook the address book to fetch changes for.
       * @param options
       * @returns a Promise which will be fulfilled with an updated AddressBook object once sync is complete.
       */
  def syncAddressBook(addressBook: AddressBook, options: SyncAddressBookOptions): js.Promise[AddressBook] = js.native
  /**
       * Fetch changes from the remote server to the account's calendars.
       * @param account the calendar account to sync.
       * @param options
       * @returns a Promise which will be fulfilled with an updated dav.Account object once sync is complete.
       */
  def syncCaldavAccount(account: Account): js.Promise[Account] = js.native
  /**
       * Fetch changes from the remote server to the account's calendars.
       * @param account the calendar account to sync.
       * @param options
       * @returns a Promise which will be fulfilled with an updated dav.Account object once sync is complete.
       */
  def syncCaldavAccount(account: Account, options: SyncCaldavAccountOptions): js.Promise[Account] = js.native
  /**
       * Fetch changes from the remote server to the parameter calendar.
       * @param calendar the calendar to fetch changes for.
       * @param options
       * @returns a Promise which will be fulfilled with an updated dav.Calendar object once sync is complete.
       */
  def syncCalendar(calendar: Calendar): js.Promise[Calendar] = js.native
  /**
       * Fetch changes from the remote server to the parameter calendar.
       * @param calendar the calendar to fetch changes for.
       * @param options
       * @returns a Promise which will be fulfilled with an updated dav.Calendar object once sync is complete.
       */
  def syncCalendar(calendar: Calendar, options: SyncCalendarOptions): js.Promise[Calendar] = js.native
  /**
       * Fetch changes from the remote server to the account's address books.
       * @param  account the address book account to sync.
       * @param options
       * @returns a Promise which will be fulfilled with an updated Account object once sync is complete.
       */
  def syncCarddavAccount(account: Account): js.Promise[Account] = js.native
  /**
       * Fetch changes from the remote server to the account's address books.
       * @param  account the address book account to sync.
       * @param options
       * @returns a Promise which will be fulfilled with an updated Account object once sync is complete.
       */
  def syncCarddavAccount(account: Account, options: SyncCarddavAccountOptions): js.Promise[Account] = js.native
  /**
       * Persist updates to the parameter calendar object to the server.
       * @param calendarObject updated calendar object.
       * @param options
       * @returns a Promise which will be fulfilled when the calendar has been updated.
       */
  def updateCalendarObject(calendarObject: CalendarObject): js.Promise[CalendarObject] = js.native
  /**
       * Persist updates to the parameter calendar object to the server.
       * @param calendarObject updated calendar object.
       * @param options
       * @returns a Promise which will be fulfilled when the calendar has been updated.
       */
  def updateCalendarObject(calendarObject: CalendarObject, options: UpdateCalendarObjectOptions): js.Promise[CalendarObject] = js.native
  /**
       * Persist updates to the parameter vcard object to the server.
       * @param  card updated vcard object.
       * @param options
       * @returns a Promise which will be fulfilled when the vcard has been updated.
       */
  def updateCard(card: VCard): js.Promise[VCard] = js.native
  /**
       * Persist updates to the parameter vcard object to the server.
       * @param  card updated vcard object.
       * @param options
       * @returns a Promise which will be fulfilled when the vcard has been updated.
       */
  def updateCard(card: VCard, options: UpdateCardOptions): js.Promise[VCard] = js.native
}

