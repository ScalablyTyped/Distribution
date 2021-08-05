package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCloudFrontOriginAccessIdentityConfigResult extends StObject {
  
  /**
    * The origin access identity's configuration information. 
    */
  var CloudFrontOriginAccessIdentityConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentityConfig] = js.undefined
  
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
}
object GetCloudFrontOriginAccessIdentityConfigResult {
  
  inline def apply(): GetCloudFrontOriginAccessIdentityConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityConfigResult]
  }
  
  extension [Self <: GetCloudFrontOriginAccessIdentityConfigResult](x: Self) {
    
    inline def setCloudFrontOriginAccessIdentityConfig(value: CloudFrontOriginAccessIdentityConfig): Self = StObject.set(x, "CloudFrontOriginAccessIdentityConfig", value.asInstanceOf[js.Any])
    
    inline def setCloudFrontOriginAccessIdentityConfigUndefined: Self = StObject.set(x, "CloudFrontOriginAccessIdentityConfig", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
  }
}
