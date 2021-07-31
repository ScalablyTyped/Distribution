package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFiltersResponse extends StObject {
  
  /**
    * A list of returned filters.
    */
  var Filters: js.UndefOr[typings.awsSdk.personalizeMod.Filters] = js.undefined
  
  /**
    * A token for getting the next set of filters (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListFiltersResponse {
  
  @scala.inline
  def apply(): ListFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFiltersResponse]
  }
  
  @scala.inline
  implicit class ListFiltersResponseMutableBuilder[Self <: ListFiltersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: FilterSummary*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
