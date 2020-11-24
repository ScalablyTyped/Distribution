package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetDistributionCacheRequest extends js.Object {
  
  /**
    * The name of the distribution for which to reset cache. Use the GetDistributions action to get a list of distribution names that you can specify.
    */
  var distributionName: js.UndefOr[ResourceName] = js.native
}
object ResetDistributionCacheRequest {
  
  @scala.inline
  def apply(): ResetDistributionCacheRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetDistributionCacheRequest]
  }
  
  @scala.inline
  implicit class ResetDistributionCacheRequestOps[Self <: ResetDistributionCacheRequest] (val x: Self) extends AnyVal {
    
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
