package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserProfilesRequest extends js.Object {
  
  /**
    * An array of IAM or federated user ARNs that identify the users to be described.
    */
  var IamUserArns: js.UndefOr[Strings] = js.native
}
object DescribeUserProfilesRequest {
  
  @scala.inline
  def apply(): DescribeUserProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserProfilesRequest]
  }
  
  @scala.inline
  implicit class DescribeUserProfilesRequestOps[Self <: DescribeUserProfilesRequest] (val x: Self) extends AnyVal {
    
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
    def setIamUserArnsVarargs(value: String*): Self = this.set("IamUserArns", js.Array(value :_*))
    
    @scala.inline
    def setIamUserArns(value: Strings): Self = this.set("IamUserArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamUserArns: Self = this.set("IamUserArns", js.undefined)
  }
}
