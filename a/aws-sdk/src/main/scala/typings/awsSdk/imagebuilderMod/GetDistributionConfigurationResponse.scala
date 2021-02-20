package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDistributionConfigurationResponse extends StObject {
  
  /**
    * The distribution configuration object. 
    */
  var distributionConfiguration: js.UndefOr[DistributionConfiguration] = js.native
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object GetDistributionConfigurationResponse {
  
  @scala.inline
  def apply(): GetDistributionConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetDistributionConfigurationResponseMutableBuilder[Self <: GetDistributionConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionConfiguration(value: DistributionConfiguration): Self = StObject.set(x, "distributionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionConfigurationUndefined: Self = StObject.set(x, "distributionConfiguration", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
