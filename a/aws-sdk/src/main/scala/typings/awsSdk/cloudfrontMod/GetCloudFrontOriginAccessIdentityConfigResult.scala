package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCloudFrontOriginAccessIdentityConfigResult extends StObject {
  
  /**
    * The origin access identity's configuration information. 
    */
  var CloudFrontOriginAccessIdentityConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentityConfig] = js.native
  
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
}
object GetCloudFrontOriginAccessIdentityConfigResult {
  
  @scala.inline
  def apply(): GetCloudFrontOriginAccessIdentityConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityConfigResult]
  }
  
  @scala.inline
  implicit class GetCloudFrontOriginAccessIdentityConfigResultMutableBuilder[Self <: GetCloudFrontOriginAccessIdentityConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudFrontOriginAccessIdentityConfig(value: CloudFrontOriginAccessIdentityConfig): Self = StObject.set(x, "CloudFrontOriginAccessIdentityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudFrontOriginAccessIdentityConfigUndefined: Self = StObject.set(x, "CloudFrontOriginAccessIdentityConfig", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
  }
}
