package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryAggregation extends StObject {
  
  /**
    * The names of repositories to aggregate findings on.
    */
  var repositories: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The value to sort results by.
    */
  var sortBy: js.UndefOr[RepositorySortBy] = js.undefined
  
  /**
    * The order to sort results by.
    */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}
object RepositoryAggregation {
  
  inline def apply(): RepositoryAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryAggregation]
  }
  
  extension [Self <: RepositoryAggregation](x: Self) {
    
    inline def setRepositories(value: StringFilterList): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    inline def setRepositoriesVarargs(value: StringFilter*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setSortBy(value: RepositorySortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
