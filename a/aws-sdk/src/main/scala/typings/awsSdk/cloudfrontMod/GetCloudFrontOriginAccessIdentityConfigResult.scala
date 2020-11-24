package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCloudFrontOriginAccessIdentityConfigResult extends js.Object {
  
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
  implicit class GetCloudFrontOriginAccessIdentityConfigResultOps[Self <: GetCloudFrontOriginAccessIdentityConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloudFrontOriginAccessIdentityConfig(value: CloudFrontOriginAccessIdentityConfig): Self = this.set("CloudFrontOriginAccessIdentityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudFrontOriginAccessIdentityConfig: Self = this.set("CloudFrontOriginAccessIdentityConfig", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
  }
}
