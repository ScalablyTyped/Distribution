package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDistributionLatestCacheResetRequest extends js.Object {
  
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
  implicit class GetDistributionLatestCacheResetRequestOps[Self <: GetDistributionLatestCacheResetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDistributionName(value: ResourceName): Self = this.set("distributionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributionName: Self = this.set("distributionName", js.undefined)
  }
}
