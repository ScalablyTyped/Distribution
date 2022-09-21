package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2VpnConnectionOptionsTunnelOptionsDetails extends StObject {
  
  /**
    * The number of seconds after which a Dead Peer Detection (DPD) timeout occurs.
    */
  var DpdTimeoutSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Internet Key Exchange (IKE) versions that are permitted for the VPN tunnel.
    */
  var IkeVersions: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The external IP address of the VPN tunnel.
    */
  var OutsideIpAddress: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1 IKE negotiations.
    */
  var Phase1DhGroupNumbers: js.UndefOr[IntegerList] = js.undefined
  
  /**
    * The permitted encryption algorithms for the VPN tunnel for phase 1 IKE negotiations.
    */
  var Phase1EncryptionAlgorithms: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The permitted integrity algorithms for the VPN tunnel for phase 1 IKE negotiations.
    */
  var Phase1IntegrityAlgorithms: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The lifetime for phase 1 of the IKE negotiation, in seconds.
    */
  var Phase1LifetimeSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2 IKE negotiations.
    */
  var Phase2DhGroupNumbers: js.UndefOr[IntegerList] = js.undefined
  
  /**
    * The permitted encryption algorithms for the VPN tunnel for phase 2 IKE negotiations.
    */
  var Phase2EncryptionAlgorithms: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The permitted integrity algorithms for the VPN tunnel for phase 2 IKE negotiations.
    */
  var Phase2IntegrityAlgorithms: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The lifetime for phase 2 of the IKE negotiation, in seconds.
    */
  var Phase2LifetimeSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * The preshared key to establish initial authentication between the virtual private gateway and the customer gateway.
    */
  var PreSharedKey: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The percentage of the rekey window, which is determined by RekeyMarginTimeSeconds during which the rekey time is randomly selected.
    */
  var RekeyFuzzPercentage: js.UndefOr[Integer] = js.undefined
  
  /**
    * The margin time, in seconds, before the phase 2 lifetime expires, during which the Amazon Web Services side of the VPN connection performs an IKE rekey.
    */
  var RekeyMarginTimeSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of packets in an IKE replay window.
    */
  var ReplayWindowSize: js.UndefOr[Integer] = js.undefined
  
  /**
    * The range of inside IPv4 addresses for the tunnel.
    */
  var TunnelInsideCidr: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2VpnConnectionOptionsTunnelOptionsDetails {
  
  inline def apply(): AwsEc2VpnConnectionOptionsTunnelOptionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VpnConnectionOptionsTunnelOptionsDetails]
  }
  
  extension [Self <: AwsEc2VpnConnectionOptionsTunnelOptionsDetails](x: Self) {
    
    inline def setDpdTimeoutSeconds(value: Integer): Self = StObject.set(x, "DpdTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setDpdTimeoutSecondsUndefined: Self = StObject.set(x, "DpdTimeoutSeconds", js.undefined)
    
    inline def setIkeVersions(value: NonEmptyStringList): Self = StObject.set(x, "IkeVersions", value.asInstanceOf[js.Any])
    
    inline def setIkeVersionsUndefined: Self = StObject.set(x, "IkeVersions", js.undefined)
    
    inline def setIkeVersionsVarargs(value: NonEmptyString*): Self = StObject.set(x, "IkeVersions", js.Array(value*))
    
    inline def setOutsideIpAddress(value: NonEmptyString): Self = StObject.set(x, "OutsideIpAddress", value.asInstanceOf[js.Any])
    
    inline def setOutsideIpAddressUndefined: Self = StObject.set(x, "OutsideIpAddress", js.undefined)
    
    inline def setPhase1DhGroupNumbers(value: IntegerList): Self = StObject.set(x, "Phase1DhGroupNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhase1DhGroupNumbersUndefined: Self = StObject.set(x, "Phase1DhGroupNumbers", js.undefined)
    
    inline def setPhase1DhGroupNumbersVarargs(value: Integer*): Self = StObject.set(x, "Phase1DhGroupNumbers", js.Array(value*))
    
    inline def setPhase1EncryptionAlgorithms(value: NonEmptyStringList): Self = StObject.set(x, "Phase1EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setPhase1EncryptionAlgorithmsUndefined: Self = StObject.set(x, "Phase1EncryptionAlgorithms", js.undefined)
    
    inline def setPhase1EncryptionAlgorithmsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Phase1EncryptionAlgorithms", js.Array(value*))
    
    inline def setPhase1IntegrityAlgorithms(value: NonEmptyStringList): Self = StObject.set(x, "Phase1IntegrityAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setPhase1IntegrityAlgorithmsUndefined: Self = StObject.set(x, "Phase1IntegrityAlgorithms", js.undefined)
    
    inline def setPhase1IntegrityAlgorithmsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Phase1IntegrityAlgorithms", js.Array(value*))
    
    inline def setPhase1LifetimeSeconds(value: Integer): Self = StObject.set(x, "Phase1LifetimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setPhase1LifetimeSecondsUndefined: Self = StObject.set(x, "Phase1LifetimeSeconds", js.undefined)
    
    inline def setPhase2DhGroupNumbers(value: IntegerList): Self = StObject.set(x, "Phase2DhGroupNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhase2DhGroupNumbersUndefined: Self = StObject.set(x, "Phase2DhGroupNumbers", js.undefined)
    
    inline def setPhase2DhGroupNumbersVarargs(value: Integer*): Self = StObject.set(x, "Phase2DhGroupNumbers", js.Array(value*))
    
    inline def setPhase2EncryptionAlgorithms(value: NonEmptyStringList): Self = StObject.set(x, "Phase2EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setPhase2EncryptionAlgorithmsUndefined: Self = StObject.set(x, "Phase2EncryptionAlgorithms", js.undefined)
    
    inline def setPhase2EncryptionAlgorithmsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Phase2EncryptionAlgorithms", js.Array(value*))
    
    inline def setPhase2IntegrityAlgorithms(value: NonEmptyStringList): Self = StObject.set(x, "Phase2IntegrityAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setPhase2IntegrityAlgorithmsUndefined: Self = StObject.set(x, "Phase2IntegrityAlgorithms", js.undefined)
    
    inline def setPhase2IntegrityAlgorithmsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Phase2IntegrityAlgorithms", js.Array(value*))
    
    inline def setPhase2LifetimeSeconds(value: Integer): Self = StObject.set(x, "Phase2LifetimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setPhase2LifetimeSecondsUndefined: Self = StObject.set(x, "Phase2LifetimeSeconds", js.undefined)
    
    inline def setPreSharedKey(value: NonEmptyString): Self = StObject.set(x, "PreSharedKey", value.asInstanceOf[js.Any])
    
    inline def setPreSharedKeyUndefined: Self = StObject.set(x, "PreSharedKey", js.undefined)
    
    inline def setRekeyFuzzPercentage(value: Integer): Self = StObject.set(x, "RekeyFuzzPercentage", value.asInstanceOf[js.Any])
    
    inline def setRekeyFuzzPercentageUndefined: Self = StObject.set(x, "RekeyFuzzPercentage", js.undefined)
    
    inline def setRekeyMarginTimeSeconds(value: Integer): Self = StObject.set(x, "RekeyMarginTimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setRekeyMarginTimeSecondsUndefined: Self = StObject.set(x, "RekeyMarginTimeSeconds", js.undefined)
    
    inline def setReplayWindowSize(value: Integer): Self = StObject.set(x, "ReplayWindowSize", value.asInstanceOf[js.Any])
    
    inline def setReplayWindowSizeUndefined: Self = StObject.set(x, "ReplayWindowSize", js.undefined)
    
    inline def setTunnelInsideCidr(value: NonEmptyString): Self = StObject.set(x, "TunnelInsideCidr", value.asInstanceOf[js.Any])
    
    inline def setTunnelInsideCidrUndefined: Self = StObject.set(x, "TunnelInsideCidr", js.undefined)
  }
}
