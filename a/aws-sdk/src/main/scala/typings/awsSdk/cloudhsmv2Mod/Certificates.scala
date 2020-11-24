package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificates extends js.Object {
  
  /**
    * The HSM hardware certificate issued (signed) by AWS CloudHSM.
    */
  var AwsHardwareCertificate: js.UndefOr[Cert] = js.native
  
  /**
    * The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
    */
  var ClusterCertificate: js.UndefOr[Cert] = js.native
  
  /**
    * The cluster's certificate signing request (CSR). The CSR exists only when the cluster's state is UNINITIALIZED.
    */
  var ClusterCsr: js.UndefOr[Cert] = js.native
  
  /**
    * The HSM certificate issued (signed) by the HSM hardware.
    */
  var HsmCertificate: js.UndefOr[Cert] = js.native
  
  /**
    * The HSM hardware certificate issued (signed) by the hardware manufacturer.
    */
  var ManufacturerHardwareCertificate: js.UndefOr[Cert] = js.native
}
object Certificates {
  
  @scala.inline
  def apply(): Certificates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificates]
  }
  
  @scala.inline
  implicit class CertificatesOps[Self <: Certificates] (val x: Self) extends AnyVal {
    
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
    def setAwsHardwareCertificate(value: Cert): Self = this.set("AwsHardwareCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsHardwareCertificate: Self = this.set("AwsHardwareCertificate", js.undefined)
    
    @scala.inline
    def setClusterCertificate(value: Cert): Self = this.set("ClusterCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterCertificate: Self = this.set("ClusterCertificate", js.undefined)
    
    @scala.inline
    def setClusterCsr(value: Cert): Self = this.set("ClusterCsr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterCsr: Self = this.set("ClusterCsr", js.undefined)
    
    @scala.inline
    def setHsmCertificate(value: Cert): Self = this.set("HsmCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmCertificate: Self = this.set("HsmCertificate", js.undefined)
    
    @scala.inline
    def setManufacturerHardwareCertificate(value: Cert): Self = this.set("ManufacturerHardwareCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturerHardwareCertificate: Self = this.set("ManufacturerHardwareCertificate", js.undefined)
  }
}
