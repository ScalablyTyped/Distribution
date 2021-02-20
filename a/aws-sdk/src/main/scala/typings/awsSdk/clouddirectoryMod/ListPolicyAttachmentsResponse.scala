package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPolicyAttachmentsResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  
  /**
    * A list of ObjectIdentifiers to which the policy is attached.
    */
  var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.native
}
object ListPolicyAttachmentsResponse {
  
  @scala.inline
  def apply(): ListPolicyAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPolicyAttachmentsResponse]
  }
  
  @scala.inline
  implicit class ListPolicyAttachmentsResponseMutableBuilder[Self <: ListPolicyAttachmentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setObjectIdentifiers(value: ObjectIdentifierList): Self = StObject.set(x, "ObjectIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdentifiersUndefined: Self = StObject.set(x, "ObjectIdentifiers", js.undefined)
    
    @scala.inline
    def setObjectIdentifiersVarargs(value: ObjectIdentifier*): Self = StObject.set(x, "ObjectIdentifiers", js.Array(value :_*))
  }
}
