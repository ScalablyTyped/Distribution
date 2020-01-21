package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "AddressBook")
@js.native
class AddressBook () extends DAVCollection[VCard] {
  def this(options: AddressBookOptions) = this()
}

