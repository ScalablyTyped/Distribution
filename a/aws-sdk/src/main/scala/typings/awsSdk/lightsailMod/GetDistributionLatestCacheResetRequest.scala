package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDistributionLatestCacheResetRequest extends StObject {
  
  /**
    * The name of the distribution for which to return the timestamp of the last cache reset. Use the GetDistributions action to get a list of distribution names that you can specify. When omitted, the response includes the latest cache reset timestamp of all your distributions.
    */
  var distributionName: js.UndefOr[ResourceName] = js.native
}
object GetDistributionLatestCacheResetRequest {
  
  @scala.inline
  def apply(): GetDistributionLatestCacheResetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionLatestCacheResetRequest]
  }
  
  @scala.inline
  implicit class GetDistributionLatestCacheResetRequestMutableBuilder[Self <: GetDistributionLatestCacheResetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionName(value: ResourceName): Self = StObject.set(x, "distributionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionNameUndefined: Self = StObject.set(x, "distributionName", js.undefined)
  }
}
