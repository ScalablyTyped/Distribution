package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformBranchSummary extends js.Object {
  
  /**
    * The name of the platform branch.
    */
  var BranchName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.BranchName] = js.native
  
  /**
    * An ordinal number that designates the order in which platform branches have been added to a platform. This can be helpful, for example, if your code calls the ListPlatformBranches action and then displays a list of platform branches. A larger BranchOrder value designates a newer platform branch within the platform.
    */
  var BranchOrder: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.BranchOrder] = js.native
  
  /**
    * The support life cycle state of the platform branch. Possible values: beta | supported | deprecated | retired 
    */
  var LifecycleState: js.UndefOr[PlatformBranchLifecycleState] = js.native
  
  /**
    * The name of the platform to which this platform branch belongs.
    */
  var PlatformName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformName] = js.native
  
  /**
    * The environment tiers that platform versions in this branch support. Possible values: WebServer/Standard | Worker/SQS/HTTP 
    */
  var SupportedTierList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SupportedTierList] = js.native
}
object PlatformBranchSummary {
  
  @scala.inline
  def apply(): PlatformBranchSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformBranchSummary]
  }
  
  @scala.inline
  implicit class PlatformBranchSummaryOps[Self <: PlatformBranchSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBranchName(value: BranchName): Self = this.set("BranchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranchName: Self = this.set("BranchName", js.undefined)
    
    @scala.inline
    def setBranchOrder(value: BranchOrder): Self = this.set("BranchOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranchOrder: Self = this.set("BranchOrder", js.undefined)
    
    @scala.inline
    def setLifecycleState(value: PlatformBranchLifecycleState): Self = this.set("LifecycleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycleState: Self = this.set("LifecycleState", js.undefined)
    
    @scala.inline
    def setPlatformName(value: PlatformName): Self = this.set("PlatformName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformName: Self = this.set("PlatformName", js.undefined)
    
    @scala.inline
    def setSupportedTierListVarargs(value: SupportedTier*): Self = this.set("SupportedTierList", js.Array(value :_*))
    
    @scala.inline
    def setSupportedTierList(value: SupportedTierList): Self = this.set("SupportedTierList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedTierList: Self = this.set("SupportedTierList", js.undefined)
  }
}
