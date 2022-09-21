package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageLayerAggregationResponse extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that owns the container image hosting the layer image.
    */
  var accountId: AccountId
  
  /**
    * The layer hash.
    */
  var layerHash: NonEmptyString
  
  /**
    * The repository the layer resides in.
    */
  var repository: NonEmptyString
  
  /**
    * The resource ID of the container image layer.
    */
  var resourceId: NonEmptyString
  
  /**
    * An object that represents the count of matched findings per severity.
    */
  var severityCounts: js.UndefOr[SeverityCounts] = js.undefined
}
object ImageLayerAggregationResponse {
  
  inline def apply(
    accountId: AccountId,
    layerHash: NonEmptyString,
    repository: NonEmptyString,
    resourceId: NonEmptyString
  ): ImageLayerAggregationResponse = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], layerHash = layerHash.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLayerAggregationResponse]
  }
  
  extension [Self <: ImageLayerAggregationResponse](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setLayerHash(value: NonEmptyString): Self = StObject.set(x, "layerHash", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: NonEmptyString): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: NonEmptyString): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setSeverityCounts(value: SeverityCounts): Self = StObject.set(x, "severityCounts", value.asInstanceOf[js.Any])
    
    inline def setSeverityCountsUndefined: Self = StObject.set(x, "severityCounts", js.undefined)
  }
}
