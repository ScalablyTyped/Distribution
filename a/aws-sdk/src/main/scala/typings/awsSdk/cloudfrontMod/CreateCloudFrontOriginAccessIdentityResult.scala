package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCloudFrontOriginAccessIdentityResult extends StObject {
  
  /**
    * The origin access identity's information.
    */
  var CloudFrontOriginAccessIdentity: js.UndefOr[typings.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentity] = js.undefined
  
  /**
    * The current version of the origin access identity created.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The fully qualified URI of the new origin access identity just created.
    */
  var Location: js.UndefOr[String] = js.undefined
}
object CreateCloudFrontOriginAccessIdentityResult {
  
  @scala.inline
  def apply(): CreateCloudFrontOriginAccessIdentityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCloudFrontOriginAccessIdentityResult]
  }
  
  @scala.inline
  implicit class CreateCloudFrontOriginAccessIdentityResultMutableBuilder[Self <: CreateCloudFrontOriginAccessIdentityResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudFrontOriginAccessIdentity(value: CloudFrontOriginAccessIdentity): Self = StObject.set(x, "CloudFrontOriginAccessIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudFrontOriginAccessIdentityUndefined: Self = StObject.set(x, "CloudFrontOriginAccessIdentity", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
