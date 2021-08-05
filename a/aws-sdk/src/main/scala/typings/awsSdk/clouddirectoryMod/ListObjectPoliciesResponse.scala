package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectPoliciesResponse extends StObject {
  
  /**
    * A list of policy ObjectIdentifiers, that are attached to the object.
    */
  var AttachedPolicyIds: js.UndefOr[ObjectIdentifierList] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.undefined
}
object ListObjectPoliciesResponse {
  
  inline def apply(): ListObjectPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListObjectPoliciesResponse]
  }
  
  extension [Self <: ListObjectPoliciesResponse](x: Self) {
    
    inline def setAttachedPolicyIds(value: ObjectIdentifierList): Self = StObject.set(x, "AttachedPolicyIds", value.asInstanceOf[js.Any])
    
    inline def setAttachedPolicyIdsUndefined: Self = StObject.set(x, "AttachedPolicyIds", js.undefined)
    
    inline def setAttachedPolicyIdsVarargs(value: ObjectIdentifier*): Self = StObject.set(x, "AttachedPolicyIds", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
