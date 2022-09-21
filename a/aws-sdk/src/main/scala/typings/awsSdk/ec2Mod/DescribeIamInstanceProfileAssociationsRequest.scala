package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIamInstanceProfileAssociationsRequest extends StObject {
  
  /**
    * The IAM instance profile associations.
    */
  var AssociationIds: js.UndefOr[AssociationIdList] = js.undefined
  
  /**
    * The filters.    instance-id - The ID of the instance.    state - The state of the association (associating | associated | disassociating).  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[DescribeIamInstanceProfileAssociationsMaxResults] = js.undefined
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
}
object DescribeIamInstanceProfileAssociationsRequest {
  
  inline def apply(): DescribeIamInstanceProfileAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIamInstanceProfileAssociationsRequest]
  }
  
  extension [Self <: DescribeIamInstanceProfileAssociationsRequest](x: Self) {
    
    inline def setAssociationIds(value: AssociationIdList): Self = StObject.set(x, "AssociationIds", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdsUndefined: Self = StObject.set(x, "AssociationIds", js.undefined)
    
    inline def setAssociationIdsVarargs(value: IamInstanceProfileAssociationId*): Self = StObject.set(x, "AssociationIds", js.Array(value*))
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: DescribeIamInstanceProfileAssociationsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
