package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnTunnelOptionsSpecification extends js.Object {
  /**
    * The number of seconds after which a DPD timeout occurs. Constraints: A value between 0 and 30. Default: 30 
    */
  var DPDTimeoutSeconds: js.UndefOr[Integer] = js.native
  /**
    * The IKE versions that are permitted for the VPN tunnel. Valid values: ikev1 | ikev2 
    */
  var IKEVersions: js.UndefOr[IKEVersionsRequestList] = js.native
  /**
    * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 1 IKE negotiations. Valid values: 2 | 14 | 15 | 16 | 17 | 18 | 22 | 23 | 24 
    */
  var Phase1DHGroupNumbers: js.UndefOr[Phase1DHGroupNumbersRequestList] = js.native
  /**
    * One or more encryption algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations. Valid values: AES128 | AES256 
    */
  var Phase1EncryptionAlgorithms: js.UndefOr[Phase1EncryptionAlgorithmsRequestList] = js.native
  /**
    * One or more integrity algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations. Valid values: SHA1 | SHA2-256 
    */
  var Phase1IntegrityAlgorithms: js.UndefOr[Phase1IntegrityAlgorithmsRequestList] = js.native
  /**
    * The lifetime for phase 1 of the IKE negotiation, in seconds. Constraints: A value between 900 and 28,800. Default: 28800 
    */
  var Phase1LifetimeSeconds: js.UndefOr[Integer] = js.native
  /**
    * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 2 IKE negotiations. Valid values: 2 | 5 | 14 | 15 | 16 | 17 | 18 | 22 | 23 | 24 
    */
  var Phase2DHGroupNumbers: js.UndefOr[Phase2DHGroupNumbersRequestList] = js.native
  /**
    * One or more encryption algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations. Valid values: AES128 | AES256 
    */
  var Phase2EncryptionAlgorithms: js.UndefOr[Phase2EncryptionAlgorithmsRequestList] = js.native
  /**
    * One or more integrity algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations. Valid values: SHA1 | SHA2-256 
    */
  var Phase2IntegrityAlgorithms: js.UndefOr[Phase2IntegrityAlgorithmsRequestList] = js.native
  /**
    * The lifetime for phase 2 of the IKE negotiation, in seconds. Constraints: A value between 900 and 3,600. The value must be less than the value for Phase1LifetimeSeconds. Default: 3600 
    */
  var Phase2LifetimeSeconds: js.UndefOr[Integer] = js.native
  /**
    * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and customer gateway. Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores (_). Must be between 8 and 64 characters in length and cannot start with zero (0).
    */
  var PreSharedKey: js.UndefOr[String] = js.native
  /**
    * The percentage of the rekey window (determined by RekeyMarginTimeSeconds) during which the rekey time is randomly selected. Constraints: A value between 0 and 100. Default: 100 
    */
  var RekeyFuzzPercentage: js.UndefOr[Integer] = js.native
  /**
    * The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN connection performs an IKE rekey. The exact time of the rekey is randomly selected based on the value for RekeyFuzzPercentage. Constraints: A value between 60 and half of Phase2LifetimeSeconds. Default: 540 
    */
  var RekeyMarginTimeSeconds: js.UndefOr[Integer] = js.native
  /**
    * The number of packets in an IKE replay window. Constraints: A value between 64 and 2048. Default: 1024 
    */
  var ReplayWindowSize: js.UndefOr[Integer] = js.native
  /**
    * The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN connections that use the same virtual private gateway.  Constraints: A size /30 CIDR block from the 169.254.0.0/16 range. The following CIDR blocks are reserved and cannot be used:    169.254.0.0/30     169.254.1.0/30     169.254.2.0/30     169.254.3.0/30     169.254.4.0/30     169.254.5.0/30     169.254.169.252/30   
    */
  var TunnelInsideCidr: js.UndefOr[String] = js.native
}

