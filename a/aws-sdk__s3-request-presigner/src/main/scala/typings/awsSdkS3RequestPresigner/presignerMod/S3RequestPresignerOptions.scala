package typings.awsSdkS3RequestPresigner.presignerMod

import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @aws-sdk/s3-request-presigner.@aws-sdk/s3-request-presigner/dist/cjs/presigner.PartialBy<@aws-sdk/signature-v4.@aws-sdk/signature-v4.SignatureV4Init & @aws-sdk/signature-v4.@aws-sdk/signature-v4.SignatureV4CryptoInit, 'service' | 'uriEscapePath'> & {  signingName :string | undefined} */
@js.native
trait S3RequestPresignerOptions extends js.Object {
  
  var applyChecksum: js.UndefOr[Boolean] = js.native
  
  var credentials: Credentials | Provider[Credentials] = js.native
  
  var region: String | Provider[String] = js.native
  
  var service: js.UndefOr[String] = js.native
  
  var sha256: js.UndefOr[HashConstructor] = js.native
  
  var signingName: js.UndefOr[String] = js.native
  
  var uriEscapePath: js.UndefOr[Boolean] = js.native
}
object S3RequestPresignerOptions {
  
  @scala.inline
  def apply(credentials: Credentials | Provider[Credentials], region: String | Provider[String]): S3RequestPresignerOptions = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3RequestPresignerOptions]
  }
  
  @scala.inline
  implicit class S3RequestPresignerOptionsOps[Self <: S3RequestPresignerOptions] (val x: Self) extends AnyVal {
    
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
    def setCredentialsFunction0(value: () => js.Promise[Credentials]): Self = this.set("credentials", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCredentials(value: Credentials | Provider[Credentials]): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionFunction0(value: () => js.Promise[String]): Self = this.set("region", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegion(value: String | Provider[String]): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyChecksum(value: Boolean): Self = this.set("applyChecksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyChecksum: Self = this.set("applyChecksum", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setSha256(value: HashConstructor): Self = this.set("sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha256: Self = this.set("sha256", js.undefined)
    
    @scala.inline
    def setSigningName(value: String): Self = this.set("signingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningName: Self = this.set("signingName", js.undefined)
    
    @scala.inline
    def setUriEscapePath(value: Boolean): Self = this.set("uriEscapePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUriEscapePath: Self = this.set("uriEscapePath", js.undefined)
  }
}
