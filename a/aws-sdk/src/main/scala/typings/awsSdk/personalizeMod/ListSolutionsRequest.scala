package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSolutionsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The maximum number of solutions to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A token returned from the previous call to ListSolutions for getting the next set of solutions (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListSolutionsRequest {
  
  @scala.inline
  def apply(): ListSolutionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSolutionsRequest]
  }
  
  @scala.inline
  implicit class ListSolutionsRequestMutableBuilder[Self <: ListSolutionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetGroupArnUndefined: Self = StObject.set(x, "datasetGroupArn", js.undefined)
    
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
