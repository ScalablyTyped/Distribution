package typings.dav.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "syncAddressBook")
@js.native
object syncAddressBook extends js.Object {
  def apply(addressBook: AddressBook, options: SyncAddressBookOptions): js.Promise[AddressBook] = js.native
}

