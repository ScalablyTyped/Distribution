package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInventoryDeletionsRequest extends StObject {
  
  /**
    * Specify the delete inventory ID for which you want information. This ID was returned by the DeleteInventory action.
    */
  var DeletionId: js.UndefOr[UUID] = js.undefined
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.undefined
  
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object DescribeInventoryDeletionsRequest {
  
  @scala.inline
  def apply(): DescribeInventoryDeletionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInventoryDeletionsRequest]
  }
  
  @scala.inline
  implicit class DescribeInventoryDeletionsRequestMutableBuilder[Self <: DescribeInventoryDeletionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletionId(value: UUID): Self = StObject.set(x, "DeletionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionIdUndefined: Self = StObject.set(x, "DeletionId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
