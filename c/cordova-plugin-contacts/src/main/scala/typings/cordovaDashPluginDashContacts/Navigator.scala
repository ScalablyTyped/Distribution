package typings.cordovaDashPluginDashContacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  /** Provides access to the device contacts database. */
  var contacts: Contacts
}

object Navigator {
  @scala.inline
  def apply(contacts: Contacts): Navigator = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Navigator]
  }
}

