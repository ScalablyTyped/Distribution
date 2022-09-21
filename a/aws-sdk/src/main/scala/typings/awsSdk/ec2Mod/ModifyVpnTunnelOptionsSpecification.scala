package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpnTunnelOptionsSpecification extends StObject {
  
  /**
    * The action to take after DPD timeout occurs. Specify restart to restart the IKE initiation. Specify clear to end the IKE session. Valid Values: clear | none | restart  Default: clear 
    */
  var DPDTimeoutAction: js.UndefOr[String] = js.undefined
  
  /**
    * The number of seconds after which a DPD timeout occurs. Constraints: A value greater than or equal to 30. Default: 30 
    */
  var DPDTimeoutSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * The IKE versions that are permitted for the VPN tunnel. Valid values: ikev1 | ikev2 
    */
  var IKEVersions: js.UndefOr[IKEVersionsRequestList] = js.undefined
  
  /**
    * Options for logging VPN tunnel activity.
    */
  var LogOptions: js.UndefOr[VpnTunnelLogOptionsSpecification] = js.undefined
  
  /**
    * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 1 IKE negotiations. Valid values: 2 | 14 | 15 | 16 | 17 | 18 | 19 | 20 | 21 | 22 | 23 | 24 
    */
  var Phase1DHGroupNumbers: js.UndefOr[Phase1DHGroupNumbersRequestList] = js.undefined
  
  /**
    * One or more encryption algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations. Valid values: AES128 | AES256 | AES128-GCM-16 | AES256-GCM-16 
    */
  var Phase1EncryptionAlgorithms: js.UndefOr[Phase1EncryptionAlgorithmsRequestList] = js.undefined
  
  /**
    * One or more integrity algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations. Valid values: SHA1 | SHA2-256 | SHA2-384 | SHA2-512 
    */
  var Phase1IntegrityAlgorithms: js.UndefOr[Phase1IntegrityAlgorithmsRequestList] = js.undefined
  
  /**
    * The lifetime for phase 1 of the IKE negotiation, in seconds. Constraints: A value between 900 and 28,800. Default: 28800 
    */
  var Phase1LifetimeSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 2 IKE negotiations. Valid values: 2 | 5 | 14 | 15 | 16 | 17 | 18 | 19 | 20 | 21 | 22 | 23 | 24 
    */
  var Phase2DHGroupNumbers: js.UndefOr[Phase2DHGroupNumbersRequestList] = js.undefined
  
  /**
    * One or more encryption algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations. Valid values: AES128 | AES256 | AES128-GCM-16 | AES256-GCM-16 
    */
  var Phase2EncryptionAlgorithms: js.UndefOr[Phase2EncryptionAlgorithmsRequestList] = js.undefined
  
  /**
    * One or more integrity algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations. Valid values: SHA1 | SHA2-256 | SHA2-384 | SHA2-512 
    */
  var Phase2IntegrityAlgorithms: js.UndefOr[Phase2IntegrityAlgorithmsRequestList] = js.undefined
  
  /**
    * The lifetime for phase 2 of the IKE negotiation, in seconds. Constraints: A value between 900 and 3,600. The value must be less than the value for Phase1LifetimeSeconds. Default: 3600 
    */
  var Phase2LifetimeSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the customer gateway. Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores (_). Must be between 8 and 64 characters in length and cannot start with zero (0).
    */
  var PreSharedKey: js.UndefOr[String] = js.undefined
  
  /**
    * The percentage of the rekey window (determined by RekeyMarginTimeSeconds) during which the rekey time is randomly selected. Constraints: A value between 0 and 100. Default: 100 
    */
  var RekeyFuzzPercentage: js.UndefOr[Integer] = js.undefined
  
  /**
    * The margin time, in seconds, before the phase 2 lifetime expires, during which the Amazon Web Services side of the VPN connection performs an IKE rekey. The exact time of the rekey is randomly selected based on the value for RekeyFuzzPercentage. Constraints: A value between 60 and half of Phase2LifetimeSeconds. Default: 540 
    */
  var RekeyMarginTimeSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of packets in an IKE replay window. Constraints: A value between 64 and 2048. Default: 1024 
    */
  var ReplayWindowSize: js.UndefOr[Integer] = js.undefined
  
  /**
    * The action to take when the establishing the tunnel for the VPN connection. By default, your customer gateway device must initiate the IKE negotiation and bring up the tunnel. Specify start for Amazon Web Services to initiate the IKE negotiation. Valid Values: add | start  Default: add 
    */
  var StartupAction: js.UndefOr[String] = js.undefined
  
  /**
    * The range of inside IPv4 addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN connections that use the same virtual private gateway.  Constraints: A size /30 CIDR block from the 169.254.0.0/16 range. The following CIDR blocks are reserved and cannot be used:    169.254.0.0/30     169.254.1.0/30     169.254.2.0/30     169.254.3.0/30     169.254.4.0/30     169.254.5.0/30     169.254.169.252/30   
    */
  var TunnelInsideCidr: js.UndefOr[String] = js.undefined
  
  /**
    * The range of inside IPv6 addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN connections that use the same transit gateway. Constraints: A size /126 CIDR block from the local fd00::/8 range.
    */
  var TunnelInsideIpv6Cidr: js.UndefOr[String] = js.undefined
}
object ModifyVpnTunnelOptionsSpecification {
  
  inline def apply(): ModifyVpnTunnelOptionsSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpnTunnelOptionsSpecification]
  }
  
  extension [Self <: ModifyVpnTunnelOptionsSpecification](x: Self) {
    
    inline def setDPDTimeoutAction(value: String): Self = StObject.set(x, "DPDTimeoutAction", value.asInstanceOf[js.Any])
    
    inline def setDPDTimeoutActionUndefined: Self = StObject.set(x, "DPDTimeoutAction", js.undefined)
    
    inline def setDPDTimeoutSeconds(value: Integer): Self = StObject.set(x, "DPDTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setDPDTimeoutSecondsUndefined: Self = StObject.set(x, "DPDTimeoutSeconds", js.undefined)
    
    inline def setIKEVersions(value: IKEVersionsRequestList): Self = StObject.set(x, "IKEVersions", value.asInstanceOf[js.Any])
    
    inline def setIKEVersionsUndefined: Self = StObject.set(x, "IKEVersions", js.undefined)
    
    inline def setIKEVersionsVarargs(value: IKEVersionsRequestListValue*): Self = StObject.set(x, "IKEVersions", js.Array(value*))
    
    inline def setLogOptions(value: VpnTunnelLogOptionsSpecification): Self = StObject.set(x, "LogOptions", value.asInstanceOf[js.Any])
    
    inline def setLogOptionsUndefined: Self = StObject.set(x, "LogOptions", js.undefined)
    
    inline def setPhase1DHGroupNumbers(value: Phase1DHGroupNumbersRequestList): Self = StObject.set(x, "Phase1DHGroupNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhase1DHGroupNumbersUndefined: Self = StObject.set(x, "Phase1DHGroupNumbers", js.undefined)
    
    inline def setPhase1DHGroupNumbersVarargs(value: Phase1DHGroupNumbersRequestListValue*): Self = StObject.set(x, "Phase1DHGroupNumbers", js.Array(value*))
    
    inline def setPhase1EncryptionAlgorithms(value: Phase1EncryptionAlgorithmsRequestList): Self = StObject.set(x, "Phase1EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setPhase1EncryptionAlgorithmsUndefined: Self = StObject.set(x, "Phase1EncryptionAlgorithms", js.undefined)
    
    inline def setPhase1EncryptionAlgorithmsVarargs(value: Phase1EncryptionAlgorithmsRequestListValue*): Self = StObject.set(x, "Phase1EncryptionAlgorithms", js.Array(value*))
    
    inline def setPhase1IntegrityAlgorithms(value: Phase1IntegrityAlgorithmsRequestList): Self = StObject.set(x, "Phase1IntegrityAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setPhase1IntegrityAlgorithmsUndefined: Self = StObject.set(x, "Phase1IntegrityAlgorithms", js.undefined)
    
    inline def setPhase1IntegrityAlgorithmsVarargs(value: Phase1IntegrityAlgorithmsRequestListValue*): Self = StObject.set(x, "Phase1IntegrityAlgorithms", js.Array(value*))
    
    inline def setPhase1LifetimeSeconds(value: Integer): Self = StObject.set(x, "Phase1LifetimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setPhase1LifetimeSecondsUndefined: Self = StObject.set(x, "Phase1LifetimeSeconds", js.undefined)
    
    inline def setPhase2DHGroupNumbers(value: Phase2DHGroupNumbersRequestList): Self = StObject.set(x, "Phase2DHGroupNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhase2DHGroupNumbersUndefined: Self = StObject.set(x, "Phase2DHGroupNumbers", js.undefined)
    
    inline def setPhase2DHGroupNumbersVarargs(value: Phase2DHGroupNumbersRequestListValue*): Self = StObject.set(x, "Phase2DHGroupNumbers", js.Array(value*))
    
    inline def setPhase2EncryptionAlgorithms(value: Phase2EncryptionAlgorithmsRequestList): Self = StObject.set(x, "Phase2EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setPhase2EncryptionAlgorithmsUndefined: Self = StObject.set(x, "Phase2EncryptionAlgorithms", js.undefined)
    
    inline def setPhase2EncryptionAlgorithmsVarargs(value: Phase2EncryptionAlgorithmsRequestListValue*): Self = StObject.set(x, "Phase2EncryptionAlgorithms", js.Array(value*))
    
    inline def setPhase2IntegrityAlgorithms(value: Phase2IntegrityAlgorithmsRequestList): Self = StObject.set(x, "Phase2IntegrityAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setPhase2IntegrityAlgorithmsUndefined: Self = StObject.set(x, "Phase2IntegrityAlgorithms", js.undefined)
    
    inline def setPhase2IntegrityAlgorithmsVarargs(value: Phase2IntegrityAlgorithmsRequestListValue*): Self = StObject.set(x, "Phase2IntegrityAlgorithms", js.Array(value*))
    
    inline def setPhase2LifetimeSeconds(value: Integer): Self = StObject.set(x, "Phase2LifetimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setPhase2LifetimeSecondsUndefined: Self = StObject.set(x, "Phase2LifetimeSeconds", js.undefined)
    
    inline def setPreSharedKey(value: String): Self = StObject.set(x, "PreSharedKey", value.asInstanceOf[js.Any])
    
    inline def setPreSharedKeyUndefined: Self = StObject.set(x, "PreSharedKey", js.undefined)
    
    inline def setRekeyFuzzPercentage(value: Integer): Self = StObject.set(x, "RekeyFuzzPercentage", value.asInstanceOf[js.Any])
    
    inline def setRekeyFuzzPercentageUndefined: Self = StObject.set(x, "RekeyFuzzPercentage", js.undefined)
    
    inline def setRekeyMarginTimeSeconds(value: Integer): Self = StObject.set(x, "RekeyMarginTimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setRekeyMarginTimeSecondsUndefined: Self = StObject.set(x, "RekeyMarginTimeSeconds", js.undefined)
    
    inline def setReplayWindowSize(value: Integer): Self = StObject.set(x, "ReplayWindowSize", value.asInstanceOf[js.Any])
    
    inline def setReplayWindowSizeUndefined: Self = StObject.set(x, "ReplayWindowSize", js.undefined)
    
    inline def setStartupAction(value: String): Self = StObject.set(x, "StartupAction", value.asInstanceOf[js.Any])
    
    inline def setStartupActionUndefined: Self = StObject.set(x, "StartupAction", js.undefined)
    
    inline def setTunnelInsideCidr(value: String): Self = StObject.set(x, "TunnelInsideCidr", value.asInstanceOf[js.Any])
    
    inline def setTunnelInsideCidrUndefined: Self = StObject.set(x, "TunnelInsideCidr", js.undefined)
    
    inline def setTunnelInsideIpv6Cidr(value: String): Self = StObject.set(x, "TunnelInsideIpv6Cidr", value.asInstanceOf[js.Any])
    
    inline def setTunnelInsideIpv6CidrUndefined: Self = StObject.set(x, "TunnelInsideIpv6Cidr", js.undefined)
  }
}
