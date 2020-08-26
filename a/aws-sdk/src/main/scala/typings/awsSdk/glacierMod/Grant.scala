package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grant extends js.Object {
  /**
    * The grantee.
    */
  var Grantee: js.UndefOr[typings.awsSdk.glacierMod.Grantee] = js.native
  /**
    * Specifies the permission given to the grantee. 
    */
  var Permission: js.UndefOr[typings.awsSdk.glacierMod.Permission] = js.native
}

object Grant {
  @scala.inline
  def apply(): Grant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grant]
  }
  @scala.inline
  implicit class GrantOps[Self <: Grant] (val x: Self) extends AnyVal {
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
    def setGrantee(value: Grantee): Self = this.set("Grantee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantee: Self = this.set("Grantee", js.undefined)
    @scala.inline
    def setPermission(value: Permission): Self = this.set("Permission", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermission: Self = this.set("Permission", js.undefined)
  }
  
}

