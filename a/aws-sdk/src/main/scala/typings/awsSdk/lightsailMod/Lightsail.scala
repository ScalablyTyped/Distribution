package typings.awsSdk.lightsailMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lightsail extends Service {
  @JSName("config")
  var config_Lightsail: ConfigBase with ClientConfiguration = js.native
  /**
    * Allocates a static IP address.
    */
  def allocateStaticIp(): Request[AllocateStaticIpResult, AWSError] = js.native
  def allocateStaticIp(callback: js.Function2[/* err */ AWSError, /* data */ AllocateStaticIpResult, Unit]): Request[AllocateStaticIpResult, AWSError] = js.native
  /**
    * Allocates a static IP address.
    */
  def allocateStaticIp(params: AllocateStaticIpRequest): Request[AllocateStaticIpResult, AWSError] = js.native
  def allocateStaticIp(
    params: AllocateStaticIpRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AllocateStaticIpResult, Unit]
  ): Request[AllocateStaticIpResult, AWSError] = js.native
  /**
    * Attaches a block storage disk to a running or stopped Lightsail instance and exposes it to the instance with the specified disk name. The attach disk operation supports tag-based access control via resource tags applied to the resource identified by disk name. For more information, see the Lightsail Dev Guide.
    */
  def attachDisk(): Request[AttachDiskResult, AWSError] = js.native
  def attachDisk(callback: js.Function2[/* err */ AWSError, /* data */ AttachDiskResult, Unit]): Request[AttachDiskResult, AWSError] = js.native
  /**
    * Attaches a block storage disk to a running or stopped Lightsail instance and exposes it to the instance with the specified disk name. The attach disk operation supports tag-based access control via resource tags applied to the resource identified by disk name. For more information, see the Lightsail Dev Guide.
    */
  def attachDisk(params: AttachDiskRequest): Request[AttachDiskResult, AWSError] = js.native
  def attachDisk(
    params: AttachDiskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachDiskResult, Unit]
  ): Request[AttachDiskResult, AWSError] = js.native
  /**
    * Attaches one or more Lightsail instances to a load balancer. After some time, the instances are attached to the load balancer and the health check status is available. The attach instances to load balancer operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Lightsail Dev Guide.
    */
  def attachInstancesToLoadBalancer(): Request[AttachInstancesToLoadBalancerResult, AWSError] = js.native
  def attachInstancesToLoadBalancer(callback: js.Function2[/* err */ AWSError, /* data */ AttachInstancesToLoadBalancerResult, Unit]): Request[AttachInstancesToLoadBalancerResult, AWSError] = js.native
  /**
    * Attaches one or more Lightsail instances to a load balancer. After some time, the instances are attached to the load balancer and the health check status is available. The attach instances to load balancer operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Lightsail Dev Guide.
    */
  def attachInstancesToLoadBalancer(params: AttachInstancesToLoadBalancerRequest): Request[AttachInstancesToLoadBalancerResult, AWSError] = js.native
  def attachInstancesToLoadBalancer(
    params: AttachInstancesToLoadBalancerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachInstancesToLoadBalancerResult, Unit]
  ): Request[AttachInstancesToLoadBalancerResult, AWSError] = js.native
  /**
    * Attaches a Transport Layer Security (TLS) certificate to your load balancer. TLS is just an updated, more secure version of Secure Socket Layer (SSL). Once you create and validate your certificate, you can attach it to your load balancer. You can also use this API to rotate the certificates on your account. Use the attach load balancer tls certificate operation with the non-attached certificate, and it will replace the existing one and become the attached certificate. The attach load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Lightsail Dev Guide.
    */
  def attachLoadBalancerTlsCertificate(): Request[AttachLoadBalancerTlsCertificateResult, AWSError] = js.native
  def attachLoadBalancerTlsCertificate(
    callback: js.Function2[/* err */ AWSError, /* data */ AttachLoadBalancerTlsCertificateResult, Unit]
  ): Request[AttachLoadBalancerTlsCertificateResult, AWSError] = js.native
  /**
    * Attaches a Transport Layer Security (TLS) certificate to your load balancer. TLS is just an updated, more secure version of Secure Socket Layer (SSL). Once you create and validate your certificate, you can attach it to your load balancer. You can also use this API to rotate the certificates on your account. Use the attach load balancer tls certificate operation with the non-attached certificate, and it will replace the existing one and become the attached certificate. The attach load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Lightsail Dev Guide.
    */
  def attachLoadBalancerTlsCertificate(params: AttachLoadBalancerTlsCertificateRequest): Request[AttachLoadBalancerTlsCertificateResult, AWSError] = js.native
  def attachLoadBalancerTlsCertificate(
    params: AttachLoadBalancerTlsCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachLoadBalancerTlsCertificateResult, Unit]
  ): Request[AttachLoadBalancerTlsCertificateResult, AWSError] = js.native
  /**
    * Attaches a static IP address to a specific Amazon Lightsail instance.
    */
  def attachStaticIp(): Request[AttachStaticIpResult, AWSError] = js.native
  def attachStaticIp(callback: js.Function2[/* err */ AWSError, /* data */ AttachStaticIpResult, Unit]): Request[AttachStaticIpResult, AWSError] = js.native
  /**
    * Attaches a static IP address to a specific Amazon Lightsail instance.
    */
  def attachStaticIp(params: AttachStaticIpRequest): Request[AttachStaticIpResult, AWSError] = js.native
  def attachStaticIp(
    params: AttachStaticIpRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachStaticIpResult, Unit]
  ): Request[AttachStaticIpResult, AWSError] = js.native
  /**
    * Closes the public ports on a specific Amazon Lightsail instance. The close instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Lightsail Dev Guide.
    */
  def closeInstancePublicPorts(): Request[CloseInstancePublicPortsResult, AWSError] = js.native
  def closeInstancePublicPorts(callback: js.Function2[/* err */ AWSError, /* data */ CloseInstancePublicPortsResult, Unit]): Request[CloseInstancePublicPortsResult, AWSError] = js.native
  /**
    * Closes the public ports on a specific Amazon Lightsail instance. The close instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Lightsail Dev Guide.
    */
  def closeInstancePublicPorts(params: CloseInstancePublicPortsRequest): Request[CloseInstancePublicPortsResult, AWSError] = js.native
  def closeInstancePublicPorts(
    params: CloseInstancePublicPortsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CloseInstancePublicPortsResult, Unit]
  ): Request[CloseInstancePublicPortsResult, AWSError] = js.native
  /**
    * Copies a manual snapshot of an instance or disk as another manual snapshot, or copies an automatic snapshot of an instance or disk as a manual snapshot. This operation can also be used to copy a manual or automatic snapshot of an instance or a disk from one AWS Region to another in Amazon Lightsail. When copying a manual snapshot, be sure to define the source region, source snapshot name, and target snapshot name parameters. When copying an automatic snapshot, be sure to define the source region, source resource name, target snapshot name, and either the restore date or the use latest restorable auto snapshot parameters.
    */
  def copySnapshot(): Request[CopySnapshotResult, AWSError] = js.native
  def copySnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CopySnapshotResult, Unit]): Request[CopySnapshotResult, AWSError] = js.native
  /**
    * Copies a manual snapshot of an instance or disk as another manual snapshot, or copies an automatic snapshot of an instance or disk as a manual snapshot. This operation can also be used to copy a manual or automatic snapshot of an instance or a disk from one AWS Region to another in Amazon Lightsail. When copying a manual snapshot, be sure to define the source region, source snapshot name, and target snapshot name parameters. When copying an automatic snapshot, be sure to define the source region, source resource name, target snapshot name, and either the restore date or the use latest restorable auto snapshot parameters.
    */
  def copySnapshot(params: CopySnapshotRequest): Request[CopySnapshotResult, AWSError] = js.native
  def copySnapshot(
    params: CopySnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CopySnapshotResult, Unit]
  ): Request[CopySnapshotResult, AWSError] = js.native
  /**
    * Creates an AWS CloudFormation stack, which creates a new Amazon EC2 instance from an exported Amazon Lightsail snapshot. This operation results in a CloudFormation stack record that can be used to track the AWS CloudFormation stack created. Use the get cloud formation stack records operation to get a list of the CloudFormation stacks created.  Wait until after your new Amazon EC2 instance is created before running the create cloud formation stack operation again with the same export snapshot record. 
    */
  def createCloudFormationStack(): Request[CreateCloudFormationStackResult, AWSError] = js.native
  def createCloudFormationStack(callback: js.Function2[/* err */ AWSError, /* data */ CreateCloudFormationStackResult, Unit]): Request[CreateCloudFormationStackResult, AWSError] = js.native
  /**
    * Creates an AWS CloudFormation stack, which creates a new Amazon EC2 instance from an exported Amazon Lightsail snapshot. This operation results in a CloudFormation stack record that can be used to track the AWS CloudFormation stack created. Use the get cloud formation stack records operation to get a list of the CloudFormation stacks created.  Wait until after your new Amazon EC2 instance is created before running the create cloud formation stack operation again with the same export snapshot record. 
    */
  def createCloudFormationStack(params: CreateCloudFormationStackRequest): Request[CreateCloudFormationStackResult, AWSError] = js.native
  def createCloudFormationStack(
    params: CreateCloudFormationStackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCloudFormationStackResult, Unit]
  ): Request[CreateCloudFormationStackResult, AWSError] = js.native
  /**
    * Creates a block storage disk that can be attached to an Amazon Lightsail instance in the same Availability Zone (e.g., us-east-2a). The create disk operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDisk(): Request[CreateDiskResult, AWSError] = js.native
  def createDisk(callback: js.Function2[/* err */ AWSError, /* data */ CreateDiskResult, Unit]): Request[CreateDiskResult, AWSError] = js.native
  /**
    * Creates a block storage disk that can be attached to an Amazon Lightsail instance in the same Availability Zone (e.g., us-east-2a). The create disk operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDisk(params: CreateDiskRequest): Request[CreateDiskResult, AWSError] = js.native
  def createDisk(
    params: CreateDiskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDiskResult, Unit]
  ): Request[CreateDiskResult, AWSError] = js.native
  /**
    * Creates a block storage disk from a manual or automatic snapshot of a disk. The resulting disk can be attached to an Amazon Lightsail instance in the same Availability Zone (e.g., us-east-2a). The create disk from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by disk snapshot name. For more information, see the Lightsail Dev Guide.
    */
  def createDiskFromSnapshot(): Request[CreateDiskFromSnapshotResult, AWSError] = js.native
  def createDiskFromSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateDiskFromSnapshotResult, Unit]): Request[CreateDiskFromSnapshotResult, AWSError] = js.native
  /**
    * Creates a block storage disk from a manual or automatic snapshot of a disk. The resulting disk can be attached to an Amazon Lightsail instance in the same Availability Zone (e.g., us-east-2a). The create disk from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by disk snapshot name. For more information, see the Lightsail Dev Guide.
    */
  def createDiskFromSnapshot(params: CreateDiskFromSnapshotRequest): Request[CreateDiskFromSnapshotResult, AWSError] = js.native
  def createDiskFromSnapshot(
    params: CreateDiskFromSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDiskFromSnapshotResult, Unit]
  ): Request[CreateDiskFromSnapshotResult, AWSError] = js.native
  /**
    * Creates a snapshot of a block storage disk. You can use snapshots for backups, to make copies of disks, and to save data before shutting down a Lightsail instance. You can take a snapshot of an attached disk that is in use; however, snapshots only capture data that has been written to your disk at the time the snapshot command is issued. This may exclude any data that has been cached by any applications or the operating system. If you can pause any file systems on the disk long enough to take a snapshot, your snapshot should be complete. Nevertheless, if you cannot pause all file writes to the disk, you should unmount the disk from within the Lightsail instance, issue the create disk snapshot command, and then remount the disk to ensure a consistent and complete snapshot. You may remount and use your disk while the snapshot status is pending. You can also use this operation to create a snapshot of an instance's system volume. You might want to do this, for example, to recover data from the system volume of a botched instance or to create a backup of the system volume like you would for a block storage disk. To create a snapshot of a system volume, just define the instance name parameter when issuing the snapshot command, and a snapshot of the defined instance's system volume will be created. After the snapshot is available, you can create a block storage disk from the snapshot and attach it to a running instance to access the data on the disk. The create disk snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDiskSnapshot(): Request[CreateDiskSnapshotResult, AWSError] = js.native
  def createDiskSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateDiskSnapshotResult, Unit]): Request[CreateDiskSnapshotResult, AWSError] = js.native
  /**
    * Creates a snapshot of a block storage disk. You can use snapshots for backups, to make copies of disks, and to save data before shutting down a Lightsail instance. You can take a snapshot of an attached disk that is in use; however, snapshots only capture data that has been written to your disk at the time the snapshot command is issued. This may exclude any data that has been cached by any applications or the operating system. If you can pause any file systems on the disk long enough to take a snapshot, your snapshot should be complete. Nevertheless, if you cannot pause all file writes to the disk, you should unmount the disk from within the Lightsail instance, issue the create disk snapshot command, and then remount the disk to ensure a consistent and complete snapshot. You may remount and use your disk while the snapshot status is pending. You can also use this operation to create a snapshot of an instance's system volume. You might want to do this, for example, to recover data from the system volume of a botched instance or to create a backup of the system volume like you would for a block storage disk. To create a snapshot of a system volume, just define the instance name parameter when issuing the snapshot command, and a snapshot of the defined instance's system volume will be created. After the snapshot is available, you can create a block storage disk from the snapshot and attach it to a running instance to access the data on the disk. The create disk snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDiskSnapshot(params: CreateDiskSnapshotRequest): Request[CreateDiskSnapshotResult, AWSError] = js.native
  def createDiskSnapshot(
    params: CreateDiskSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDiskSnapshotResult, Unit]
  ): Request[CreateDiskSnapshotResult, AWSError] = js.native
  /**
    * Creates a domain resource for the specified domain (e.g., example.com). The create domain operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDomain(): Request[CreateDomainResult, AWSError] = js.native
  def createDomain(callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResult, Unit]): Request[CreateDomainResult, AWSError] = js.native
  /**
    * Creates a domain resource for the specified domain (e.g., example.com). The create domain operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createDomain(params: CreateDomainRequest): Request[CreateDomainResult, AWSError] = js.native
  def createDomain(
    params: CreateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResult, Unit]
  ): Request[CreateDomainResult, AWSError] = js.native
  /**
    * Creates one of the following entry records associated with the domain: Address (A), canonical name (CNAME), mail exchanger (MX), name server (NS), start of authority (SOA), service locator (SRV), or text (TXT). The create domain entry operation supports tag-based access control via resource tags applied to the resource identified by domain name. For more information, see the Lightsail Dev Guide.
    */
  def createDomainEntry(): Request[CreateDomainEntryResult, AWSError] = js.native
  def createDomainEntry(callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainEntryResult, Unit]): Request[CreateDomainEntryResult, AWSError] = js.native
  /**
    * Creates one of the following entry records associated with the domain: Address (A), canonical name (CNAME), mail exchanger (MX), name server (NS), start of authority (SOA), service locator (SRV), or text (TXT). The create domain entry operation supports tag-based access control via resource tags applied to the resource identified by domain name. For more information, see the Lightsail Dev Guide.
    */
  def createDomainEntry(params: CreateDomainEntryRequest): Request[CreateDomainEntryResult, AWSError] = js.native
  def createDomainEntry(
    params: CreateDomainEntryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainEntryResult, Unit]
  ): Request[CreateDomainEntryResult, AWSError] = js.native
  /**
    * Creates a snapshot of a specific virtual private server, or instance. You can use a snapshot to create a new instance that is based on that snapshot. The create instance snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createInstanceSnapshot(): Request[CreateInstanceSnapshotResult, AWSError] = js.native
  def createInstanceSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateInstanceSnapshotResult, Unit]): Request[CreateInstanceSnapshotResult, AWSError] = js.native
  /**
    * Creates a snapshot of a specific virtual private server, or instance. You can use a snapshot to create a new instance that is based on that snapshot. The create instance snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createInstanceSnapshot(params: CreateInstanceSnapshotRequest): Request[CreateInstanceSnapshotResult, AWSError] = js.native
  def createInstanceSnapshot(
    params: CreateInstanceSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInstanceSnapshotResult, Unit]
  ): Request[CreateInstanceSnapshotResult, AWSError] = js.native
  /**
    * Creates one or more Amazon Lightsail instances. The create instances operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createInstances(): Request[CreateInstancesResult, AWSError] = js.native
  def createInstances(callback: js.Function2[/* err */ AWSError, /* data */ CreateInstancesResult, Unit]): Request[CreateInstancesResult, AWSError] = js.native
  /**
    * Creates one or more Amazon Lightsail instances. The create instances operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createInstances(params: CreateInstancesRequest): Request[CreateInstancesResult, AWSError] = js.native
  def createInstances(
    params: CreateInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInstancesResult, Unit]
  ): Request[CreateInstancesResult, AWSError] = js.native
  /**
    * Creates one or more new instances from a manual or automatic snapshot of an instance. The create instances from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by instance snapshot name. For more information, see the Lightsail Dev Guide.
    */
  def createInstancesFromSnapshot(): Request[CreateInstancesFromSnapshotResult, AWSError] = js.native
  def createInstancesFromSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateInstancesFromSnapshotResult, Unit]): Request[CreateInstancesFromSnapshotResult, AWSError] = js.native
  /**
    * Creates one or more new instances from a manual or automatic snapshot of an instance. The create instances from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by instance snapshot name. For more information, see the Lightsail Dev Guide.
    */
  def createInstancesFromSnapshot(params: CreateInstancesFromSnapshotRequest): Request[CreateInstancesFromSnapshotResult, AWSError] = js.native
  def createInstancesFromSnapshot(
    params: CreateInstancesFromSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInstancesFromSnapshotResult, Unit]
  ): Request[CreateInstancesFromSnapshotResult, AWSError] = js.native
  /**
    * Creates an SSH key pair. The create key pair operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createKeyPair(): Request[CreateKeyPairResult, AWSError] = js.native
  def createKeyPair(callback: js.Function2[/* err */ AWSError, /* data */ CreateKeyPairResult, Unit]): Request[CreateKeyPairResult, AWSError] = js.native
  /**
    * Creates an SSH key pair. The create key pair operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createKeyPair(params: CreateKeyPairRequest): Request[CreateKeyPairResult, AWSError] = js.native
  def createKeyPair(
    params: CreateKeyPairRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateKeyPairResult, Unit]
  ): Request[CreateKeyPairResult, AWSError] = js.native
  /**
    * Creates a Lightsail load balancer. To learn more about deciding whether to load balance your application, see Configure your Lightsail instances for load balancing. You can create up to 5 load balancers per AWS Region in your account. When you create a load balancer, you can specify a unique name and port settings. To change additional load balancer settings, use the UpdateLoadBalancerAttribute operation. The create load balancer operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createLoadBalancer(): Request[CreateLoadBalancerResult, AWSError] = js.native
  def createLoadBalancer(callback: js.Function2[/* err */ AWSError, /* data */ CreateLoadBalancerResult, Unit]): Request[CreateLoadBalancerResult, AWSError] = js.native
  /**
    * Creates a Lightsail load balancer. To learn more about deciding whether to load balance your application, see Configure your Lightsail instances for load balancing. You can create up to 5 load balancers per AWS Region in your account. When you create a load balancer, you can specify a unique name and port settings. To change additional load balancer settings, use the UpdateLoadBalancerAttribute operation. The create load balancer operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createLoadBalancer(params: CreateLoadBalancerRequest): Request[CreateLoadBalancerResult, AWSError] = js.native
  def createLoadBalancer(
    params: CreateLoadBalancerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLoadBalancerResult, Unit]
  ): Request[CreateLoadBalancerResult, AWSError] = js.native
  /**
    * Creates a Lightsail load balancer TLS certificate. TLS is just an updated, more secure version of Secure Socket Layer (SSL). The create load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Lightsail Dev Guide.
    */
  def createLoadBalancerTlsCertificate(): Request[CreateLoadBalancerTlsCertificateResult, AWSError] = js.native
  def createLoadBalancerTlsCertificate(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLoadBalancerTlsCertificateResult, Unit]
  ): Request[CreateLoadBalancerTlsCertificateResult, AWSError] = js.native
  /**
    * Creates a Lightsail load balancer TLS certificate. TLS is just an updated, more secure version of Secure Socket Layer (SSL). The create load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Lightsail Dev Guide.
    */
  def createLoadBalancerTlsCertificate(params: CreateLoadBalancerTlsCertificateRequest): Request[CreateLoadBalancerTlsCertificateResult, AWSError] = js.native
  def createLoadBalancerTlsCertificate(
    params: CreateLoadBalancerTlsCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLoadBalancerTlsCertificateResult, Unit]
  ): Request[CreateLoadBalancerTlsCertificateResult, AWSError] = js.native
  /**
    * Creates a new database in Amazon Lightsail. The create relational database operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabase(): Request[CreateRelationalDatabaseResult, AWSError] = js.native
  def createRelationalDatabase(callback: js.Function2[/* err */ AWSError, /* data */ CreateRelationalDatabaseResult, Unit]): Request[CreateRelationalDatabaseResult, AWSError] = js.native
  /**
    * Creates a new database in Amazon Lightsail. The create relational database operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabase(params: CreateRelationalDatabaseRequest): Request[CreateRelationalDatabaseResult, AWSError] = js.native
  def createRelationalDatabase(
    params: CreateRelationalDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRelationalDatabaseResult, Unit]
  ): Request[CreateRelationalDatabaseResult, AWSError] = js.native
  /**
    * Creates a new database from an existing database snapshot in Amazon Lightsail. You can create a new database from a snapshot in if something goes wrong with your original database, or to change it to a different plan, such as a high availability or standard plan. The create relational database from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by relationalDatabaseSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabaseFromSnapshot(): Request[CreateRelationalDatabaseFromSnapshotResult, AWSError] = js.native
  def createRelationalDatabaseFromSnapshot(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRelationalDatabaseFromSnapshotResult, Unit]
  ): Request[CreateRelationalDatabaseFromSnapshotResult, AWSError] = js.native
  /**
    * Creates a new database from an existing database snapshot in Amazon Lightsail. You can create a new database from a snapshot in if something goes wrong with your original database, or to change it to a different plan, such as a high availability or standard plan. The create relational database from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by relationalDatabaseSnapshotName. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabaseFromSnapshot(params: CreateRelationalDatabaseFromSnapshotRequest): Request[CreateRelationalDatabaseFromSnapshotResult, AWSError] = js.native
  def createRelationalDatabaseFromSnapshot(
    params: CreateRelationalDatabaseFromSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRelationalDatabaseFromSnapshotResult, Unit]
  ): Request[CreateRelationalDatabaseFromSnapshotResult, AWSError] = js.native
  /**
    * Creates a snapshot of your database in Amazon Lightsail. You can use snapshots for backups, to make copies of a database, and to save data before deleting a database. The create relational database snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabaseSnapshot(): Request[CreateRelationalDatabaseSnapshotResult, AWSError] = js.native
  def createRelationalDatabaseSnapshot(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRelationalDatabaseSnapshotResult, Unit]
  ): Request[CreateRelationalDatabaseSnapshotResult, AWSError] = js.native
  /**
    * Creates a snapshot of your database in Amazon Lightsail. You can use snapshots for backups, to make copies of a database, and to save data before deleting a database. The create relational database snapshot operation supports tag-based access control via request tags. For more information, see the Lightsail Dev Guide.
    */
  def createRelationalDatabaseSnapshot(params: CreateRelationalDatabaseSnapshotRequest): Request[CreateRelationalDatabaseSnapshotResult, AWSError] = js.native
  def createRelationalDatabaseSnapshot(
    params: CreateRelationalDatabaseSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRelationalDatabaseSnapshotResult, Unit]
  ): Request[CreateRelationalDatabaseSnapshotResult, AWSError] = js.native
  /**
    * Deletes an automatic snapshot of an instance or disk. For more information, see the Lightsail Dev Guide.
    */
  def deleteAutoSnapshot(): Request[DeleteAutoSnapshotResult, AWSError] = js.native
  def deleteAutoSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAutoSnapshotResult, Unit]): Request[DeleteAutoSnapshotResult, AWSError] = js.native
  /**
    * Deletes an automatic snapshot of an instance or disk. For more information, see the Lightsail Dev Guide.
    */
  def deleteAutoSnapshot(params: DeleteAutoSnapshotRequest): Request[DeleteAutoSnapshotResult, AWSError] = js.native
  def deleteAutoSnapshot(
    params: DeleteAutoSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAutoSnapshotResult, Unit]
  ): Request[DeleteAutoSnapshotResult, AWSError] = js.native
  /**
    * Deletes the specified block storage disk. The disk must be in the available state (not attached to a Lightsail instance).  The disk may remain in the deleting state for several minutes.  The delete disk operation supports tag-based access control via resource tags applied to the resource identified by disk name. For more information, see the Lightsail Dev Guide.
    */
  def deleteDisk(): Request[DeleteDiskResult, AWSError] = js.native
  def deleteDisk(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDiskResult, Unit]): Request[DeleteDiskResult, AWSError] = js.native
  /**
    * Deletes the specified block storage disk. The disk must be in the available state (not attached to a Lightsail instance).  The disk may remain in the deleting state for several minutes.  The delete disk operation supports tag-based access control via resource tags applied to the resource identified by disk name. For more information, see the Lightsail Dev Guide.
    */
  def deleteDisk(params: DeleteDiskRequest): Request[DeleteDiskResult, AWSError] = js.native
  def deleteDisk(
    params: DeleteDiskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDiskResult, Unit]
  ): Request[DeleteDiskResult, AWSError] = js.native
  /**
    * Deletes the specified disk snapshot. When you make periodic snapshots of a disk, the snapshots are incremental, and only the blocks on the device that have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all active snapshots will have access to all the information needed to restore the disk. The delete disk snapshot operation supports tag-based access control via resource tags applied to the resource identified by disk snapshot name. For more information, see the Lightsail Dev Guide.
    */
  def deleteDiskSnapshot(): Request[DeleteDiskSnapshotResult, AWSError] = js.native
  def deleteDiskSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDiskSnapshotResult, Unit]): Request[DeleteDiskSnapshotResult, AWSError] = js.native
  /**
    * Deletes the specified disk snapshot. When you make periodic snapshots of a disk, the snapshots are incremental, and only the blocks on the device that have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all active snapshots will have access to all the information needed to restore the disk. The delete disk snapshot operation supports tag-based access control via resource tags applied to the resource identified by disk snapshot name. For more information, see the Lightsail Dev Guide.
    */
  def deleteDiskSnapshot(params: DeleteDiskSnapshotRequest): Request[DeleteDiskSnapshotResult, AWSError] = js.native
  def deleteDiskSnapshot(
    params: DeleteDiskSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDiskSnapshotResult, Unit]
  ): Request[DeleteDiskSnapshotResult, AWSError] = js.native
  /**
    * Deletes the specified domain recordset and all of its domain records. The delete domain operation supports tag-based access control via resource tags applied to the resource identified by domain name. For more information, see the Lightsail Dev Guide.
    */
  def deleteDomain(): Request[DeleteDomainResult, AWSError] = js.native
  def deleteDomain(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainResult, Unit]): Request[DeleteDomainResult, AWSError] = js.native
  /**
    * Deletes the specified domain recordset and all of its domain records. The delete domain operation supports tag-based access control via resource tags applied to the resource identified by domain name. For more information, see the Lightsail Dev Guide.
    */
  def deleteDomain(params: DeleteDomainRequest): Request[DeleteDomainResult, AWSError] = js.native
  def deleteDomain(
    params: DeleteDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainResult, Unit]
  ): Request[DeleteDomainResult, AWSError] = js.native
  /**
    * Deletes a specific domain entry. The delete domain entry operation supports tag-based access control via resource tags applied to the resource identified by domain name. For more information, see the Lightsail Dev Guide.
    */
  def deleteDomainEntry(): Request[DeleteDomainEntryResult, AWSError] = js.native
  def deleteDomainEntry(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainEntryResult, Unit]): Request[DeleteDomainEntryResult, AWSError] = js.native
  /**
    * Deletes a specific domain entry. The delete domain entry operation supports tag-based access control via resource tags applied to the resource identified by domain name. For more information, see the Lightsail Dev Guide.
    */
  def deleteDomainEntry(params: DeleteDomainEntryRequest): Request[DeleteDomainEntryResult, AWSError] = js.native
  def deleteDomainEntry(
    params: DeleteDomainEntryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainEntryResult, Unit]
  ): Request[DeleteDomainEntryResult, AWSError] = js.native
  /**
    * Deletes an Amazon Lightsail instance. The delete instance operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Lightsail Dev Guide.
    */
  def deleteInstance(): Request[DeleteInstanceResult, AWSError] = js.native
  def deleteInstance(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInstanceResult, Unit]): Request[DeleteInstanceResult, AWSError] = js.native
  /**
    * Deletes an Amazon Lightsail instance. The delete instance operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Lightsail Dev Guide.
    */
  def deleteInstance(params: DeleteInstanceRequest): Request[DeleteInstanceResult, AWSError] = js.native
  def deleteInstance(
    params: DeleteInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInstanceResult, Unit]
  ): Request[DeleteInstanceResult, AWSError] = js.native
  /**
    * Deletes a specific snapshot of a virtual private server (or instance). The delete instance snapshot operation supports tag-based access control via resource tags applied to the resource identified by instance snapshot name. For more information, see the Lightsail Dev Guide.
    */
  def deleteInstanceSnapshot(): Request[DeleteInstanceSnapshotResult, AWSError] = js.native
  def deleteInstanceSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInstanceSnapshotResult, Unit]): Request[DeleteInstanceSnapshotResult, AWSError] = js.native
  /**
    * Deletes a specific snapshot of a virtual private server (or instance). The delete instance snapshot operation supports tag-based access control via resource tags applied to the resource identified by instance snapshot name. For more information, see the Lightsail Dev Guide.
    */
  def deleteInstanceSnapshot(params: DeleteInstanceSnapshotRequest): Request[DeleteInstanceSnapshotResult, AWSError] = js.native
  def deleteInstanceSnapshot(
    params: DeleteInstanceSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInstanceSnapshotResult, Unit]
  ): Request[DeleteInstanceSnapshotResult, AWSError] = js.native
  /**
    * Deletes a specific SSH key pair. The delete key pair operation supports tag-based access control via resource tags applied to the resource identified by key pair name. For more information, see the Lightsail Dev Guide.
    */
  def deleteKeyPair(): Request[DeleteKeyPairResult, AWSError] = js.native
  def deleteKeyPair(callback: js.Function2[/* err */ AWSError, /* data */ DeleteKeyPairResult, Unit]): Request[DeleteKeyPairResult, AWSError] = js.native
  /**
    * Deletes a specific SSH key pair. The delete key pair operation supports tag-based access control via resource tags applied to the resource identified by key pair name. For more information, see the Lightsail Dev Guide.
    */
  def deleteKeyPair(params: DeleteKeyPairRequest): Request[DeleteKeyPairResult, AWSError] = js.native
  def deleteKeyPair(
    params: DeleteKeyPairRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteKeyPairResult, Unit]
  ): Request[DeleteKeyPairResult, AWSError] = js.native
  /**
    * Deletes the known host key or certificate used by the Amazon Lightsail browser-based SSH or RDP clients to authenticate an instance. This operation enables the Lightsail browser-based SSH or RDP clients to connect to the instance after a host key mismatch.  Perform this operation only if you were expecting the host key or certificate mismatch or if you are familiar with the new host key or certificate on the instance. For more information, see Troubleshooting connection issues when using the Amazon Lightsail browser-based SSH or RDP client. 
    */
  def deleteKnownHostKeys(): Request[DeleteKnownHostKeysResult, AWSError] = js.native
  def deleteKnownHostKeys(callback: js.Function2[/* err */ AWSError, /* data */ DeleteKnownHostKeysResult, Unit]): Request[DeleteKnownHostKeysResult, AWSError] = js.native
  /**
    * Deletes the known host key or certificate used by the Amazon Lightsail browser-based SSH or RDP clients to authenticate an instance. This operation enables the Lightsail browser-based SSH or RDP clients to connect to the instance after a host key mismatch.  Perform this operation only if you were expecting the host key or certificate mismatch or if you are familiar with the new host key or certificate on the instance. For more information, see Troubleshooting connection issues when using the Amazon Lightsail browser-based SSH or RDP client. 
    */
  def deleteKnownHostKeys(params: DeleteKnownHostKeysRequest): Request[DeleteKnownHostKeysResult, AWSError] = js.native
  def deleteKnownHostKeys(
    params: DeleteKnownHostKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteKnownHostKeysResult, Unit]
  ): Request[DeleteKnownHostKeysResult, AWSError] = js.native
  /**
    * Deletes a Lightsail load balancer and all its associated SSL/TLS certificates. Once the load balancer is deleted, you will need to create a new load balancer, create a new certificate, and verify domain ownership again. The delete load balancer operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Lightsail Dev Guide.
    */
  def deleteLoadBalancer(): Request[DeleteLoadBalancerResult, AWSError] = js.native
  def deleteLoadBalancer(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoadBalancerResult, Unit]): Request[DeleteLoadBalancerResult, AWSError] = js.native
  /**
    * Deletes a Lightsail load balancer and all its associated SSL/TLS certificates. Once the load balancer is deleted, you will need to create a new load balancer, create a new certificate, and verify domain ownership again. The delete load balancer operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Lightsail Dev Guide.
    */
  def deleteLoadBalancer(params: DeleteLoadBalancerRequest): Request[DeleteLoadBalancerResult, AWSError] = js.native
  def deleteLoadBalancer(
    params: DeleteLoadBalancerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoadBalancerResult, Unit]
  ): Request[DeleteLoadBalancerResult, AWSError] = js.native
  /**
    * Deletes an SSL/TLS certificate associated with a Lightsail load balancer. The delete load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Lightsail Dev Guide.
    */
  def deleteLoadBalancerTlsCertificate(): Request[DeleteLoadBalancerTlsCertificateResult, AWSError] = js.native
  def deleteLoadBalancerTlsCertificate(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoadBalancerTlsCertificateResult, Unit]
  ): Request[DeleteLoadBalancerTlsCertificateResult, AWSError] = js.native
  /**
    * Deletes an SSL/TLS certificate associated with a Lightsail load balancer. The delete load balancer tls certificate operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Lightsail Dev Guide.
    */
  def deleteLoadBalancerTlsCertificate(params: DeleteLoadBalancerTlsCertificateRequest): Request[DeleteLoadBalancerTlsCertificateResult, AWSError] = js.native
  def deleteLoadBalancerTlsCertificate(
    params: DeleteLoadBalancerTlsCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoadBalancerTlsCertificateResult, Unit]
  ): Request[DeleteLoadBalancerTlsCertificateResult, AWSError] = js.native
  /**
    * Deletes a database in Amazon Lightsail. The delete relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def deleteRelationalDatabase(): Request[DeleteRelationalDatabaseResult, AWSError] = js.native
  def deleteRelationalDatabase(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRelationalDatabaseResult, Unit]): Request[DeleteRelationalDatabaseResult, AWSError] = js.native
  /**
    * Deletes a database in Amazon Lightsail. The delete relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def deleteRelationalDatabase(params: DeleteRelationalDatabaseRequest): Request[DeleteRelationalDatabaseResult, AWSError] = js.native
  def deleteRelationalDatabase(
    params: DeleteRelationalDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRelationalDatabaseResult, Unit]
  ): Request[DeleteRelationalDatabaseResult, AWSError] = js.native
  /**
    * Deletes a database snapshot in Amazon Lightsail. The delete relational database snapshot operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def deleteRelationalDatabaseSnapshot(): Request[DeleteRelationalDatabaseSnapshotResult, AWSError] = js.native
  def deleteRelationalDatabaseSnapshot(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRelationalDatabaseSnapshotResult, Unit]
  ): Request[DeleteRelationalDatabaseSnapshotResult, AWSError] = js.native
  /**
    * Deletes a database snapshot in Amazon Lightsail. The delete relational database snapshot operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def deleteRelationalDatabaseSnapshot(params: DeleteRelationalDatabaseSnapshotRequest): Request[DeleteRelationalDatabaseSnapshotResult, AWSError] = js.native
  def deleteRelationalDatabaseSnapshot(
    params: DeleteRelationalDatabaseSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRelationalDatabaseSnapshotResult, Unit]
  ): Request[DeleteRelationalDatabaseSnapshotResult, AWSError] = js.native
  /**
    * Detaches a stopped block storage disk from a Lightsail instance. Make sure to unmount any file systems on the device within your operating system before stopping the instance and detaching the disk. The detach disk operation supports tag-based access control via resource tags applied to the resource identified by disk name. For more information, see the Lightsail Dev Guide.
    */
  def detachDisk(): Request[DetachDiskResult, AWSError] = js.native
  def detachDisk(callback: js.Function2[/* err */ AWSError, /* data */ DetachDiskResult, Unit]): Request[DetachDiskResult, AWSError] = js.native
  /**
    * Detaches a stopped block storage disk from a Lightsail instance. Make sure to unmount any file systems on the device within your operating system before stopping the instance and detaching the disk. The detach disk operation supports tag-based access control via resource tags applied to the resource identified by disk name. For more information, see the Lightsail Dev Guide.
    */
  def detachDisk(params: DetachDiskRequest): Request[DetachDiskResult, AWSError] = js.native
  def detachDisk(
    params: DetachDiskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetachDiskResult, Unit]
  ): Request[DetachDiskResult, AWSError] = js.native
  /**
    * Detaches the specified instances from a Lightsail load balancer. This operation waits until the instances are no longer needed before they are detached from the load balancer. The detach instances from load balancer operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Lightsail Dev Guide.
    */
  def detachInstancesFromLoadBalancer(): Request[DetachInstancesFromLoadBalancerResult, AWSError] = js.native
  def detachInstancesFromLoadBalancer(callback: js.Function2[/* err */ AWSError, /* data */ DetachInstancesFromLoadBalancerResult, Unit]): Request[DetachInstancesFromLoadBalancerResult, AWSError] = js.native
  /**
    * Detaches the specified instances from a Lightsail load balancer. This operation waits until the instances are no longer needed before they are detached from the load balancer. The detach instances from load balancer operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Lightsail Dev Guide.
    */
  def detachInstancesFromLoadBalancer(params: DetachInstancesFromLoadBalancerRequest): Request[DetachInstancesFromLoadBalancerResult, AWSError] = js.native
  def detachInstancesFromLoadBalancer(
    params: DetachInstancesFromLoadBalancerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetachInstancesFromLoadBalancerResult, Unit]
  ): Request[DetachInstancesFromLoadBalancerResult, AWSError] = js.native
  /**
    * Detaches a static IP from the Amazon Lightsail instance to which it is attached.
    */
  def detachStaticIp(): Request[DetachStaticIpResult, AWSError] = js.native
  def detachStaticIp(callback: js.Function2[/* err */ AWSError, /* data */ DetachStaticIpResult, Unit]): Request[DetachStaticIpResult, AWSError] = js.native
  /**
    * Detaches a static IP from the Amazon Lightsail instance to which it is attached.
    */
  def detachStaticIp(params: DetachStaticIpRequest): Request[DetachStaticIpResult, AWSError] = js.native
  def detachStaticIp(
    params: DetachStaticIpRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetachStaticIpResult, Unit]
  ): Request[DetachStaticIpResult, AWSError] = js.native
  /**
    * Disables an add-on for an Amazon Lightsail resource. For more information, see the Lightsail Dev Guide.
    */
  def disableAddOn(): Request[DisableAddOnResult, AWSError] = js.native
  def disableAddOn(callback: js.Function2[/* err */ AWSError, /* data */ DisableAddOnResult, Unit]): Request[DisableAddOnResult, AWSError] = js.native
  /**
    * Disables an add-on for an Amazon Lightsail resource. For more information, see the Lightsail Dev Guide.
    */
  def disableAddOn(params: DisableAddOnRequest): Request[DisableAddOnResult, AWSError] = js.native
  def disableAddOn(
    params: DisableAddOnRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableAddOnResult, Unit]
  ): Request[DisableAddOnResult, AWSError] = js.native
  /**
    * Downloads the default SSH key pair from the user's account.
    */
  def downloadDefaultKeyPair(): Request[DownloadDefaultKeyPairResult, AWSError] = js.native
  def downloadDefaultKeyPair(callback: js.Function2[/* err */ AWSError, /* data */ DownloadDefaultKeyPairResult, Unit]): Request[DownloadDefaultKeyPairResult, AWSError] = js.native
  /**
    * Downloads the default SSH key pair from the user's account.
    */
  def downloadDefaultKeyPair(params: DownloadDefaultKeyPairRequest): Request[DownloadDefaultKeyPairResult, AWSError] = js.native
  def downloadDefaultKeyPair(
    params: DownloadDefaultKeyPairRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DownloadDefaultKeyPairResult, Unit]
  ): Request[DownloadDefaultKeyPairResult, AWSError] = js.native
  /**
    * Enables or modifies an add-on for an Amazon Lightsail resource. For more information, see the Lightsail Dev Guide.
    */
  def enableAddOn(): Request[EnableAddOnResult, AWSError] = js.native
  def enableAddOn(callback: js.Function2[/* err */ AWSError, /* data */ EnableAddOnResult, Unit]): Request[EnableAddOnResult, AWSError] = js.native
  /**
    * Enables or modifies an add-on for an Amazon Lightsail resource. For more information, see the Lightsail Dev Guide.
    */
  def enableAddOn(params: EnableAddOnRequest): Request[EnableAddOnResult, AWSError] = js.native
  def enableAddOn(
    params: EnableAddOnRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableAddOnResult, Unit]
  ): Request[EnableAddOnResult, AWSError] = js.native
  /**
    * Exports an Amazon Lightsail instance or block storage disk snapshot to Amazon Elastic Compute Cloud (Amazon EC2). This operation results in an export snapshot record that can be used with the create cloud formation stack operation to create new Amazon EC2 instances. Exported instance snapshots appear in Amazon EC2 as Amazon Machine Images (AMIs), and the instance system disk appears as an Amazon Elastic Block Store (Amazon EBS) volume. Exported disk snapshots appear in Amazon EC2 as Amazon EBS volumes. Snapshots are exported to the same Amazon Web Services Region in Amazon EC2 as the source Lightsail snapshot.  The export snapshot operation supports tag-based access control via resource tags applied to the resource identified by source snapshot name. For more information, see the Lightsail Dev Guide.  Use the get instance snapshots or get disk snapshots operations to get a list of snapshots that you can export to Amazon EC2. 
    */
  def exportSnapshot(): Request[ExportSnapshotResult, AWSError] = js.native
  def exportSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ ExportSnapshotResult, Unit]): Request[ExportSnapshotResult, AWSError] = js.native
  /**
    * Exports an Amazon Lightsail instance or block storage disk snapshot to Amazon Elastic Compute Cloud (Amazon EC2). This operation results in an export snapshot record that can be used with the create cloud formation stack operation to create new Amazon EC2 instances. Exported instance snapshots appear in Amazon EC2 as Amazon Machine Images (AMIs), and the instance system disk appears as an Amazon Elastic Block Store (Amazon EBS) volume. Exported disk snapshots appear in Amazon EC2 as Amazon EBS volumes. Snapshots are exported to the same Amazon Web Services Region in Amazon EC2 as the source Lightsail snapshot.  The export snapshot operation supports tag-based access control via resource tags applied to the resource identified by source snapshot name. For more information, see the Lightsail Dev Guide.  Use the get instance snapshots or get disk snapshots operations to get a list of snapshots that you can export to Amazon EC2. 
    */
  def exportSnapshot(params: ExportSnapshotRequest): Request[ExportSnapshotResult, AWSError] = js.native
  def exportSnapshot(
    params: ExportSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportSnapshotResult, Unit]
  ): Request[ExportSnapshotResult, AWSError] = js.native
  /**
    * Returns the names of all active (not deleted) resources.
    */
  def getActiveNames(): Request[GetActiveNamesResult, AWSError] = js.native
  def getActiveNames(callback: js.Function2[/* err */ AWSError, /* data */ GetActiveNamesResult, Unit]): Request[GetActiveNamesResult, AWSError] = js.native
  /**
    * Returns the names of all active (not deleted) resources.
    */
  def getActiveNames(params: GetActiveNamesRequest): Request[GetActiveNamesResult, AWSError] = js.native
  def getActiveNames(
    params: GetActiveNamesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetActiveNamesResult, Unit]
  ): Request[GetActiveNamesResult, AWSError] = js.native
  /**
    * Returns the available automatic snapshots for an instance or disk. For more information, see the Lightsail Dev Guide.
    */
  def getAutoSnapshots(): Request[GetAutoSnapshotsResult, AWSError] = js.native
  def getAutoSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ GetAutoSnapshotsResult, Unit]): Request[GetAutoSnapshotsResult, AWSError] = js.native
  /**
    * Returns the available automatic snapshots for an instance or disk. For more information, see the Lightsail Dev Guide.
    */
  def getAutoSnapshots(params: GetAutoSnapshotsRequest): Request[GetAutoSnapshotsResult, AWSError] = js.native
  def getAutoSnapshots(
    params: GetAutoSnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAutoSnapshotsResult, Unit]
  ): Request[GetAutoSnapshotsResult, AWSError] = js.native
  /**
    * Returns the list of available instance images, or blueprints. You can use a blueprint to create a new instance already running a specific operating system, as well as a preinstalled app or development stack. The software each instance is running depends on the blueprint image you choose.  Use active blueprints when creating new instances. Inactive blueprints are listed to support customers with existing instances and are not necessarily available to create new instances. Blueprints are marked inactive when they become outdated due to operating system updates or new application releases. 
    */
  def getBlueprints(): Request[GetBlueprintsResult, AWSError] = js.native
  def getBlueprints(callback: js.Function2[/* err */ AWSError, /* data */ GetBlueprintsResult, Unit]): Request[GetBlueprintsResult, AWSError] = js.native
  /**
    * Returns the list of available instance images, or blueprints. You can use a blueprint to create a new instance already running a specific operating system, as well as a preinstalled app or development stack. The software each instance is running depends on the blueprint image you choose.  Use active blueprints when creating new instances. Inactive blueprints are listed to support customers with existing instances and are not necessarily available to create new instances. Blueprints are marked inactive when they become outdated due to operating system updates or new application releases. 
    */
  def getBlueprints(params: GetBlueprintsRequest): Request[GetBlueprintsResult, AWSError] = js.native
  def getBlueprints(
    params: GetBlueprintsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBlueprintsResult, Unit]
  ): Request[GetBlueprintsResult, AWSError] = js.native
  /**
    * Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual private server (or instance).
    */
  def getBundles(): Request[GetBundlesResult, AWSError] = js.native
  def getBundles(callback: js.Function2[/* err */ AWSError, /* data */ GetBundlesResult, Unit]): Request[GetBundlesResult, AWSError] = js.native
  /**
    * Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual private server (or instance).
    */
  def getBundles(params: GetBundlesRequest): Request[GetBundlesResult, AWSError] = js.native
  def getBundles(
    params: GetBundlesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBundlesResult, Unit]
  ): Request[GetBundlesResult, AWSError] = js.native
  /**
    * Returns the CloudFormation stack record created as a result of the create cloud formation stack operation. An AWS CloudFormation stack is used to create a new Amazon EC2 instance from an exported Lightsail snapshot.
    */
  def getCloudFormationStackRecords(): Request[GetCloudFormationStackRecordsResult, AWSError] = js.native
  def getCloudFormationStackRecords(callback: js.Function2[/* err */ AWSError, /* data */ GetCloudFormationStackRecordsResult, Unit]): Request[GetCloudFormationStackRecordsResult, AWSError] = js.native
  /**
    * Returns the CloudFormation stack record created as a result of the create cloud formation stack operation. An AWS CloudFormation stack is used to create a new Amazon EC2 instance from an exported Lightsail snapshot.
    */
  def getCloudFormationStackRecords(params: GetCloudFormationStackRecordsRequest): Request[GetCloudFormationStackRecordsResult, AWSError] = js.native
  def getCloudFormationStackRecords(
    params: GetCloudFormationStackRecordsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCloudFormationStackRecordsResult, Unit]
  ): Request[GetCloudFormationStackRecordsResult, AWSError] = js.native
  /**
    * Returns information about a specific block storage disk.
    */
  def getDisk(): Request[GetDiskResult, AWSError] = js.native
  def getDisk(callback: js.Function2[/* err */ AWSError, /* data */ GetDiskResult, Unit]): Request[GetDiskResult, AWSError] = js.native
  /**
    * Returns information about a specific block storage disk.
    */
  def getDisk(params: GetDiskRequest): Request[GetDiskResult, AWSError] = js.native
  def getDisk(params: GetDiskRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetDiskResult, Unit]): Request[GetDiskResult, AWSError] = js.native
  /**
    * Returns information about a specific block storage disk snapshot.
    */
  def getDiskSnapshot(): Request[GetDiskSnapshotResult, AWSError] = js.native
  def getDiskSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ GetDiskSnapshotResult, Unit]): Request[GetDiskSnapshotResult, AWSError] = js.native
  /**
    * Returns information about a specific block storage disk snapshot.
    */
  def getDiskSnapshot(params: GetDiskSnapshotRequest): Request[GetDiskSnapshotResult, AWSError] = js.native
  def getDiskSnapshot(
    params: GetDiskSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDiskSnapshotResult, Unit]
  ): Request[GetDiskSnapshotResult, AWSError] = js.native
  /**
    * Returns information about all block storage disk snapshots in your AWS account and region. If you are describing a long list of disk snapshots, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getDiskSnapshots(): Request[GetDiskSnapshotsResult, AWSError] = js.native
  def getDiskSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ GetDiskSnapshotsResult, Unit]): Request[GetDiskSnapshotsResult, AWSError] = js.native
  /**
    * Returns information about all block storage disk snapshots in your AWS account and region. If you are describing a long list of disk snapshots, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getDiskSnapshots(params: GetDiskSnapshotsRequest): Request[GetDiskSnapshotsResult, AWSError] = js.native
  def getDiskSnapshots(
    params: GetDiskSnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDiskSnapshotsResult, Unit]
  ): Request[GetDiskSnapshotsResult, AWSError] = js.native
  /**
    * Returns information about all block storage disks in your AWS account and region. If you are describing a long list of disks, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getDisks(): Request[GetDisksResult, AWSError] = js.native
  def getDisks(callback: js.Function2[/* err */ AWSError, /* data */ GetDisksResult, Unit]): Request[GetDisksResult, AWSError] = js.native
  /**
    * Returns information about all block storage disks in your AWS account and region. If you are describing a long list of disks, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getDisks(params: GetDisksRequest): Request[GetDisksResult, AWSError] = js.native
  def getDisks(
    params: GetDisksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDisksResult, Unit]
  ): Request[GetDisksResult, AWSError] = js.native
  /**
    * Returns information about a specific domain recordset.
    */
  def getDomain(): Request[GetDomainResult, AWSError] = js.native
  def getDomain(callback: js.Function2[/* err */ AWSError, /* data */ GetDomainResult, Unit]): Request[GetDomainResult, AWSError] = js.native
  /**
    * Returns information about a specific domain recordset.
    */
  def getDomain(params: GetDomainRequest): Request[GetDomainResult, AWSError] = js.native
  def getDomain(
    params: GetDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDomainResult, Unit]
  ): Request[GetDomainResult, AWSError] = js.native
  /**
    * Returns a list of all domains in the user's account.
    */
  def getDomains(): Request[GetDomainsResult, AWSError] = js.native
  def getDomains(callback: js.Function2[/* err */ AWSError, /* data */ GetDomainsResult, Unit]): Request[GetDomainsResult, AWSError] = js.native
  /**
    * Returns a list of all domains in the user's account.
    */
  def getDomains(params: GetDomainsRequest): Request[GetDomainsResult, AWSError] = js.native
  def getDomains(
    params: GetDomainsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDomainsResult, Unit]
  ): Request[GetDomainsResult, AWSError] = js.native
  /**
    * Returns the export snapshot record created as a result of the export snapshot operation. An export snapshot record can be used to create a new Amazon EC2 instance and its related resources with the create cloud formation stack operation.
    */
  def getExportSnapshotRecords(): Request[GetExportSnapshotRecordsResult, AWSError] = js.native
  def getExportSnapshotRecords(callback: js.Function2[/* err */ AWSError, /* data */ GetExportSnapshotRecordsResult, Unit]): Request[GetExportSnapshotRecordsResult, AWSError] = js.native
  /**
    * Returns the export snapshot record created as a result of the export snapshot operation. An export snapshot record can be used to create a new Amazon EC2 instance and its related resources with the create cloud formation stack operation.
    */
  def getExportSnapshotRecords(params: GetExportSnapshotRecordsRequest): Request[GetExportSnapshotRecordsResult, AWSError] = js.native
  def getExportSnapshotRecords(
    params: GetExportSnapshotRecordsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetExportSnapshotRecordsResult, Unit]
  ): Request[GetExportSnapshotRecordsResult, AWSError] = js.native
  /**
    * Returns information about a specific Amazon Lightsail instance, which is a virtual private server.
    */
  def getInstance(): Request[GetInstanceResult, AWSError] = js.native
  def getInstance(callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceResult, Unit]): Request[GetInstanceResult, AWSError] = js.native
  /**
    * Returns information about a specific Amazon Lightsail instance, which is a virtual private server.
    */
  def getInstance(params: GetInstanceRequest): Request[GetInstanceResult, AWSError] = js.native
  def getInstance(
    params: GetInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceResult, Unit]
  ): Request[GetInstanceResult, AWSError] = js.native
  /**
    * Returns temporary SSH keys you can use to connect to a specific virtual private server, or instance. The get instance access details operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Lightsail Dev Guide.
    */
  def getInstanceAccessDetails(): Request[GetInstanceAccessDetailsResult, AWSError] = js.native
  def getInstanceAccessDetails(callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceAccessDetailsResult, Unit]): Request[GetInstanceAccessDetailsResult, AWSError] = js.native
  /**
    * Returns temporary SSH keys you can use to connect to a specific virtual private server, or instance. The get instance access details operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Lightsail Dev Guide.
    */
  def getInstanceAccessDetails(params: GetInstanceAccessDetailsRequest): Request[GetInstanceAccessDetailsResult, AWSError] = js.native
  def getInstanceAccessDetails(
    params: GetInstanceAccessDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceAccessDetailsResult, Unit]
  ): Request[GetInstanceAccessDetailsResult, AWSError] = js.native
  /**
    * Returns the data points for the specified Amazon Lightsail instance metric, given an instance name.
    */
  def getInstanceMetricData(): Request[GetInstanceMetricDataResult, AWSError] = js.native
  def getInstanceMetricData(callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceMetricDataResult, Unit]): Request[GetInstanceMetricDataResult, AWSError] = js.native
  /**
    * Returns the data points for the specified Amazon Lightsail instance metric, given an instance name.
    */
  def getInstanceMetricData(params: GetInstanceMetricDataRequest): Request[GetInstanceMetricDataResult, AWSError] = js.native
  def getInstanceMetricData(
    params: GetInstanceMetricDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceMetricDataResult, Unit]
  ): Request[GetInstanceMetricDataResult, AWSError] = js.native
  /**
    * Returns the port states for a specific virtual private server, or instance.
    */
  def getInstancePortStates(): Request[GetInstancePortStatesResult, AWSError] = js.native
  def getInstancePortStates(callback: js.Function2[/* err */ AWSError, /* data */ GetInstancePortStatesResult, Unit]): Request[GetInstancePortStatesResult, AWSError] = js.native
  /**
    * Returns the port states for a specific virtual private server, or instance.
    */
  def getInstancePortStates(params: GetInstancePortStatesRequest): Request[GetInstancePortStatesResult, AWSError] = js.native
  def getInstancePortStates(
    params: GetInstancePortStatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstancePortStatesResult, Unit]
  ): Request[GetInstancePortStatesResult, AWSError] = js.native
  /**
    * Returns information about a specific instance snapshot.
    */
  def getInstanceSnapshot(): Request[GetInstanceSnapshotResult, AWSError] = js.native
  def getInstanceSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceSnapshotResult, Unit]): Request[GetInstanceSnapshotResult, AWSError] = js.native
  /**
    * Returns information about a specific instance snapshot.
    */
  def getInstanceSnapshot(params: GetInstanceSnapshotRequest): Request[GetInstanceSnapshotResult, AWSError] = js.native
  def getInstanceSnapshot(
    params: GetInstanceSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceSnapshotResult, Unit]
  ): Request[GetInstanceSnapshotResult, AWSError] = js.native
  /**
    * Returns all instance snapshots for the user's account.
    */
  def getInstanceSnapshots(): Request[GetInstanceSnapshotsResult, AWSError] = js.native
  def getInstanceSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceSnapshotsResult, Unit]): Request[GetInstanceSnapshotsResult, AWSError] = js.native
  /**
    * Returns all instance snapshots for the user's account.
    */
  def getInstanceSnapshots(params: GetInstanceSnapshotsRequest): Request[GetInstanceSnapshotsResult, AWSError] = js.native
  def getInstanceSnapshots(
    params: GetInstanceSnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceSnapshotsResult, Unit]
  ): Request[GetInstanceSnapshotsResult, AWSError] = js.native
  /**
    * Returns the state of a specific instance. Works on one instance at a time.
    */
  def getInstanceState(): Request[GetInstanceStateResult, AWSError] = js.native
  def getInstanceState(callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceStateResult, Unit]): Request[GetInstanceStateResult, AWSError] = js.native
  /**
    * Returns the state of a specific instance. Works on one instance at a time.
    */
  def getInstanceState(params: GetInstanceStateRequest): Request[GetInstanceStateResult, AWSError] = js.native
  def getInstanceState(
    params: GetInstanceStateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceStateResult, Unit]
  ): Request[GetInstanceStateResult, AWSError] = js.native
  /**
    * Returns information about all Amazon Lightsail virtual private servers, or instances.
    */
  def getInstances(): Request[GetInstancesResult, AWSError] = js.native
  def getInstances(callback: js.Function2[/* err */ AWSError, /* data */ GetInstancesResult, Unit]): Request[GetInstancesResult, AWSError] = js.native
  /**
    * Returns information about all Amazon Lightsail virtual private servers, or instances.
    */
  def getInstances(params: GetInstancesRequest): Request[GetInstancesResult, AWSError] = js.native
  def getInstances(
    params: GetInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstancesResult, Unit]
  ): Request[GetInstancesResult, AWSError] = js.native
  /**
    * Returns information about a specific key pair.
    */
  def getKeyPair(): Request[GetKeyPairResult, AWSError] = js.native
  def getKeyPair(callback: js.Function2[/* err */ AWSError, /* data */ GetKeyPairResult, Unit]): Request[GetKeyPairResult, AWSError] = js.native
  /**
    * Returns information about a specific key pair.
    */
  def getKeyPair(params: GetKeyPairRequest): Request[GetKeyPairResult, AWSError] = js.native
  def getKeyPair(
    params: GetKeyPairRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetKeyPairResult, Unit]
  ): Request[GetKeyPairResult, AWSError] = js.native
  /**
    * Returns information about all key pairs in the user's account.
    */
  def getKeyPairs(): Request[GetKeyPairsResult, AWSError] = js.native
  def getKeyPairs(callback: js.Function2[/* err */ AWSError, /* data */ GetKeyPairsResult, Unit]): Request[GetKeyPairsResult, AWSError] = js.native
  /**
    * Returns information about all key pairs in the user's account.
    */
  def getKeyPairs(params: GetKeyPairsRequest): Request[GetKeyPairsResult, AWSError] = js.native
  def getKeyPairs(
    params: GetKeyPairsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetKeyPairsResult, Unit]
  ): Request[GetKeyPairsResult, AWSError] = js.native
  /**
    * Returns information about the specified Lightsail load balancer.
    */
  def getLoadBalancer(): Request[GetLoadBalancerResult, AWSError] = js.native
  def getLoadBalancer(callback: js.Function2[/* err */ AWSError, /* data */ GetLoadBalancerResult, Unit]): Request[GetLoadBalancerResult, AWSError] = js.native
  /**
    * Returns information about the specified Lightsail load balancer.
    */
  def getLoadBalancer(params: GetLoadBalancerRequest): Request[GetLoadBalancerResult, AWSError] = js.native
  def getLoadBalancer(
    params: GetLoadBalancerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLoadBalancerResult, Unit]
  ): Request[GetLoadBalancerResult, AWSError] = js.native
  /**
    * Returns information about health metrics for your Lightsail load balancer.
    */
  def getLoadBalancerMetricData(): Request[GetLoadBalancerMetricDataResult, AWSError] = js.native
  def getLoadBalancerMetricData(callback: js.Function2[/* err */ AWSError, /* data */ GetLoadBalancerMetricDataResult, Unit]): Request[GetLoadBalancerMetricDataResult, AWSError] = js.native
  /**
    * Returns information about health metrics for your Lightsail load balancer.
    */
  def getLoadBalancerMetricData(params: GetLoadBalancerMetricDataRequest): Request[GetLoadBalancerMetricDataResult, AWSError] = js.native
  def getLoadBalancerMetricData(
    params: GetLoadBalancerMetricDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLoadBalancerMetricDataResult, Unit]
  ): Request[GetLoadBalancerMetricDataResult, AWSError] = js.native
  /**
    * Returns information about the TLS certificates that are associated with the specified Lightsail load balancer. TLS is just an updated, more secure version of Secure Socket Layer (SSL). You can have a maximum of 2 certificates associated with a Lightsail load balancer. One is active and the other is inactive.
    */
  def getLoadBalancerTlsCertificates(): Request[GetLoadBalancerTlsCertificatesResult, AWSError] = js.native
  def getLoadBalancerTlsCertificates(callback: js.Function2[/* err */ AWSError, /* data */ GetLoadBalancerTlsCertificatesResult, Unit]): Request[GetLoadBalancerTlsCertificatesResult, AWSError] = js.native
  /**
    * Returns information about the TLS certificates that are associated with the specified Lightsail load balancer. TLS is just an updated, more secure version of Secure Socket Layer (SSL). You can have a maximum of 2 certificates associated with a Lightsail load balancer. One is active and the other is inactive.
    */
  def getLoadBalancerTlsCertificates(params: GetLoadBalancerTlsCertificatesRequest): Request[GetLoadBalancerTlsCertificatesResult, AWSError] = js.native
  def getLoadBalancerTlsCertificates(
    params: GetLoadBalancerTlsCertificatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLoadBalancerTlsCertificatesResult, Unit]
  ): Request[GetLoadBalancerTlsCertificatesResult, AWSError] = js.native
  /**
    * Returns information about all load balancers in an account. If you are describing a long list of load balancers, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getLoadBalancers(): Request[GetLoadBalancersResult, AWSError] = js.native
  def getLoadBalancers(callback: js.Function2[/* err */ AWSError, /* data */ GetLoadBalancersResult, Unit]): Request[GetLoadBalancersResult, AWSError] = js.native
  /**
    * Returns information about all load balancers in an account. If you are describing a long list of load balancers, you can paginate the output to make the list more manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.
    */
  def getLoadBalancers(params: GetLoadBalancersRequest): Request[GetLoadBalancersResult, AWSError] = js.native
  def getLoadBalancers(
    params: GetLoadBalancersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLoadBalancersResult, Unit]
  ): Request[GetLoadBalancersResult, AWSError] = js.native
  /**
    * Returns information about a specific operation. Operations include events such as when you create an instance, allocate a static IP, attach a static IP, and so on.
    */
  def getOperation(): Request[GetOperationResult, AWSError] = js.native
  def getOperation(callback: js.Function2[/* err */ AWSError, /* data */ GetOperationResult, Unit]): Request[GetOperationResult, AWSError] = js.native
  /**
    * Returns information about a specific operation. Operations include events such as when you create an instance, allocate a static IP, attach a static IP, and so on.
    */
  def getOperation(params: GetOperationRequest): Request[GetOperationResult, AWSError] = js.native
  def getOperation(
    params: GetOperationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOperationResult, Unit]
  ): Request[GetOperationResult, AWSError] = js.native
  /**
    * Returns information about all operations. Results are returned from oldest to newest, up to a maximum of 200. Results can be paged by making each subsequent call to GetOperations use the maximum (last) statusChangedAt value from the previous request.
    */
  def getOperations(): Request[GetOperationsResult, AWSError] = js.native
  def getOperations(callback: js.Function2[/* err */ AWSError, /* data */ GetOperationsResult, Unit]): Request[GetOperationsResult, AWSError] = js.native
  /**
    * Returns information about all operations. Results are returned from oldest to newest, up to a maximum of 200. Results can be paged by making each subsequent call to GetOperations use the maximum (last) statusChangedAt value from the previous request.
    */
  def getOperations(params: GetOperationsRequest): Request[GetOperationsResult, AWSError] = js.native
  def getOperations(
    params: GetOperationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOperationsResult, Unit]
  ): Request[GetOperationsResult, AWSError] = js.native
  /**
    * Gets operations for a specific resource (e.g., an instance or a static IP).
    */
  def getOperationsForResource(): Request[GetOperationsForResourceResult, AWSError] = js.native
  def getOperationsForResource(callback: js.Function2[/* err */ AWSError, /* data */ GetOperationsForResourceResult, Unit]): Request[GetOperationsForResourceResult, AWSError] = js.native
  /**
    * Gets operations for a specific resource (e.g., an instance or a static IP).
    */
  def getOperationsForResource(params: GetOperationsForResourceRequest): Request[GetOperationsForResourceResult, AWSError] = js.native
  def getOperationsForResource(
    params: GetOperationsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOperationsForResourceResult, Unit]
  ): Request[GetOperationsForResourceResult, AWSError] = js.native
  /**
    * Returns a list of all valid regions for Amazon Lightsail. Use the include availability zones parameter to also return the Availability Zones in a region.
    */
  def getRegions(): Request[GetRegionsResult, AWSError] = js.native
  def getRegions(callback: js.Function2[/* err */ AWSError, /* data */ GetRegionsResult, Unit]): Request[GetRegionsResult, AWSError] = js.native
  /**
    * Returns a list of all valid regions for Amazon Lightsail. Use the include availability zones parameter to also return the Availability Zones in a region.
    */
  def getRegions(params: GetRegionsRequest): Request[GetRegionsResult, AWSError] = js.native
  def getRegions(
    params: GetRegionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRegionsResult, Unit]
  ): Request[GetRegionsResult, AWSError] = js.native
  /**
    * Returns information about a specific database in Amazon Lightsail.
    */
  def getRelationalDatabase(): Request[GetRelationalDatabaseResult, AWSError] = js.native
  def getRelationalDatabase(callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseResult, Unit]): Request[GetRelationalDatabaseResult, AWSError] = js.native
  /**
    * Returns information about a specific database in Amazon Lightsail.
    */
  def getRelationalDatabase(params: GetRelationalDatabaseRequest): Request[GetRelationalDatabaseResult, AWSError] = js.native
  def getRelationalDatabase(
    params: GetRelationalDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseResult, Unit]
  ): Request[GetRelationalDatabaseResult, AWSError] = js.native
  /**
    * Returns a list of available database blueprints in Amazon Lightsail. A blueprint describes the major engine version of a database. You can use a blueprint ID to create a new database that runs a specific database engine.
    */
  def getRelationalDatabaseBlueprints(): Request[GetRelationalDatabaseBlueprintsResult, AWSError] = js.native
  def getRelationalDatabaseBlueprints(callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseBlueprintsResult, Unit]): Request[GetRelationalDatabaseBlueprintsResult, AWSError] = js.native
  /**
    * Returns a list of available database blueprints in Amazon Lightsail. A blueprint describes the major engine version of a database. You can use a blueprint ID to create a new database that runs a specific database engine.
    */
  def getRelationalDatabaseBlueprints(params: GetRelationalDatabaseBlueprintsRequest): Request[GetRelationalDatabaseBlueprintsResult, AWSError] = js.native
  def getRelationalDatabaseBlueprints(
    params: GetRelationalDatabaseBlueprintsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseBlueprintsResult, Unit]
  ): Request[GetRelationalDatabaseBlueprintsResult, AWSError] = js.native
  /**
    * Returns the list of bundles that are available in Amazon Lightsail. A bundle describes the performance specifications for a database. You can use a bundle ID to create a new database with explicit performance specifications.
    */
  def getRelationalDatabaseBundles(): Request[GetRelationalDatabaseBundlesResult, AWSError] = js.native
  def getRelationalDatabaseBundles(callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseBundlesResult, Unit]): Request[GetRelationalDatabaseBundlesResult, AWSError] = js.native
  /**
    * Returns the list of bundles that are available in Amazon Lightsail. A bundle describes the performance specifications for a database. You can use a bundle ID to create a new database with explicit performance specifications.
    */
  def getRelationalDatabaseBundles(params: GetRelationalDatabaseBundlesRequest): Request[GetRelationalDatabaseBundlesResult, AWSError] = js.native
  def getRelationalDatabaseBundles(
    params: GetRelationalDatabaseBundlesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseBundlesResult, Unit]
  ): Request[GetRelationalDatabaseBundlesResult, AWSError] = js.native
  /**
    * Returns a list of events for a specific database in Amazon Lightsail.
    */
  def getRelationalDatabaseEvents(): Request[GetRelationalDatabaseEventsResult, AWSError] = js.native
  def getRelationalDatabaseEvents(callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseEventsResult, Unit]): Request[GetRelationalDatabaseEventsResult, AWSError] = js.native
  /**
    * Returns a list of events for a specific database in Amazon Lightsail.
    */
  def getRelationalDatabaseEvents(params: GetRelationalDatabaseEventsRequest): Request[GetRelationalDatabaseEventsResult, AWSError] = js.native
  def getRelationalDatabaseEvents(
    params: GetRelationalDatabaseEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseEventsResult, Unit]
  ): Request[GetRelationalDatabaseEventsResult, AWSError] = js.native
  /**
    * Returns a list of log events for a database in Amazon Lightsail.
    */
  def getRelationalDatabaseLogEvents(): Request[GetRelationalDatabaseLogEventsResult, AWSError] = js.native
  def getRelationalDatabaseLogEvents(callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseLogEventsResult, Unit]): Request[GetRelationalDatabaseLogEventsResult, AWSError] = js.native
  /**
    * Returns a list of log events for a database in Amazon Lightsail.
    */
  def getRelationalDatabaseLogEvents(params: GetRelationalDatabaseLogEventsRequest): Request[GetRelationalDatabaseLogEventsResult, AWSError] = js.native
  def getRelationalDatabaseLogEvents(
    params: GetRelationalDatabaseLogEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseLogEventsResult, Unit]
  ): Request[GetRelationalDatabaseLogEventsResult, AWSError] = js.native
  /**
    * Returns a list of available log streams for a specific database in Amazon Lightsail.
    */
  def getRelationalDatabaseLogStreams(): Request[GetRelationalDatabaseLogStreamsResult, AWSError] = js.native
  def getRelationalDatabaseLogStreams(callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseLogStreamsResult, Unit]): Request[GetRelationalDatabaseLogStreamsResult, AWSError] = js.native
  /**
    * Returns a list of available log streams for a specific database in Amazon Lightsail.
    */
  def getRelationalDatabaseLogStreams(params: GetRelationalDatabaseLogStreamsRequest): Request[GetRelationalDatabaseLogStreamsResult, AWSError] = js.native
  def getRelationalDatabaseLogStreams(
    params: GetRelationalDatabaseLogStreamsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseLogStreamsResult, Unit]
  ): Request[GetRelationalDatabaseLogStreamsResult, AWSError] = js.native
  /**
    * Returns the current, previous, or pending versions of the master user password for a Lightsail database. The GetRelationalDatabaseMasterUserPassword operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName.
    */
  def getRelationalDatabaseMasterUserPassword(): Request[GetRelationalDatabaseMasterUserPasswordResult, AWSError] = js.native
  def getRelationalDatabaseMasterUserPassword(
    callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseMasterUserPasswordResult, Unit]
  ): Request[GetRelationalDatabaseMasterUserPasswordResult, AWSError] = js.native
  /**
    * Returns the current, previous, or pending versions of the master user password for a Lightsail database. The GetRelationalDatabaseMasterUserPassword operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName.
    */
  def getRelationalDatabaseMasterUserPassword(params: GetRelationalDatabaseMasterUserPasswordRequest): Request[GetRelationalDatabaseMasterUserPasswordResult, AWSError] = js.native
  def getRelationalDatabaseMasterUserPassword(
    params: GetRelationalDatabaseMasterUserPasswordRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseMasterUserPasswordResult, Unit]
  ): Request[GetRelationalDatabaseMasterUserPasswordResult, AWSError] = js.native
  /**
    * Returns the data points of the specified metric for a database in Amazon Lightsail.
    */
  def getRelationalDatabaseMetricData(): Request[GetRelationalDatabaseMetricDataResult, AWSError] = js.native
  def getRelationalDatabaseMetricData(callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseMetricDataResult, Unit]): Request[GetRelationalDatabaseMetricDataResult, AWSError] = js.native
  /**
    * Returns the data points of the specified metric for a database in Amazon Lightsail.
    */
  def getRelationalDatabaseMetricData(params: GetRelationalDatabaseMetricDataRequest): Request[GetRelationalDatabaseMetricDataResult, AWSError] = js.native
  def getRelationalDatabaseMetricData(
    params: GetRelationalDatabaseMetricDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseMetricDataResult, Unit]
  ): Request[GetRelationalDatabaseMetricDataResult, AWSError] = js.native
  /**
    * Returns all of the runtime parameters offered by the underlying database software, or engine, for a specific database in Amazon Lightsail. In addition to the parameter names and values, this operation returns other information about each parameter. This information includes whether changes require a reboot, whether the parameter is modifiable, the allowed values, and the data types.
    */
  def getRelationalDatabaseParameters(): Request[GetRelationalDatabaseParametersResult, AWSError] = js.native
  def getRelationalDatabaseParameters(callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseParametersResult, Unit]): Request[GetRelationalDatabaseParametersResult, AWSError] = js.native
  /**
    * Returns all of the runtime parameters offered by the underlying database software, or engine, for a specific database in Amazon Lightsail. In addition to the parameter names and values, this operation returns other information about each parameter. This information includes whether changes require a reboot, whether the parameter is modifiable, the allowed values, and the data types.
    */
  def getRelationalDatabaseParameters(params: GetRelationalDatabaseParametersRequest): Request[GetRelationalDatabaseParametersResult, AWSError] = js.native
  def getRelationalDatabaseParameters(
    params: GetRelationalDatabaseParametersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseParametersResult, Unit]
  ): Request[GetRelationalDatabaseParametersResult, AWSError] = js.native
  /**
    * Returns information about a specific database snapshot in Amazon Lightsail.
    */
  def getRelationalDatabaseSnapshot(): Request[GetRelationalDatabaseSnapshotResult, AWSError] = js.native
  def getRelationalDatabaseSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseSnapshotResult, Unit]): Request[GetRelationalDatabaseSnapshotResult, AWSError] = js.native
  /**
    * Returns information about a specific database snapshot in Amazon Lightsail.
    */
  def getRelationalDatabaseSnapshot(params: GetRelationalDatabaseSnapshotRequest): Request[GetRelationalDatabaseSnapshotResult, AWSError] = js.native
  def getRelationalDatabaseSnapshot(
    params: GetRelationalDatabaseSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseSnapshotResult, Unit]
  ): Request[GetRelationalDatabaseSnapshotResult, AWSError] = js.native
  /**
    * Returns information about all of your database snapshots in Amazon Lightsail.
    */
  def getRelationalDatabaseSnapshots(): Request[GetRelationalDatabaseSnapshotsResult, AWSError] = js.native
  def getRelationalDatabaseSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseSnapshotsResult, Unit]): Request[GetRelationalDatabaseSnapshotsResult, AWSError] = js.native
  /**
    * Returns information about all of your database snapshots in Amazon Lightsail.
    */
  def getRelationalDatabaseSnapshots(params: GetRelationalDatabaseSnapshotsRequest): Request[GetRelationalDatabaseSnapshotsResult, AWSError] = js.native
  def getRelationalDatabaseSnapshots(
    params: GetRelationalDatabaseSnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseSnapshotsResult, Unit]
  ): Request[GetRelationalDatabaseSnapshotsResult, AWSError] = js.native
  /**
    * Returns information about all of your databases in Amazon Lightsail.
    */
  def getRelationalDatabases(): Request[GetRelationalDatabasesResult, AWSError] = js.native
  def getRelationalDatabases(callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabasesResult, Unit]): Request[GetRelationalDatabasesResult, AWSError] = js.native
  /**
    * Returns information about all of your databases in Amazon Lightsail.
    */
  def getRelationalDatabases(params: GetRelationalDatabasesRequest): Request[GetRelationalDatabasesResult, AWSError] = js.native
  def getRelationalDatabases(
    params: GetRelationalDatabasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabasesResult, Unit]
  ): Request[GetRelationalDatabasesResult, AWSError] = js.native
  /**
    * Returns information about a specific static IP.
    */
  def getStaticIp(): Request[GetStaticIpResult, AWSError] = js.native
  def getStaticIp(callback: js.Function2[/* err */ AWSError, /* data */ GetStaticIpResult, Unit]): Request[GetStaticIpResult, AWSError] = js.native
  /**
    * Returns information about a specific static IP.
    */
  def getStaticIp(params: GetStaticIpRequest): Request[GetStaticIpResult, AWSError] = js.native
  def getStaticIp(
    params: GetStaticIpRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStaticIpResult, Unit]
  ): Request[GetStaticIpResult, AWSError] = js.native
  /**
    * Returns information about all static IPs in the user's account.
    */
  def getStaticIps(): Request[GetStaticIpsResult, AWSError] = js.native
  def getStaticIps(callback: js.Function2[/* err */ AWSError, /* data */ GetStaticIpsResult, Unit]): Request[GetStaticIpsResult, AWSError] = js.native
  /**
    * Returns information about all static IPs in the user's account.
    */
  def getStaticIps(params: GetStaticIpsRequest): Request[GetStaticIpsResult, AWSError] = js.native
  def getStaticIps(
    params: GetStaticIpsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStaticIpsResult, Unit]
  ): Request[GetStaticIpsResult, AWSError] = js.native
  /**
    * Imports a public SSH key from a specific key pair.
    */
  def importKeyPair(): Request[ImportKeyPairResult, AWSError] = js.native
  def importKeyPair(callback: js.Function2[/* err */ AWSError, /* data */ ImportKeyPairResult, Unit]): Request[ImportKeyPairResult, AWSError] = js.native
  /**
    * Imports a public SSH key from a specific key pair.
    */
  def importKeyPair(params: ImportKeyPairRequest): Request[ImportKeyPairResult, AWSError] = js.native
  def importKeyPair(
    params: ImportKeyPairRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportKeyPairResult, Unit]
  ): Request[ImportKeyPairResult, AWSError] = js.native
  /**
    * Returns a Boolean value indicating whether your Lightsail VPC is peered.
    */
  def isVpcPeered(): Request[IsVpcPeeredResult, AWSError] = js.native
  def isVpcPeered(callback: js.Function2[/* err */ AWSError, /* data */ IsVpcPeeredResult, Unit]): Request[IsVpcPeeredResult, AWSError] = js.native
  /**
    * Returns a Boolean value indicating whether your Lightsail VPC is peered.
    */
  def isVpcPeered(params: IsVpcPeeredRequest): Request[IsVpcPeeredResult, AWSError] = js.native
  def isVpcPeered(
    params: IsVpcPeeredRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ IsVpcPeeredResult, Unit]
  ): Request[IsVpcPeeredResult, AWSError] = js.native
  /**
    * Adds public ports to an Amazon Lightsail instance. The open instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Lightsail Dev Guide.
    */
  def openInstancePublicPorts(): Request[OpenInstancePublicPortsResult, AWSError] = js.native
  def openInstancePublicPorts(callback: js.Function2[/* err */ AWSError, /* data */ OpenInstancePublicPortsResult, Unit]): Request[OpenInstancePublicPortsResult, AWSError] = js.native
  /**
    * Adds public ports to an Amazon Lightsail instance. The open instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Lightsail Dev Guide.
    */
  def openInstancePublicPorts(params: OpenInstancePublicPortsRequest): Request[OpenInstancePublicPortsResult, AWSError] = js.native
  def openInstancePublicPorts(
    params: OpenInstancePublicPortsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ OpenInstancePublicPortsResult, Unit]
  ): Request[OpenInstancePublicPortsResult, AWSError] = js.native
  /**
    * Tries to peer the Lightsail VPC with the user's default VPC.
    */
  def peerVpc(): Request[PeerVpcResult, AWSError] = js.native
  def peerVpc(callback: js.Function2[/* err */ AWSError, /* data */ PeerVpcResult, Unit]): Request[PeerVpcResult, AWSError] = js.native
  /**
    * Tries to peer the Lightsail VPC with the user's default VPC.
    */
  def peerVpc(params: PeerVpcRequest): Request[PeerVpcResult, AWSError] = js.native
  def peerVpc(params: PeerVpcRequest, callback: js.Function2[/* err */ AWSError, /* data */ PeerVpcResult, Unit]): Request[PeerVpcResult, AWSError] = js.native
  /**
    * Sets the specified open ports for an Amazon Lightsail instance, and closes all ports for every protocol not included in the current request. The put instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Lightsail Dev Guide.
    */
  def putInstancePublicPorts(): Request[PutInstancePublicPortsResult, AWSError] = js.native
  def putInstancePublicPorts(callback: js.Function2[/* err */ AWSError, /* data */ PutInstancePublicPortsResult, Unit]): Request[PutInstancePublicPortsResult, AWSError] = js.native
  /**
    * Sets the specified open ports for an Amazon Lightsail instance, and closes all ports for every protocol not included in the current request. The put instance public ports operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Lightsail Dev Guide.
    */
  def putInstancePublicPorts(params: PutInstancePublicPortsRequest): Request[PutInstancePublicPortsResult, AWSError] = js.native
  def putInstancePublicPorts(
    params: PutInstancePublicPortsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutInstancePublicPortsResult, Unit]
  ): Request[PutInstancePublicPortsResult, AWSError] = js.native
  /**
    * Restarts a specific instance. The reboot instance operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Lightsail Dev Guide.
    */
  def rebootInstance(): Request[RebootInstanceResult, AWSError] = js.native
  def rebootInstance(callback: js.Function2[/* err */ AWSError, /* data */ RebootInstanceResult, Unit]): Request[RebootInstanceResult, AWSError] = js.native
  /**
    * Restarts a specific instance. The reboot instance operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Lightsail Dev Guide.
    */
  def rebootInstance(params: RebootInstanceRequest): Request[RebootInstanceResult, AWSError] = js.native
  def rebootInstance(
    params: RebootInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RebootInstanceResult, Unit]
  ): Request[RebootInstanceResult, AWSError] = js.native
  /**
    * Restarts a specific database in Amazon Lightsail. The reboot relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def rebootRelationalDatabase(): Request[RebootRelationalDatabaseResult, AWSError] = js.native
  def rebootRelationalDatabase(callback: js.Function2[/* err */ AWSError, /* data */ RebootRelationalDatabaseResult, Unit]): Request[RebootRelationalDatabaseResult, AWSError] = js.native
  /**
    * Restarts a specific database in Amazon Lightsail. The reboot relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def rebootRelationalDatabase(params: RebootRelationalDatabaseRequest): Request[RebootRelationalDatabaseResult, AWSError] = js.native
  def rebootRelationalDatabase(
    params: RebootRelationalDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RebootRelationalDatabaseResult, Unit]
  ): Request[RebootRelationalDatabaseResult, AWSError] = js.native
  /**
    * Deletes a specific static IP from your account.
    */
  def releaseStaticIp(): Request[ReleaseStaticIpResult, AWSError] = js.native
  def releaseStaticIp(callback: js.Function2[/* err */ AWSError, /* data */ ReleaseStaticIpResult, Unit]): Request[ReleaseStaticIpResult, AWSError] = js.native
  /**
    * Deletes a specific static IP from your account.
    */
  def releaseStaticIp(params: ReleaseStaticIpRequest): Request[ReleaseStaticIpResult, AWSError] = js.native
  def releaseStaticIp(
    params: ReleaseStaticIpRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReleaseStaticIpResult, Unit]
  ): Request[ReleaseStaticIpResult, AWSError] = js.native
  /**
    * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the reboot instance operation.  When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP address after stopping and starting an instance, create a static IP address and attach it to the instance. For more information, see the Lightsail Dev Guide.  The start instance operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Lightsail Dev Guide.
    */
  def startInstance(): Request[StartInstanceResult, AWSError] = js.native
  def startInstance(callback: js.Function2[/* err */ AWSError, /* data */ StartInstanceResult, Unit]): Request[StartInstanceResult, AWSError] = js.native
  /**
    * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the reboot instance operation.  When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP address after stopping and starting an instance, create a static IP address and attach it to the instance. For more information, see the Lightsail Dev Guide.  The start instance operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Lightsail Dev Guide.
    */
  def startInstance(params: StartInstanceRequest): Request[StartInstanceResult, AWSError] = js.native
  def startInstance(
    params: StartInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartInstanceResult, Unit]
  ): Request[StartInstanceResult, AWSError] = js.native
  /**
    * Starts a specific database from a stopped state in Amazon Lightsail. To restart a database, use the reboot relational database operation. The start relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def startRelationalDatabase(): Request[StartRelationalDatabaseResult, AWSError] = js.native
  def startRelationalDatabase(callback: js.Function2[/* err */ AWSError, /* data */ StartRelationalDatabaseResult, Unit]): Request[StartRelationalDatabaseResult, AWSError] = js.native
  /**
    * Starts a specific database from a stopped state in Amazon Lightsail. To restart a database, use the reboot relational database operation. The start relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def startRelationalDatabase(params: StartRelationalDatabaseRequest): Request[StartRelationalDatabaseResult, AWSError] = js.native
  def startRelationalDatabase(
    params: StartRelationalDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartRelationalDatabaseResult, Unit]
  ): Request[StartRelationalDatabaseResult, AWSError] = js.native
  /**
    * Stops a specific Amazon Lightsail instance that is currently running.  When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP address after stopping and starting an instance, create a static IP address and attach it to the instance. For more information, see the Lightsail Dev Guide.  The stop instance operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Lightsail Dev Guide.
    */
  def stopInstance(): Request[StopInstanceResult, AWSError] = js.native
  def stopInstance(callback: js.Function2[/* err */ AWSError, /* data */ StopInstanceResult, Unit]): Request[StopInstanceResult, AWSError] = js.native
  /**
    * Stops a specific Amazon Lightsail instance that is currently running.  When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP address after stopping and starting an instance, create a static IP address and attach it to the instance. For more information, see the Lightsail Dev Guide.  The stop instance operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Lightsail Dev Guide.
    */
  def stopInstance(params: StopInstanceRequest): Request[StopInstanceResult, AWSError] = js.native
  def stopInstance(
    params: StopInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopInstanceResult, Unit]
  ): Request[StopInstanceResult, AWSError] = js.native
  /**
    * Stops a specific database that is currently running in Amazon Lightsail. The stop relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def stopRelationalDatabase(): Request[StopRelationalDatabaseResult, AWSError] = js.native
  def stopRelationalDatabase(callback: js.Function2[/* err */ AWSError, /* data */ StopRelationalDatabaseResult, Unit]): Request[StopRelationalDatabaseResult, AWSError] = js.native
  /**
    * Stops a specific database that is currently running in Amazon Lightsail. The stop relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def stopRelationalDatabase(params: StopRelationalDatabaseRequest): Request[StopRelationalDatabaseResult, AWSError] = js.native
  def stopRelationalDatabase(
    params: StopRelationalDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopRelationalDatabaseResult, Unit]
  ): Request[StopRelationalDatabaseResult, AWSError] = js.native
  /**
    * Adds one or more tags to the specified Amazon Lightsail resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see the Lightsail Dev Guide. The tag resource operation supports tag-based access control via request tags and resource tags applied to the resource identified by resource name. For more information, see the Lightsail Dev Guide.
    */
  def tagResource(): Request[TagResourceResult, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]): Request[TagResourceResult, AWSError] = js.native
  /**
    * Adds one or more tags to the specified Amazon Lightsail resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see the Lightsail Dev Guide. The tag resource operation supports tag-based access control via request tags and resource tags applied to the resource identified by resource name. For more information, see the Lightsail Dev Guide.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResult, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]
  ): Request[TagResourceResult, AWSError] = js.native
  /**
    * Attempts to unpeer the Lightsail VPC from the user's default VPC.
    */
  def unpeerVpc(): Request[UnpeerVpcResult, AWSError] = js.native
  def unpeerVpc(callback: js.Function2[/* err */ AWSError, /* data */ UnpeerVpcResult, Unit]): Request[UnpeerVpcResult, AWSError] = js.native
  /**
    * Attempts to unpeer the Lightsail VPC from the user's default VPC.
    */
  def unpeerVpc(params: UnpeerVpcRequest): Request[UnpeerVpcResult, AWSError] = js.native
  def unpeerVpc(
    params: UnpeerVpcRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UnpeerVpcResult, Unit]
  ): Request[UnpeerVpcResult, AWSError] = js.native
  /**
    * Deletes the specified set of tag keys and their values from the specified Amazon Lightsail resource. The untag resource operation supports tag-based access control via request tags and resource tags applied to the resource identified by resource name. For more information, see the Lightsail Dev Guide.
    */
  def untagResource(): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]): Request[UntagResourceResult, AWSError] = js.native
  /**
    * Deletes the specified set of tag keys and their values from the specified Amazon Lightsail resource. The untag resource operation supports tag-based access control via request tags and resource tags applied to the resource identified by resource name. For more information, see the Lightsail Dev Guide.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]
  ): Request[UntagResourceResult, AWSError] = js.native
  /**
    * Updates a domain recordset after it is created. The update domain entry operation supports tag-based access control via resource tags applied to the resource identified by domain name. For more information, see the Lightsail Dev Guide.
    */
  def updateDomainEntry(): Request[UpdateDomainEntryResult, AWSError] = js.native
  def updateDomainEntry(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainEntryResult, Unit]): Request[UpdateDomainEntryResult, AWSError] = js.native
  /**
    * Updates a domain recordset after it is created. The update domain entry operation supports tag-based access control via resource tags applied to the resource identified by domain name. For more information, see the Lightsail Dev Guide.
    */
  def updateDomainEntry(params: UpdateDomainEntryRequest): Request[UpdateDomainEntryResult, AWSError] = js.native
  def updateDomainEntry(
    params: UpdateDomainEntryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainEntryResult, Unit]
  ): Request[UpdateDomainEntryResult, AWSError] = js.native
  /**
    * Updates the specified attribute for a load balancer. You can only update one attribute at a time. The update load balancer attribute operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Lightsail Dev Guide.
    */
  def updateLoadBalancerAttribute(): Request[UpdateLoadBalancerAttributeResult, AWSError] = js.native
  def updateLoadBalancerAttribute(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLoadBalancerAttributeResult, Unit]): Request[UpdateLoadBalancerAttributeResult, AWSError] = js.native
  /**
    * Updates the specified attribute for a load balancer. You can only update one attribute at a time. The update load balancer attribute operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Lightsail Dev Guide.
    */
  def updateLoadBalancerAttribute(params: UpdateLoadBalancerAttributeRequest): Request[UpdateLoadBalancerAttributeResult, AWSError] = js.native
  def updateLoadBalancerAttribute(
    params: UpdateLoadBalancerAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLoadBalancerAttributeResult, Unit]
  ): Request[UpdateLoadBalancerAttributeResult, AWSError] = js.native
  /**
    * Allows the update of one or more attributes of a database in Amazon Lightsail. Updates are applied immediately, or in cases where the updates could result in an outage, are applied during the database's predefined maintenance window. The update relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def updateRelationalDatabase(): Request[UpdateRelationalDatabaseResult, AWSError] = js.native
  def updateRelationalDatabase(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRelationalDatabaseResult, Unit]): Request[UpdateRelationalDatabaseResult, AWSError] = js.native
  /**
    * Allows the update of one or more attributes of a database in Amazon Lightsail. Updates are applied immediately, or in cases where the updates could result in an outage, are applied during the database's predefined maintenance window. The update relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def updateRelationalDatabase(params: UpdateRelationalDatabaseRequest): Request[UpdateRelationalDatabaseResult, AWSError] = js.native
  def updateRelationalDatabase(
    params: UpdateRelationalDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRelationalDatabaseResult, Unit]
  ): Request[UpdateRelationalDatabaseResult, AWSError] = js.native
  /**
    * Allows the update of one or more parameters of a database in Amazon Lightsail. Parameter updates don't cause outages; therefore, their application is not subject to the preferred maintenance window. However, there are two ways in which parameter updates are applied: dynamic or pending-reboot. Parameters marked with a dynamic apply type are applied immediately. Parameters marked with a pending-reboot apply type are applied only after the database is rebooted using the reboot relational database operation. The update relational database parameters operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def updateRelationalDatabaseParameters(): Request[UpdateRelationalDatabaseParametersResult, AWSError] = js.native
  def updateRelationalDatabaseParameters(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRelationalDatabaseParametersResult, Unit]
  ): Request[UpdateRelationalDatabaseParametersResult, AWSError] = js.native
  /**
    * Allows the update of one or more parameters of a database in Amazon Lightsail. Parameter updates don't cause outages; therefore, their application is not subject to the preferred maintenance window. However, there are two ways in which parameter updates are applied: dynamic or pending-reboot. Parameters marked with a dynamic apply type are applied immediately. Parameters marked with a pending-reboot apply type are applied only after the database is rebooted using the reboot relational database operation. The update relational database parameters operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.
    */
  def updateRelationalDatabaseParameters(params: UpdateRelationalDatabaseParametersRequest): Request[UpdateRelationalDatabaseParametersResult, AWSError] = js.native
  def updateRelationalDatabaseParameters(
    params: UpdateRelationalDatabaseParametersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRelationalDatabaseParametersResult, Unit]
  ): Request[UpdateRelationalDatabaseParametersResult, AWSError] = js.native
}

