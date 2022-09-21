package typings.awsSdk.resiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationItem extends StObject {
  
  /**
    * Specifies if the recommendation has already been implemented.
    */
  var alreadyImplemented: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The resource identifier.
    */
  var resourceId: js.UndefOr[String500] = js.undefined
  
  /**
    * The target account identifier.
    */
  var targetAccountId: js.UndefOr[CustomerId] = js.undefined
  
  /**
    * The target region.
    */
  var targetRegion: js.UndefOr[AwsRegion] = js.undefined
}
object RecommendationItem {
  
  inline def apply(): RecommendationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationItem]
  }
  
  extension [Self <: RecommendationItem](x: Self) {
    
    inline def setAlreadyImplemented(value: BooleanOptional): Self = StObject.set(x, "alreadyImplemented", value.asInstanceOf[js.Any])
    
    inline def setAlreadyImplementedUndefined: Self = StObject.set(x, "alreadyImplemented", js.undefined)
    
    inline def setResourceId(value: String500): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setTargetAccountId(value: CustomerId): Self = StObject.set(x, "targetAccountId", value.asInstanceOf[js.Any])
    
    inline def setTargetAccountIdUndefined: Self = StObject.set(x, "targetAccountId", js.undefined)
    
    inline def setTargetRegion(value: AwsRegion): Self = StObject.set(x, "targetRegion", value.asInstanceOf[js.Any])
    
    inline def setTargetRegionUndefined: Self = StObject.set(x, "targetRegion", js.undefined)
  }
}
