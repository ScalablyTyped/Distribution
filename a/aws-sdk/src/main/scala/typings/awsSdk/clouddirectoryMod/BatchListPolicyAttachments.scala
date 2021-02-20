package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchListPolicyAttachments extends StObject {
  
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  
  /**
    * The reference that identifies the policy object.
    */
  var PolicyReference: ObjectReference = js.native
}
object BatchListPolicyAttachments {
  
  @scala.inline
  def apply(PolicyReference: ObjectReference): BatchListPolicyAttachments = {
    val __obj = js.Dynamic.literal(PolicyReference = PolicyReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListPolicyAttachments]
  }
  
  @scala.inline
  implicit class BatchListPolicyAttachmentsMutableBuilder[Self <: BatchListPolicyAttachments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: NumberResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPolicyReference(value: ObjectReference): Self = StObject.set(x, "PolicyReference", value.asInstanceOf[js.Any])
  }
}
