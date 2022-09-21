package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataRepositoryAssociationsRequest extends StObject {
  
  /**
    * IDs of the data repository associations whose descriptions you want to retrieve (String).
    */
  var AssociationIds: js.UndefOr[DataRepositoryAssociationIds] = js.undefined
  
  var Filters: js.UndefOr[typings.awsSdk.fsxMod.Filters] = js.undefined
  
  /**
    * The maximum number of resources to return in the response. This value must be an integer greater than zero.
    */
  var MaxResults: js.UndefOr[LimitedMaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.fsxMod.NextToken] = js.undefined
}
object DescribeDataRepositoryAssociationsRequest {
  
  inline def apply(): DescribeDataRepositoryAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataRepositoryAssociationsRequest]
  }
  
  extension [Self <: DescribeDataRepositoryAssociationsRequest](x: Self) {
    
    inline def setAssociationIds(value: DataRepositoryAssociationIds): Self = StObject.set(x, "AssociationIds", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdsUndefined: Self = StObject.set(x, "AssociationIds", js.undefined)
    
    inline def setAssociationIdsVarargs(value: DataRepositoryAssociationId*): Self = StObject.set(x, "AssociationIds", js.Array(value*))
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: LimitedMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
