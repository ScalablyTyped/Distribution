package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCloudFrontOriginAccessIdentityRequest extends StObject {
  
  /**
    * The identity's configuration information.
    */
  var CloudFrontOriginAccessIdentityConfig: typings.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentityConfig = js.native
  
  /**
    * The identity's id.
    */
  var Id: String = js.native
  
  /**
    * The value of the ETag header that you received when retrieving the identity's configuration. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.native
}
object UpdateCloudFrontOriginAccessIdentityRequest {
  
  @scala.inline
  def apply(CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig, Id: String): UpdateCloudFrontOriginAccessIdentityRequest = {
    val __obj = js.Dynamic.literal(CloudFrontOriginAccessIdentityConfig = CloudFrontOriginAccessIdentityConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCloudFrontOriginAccessIdentityRequest]
  }
  
  @scala.inline
  implicit class UpdateCloudFrontOriginAccessIdentityRequestMutableBuilder[Self <: UpdateCloudFrontOriginAccessIdentityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudFrontOriginAccessIdentityConfig(value: CloudFrontOriginAccessIdentityConfig): Self = StObject.set(x, "CloudFrontOriginAccessIdentityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
