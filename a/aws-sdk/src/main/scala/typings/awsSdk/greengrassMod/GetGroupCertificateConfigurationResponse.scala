package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGroupCertificateConfigurationResponse extends js.Object {
  
  /**
    * The amount of time remaining before the certificate authority expires, in milliseconds.
    */
  var CertificateAuthorityExpiryInMilliseconds: js.UndefOr[string] = js.native
  
  /**
    * The amount of time remaining before the certificate expires, in milliseconds.
    */
  var CertificateExpiryInMilliseconds: js.UndefOr[string] = js.native
  
  /**
    * The ID of the group certificate configuration.
    */
  var GroupId: js.UndefOr[string] = js.native
}
object GetGroupCertificateConfigurationResponse {
  
  @scala.inline
  def apply(): GetGroupCertificateConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupCertificateConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetGroupCertificateConfigurationResponseOps[Self <: GetGroupCertificateConfigurationResponse] (val x: Self) extends AnyVal {
    
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
    def setCertificateAuthorityExpiryInMilliseconds(value: string): Self = this.set("CertificateAuthorityExpiryInMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateAuthorityExpiryInMilliseconds: Self = this.set("CertificateAuthorityExpiryInMilliseconds", js.undefined)
    
    @scala.inline
    def setCertificateExpiryInMilliseconds(value: string): Self = this.set("CertificateExpiryInMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateExpiryInMilliseconds: Self = this.set("CertificateExpiryInMilliseconds", js.undefined)
    
    @scala.inline
    def setGroupId(value: string): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("GroupId", js.undefined)
  }
}
