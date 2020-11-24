package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateWebsiteCertificateAuthorityResponse extends js.Object {
  
  /**
    * A unique identifier for the CA.
    */
  var WebsiteCaId: js.UndefOr[Id] = js.native
}
object AssociateWebsiteCertificateAuthorityResponse {
  
  @scala.inline
  def apply(): AssociateWebsiteCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateWebsiteCertificateAuthorityResponse]
  }
  
  @scala.inline
  implicit class AssociateWebsiteCertificateAuthorityResponseOps[Self <: AssociateWebsiteCertificateAuthorityResponse] (val x: Self) extends AnyVal {
    
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
    def setWebsiteCaId(value: Id): Self = this.set("WebsiteCaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsiteCaId: Self = this.set("WebsiteCaId", js.undefined)
  }
}
