package typings.awsSdkClientS3Browser.typesAccessControlPolicyMod

import typings.awsSdkClientS3Browser.typesGrantMod.UnmarshalledGrant
import typings.awsSdkClientS3Browser.typesOwnerMod.UnmarshalledOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAccessControlPolicy extends AccessControlPolicy {
  /**
    * <p>A list of grants.</p>
    */
  @JSName("Grants")
  var Grants_UnmarshalledAccessControlPolicy: js.UndefOr[js.Array[UnmarshalledGrant]] = js.native
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner_UnmarshalledAccessControlPolicy: js.UndefOr[UnmarshalledOwner] = js.native
}

object UnmarshalledAccessControlPolicy {
  @scala.inline
  def apply(): UnmarshalledAccessControlPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAccessControlPolicy]
  }
  @scala.inline
  implicit class UnmarshalledAccessControlPolicyOps[Self <: UnmarshalledAccessControlPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGrantsVarargs(value: UnmarshalledGrant*): Self = this.set("Grants", js.Array(value :_*))
    @scala.inline
    def setGrants(value: js.Array[UnmarshalledGrant]): Self = this.set("Grants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrants: Self = this.set("Grants", js.undefined)
    @scala.inline
    def setOwner(value: UnmarshalledOwner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
  }
  
}

