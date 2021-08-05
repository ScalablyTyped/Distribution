package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFrontDistributionCacheBehaviors extends StObject {
  
  /**
    * The cache behaviors for the distribution.
    */
  var Items: js.UndefOr[AwsCloudFrontDistributionCacheBehaviorsItemList] = js.undefined
}
object AwsCloudFrontDistributionCacheBehaviors {
  
  inline def apply(): AwsCloudFrontDistributionCacheBehaviors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionCacheBehaviors]
  }
  
  extension [Self <: AwsCloudFrontDistributionCacheBehaviors](x: Self) {
    
    inline def setItems(value: AwsCloudFrontDistributionCacheBehaviorsItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: AwsCloudFrontDistributionCacheBehavior*): Self = StObject.set(x, "Items", js.Array(value :_*))
  }
}
