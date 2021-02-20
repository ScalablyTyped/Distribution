package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCloudFrontOriginAccessIdentityResult extends StObject {
  
  /**
    * The origin access identity's information.
    */
  var CloudFrontOriginAccessIdentity: js.UndefOr[typings.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentity] = js.native
  
  /**
    * The current version of the origin access identity's information. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
}
object GetCloudFrontOriginAccessIdentityResult {
  
  @scala.inline
  def apply(): GetCloudFrontOriginAccessIdentityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityResult]
  }
  
  @scala.inline
  implicit class GetCloudFrontOriginAccessIdentityResultMutableBuilder[Self <: GetCloudFrontOriginAccessIdentityResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudFrontOriginAccessIdentity(value: CloudFrontOriginAccessIdentity): Self = StObject.set(x, "CloudFrontOriginAccessIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudFrontOriginAccessIdentityUndefined: Self = StObject.set(x, "CloudFrontOriginAccessIdentity", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
  }
}
