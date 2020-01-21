package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountWithRestoreAccess extends js.Object {
  /**
    * The identifier of an AWS support account authorized to restore a snapshot. For AWS support, the identifier is amazon-redshift-support. 
    */
  var AccountAlias: js.UndefOr[String] = js.native
  /**
    * The identifier of an AWS customer account authorized to restore a snapshot.
    */
  var AccountId: js.UndefOr[String] = js.native
}

object AccountWithRestoreAccess {
  @scala.inline
  def apply(AccountAlias: String = null, AccountId: String = null): AccountWithRestoreAccess = {
    val __obj = js.Dynamic.literal()
    if (AccountAlias != null) __obj.updateDynamic("AccountAlias")(AccountAlias.asInstanceOf[js.Any])
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountWithRestoreAccess]
  }
}

