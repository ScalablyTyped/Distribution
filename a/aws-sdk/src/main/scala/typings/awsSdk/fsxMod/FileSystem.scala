package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystem extends StObject {
  
  /**
    * A list of administrative actions for the file system that are in process or waiting to be processed. Administrative actions describe changes to the Windows file system that you have initiated using the UpdateFileSystem action. 
    */
  var AdministrativeActions: js.UndefOr[typings.awsSdk.fsxMod.AdministrativeActions] = js.undefined
  
  /**
    * The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z), also known as Unix time.
    */
  var CreationTime: js.UndefOr[typings.awsSdk.fsxMod.CreationTime] = js.undefined
  
  /**
    * The DNS name for the file system.
    */
  var DNSName: js.UndefOr[typings.awsSdk.fsxMod.DNSName] = js.undefined
  
  var FailureDetails: js.UndefOr[FileSystemFailureDetails] = js.undefined
  
  /**
    * The system-generated, unique 17-digit ID of the file system.
    */
  var FileSystemId: js.UndefOr[typings.awsSdk.fsxMod.FileSystemId] = js.undefined
  
  /**
    * The type of Amazon FSx file system, either LUSTRE or WINDOWS.
    */
  var FileSystemType: js.UndefOr[typings.awsSdk.fsxMod.FileSystemType] = js.undefined
  
  /**
    * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the file system's data for Amazon FSx for Windows File Server file systems and persistent Amazon FSx for Lustre file systems at rest. In either case, if not specified, the Amazon FSx managed key is used. The scratch Amazon FSx for Lustre file systems are always encrypted at rest using Amazon FSx managed keys. For more information, see Encrypt in the AWS Key Management Service API Reference.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.fsxMod.KmsKeyId] = js.undefined
  
  /**
    * The lifecycle status of the file system, following are the possible values and what they mean:    AVAILABLE - The file system is in a healthy state, and is reachable and available for use.    CREATING - Amazon FSx is creating the new file system.    DELETING - Amazon FSx is deleting an existing file system.    FAILED - An existing file system has experienced an unrecoverable failure. When creating a new file system, Amazon FSx was unable to create the file system.    MISCONFIGURED indicates that the file system is in a failed but recoverable state.    UPDATING indicates that the file system is undergoing a customer initiated update.  
    */
  var Lifecycle: js.UndefOr[FileSystemLifecycle] = js.undefined
  
  var LustreConfiguration: js.UndefOr[LustreFileSystemConfiguration] = js.undefined
  
  /**
    * The IDs of the elastic network interface from which a specific file system is accessible. The elastic network interface is automatically created in the same VPC that the Amazon FSx file system was created in. For more information, see Elastic Network Interfaces in the Amazon EC2 User Guide.  For an Amazon FSx for Windows File Server file system, you can have one network interface ID. For an Amazon FSx for Lustre file system, you can have more than one.
    */
  var NetworkInterfaceIds: js.UndefOr[typings.awsSdk.fsxMod.NetworkInterfaceIds] = js.undefined
  
  /**
    * The AWS account that created the file system. If the file system was created by an AWS Identity and Access Management (IAM) user, the AWS account to which the IAM user belongs is the owner.
    */
  var OwnerId: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the file system resource.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.fsxMod.ResourceARN] = js.undefined
  
  /**
    * The storage capacity of the file system in gigabytes (GB).
    */
  var StorageCapacity: js.UndefOr[typings.awsSdk.fsxMod.StorageCapacity] = js.undefined
  
  /**
    * The storage type of the file system. Valid values are SSD and HDD. If set to SSD, the file system uses solid state drive storage. If set to HDD, the file system uses hard disk drive storage. 
    */
  var StorageType: js.UndefOr[typings.awsSdk.fsxMod.StorageType] = js.undefined
  
  /**
    * Specifies the IDs of the subnets that the file system is accessible from. For Windows MULTI_AZ_1 file system deployment type, there are two subnet IDs, one for the preferred file server and one for the standby file server. The preferred file server subnet identified in the PreferredSubnetID property. All other file systems have only one subnet ID. For Lustre file systems, and Single-AZ Windows file systems, this is the ID of the subnet that contains the endpoint for the file system. For MULTI_AZ_1 Windows file systems, the endpoint for the file system is available in the PreferredSubnetID.
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.fsxMod.SubnetIds] = js.undefined
  
  /**
    * The tags to associate with the file system. For more information, see Tagging Your Amazon EC2 Resources in the Amazon EC2 User Guide.
    */
  var Tags: js.UndefOr[typings.awsSdk.fsxMod.Tags] = js.undefined
  
  /**
    * The ID of the primary VPC for the file system.
    */
  var VpcId: js.UndefOr[typings.awsSdk.fsxMod.VpcId] = js.undefined
  
  /**
    * The configuration for this Microsoft Windows file system.
    */
  var WindowsConfiguration: js.UndefOr[WindowsFileSystemConfiguration] = js.undefined
}
object FileSystem {
  
  inline def apply(): FileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystem]
  }
  
  extension [Self <: FileSystem](x: Self) {
    
    inline def setAdministrativeActions(value: AdministrativeActions): Self = StObject.set(x, "AdministrativeActions", value.asInstanceOf[js.Any])
    
    inline def setAdministrativeActionsUndefined: Self = StObject.set(x, "AdministrativeActions", js.undefined)
    
    inline def setAdministrativeActionsVarargs(value: AdministrativeAction*): Self = StObject.set(x, "AdministrativeActions", js.Array(value :_*))
    
    inline def setCreationTime(value: CreationTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDNSName(value: DNSName): Self = StObject.set(x, "DNSName", value.asInstanceOf[js.Any])
    
    inline def setDNSNameUndefined: Self = StObject.set(x, "DNSName", js.undefined)
    
    inline def setFailureDetails(value: FileSystemFailureDetails): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsUndefined: Self = StObject.set(x, "FailureDetails", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    inline def setFileSystemType(value: FileSystemType): Self = StObject.set(x, "FileSystemType", value.asInstanceOf[js.Any])
    
    inline def setFileSystemTypeUndefined: Self = StObject.set(x, "FileSystemType", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLifecycle(value: FileSystemLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setLustreConfiguration(value: LustreFileSystemConfiguration): Self = StObject.set(x, "LustreConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLustreConfigurationUndefined: Self = StObject.set(x, "LustreConfiguration", js.undefined)
    
    inline def setNetworkInterfaceIds(value: NetworkInterfaceIds): Self = StObject.set(x, "NetworkInterfaceIds", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdsUndefined: Self = StObject.set(x, "NetworkInterfaceIds", js.undefined)
    
    inline def setNetworkInterfaceIdsVarargs(value: NetworkInterfaceId*): Self = StObject.set(x, "NetworkInterfaceIds", js.Array(value :_*))
    
    inline def setOwnerId(value: AWSAccountId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    inline def setStorageCapacity(value: StorageCapacity): Self = StObject.set(x, "StorageCapacity", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacityUndefined: Self = StObject.set(x, "StorageCapacity", js.undefined)
    
    inline def setStorageType(value: StorageType): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    inline def setWindowsConfiguration(value: WindowsFileSystemConfiguration): Self = StObject.set(x, "WindowsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setWindowsConfigurationUndefined: Self = StObject.set(x, "WindowsConfiguration", js.undefined)
  }
}
