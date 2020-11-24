package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyCertificatesMessage extends js.Object {
  
  /**
    * The new default certificate identifier to override the current one with. To determine the valid values, use the describe-certificates AWS CLI command or the DescribeCertificates API operation.
    */
  var CertificateIdentifier: js.UndefOr[String] = js.native
  
  /**
    * A value that indicates whether to remove the override for the default certificate. If the override is removed, the default certificate is the system default.
    */
  var RemoveCustomerOverride: js.UndefOr[BooleanOptional] = js.native
}
object ModifyCertificatesMessage {
  
  @scala.inline
  def apply(): ModifyCertificatesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCertificatesMessage]
  }
  
  @scala.inline
  implicit class ModifyCertificatesMessageOps[Self <: ModifyCertificatesMessage] (val x: Self) extends AnyVal {
    
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
    def setCertificateIdentifier(value: String): Self = this.set("CertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateIdentifier: Self = this.set("CertificateIdentifier", js.undefined)
    
    @scala.inline
    def setRemoveCustomerOverride(value: BooleanOptional): Self = this.set("RemoveCustomerOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveCustomerOverride: Self = this.set("RemoveCustomerOverride", js.undefined)
  }
}
