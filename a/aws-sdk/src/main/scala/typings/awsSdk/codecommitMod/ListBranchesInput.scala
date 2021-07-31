package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBranchesInput extends StObject {
  
  /**
    * An enumeration token that allows the operation to batch the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The name of the repository that contains the branches.
    */
  var repositoryName: RepositoryName
}
object ListBranchesInput {
  
  @scala.inline
  def apply(repositoryName: RepositoryName): ListBranchesInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBranchesInput]
  }
  
  @scala.inline
  implicit class ListBranchesInputMutableBuilder[Self <: ListBranchesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
