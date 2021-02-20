package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCloudFrontOriginAccessIdentityRequest extends StObject {
  
  /**
    * The current configuration information for the identity.
    */
  var CloudFrontOriginAccessIdentityConfig: typings.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentityConfig = js.native
}
object CreateCloudFrontOriginAccessIdentityRequest {
  
  @scala.inline
  def apply(CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig): CreateCloudFrontOriginAccessIdentityRequest = {
    val __obj = js.Dynamic.literal(CloudFrontOriginAccessIdentityConfig = CloudFrontOriginAccessIdentityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCloudFrontOriginAccessIdentityRequest]
  }
  
  @scala.inline
  implicit class CreateCloudFrontOriginAccessIdentityRequestMutableBuilder[Self <: CreateCloudFrontOriginAccessIdentityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudFrontOriginAccessIdentityConfig(value: CloudFrontOriginAccessIdentityConfig): Self = StObject.set(x, "CloudFrontOriginAccessIdentityConfig", value.asInstanceOf[js.Any])
  }
}
