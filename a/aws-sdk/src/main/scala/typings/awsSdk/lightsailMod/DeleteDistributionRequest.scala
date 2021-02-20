package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDistributionRequest extends StObject {
  
  /**
    * The name of the distribution to delete. Use the GetDistributions action to get a list of distribution names that you can specify.
    */
  var distributionName: js.UndefOr[ResourceName] = js.native
}
object DeleteDistributionRequest {
  
  @scala.inline
  def apply(): DeleteDistributionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDistributionRequest]
  }
  
  @scala.inline
  implicit class DeleteDistributionRequestMutableBuilder[Self <: DeleteDistributionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionName(value: ResourceName): Self = StObject.set(x, "distributionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionNameUndefined: Self = StObject.set(x, "distributionName", js.undefined)
  }
}
