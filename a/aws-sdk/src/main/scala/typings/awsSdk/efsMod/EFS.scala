package typings.awsSdk.efsMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EFS extends Service {
  
  @JSName("config")
  var config_EFS: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an EFS access point. An access point is an application-specific view into an EFS file system that applies an operating system user and group, and a file system path, to any file system request made through the access point. The operating system user and group override any identity information provided by the NFS client. The file system path is exposed as the access point's root directory. Applications using the access point can only access data in its own directory and below. To learn more, see Mounting a File System Using EFS Access Points. This operation requires permissions for the elasticfilesystem:CreateAccessPoint action.
    */
  def createAccessPoint(): Request[AccessPointDescription, AWSError] = js.native
  def createAccessPoint(callback: js.Function2[/* err */ AWSError, /* data */ AccessPointDescription, Unit]): Request[AccessPointDescription, AWSError] = js.native
  /**
    * Creates an EFS access point. An access point is an application-specific view into an EFS file system that applies an operating system user and group, and a file system path, to any file system request made through the access point. The operating system user and group override any identity information provided by the NFS client. The file system path is exposed as the access point's root directory. Applications using the access point can only access data in its own directory and below. To learn more, see Mounting a File System Using EFS Access Points. This operation requires permissions for the elasticfilesystem:CreateAccessPoint action.
    */
  def createAccessPoint(params: CreateAccessPointRequest): Request[AccessPointDescription, AWSError] = js.native
  def createAccessPoint(
    params: CreateAccessPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AccessPointDescription, Unit]
  ): Request[AccessPointDescription, AWSError] = js.native
  
  /**
    * Creates a new, empty file system. The operation requires a creation token in the request that Amazon EFS uses to ensure idempotent creation (calling the operation with same creation token has no effect). If a file system does not currently exist that is owned by the caller's AWS account with the specified creation token, this operation does the following:   Creates a new, empty file system. The file system will have an Amazon EFS assigned ID, and an initial lifecycle state creating.   Returns with the description of the created file system.   Otherwise, this operation returns a FileSystemAlreadyExists error with the ID of the existing file system.  For basic use cases, you can use a randomly generated UUID for the creation token.   The idempotent operation allows you to retry a CreateFileSystem call without risk of creating an extra file system. This can happen when an initial call fails in a way that leaves it uncertain whether or not a file system was actually created. An example might be that a transport level timeout occurred or your connection was reset. As long as you use the same creation token, if the initial call had succeeded in creating a file system, the client can learn of its existence from the FileSystemAlreadyExists error.  The CreateFileSystem call returns while the file system's lifecycle state is still creating. You can check the file system creation status by calling the DescribeFileSystems operation, which among other things returns the file system state.  This operation also takes an optional PerformanceMode parameter that you choose for your file system. We recommend generalPurpose performance mode for most file systems. File systems using the maxIO performance mode can scale to higher levels of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most file operations. The performance mode can't be changed after the file system has been created. For more information, see Amazon EFS: Performance Modes. After the file system is fully created, Amazon EFS sets its lifecycle state to available, at which point you can create one or more mount targets for the file system in your VPC. For more information, see CreateMountTarget. You mount your Amazon EFS file system on an EC2 instances in your VPC by using the mount target. For more information, see Amazon EFS: How it Works.   This operation requires permissions for the elasticfilesystem:CreateFileSystem action. 
    */
  def createFileSystem(): Request[FileSystemDescription, AWSError] = js.native
  def createFileSystem(callback: js.Function2[/* err */ AWSError, /* data */ FileSystemDescription, Unit]): Request[FileSystemDescription, AWSError] = js.native
  /**
    * Creates a new, empty file system. The operation requires a creation token in the request that Amazon EFS uses to ensure idempotent creation (calling the operation with same creation token has no effect). If a file system does not currently exist that is owned by the caller's AWS account with the specified creation token, this operation does the following:   Creates a new, empty file system. The file system will have an Amazon EFS assigned ID, and an initial lifecycle state creating.   Returns with the description of the created file system.   Otherwise, this operation returns a FileSystemAlreadyExists error with the ID of the existing file system.  For basic use cases, you can use a randomly generated UUID for the creation token.   The idempotent operation allows you to retry a CreateFileSystem call without risk of creating an extra file system. This can happen when an initial call fails in a way that leaves it uncertain whether or not a file system was actually created. An example might be that a transport level timeout occurred or your connection was reset. As long as you use the same creation token, if the initial call had succeeded in creating a file system, the client can learn of its existence from the FileSystemAlreadyExists error.  The CreateFileSystem call returns while the file system's lifecycle state is still creating. You can check the file system creation status by calling the DescribeFileSystems operation, which among other things returns the file system state.  This operation also takes an optional PerformanceMode parameter that you choose for your file system. We recommend generalPurpose performance mode for most file systems. File systems using the maxIO performance mode can scale to higher levels of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most file operations. The performance mode can't be changed after the file system has been created. For more information, see Amazon EFS: Performance Modes. After the file system is fully created, Amazon EFS sets its lifecycle state to available, at which point you can create one or more mount targets for the file system in your VPC. For more information, see CreateMountTarget. You mount your Amazon EFS file system on an EC2 instances in your VPC by using the mount target. For more information, see Amazon EFS: How it Works.   This operation requires permissions for the elasticfilesystem:CreateFileSystem action. 
    */
  def createFileSystem(params: CreateFileSystemRequest): Request[FileSystemDescription, AWSError] = js.native
  def createFileSystem(
    params: CreateFileSystemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ FileSystemDescription, Unit]
  ): Request[FileSystemDescription, AWSError] = js.native
  
  /**
    * Creates a mount target for a file system. You can then mount the file system on EC2 instances by using the mount target. You can create one mount target in each Availability Zone in your VPC. All EC2 instances in a VPC within a given Availability Zone share a single mount target for a given file system. If you have multiple subnets in an Availability Zone, you create a mount target in one of the subnets. EC2 instances do not need to be in the same subnet as the mount target in order to access their file system. For more information, see Amazon EFS: How it Works.  In the request, you also specify a file system ID for which you are creating the mount target and the file system's lifecycle state must be available. For more information, see DescribeFileSystems. In the request, you also provide a subnet ID, which determines the following:   VPC in which Amazon EFS creates the mount target   Availability Zone in which Amazon EFS creates the mount target   IP address range from which Amazon EFS selects the IP address of the mount target (if you don't specify an IP address in the request)   After creating the mount target, Amazon EFS returns a response that includes, a MountTargetId and an IpAddress. You use this IP address when mounting the file system in an EC2 instance. You can also use the mount target's DNS name when mounting the file system. The EC2 instance on which you mount the file system by using the mount target can resolve the mount target's DNS name to its IP address. For more information, see How it Works: Implementation Overview.  Note that you can create mount targets for a file system in only one VPC, and there can be only one mount target per Availability Zone. That is, if the file system already has one or more mount targets created for it, the subnet specified in the request to add another mount target must meet the following requirements:   Must belong to the same VPC as the subnets of the existing mount targets   Must not be in the same Availability Zone as any of the subnets of the existing mount targets   If the request satisfies the requirements, Amazon EFS does the following:   Creates a new mount target in the specified subnet.   Also creates a new network interface in the subnet as follows:   If the request provides an IpAddress, Amazon EFS assigns that IP address to the network interface. Otherwise, Amazon EFS assigns a free address in the subnet (in the same way that the Amazon EC2 CreateNetworkInterface call does when a request does not specify a primary private IP address).   If the request provides SecurityGroups, this network interface is associated with those security groups. Otherwise, it belongs to the default security group for the subnet's VPC.   Assigns the description Mount target fsmt-id for file system fs-id  where  fsmt-id  is the mount target ID, and  fs-id  is the FileSystemId.   Sets the requesterManaged property of the network interface to true, and the requesterId value to EFS.   Each Amazon EFS mount target has one corresponding requester-managed EC2 network interface. After the network interface is created, Amazon EFS sets the NetworkInterfaceId field in the mount target's description to the network interface ID, and the IpAddress field to its address. If network interface creation fails, the entire CreateMountTarget operation fails.    The CreateMountTarget call returns only after creating the network interface, but while the mount target state is still creating, you can check the mount target creation status by calling the DescribeMountTargets operation, which among other things returns the mount target state.  We recommend that you create a mount target in each of the Availability Zones. There are cost considerations for using a file system in an Availability Zone through a mount target created in another Availability Zone. For more information, see Amazon EFS. In addition, by always using a mount target local to the instance's Availability Zone, you eliminate a partial failure scenario. If the Availability Zone in which your mount target is created goes down, then you can't access your file system through that mount target.  This operation requires permissions for the following action on the file system:    elasticfilesystem:CreateMountTarget    This operation also requires permissions for the following Amazon EC2 actions:    ec2:DescribeSubnets     ec2:DescribeNetworkInterfaces     ec2:CreateNetworkInterface   
    */
  def createMountTarget(): Request[MountTargetDescription, AWSError] = js.native
  def createMountTarget(callback: js.Function2[/* err */ AWSError, /* data */ MountTargetDescription, Unit]): Request[MountTargetDescription, AWSError] = js.native
  /**
    * Creates a mount target for a file system. You can then mount the file system on EC2 instances by using the mount target. You can create one mount target in each Availability Zone in your VPC. All EC2 instances in a VPC within a given Availability Zone share a single mount target for a given file system. If you have multiple subnets in an Availability Zone, you create a mount target in one of the subnets. EC2 instances do not need to be in the same subnet as the mount target in order to access their file system. For more information, see Amazon EFS: How it Works.  In the request, you also specify a file system ID for which you are creating the mount target and the file system's lifecycle state must be available. For more information, see DescribeFileSystems. In the request, you also provide a subnet ID, which determines the following:   VPC in which Amazon EFS creates the mount target   Availability Zone in which Amazon EFS creates the mount target   IP address range from which Amazon EFS selects the IP address of the mount target (if you don't specify an IP address in the request)   After creating the mount target, Amazon EFS returns a response that includes, a MountTargetId and an IpAddress. You use this IP address when mounting the file system in an EC2 instance. You can also use the mount target's DNS name when mounting the file system. The EC2 instance on which you mount the file system by using the mount target can resolve the mount target's DNS name to its IP address. For more information, see How it Works: Implementation Overview.  Note that you can create mount targets for a file system in only one VPC, and there can be only one mount target per Availability Zone. That is, if the file system already has one or more mount targets created for it, the subnet specified in the request to add another mount target must meet the following requirements:   Must belong to the same VPC as the subnets of the existing mount targets   Must not be in the same Availability Zone as any of the subnets of the existing mount targets   If the request satisfies the requirements, Amazon EFS does the following:   Creates a new mount target in the specified subnet.   Also creates a new network interface in the subnet as follows:   If the request provides an IpAddress, Amazon EFS assigns that IP address to the network interface. Otherwise, Amazon EFS assigns a free address in the subnet (in the same way that the Amazon EC2 CreateNetworkInterface call does when a request does not specify a primary private IP address).   If the request provides SecurityGroups, this network interface is associated with those security groups. Otherwise, it belongs to the default security group for the subnet's VPC.   Assigns the description Mount target fsmt-id for file system fs-id  where  fsmt-id  is the mount target ID, and  fs-id  is the FileSystemId.   Sets the requesterManaged property of the network interface to true, and the requesterId value to EFS.   Each Amazon EFS mount target has one corresponding requester-managed EC2 network interface. After the network interface is created, Amazon EFS sets the NetworkInterfaceId field in the mount target's description to the network interface ID, and the IpAddress field to its address. If network interface creation fails, the entire CreateMountTarget operation fails.    The CreateMountTarget call returns only after creating the network interface, but while the mount target state is still creating, you can check the mount target creation status by calling the DescribeMountTargets operation, which among other things returns the mount target state.  We recommend that you create a mount target in each of the Availability Zones. There are cost considerations for using a file system in an Availability Zone through a mount target created in another Availability Zone. For more information, see Amazon EFS. In addition, by always using a mount target local to the instance's Availability Zone, you eliminate a partial failure scenario. If the Availability Zone in which your mount target is created goes down, then you can't access your file system through that mount target.  This operation requires permissions for the following action on the file system:    elasticfilesystem:CreateMountTarget    This operation also requires permissions for the following Amazon EC2 actions:    ec2:DescribeSubnets     ec2:DescribeNetworkInterfaces     ec2:CreateNetworkInterface   
    */
  def createMountTarget(params: CreateMountTargetRequest): Request[MountTargetDescription, AWSError] = js.native
  def createMountTarget(
    params: CreateMountTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ MountTargetDescription, Unit]
  ): Request[MountTargetDescription, AWSError] = js.native
  
  /**
    * Creates or overwrites tags associated with a file system. Each tag is a key-value pair. If a tag key specified in the request already exists on the file system, this operation overwrites its value with the value provided in the request. If you add the Name tag to your file system, Amazon EFS returns it in the response to the DescribeFileSystems operation.  This operation requires permission for the elasticfilesystem:CreateTags action.
    */
  def createTags(): Request[js.Object, AWSError] = js.native
  def createTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates or overwrites tags associated with a file system. Each tag is a key-value pair. If a tag key specified in the request already exists on the file system, this operation overwrites its value with the value provided in the request. If you add the Name tag to your file system, Amazon EFS returns it in the response to the DescribeFileSystems operation.  This operation requires permission for the elasticfilesystem:CreateTags action.
    */
  def createTags(params: CreateTagsRequest): Request[js.Object, AWSError] = js.native
  def createTags(params: CreateTagsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified access point. After deletion is complete, new clients can no longer connect to the access points. Clients connected to the access point at the time of deletion will continue to function until they terminate their connection. This operation requires permissions for the elasticfilesystem:DeleteAccessPoint action.
    */
  def deleteAccessPoint(): Request[js.Object, AWSError] = js.native
  def deleteAccessPoint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified access point. After deletion is complete, new clients can no longer connect to the access points. Clients connected to the access point at the time of deletion will continue to function until they terminate their connection. This operation requires permissions for the elasticfilesystem:DeleteAccessPoint action.
    */
  def deleteAccessPoint(params: DeleteAccessPointRequest): Request[js.Object, AWSError] = js.native
  def deleteAccessPoint(
    params: DeleteAccessPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a file system, permanently severing access to its contents. Upon return, the file system no longer exists and you can't access any contents of the deleted file system.  You can't delete a file system that is in use. That is, if the file system has any mount targets, you must first delete them. For more information, see DescribeMountTargets and DeleteMountTarget.   The DeleteFileSystem call returns while the file system state is still deleting. You can check the file system deletion status by calling the DescribeFileSystems operation, which returns a list of file systems in your account. If you pass file system ID or creation token for the deleted file system, the DescribeFileSystems returns a 404 FileSystemNotFound error.  This operation requires permissions for the elasticfilesystem:DeleteFileSystem action.
    */
  def deleteFileSystem(): Request[js.Object, AWSError] = js.native
  def deleteFileSystem(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a file system, permanently severing access to its contents. Upon return, the file system no longer exists and you can't access any contents of the deleted file system.  You can't delete a file system that is in use. That is, if the file system has any mount targets, you must first delete them. For more information, see DescribeMountTargets and DeleteMountTarget.   The DeleteFileSystem call returns while the file system state is still deleting. You can check the file system deletion status by calling the DescribeFileSystems operation, which returns a list of file systems in your account. If you pass file system ID or creation token for the deleted file system, the DescribeFileSystems returns a 404 FileSystemNotFound error.  This operation requires permissions for the elasticfilesystem:DeleteFileSystem action.
    */
  def deleteFileSystem(params: DeleteFileSystemRequest): Request[js.Object, AWSError] = js.native
  def deleteFileSystem(
    params: DeleteFileSystemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the FileSystemPolicy for the specified file system. The default FileSystemPolicy goes into effect once the existing policy is deleted. For more information about the default file system policy, see Using Resource-based Policies with EFS. This operation requires permissions for the elasticfilesystem:DeleteFileSystemPolicy action.
    */
  def deleteFileSystemPolicy(): Request[js.Object, AWSError] = js.native
  def deleteFileSystemPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the FileSystemPolicy for the specified file system. The default FileSystemPolicy goes into effect once the existing policy is deleted. For more information about the default file system policy, see Using Resource-based Policies with EFS. This operation requires permissions for the elasticfilesystem:DeleteFileSystemPolicy action.
    */
  def deleteFileSystemPolicy(params: DeleteFileSystemPolicyRequest): Request[js.Object, AWSError] = js.native
  def deleteFileSystemPolicy(
    params: DeleteFileSystemPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified mount target. This operation forcibly breaks any mounts of the file system by using the mount target that is being deleted, which might disrupt instances or applications using those mounts. To avoid applications getting cut off abruptly, you might consider unmounting any mounts of the mount target, if feasible. The operation also deletes the associated network interface. Uncommitted writes might be lost, but breaking a mount target using this operation does not corrupt the file system itself. The file system you created remains. You can mount an EC2 instance in your VPC by using another mount target. This operation requires permissions for the following action on the file system:    elasticfilesystem:DeleteMountTarget     The DeleteMountTarget call returns while the mount target state is still deleting. You can check the mount target deletion by calling the DescribeMountTargets operation, which returns a list of mount target descriptions for the given file system.   The operation also requires permissions for the following Amazon EC2 action on the mount target's network interface:    ec2:DeleteNetworkInterface   
    */
  def deleteMountTarget(): Request[js.Object, AWSError] = js.native
  def deleteMountTarget(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified mount target. This operation forcibly breaks any mounts of the file system by using the mount target that is being deleted, which might disrupt instances or applications using those mounts. To avoid applications getting cut off abruptly, you might consider unmounting any mounts of the mount target, if feasible. The operation also deletes the associated network interface. Uncommitted writes might be lost, but breaking a mount target using this operation does not corrupt the file system itself. The file system you created remains. You can mount an EC2 instance in your VPC by using another mount target. This operation requires permissions for the following action on the file system:    elasticfilesystem:DeleteMountTarget     The DeleteMountTarget call returns while the mount target state is still deleting. You can check the mount target deletion by calling the DescribeMountTargets operation, which returns a list of mount target descriptions for the given file system.   The operation also requires permissions for the following Amazon EC2 action on the mount target's network interface:    ec2:DeleteNetworkInterface   
    */
  def deleteMountTarget(params: DeleteMountTargetRequest): Request[js.Object, AWSError] = js.native
  def deleteMountTarget(
    params: DeleteMountTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified tags from a file system. If the DeleteTags request includes a tag key that doesn't exist, Amazon EFS ignores it and doesn't cause an error. For more information about tags and related restrictions, see Tag Restrictions in the AWS Billing and Cost Management User Guide. This operation requires permissions for the elasticfilesystem:DeleteTags action.
    */
  def deleteTags(): Request[js.Object, AWSError] = js.native
  def deleteTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified tags from a file system. If the DeleteTags request includes a tag key that doesn't exist, Amazon EFS ignores it and doesn't cause an error. For more information about tags and related restrictions, see Tag Restrictions in the AWS Billing and Cost Management User Guide. This operation requires permissions for the elasticfilesystem:DeleteTags action.
    */
  def deleteTags(params: DeleteTagsRequest): Request[js.Object, AWSError] = js.native
  def deleteTags(params: DeleteTagsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Returns the description of a specific Amazon EFS access point if the AccessPointId is provided. If you provide an EFS FileSystemId, it returns descriptions of all access points for that file system. You can provide either an AccessPointId or a FileSystemId in the request, but not both.  This operation requires permissions for the elasticfilesystem:DescribeAccessPoints action.
    */
  def describeAccessPoints(): Request[DescribeAccessPointsResponse, AWSError] = js.native
  def describeAccessPoints(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccessPointsResponse, Unit]): Request[DescribeAccessPointsResponse, AWSError] = js.native
  /**
    * Returns the description of a specific Amazon EFS access point if the AccessPointId is provided. If you provide an EFS FileSystemId, it returns descriptions of all access points for that file system. You can provide either an AccessPointId or a FileSystemId in the request, but not both.  This operation requires permissions for the elasticfilesystem:DescribeAccessPoints action.
    */
  def describeAccessPoints(params: DescribeAccessPointsRequest): Request[DescribeAccessPointsResponse, AWSError] = js.native
  def describeAccessPoints(
    params: DescribeAccessPointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccessPointsResponse, Unit]
  ): Request[DescribeAccessPointsResponse, AWSError] = js.native
  
  /**
    * Returns the backup policy for the specified EFS file system.
    */
  def describeBackupPolicy(): Request[BackupPolicyDescription, AWSError] = js.native
  def describeBackupPolicy(callback: js.Function2[/* err */ AWSError, /* data */ BackupPolicyDescription, Unit]): Request[BackupPolicyDescription, AWSError] = js.native
  /**
    * Returns the backup policy for the specified EFS file system.
    */
  def describeBackupPolicy(params: DescribeBackupPolicyRequest): Request[BackupPolicyDescription, AWSError] = js.native
  def describeBackupPolicy(
    params: DescribeBackupPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BackupPolicyDescription, Unit]
  ): Request[BackupPolicyDescription, AWSError] = js.native
  
  /**
    * Returns the FileSystemPolicy for the specified EFS file system. This operation requires permissions for the elasticfilesystem:DescribeFileSystemPolicy action.
    */
  def describeFileSystemPolicy(): Request[FileSystemPolicyDescription, AWSError] = js.native
  def describeFileSystemPolicy(callback: js.Function2[/* err */ AWSError, /* data */ FileSystemPolicyDescription, Unit]): Request[FileSystemPolicyDescription, AWSError] = js.native
  /**
    * Returns the FileSystemPolicy for the specified EFS file system. This operation requires permissions for the elasticfilesystem:DescribeFileSystemPolicy action.
    */
  def describeFileSystemPolicy(params: DescribeFileSystemPolicyRequest): Request[FileSystemPolicyDescription, AWSError] = js.native
  def describeFileSystemPolicy(
    params: DescribeFileSystemPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ FileSystemPolicyDescription, Unit]
  ): Request[FileSystemPolicyDescription, AWSError] = js.native
  
  /**
    * Returns the description of a specific Amazon EFS file system if either the file system CreationToken or the FileSystemId is provided. Otherwise, it returns descriptions of all file systems owned by the caller's AWS account in the AWS Region of the endpoint that you're calling. When retrieving all file system descriptions, you can optionally specify the MaxItems parameter to limit the number of descriptions in a response. Currently, this number is automatically set to 10. If more file system descriptions remain, Amazon EFS returns a NextMarker, an opaque token, in the response. In this case, you should send a subsequent request with the Marker request parameter set to the value of NextMarker.  To retrieve a list of your file system descriptions, this operation is used in an iterative process, where DescribeFileSystems is called first without the Marker and then the operation continues to call it with the Marker parameter set to the value of the NextMarker from the previous response until the response has no NextMarker.   The order of file systems returned in the response of one DescribeFileSystems call and the order of file systems returned across the responses of a multi-call iteration is unspecified.   This operation requires permissions for the elasticfilesystem:DescribeFileSystems action. 
    */
  def describeFileSystems(): Request[DescribeFileSystemsResponse, AWSError] = js.native
  def describeFileSystems(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFileSystemsResponse, Unit]): Request[DescribeFileSystemsResponse, AWSError] = js.native
  /**
    * Returns the description of a specific Amazon EFS file system if either the file system CreationToken or the FileSystemId is provided. Otherwise, it returns descriptions of all file systems owned by the caller's AWS account in the AWS Region of the endpoint that you're calling. When retrieving all file system descriptions, you can optionally specify the MaxItems parameter to limit the number of descriptions in a response. Currently, this number is automatically set to 10. If more file system descriptions remain, Amazon EFS returns a NextMarker, an opaque token, in the response. In this case, you should send a subsequent request with the Marker request parameter set to the value of NextMarker.  To retrieve a list of your file system descriptions, this operation is used in an iterative process, where DescribeFileSystems is called first without the Marker and then the operation continues to call it with the Marker parameter set to the value of the NextMarker from the previous response until the response has no NextMarker.   The order of file systems returned in the response of one DescribeFileSystems call and the order of file systems returned across the responses of a multi-call iteration is unspecified.   This operation requires permissions for the elasticfilesystem:DescribeFileSystems action. 
    */
  def describeFileSystems(params: DescribeFileSystemsRequest): Request[DescribeFileSystemsResponse, AWSError] = js.native
  def describeFileSystems(
    params: DescribeFileSystemsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFileSystemsResponse, Unit]
  ): Request[DescribeFileSystemsResponse, AWSError] = js.native
  
  /**
    * Returns the current LifecycleConfiguration object for the specified Amazon EFS file system. EFS lifecycle management uses the LifecycleConfiguration object to identify which files to move to the EFS Infrequent Access (IA) storage class. For a file system without a LifecycleConfiguration object, the call returns an empty array in the response. This operation requires permissions for the elasticfilesystem:DescribeLifecycleConfiguration operation.
    */
  def describeLifecycleConfiguration(): Request[LifecycleConfigurationDescription, AWSError] = js.native
  def describeLifecycleConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ LifecycleConfigurationDescription, Unit]): Request[LifecycleConfigurationDescription, AWSError] = js.native
  /**
    * Returns the current LifecycleConfiguration object for the specified Amazon EFS file system. EFS lifecycle management uses the LifecycleConfiguration object to identify which files to move to the EFS Infrequent Access (IA) storage class. For a file system without a LifecycleConfiguration object, the call returns an empty array in the response. This operation requires permissions for the elasticfilesystem:DescribeLifecycleConfiguration operation.
    */
  def describeLifecycleConfiguration(params: DescribeLifecycleConfigurationRequest): Request[LifecycleConfigurationDescription, AWSError] = js.native
  def describeLifecycleConfiguration(
    params: DescribeLifecycleConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ LifecycleConfigurationDescription, Unit]
  ): Request[LifecycleConfigurationDescription, AWSError] = js.native
  
  /**
    * Returns the security groups currently in effect for a mount target. This operation requires that the network interface of the mount target has been created and the lifecycle state of the mount target is not deleted. This operation requires permissions for the following actions:    elasticfilesystem:DescribeMountTargetSecurityGroups action on the mount target's file system.     ec2:DescribeNetworkInterfaceAttribute action on the mount target's network interface.   
    */
  def describeMountTargetSecurityGroups(): Request[DescribeMountTargetSecurityGroupsResponse, AWSError] = js.native
  def describeMountTargetSecurityGroups(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMountTargetSecurityGroupsResponse, Unit]
  ): Request[DescribeMountTargetSecurityGroupsResponse, AWSError] = js.native
  /**
    * Returns the security groups currently in effect for a mount target. This operation requires that the network interface of the mount target has been created and the lifecycle state of the mount target is not deleted. This operation requires permissions for the following actions:    elasticfilesystem:DescribeMountTargetSecurityGroups action on the mount target's file system.     ec2:DescribeNetworkInterfaceAttribute action on the mount target's network interface.   
    */
  def describeMountTargetSecurityGroups(params: DescribeMountTargetSecurityGroupsRequest): Request[DescribeMountTargetSecurityGroupsResponse, AWSError] = js.native
  def describeMountTargetSecurityGroups(
    params: DescribeMountTargetSecurityGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMountTargetSecurityGroupsResponse, Unit]
  ): Request[DescribeMountTargetSecurityGroupsResponse, AWSError] = js.native
  
  /**
    * Returns the descriptions of all the current mount targets, or a specific mount target, for a file system. When requesting all of the current mount targets, the order of mount targets returned in the response is unspecified. This operation requires permissions for the elasticfilesystem:DescribeMountTargets action, on either the file system ID that you specify in FileSystemId, or on the file system of the mount target that you specify in MountTargetId.
    */
  def describeMountTargets(): Request[DescribeMountTargetsResponse, AWSError] = js.native
  def describeMountTargets(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMountTargetsResponse, Unit]): Request[DescribeMountTargetsResponse, AWSError] = js.native
  /**
    * Returns the descriptions of all the current mount targets, or a specific mount target, for a file system. When requesting all of the current mount targets, the order of mount targets returned in the response is unspecified. This operation requires permissions for the elasticfilesystem:DescribeMountTargets action, on either the file system ID that you specify in FileSystemId, or on the file system of the mount target that you specify in MountTargetId.
    */
  def describeMountTargets(params: DescribeMountTargetsRequest): Request[DescribeMountTargetsResponse, AWSError] = js.native
  def describeMountTargets(
    params: DescribeMountTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMountTargetsResponse, Unit]
  ): Request[DescribeMountTargetsResponse, AWSError] = js.native
  
  /**
    * Returns the tags associated with a file system. The order of tags returned in the response of one DescribeTags call and the order of tags returned across the responses of a multiple-call iteration (when using pagination) is unspecified.   This operation requires permissions for the elasticfilesystem:DescribeTags action. 
    */
  def describeTags(): Request[DescribeTagsResponse, AWSError] = js.native
  def describeTags(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagsResponse, Unit]): Request[DescribeTagsResponse, AWSError] = js.native
  /**
    * Returns the tags associated with a file system. The order of tags returned in the response of one DescribeTags call and the order of tags returned across the responses of a multiple-call iteration (when using pagination) is unspecified.   This operation requires permissions for the elasticfilesystem:DescribeTags action. 
    */
  def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResponse, AWSError] = js.native
  def describeTags(
    params: DescribeTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagsResponse, Unit]
  ): Request[DescribeTagsResponse, AWSError] = js.native
  
  /**
    * Lists all tags for a top-level EFS resource. You must provide the ID of the resource that you want to retrieve the tags for. This operation requires permissions for the elasticfilesystem:DescribeAccessPoints action.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all tags for a top-level EFS resource. You must provide the ID of the resource that you want to retrieve the tags for. This operation requires permissions for the elasticfilesystem:DescribeAccessPoints action.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Modifies the set of security groups in effect for a mount target. When you create a mount target, Amazon EFS also creates a new network interface. For more information, see CreateMountTarget. This operation replaces the security groups in effect for the network interface associated with a mount target, with the SecurityGroups provided in the request. This operation requires that the network interface of the mount target has been created and the lifecycle state of the mount target is not deleted.  The operation requires permissions for the following actions:    elasticfilesystem:ModifyMountTargetSecurityGroups action on the mount target's file system.     ec2:ModifyNetworkInterfaceAttribute action on the mount target's network interface.   
    */
  def modifyMountTargetSecurityGroups(): Request[js.Object, AWSError] = js.native
  def modifyMountTargetSecurityGroups(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Modifies the set of security groups in effect for a mount target. When you create a mount target, Amazon EFS also creates a new network interface. For more information, see CreateMountTarget. This operation replaces the security groups in effect for the network interface associated with a mount target, with the SecurityGroups provided in the request. This operation requires that the network interface of the mount target has been created and the lifecycle state of the mount target is not deleted.  The operation requires permissions for the following actions:    elasticfilesystem:ModifyMountTargetSecurityGroups action on the mount target's file system.     ec2:ModifyNetworkInterfaceAttribute action on the mount target's network interface.   
    */
  def modifyMountTargetSecurityGroups(params: ModifyMountTargetSecurityGroupsRequest): Request[js.Object, AWSError] = js.native
  def modifyMountTargetSecurityGroups(
    params: ModifyMountTargetSecurityGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the file system's backup policy. Use this action to start or stop automatic backups of the file system. 
    */
  def putBackupPolicy(): Request[BackupPolicyDescription, AWSError] = js.native
  def putBackupPolicy(callback: js.Function2[/* err */ AWSError, /* data */ BackupPolicyDescription, Unit]): Request[BackupPolicyDescription, AWSError] = js.native
  /**
    * Updates the file system's backup policy. Use this action to start or stop automatic backups of the file system. 
    */
  def putBackupPolicy(params: PutBackupPolicyRequest): Request[BackupPolicyDescription, AWSError] = js.native
  def putBackupPolicy(
    params: PutBackupPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BackupPolicyDescription, Unit]
  ): Request[BackupPolicyDescription, AWSError] = js.native
  
  /**
    * Applies an Amazon EFS FileSystemPolicy to an Amazon EFS file system. A file system policy is an IAM resource-based policy and can contain multiple policy statements. A file system always has exactly one file system policy, which can be the default policy or an explicit policy set or updated using this API operation. When an explicit policy is set, it overrides the default policy. For more information about the default file system policy, see Default EFS File System Policy.  This operation requires permissions for the elasticfilesystem:PutFileSystemPolicy action.
    */
  def putFileSystemPolicy(): Request[FileSystemPolicyDescription, AWSError] = js.native
  def putFileSystemPolicy(callback: js.Function2[/* err */ AWSError, /* data */ FileSystemPolicyDescription, Unit]): Request[FileSystemPolicyDescription, AWSError] = js.native
  /**
    * Applies an Amazon EFS FileSystemPolicy to an Amazon EFS file system. A file system policy is an IAM resource-based policy and can contain multiple policy statements. A file system always has exactly one file system policy, which can be the default policy or an explicit policy set or updated using this API operation. When an explicit policy is set, it overrides the default policy. For more information about the default file system policy, see Default EFS File System Policy.  This operation requires permissions for the elasticfilesystem:PutFileSystemPolicy action.
    */
  def putFileSystemPolicy(params: PutFileSystemPolicyRequest): Request[FileSystemPolicyDescription, AWSError] = js.native
  def putFileSystemPolicy(
    params: PutFileSystemPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ FileSystemPolicyDescription, Unit]
  ): Request[FileSystemPolicyDescription, AWSError] = js.native
  
  /**
    * Enables lifecycle management by creating a new LifecycleConfiguration object. A LifecycleConfiguration object defines when files in an Amazon EFS file system are automatically transitioned to the lower-cost EFS Infrequent Access (IA) storage class. A LifecycleConfiguration applies to all files in a file system. Each Amazon EFS file system supports one lifecycle configuration, which applies to all files in the file system. If a LifecycleConfiguration object already exists for the specified file system, a PutLifecycleConfiguration call modifies the existing configuration. A PutLifecycleConfiguration call with an empty LifecyclePolicies array in the request body deletes any existing LifecycleConfiguration and disables lifecycle management. In the request, specify the following:    The ID for the file system for which you are enabling, disabling, or modifying lifecycle management.   A LifecyclePolicies array of LifecyclePolicy objects that define when files are moved to the IA storage class. The array can contain only one LifecyclePolicy item.   This operation requires permissions for the elasticfilesystem:PutLifecycleConfiguration operation. To apply a LifecycleConfiguration object to an encrypted file system, you need the same AWS Key Management Service (AWS KMS) permissions as when you created the encrypted file system. 
    */
  def putLifecycleConfiguration(): Request[LifecycleConfigurationDescription, AWSError] = js.native
  def putLifecycleConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ LifecycleConfigurationDescription, Unit]): Request[LifecycleConfigurationDescription, AWSError] = js.native
  /**
    * Enables lifecycle management by creating a new LifecycleConfiguration object. A LifecycleConfiguration object defines when files in an Amazon EFS file system are automatically transitioned to the lower-cost EFS Infrequent Access (IA) storage class. A LifecycleConfiguration applies to all files in a file system. Each Amazon EFS file system supports one lifecycle configuration, which applies to all files in the file system. If a LifecycleConfiguration object already exists for the specified file system, a PutLifecycleConfiguration call modifies the existing configuration. A PutLifecycleConfiguration call with an empty LifecyclePolicies array in the request body deletes any existing LifecycleConfiguration and disables lifecycle management. In the request, specify the following:    The ID for the file system for which you are enabling, disabling, or modifying lifecycle management.   A LifecyclePolicies array of LifecyclePolicy objects that define when files are moved to the IA storage class. The array can contain only one LifecyclePolicy item.   This operation requires permissions for the elasticfilesystem:PutLifecycleConfiguration operation. To apply a LifecycleConfiguration object to an encrypted file system, you need the same AWS Key Management Service (AWS KMS) permissions as when you created the encrypted file system. 
    */
  def putLifecycleConfiguration(params: PutLifecycleConfigurationRequest): Request[LifecycleConfigurationDescription, AWSError] = js.native
  def putLifecycleConfiguration(
    params: PutLifecycleConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ LifecycleConfigurationDescription, Unit]
  ): Request[LifecycleConfigurationDescription, AWSError] = js.native
  
  /**
    * Creates a tag for an EFS resource. You can create tags for EFS file systems and access points using this API operation. This operation requires permissions for the elasticfilesystem:TagResource action.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a tag for an EFS resource. You can create tags for EFS file systems and access points using this API operation. This operation requires permissions for the elasticfilesystem:TagResource action.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes tags from an EFS resource. You can remove tags from EFS file systems and access points using this API operation. This operation requires permissions for the elasticfilesystem:UntagResource action.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes tags from an EFS resource. You can remove tags from EFS file systems and access points using this API operation. This operation requires permissions for the elasticfilesystem:UntagResource action.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the throughput mode or the amount of provisioned throughput of an existing file system.
    */
  def updateFileSystem(): Request[FileSystemDescription, AWSError] = js.native
  def updateFileSystem(callback: js.Function2[/* err */ AWSError, /* data */ FileSystemDescription, Unit]): Request[FileSystemDescription, AWSError] = js.native
  /**
    * Updates the throughput mode or the amount of provisioned throughput of an existing file system.
    */
  def updateFileSystem(params: UpdateFileSystemRequest): Request[FileSystemDescription, AWSError] = js.native
  def updateFileSystem(
    params: UpdateFileSystemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ FileSystemDescription, Unit]
  ): Request[FileSystemDescription, AWSError] = js.native
}
