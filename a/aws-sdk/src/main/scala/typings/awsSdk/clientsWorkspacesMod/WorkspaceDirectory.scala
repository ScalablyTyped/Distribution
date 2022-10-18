package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceDirectory extends StObject {
  
  /**
    * The directory alias.
    */
  var Alias: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.Alias] = js.undefined
  
  /**
    * The user name for the service account.
    */
  var CustomerUserName: js.UndefOr[UserName] = js.undefined
  
  /**
    * The directory identifier.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.DirectoryId] = js.undefined
  
  /**
    * The name of the directory.
    */
  var DirectoryName: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.DirectoryName] = js.undefined
  
  /**
    * The directory type.
    */
  var DirectoryType: js.UndefOr[WorkspaceDirectoryType] = js.undefined
  
  /**
    * The IP addresses of the DNS servers for the directory.
    */
  var DnsIpAddresses: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.DnsIpAddresses] = js.undefined
  
  /**
    * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
    */
  var IamRoleId: js.UndefOr[ARN] = js.undefined
  
  /**
    * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
    */
  var RegistrationCode: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.RegistrationCode] = js.undefined
  
  /**
    * Describes the enablement status, user access URL, and relay state parameter name that are used for configuring federation with an SAML 2.0 identity provider.
    */
  var SamlProperties: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.SamlProperties] = js.undefined
  
  /**
    * The default self-service permissions for WorkSpaces in the directory.
    */
  var SelfservicePermissions: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.SelfservicePermissions] = js.undefined
  
  /**
    * The state of the directory's registration with Amazon WorkSpaces. After a directory is deregistered, the DEREGISTERED state is returned very briefly before the directory metadata is cleaned up, so this state is rarely returned. To confirm that a directory is deregistered, check for the directory ID by using  DescribeWorkspaceDirectories. If the directory ID isn't returned, then the directory has been successfully deregistered.
    */
  var State: js.UndefOr[WorkspaceDirectoryState] = js.undefined
  
  /**
    * The identifiers of the subnets used with the directory.
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.SubnetIds] = js.undefined
  
  /**
    * Specifies whether the directory is dedicated or shared. To use Bring Your Own License (BYOL), this value must be set to DEDICATED. For more information, see Bring Your Own Windows Desktop Images.
    */
  var Tenancy: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.Tenancy] = js.undefined
  
  /**
    * The devices and operating systems that users can use to access WorkSpaces.
    */
  var WorkspaceAccessProperties: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.WorkspaceAccessProperties] = js.undefined
  
  /**
    * The default creation properties for all WorkSpaces in the directory.
    */
  var WorkspaceCreationProperties: js.UndefOr[DefaultWorkspaceCreationProperties] = js.undefined
  
  /**
    * The identifier of the security group that is assigned to new WorkSpaces.
    */
  var WorkspaceSecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined
  
  /**
    * The identifiers of the IP access control groups associated with the directory.
    */
  var ipGroupIds: js.UndefOr[IpGroupIdList] = js.undefined
}
object WorkspaceDirectory {
  
  inline def apply(): WorkspaceDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceDirectory]
  }
  
  extension [Self <: WorkspaceDirectory](x: Self) {
    
    inline def setAlias(value: Alias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setCustomerUserName(value: UserName): Self = StObject.set(x, "CustomerUserName", value.asInstanceOf[js.Any])
    
    inline def setCustomerUserNameUndefined: Self = StObject.set(x, "CustomerUserName", js.undefined)
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setDirectoryName(value: DirectoryName): Self = StObject.set(x, "DirectoryName", value.asInstanceOf[js.Any])
    
    inline def setDirectoryNameUndefined: Self = StObject.set(x, "DirectoryName", js.undefined)
    
    inline def setDirectoryType(value: WorkspaceDirectoryType): Self = StObject.set(x, "DirectoryType", value.asInstanceOf[js.Any])
    
    inline def setDirectoryTypeUndefined: Self = StObject.set(x, "DirectoryType", js.undefined)
    
    inline def setDnsIpAddresses(value: DnsIpAddresses): Self = StObject.set(x, "DnsIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setDnsIpAddressesUndefined: Self = StObject.set(x, "DnsIpAddresses", js.undefined)
    
    inline def setDnsIpAddressesVarargs(value: IpAddress*): Self = StObject.set(x, "DnsIpAddresses", js.Array(value*))
    
    inline def setIamRoleId(value: ARN): Self = StObject.set(x, "IamRoleId", value.asInstanceOf[js.Any])
    
    inline def setIamRoleIdUndefined: Self = StObject.set(x, "IamRoleId", js.undefined)
    
    inline def setIpGroupIds(value: IpGroupIdList): Self = StObject.set(x, "ipGroupIds", value.asInstanceOf[js.Any])
    
    inline def setIpGroupIdsUndefined: Self = StObject.set(x, "ipGroupIds", js.undefined)
    
    inline def setIpGroupIdsVarargs(value: IpGroupId*): Self = StObject.set(x, "ipGroupIds", js.Array(value*))
    
    inline def setRegistrationCode(value: RegistrationCode): Self = StObject.set(x, "RegistrationCode", value.asInstanceOf[js.Any])
    
    inline def setRegistrationCodeUndefined: Self = StObject.set(x, "RegistrationCode", js.undefined)
    
    inline def setSamlProperties(value: SamlProperties): Self = StObject.set(x, "SamlProperties", value.asInstanceOf[js.Any])
    
    inline def setSamlPropertiesUndefined: Self = StObject.set(x, "SamlProperties", js.undefined)
    
    inline def setSelfservicePermissions(value: SelfservicePermissions): Self = StObject.set(x, "SelfservicePermissions", value.asInstanceOf[js.Any])
    
    inline def setSelfservicePermissionsUndefined: Self = StObject.set(x, "SelfservicePermissions", js.undefined)
    
    inline def setState(value: WorkspaceDirectoryState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setTenancy(value: Tenancy): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    inline def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
    
    inline def setWorkspaceAccessProperties(value: WorkspaceAccessProperties): Self = StObject.set(x, "WorkspaceAccessProperties", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceAccessPropertiesUndefined: Self = StObject.set(x, "WorkspaceAccessProperties", js.undefined)
    
    inline def setWorkspaceCreationProperties(value: DefaultWorkspaceCreationProperties): Self = StObject.set(x, "WorkspaceCreationProperties", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceCreationPropertiesUndefined: Self = StObject.set(x, "WorkspaceCreationProperties", js.undefined)
    
    inline def setWorkspaceSecurityGroupId(value: SecurityGroupId): Self = StObject.set(x, "WorkspaceSecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceSecurityGroupIdUndefined: Self = StObject.set(x, "WorkspaceSecurityGroupId", js.undefined)
  }
}
