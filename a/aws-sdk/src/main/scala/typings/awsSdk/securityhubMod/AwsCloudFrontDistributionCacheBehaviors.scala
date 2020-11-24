package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCloudFrontDistributionCacheBehaviors extends js.Object {
  
  /**
    * The cache behaviors for the distribution.
    */
  var Items: js.UndefOr[AwsCloudFrontDistributionCacheBehaviorsItemList] = js.native
}
object AwsCloudFrontDistributionCacheBehaviors {
  
  @scala.inline
  def apply(): AwsCloudFrontDistributionCacheBehaviors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionCacheBehaviors]
  }
  
  @scala.inline
  implicit class AwsCloudFrontDistributionCacheBehaviorsOps[Self <: AwsCloudFrontDistributionCacheBehaviors] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: AwsCloudFrontDistributionCacheBehavior*): Self = this.set("Items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: AwsCloudFrontDistributionCacheBehaviorsItemList): Self = this.set("Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
  }
}
