package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryAggregationResponse extends StObject {
  
  /**
    * The ID of the Amazon Web Services account associated with the findings.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The number of container images impacted by the findings.
    */
  var affectedImages: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the repository associated with the findings.
    */
  var repository: NonEmptyString
  
  /**
    * An object that represent the count of matched findings per severity.
    */
  var severityCounts: js.UndefOr[SeverityCounts] = js.undefined
}
object RepositoryAggregationResponse {
  
  inline def apply(repository: NonEmptyString): RepositoryAggregationResponse = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryAggregationResponse]
  }
  
  extension [Self <: RepositoryAggregationResponse](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAffectedImages(value: Long): Self = StObject.set(x, "affectedImages", value.asInstanceOf[js.Any])
    
    inline def setAffectedImagesUndefined: Self = StObject.set(x, "affectedImages", js.undefined)
    
    inline def setRepository(value: NonEmptyString): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSeverityCounts(value: SeverityCounts): Self = StObject.set(x, "severityCounts", value.asInstanceOf[js.Any])
    
    inline def setSeverityCountsUndefined: Self = StObject.set(x, "severityCounts", js.undefined)
  }
}
