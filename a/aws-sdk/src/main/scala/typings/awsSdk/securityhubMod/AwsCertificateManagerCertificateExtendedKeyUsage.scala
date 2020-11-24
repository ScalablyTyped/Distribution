package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCertificateManagerCertificateExtendedKeyUsage extends js.Object {
  
  /**
    * The name of an extension value. Indicates the purpose for which the certificate public key can be used.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * An object identifier (OID) for the extension value. The format is numbers separated by periods.
    */
  var OId: js.UndefOr[NonEmptyString] = js.native
}
object AwsCertificateManagerCertificateExtendedKeyUsage {
  
  @scala.inline
  def apply(): AwsCertificateManagerCertificateExtendedKeyUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCertificateManagerCertificateExtendedKeyUsage]
  }
  
  @scala.inline
  implicit class AwsCertificateManagerCertificateExtendedKeyUsageOps[Self <: AwsCertificateManagerCertificateExtendedKeyUsage] (val x: Self) extends AnyVal {
    
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
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOId(value: NonEmptyString): Self = this.set("OId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOId: Self = this.set("OId", js.undefined)
  }
}
