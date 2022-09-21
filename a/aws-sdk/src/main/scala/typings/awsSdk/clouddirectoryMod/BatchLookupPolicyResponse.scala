package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchLookupPolicyResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.undefined
  
  /**
    * Provides list of path to policies. Policies contain PolicyId, ObjectIdentifier, and PolicyType. For more information, see Policies.
    */
  var PolicyToPathList: js.UndefOr[typings.awsSdk.clouddirectoryMod.PolicyToPathList] = js.undefined
}
object BatchLookupPolicyResponse {
  
  inline def apply(): BatchLookupPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchLookupPolicyResponse]
  }
  
  extension [Self <: BatchLookupPolicyResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPolicyToPathList(value: PolicyToPathList): Self = StObject.set(x, "PolicyToPathList", value.asInstanceOf[js.Any])
    
    inline def setPolicyToPathListUndefined: Self = StObject.set(x, "PolicyToPathList", js.undefined)
    
    inline def setPolicyToPathListVarargs(value: PolicyToPath*): Self = StObject.set(x, "PolicyToPathList", js.Array(value*))
  }
}
