package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupPolicyResponse extends js.Object {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  
  /**
    * Provides list of path to policies. Policies contain PolicyId, ObjectIdentifier, and PolicyType. For more information, see Policies.
    */
  var PolicyToPathList: js.UndefOr[typings.awsSdk.clouddirectoryMod.PolicyToPathList] = js.native
}
object LookupPolicyResponse {
  
  @scala.inline
  def apply(): LookupPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupPolicyResponse]
  }
  
  @scala.inline
  implicit class LookupPolicyResponseOps[Self <: LookupPolicyResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPolicyToPathListVarargs(value: PolicyToPath*): Self = this.set("PolicyToPathList", js.Array(value :_*))
    
    @scala.inline
    def setPolicyToPathList(value: PolicyToPathList): Self = this.set("PolicyToPathList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyToPathList: Self = this.set("PolicyToPathList", js.undefined)
  }
}
