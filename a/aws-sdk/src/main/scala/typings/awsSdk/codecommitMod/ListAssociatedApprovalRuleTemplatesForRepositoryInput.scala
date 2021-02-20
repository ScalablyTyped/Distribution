package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssociatedApprovalRuleTemplatesForRepositoryInput extends StObject {
  
  /**
    * A non-zero, non-negative integer used to limit the number of returned results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The name of the repository for which you want to list all associated approval rule templates.
    */
  var repositoryName: RepositoryName = js.native
}
object ListAssociatedApprovalRuleTemplatesForRepositoryInput {
  
  @scala.inline
  def apply(repositoryName: RepositoryName): ListAssociatedApprovalRuleTemplatesForRepositoryInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociatedApprovalRuleTemplatesForRepositoryInput]
  }
  
  @scala.inline
  implicit class ListAssociatedApprovalRuleTemplatesForRepositoryInputMutableBuilder[Self <: ListAssociatedApprovalRuleTemplatesForRepositoryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
