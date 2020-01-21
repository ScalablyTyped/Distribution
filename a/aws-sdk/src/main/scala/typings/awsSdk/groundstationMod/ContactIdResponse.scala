package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactIdResponse extends js.Object {
  /**
    * UUID of a contact.
    */
  var contactId: js.UndefOr[String] = js.native
}

object ContactIdResponse {
  @scala.inline
  def apply(contactId: String = null): ContactIdResponse = {
    val __obj = js.Dynamic.literal()
    if (contactId != null) __obj.updateDynamic("contactId")(contactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactIdResponse]
  }
}

