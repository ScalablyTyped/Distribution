package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePermissionSetResponse extends js.Object {
  
  /**
    * Describes the level of access on an AWS account.
    */
  var PermissionSet: js.UndefOr[typings.awsSdk.ssoadminMod.PermissionSet] = js.native
}
object DescribePermissionSetResponse {
  
  @scala.inline
  def apply(): DescribePermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePermissionSetResponse]
  }
  
  @scala.inline
  implicit class DescribePermissionSetResponseOps[Self <: DescribePermissionSetResponse] (val x: Self) extends AnyVal {
    
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
    def setPermissionSet(value: PermissionSet): Self = this.set("PermissionSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionSet: Self = this.set("PermissionSet", js.undefined)
  }
}
