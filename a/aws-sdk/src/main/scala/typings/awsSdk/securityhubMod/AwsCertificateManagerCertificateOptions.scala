package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCertificateManagerCertificateOptions extends js.Object {
  
  /**
    * Whether to add the certificate to a transparency log. Valid values: DISABLED | ENABLED 
    */
  var CertificateTransparencyLoggingPreference: js.UndefOr[NonEmptyString] = js.native
}
object AwsCertificateManagerCertificateOptions {
  
  @scala.inline
  def apply(): AwsCertificateManagerCertificateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCertificateManagerCertificateOptions]
  }
  
  @scala.inline
  implicit class AwsCertificateManagerCertificateOptionsOps[Self <: AwsCertificateManagerCertificateOptions] (val x: Self) extends AnyVal {
    
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
    def setCertificateTransparencyLoggingPreference(value: NonEmptyString): Self = this.set("CertificateTransparencyLoggingPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateTransparencyLoggingPreference: Self = this.set("CertificateTransparencyLoggingPreference", js.undefined)
  }
}
