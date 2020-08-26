package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessKeyDetails extends js.Object {
  /**
    * The access key ID of the user.
    */
  var AccessKeyId: js.UndefOr[String] = js.native
  /**
    * The principal ID of the user.
    */
  var PrincipalId: js.UndefOr[String] = js.native
  /**
    * The name of the user.
    */
  var UserName: js.UndefOr[String] = js.native
  /**
    * The type of the user.
    */
  var UserType: js.UndefOr[String] = js.native
}

object AccessKeyDetails {
  @scala.inline
  def apply(): AccessKeyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessKeyDetails]
  }
  @scala.inline
  implicit class AccessKeyDetailsOps[Self <: AccessKeyDetails] (val x: Self) extends AnyVal {
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
    def setAccessKeyId(value: String): Self = this.set("AccessKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKeyId: Self = this.set("AccessKeyId", js.undefined)
    @scala.inline
    def setPrincipalId(value: String): Self = this.set("PrincipalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipalId: Self = this.set("PrincipalId", js.undefined)
    @scala.inline
    def setUserName(value: String): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
    @scala.inline
    def setUserType(value: String): Self = this.set("UserType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserType: Self = this.set("UserType", js.undefined)
  }
  
}

