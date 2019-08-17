package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAccessControlPolicyMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreGrantMod._Grant
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreOwnerMod._Owner
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AccessControlPolicy extends js.Object {
  /**
    * <p>A list of grants.</p>
    */
  var Grants: js.UndefOr[js.Array[_Grant] | Iterable[_Grant]] = js.undefined
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[_Owner] = js.undefined
}

object _AccessControlPolicy {
  @scala.inline
  def apply(Grants: js.Array[_Grant] | Iterable[_Grant] = null, Owner: _Owner = null): _AccessControlPolicy = {
    val __obj = js.Dynamic.literal()
    if (Grants != null) __obj.updateDynamic("Grants")(Grants.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    __obj.asInstanceOf[_AccessControlPolicy]
  }
}

