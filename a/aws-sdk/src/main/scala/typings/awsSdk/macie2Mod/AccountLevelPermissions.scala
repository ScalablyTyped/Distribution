package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountLevelPermissions extends js.Object {
  /**
    * The block public access settings for the bucket.
    */
  var blockPublicAccess: js.UndefOr[BlockPublicAccess] = js.native
}

object AccountLevelPermissions {
  @scala.inline
  def apply(): AccountLevelPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountLevelPermissions]
  }
  @scala.inline
  implicit class AccountLevelPermissionsOps[Self <: AccountLevelPermissions] (val x: Self) extends AnyVal {
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
    def setBlockPublicAccess(value: BlockPublicAccess): Self = this.set("blockPublicAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockPublicAccess: Self = this.set("blockPublicAccess", js.undefined)
  }
  
}

