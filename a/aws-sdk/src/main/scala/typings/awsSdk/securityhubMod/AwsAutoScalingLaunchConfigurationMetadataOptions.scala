package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsAutoScalingLaunchConfigurationMetadataOptions extends StObject {
  
  /**
    * Enables or disables the HTTP metadata endpoint on your instances. By default, the metadata endpoint is enabled.
    */
  var HttpEndpoint: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel.
    */
  var HttpPutResponseHopLimit: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates whether token usage is required or optional for metadata requests. By default, token usage is optional.
    */
  var HttpTokens: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsAutoScalingLaunchConfigurationMetadataOptions {
  
  inline def apply(): AwsAutoScalingLaunchConfigurationMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAutoScalingLaunchConfigurationMetadataOptions]
  }
  
  extension [Self <: AwsAutoScalingLaunchConfigurationMetadataOptions](x: Self) {
    
    inline def setHttpEndpoint(value: NonEmptyString): Self = StObject.set(x, "HttpEndpoint", value.asInstanceOf[js.Any])
    
    inline def setHttpEndpointUndefined: Self = StObject.set(x, "HttpEndpoint", js.undefined)
    
    inline def setHttpPutResponseHopLimit(value: Integer): Self = StObject.set(x, "HttpPutResponseHopLimit", value.asInstanceOf[js.Any])
    
    inline def setHttpPutResponseHopLimitUndefined: Self = StObject.set(x, "HttpPutResponseHopLimit", js.undefined)
    
    inline def setHttpTokens(value: NonEmptyString): Self = StObject.set(x, "HttpTokens", value.asInstanceOf[js.Any])
    
    inline def setHttpTokensUndefined: Self = StObject.set(x, "HttpTokens", js.undefined)
  }
}
