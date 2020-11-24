package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSAMLProviderResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the new SAML provider resource in IAM.
    */
  var SAMLProviderArn: js.UndefOr[arnType] = js.native
}
object CreateSAMLProviderResponse {
  
  @scala.inline
  def apply(): CreateSAMLProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSAMLProviderResponse]
  }
  
  @scala.inline
  implicit class CreateSAMLProviderResponseOps[Self <: CreateSAMLProviderResponse] (val x: Self) extends AnyVal {
    
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
    def setSAMLProviderArn(value: arnType): Self = this.set("SAMLProviderArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSAMLProviderArn: Self = this.set("SAMLProviderArn", js.undefined)
  }
}
