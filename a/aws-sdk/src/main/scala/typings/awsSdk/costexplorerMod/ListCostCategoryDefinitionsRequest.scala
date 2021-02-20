package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCostCategoryDefinitionsRequest extends StObject {
  
  /**
    *  The date when the Cost Category was effective. 
    */
  var EffectiveOn: js.UndefOr[ZonedDateTime] = js.native
  
  /**
    *  The number of entries a paginated response contains. 
    */
  var MaxResults: js.UndefOr[CostCategoryMaxResults] = js.native
  
  /**
    *  The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextToken: js.UndefOr[NextPageToken] = js.native
}
object ListCostCategoryDefinitionsRequest {
  
  @scala.inline
  def apply(): ListCostCategoryDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCostCategoryDefinitionsRequest]
  }
  
  @scala.inline
  implicit class ListCostCategoryDefinitionsRequestMutableBuilder[Self <: ListCostCategoryDefinitionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffectiveOn(value: ZonedDateTime): Self = StObject.set(x, "EffectiveOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveOnUndefined: Self = StObject.set(x, "EffectiveOn", js.undefined)
    
    @scala.inline
    def setMaxResults(value: CostCategoryMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextPageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
