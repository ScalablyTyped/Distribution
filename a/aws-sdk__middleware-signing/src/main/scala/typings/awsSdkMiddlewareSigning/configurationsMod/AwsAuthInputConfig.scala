package typings.awsSdkMiddlewareSigning.configurationsMod

import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.signatureMod.RequestSigner
import typings.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsAuthInputConfig extends js.Object {
  
  /**
    * The credentials used to sign requests.
    */
  var credentials: js.UndefOr[Credentials | Provider[Credentials]] = js.native
  
  /**
    * The signer to use when signing requests.
    */
  var signer: js.UndefOr[RequestSigner | Provider[RequestSigner]] = js.native
  
  /**
    * Whether to escape request path when signing the request.
    */
  var signingEscapePath: js.UndefOr[Boolean] = js.native
  
  /**
    * The region where you want to sign your request against. This
    * can be different to the region in the endpoint.
    */
  var signingRegion: js.UndefOr[String] = js.native
  
  /**
    * An offset value in milliseconds to apply to all signing times.
    */
  var systemClockOffset: js.UndefOr[Double] = js.native
}
object AwsAuthInputConfig {
  
  @scala.inline
  def apply(): AwsAuthInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAuthInputConfig]
  }
  
  @scala.inline
  implicit class AwsAuthInputConfigOps[Self <: AwsAuthInputConfig] (val x: Self) extends AnyVal {
    
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
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setSignerFunction0(value: () => js.Promise[RequestSigner]): Self = this.set("signer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSigner(value: RequestSigner | Provider[RequestSigner]): Self = this.set("signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigner: Self = this.set("signer", js.undefined)
    
    @scala.inline
    def setSigningEscapePath(value: Boolean): Self = this.set("signingEscapePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningEscapePath: Self = this.set("signingEscapePath", js.undefined)
    
    @scala.inline
    def setSigningRegion(value: String): Self = this.set("signingRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningRegion: Self = this.set("signingRegion", js.undefined)
    
    @scala.inline
    def setSystemClockOffset(value: Double): Self = this.set("systemClockOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemClockOffset: Self = this.set("systemClockOffset", js.undefined)
  }
}
