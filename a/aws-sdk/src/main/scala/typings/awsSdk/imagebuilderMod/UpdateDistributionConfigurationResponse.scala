package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDistributionConfigurationResponse extends StObject {
  
  /**
    * The idempotency token used to make this request idempotent. 
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration that was updated by this request. 
    */
  var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object UpdateDistributionConfigurationResponse {
  
  @scala.inline
  def apply(): UpdateDistributionConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDistributionConfigurationResponse]
  }
  
  @scala.inline
  implicit class UpdateDistributionConfigurationResponseMutableBuilder[Self <: UpdateDistributionConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setDistributionConfigurationArn(value: DistributionConfigurationArn): Self = StObject.set(x, "distributionConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionConfigurationArnUndefined: Self = StObject.set(x, "distributionConfigurationArn", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
