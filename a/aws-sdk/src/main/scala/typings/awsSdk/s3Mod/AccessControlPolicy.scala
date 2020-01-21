package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessControlPolicy extends js.Object {
  /**
    * A list of grants.
    */
  var Grants: js.UndefOr[typings.awsSdk.s3Mod.Grants] = js.native
  /**
    * Container for the bucket owner's display name and ID.
    */
  var Owner: js.UndefOr[typings.awsSdk.s3Mod.Owner] = js.native
}

object AccessControlPolicy {
  @scala.inline
  def apply(Grants: Grants = null, Owner: Owner = null): AccessControlPolicy = {
    val __obj = js.Dynamic.literal()
    if (Grants != null) __obj.updateDynamic("Grants")(Grants.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlPolicy]
  }
}

