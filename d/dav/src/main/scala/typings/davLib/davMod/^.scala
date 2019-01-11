package typings
package davLib.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var version: java.lang.String = js.native
  def createAccount(options: davLib.davMod.CreateAccountOptions): js.Promise[davLib.davMod.Account] = js.native
  def createCalendarObject(calendar: davLib.davMod.Calendar, options: davLib.davMod.CreateCalendarObjectOptions): js.Promise[davLib.davMod.CalendarObject] = js.native
  def createCard(addressBook: davLib.davMod.AddressBook, options: davLib.davMod.CreateCardOptions): js.Promise[davLib.davMod.AddressBook] = js.native
  def createSandbox(): davLib.davMod.Sandbox = js.native
  def deleteCalendarObject(calendarObject: davLib.davMod.CalendarObject, options: davLib.davMod.DeleteCalendarObjectOptions): js.Promise[davLib.davMod.CalendarObject] = js.native
  def deleteCard(card: davLib.davMod.VCard, options: davLib.davMod.DeleteCardOptions): js.Promise[davLib.davMod.VCard] = js.native
  def syncAddressBook(addressBook: davLib.davMod.AddressBook, options: davLib.davMod.SyncAddressBookOptions): js.Promise[davLib.davMod.AddressBook] = js.native
  def syncCaldavAccount(account: davLib.davMod.Account, options: davLib.davMod.SyncCaldavAccountOptions): js.Promise[davLib.davMod.Account] = js.native
  def syncCalendar(calendar: davLib.davMod.Calendar, options: davLib.davMod.SyncCalendarOptions): js.Promise[davLib.davMod.Calendar] = js.native
  def syncCarddavAccount(account: davLib.davMod.Account, options: davLib.davMod.SyncCarddavAccountOptions): js.Promise[davLib.davMod.Account] = js.native
  def updateCalendarObject(calendarObject: davLib.davMod.CalendarObject, options: davLib.davMod.UpdateCalendarObjectOptions): js.Promise[davLib.davMod.CalendarObject] = js.native
  def updateCard(card: davLib.davMod.VCard, options: davLib.davMod.UpdateCardOptions): js.Promise[davLib.davMod.VCard] = js.native
}

