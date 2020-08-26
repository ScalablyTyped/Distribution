package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberFabricAttributes extends js.Object {
  /**
    * The user name for the initial administrator user for the member.
    */
  var AdminUsername: js.UndefOr[UsernameString] = js.native
  /**
    * The endpoint used to access the member's certificate authority.
    */
  var CaEndpoint: js.UndefOr[String] = js.native
}

object MemberFabricAttributes {
  @scala.inline
  def apply(): MemberFabricAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberFabricAttributes]
  }
  @scala.inline
  implicit class MemberFabricAttributesOps[Self <: MemberFabricAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdminUsername(value: UsernameString): Self = this.set("AdminUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdminUsername: Self = this.set("AdminUsername", js.undefined)
    @scala.inline
    def setCaEndpoint(value: String): Self = this.set("CaEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaEndpoint: Self = this.set("CaEndpoint", js.undefined)
  }
  
}

