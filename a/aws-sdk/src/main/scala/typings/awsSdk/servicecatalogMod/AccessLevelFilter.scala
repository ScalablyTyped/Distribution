package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessLevelFilter extends js.Object {
  /**
    * The access level.    Account - Filter results based on the account.    Role - Filter results based on the federated role of the specified user.    User - Filter results based on the specified user.  
    */
  var Key: js.UndefOr[AccessLevelFilterKey] = js.native
  /**
    * The user to which the access level applies. The only supported value is Self.
    */
  var Value: js.UndefOr[AccessLevelFilterValue] = js.native
}

object AccessLevelFilter {
  @scala.inline
  def apply(Key: AccessLevelFilterKey = null, Value: AccessLevelFilterValue = null): AccessLevelFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessLevelFilter]
  }
}

