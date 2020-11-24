package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetrieveDomainAuthCodeResponse extends js.Object {
  
  /**
    * The authorization code for the domain.
    */
  var AuthCode: DomainAuthCode = js.native
}
object RetrieveDomainAuthCodeResponse {
  
  @scala.inline
  def apply(AuthCode: DomainAuthCode): RetrieveDomainAuthCodeResponse = {
    val __obj = js.Dynamic.literal(AuthCode = AuthCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveDomainAuthCodeResponse]
  }
  
  @scala.inline
  implicit class RetrieveDomainAuthCodeResponseOps[Self <: RetrieveDomainAuthCodeResponse] (val x: Self) extends AnyVal {
    
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
    def setAuthCode(value: DomainAuthCode): Self = this.set("AuthCode", value.asInstanceOf[js.Any])
  }
}
