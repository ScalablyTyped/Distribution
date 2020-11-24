package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudFrontOriginAccessIdentity extends js.Object {
  
  /**
    * The current configuration information for the identity. 
    */
  var CloudFrontOriginAccessIdentityConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentityConfig] = js.native
  
  /**
    * The ID for the origin access identity, for example, E74FTE3AJFJ256A. 
    */
  var Id: String = js.native
  
  /**
    * The Amazon S3 canonical user ID for the origin access identity, used when giving the origin access identity read permission to an object in Amazon S3. 
    */
  var S3CanonicalUserId: String = js.native
}
object CloudFrontOriginAccessIdentity {
  
  @scala.inline
  def apply(Id: String, S3CanonicalUserId: String): CloudFrontOriginAccessIdentity = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], S3CanonicalUserId = S3CanonicalUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontOriginAccessIdentity]
  }
  
  @scala.inline
  implicit class CloudFrontOriginAccessIdentityOps[Self <: CloudFrontOriginAccessIdentity] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3CanonicalUserId(value: String): Self = this.set("S3CanonicalUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudFrontOriginAccessIdentityConfig(value: CloudFrontOriginAccessIdentityConfig): Self = this.set("CloudFrontOriginAccessIdentityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudFrontOriginAccessIdentityConfig: Self = this.set("CloudFrontOriginAccessIdentityConfig", js.undefined)
  }
}
