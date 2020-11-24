package typings.awsSdkQueryRequestPresigner.mod

import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresignOption extends js.Object {
  
  /**
    * credentials used to sign the request.
    */
  var credentials: Credentials = js.native
  
  /**
    * Use endpoint other than that in request
    * @default request the same endpoint as in the request
    */
  var endpoint: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ js.Any
  ] = js.native
  
  /**
    * The time span in second that the presigned url lives
    * @default 3600
    */
  var expireTime: js.UndefOr[Double] = js.native
  
  var sha256: HashConstructor = js.native
  
  /**
    * The service name used to sign the request
    */
  var signingName: String = js.native
  
  /**
    * The region that signer used to sign. Usally the same as
    * that in request hostname
    */
  var signingRegion: String = js.native
}
object PresignOption {
  
  @scala.inline
  def apply(credentials: Credentials, sha256: HashConstructor, signingName: String, signingRegion: String): PresignOption = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], signingName = signingName.asInstanceOf[js.Any], signingRegion = signingRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresignOption]
  }
  
  @scala.inline
  implicit class PresignOptionOps[Self <: PresignOption] (val x: Self) extends AnyVal {
    
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
    def setCredentials(value: Credentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256(value: HashConstructor): Self = this.set("sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningName(value: String): Self = this.set("signingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningRegion(value: String): Self = this.set("signingRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoint(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ js.Any
    ): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setExpireTime(value: Double): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
  }
}
