package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApprovalRuleTemplatesInput extends StObject {
  
  /**
    * A non-zero, non-negative integer used to limit the number of returned results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListApprovalRuleTemplatesInput {
  
  @scala.inline
  def apply(): ListApprovalRuleTemplatesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApprovalRuleTemplatesInput]
  }
  
  @scala.inline
  implicit class ListApprovalRuleTemplatesInputMutableBuilder[Self <: ListApprovalRuleTemplatesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
