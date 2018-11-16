package typings
package davLib.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", JSImport.Namespace)
@js.native
object davModMembers extends js.Object {
  var version: java.lang.String = js.native
  def createAccount(options: CreateAccountOptions): stdLib.Promise[Account] = js.native
  def createCalendarObject(calendar: Calendar, options: CreateCalendarObjectOptions): stdLib.Promise[CalendarObject] = js.native
  def createCard(addressBook: AddressBook, options: CreateCardOptions): stdLib.Promise[AddressBook] = js.native
  def createSandbox(): Sandbox = js.native
  def deleteCalendarObject(calendarObject: CalendarObject, options: DeleteCalendarObjectOptions): stdLib.Promise[CalendarObject] = js.native
  def deleteCard(card: VCard, options: DeleteCardOptions): stdLib.Promise[VCard] = js.native
  def syncAddressBook(addressBook: AddressBook, options: SyncAddressBookOptions): stdLib.Promise[AddressBook] = js.native
  def syncCaldavAccount(account: Account, options: SyncCaldavAccountOptions): stdLib.Promise[Account] = js.native
  def syncCalendar(calendar: Calendar, options: SyncCalendarOptions): stdLib.Promise[Calendar] = js.native
  def syncCarddavAccount(account: Account, options: SyncCarddavAccountOptions): stdLib.Promise[Account] = js.native
  def updateCalendarObject(calendarObject: CalendarObject, options: UpdateCalendarObjectOptions): stdLib.Promise[CalendarObject] = js.native
  def updateCard(card: VCard, options: UpdateCardOptions): stdLib.Promise[VCard] = js.native
}

