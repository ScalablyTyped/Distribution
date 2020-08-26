package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3AccessControlList extends js.Object {
  /**
    * 
    */
  var Grants: js.UndefOr[S3GrantList] = js.native
  /**
    * 
    */
  var Owner: S3ObjectOwner = js.native
}

object S3AccessControlList {
  @scala.inline
  def apply(Owner: S3ObjectOwner): S3AccessControlList = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3AccessControlList]
  }
  @scala.inline
  implicit class S3AccessControlListOps[Self <: S3AccessControlList] (val x: Self) extends AnyVal {
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
    def setOwner(value: S3ObjectOwner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrantsVarargs(value: S3Grant*): Self = this.set("Grants", js.Array(value :_*))
    @scala.inline
    def setGrants(value: S3GrantList): Self = this.set("Grants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrants: Self = this.set("Grants", js.undefined)
  }
  
}