object VpnTunnelOptionsSpecification {
  @scala.inline
  def apply(): VpnTunnelOptionsSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnTunnelOptionsSpecification]
  }
  @scala.inline
  implicit class VpnTunnelOptionsSpecificationOps[Self <: VpnTunnelOptionsSpecification] (val x: Self) extends AnyVal {
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
    def setDPDTimeoutSeconds(value: Integer): Self = this.set("DPDTimeoutSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDPDTimeoutSeconds: Self = this.set("DPDTimeoutSeconds", js.undefined)
    @scala.inline
    def setIKEVersionsVarargs(value: IKEVersionsRequestListValue*): Self = this.set("IKEVersions", js.Array(value :_*))
    @scala.inline
    def setIKEVersions(value: IKEVersionsRequestList): Self = this.set("IKEVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIKEVersions: Self = this.set("IKEVersions", js.undefined)
    @scala.inline
    def setPhase1DHGroupNumbersVarargs(value: Phase1DHGroupNumbersRequestListValue*): Self = this.set("Phase1DHGroupNumbers", js.Array(value :_*))
    @scala.inline
    def setPhase1DHGroupNumbers(value: Phase1DHGroupNumbersRequestList): Self = this.set("Phase1DHGroupNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhase1DHGroupNumbers: Self = this.set("Phase1DHGroupNumbers", js.undefined)
    @scala.inline
    def setPhase1EncryptionAlgorithmsVarargs(value: Phase1EncryptionAlgorithmsRequestListValue*): Self = this.set("Phase1EncryptionAlgorithms", js.Array(value :_*))
    @scala.inline
    def setPhase1EncryptionAlgorithms(value: Phase1EncryptionAlgorithmsRequestList): Self = this.set("Phase1EncryptionAlgorithms", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhase1EncryptionAlgorithms: Self = this.set("Phase1EncryptionAlgorithms", js.undefined)
    @scala.inline
    def setPhase1IntegrityAlgorithmsVarargs(value: Phase1IntegrityAlgorithmsRequestListValue*): Self = this.set("Phase1IntegrityAlgorithms", js.Array(value :_*))
    @scala.inline
    def setPhase1IntegrityAlgorithms(value: Phase1IntegrityAlgorithmsRequestList): Self = this.set("Phase1IntegrityAlgorithms", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhase1IntegrityAlgorithms: Self = this.set("Phase1IntegrityAlgorithms", js.undefined)
    @scala.inline
    def setPhase1LifetimeSeconds(value: Integer): Self = this.set("Phase1LifetimeSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhase1LifetimeSeconds: Self = this.set("Phase1LifetimeSeconds", js.undefined)
    @scala.inline
    def setPhase2DHGroupNumbersVarargs(value: Phase2DHGroupNumbersRequestListValue*): Self = this.set("Phase2DHGroupNumbers", js.Array(value :_*))
    @scala.inline
    def setPhase2DHGroupNumbers(value: Phase2DHGroupNumbersRequestList): Self = this.set("Phase2DHGroupNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhase2DHGroupNumbers: Self = this.set("Phase2DHGroupNumbers", js.undefined)
    @scala.inline
    def setPhase2EncryptionAlgorithmsVarargs(value: Phase2EncryptionAlgorithmsRequestListValue*): Self = this.set("Phase2EncryptionAlgorithms", js.Array(value :_*))
    @scala.inline
    def setPhase2EncryptionAlgorithms(value: Phase2EncryptionAlgorithmsRequestList): Self = this.set("Phase2EncryptionAlgorithms", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhase2EncryptionAlgorithms: Self = this.set("Phase2EncryptionAlgorithms", js.undefined)
    @scala.inline
    def setPhase2IntegrityAlgorithmsVarargs(value: Phase2IntegrityAlgorithmsRequestListValue*): Self = this.set("Phase2IntegrityAlgorithms", js.Array(value :_*))
    @scala.inline
    def setPhase2IntegrityAlgorithms(value: Phase2IntegrityAlgorithmsRequestList): Self = this.set("Phase2IntegrityAlgorithms", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhase2IntegrityAlgorithms: Self = this.set("Phase2IntegrityAlgorithms", js.undefined)
    @scala.inline
    def setPhase2LifetimeSeconds(value: Integer): Self = this.set("Phase2LifetimeSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhase2LifetimeSeconds: Self = this.set("Phase2LifetimeSeconds", js.undefined)
    @scala.inline
    def setPreSharedKey(value: String): Self = this.set("PreSharedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreSharedKey: Self = this.set("PreSharedKey", js.undefined)
    @scala.inline
    def setRekeyFuzzPercentage(value: Integer): Self = this.set("RekeyFuzzPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRekeyFuzzPercentage: Self = this.set("RekeyFuzzPercentage", js.undefined)
    @scala.inline
    def setRekeyMarginTimeSeconds(value: Integer): Self = this.set("RekeyMarginTimeSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRekeyMarginTimeSeconds: Self = this.set("RekeyMarginTimeSeconds", js.undefined)
    @scala.inline
    def setReplayWindowSize(value: Integer): Self = this.set("ReplayWindowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplayWindowSize: Self = this.set("ReplayWindowSize", js.undefined)
    @scala.inline
    def setTunnelInsideCidr(value: String): Self = this.set("TunnelInsideCidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnelInsideCidr: Self = this.set("TunnelInsideCidr", js.undefined)
  }
  
}

