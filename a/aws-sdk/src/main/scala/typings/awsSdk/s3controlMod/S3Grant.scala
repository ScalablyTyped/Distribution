package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Grant extends js.Object {
  /**
    * 
    */
  var Grantee: js.UndefOr[S3Grantee] = js.native
  /**
    * 
    */
  var Permission: js.UndefOr[S3Permission] = js.native
}

object S3Grant {
  @scala.inline
  def apply(): S3Grant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Grant]
  }
  @scala.inline
  implicit class S3GrantOps[Self <: S3Grant] (val x: Self) extends AnyVal {
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
    def setGrantee(value: S3Grantee): Self = this.set("Grantee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantee: Self = this.set("Grantee", js.undefined)
    @scala.inline
    def setPermission(value: S3Permission): Self = this.set("Permission", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermission: Self = this.set("Permission", js.undefined)
  }
  
}

