package typings.dav.mod

import org.scalablytyped.runtime.TopLevel
import typings.dav.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createAccount(options: CreateAccountOptions): js.Promise[Account] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Account]]

inline def createCalendarObject(calendar: Calendar, options: CreateCalendarObjectOptions): js.Promise[CalendarObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCalendarObject")(calendar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CalendarObject]]

inline def createCard(addressBook: AddressBook, options: CreateCardOptions): js.Promise[AddressBook] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCard")(addressBook.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AddressBook]]

inline def createSandbox(): Sandbox = ^.asInstanceOf[js.Dynamic].applyDynamic("createSandbox")().asInstanceOf[Sandbox]

inline def deleteCalendarObject(calendarObject: CalendarObject, options: DeleteCalendarObjectOptions): js.Promise[CalendarObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteCalendarObject")(calendarObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CalendarObject]]

inline def deleteCard(card: VCard, options: DeleteCardOptions): js.Promise[VCard] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteCard")(card.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VCard]]

inline def listCalendarObjects(calendar: Calendar, options: ListCalendarObjectsOptions): js.Promise[js.Array[CalendarObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listCalendarObjects")(calendar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[CalendarObject]]]

inline def listCalendars(account: Account, options: ListCalendarsOptions): js.Promise[js.Array[Calendar]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listCalendars")(account.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Calendar]]]

inline def syncAddressBook(addressBook: AddressBook, options: SyncAddressBookOptions): js.Promise[AddressBook] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncAddressBook")(addressBook.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AddressBook]]

inline def syncCaldavAccount(account: Account, options: SyncCaldavAccountOptions): js.Promise[Account] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncCaldavAccount")(account.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Account]]

inline def syncCalendar(calendar: Calendar, options: SyncCalendarOptions): js.Promise[Calendar] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncCalendar")(calendar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Calendar]]

inline def syncCarddavAccount(account: Account, options: SyncCarddavAccountOptions): js.Promise[Account] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncCarddavAccount")(account.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Account]]

inline def updateCalendarObject(calendarObject: CalendarObject, options: UpdateCalendarObjectOptions): js.Promise[CalendarObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCalendarObject")(calendarObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CalendarObject]]

inline def updateCard(card: VCard, options: UpdateCardOptions): js.Promise[VCard] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCard")(card.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VCard]]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]
inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])

type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]:? T[P]}
  */ typings.dav.davStrings.Partial & TopLevel[T]
