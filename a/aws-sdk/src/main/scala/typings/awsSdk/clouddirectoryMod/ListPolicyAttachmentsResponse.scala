package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPolicyAttachmentsResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.undefined
  
  /**
    * A list of ObjectIdentifiers to which the policy is attached.
    */
  var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.undefined
}
object ListPolicyAttachmentsResponse {
  
  inline def apply(): ListPolicyAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPolicyAttachmentsResponse]
  }
  
  extension [Self <: ListPolicyAttachmentsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setObjectIdentifiers(value: ObjectIdentifierList): Self = StObject.set(x, "ObjectIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setObjectIdentifiersUndefined: Self = StObject.set(x, "ObjectIdentifiers", js.undefined)
    
    inline def setObjectIdentifiersVarargs(value: ObjectIdentifier*): Self = StObject.set(x, "ObjectIdentifiers", js.Array(value :_*))
  }
}
