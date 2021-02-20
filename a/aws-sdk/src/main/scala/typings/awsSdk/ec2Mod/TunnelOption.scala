package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TunnelOption extends StObject {
  
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
  implicit class TunnelOptionMutableBuilder[Self <: TunnelOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDpdTimeoutAction(value: String): Self = StObject.set(x, "DpdTimeoutAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpdTimeoutActionUndefined: Self = StObject.set(x, "DpdTimeoutAction", js.undefined)
    
    @scala.inline
    def setDpdTimeoutSeconds(value: Integer): Self = StObject.set(x, "DpdTimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpdTimeoutSecondsUndefined: Self = StObject.set(x, "DpdTimeoutSeconds", js.undefined)
    
    @scala.inline
    def setIkeVersions(value: IKEVersionsList): Self = StObject.set(x, "IkeVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIkeVersionsUndefined: Self = StObject.set(x, "IkeVersions", js.undefined)
    
    @scala.inline
    def setIkeVersionsVarargs(value: IKEVersionsListValue*): Self = StObject.set(x, "IkeVersions", js.Array(value :_*))
    
    @scala.inline
    def setOutsideIpAddress(value: String): Self = StObject.set(x, "OutsideIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutsideIpAddressUndefined: Self = StObject.set(x, "OutsideIpAddress", js.undefined)
    
    @scala.inline
    def setPhase1DHGroupNumbers(value: Phase1DHGroupNumbersList): Self = StObject.set(x, "Phase1DHGroupNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase1DHGroupNumbersUndefined: Self = StObject.set(x, "Phase1DHGroupNumbers", js.undefined)
    
    @scala.inline
    def setPhase1DHGroupNumbersVarargs(value: Phase1DHGroupNumbersListValue*): Self = StObject.set(x, "Phase1DHGroupNumbers", js.Array(value :_*))
    
    @scala.inline
    def setPhase1EncryptionAlgorithms(value: Phase1EncryptionAlgorithmsList): Self = StObject.set(x, "Phase1EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase1EncryptionAlgorithmsUndefined: Self = StObject.set(x, "Phase1EncryptionAlgorithms", js.undefined)
    
    @scala.inline
    def setPhase1EncryptionAlgorithmsVarargs(value: Phase1EncryptionAlgorithmsListValue*): Self = StObject.set(x, "Phase1EncryptionAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setPhase1IntegrityAlgorithms(value: Phase1IntegrityAlgorithmsList): Self = StObject.set(x, "Phase1IntegrityAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase1IntegrityAlgorithmsUndefined: Self = StObject.set(x, "Phase1IntegrityAlgorithms", js.undefined)
    
    @scala.inline
    def setPhase1IntegrityAlgorithmsVarargs(value: Phase1IntegrityAlgorithmsListValue*): Self = StObject.set(x, "Phase1IntegrityAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setPhase1LifetimeSeconds(value: Integer): Self = StObject.set(x, "Phase1LifetimeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase1LifetimeSecondsUndefined: Self = StObject.set(x, "Phase1LifetimeSeconds", js.undefined)
    
    @scala.inline
    def setPhase2DHGroupNumbers(value: Phase2DHGroupNumbersList): Self = StObject.set(x, "Phase2DHGroupNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase2DHGroupNumbersUndefined: Self = StObject.set(x, "Phase2DHGroupNumbers", js.undefined)
    
    @scala.inline
    def setPhase2DHGroupNumbersVarargs(value: Phase2DHGroupNumbersListValue*): Self = StObject.set(x, "Phase2DHGroupNumbers", js.Array(value :_*))
    
    @scala.inline
    def setPhase2EncryptionAlgorithms(value: Phase2EncryptionAlgorithmsList): Self = StObject.set(x, "Phase2EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase2EncryptionAlgorithmsUndefined: Self = StObject.set(x, "Phase2EncryptionAlgorithms", js.undefined)
    
    @scala.inline
    def setPhase2EncryptionAlgorithmsVarargs(value: Phase2EncryptionAlgorithmsListValue*): Self = StObject.set(x, "Phase2EncryptionAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setPhase2IntegrityAlgorithms(value: Phase2IntegrityAlgorithmsList): Self = StObject.set(x, "Phase2IntegrityAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase2IntegrityAlgorithmsUndefined: Self = StObject.set(x, "Phase2IntegrityAlgorithms", js.undefined)
    
    @scala.inline
    def setPhase2IntegrityAlgorithmsVarargs(value: Phase2IntegrityAlgorithmsListValue*): Self = StObject.set(x, "Phase2IntegrityAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setPhase2LifetimeSeconds(value: Integer): Self = StObject.set(x, "Phase2LifetimeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase2LifetimeSecondsUndefined: Self = StObject.set(x, "Phase2LifetimeSeconds", js.undefined)
    
    @scala.inline
    def setPreSharedKey(value: String): Self = StObject.set(x, "PreSharedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreSharedKeyUndefined: Self = StObject.set(x, "PreSharedKey", js.undefined)
    
    @scala.inline
    def setRekeyFuzzPercentage(value: Integer): Self = StObject.set(x, "RekeyFuzzPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRekeyFuzzPercentageUndefined: Self = StObject.set(x, "RekeyFuzzPercentage", js.undefined)
    
    @scala.inline
    def setRekeyMarginTimeSeconds(value: Integer): Self = StObject.set(x, "RekeyMarginTimeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRekeyMarginTimeSecondsUndefined: Self = StObject.set(x, "RekeyMarginTimeSeconds", js.undefined)
    
    @scala.inline
    def setReplayWindowSize(value: Integer): Self = StObject.set(x, "ReplayWindowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplayWindowSizeUndefined: Self = StObject.set(x, "ReplayWindowSize", js.undefined)
    
    @scala.inline
    def setStartupAction(value: String): Self = StObject.set(x, "StartupAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartupActionUndefined: Self = StObject.set(x, "StartupAction", js.undefined)
    
    @scala.inline
    def setTunnelInsideCidr(value: String): Self = StObject.set(x, "TunnelInsideCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelInsideCidrUndefined: Self = StObject.set(x, "TunnelInsideCidr", js.undefined)
    
    @scala.inline
    def setTunnelInsideIpv6Cidr(value: String): Self = StObject.set(x, "TunnelInsideIpv6Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelInsideIpv6CidrUndefined: Self = StObject.set(x, "TunnelInsideIpv6Cidr", js.undefined)
  }
}
