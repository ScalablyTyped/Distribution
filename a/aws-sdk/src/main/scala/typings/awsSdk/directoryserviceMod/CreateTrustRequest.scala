package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrustRequest extends StObject {
  
  /**
    * The IP addresses of the remote DNS server associated with RemoteDomainName.
    */
  var ConditionalForwarderIpAddrs: js.UndefOr[DnsIpAddrs] = js.undefined
  
  /**
    * The Directory ID of the AWS Managed Microsoft AD directory for which to establish the trust relationship.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
  
  /**
    * The Fully Qualified Domain Name (FQDN) of the external domain for which to create the trust relationship.
    */
  var RemoteDomainName: typings.awsSdk.directoryserviceMod.RemoteDomainName
  
  /**
    * Optional parameter to enable selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[typings.awsSdk.directoryserviceMod.SelectiveAuth] = js.undefined
  
  /**
    * The direction of the trust relationship.
    */
  var TrustDirection: typings.awsSdk.directoryserviceMod.TrustDirection
  
  /**
    * The trust password. The must be the same password that was used when creating the trust relationship on the external domain.
    */
  var TrustPassword: typings.awsSdk.directoryserviceMod.TrustPassword
  
  /**
    * The trust relationship type. Forest is the default.
    */
  var TrustType: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustType] = js.undefined
}
object CreateTrustRequest {
  
  inline def apply(
    DirectoryId: DirectoryId,
    RemoteDomainName: RemoteDomainName,
    TrustDirection: TrustDirection,
    TrustPassword: TrustPassword
  ): CreateTrustRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], RemoteDomainName = RemoteDomainName.asInstanceOf[js.Any], TrustDirection = TrustDirection.asInstanceOf[js.Any], TrustPassword = TrustPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrustRequest]
  }
  
  extension [Self <: CreateTrustRequest](x: Self) {
    
    inline def setConditionalForwarderIpAddrs(value: DnsIpAddrs): Self = StObject.set(x, "ConditionalForwarderIpAddrs", value.asInstanceOf[js.Any])
    
    inline def setConditionalForwarderIpAddrsUndefined: Self = StObject.set(x, "ConditionalForwarderIpAddrs", js.undefined)
    
    inline def setConditionalForwarderIpAddrsVarargs(value: IpAddr*): Self = StObject.set(x, "ConditionalForwarderIpAddrs", js.Array(value :_*))
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setRemoteDomainName(value: RemoteDomainName): Self = StObject.set(x, "RemoteDomainName", value.asInstanceOf[js.Any])
    
    inline def setSelectiveAuth(value: SelectiveAuth): Self = StObject.set(x, "SelectiveAuth", value.asInstanceOf[js.Any])
    
    inline def setSelectiveAuthUndefined: Self = StObject.set(x, "SelectiveAuth", js.undefined)
    
    inline def setTrustDirection(value: TrustDirection): Self = StObject.set(x, "TrustDirection", value.asInstanceOf[js.Any])
    
    inline def setTrustPassword(value: TrustPassword): Self = StObject.set(x, "TrustPassword", value.asInstanceOf[js.Any])
    
    inline def setTrustType(value: TrustType): Self = StObject.set(x, "TrustType", value.asInstanceOf[js.Any])
    
    inline def setTrustTypeUndefined: Self = StObject.set(x, "TrustType", js.undefined)
  }
}
