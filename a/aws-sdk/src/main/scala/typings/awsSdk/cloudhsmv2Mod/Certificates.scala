package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    AwsHardwareCertificate: Cert = null,
    ClusterCertificate: Cert = null,
    ClusterCsr: Cert = null,
    HsmCertificate: Cert = null,
    ManufacturerHardwareCertificate: Cert = null
  ): Certificates = {
    val __obj = js.Dynamic.literal()
    if (AwsHardwareCertificate != null) __obj.updateDynamic("AwsHardwareCertificate")(AwsHardwareCertificate.asInstanceOf[js.Any])
    if (ClusterCertificate != null) __obj.updateDynamic("ClusterCertificate")(ClusterCertificate.asInstanceOf[js.Any])
    if (ClusterCsr != null) __obj.updateDynamic("ClusterCsr")(ClusterCsr.asInstanceOf[js.Any])
    if (HsmCertificate != null) __obj.updateDynamic("HsmCertificate")(HsmCertificate.asInstanceOf[js.Any])
    if (ManufacturerHardwareCertificate != null) __obj.updateDynamic("ManufacturerHardwareCertificate")(ManufacturerHardwareCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificates]
  }
}

