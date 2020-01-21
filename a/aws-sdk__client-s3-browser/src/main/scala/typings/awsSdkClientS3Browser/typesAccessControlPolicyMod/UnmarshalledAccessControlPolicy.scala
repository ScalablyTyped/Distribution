package typings.awsSdkClientS3Browser.typesAccessControlPolicyMod

import typings.awsSdkClientS3Browser.typesGrantMod.UnmarshalledGrant
import typings.awsSdkClientS3Browser.typesOwnerMod.UnmarshalledOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledAccessControlPolicy extends AccessControlPolicy {
  /**
    * <p>A list of grants.</p>
    */
  @JSName("Grants")
  var Grants_UnmarshalledAccessControlPolicy: js.UndefOr[js.Array[UnmarshalledGrant]] = js.undefined
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner_UnmarshalledAccessControlPolicy: js.UndefOr[UnmarshalledOwner] = js.undefined
}

object UnmarshalledAccessControlPolicy {
  @scala.inline
  def apply(Grants: js.Array[UnmarshalledGrant] = null, Owner: UnmarshalledOwner = null): UnmarshalledAccessControlPolicy = {
    val __obj = js.Dynamic.literal()
    if (Grants != null) __obj.updateDynamic("Grants")(Grants.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAccessControlPolicy]
  }
}

