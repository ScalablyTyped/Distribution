package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dav", "syncAddressBook")
@js.native
object syncAddressBook extends js.Object {
  
  def apply(addressBook: AddressBook, options: SyncAddressBookOptions): js.Promise[AddressBook] = js.native
}
