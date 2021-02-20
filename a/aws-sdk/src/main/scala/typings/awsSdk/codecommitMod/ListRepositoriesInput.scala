package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRepositoriesInput extends StObject {
  
  /**
    * An enumeration token that allows the operation to batch the results of the operation. Batch sizes are 1,000 for list repository operations. When the client sends the token back to AWS CodeCommit, another page of 1,000 records is retrieved.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The order in which to sort the results of a list repositories operation.
    */
  var order: js.UndefOr[OrderEnum] = js.native
  
  /**
    * The criteria used to sort the results of a list repositories operation.
    */
  var sortBy: js.UndefOr[SortByEnum] = js.native
}
object ListRepositoriesInput {
  
  @scala.inline
  def apply(): ListRepositoriesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesInput]
  }
  
  @scala.inline
  implicit class ListRepositoriesInputMutableBuilder[Self <: ListRepositoriesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setOrder(value: OrderEnum): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setSortBy(value: SortByEnum): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
  }
}
