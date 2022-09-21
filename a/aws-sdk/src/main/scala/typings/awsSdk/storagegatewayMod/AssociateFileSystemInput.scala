package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateFileSystemInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the storage used for the audit logs.
    */
  var AuditDestinationARN: js.UndefOr[typings.awsSdk.storagegatewayMod.AuditDestinationARN] = js.undefined
  
  var CacheAttributes: js.UndefOr[typings.awsSdk.storagegatewayMod.CacheAttributes] = js.undefined
  
  /**
    * A unique string value that you supply that is used by the FSx File Gateway to ensure idempotent file system association creation.
    */
  var ClientToken: typings.awsSdk.storagegatewayMod.ClientToken
  
  /**
    * Specifies the network configuration information for the gateway associated with the Amazon FSx file system.  If multiple file systems are associated with this gateway, this parameter's IpAddresses field is required. 
    */
  var EndpointNetworkConfiguration: js.UndefOr[typings.awsSdk.storagegatewayMod.EndpointNetworkConfiguration] = js.undefined
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
    */
  var LocationARN: FileSystemLocationARN
  
  /**
    * The password of the user credential.
    */
  var Password: DomainUserPassword
  
  /**
    * A list of up to 50 tags that can be assigned to the file system association. Each tag is a key-value pair.
    */
  var Tags: js.UndefOr[typings.awsSdk.storagegatewayMod.Tags] = js.undefined
  
  /**
    * The user name of the user credential that has permission to access the root share D$ of the Amazon FSx file system. The user account must belong to the Amazon FSx delegated admin user group.
    */
  var UserName: DomainUserName
}
object AssociateFileSystemInput {
  
  inline def apply(
    ClientToken: ClientToken,
    GatewayARN: GatewayARN,
    LocationARN: FileSystemLocationARN,
    Password: DomainUserPassword,
    UserName: DomainUserName
  ): AssociateFileSystemInput = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any], LocationARN = LocationARN.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateFileSystemInput]
  }
  
  extension [Self <: AssociateFileSystemInput](x: Self) {
    
    inline def setAuditDestinationARN(value: AuditDestinationARN): Self = StObject.set(x, "AuditDestinationARN", value.asInstanceOf[js.Any])
    
    inline def setAuditDestinationARNUndefined: Self = StObject.set(x, "AuditDestinationARN", js.undefined)
    
    inline def setCacheAttributes(value: CacheAttributes): Self = StObject.set(x, "CacheAttributes", value.asInstanceOf[js.Any])
    
    inline def setCacheAttributesUndefined: Self = StObject.set(x, "CacheAttributes", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setEndpointNetworkConfiguration(value: EndpointNetworkConfiguration): Self = StObject.set(x, "EndpointNetworkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEndpointNetworkConfigurationUndefined: Self = StObject.set(x, "EndpointNetworkConfiguration", js.undefined)
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setLocationARN(value: FileSystemLocationARN): Self = StObject.set(x, "LocationARN", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: DomainUserPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUserName(value: DomainUserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
