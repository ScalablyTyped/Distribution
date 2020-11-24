package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TunnelOption extends js.Object {
  
  /**
    * The action to take after a DPD timeout occurs.
    */
  var DpdTimeoutAction: js.UndefOr[String] = js.native
  
  /**
    * The number of seconds after which a DPD timeout occurs.
    */
  var DpdTimeoutSeconds: js.UndefOr[Integer] = js.native
  
  /**
    * The IKE versions that are permitted for the VPN tunnel.
    */
  var IkeVersions: js.UndefOr[IKEVersionsList] = js.native
  
  /**
    * The external IP address of the VPN tunnel.
    */
  var OutsideIpAddress: js.UndefOr[String] = js.native
  
  /**
    * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1 IKE negotiations.
    */
  var Phase1DHGroupNumbers: js.UndefOr[Phase1DHGroupNumbersList] = js.native
  
  /**
    * The permitted encryption algorithms for the VPN tunnel for phase 1 IKE negotiations.
    */
  var Phase1EncryptionAlgorithms: js.UndefOr[Phase1EncryptionAlgorithmsList] = js.native
  
  /**
    * The permitted integrity algorithms for the VPN tunnel for phase 1 IKE negotiations.
    */
  var Phase1IntegrityAlgorithms: js.UndefOr[Phase1IntegrityAlgorithmsList] = js.native
  
  /**
    * The lifetime for phase 1 of the IKE negotiation, in seconds.
    */
  var Phase1LifetimeSeconds: js.UndefOr[Integer] = js.native
  
  /**
    * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2 IKE negotiations.
    */
  var Phase2DHGroupNumbers: js.UndefOr[Phase2DHGroupNumbersList] = js.native
  
  /**
    * The permitted encryption algorithms for the VPN tunnel for phase 2 IKE negotiations.
    */
  var Phase2EncryptionAlgorithms: js.UndefOr[Phase2EncryptionAlgorithmsList] = js.native
  
  /**
    * The permitted integrity algorithms for the VPN tunnel for phase 2 IKE negotiations.
    */
  var Phase2IntegrityAlgorithms: js.UndefOr[Phase2IntegrityAlgorithmsList] = js.native
  
  /**
    * The lifetime for phase 2 of the IKE negotiation, in seconds.
    */
  var Phase2LifetimeSeconds: js.UndefOr[Integer] = js.native
  
  /**
    * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the customer gateway.
    */
  var PreSharedKey: js.UndefOr[String] = js.native
  
  /**
    * The percentage of the rekey window determined by RekeyMarginTimeSeconds during which the rekey time is randomly selected.
    */
  var RekeyFuzzPercentage: js.UndefOr[Integer] = js.native
  
  /**
    * The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN connection performs an IKE rekey.
    */
  var RekeyMarginTimeSeconds: js.UndefOr[Integer] = js.native
  
  /**
    * The number of packets in an IKE replay window.
    */
  var ReplayWindowSize: js.UndefOr[Integer] = js.native
  
  /**
    * The action to take when the establishing the VPN tunnels for a VPN connection.
    */
  var StartupAction: js.UndefOr[String] = js.native
  
  /**
    * The range of inside IPv4 addresses for the tunnel.
    */
  var TunnelInsideCidr: js.UndefOr[String] = js.native
  
  /**
    * The range of inside IPv6 addresses for the tunnel.
    */
  var TunnelInsideIpv6Cidr: js.UndefOr[String] = js.native
}
object TunnelOption {
  
