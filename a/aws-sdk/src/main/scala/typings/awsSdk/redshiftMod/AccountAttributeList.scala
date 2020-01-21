package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountAttributeList extends js.Object {
  /**
    * A list of attributes assigned to an account.
    */
  var AccountAttributes: js.UndefOr[AttributeList] = js.native
}

object AccountAttributeList {
  @scala.inline
  def apply(AccountAttributes: AttributeList = null): AccountAttributeList = {
    val __obj = js.Dynamic.literal()
    if (AccountAttributes != null) __obj.updateDynamic("AccountAttributes")(AccountAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountAttributeList]
  }
}

