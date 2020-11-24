package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FederatedAuthenticationRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
    */
  var SAMLProviderArn: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
    */
  var SelfServiceSAMLProviderArn: js.UndefOr[String] = js.native
}
object FederatedAuthenticationRequest {
  
  @scala.inline
  def apply(): FederatedAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FederatedAuthenticationRequest]
  }
  
  @scala.inline
  implicit class FederatedAuthenticationRequestOps[Self <: FederatedAuthenticationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSAMLProviderArn(value: String): Self = this.set("SAMLProviderArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSAMLProviderArn: Self = this.set("SAMLProviderArn", js.undefined)
    
    @scala.inline
    def setSelfServiceSAMLProviderArn(value: String): Self = this.set("SelfServiceSAMLProviderArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfServiceSAMLProviderArn: Self = this.set("SelfServiceSAMLProviderArn", js.undefined)
  }
}
