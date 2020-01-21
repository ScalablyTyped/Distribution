package typings.awsSdkClientS3Browser.typesAccessControlPolicyMod

import typings.awsSdkClientS3Browser.typesGrantMod.Grant
import typings.awsSdkClientS3Browser.typesOwnerMod.Owner
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessControlPolicy extends js.Object {
  /**
    * <p>A list of grants.</p>
    */
  var Grants: js.UndefOr[js.Array[Grant] | Iterable[Grant]] = js.undefined
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[typings.awsSdkClientS3Browser.typesOwnerMod.Owner] = js.undefined
}

object AccessControlPolicy {
  @scala.inline
  def apply(Grants: js.Array[Grant] | Iterable[Grant] = null, Owner: Owner = null): AccessControlPolicy = {
    val __obj = js.Dynamic.literal()
    if (Grants != null) __obj.updateDynamic("Grants")(Grants.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlPolicy]
  }
}