  @scala.inline
  def apply(): TunnelOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TunnelOption]
  }
  
  @scala.inline
  implicit class TunnelOptionOps[Self <: TunnelOption] (val x: Self) extends AnyVal {
    
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
    def setDpdTimeoutAction(value: String): Self = this.set("DpdTimeoutAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDpdTimeoutAction: Self = this.set("DpdTimeoutAction", js.undefined)
    
    @scala.inline
    def setDpdTimeoutSeconds(value: Integer): Self = this.set("DpdTimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDpdTimeoutSeconds: Self = this.set("DpdTimeoutSeconds", js.undefined)
    
    @scala.inline
    def setIkeVersionsVarargs(value: IKEVersionsListValue*): Self = this.set("IkeVersions", js.Array(value :_*))
    
    @scala.inline
    def setIkeVersions(value: IKEVersionsList): Self = this.set("IkeVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIkeVersions: Self = this.set("IkeVersions", js.undefined)
    
    @scala.inline
    def setOutsideIpAddress(value: String): Self = this.set("OutsideIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutsideIpAddress: Self = this.set("OutsideIpAddress", js.undefined)
    
    @scala.inline
    def setPhase1DHGroupNumbersVarargs(value: Phase1DHGroupNumbersListValue*): Self = this.set("Phase1DHGroupNumbers", js.Array(value :_*))
    
    @scala.inline
    def setPhase1DHGroupNumbers(value: Phase1DHGroupNumbersList): Self = this.set("Phase1DHGroupNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhase1DHGroupNumbers: Self = this.set("Phase1DHGroupNumbers", js.undefined)
    
    @scala.inline
    def setPhase1EncryptionAlgorithmsVarargs(value: Phase1EncryptionAlgorithmsListValue*): Self = this.set("Phase1EncryptionAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setPhase1EncryptionAlgorithms(value: Phase1EncryptionAlgorithmsList): Self = this.set("Phase1EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhase1EncryptionAlgorithms: Self = this.set("Phase1EncryptionAlgorithms", js.undefined)
    
    @scala.inline
    def setPhase1IntegrityAlgorithmsVarargs(value: Phase1IntegrityAlgorithmsListValue*): Self = this.set("Phase1IntegrityAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setPhase1IntegrityAlgorithms(value: Phase1IntegrityAlgorithmsList): Self = this.set("Phase1IntegrityAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhase1IntegrityAlgorithms: Self = this.set("Phase1IntegrityAlgorithms", js.undefined)
    
    @scala.inline
    def setPhase1LifetimeSeconds(value: Integer): Self = this.set("Phase1LifetimeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhase1LifetimeSeconds: Self = this.set("Phase1LifetimeSeconds", js.undefined)
    
    @scala.inline
    def setPhase2DHGroupNumbersVarargs(value: Phase2DHGroupNumbersListValue*): Self = this.set("Phase2DHGroupNumbers", js.Array(value :_*))
    
    @scala.inline
    def setPhase2DHGroupNumbers(value: Phase2DHGroupNumbersList): Self = this.set("Phase2DHGroupNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhase2DHGroupNumbers: Self = this.set("Phase2DHGroupNumbers", js.undefined)
    
    @scala.inline
    def setPhase2EncryptionAlgorithmsVarargs(value: Phase2EncryptionAlgorithmsListValue*): Self = this.set("Phase2EncryptionAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setPhase2EncryptionAlgorithms(value: Phase2EncryptionAlgorithmsList): Self = this.set("Phase2EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhase2EncryptionAlgorithms: Self = this.set("Phase2EncryptionAlgorithms", js.undefined)
    
    @scala.inline
    def setPhase2IntegrityAlgorithmsVarargs(value: Phase2IntegrityAlgorithmsListValue*): Self = this.set("Phase2IntegrityAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setPhase2IntegrityAlgorithms(value: Phase2IntegrityAlgorithmsList): Self = this.set("Phase2IntegrityAlgorithms", value.asInstanceOf[js.Any])
    
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
    def setStartupAction(value: String): Self = this.set("StartupAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartupAction: Self = this.set("StartupAction", js.undefined)
    
    @scala.inline
    def setTunnelInsideCidr(value: String): Self = this.set("TunnelInsideCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnelInsideCidr: Self = this.set("TunnelInsideCidr", js.undefined)
    
    @scala.inline
    def setTunnelInsideIpv6Cidr(value: String): Self = this.set("TunnelInsideIpv6Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnelInsideIpv6Cidr: Self = this.set("TunnelInsideIpv6Cidr", js.undefined)
  }
}
