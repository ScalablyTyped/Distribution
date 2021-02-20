package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCloudFrontDistributionCacheBehaviors extends StObject {
  
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
  implicit class AwsCloudFrontDistributionCacheBehaviorsMutableBuilder[Self <: AwsCloudFrontDistributionCacheBehaviors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: AwsCloudFrontDistributionCacheBehaviorsItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: AwsCloudFrontDistributionCacheBehavior*): Self = StObject.set(x, "Items", js.Array(value :_*))
  }
}
