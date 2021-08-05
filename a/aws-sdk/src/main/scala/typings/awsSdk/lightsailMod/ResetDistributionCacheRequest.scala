package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetDistributionCacheRequest extends StObject {
  
  /**
    * The name of the distribution for which to reset cache. Use the GetDistributions action to get a list of distribution names that you can specify.
    */
  var distributionName: js.UndefOr[ResourceName] = js.undefined
}
object ResetDistributionCacheRequest {
  
  inline def apply(): ResetDistributionCacheRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetDistributionCacheRequest]
  }
  
  extension [Self <: ResetDistributionCacheRequest](x: Self) {
    
    inline def setDistributionName(value: ResourceName): Self = StObject.set(x, "distributionName", value.asInstanceOf[js.Any])
    
    inline def setDistributionNameUndefined: Self = StObject.set(x, "distributionName", js.undefined)
  }
}
