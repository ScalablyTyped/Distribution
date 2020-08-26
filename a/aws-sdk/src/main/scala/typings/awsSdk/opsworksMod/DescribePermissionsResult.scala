package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePermissionsResult extends js.Object {
  /**
    * An array of Permission objects that describe the stack permissions.   If the request object contains only a stack ID, the array contains a Permission object with permissions for each of the stack IAM ARNs.   If the request object contains only an IAM ARN, the array contains a Permission object with permissions for each of the user's stack IDs.   If the request contains a stack ID and an IAM ARN, the array contains a single Permission object with permissions for the specified stack and IAM ARN.  
    */
  var Permissions: js.UndefOr[typings.awsSdk.opsworksMod.Permissions] = js.native
}

object DescribePermissionsResult {
  @scala.inline
  def apply(): DescribePermissionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePermissionsResult]
  }
  @scala.inline
  implicit class DescribePermissionsResultOps[Self <: DescribePermissionsResult] (val x: Self) extends AnyVal {
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
    def setPermissionsVarargs(value: Permission*): Self = this.set("Permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: Permissions): Self = this.set("Permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("Permissions", js.undefined)
  }
  
}

