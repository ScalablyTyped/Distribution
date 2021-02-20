package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupPolicyResponse extends StObject {
  
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
  implicit class LookupPolicyResponseMutableBuilder[Self <: LookupPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPolicyToPathList(value: PolicyToPathList): Self = StObject.set(x, "PolicyToPathList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyToPathListUndefined: Self = StObject.set(x, "PolicyToPathList", js.undefined)
    
    @scala.inline
    def setPolicyToPathListVarargs(value: PolicyToPath*): Self = StObject.set(x, "PolicyToPathList", js.Array(value :_*))
  }
}
