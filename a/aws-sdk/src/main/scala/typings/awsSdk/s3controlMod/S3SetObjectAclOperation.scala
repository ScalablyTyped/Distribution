package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3SetObjectAclOperation extends js.Object {
  /**
    * 
    */
  var AccessControlPolicy: js.UndefOr[S3AccessControlPolicy] = js.native
}

object S3SetObjectAclOperation {
  @scala.inline
  def apply(): S3SetObjectAclOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3SetObjectAclOperation]
  }
  @scala.inline
  implicit class S3SetObjectAclOperationOps[Self <: S3SetObjectAclOperation] (val x: Self) extends AnyVal {
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
    def setAccessControlPolicy(value: S3AccessControlPolicy): Self = this.set("AccessControlPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessControlPolicy: Self = this.set("AccessControlPolicy", js.undefined)
  }
  
}

