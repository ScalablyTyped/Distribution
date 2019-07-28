package typings.dav.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var version: String = js.native
  def createAccount(options: CreateAccountOptions): js.Promise[Account] = js.native
  def createCalendarObject(calendar: Calendar, options: CreateCalendarObjectOptions): js.Promise[CalendarObject] = js.native
  def createCard(addressBook: AddressBook, options: CreateCardOptions): js.Promise[AddressBook] = js.native
  def createSandbox(): Sandbox = js.native
  def deleteCalendarObject(calendarObject: CalendarObject, options: DeleteCalendarObjectOptions): js.Promise[CalendarObject] = js.native
  def deleteCard(card: VCard, options: DeleteCardOptions): js.Promise[VCard] = js.native
  def syncAddressBook(addressBook: AddressBook, options: SyncAddressBookOptions): js.Promise[AddressBook] = js.native
  def syncCaldavAccount(account: Account, options: SyncCaldavAccountOptions): js.Promise[Account] = js.native
  def syncCalendar(calendar: Calendar, options: SyncCalendarOptions): js.Promise[Calendar] = js.native
  def syncCarddavAccount(account: Account, options: SyncCarddavAccountOptions): js.Promise[Account] = js.native
  def updateCalendarObject(calendarObject: CalendarObject, options: UpdateCalendarObjectOptions): js.Promise[CalendarObject] = js.native
  def updateCard(card: VCard, options: UpdateCardOptions): js.Promise[VCard] = js.native
}

