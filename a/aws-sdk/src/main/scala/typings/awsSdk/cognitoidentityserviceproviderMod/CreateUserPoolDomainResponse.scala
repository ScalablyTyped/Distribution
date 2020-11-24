package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserPoolDomainResponse extends js.Object {
  
  /**
    * The Amazon CloudFront endpoint that you use as the target of the alias that you set up with your Domain Name Service (DNS) provider.
    */
  var CloudFrontDomain: js.UndefOr[DomainType] = js.native
}
object CreateUserPoolDomainResponse {
  
  @scala.inline
  def apply(): CreateUserPoolDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserPoolDomainResponse]
  }
  
  @scala.inline
  implicit class CreateUserPoolDomainResponseOps[Self <: CreateUserPoolDomainResponse] (val x: Self) extends AnyVal {
    
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
    def setCloudFrontDomain(value: DomainType): Self = this.set("CloudFrontDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudFrontDomain: Self = this.set("CloudFrontDomain", js.undefined)
  }
}
