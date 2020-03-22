package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContactMethodsResult extends js.Object {
  /**
    * An array of objects that describe the contact methods.
    */
  var contactMethods: js.UndefOr[ContactMethodsList] = js.native
}

object GetContactMethodsResult {
  @scala.inline
  def apply(contactMethods: ContactMethodsList = null): GetContactMethodsResult = {
    val __obj = js.Dynamic.literal()
    if (contactMethods != null) __obj.updateDynamic("contactMethods")(contactMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactMethodsResult]
  }
}

