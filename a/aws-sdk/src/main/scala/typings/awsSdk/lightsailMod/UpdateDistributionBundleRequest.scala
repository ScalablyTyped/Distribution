package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDistributionBundleRequest extends js.Object {
  
  /**
    * The bundle ID of the new bundle to apply to your distribution. Use the GetDistributionBundles action to get a list of distribution bundle IDs that you can specify.
    */
  var bundleId: js.UndefOr[String] = js.native
  
  /**
    * The name of the distribution for which to update the bundle. Use the GetDistributions action to get a list of distribution names that you can specify.
    */
  var distributionName: js.UndefOr[ResourceName] = js.native
}
object UpdateDistributionBundleRequest {
  
  @scala.inline
  def apply(): UpdateDistributionBundleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDistributionBundleRequest]
  }
  
  @scala.inline
  implicit class UpdateDistributionBundleRequestOps[Self <: UpdateDistributionBundleRequest] (val x: Self) extends AnyVal {
    
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
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    
    @scala.inline
    def setDistributionName(value: ResourceName): Self = this.set("distributionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributionName: Self = this.set("distributionName", js.undefined)
  }
}
