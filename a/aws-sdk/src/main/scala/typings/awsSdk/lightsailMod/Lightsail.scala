package typings.awsSdk.lightsailMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lightsail extends Service {
  
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
    * Attaches an SSL/TLS certificate to your Amazon Lightsail content delivery network (CDN) distribution. After the certificate is attached, your distribution accepts HTTPS traffic for all of the domains that are associated with the certificate. Use the CreateCertificate action to create a certificate that you can attach to your distribution.  Only certificates created in the us-east-1 Amazon Web Services Region can be attached to Lightsail distributions. Lightsail distributions are global resources that can reference an origin in any Amazon Web Services Region, and distribute its content globally. However, all distributions are located in the us-east-1 Region. 
    */
  def attachCertificateToDistribution(): Request[AttachCertificateToDistributionResult, AWSError] = js.native
  def attachCertificateToDistribution(callback: js.Function2[/* err */ AWSError, /* data */ AttachCertificateToDistributionResult, Unit]): Request[AttachCertificateToDistributionResult, AWSError] = js.native
  /**
    * Attaches an SSL/TLS certificate to your Amazon Lightsail content delivery network (CDN) distribution. After the certificate is attached, your distribution accepts HTTPS traffic for all of the domains that are associated with the certificate. Use the CreateCertificate action to create a certificate that you can attach to your distribution.  Only certificates created in the us-east-1 Amazon Web Services Region can be attached to Lightsail distributions. Lightsail distributions are global resources that can reference an origin in any Amazon Web Services Region, and distribute its content globally. However, all distributions are located in the us-east-1 Region. 
    */
  def attachCertificateToDistribution(params: AttachCertificateToDistributionRequest): Request[AttachCertificateToDistributionResult, AWSError] = js.native
  def attachCertificateToDistribution(
    params: AttachCertificateToDistributionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachCertificateToDistributionResult, Unit]
  ): Request[AttachCertificateToDistributionResult, AWSError] = js.native
  
  /**
    * Attaches a block storage disk to a running or stopped Lightsail instance and exposes it to the instance with the specified disk name. The attach disk operation supports tag-based access control via resource tags applied to the resource identified by disk name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def attachDisk(): Request[AttachDiskResult, AWSError] = js.native
  def attachDisk(callback: js.Function2[/* err */ AWSError, /* data */ AttachDiskResult, Unit]): Request[AttachDiskResult, AWSError] = js.native
  /**
    * Attaches a block storage disk to a running or stopped Lightsail instance and exposes it to the instance with the specified disk name. The attach disk operation supports tag-based access control via resource tags applied to the resource identified by disk name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def attachDisk(params: AttachDiskRequest): Request[AttachDiskResult, AWSError] = js.native
  def attachDisk(
    params: AttachDiskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachDiskResult, Unit]
  ): Request[AttachDiskResult, AWSError] = js.native
  
  /**
    * Attaches one or more Lightsail instances to a load balancer. After some time, the instances are attached to the load balancer and the health check status is available. The attach instances to load balancer operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Lightsail Developer Guide.
    */
  def attachInstancesToLoadBalancer(): Request[AttachInstancesToLoadBalancerResult, AWSError] = js.native
  def attachInstancesToLoadBalancer(callback: js.Function2[/* err */ AWSError, /* data */ AttachInstancesToLoadBalancerResult, Unit]): Request[AttachInstancesToLoadBalancerResult, AWSError] = js.native
  /**
    * Attaches one or more Lightsail instances to a load balancer. After some time, the instances are attached to the load balancer and the health check status is available. The attach instances to load balancer operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Lightsail Developer Guide.
    */
  def attachInstancesToLoadBalancer(params: AttachInstancesToLoadBalancerRequest): Request[AttachInstancesToLoadBalancerResult, AWSError] = js.native
  def attachInstancesToLoadBalancer(
    params: AttachInstancesToLoadBalancerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachInstancesToLoadBalancerResult, Unit]
  ): Request[AttachInstancesToLoadBalancerResult, AWSError] = js.native
  
  /**
    * Attaches a Transport Layer Security (TLS) certificate to your load balancer. TLS is just an updated, more secure version of Secure Socket Layer (SSL). Once you create and validate your certificate, you can attach it to your load balancer. You can also use this API to rotate the certificates on your account. Use the AttachLoadBalancerTlsCertificate action with the non-attached certificate, and it will replace the existing one and become the attached certificate. The AttachLoadBalancerTlsCertificate operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def attachLoadBalancerTlsCertificate(): Request[AttachLoadBalancerTlsCertificateResult, AWSError] = js.native
  def attachLoadBalancerTlsCertificate(
    callback: js.Function2[/* err */ AWSError, /* data */ AttachLoadBalancerTlsCertificateResult, Unit]
  ): Request[AttachLoadBalancerTlsCertificateResult, AWSError] = js.native
  /**
    * Attaches a Transport Layer Security (TLS) certificate to your load balancer. TLS is just an updated, more secure version of Secure Socket Layer (SSL). Once you create and validate your certificate, you can attach it to your load balancer. You can also use this API to rotate the certificates on your account. Use the AttachLoadBalancerTlsCertificate action with the non-attached certificate, and it will replace the existing one and become the attached certificate. The AttachLoadBalancerTlsCertificate operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Amazon Lightsail Developer Guide.
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
    * Closes ports for a specific Amazon Lightsail instance. The CloseInstancePublicPorts action supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def closeInstancePublicPorts(): Request[CloseInstancePublicPortsResult, AWSError] = js.native
  def closeInstancePublicPorts(callback: js.Function2[/* err */ AWSError, /* data */ CloseInstancePublicPortsResult, Unit]): Request[CloseInstancePublicPortsResult, AWSError] = js.native
  /**
    * Closes ports for a specific Amazon Lightsail instance. The CloseInstancePublicPorts action supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def closeInstancePublicPorts(params: CloseInstancePublicPortsRequest): Request[CloseInstancePublicPortsResult, AWSError] = js.native
  def closeInstancePublicPorts(
    params: CloseInstancePublicPortsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CloseInstancePublicPortsResult, Unit]
  ): Request[CloseInstancePublicPortsResult, AWSError] = js.native
  
  @JSName("config")
  var config_Lightsail: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Copies a manual snapshot of an instance or disk as another manual snapshot, or copies an automatic snapshot of an instance or disk as a manual snapshot. This operation can also be used to copy a manual or automatic snapshot of an instance or a disk from one Amazon Web Services Region to another in Amazon Lightsail. When copying a manual snapshot, be sure to define the source region, source snapshot name, and target snapshot name parameters. When copying an automatic snapshot, be sure to define the source region, source resource name, target snapshot name, and either the restore date or the use latest restorable auto snapshot parameters.
    */
  def copySnapshot(): Request[CopySnapshotResult, AWSError] = js.native
  def copySnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CopySnapshotResult, Unit]): Request[CopySnapshotResult, AWSError] = js.native
  /**
    * Copies a manual snapshot of an instance or disk as another manual snapshot, or copies an automatic snapshot of an instance or disk as a manual snapshot. This operation can also be used to copy a manual or automatic snapshot of an instance or a disk from one Amazon Web Services Region to another in Amazon Lightsail. When copying a manual snapshot, be sure to define the source region, source snapshot name, and target snapshot name parameters. When copying an automatic snapshot, be sure to define the source region, source resource name, target snapshot name, and either the restore date or the use latest restorable auto snapshot parameters.
    */
  def copySnapshot(params: CopySnapshotRequest): Request[CopySnapshotResult, AWSError] = js.native
  def copySnapshot(
    params: CopySnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CopySnapshotResult, Unit]
  ): Request[CopySnapshotResult, AWSError] = js.native
  
  /**
    * Creates an Amazon Lightsail bucket. A bucket is a cloud storage resource available in the Lightsail object storage service. Use buckets to store objects such as data and its descriptive metadata. For more information about buckets, see Buckets in Amazon Lightsail in the Amazon Lightsail Developer Guide.
    */
  def createBucket(): Request[CreateBucketResult, AWSError] = js.native
  def createBucket(callback: js.Function2[/* err */ AWSError, /* data */ CreateBucketResult, Unit]): Request[CreateBucketResult, AWSError] = js.native
  /**
    * Creates an Amazon Lightsail bucket. A bucket is a cloud storage resource available in the Lightsail object storage service. Use buckets to store objects such as data and its descriptive metadata. For more information about buckets, see Buckets in Amazon Lightsail in the Amazon Lightsail Developer Guide.
    */
  def createBucket(params: CreateBucketRequest): Request[CreateBucketResult, AWSError] = js.native
  def createBucket(
    params: CreateBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBucketResult, Unit]
  ): Request[CreateBucketResult, AWSError] = js.native
  
  /**
    * Creates a new access key for the specified Amazon Lightsail bucket. Access keys consist of an access key ID and corresponding secret access key. Access keys grant full programmatic access to the specified bucket and its objects. You can have a maximum of two access keys per bucket. Use the GetBucketAccessKeys action to get a list of current access keys for a specific bucket. For more information about access keys, see Creating access keys for a bucket in Amazon Lightsail in the Amazon Lightsail Developer Guide.  The secretAccessKey value is returned only in response to the CreateBucketAccessKey action. You can get a secret access key only when you first create an access key; you cannot get the secret access key later. If you lose the secret access key, you must create a new access key. 
    */
  def createBucketAccessKey(): Request[CreateBucketAccessKeyResult, AWSError] = js.native
  def createBucketAccessKey(callback: js.Function2[/* err */ AWSError, /* data */ CreateBucketAccessKeyResult, Unit]): Request[CreateBucketAccessKeyResult, AWSError] = js.native
  /**
    * Creates a new access key for the specified Amazon Lightsail bucket. Access keys consist of an access key ID and corresponding secret access key. Access keys grant full programmatic access to the specified bucket and its objects. You can have a maximum of two access keys per bucket. Use the GetBucketAccessKeys action to get a list of current access keys for a specific bucket. For more information about access keys, see Creating access keys for a bucket in Amazon Lightsail in the Amazon Lightsail Developer Guide.  The secretAccessKey value is returned only in response to the CreateBucketAccessKey action. You can get a secret access key only when you first create an access key; you cannot get the secret access key later. If you lose the secret access key, you must create a new access key. 
    */
  def createBucketAccessKey(params: CreateBucketAccessKeyRequest): Request[CreateBucketAccessKeyResult, AWSError] = js.native
  def createBucketAccessKey(
    params: CreateBucketAccessKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBucketAccessKeyResult, Unit]
  ): Request[CreateBucketAccessKeyResult, AWSError] = js.native
  
  /**
    * Creates an SSL/TLS certificate for an Amazon Lightsail content delivery network (CDN) distribution and a container service. After the certificate is valid, use the AttachCertificateToDistribution action to use the certificate and its domains with your distribution. Or use the UpdateContainerService action to use the certificate and its domains with your container service.  Only certificates created in the us-east-1 Amazon Web Services Region can be attached to Lightsail distributions. Lightsail distributions are global resources that can reference an origin in any Amazon Web Services Region, and distribute its content globally. However, all distributions are located in the us-east-1 Region. 
    */
  def createCertificate(): Request[CreateCertificateResult, AWSError] = js.native
  def createCertificate(callback: js.Function2[/* err */ AWSError, /* data */ CreateCertificateResult, Unit]): Request[CreateCertificateResult, AWSError] = js.native
  /**
    * Creates an SSL/TLS certificate for an Amazon Lightsail content delivery network (CDN) distribution and a container service. After the certificate is valid, use the AttachCertificateToDistribution action to use the certificate and its domains with your distribution. Or use the UpdateContainerService action to use the certificate and its domains with your container service.  Only certificates created in the us-east-1 Amazon Web Services Region can be attached to Lightsail distributions. Lightsail distributions are global resources that can reference an origin in any Amazon Web Services Region, and distribute its content globally. However, all distributions are located in the us-east-1 Region. 
    */
  def createCertificate(params: CreateCertificateRequest): Request[CreateCertificateResult, AWSError] = js.native
  def createCertificate(
    params: CreateCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCertificateResult, Unit]
  ): Request[CreateCertificateResult, AWSError] = js.native
  
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
    * Creates an email or SMS text message contact method. A contact method is used to send you notifications about your Amazon Lightsail resources. You can add one email address and one mobile phone number contact method in each Amazon Web Services Region. However, SMS text messaging is not supported in some Amazon Web Services Regions, and SMS text messages cannot be sent to some countries/regions. For more information, see Notifications in Amazon Lightsail.
    */
  def createContactMethod(): Request[CreateContactMethodResult, AWSError] = js.native
  def createContactMethod(callback: js.Function2[/* err */ AWSError, /* data */ CreateContactMethodResult, Unit]): Request[CreateContactMethodResult, AWSError] = js.native
  /**
    * Creates an email or SMS text message contact method. A contact method is used to send you notifications about your Amazon Lightsail resources. You can add one email address and one mobile phone number contact method in each Amazon Web Services Region. However, SMS text messaging is not supported in some Amazon Web Services Regions, and SMS text messages cannot be sent to some countries/regions. For more information, see Notifications in Amazon Lightsail.
    */
  def createContactMethod(params: CreateContactMethodRequest): Request[CreateContactMethodResult, AWSError] = js.native
  def createContactMethod(
    params: CreateContactMethodRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateContactMethodResult, Unit]
  ): Request[CreateContactMethodResult, AWSError] = js.native
  
  /**
    * Creates an Amazon Lightsail container service. A Lightsail container service is a compute resource to which you can deploy containers. For more information, see Container services in Amazon Lightsail in the Lightsail Dev Guide.
    */
  def createContainerService(): Request[CreateContainerServiceResult, AWSError] = js.native
  def createContainerService(callback: js.Function2[/* err */ AWSError, /* data */ CreateContainerServiceResult, Unit]): Request[CreateContainerServiceResult, AWSError] = js.native
  /**
    * Creates an Amazon Lightsail container service. A Lightsail container service is a compute resource to which you can deploy containers. For more information, see Container services in Amazon Lightsail in the Lightsail Dev Guide.
    */
  def createContainerService(params: CreateContainerServiceRequest): Request[CreateContainerServiceResult, AWSError] = js.native
  def createContainerService(
    params: CreateContainerServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateContainerServiceResult, Unit]
  ): Request[CreateContainerServiceResult, AWSError] = js.native
  
  /**
    * Creates a deployment for your Amazon Lightsail container service. A deployment specifies the containers that will be launched on the container service and their settings, such as the ports to open, the environment variables to apply, and the launch command to run. It also specifies the container that will serve as the public endpoint of the deployment and its settings, such as the HTTP or HTTPS port to use, and the health check configuration. You can deploy containers to your container service using container images from a public registry such as Amazon ECR Public, or from your local machine. For more information, see Creating container images for your Amazon Lightsail container services in the Amazon Lightsail Developer Guide.
    */
  def createContainerServiceDeployment(): Request[CreateContainerServiceDeploymentResult, AWSError] = js.native
  def createContainerServiceDeployment(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateContainerServiceDeploymentResult, Unit]
  ): Request[CreateContainerServiceDeploymentResult, AWSError] = js.native
  /**
    * Creates a deployment for your Amazon Lightsail container service. A deployment specifies the containers that will be launched on the container service and their settings, such as the ports to open, the environment variables to apply, and the launch command to run. It also specifies the container that will serve as the public endpoint of the deployment and its settings, such as the HTTP or HTTPS port to use, and the health check configuration. You can deploy containers to your container service using container images from a public registry such as Amazon ECR Public, or from your local machine. For more information, see Creating container images for your Amazon Lightsail container services in the Amazon Lightsail Developer Guide.
    */
  def createContainerServiceDeployment(params: CreateContainerServiceDeploymentRequest): Request[CreateContainerServiceDeploymentResult, AWSError] = js.native
  def createContainerServiceDeployment(
    params: CreateContainerServiceDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateContainerServiceDeploymentResult, Unit]
  ): Request[CreateContainerServiceDeploymentResult, AWSError] = js.native
  
  /**
    * Creates a temporary set of log in credentials that you can use to log in to the Docker process on your local machine. After you're logged in, you can use the native Docker commands to push your local container images to the container image registry of your Amazon Lightsail account so that you can use them with your Lightsail container service. The log in credentials expire 12 hours after they are created, at which point you will need to create a new set of log in credentials.  You can only push container images to the container service registry of your Lightsail account. You cannot pull container images or perform any other container image management actions on the container service registry.  After you push your container images to the container image registry of your Lightsail account, use the RegisterContainerImage action to register the pushed images to a specific Lightsail container service.  This action is not required if you install and use the Lightsail Control (lightsailctl) plugin to push container images to your Lightsail container service. For more information, see Pushing and managing container images on your Amazon Lightsail container services in the Amazon Lightsail Developer Guide. 
    */
  def createContainerServiceRegistryLogin(): Request[CreateContainerServiceRegistryLoginResult, AWSError] = js.native
  def createContainerServiceRegistryLogin(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateContainerServiceRegistryLoginResult, Unit]
  ): Request[CreateContainerServiceRegistryLoginResult, AWSError] = js.native
  /**
    * Creates a temporary set of log in credentials that you can use to log in to the Docker process on your local machine. After you're logged in, you can use the native Docker commands to push your local container images to the container image registry of your Amazon Lightsail account so that you can use them with your Lightsail container service. The log in credentials expire 12 hours after they are created, at which point you will need to create a new set of log in credentials.  You can only push container images to the container service registry of your Lightsail account. You cannot pull container images or perform any other container image management actions on the container service registry.  After you push your container images to the container image registry of your Lightsail account, use the RegisterContainerImage action to register the pushed images to a specific Lightsail container service.  This action is not required if you install and use the Lightsail Control (lightsailctl) plugin to push container images to your Lightsail container service. For more information, see Pushing and managing container images on your Amazon Lightsail container services in the Amazon Lightsail Developer Guide. 
    */
  def createContainerServiceRegistryLogin(params: CreateContainerServiceRegistryLoginRequest): Request[CreateContainerServiceRegistryLoginResult, AWSError] = js.native
  def createContainerServiceRegistryLogin(
    params: CreateContainerServiceRegistryLoginRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateContainerServiceRegistryLoginResult, Unit]
  ): Request[CreateContainerServiceRegistryLoginResult, AWSError] = js.native
  
  /**
    * Creates a block storage disk that can be attached to an Amazon Lightsail instance in the same Availability Zone (e.g., us-east-2a). The create disk operation supports tag-based access control via request tags. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createDisk(): Request[CreateDiskResult, AWSError] = js.native
  def createDisk(callback: js.Function2[/* err */ AWSError, /* data */ CreateDiskResult, Unit]): Request[CreateDiskResult, AWSError] = js.native
  /**
    * Creates a block storage disk that can be attached to an Amazon Lightsail instance in the same Availability Zone (e.g., us-east-2a). The create disk operation supports tag-based access control via request tags. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createDisk(params: CreateDiskRequest): Request[CreateDiskResult, AWSError] = js.native
  def createDisk(
    params: CreateDiskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDiskResult, Unit]
  ): Request[CreateDiskResult, AWSError] = js.native
  
  /**
    * Creates a block storage disk from a manual or automatic snapshot of a disk. The resulting disk can be attached to an Amazon Lightsail instance in the same Availability Zone (e.g., us-east-2a). The create disk from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by disk snapshot name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createDiskFromSnapshot(): Request[CreateDiskFromSnapshotResult, AWSError] = js.native
  def createDiskFromSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateDiskFromSnapshotResult, Unit]): Request[CreateDiskFromSnapshotResult, AWSError] = js.native
  /**
    * Creates a block storage disk from a manual or automatic snapshot of a disk. The resulting disk can be attached to an Amazon Lightsail instance in the same Availability Zone (e.g., us-east-2a). The create disk from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by disk snapshot name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createDiskFromSnapshot(params: CreateDiskFromSnapshotRequest): Request[CreateDiskFromSnapshotResult, AWSError] = js.native
  def createDiskFromSnapshot(
    params: CreateDiskFromSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDiskFromSnapshotResult, Unit]
  ): Request[CreateDiskFromSnapshotResult, AWSError] = js.native
  
  /**
    * Creates a snapshot of a block storage disk. You can use snapshots for backups, to make copies of disks, and to save data before shutting down a Lightsail instance. You can take a snapshot of an attached disk that is in use; however, snapshots only capture data that has been written to your disk at the time the snapshot command is issued. This may exclude any data that has been cached by any applications or the operating system. If you can pause any file systems on the disk long enough to take a snapshot, your snapshot should be complete. Nevertheless, if you cannot pause all file writes to the disk, you should unmount the disk from within the Lightsail instance, issue the create disk snapshot command, and then remount the disk to ensure a consistent and complete snapshot. You may remount and use your disk while the snapshot status is pending. You can also use this operation to create a snapshot of an instance's system volume. You might want to do this, for example, to recover data from the system volume of a botched instance or to create a backup of the system volume like you would for a block storage disk. To create a snapshot of a system volume, just define the instance name parameter when issuing the snapshot command, and a snapshot of the defined instance's system volume will be created. After the snapshot is available, you can create a block storage disk from the snapshot and attach it to a running instance to access the data on the disk. The create disk snapshot operation supports tag-based access control via request tags. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createDiskSnapshot(): Request[CreateDiskSnapshotResult, AWSError] = js.native
  def createDiskSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateDiskSnapshotResult, Unit]): Request[CreateDiskSnapshotResult, AWSError] = js.native
  /**
    * Creates a snapshot of a block storage disk. You can use snapshots for backups, to make copies of disks, and to save data before shutting down a Lightsail instance. You can take a snapshot of an attached disk that is in use; however, snapshots only capture data that has been written to your disk at the time the snapshot command is issued. This may exclude any data that has been cached by any applications or the operating system. If you can pause any file systems on the disk long enough to take a snapshot, your snapshot should be complete. Nevertheless, if you cannot pause all file writes to the disk, you should unmount the disk from within the Lightsail instance, issue the create disk snapshot command, and then remount the disk to ensure a consistent and complete snapshot. You may remount and use your disk while the snapshot status is pending. You can also use this operation to create a snapshot of an instance's system volume. You might want to do this, for example, to recover data from the system volume of a botched instance or to create a backup of the system volume like you would for a block storage disk. To create a snapshot of a system volume, just define the instance name parameter when issuing the snapshot command, and a snapshot of the defined instance's system volume will be created. After the snapshot is available, you can create a block storage disk from the snapshot and attach it to a running instance to access the data on the disk. The create disk snapshot operation supports tag-based access control via request tags. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createDiskSnapshot(params: CreateDiskSnapshotRequest): Request[CreateDiskSnapshotResult, AWSError] = js.native
  def createDiskSnapshot(
    params: CreateDiskSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDiskSnapshotResult, Unit]
  ): Request[CreateDiskSnapshotResult, AWSError] = js.native
  
  /**
    * Creates an Amazon Lightsail content delivery network (CDN) distribution. A distribution is a globally distributed network of caching servers that improve the performance of your website or web application hosted on a Lightsail instance. For more information, see Content delivery networks in Amazon Lightsail.
    */
  def createDistribution(): Request[CreateDistributionResult, AWSError] = js.native
  def createDistribution(callback: js.Function2[/* err */ AWSError, /* data */ CreateDistributionResult, Unit]): Request[CreateDistributionResult, AWSError] = js.native
  /**
    * Creates an Amazon Lightsail content delivery network (CDN) distribution. A distribution is a globally distributed network of caching servers that improve the performance of your website or web application hosted on a Lightsail instance. For more information, see Content delivery networks in Amazon Lightsail.
    */
  def createDistribution(params: CreateDistributionRequest): Request[CreateDistributionResult, AWSError] = js.native
  def createDistribution(
    params: CreateDistributionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDistributionResult, Unit]
  ): Request[CreateDistributionResult, AWSError] = js.native
  
  /**
    * Creates a domain resource for the specified domain (e.g., example.com). The create domain operation supports tag-based access control via request tags. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createDomain(): Request[CreateDomainResult, AWSError] = js.native
  def createDomain(callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResult, Unit]): Request[CreateDomainResult, AWSError] = js.native
  /**
    * Creates a domain resource for the specified domain (e.g., example.com). The create domain operation supports tag-based access control via request tags. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createDomain(params: CreateDomainRequest): Request[CreateDomainResult, AWSError] = js.native
  def createDomain(
    params: CreateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResult, Unit]
  ): Request[CreateDomainResult, AWSError] = js.native
  
  /**
    * Creates one of the following domain name system (DNS) records in a domain DNS zone: Address (A), canonical name (CNAME), mail exchanger (MX), name server (NS), start of authority (SOA), service locator (SRV), or text (TXT). The create domain entry operation supports tag-based access control via resource tags applied to the resource identified by domain name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createDomainEntry(): Request[CreateDomainEntryResult, AWSError] = js.native
  def createDomainEntry(callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainEntryResult, Unit]): Request[CreateDomainEntryResult, AWSError] = js.native
  /**
    * Creates one of the following domain name system (DNS) records in a domain DNS zone: Address (A), canonical name (CNAME), mail exchanger (MX), name server (NS), start of authority (SOA), service locator (SRV), or text (TXT). The create domain entry operation supports tag-based access control via resource tags applied to the resource identified by domain name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createDomainEntry(params: CreateDomainEntryRequest): Request[CreateDomainEntryResult, AWSError] = js.native
  def createDomainEntry(
    params: CreateDomainEntryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainEntryResult, Unit]
  ): Request[CreateDomainEntryResult, AWSError] = js.native
  
  /**
    * Creates a snapshot of a specific virtual private server, or instance. You can use a snapshot to create a new instance that is based on that snapshot. The create instance snapshot operation supports tag-based access control via request tags. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createInstanceSnapshot(): Request[CreateInstanceSnapshotResult, AWSError] = js.native
  def createInstanceSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateInstanceSnapshotResult, Unit]): Request[CreateInstanceSnapshotResult, AWSError] = js.native
  /**
    * Creates a snapshot of a specific virtual private server, or instance. You can use a snapshot to create a new instance that is based on that snapshot. The create instance snapshot operation supports tag-based access control via request tags. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createInstanceSnapshot(params: CreateInstanceSnapshotRequest): Request[CreateInstanceSnapshotResult, AWSError] = js.native
  def createInstanceSnapshot(
    params: CreateInstanceSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInstanceSnapshotResult, Unit]
  ): Request[CreateInstanceSnapshotResult, AWSError] = js.native
  
  /**
    * Creates one or more Amazon Lightsail instances. The create instances operation supports tag-based access control via request tags. For more information, see the Lightsail Developer Guide.
    */
  def createInstances(): Request[CreateInstancesResult, AWSError] = js.native
  def createInstances(callback: js.Function2[/* err */ AWSError, /* data */ CreateInstancesResult, Unit]): Request[CreateInstancesResult, AWSError] = js.native
  /**
    * Creates one or more Amazon Lightsail instances. The create instances operation supports tag-based access control via request tags. For more information, see the Lightsail Developer Guide.
    */
  def createInstances(params: CreateInstancesRequest): Request[CreateInstancesResult, AWSError] = js.native
  def createInstances(
    params: CreateInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInstancesResult, Unit]
  ): Request[CreateInstancesResult, AWSError] = js.native
  
  /**
    * Creates one or more new instances from a manual or automatic snapshot of an instance. The create instances from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by instance snapshot name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createInstancesFromSnapshot(): Request[CreateInstancesFromSnapshotResult, AWSError] = js.native
  def createInstancesFromSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateInstancesFromSnapshotResult, Unit]): Request[CreateInstancesFromSnapshotResult, AWSError] = js.native
  /**
    * Creates one or more new instances from a manual or automatic snapshot of an instance. The create instances from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by instance snapshot name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createInstancesFromSnapshot(params: CreateInstancesFromSnapshotRequest): Request[CreateInstancesFromSnapshotResult, AWSError] = js.native
  def createInstancesFromSnapshot(
    params: CreateInstancesFromSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInstancesFromSnapshotResult, Unit]
  ): Request[CreateInstancesFromSnapshotResult, AWSError] = js.native
  
  /**
    * Creates a custom SSH key pair that you can use with an Amazon Lightsail instance.  Use the DownloadDefaultKeyPair action to create a Lightsail default key pair in an Amazon Web Services Region where a default key pair does not currently exist.  The create key pair operation supports tag-based access control via request tags. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createKeyPair(): Request[CreateKeyPairResult, AWSError] = js.native
  def createKeyPair(callback: js.Function2[/* err */ AWSError, /* data */ CreateKeyPairResult, Unit]): Request[CreateKeyPairResult, AWSError] = js.native
  /**
    * Creates a custom SSH key pair that you can use with an Amazon Lightsail instance.  Use the DownloadDefaultKeyPair action to create a Lightsail default key pair in an Amazon Web Services Region where a default key pair does not currently exist.  The create key pair operation supports tag-based access control via request tags. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createKeyPair(params: CreateKeyPairRequest): Request[CreateKeyPairResult, AWSError] = js.native
  def createKeyPair(
    params: CreateKeyPairRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateKeyPairResult, Unit]
  ): Request[CreateKeyPairResult, AWSError] = js.native
  
  /**
    * Creates a Lightsail load balancer. To learn more about deciding whether to load balance your application, see Configure your Lightsail instances for load balancing. You can create up to 5 load balancers per AWS Region in your account. When you create a load balancer, you can specify a unique name and port settings. To change additional load balancer settings, use the UpdateLoadBalancerAttribute operation. The create load balancer operation supports tag-based access control via request tags. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createLoadBalancer(): Request[CreateLoadBalancerResult, AWSError] = js.native
  def createLoadBalancer(callback: js.Function2[/* err */ AWSError, /* data */ CreateLoadBalancerResult, Unit]): Request[CreateLoadBalancerResult, AWSError] = js.native
  /**
    * Creates a Lightsail load balancer. To learn more about deciding whether to load balance your application, see Configure your Lightsail instances for load balancing. You can create up to 5 load balancers per AWS Region in your account. When you create a load balancer, you can specify a unique name and port settings. To change additional load balancer settings, use the UpdateLoadBalancerAttribute operation. The create load balancer operation supports tag-based access control via request tags. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createLoadBalancer(params: CreateLoadBalancerRequest): Request[CreateLoadBalancerResult, AWSError] = js.native
  def createLoadBalancer(
    params: CreateLoadBalancerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLoadBalancerResult, Unit]
  ): Request[CreateLoadBalancerResult, AWSError] = js.native
  
  /**
    * Creates an SSL/TLS certificate for an Amazon Lightsail load balancer. TLS is just an updated, more secure version of Secure Socket Layer (SSL). The CreateLoadBalancerTlsCertificate operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createLoadBalancerTlsCertificate(): Request[CreateLoadBalancerTlsCertificateResult, AWSError] = js.native
  def createLoadBalancerTlsCertificate(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLoadBalancerTlsCertificateResult, Unit]
  ): Request[CreateLoadBalancerTlsCertificateResult, AWSError] = js.native
  /**
    * Creates an SSL/TLS certificate for an Amazon Lightsail load balancer. TLS is just an updated, more secure version of Secure Socket Layer (SSL). The CreateLoadBalancerTlsCertificate operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createLoadBalancerTlsCertificate(params: CreateLoadBalancerTlsCertificateRequest): Request[CreateLoadBalancerTlsCertificateResult, AWSError] = js.native
  def createLoadBalancerTlsCertificate(
    params: CreateLoadBalancerTlsCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLoadBalancerTlsCertificateResult, Unit]
  ): Request[CreateLoadBalancerTlsCertificateResult, AWSError] = js.native
  
  /**
    * Creates a new database in Amazon Lightsail. The create relational database operation supports tag-based access control via request tags. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createRelationalDatabase(): Request[CreateRelationalDatabaseResult, AWSError] = js.native
  def createRelationalDatabase(callback: js.Function2[/* err */ AWSError, /* data */ CreateRelationalDatabaseResult, Unit]): Request[CreateRelationalDatabaseResult, AWSError] = js.native
  /**
    * Creates a new database in Amazon Lightsail. The create relational database operation supports tag-based access control via request tags. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createRelationalDatabase(params: CreateRelationalDatabaseRequest): Request[CreateRelationalDatabaseResult, AWSError] = js.native
  def createRelationalDatabase(
    params: CreateRelationalDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRelationalDatabaseResult, Unit]
  ): Request[CreateRelationalDatabaseResult, AWSError] = js.native
  
  /**
    * Creates a new database from an existing database snapshot in Amazon Lightsail. You can create a new database from a snapshot in if something goes wrong with your original database, or to change it to a different plan, such as a high availability or standard plan. The create relational database from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by relationalDatabaseSnapshotName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createRelationalDatabaseFromSnapshot(): Request[CreateRelationalDatabaseFromSnapshotResult, AWSError] = js.native
  def createRelationalDatabaseFromSnapshot(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRelationalDatabaseFromSnapshotResult, Unit]
  ): Request[CreateRelationalDatabaseFromSnapshotResult, AWSError] = js.native
  /**
    * Creates a new database from an existing database snapshot in Amazon Lightsail. You can create a new database from a snapshot in if something goes wrong with your original database, or to change it to a different plan, such as a high availability or standard plan. The create relational database from snapshot operation supports tag-based access control via request tags and resource tags applied to the resource identified by relationalDatabaseSnapshotName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createRelationalDatabaseFromSnapshot(params: CreateRelationalDatabaseFromSnapshotRequest): Request[CreateRelationalDatabaseFromSnapshotResult, AWSError] = js.native
  def createRelationalDatabaseFromSnapshot(
    params: CreateRelationalDatabaseFromSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRelationalDatabaseFromSnapshotResult, Unit]
  ): Request[CreateRelationalDatabaseFromSnapshotResult, AWSError] = js.native
  
  /**
    * Creates a snapshot of your database in Amazon Lightsail. You can use snapshots for backups, to make copies of a database, and to save data before deleting a database. The create relational database snapshot operation supports tag-based access control via request tags. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createRelationalDatabaseSnapshot(): Request[CreateRelationalDatabaseSnapshotResult, AWSError] = js.native
  def createRelationalDatabaseSnapshot(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRelationalDatabaseSnapshotResult, Unit]
  ): Request[CreateRelationalDatabaseSnapshotResult, AWSError] = js.native
  /**
    * Creates a snapshot of your database in Amazon Lightsail. You can use snapshots for backups, to make copies of a database, and to save data before deleting a database. The create relational database snapshot operation supports tag-based access control via request tags. For more information, see the Amazon Lightsail Developer Guide.
    */
  def createRelationalDatabaseSnapshot(params: CreateRelationalDatabaseSnapshotRequest): Request[CreateRelationalDatabaseSnapshotResult, AWSError] = js.native
  def createRelationalDatabaseSnapshot(
    params: CreateRelationalDatabaseSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRelationalDatabaseSnapshotResult, Unit]
  ): Request[CreateRelationalDatabaseSnapshotResult, AWSError] = js.native
  
  /**
    * Deletes an alarm. An alarm is used to monitor a single metric for one of your resources. When a metric condition is met, the alarm can notify you by email, SMS text message, and a banner displayed on the Amazon Lightsail console. For more information, see Alarms in Amazon Lightsail.
    */
  def deleteAlarm(): Request[DeleteAlarmResult, AWSError] = js.native
  def deleteAlarm(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAlarmResult, Unit]): Request[DeleteAlarmResult, AWSError] = js.native
  /**
    * Deletes an alarm. An alarm is used to monitor a single metric for one of your resources. When a metric condition is met, the alarm can notify you by email, SMS text message, and a banner displayed on the Amazon Lightsail console. For more information, see Alarms in Amazon Lightsail.
    */
  def deleteAlarm(params: DeleteAlarmRequest): Request[DeleteAlarmResult, AWSError] = js.native
  def deleteAlarm(
    params: DeleteAlarmRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAlarmResult, Unit]
  ): Request[DeleteAlarmResult, AWSError] = js.native
  
  /**
    * Deletes an automatic snapshot of an instance or disk. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteAutoSnapshot(): Request[DeleteAutoSnapshotResult, AWSError] = js.native
  def deleteAutoSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAutoSnapshotResult, Unit]): Request[DeleteAutoSnapshotResult, AWSError] = js.native
  /**
    * Deletes an automatic snapshot of an instance or disk. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteAutoSnapshot(params: DeleteAutoSnapshotRequest): Request[DeleteAutoSnapshotResult, AWSError] = js.native
  def deleteAutoSnapshot(
    params: DeleteAutoSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAutoSnapshotResult, Unit]
  ): Request[DeleteAutoSnapshotResult, AWSError] = js.native
  
  /**
    * Deletes a Amazon Lightsail bucket.  When you delete your bucket, the bucket name is released and can be reused for a new bucket in your account or another Amazon Web Services account. 
    */
  def deleteBucket(): Request[DeleteBucketResult, AWSError] = js.native
  def deleteBucket(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBucketResult, Unit]): Request[DeleteBucketResult, AWSError] = js.native
  /**
    * Deletes a Amazon Lightsail bucket.  When you delete your bucket, the bucket name is released and can be reused for a new bucket in your account or another Amazon Web Services account. 
    */
  def deleteBucket(params: DeleteBucketRequest): Request[DeleteBucketResult, AWSError] = js.native
  def deleteBucket(
    params: DeleteBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBucketResult, Unit]
  ): Request[DeleteBucketResult, AWSError] = js.native
  
  /**
    * Deletes an access key for the specified Amazon Lightsail bucket. We recommend that you delete an access key if the secret access key is compromised. For more information about access keys, see Creating access keys for a bucket in Amazon Lightsail in the Amazon Lightsail Developer Guide.
    */
  def deleteBucketAccessKey(): Request[DeleteBucketAccessKeyResult, AWSError] = js.native
  def deleteBucketAccessKey(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBucketAccessKeyResult, Unit]): Request[DeleteBucketAccessKeyResult, AWSError] = js.native
  /**
    * Deletes an access key for the specified Amazon Lightsail bucket. We recommend that you delete an access key if the secret access key is compromised. For more information about access keys, see Creating access keys for a bucket in Amazon Lightsail in the Amazon Lightsail Developer Guide.
    */
  def deleteBucketAccessKey(params: DeleteBucketAccessKeyRequest): Request[DeleteBucketAccessKeyResult, AWSError] = js.native
  def deleteBucketAccessKey(
    params: DeleteBucketAccessKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBucketAccessKeyResult, Unit]
  ): Request[DeleteBucketAccessKeyResult, AWSError] = js.native
  
  /**
    * Deletes an SSL/TLS certificate for your Amazon Lightsail content delivery network (CDN) distribution. Certificates that are currently attached to a distribution cannot be deleted. Use the DetachCertificateFromDistribution action to detach a certificate from a distribution.
    */
  def deleteCertificate(): Request[DeleteCertificateResult, AWSError] = js.native
  def deleteCertificate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCertificateResult, Unit]): Request[DeleteCertificateResult, AWSError] = js.native
  /**
    * Deletes an SSL/TLS certificate for your Amazon Lightsail content delivery network (CDN) distribution. Certificates that are currently attached to a distribution cannot be deleted. Use the DetachCertificateFromDistribution action to detach a certificate from a distribution.
    */
  def deleteCertificate(params: DeleteCertificateRequest): Request[DeleteCertificateResult, AWSError] = js.native
  def deleteCertificate(
    params: DeleteCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCertificateResult, Unit]
  ): Request[DeleteCertificateResult, AWSError] = js.native
  
  /**
    * Deletes a contact method. A contact method is used to send you notifications about your Amazon Lightsail resources. You can add one email address and one mobile phone number contact method in each Amazon Web Services Region. However, SMS text messaging is not supported in some Amazon Web Services Regions, and SMS text messages cannot be sent to some countries/regions. For more information, see Notifications in Amazon Lightsail.
    */
  def deleteContactMethod(): Request[DeleteContactMethodResult, AWSError] = js.native
  def deleteContactMethod(callback: js.Function2[/* err */ AWSError, /* data */ DeleteContactMethodResult, Unit]): Request[DeleteContactMethodResult, AWSError] = js.native
  /**
    * Deletes a contact method. A contact method is used to send you notifications about your Amazon Lightsail resources. You can add one email address and one mobile phone number contact method in each Amazon Web Services Region. However, SMS text messaging is not supported in some Amazon Web Services Regions, and SMS text messages cannot be sent to some countries/regions. For more information, see Notifications in Amazon Lightsail.
    */
  def deleteContactMethod(params: DeleteContactMethodRequest): Request[DeleteContactMethodResult, AWSError] = js.native
  def deleteContactMethod(
    params: DeleteContactMethodRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteContactMethodResult, Unit]
  ): Request[DeleteContactMethodResult, AWSError] = js.native
  
  /**
    * Deletes a container image that is registered to your Amazon Lightsail container service.
    */
  def deleteContainerImage(): Request[DeleteContainerImageResult, AWSError] = js.native
  def deleteContainerImage(callback: js.Function2[/* err */ AWSError, /* data */ DeleteContainerImageResult, Unit]): Request[DeleteContainerImageResult, AWSError] = js.native
  /**
    * Deletes a container image that is registered to your Amazon Lightsail container service.
    */
  def deleteContainerImage(params: DeleteContainerImageRequest): Request[DeleteContainerImageResult, AWSError] = js.native
  def deleteContainerImage(
    params: DeleteContainerImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteContainerImageResult, Unit]
  ): Request[DeleteContainerImageResult, AWSError] = js.native
  
  /**
    * Deletes your Amazon Lightsail container service.
    */
  def deleteContainerService(): Request[DeleteContainerServiceResult, AWSError] = js.native
  def deleteContainerService(callback: js.Function2[/* err */ AWSError, /* data */ DeleteContainerServiceResult, Unit]): Request[DeleteContainerServiceResult, AWSError] = js.native
  /**
    * Deletes your Amazon Lightsail container service.
    */
  def deleteContainerService(params: DeleteContainerServiceRequest): Request[DeleteContainerServiceResult, AWSError] = js.native
  def deleteContainerService(
    params: DeleteContainerServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteContainerServiceResult, Unit]
  ): Request[DeleteContainerServiceResult, AWSError] = js.native
  
  /**
    * Deletes the specified block storage disk. The disk must be in the available state (not attached to a Lightsail instance).  The disk may remain in the deleting state for several minutes.  The delete disk operation supports tag-based access control via resource tags applied to the resource identified by disk name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteDisk(): Request[DeleteDiskResult, AWSError] = js.native
  def deleteDisk(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDiskResult, Unit]): Request[DeleteDiskResult, AWSError] = js.native
  /**
    * Deletes the specified block storage disk. The disk must be in the available state (not attached to a Lightsail instance).  The disk may remain in the deleting state for several minutes.  The delete disk operation supports tag-based access control via resource tags applied to the resource identified by disk name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteDisk(params: DeleteDiskRequest): Request[DeleteDiskResult, AWSError] = js.native
  def deleteDisk(
    params: DeleteDiskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDiskResult, Unit]
  ): Request[DeleteDiskResult, AWSError] = js.native
  
  /**
    * Deletes the specified disk snapshot. When you make periodic snapshots of a disk, the snapshots are incremental, and only the blocks on the device that have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all active snapshots will have access to all the information needed to restore the disk. The delete disk snapshot operation supports tag-based access control via resource tags applied to the resource identified by disk snapshot name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteDiskSnapshot(): Request[DeleteDiskSnapshotResult, AWSError] = js.native
  def deleteDiskSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDiskSnapshotResult, Unit]): Request[DeleteDiskSnapshotResult, AWSError] = js.native
  /**
    * Deletes the specified disk snapshot. When you make periodic snapshots of a disk, the snapshots are incremental, and only the blocks on the device that have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all active snapshots will have access to all the information needed to restore the disk. The delete disk snapshot operation supports tag-based access control via resource tags applied to the resource identified by disk snapshot name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteDiskSnapshot(params: DeleteDiskSnapshotRequest): Request[DeleteDiskSnapshotResult, AWSError] = js.native
  def deleteDiskSnapshot(
    params: DeleteDiskSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDiskSnapshotResult, Unit]
  ): Request[DeleteDiskSnapshotResult, AWSError] = js.native
  
  /**
    * Deletes your Amazon Lightsail content delivery network (CDN) distribution.
    */
  def deleteDistribution(): Request[DeleteDistributionResult, AWSError] = js.native
  def deleteDistribution(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDistributionResult, Unit]): Request[DeleteDistributionResult, AWSError] = js.native
  /**
    * Deletes your Amazon Lightsail content delivery network (CDN) distribution.
    */
  def deleteDistribution(params: DeleteDistributionRequest): Request[DeleteDistributionResult, AWSError] = js.native
  def deleteDistribution(
    params: DeleteDistributionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDistributionResult, Unit]
  ): Request[DeleteDistributionResult, AWSError] = js.native
  
  /**
    * Deletes the specified domain recordset and all of its domain records. The delete domain operation supports tag-based access control via resource tags applied to the resource identified by domain name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteDomain(): Request[DeleteDomainResult, AWSError] = js.native
  def deleteDomain(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainResult, Unit]): Request[DeleteDomainResult, AWSError] = js.native
  /**
    * Deletes the specified domain recordset and all of its domain records. The delete domain operation supports tag-based access control via resource tags applied to the resource identified by domain name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteDomain(params: DeleteDomainRequest): Request[DeleteDomainResult, AWSError] = js.native
  def deleteDomain(
    params: DeleteDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainResult, Unit]
  ): Request[DeleteDomainResult, AWSError] = js.native
  
  /**
    * Deletes a specific domain entry. The delete domain entry operation supports tag-based access control via resource tags applied to the resource identified by domain name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteDomainEntry(): Request[DeleteDomainEntryResult, AWSError] = js.native
  def deleteDomainEntry(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainEntryResult, Unit]): Request[DeleteDomainEntryResult, AWSError] = js.native
  /**
    * Deletes a specific domain entry. The delete domain entry operation supports tag-based access control via resource tags applied to the resource identified by domain name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteDomainEntry(params: DeleteDomainEntryRequest): Request[DeleteDomainEntryResult, AWSError] = js.native
  def deleteDomainEntry(
    params: DeleteDomainEntryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainEntryResult, Unit]
  ): Request[DeleteDomainEntryResult, AWSError] = js.native
  
  /**
    * Deletes an Amazon Lightsail instance. The delete instance operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteInstance(): Request[DeleteInstanceResult, AWSError] = js.native
  def deleteInstance(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInstanceResult, Unit]): Request[DeleteInstanceResult, AWSError] = js.native
  /**
    * Deletes an Amazon Lightsail instance. The delete instance operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteInstance(params: DeleteInstanceRequest): Request[DeleteInstanceResult, AWSError] = js.native
  def deleteInstance(
    params: DeleteInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInstanceResult, Unit]
  ): Request[DeleteInstanceResult, AWSError] = js.native
  
  /**
    * Deletes a specific snapshot of a virtual private server (or instance). The delete instance snapshot operation supports tag-based access control via resource tags applied to the resource identified by instance snapshot name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteInstanceSnapshot(): Request[DeleteInstanceSnapshotResult, AWSError] = js.native
  def deleteInstanceSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInstanceSnapshotResult, Unit]): Request[DeleteInstanceSnapshotResult, AWSError] = js.native
  /**
    * Deletes a specific snapshot of a virtual private server (or instance). The delete instance snapshot operation supports tag-based access control via resource tags applied to the resource identified by instance snapshot name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteInstanceSnapshot(params: DeleteInstanceSnapshotRequest): Request[DeleteInstanceSnapshotResult, AWSError] = js.native
  def deleteInstanceSnapshot(
    params: DeleteInstanceSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInstanceSnapshotResult, Unit]
  ): Request[DeleteInstanceSnapshotResult, AWSError] = js.native
  
  /**
    * Deletes the specified key pair by removing the public key from Amazon Lightsail. You can delete key pairs that were created using the ImportKeyPair and CreateKeyPair actions, as well as the Lightsail default key pair. A new default key pair will not be created unless you launch an instance without specifying a custom key pair, or you call the DownloadDefaultKeyPair API.  The delete key pair operation supports tag-based access control via resource tags applied to the resource identified by key pair name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteKeyPair(): Request[DeleteKeyPairResult, AWSError] = js.native
  def deleteKeyPair(callback: js.Function2[/* err */ AWSError, /* data */ DeleteKeyPairResult, Unit]): Request[DeleteKeyPairResult, AWSError] = js.native
  /**
    * Deletes the specified key pair by removing the public key from Amazon Lightsail. You can delete key pairs that were created using the ImportKeyPair and CreateKeyPair actions, as well as the Lightsail default key pair. A new default key pair will not be created unless you launch an instance without specifying a custom key pair, or you call the DownloadDefaultKeyPair API.  The delete key pair operation supports tag-based access control via resource tags applied to the resource identified by key pair name. For more information, see the Amazon Lightsail Developer Guide.
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
    * Deletes a Lightsail load balancer and all its associated SSL/TLS certificates. Once the load balancer is deleted, you will need to create a new load balancer, create a new certificate, and verify domain ownership again. The delete load balancer operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteLoadBalancer(): Request[DeleteLoadBalancerResult, AWSError] = js.native
  def deleteLoadBalancer(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoadBalancerResult, Unit]): Request[DeleteLoadBalancerResult, AWSError] = js.native
  /**
    * Deletes a Lightsail load balancer and all its associated SSL/TLS certificates. Once the load balancer is deleted, you will need to create a new load balancer, create a new certificate, and verify domain ownership again. The delete load balancer operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteLoadBalancer(params: DeleteLoadBalancerRequest): Request[DeleteLoadBalancerResult, AWSError] = js.native
  def deleteLoadBalancer(
    params: DeleteLoadBalancerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoadBalancerResult, Unit]
  ): Request[DeleteLoadBalancerResult, AWSError] = js.native
  
  /**
    * Deletes an SSL/TLS certificate associated with a Lightsail load balancer. The DeleteLoadBalancerTlsCertificate operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteLoadBalancerTlsCertificate(): Request[DeleteLoadBalancerTlsCertificateResult, AWSError] = js.native
  def deleteLoadBalancerTlsCertificate(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoadBalancerTlsCertificateResult, Unit]
  ): Request[DeleteLoadBalancerTlsCertificateResult, AWSError] = js.native
  /**
    * Deletes an SSL/TLS certificate associated with a Lightsail load balancer. The DeleteLoadBalancerTlsCertificate operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteLoadBalancerTlsCertificate(params: DeleteLoadBalancerTlsCertificateRequest): Request[DeleteLoadBalancerTlsCertificateResult, AWSError] = js.native
  def deleteLoadBalancerTlsCertificate(
    params: DeleteLoadBalancerTlsCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoadBalancerTlsCertificateResult, Unit]
  ): Request[DeleteLoadBalancerTlsCertificateResult, AWSError] = js.native
  
  /**
    * Deletes a database in Amazon Lightsail. The delete relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteRelationalDatabase(): Request[DeleteRelationalDatabaseResult, AWSError] = js.native
  def deleteRelationalDatabase(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRelationalDatabaseResult, Unit]): Request[DeleteRelationalDatabaseResult, AWSError] = js.native
  /**
    * Deletes a database in Amazon Lightsail. The delete relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteRelationalDatabase(params: DeleteRelationalDatabaseRequest): Request[DeleteRelationalDatabaseResult, AWSError] = js.native
  def deleteRelationalDatabase(
    params: DeleteRelationalDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRelationalDatabaseResult, Unit]
  ): Request[DeleteRelationalDatabaseResult, AWSError] = js.native
  
  /**
    * Deletes a database snapshot in Amazon Lightsail. The delete relational database snapshot operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteRelationalDatabaseSnapshot(): Request[DeleteRelationalDatabaseSnapshotResult, AWSError] = js.native
  def deleteRelationalDatabaseSnapshot(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRelationalDatabaseSnapshotResult, Unit]
  ): Request[DeleteRelationalDatabaseSnapshotResult, AWSError] = js.native
  /**
    * Deletes a database snapshot in Amazon Lightsail. The delete relational database snapshot operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def deleteRelationalDatabaseSnapshot(params: DeleteRelationalDatabaseSnapshotRequest): Request[DeleteRelationalDatabaseSnapshotResult, AWSError] = js.native
  def deleteRelationalDatabaseSnapshot(
    params: DeleteRelationalDatabaseSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRelationalDatabaseSnapshotResult, Unit]
  ): Request[DeleteRelationalDatabaseSnapshotResult, AWSError] = js.native
  
  /**
    * Detaches an SSL/TLS certificate from your Amazon Lightsail content delivery network (CDN) distribution. After the certificate is detached, your distribution stops accepting traffic for all of the domains that are associated with the certificate.
    */
  def detachCertificateFromDistribution(): Request[DetachCertificateFromDistributionResult, AWSError] = js.native
  def detachCertificateFromDistribution(
    callback: js.Function2[/* err */ AWSError, /* data */ DetachCertificateFromDistributionResult, Unit]
  ): Request[DetachCertificateFromDistributionResult, AWSError] = js.native
  /**
    * Detaches an SSL/TLS certificate from your Amazon Lightsail content delivery network (CDN) distribution. After the certificate is detached, your distribution stops accepting traffic for all of the domains that are associated with the certificate.
    */
  def detachCertificateFromDistribution(params: DetachCertificateFromDistributionRequest): Request[DetachCertificateFromDistributionResult, AWSError] = js.native
  def detachCertificateFromDistribution(
    params: DetachCertificateFromDistributionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetachCertificateFromDistributionResult, Unit]
  ): Request[DetachCertificateFromDistributionResult, AWSError] = js.native
  
  /**
    * Detaches a stopped block storage disk from a Lightsail instance. Make sure to unmount any file systems on the device within your operating system before stopping the instance and detaching the disk. The detach disk operation supports tag-based access control via resource tags applied to the resource identified by disk name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def detachDisk(): Request[DetachDiskResult, AWSError] = js.native
  def detachDisk(callback: js.Function2[/* err */ AWSError, /* data */ DetachDiskResult, Unit]): Request[DetachDiskResult, AWSError] = js.native
  /**
    * Detaches a stopped block storage disk from a Lightsail instance. Make sure to unmount any file systems on the device within your operating system before stopping the instance and detaching the disk. The detach disk operation supports tag-based access control via resource tags applied to the resource identified by disk name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def detachDisk(params: DetachDiskRequest): Request[DetachDiskResult, AWSError] = js.native
  def detachDisk(
    params: DetachDiskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetachDiskResult, Unit]
  ): Request[DetachDiskResult, AWSError] = js.native
  
  /**
    * Detaches the specified instances from a Lightsail load balancer. This operation waits until the instances are no longer needed before they are detached from the load balancer. The detach instances from load balancer operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def detachInstancesFromLoadBalancer(): Request[DetachInstancesFromLoadBalancerResult, AWSError] = js.native
  def detachInstancesFromLoadBalancer(callback: js.Function2[/* err */ AWSError, /* data */ DetachInstancesFromLoadBalancerResult, Unit]): Request[DetachInstancesFromLoadBalancerResult, AWSError] = js.native
  /**
    * Detaches the specified instances from a Lightsail load balancer. This operation waits until the instances are no longer needed before they are detached from the load balancer. The detach instances from load balancer operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Amazon Lightsail Developer Guide.
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
    * Disables an add-on for an Amazon Lightsail resource. For more information, see the Amazon Lightsail Developer Guide.
    */
  def disableAddOn(): Request[DisableAddOnResult, AWSError] = js.native
  def disableAddOn(callback: js.Function2[/* err */ AWSError, /* data */ DisableAddOnResult, Unit]): Request[DisableAddOnResult, AWSError] = js.native
  /**
    * Disables an add-on for an Amazon Lightsail resource. For more information, see the Amazon Lightsail Developer Guide.
    */
  def disableAddOn(params: DisableAddOnRequest): Request[DisableAddOnResult, AWSError] = js.native
  def disableAddOn(
    params: DisableAddOnRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableAddOnResult, Unit]
  ): Request[DisableAddOnResult, AWSError] = js.native
  
  /**
    * Downloads the regional Amazon Lightsail default key pair. This action also creates a Lightsail default key pair if a default key pair does not currently exist in the Amazon Web Services Region.
    */
  def downloadDefaultKeyPair(): Request[DownloadDefaultKeyPairResult, AWSError] = js.native
  def downloadDefaultKeyPair(callback: js.Function2[/* err */ AWSError, /* data */ DownloadDefaultKeyPairResult, Unit]): Request[DownloadDefaultKeyPairResult, AWSError] = js.native
  /**
    * Downloads the regional Amazon Lightsail default key pair. This action also creates a Lightsail default key pair if a default key pair does not currently exist in the Amazon Web Services Region.
    */
  def downloadDefaultKeyPair(params: DownloadDefaultKeyPairRequest): Request[DownloadDefaultKeyPairResult, AWSError] = js.native
  def downloadDefaultKeyPair(
    params: DownloadDefaultKeyPairRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DownloadDefaultKeyPairResult, Unit]
  ): Request[DownloadDefaultKeyPairResult, AWSError] = js.native
  
  /**
    * Enables or modifies an add-on for an Amazon Lightsail resource. For more information, see the Amazon Lightsail Developer Guide.
    */
  def enableAddOn(): Request[EnableAddOnResult, AWSError] = js.native
  def enableAddOn(callback: js.Function2[/* err */ AWSError, /* data */ EnableAddOnResult, Unit]): Request[EnableAddOnResult, AWSError] = js.native
  /**
    * Enables or modifies an add-on for an Amazon Lightsail resource. For more information, see the Amazon Lightsail Developer Guide.
    */
  def enableAddOn(params: EnableAddOnRequest): Request[EnableAddOnResult, AWSError] = js.native
  def enableAddOn(
    params: EnableAddOnRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableAddOnResult, Unit]
  ): Request[EnableAddOnResult, AWSError] = js.native
  
  /**
    * Exports an Amazon Lightsail instance or block storage disk snapshot to Amazon Elastic Compute Cloud (Amazon EC2). This operation results in an export snapshot record that can be used with the create cloud formation stack operation to create new Amazon EC2 instances. Exported instance snapshots appear in Amazon EC2 as Amazon Machine Images (AMIs), and the instance system disk appears as an Amazon Elastic Block Store (Amazon EBS) volume. Exported disk snapshots appear in Amazon EC2 as Amazon EBS volumes. Snapshots are exported to the same Amazon Web Services Region in Amazon EC2 as the source Lightsail snapshot.  The export snapshot operation supports tag-based access control via resource tags applied to the resource identified by source snapshot name. For more information, see the Amazon Lightsail Developer Guide.  Use the get instance snapshots or get disk snapshots operations to get a list of snapshots that you can export to Amazon EC2. 
    */
  def exportSnapshot(): Request[ExportSnapshotResult, AWSError] = js.native
  def exportSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ ExportSnapshotResult, Unit]): Request[ExportSnapshotResult, AWSError] = js.native
  /**
    * Exports an Amazon Lightsail instance or block storage disk snapshot to Amazon Elastic Compute Cloud (Amazon EC2). This operation results in an export snapshot record that can be used with the create cloud formation stack operation to create new Amazon EC2 instances. Exported instance snapshots appear in Amazon EC2 as Amazon Machine Images (AMIs), and the instance system disk appears as an Amazon Elastic Block Store (Amazon EBS) volume. Exported disk snapshots appear in Amazon EC2 as Amazon EBS volumes. Snapshots are exported to the same Amazon Web Services Region in Amazon EC2 as the source Lightsail snapshot.  The export snapshot operation supports tag-based access control via resource tags applied to the resource identified by source snapshot name. For more information, see the Amazon Lightsail Developer Guide.  Use the get instance snapshots or get disk snapshots operations to get a list of snapshots that you can export to Amazon EC2. 
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
    * Returns information about the configured alarms. Specify an alarm name in your request to return information about a specific alarm, or specify a monitored resource name to return information about all alarms for a specific resource. An alarm is used to monitor a single metric for one of your resources. When a metric condition is met, the alarm can notify you by email, SMS text message, and a banner displayed on the Amazon Lightsail console. For more information, see Alarms in Amazon Lightsail.
    */
  def getAlarms(): Request[GetAlarmsResult, AWSError] = js.native
  def getAlarms(callback: js.Function2[/* err */ AWSError, /* data */ GetAlarmsResult, Unit]): Request[GetAlarmsResult, AWSError] = js.native
  /**
    * Returns information about the configured alarms. Specify an alarm name in your request to return information about a specific alarm, or specify a monitored resource name to return information about all alarms for a specific resource. An alarm is used to monitor a single metric for one of your resources. When a metric condition is met, the alarm can notify you by email, SMS text message, and a banner displayed on the Amazon Lightsail console. For more information, see Alarms in Amazon Lightsail.
    */
  def getAlarms(params: GetAlarmsRequest): Request[GetAlarmsResult, AWSError] = js.native
  def getAlarms(
    params: GetAlarmsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAlarmsResult, Unit]
  ): Request[GetAlarmsResult, AWSError] = js.native
  
  /**
    * Returns the available automatic snapshots for an instance or disk. For more information, see the Amazon Lightsail Developer Guide.
    */
  def getAutoSnapshots(): Request[GetAutoSnapshotsResult, AWSError] = js.native
  def getAutoSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ GetAutoSnapshotsResult, Unit]): Request[GetAutoSnapshotsResult, AWSError] = js.native
  /**
    * Returns the available automatic snapshots for an instance or disk. For more information, see the Amazon Lightsail Developer Guide.
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
    * Returns the existing access key IDs for the specified Amazon Lightsail bucket.  This action does not return the secret access key value of an access key. You can get a secret access key only when you create it from the response of the CreateBucketAccessKey action. If you lose the secret access key, you must create a new access key. 
    */
  def getBucketAccessKeys(): Request[GetBucketAccessKeysResult, AWSError] = js.native
  def getBucketAccessKeys(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketAccessKeysResult, Unit]): Request[GetBucketAccessKeysResult, AWSError] = js.native
  /**
    * Returns the existing access key IDs for the specified Amazon Lightsail bucket.  This action does not return the secret access key value of an access key. You can get a secret access key only when you create it from the response of the CreateBucketAccessKey action. If you lose the secret access key, you must create a new access key. 
    */
  def getBucketAccessKeys(params: GetBucketAccessKeysRequest): Request[GetBucketAccessKeysResult, AWSError] = js.native
  def getBucketAccessKeys(
    params: GetBucketAccessKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketAccessKeysResult, Unit]
  ): Request[GetBucketAccessKeysResult, AWSError] = js.native
  
  /**
    * Returns the bundles that you can apply to a Amazon Lightsail bucket. The bucket bundle specifies the monthly cost, storage quota, and data transfer quota for a bucket. Use the UpdateBucketBundle action to update the bundle for a bucket.
    */
  def getBucketBundles(): Request[GetBucketBundlesResult, AWSError] = js.native
  def getBucketBundles(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketBundlesResult, Unit]): Request[GetBucketBundlesResult, AWSError] = js.native
  /**
    * Returns the bundles that you can apply to a Amazon Lightsail bucket. The bucket bundle specifies the monthly cost, storage quota, and data transfer quota for a bucket. Use the UpdateBucketBundle action to update the bundle for a bucket.
    */
  def getBucketBundles(params: GetBucketBundlesRequest): Request[GetBucketBundlesResult, AWSError] = js.native
  def getBucketBundles(
    params: GetBucketBundlesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketBundlesResult, Unit]
  ): Request[GetBucketBundlesResult, AWSError] = js.native
  
  /**
    * Returns the data points of a specific metric for an Amazon Lightsail bucket. Metrics report the utilization of a bucket. View and collect metric data regularly to monitor the number of objects stored in a bucket (including object versions) and the storage space used by those objects.
    */
  def getBucketMetricData(): Request[GetBucketMetricDataResult, AWSError] = js.native
  def getBucketMetricData(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketMetricDataResult, Unit]): Request[GetBucketMetricDataResult, AWSError] = js.native
  /**
    * Returns the data points of a specific metric for an Amazon Lightsail bucket. Metrics report the utilization of a bucket. View and collect metric data regularly to monitor the number of objects stored in a bucket (including object versions) and the storage space used by those objects.
    */
  def getBucketMetricData(params: GetBucketMetricDataRequest): Request[GetBucketMetricDataResult, AWSError] = js.native
  def getBucketMetricData(
    params: GetBucketMetricDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketMetricDataResult, Unit]
  ): Request[GetBucketMetricDataResult, AWSError] = js.native
  
  /**
    * Returns information about one or more Amazon Lightsail buckets. The information returned includes the synchronization status of the Amazon Simple Storage Service (Amazon S3) account-level block public access feature for your Lightsail buckets. For more information about buckets, see Buckets in Amazon Lightsail in the Amazon Lightsail Developer Guide.
    */
  def getBuckets(): Request[GetBucketsResult, AWSError] = js.native
  def getBuckets(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketsResult, Unit]): Request[GetBucketsResult, AWSError] = js.native
  /**
    * Returns information about one or more Amazon Lightsail buckets. The information returned includes the synchronization status of the Amazon Simple Storage Service (Amazon S3) account-level block public access feature for your Lightsail buckets. For more information about buckets, see Buckets in Amazon Lightsail in the Amazon Lightsail Developer Guide.
    */
  def getBuckets(params: GetBucketsRequest): Request[GetBucketsResult, AWSError] = js.native
  def getBuckets(
    params: GetBucketsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketsResult, Unit]
  ): Request[GetBucketsResult, AWSError] = js.native
  
  /**
    * Returns the bundles that you can apply to an Amazon Lightsail instance when you create it. A bundle describes the specifications of an instance, such as the monthly cost, amount of memory, the number of vCPUs, amount of storage space, and monthly network data transfer quota.  Bundles are referred to as instance plans in the Lightsail console. 
    */
  def getBundles(): Request[GetBundlesResult, AWSError] = js.native
  def getBundles(callback: js.Function2[/* err */ AWSError, /* data */ GetBundlesResult, Unit]): Request[GetBundlesResult, AWSError] = js.native
  /**
    * Returns the bundles that you can apply to an Amazon Lightsail instance when you create it. A bundle describes the specifications of an instance, such as the monthly cost, amount of memory, the number of vCPUs, amount of storage space, and monthly network data transfer quota.  Bundles are referred to as instance plans in the Lightsail console. 
    */
  def getBundles(params: GetBundlesRequest): Request[GetBundlesResult, AWSError] = js.native
  def getBundles(
    params: GetBundlesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBundlesResult, Unit]
  ): Request[GetBundlesResult, AWSError] = js.native
  
  /**
    * Returns information about one or more Amazon Lightsail SSL/TLS certificates.  To get a summary of a certificate, ommit includeCertificateDetails from your request. The response will include only the certificate Amazon Resource Name (ARN), certificate name, domain name, and tags. 
    */
  def getCertificates(): Request[GetCertificatesResult, AWSError] = js.native
  def getCertificates(callback: js.Function2[/* err */ AWSError, /* data */ GetCertificatesResult, Unit]): Request[GetCertificatesResult, AWSError] = js.native
  /**
    * Returns information about one or more Amazon Lightsail SSL/TLS certificates.  To get a summary of a certificate, ommit includeCertificateDetails from your request. The response will include only the certificate Amazon Resource Name (ARN), certificate name, domain name, and tags. 
    */
  def getCertificates(params: GetCertificatesRequest): Request[GetCertificatesResult, AWSError] = js.native
  def getCertificates(
    params: GetCertificatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCertificatesResult, Unit]
  ): Request[GetCertificatesResult, AWSError] = js.native
  
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
    * Returns information about the configured contact methods. Specify a protocol in your request to return information about a specific contact method. A contact method is used to send you notifications about your Amazon Lightsail resources. You can add one email address and one mobile phone number contact method in each Amazon Web Services Region. However, SMS text messaging is not supported in some Amazon Web Services Regions, and SMS text messages cannot be sent to some countries/regions. For more information, see Notifications in Amazon Lightsail.
    */
  def getContactMethods(): Request[GetContactMethodsResult, AWSError] = js.native
  def getContactMethods(callback: js.Function2[/* err */ AWSError, /* data */ GetContactMethodsResult, Unit]): Request[GetContactMethodsResult, AWSError] = js.native
  /**
    * Returns information about the configured contact methods. Specify a protocol in your request to return information about a specific contact method. A contact method is used to send you notifications about your Amazon Lightsail resources. You can add one email address and one mobile phone number contact method in each Amazon Web Services Region. However, SMS text messaging is not supported in some Amazon Web Services Regions, and SMS text messages cannot be sent to some countries/regions. For more information, see Notifications in Amazon Lightsail.
    */
  def getContactMethods(params: GetContactMethodsRequest): Request[GetContactMethodsResult, AWSError] = js.native
  def getContactMethods(
    params: GetContactMethodsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContactMethodsResult, Unit]
  ): Request[GetContactMethodsResult, AWSError] = js.native
  
  /**
    * Returns information about Amazon Lightsail containers, such as the current version of the Lightsail Control (lightsailctl) plugin.
    */
  def getContainerAPIMetadata(): Request[GetContainerAPIMetadataResult, AWSError] = js.native
  def getContainerAPIMetadata(callback: js.Function2[/* err */ AWSError, /* data */ GetContainerAPIMetadataResult, Unit]): Request[GetContainerAPIMetadataResult, AWSError] = js.native
  /**
    * Returns information about Amazon Lightsail containers, such as the current version of the Lightsail Control (lightsailctl) plugin.
    */
  def getContainerAPIMetadata(params: GetContainerAPIMetadataRequest): Request[GetContainerAPIMetadataResult, AWSError] = js.native
  def getContainerAPIMetadata(
    params: GetContainerAPIMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContainerAPIMetadataResult, Unit]
  ): Request[GetContainerAPIMetadataResult, AWSError] = js.native
  
  /**
    * Returns the container images that are registered to your Amazon Lightsail container service.  If you created a deployment on your Lightsail container service that uses container images from a public registry like Docker Hub, those images are not returned as part of this action. Those images are not registered to your Lightsail container service. 
    */
  def getContainerImages(): Request[GetContainerImagesResult, AWSError] = js.native
  def getContainerImages(callback: js.Function2[/* err */ AWSError, /* data */ GetContainerImagesResult, Unit]): Request[GetContainerImagesResult, AWSError] = js.native
  /**
    * Returns the container images that are registered to your Amazon Lightsail container service.  If you created a deployment on your Lightsail container service that uses container images from a public registry like Docker Hub, those images are not returned as part of this action. Those images are not registered to your Lightsail container service. 
    */
  def getContainerImages(params: GetContainerImagesRequest): Request[GetContainerImagesResult, AWSError] = js.native
  def getContainerImages(
    params: GetContainerImagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContainerImagesResult, Unit]
  ): Request[GetContainerImagesResult, AWSError] = js.native
  
  /**
    * Returns the log events of a container of your Amazon Lightsail container service. If your container service has more than one node (i.e., a scale greater than 1), then the log events that are returned for the specified container are merged from all nodes on your container service.  Container logs are retained for a certain amount of time. For more information, see Amazon Lightsail endpoints and quotas in the AWS General Reference. 
    */
  def getContainerLog(): Request[GetContainerLogResult, AWSError] = js.native
  def getContainerLog(callback: js.Function2[/* err */ AWSError, /* data */ GetContainerLogResult, Unit]): Request[GetContainerLogResult, AWSError] = js.native
  /**
    * Returns the log events of a container of your Amazon Lightsail container service. If your container service has more than one node (i.e., a scale greater than 1), then the log events that are returned for the specified container are merged from all nodes on your container service.  Container logs are retained for a certain amount of time. For more information, see Amazon Lightsail endpoints and quotas in the AWS General Reference. 
    */
  def getContainerLog(params: GetContainerLogRequest): Request[GetContainerLogResult, AWSError] = js.native
  def getContainerLog(
    params: GetContainerLogRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContainerLogResult, Unit]
  ): Request[GetContainerLogResult, AWSError] = js.native
  
  /**
    * Returns the deployments for your Amazon Lightsail container service A deployment specifies the settings, such as the ports and launch command, of containers that are deployed to your container service. The deployments are ordered by version in ascending order. The newest version is listed at the top of the response.  A set number of deployments are kept before the oldest one is replaced with the newest one. For more information, see Amazon Lightsail endpoints and quotas in the AWS General Reference. 
    */
  def getContainerServiceDeployments(): Request[GetContainerServiceDeploymentsResult, AWSError] = js.native
  def getContainerServiceDeployments(callback: js.Function2[/* err */ AWSError, /* data */ GetContainerServiceDeploymentsResult, Unit]): Request[GetContainerServiceDeploymentsResult, AWSError] = js.native
  /**
    * Returns the deployments for your Amazon Lightsail container service A deployment specifies the settings, such as the ports and launch command, of containers that are deployed to your container service. The deployments are ordered by version in ascending order. The newest version is listed at the top of the response.  A set number of deployments are kept before the oldest one is replaced with the newest one. For more information, see Amazon Lightsail endpoints and quotas in the AWS General Reference. 
    */
  def getContainerServiceDeployments(params: GetContainerServiceDeploymentsRequest): Request[GetContainerServiceDeploymentsResult, AWSError] = js.native
  def getContainerServiceDeployments(
    params: GetContainerServiceDeploymentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContainerServiceDeploymentsResult, Unit]
  ): Request[GetContainerServiceDeploymentsResult, AWSError] = js.native
  
  /**
    * Returns the data points of a specific metric of your Amazon Lightsail container service. Metrics report the utilization of your resources. Monitor and collect metric data regularly to maintain the reliability, availability, and performance of your resources.
    */
  def getContainerServiceMetricData(): Request[GetContainerServiceMetricDataResult, AWSError] = js.native
  def getContainerServiceMetricData(callback: js.Function2[/* err */ AWSError, /* data */ GetContainerServiceMetricDataResult, Unit]): Request[GetContainerServiceMetricDataResult, AWSError] = js.native
  /**
    * Returns the data points of a specific metric of your Amazon Lightsail container service. Metrics report the utilization of your resources. Monitor and collect metric data regularly to maintain the reliability, availability, and performance of your resources.
    */
  def getContainerServiceMetricData(params: GetContainerServiceMetricDataRequest): Request[GetContainerServiceMetricDataResult, AWSError] = js.native
  def getContainerServiceMetricData(
    params: GetContainerServiceMetricDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContainerServiceMetricDataResult, Unit]
  ): Request[GetContainerServiceMetricDataResult, AWSError] = js.native
  
  /**
    * Returns the list of powers that can be specified for your Amazon Lightsail container services. The power specifies the amount of memory, the number of vCPUs, and the base price of the container service.
    */
  def getContainerServicePowers(): Request[GetContainerServicePowersResult, AWSError] = js.native
  def getContainerServicePowers(callback: js.Function2[/* err */ AWSError, /* data */ GetContainerServicePowersResult, Unit]): Request[GetContainerServicePowersResult, AWSError] = js.native
  /**
    * Returns the list of powers that can be specified for your Amazon Lightsail container services. The power specifies the amount of memory, the number of vCPUs, and the base price of the container service.
    */
  def getContainerServicePowers(params: GetContainerServicePowersRequest): Request[GetContainerServicePowersResult, AWSError] = js.native
  def getContainerServicePowers(
    params: GetContainerServicePowersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContainerServicePowersResult, Unit]
  ): Request[GetContainerServicePowersResult, AWSError] = js.native
  
  /**
    * Returns information about one or more of your Amazon Lightsail container services.
    */
  def getContainerServices(): Request[ContainerServicesListResult, AWSError] = js.native
  def getContainerServices(callback: js.Function2[/* err */ AWSError, /* data */ ContainerServicesListResult, Unit]): Request[ContainerServicesListResult, AWSError] = js.native
  /**
    * Returns information about one or more of your Amazon Lightsail container services.
    */
  def getContainerServices(params: GetContainerServicesRequest): Request[ContainerServicesListResult, AWSError] = js.native
  def getContainerServices(
    params: GetContainerServicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ContainerServicesListResult, Unit]
  ): Request[ContainerServicesListResult, AWSError] = js.native
  
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
    * Returns information about all block storage disk snapshots in your AWS account and region.
    */
  def getDiskSnapshots(): Request[GetDiskSnapshotsResult, AWSError] = js.native
  def getDiskSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ GetDiskSnapshotsResult, Unit]): Request[GetDiskSnapshotsResult, AWSError] = js.native
  /**
    * Returns information about all block storage disk snapshots in your AWS account and region.
    */
  def getDiskSnapshots(params: GetDiskSnapshotsRequest): Request[GetDiskSnapshotsResult, AWSError] = js.native
  def getDiskSnapshots(
    params: GetDiskSnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDiskSnapshotsResult, Unit]
  ): Request[GetDiskSnapshotsResult, AWSError] = js.native
  
  /**
    * Returns information about all block storage disks in your AWS account and region.
    */
  def getDisks(): Request[GetDisksResult, AWSError] = js.native
  def getDisks(callback: js.Function2[/* err */ AWSError, /* data */ GetDisksResult, Unit]): Request[GetDisksResult, AWSError] = js.native
  /**
    * Returns information about all block storage disks in your AWS account and region.
    */
  def getDisks(params: GetDisksRequest): Request[GetDisksResult, AWSError] = js.native
  def getDisks(
    params: GetDisksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDisksResult, Unit]
  ): Request[GetDisksResult, AWSError] = js.native
  
  /**
    * Returns the bundles that can be applied to your Amazon Lightsail content delivery network (CDN) distributions. A distribution bundle specifies the monthly network transfer quota and monthly cost of your distribution.
    */
  def getDistributionBundles(): Request[GetDistributionBundlesResult, AWSError] = js.native
  def getDistributionBundles(callback: js.Function2[/* err */ AWSError, /* data */ GetDistributionBundlesResult, Unit]): Request[GetDistributionBundlesResult, AWSError] = js.native
  /**
    * Returns the bundles that can be applied to your Amazon Lightsail content delivery network (CDN) distributions. A distribution bundle specifies the monthly network transfer quota and monthly cost of your distribution.
    */
  def getDistributionBundles(params: GetDistributionBundlesRequest): Request[GetDistributionBundlesResult, AWSError] = js.native
  def getDistributionBundles(
    params: GetDistributionBundlesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDistributionBundlesResult, Unit]
  ): Request[GetDistributionBundlesResult, AWSError] = js.native
  
  /**
    * Returns the timestamp and status of the last cache reset of a specific Amazon Lightsail content delivery network (CDN) distribution.
    */
  def getDistributionLatestCacheReset(): Request[GetDistributionLatestCacheResetResult, AWSError] = js.native
  def getDistributionLatestCacheReset(callback: js.Function2[/* err */ AWSError, /* data */ GetDistributionLatestCacheResetResult, Unit]): Request[GetDistributionLatestCacheResetResult, AWSError] = js.native
  /**
    * Returns the timestamp and status of the last cache reset of a specific Amazon Lightsail content delivery network (CDN) distribution.
    */
  def getDistributionLatestCacheReset(params: GetDistributionLatestCacheResetRequest): Request[GetDistributionLatestCacheResetResult, AWSError] = js.native
  def getDistributionLatestCacheReset(
    params: GetDistributionLatestCacheResetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDistributionLatestCacheResetResult, Unit]
  ): Request[GetDistributionLatestCacheResetResult, AWSError] = js.native
  
  /**
    * Returns the data points of a specific metric for an Amazon Lightsail content delivery network (CDN) distribution. Metrics report the utilization of your resources, and the error counts generated by them. Monitor and collect metric data regularly to maintain the reliability, availability, and performance of your resources.
    */
  def getDistributionMetricData(): Request[GetDistributionMetricDataResult, AWSError] = js.native
  def getDistributionMetricData(callback: js.Function2[/* err */ AWSError, /* data */ GetDistributionMetricDataResult, Unit]): Request[GetDistributionMetricDataResult, AWSError] = js.native
  /**
    * Returns the data points of a specific metric for an Amazon Lightsail content delivery network (CDN) distribution. Metrics report the utilization of your resources, and the error counts generated by them. Monitor and collect metric data regularly to maintain the reliability, availability, and performance of your resources.
    */
  def getDistributionMetricData(params: GetDistributionMetricDataRequest): Request[GetDistributionMetricDataResult, AWSError] = js.native
  def getDistributionMetricData(
    params: GetDistributionMetricDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDistributionMetricDataResult, Unit]
  ): Request[GetDistributionMetricDataResult, AWSError] = js.native
  
  /**
    * Returns information about one or more of your Amazon Lightsail content delivery network (CDN) distributions.
    */
  def getDistributions(): Request[GetDistributionsResult, AWSError] = js.native
  def getDistributions(callback: js.Function2[/* err */ AWSError, /* data */ GetDistributionsResult, Unit]): Request[GetDistributionsResult, AWSError] = js.native
  /**
    * Returns information about one or more of your Amazon Lightsail content delivery network (CDN) distributions.
    */
  def getDistributions(params: GetDistributionsRequest): Request[GetDistributionsResult, AWSError] = js.native
  def getDistributions(
    params: GetDistributionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDistributionsResult, Unit]
  ): Request[GetDistributionsResult, AWSError] = js.native
  
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
    * Returns all export snapshot records created as a result of the export snapshot operation. An export snapshot record can be used to create a new Amazon EC2 instance and its related resources with the CreateCloudFormationStack action.
    */
  def getExportSnapshotRecords(): Request[GetExportSnapshotRecordsResult, AWSError] = js.native
  def getExportSnapshotRecords(callback: js.Function2[/* err */ AWSError, /* data */ GetExportSnapshotRecordsResult, Unit]): Request[GetExportSnapshotRecordsResult, AWSError] = js.native
  /**
    * Returns all export snapshot records created as a result of the export snapshot operation. An export snapshot record can be used to create a new Amazon EC2 instance and its related resources with the CreateCloudFormationStack action.
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
    * Returns temporary SSH keys you can use to connect to a specific virtual private server, or instance. The get instance access details operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def getInstanceAccessDetails(): Request[GetInstanceAccessDetailsResult, AWSError] = js.native
  def getInstanceAccessDetails(callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceAccessDetailsResult, Unit]): Request[GetInstanceAccessDetailsResult, AWSError] = js.native
  /**
    * Returns temporary SSH keys you can use to connect to a specific virtual private server, or instance. The get instance access details operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def getInstanceAccessDetails(params: GetInstanceAccessDetailsRequest): Request[GetInstanceAccessDetailsResult, AWSError] = js.native
  def getInstanceAccessDetails(
    params: GetInstanceAccessDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceAccessDetailsResult, Unit]
  ): Request[GetInstanceAccessDetailsResult, AWSError] = js.native
  
  /**
    * Returns the data points for the specified Amazon Lightsail instance metric, given an instance name. Metrics report the utilization of your resources, and the error counts generated by them. Monitor and collect metric data regularly to maintain the reliability, availability, and performance of your resources.
    */
  def getInstanceMetricData(): Request[GetInstanceMetricDataResult, AWSError] = js.native
  def getInstanceMetricData(callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceMetricDataResult, Unit]): Request[GetInstanceMetricDataResult, AWSError] = js.native
  /**
    * Returns the data points for the specified Amazon Lightsail instance metric, given an instance name. Metrics report the utilization of your resources, and the error counts generated by them. Monitor and collect metric data regularly to maintain the reliability, availability, and performance of your resources.
    */
  def getInstanceMetricData(params: GetInstanceMetricDataRequest): Request[GetInstanceMetricDataResult, AWSError] = js.native
  def getInstanceMetricData(
    params: GetInstanceMetricDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceMetricDataResult, Unit]
  ): Request[GetInstanceMetricDataResult, AWSError] = js.native
  
  /**
    * Returns the firewall port states for a specific Amazon Lightsail instance, the IP addresses allowed to connect to the instance through the ports, and the protocol.
    */
  def getInstancePortStates(): Request[GetInstancePortStatesResult, AWSError] = js.native
  def getInstancePortStates(callback: js.Function2[/* err */ AWSError, /* data */ GetInstancePortStatesResult, Unit]): Request[GetInstancePortStatesResult, AWSError] = js.native
  /**
    * Returns the firewall port states for a specific Amazon Lightsail instance, the IP addresses allowed to connect to the instance through the ports, and the protocol.
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
    * Returns information about health metrics for your Lightsail load balancer. Metrics report the utilization of your resources, and the error counts generated by them. Monitor and collect metric data regularly to maintain the reliability, availability, and performance of your resources.
    */
  def getLoadBalancerMetricData(): Request[GetLoadBalancerMetricDataResult, AWSError] = js.native
  def getLoadBalancerMetricData(callback: js.Function2[/* err */ AWSError, /* data */ GetLoadBalancerMetricDataResult, Unit]): Request[GetLoadBalancerMetricDataResult, AWSError] = js.native
  /**
    * Returns information about health metrics for your Lightsail load balancer. Metrics report the utilization of your resources, and the error counts generated by them. Monitor and collect metric data regularly to maintain the reliability, availability, and performance of your resources.
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
    * Returns a list of TLS security policies that you can apply to Lightsail load balancers. For more information about load balancer TLS security policies, see Configuring TLS security policies on your Amazon Lightsail load balancers in the Amazon Lightsail Developer Guide.
    */
  def getLoadBalancerTlsPolicies(): Request[GetLoadBalancerTlsPoliciesResult, AWSError] = js.native
  def getLoadBalancerTlsPolicies(callback: js.Function2[/* err */ AWSError, /* data */ GetLoadBalancerTlsPoliciesResult, Unit]): Request[GetLoadBalancerTlsPoliciesResult, AWSError] = js.native
  /**
    * Returns a list of TLS security policies that you can apply to Lightsail load balancers. For more information about load balancer TLS security policies, see Configuring TLS security policies on your Amazon Lightsail load balancers in the Amazon Lightsail Developer Guide.
    */
  def getLoadBalancerTlsPolicies(params: GetLoadBalancerTlsPoliciesRequest): Request[GetLoadBalancerTlsPoliciesResult, AWSError] = js.native
  def getLoadBalancerTlsPolicies(
    params: GetLoadBalancerTlsPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLoadBalancerTlsPoliciesResult, Unit]
  ): Request[GetLoadBalancerTlsPoliciesResult, AWSError] = js.native
  
  /**
    * Returns information about all load balancers in an account.
    */
  def getLoadBalancers(): Request[GetLoadBalancersResult, AWSError] = js.native
  def getLoadBalancers(callback: js.Function2[/* err */ AWSError, /* data */ GetLoadBalancersResult, Unit]): Request[GetLoadBalancersResult, AWSError] = js.native
  /**
    * Returns information about all load balancers in an account.
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
    * Returns the data points of the specified metric for a database in Amazon Lightsail. Metrics report the utilization of your resources, and the error counts generated by them. Monitor and collect metric data regularly to maintain the reliability, availability, and performance of your resources.
    */
  def getRelationalDatabaseMetricData(): Request[GetRelationalDatabaseMetricDataResult, AWSError] = js.native
  def getRelationalDatabaseMetricData(callback: js.Function2[/* err */ AWSError, /* data */ GetRelationalDatabaseMetricDataResult, Unit]): Request[GetRelationalDatabaseMetricDataResult, AWSError] = js.native
  /**
    * Returns the data points of the specified metric for a database in Amazon Lightsail. Metrics report the utilization of your resources, and the error counts generated by them. Monitor and collect metric data regularly to maintain the reliability, availability, and performance of your resources.
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
    * Returns information about an Amazon Lightsail static IP.
    */
  def getStaticIp(): Request[GetStaticIpResult, AWSError] = js.native
  def getStaticIp(callback: js.Function2[/* err */ AWSError, /* data */ GetStaticIpResult, Unit]): Request[GetStaticIpResult, AWSError] = js.native
  /**
    * Returns information about an Amazon Lightsail static IP.
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
    * Opens ports for a specific Amazon Lightsail instance, and specifies the IP addresses allowed to connect to the instance through the ports, and the protocol. The OpenInstancePublicPorts action supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def openInstancePublicPorts(): Request[OpenInstancePublicPortsResult, AWSError] = js.native
  def openInstancePublicPorts(callback: js.Function2[/* err */ AWSError, /* data */ OpenInstancePublicPortsResult, Unit]): Request[OpenInstancePublicPortsResult, AWSError] = js.native
  /**
    * Opens ports for a specific Amazon Lightsail instance, and specifies the IP addresses allowed to connect to the instance through the ports, and the protocol. The OpenInstancePublicPorts action supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def openInstancePublicPorts(params: OpenInstancePublicPortsRequest): Request[OpenInstancePublicPortsResult, AWSError] = js.native
  def openInstancePublicPorts(
    params: OpenInstancePublicPortsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ OpenInstancePublicPortsResult, Unit]
  ): Request[OpenInstancePublicPortsResult, AWSError] = js.native
  
  /**
    * Peers the Lightsail VPC with the user's default VPC.
    */
  def peerVpc(): Request[PeerVpcResult, AWSError] = js.native
  def peerVpc(callback: js.Function2[/* err */ AWSError, /* data */ PeerVpcResult, Unit]): Request[PeerVpcResult, AWSError] = js.native
  /**
    * Peers the Lightsail VPC with the user's default VPC.
    */
  def peerVpc(params: PeerVpcRequest): Request[PeerVpcResult, AWSError] = js.native
  def peerVpc(params: PeerVpcRequest, callback: js.Function2[/* err */ AWSError, /* data */ PeerVpcResult, Unit]): Request[PeerVpcResult, AWSError] = js.native
  
  /**
    * Creates or updates an alarm, and associates it with the specified metric. An alarm is used to monitor a single metric for one of your resources. When a metric condition is met, the alarm can notify you by email, SMS text message, and a banner displayed on the Amazon Lightsail console. For more information, see Alarms in Amazon Lightsail. When this action creates an alarm, the alarm state is immediately set to INSUFFICIENT_DATA. The alarm is then evaluated and its state is set appropriately. Any actions associated with the new state are then executed. When you update an existing alarm, its state is left unchanged, but the update completely overwrites the previous configuration of the alarm. The alarm is then evaluated with the updated configuration.
    */
  def putAlarm(): Request[PutAlarmResult, AWSError] = js.native
  def putAlarm(callback: js.Function2[/* err */ AWSError, /* data */ PutAlarmResult, Unit]): Request[PutAlarmResult, AWSError] = js.native
  /**
    * Creates or updates an alarm, and associates it with the specified metric. An alarm is used to monitor a single metric for one of your resources. When a metric condition is met, the alarm can notify you by email, SMS text message, and a banner displayed on the Amazon Lightsail console. For more information, see Alarms in Amazon Lightsail. When this action creates an alarm, the alarm state is immediately set to INSUFFICIENT_DATA. The alarm is then evaluated and its state is set appropriately. Any actions associated with the new state are then executed. When you update an existing alarm, its state is left unchanged, but the update completely overwrites the previous configuration of the alarm. The alarm is then evaluated with the updated configuration.
    */
  def putAlarm(params: PutAlarmRequest): Request[PutAlarmResult, AWSError] = js.native
  def putAlarm(
    params: PutAlarmRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAlarmResult, Unit]
  ): Request[PutAlarmResult, AWSError] = js.native
  
  /**
    * Opens ports for a specific Amazon Lightsail instance, and specifies the IP addresses allowed to connect to the instance through the ports, and the protocol. This action also closes all currently open ports that are not included in the request. Include all of the ports and the protocols you want to open in your PutInstancePublicPortsrequest. Or use the OpenInstancePublicPorts action to open ports without closing currently open ports. The PutInstancePublicPorts action supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def putInstancePublicPorts(): Request[PutInstancePublicPortsResult, AWSError] = js.native
  def putInstancePublicPorts(callback: js.Function2[/* err */ AWSError, /* data */ PutInstancePublicPortsResult, Unit]): Request[PutInstancePublicPortsResult, AWSError] = js.native
  /**
    * Opens ports for a specific Amazon Lightsail instance, and specifies the IP addresses allowed to connect to the instance through the ports, and the protocol. This action also closes all currently open ports that are not included in the request. Include all of the ports and the protocols you want to open in your PutInstancePublicPortsrequest. Or use the OpenInstancePublicPorts action to open ports without closing currently open ports. The PutInstancePublicPorts action supports tag-based access control via resource tags applied to the resource identified by instanceName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def putInstancePublicPorts(params: PutInstancePublicPortsRequest): Request[PutInstancePublicPortsResult, AWSError] = js.native
  def putInstancePublicPorts(
    params: PutInstancePublicPortsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutInstancePublicPortsResult, Unit]
  ): Request[PutInstancePublicPortsResult, AWSError] = js.native
  
  /**
    * Restarts a specific instance. The reboot instance operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def rebootInstance(): Request[RebootInstanceResult, AWSError] = js.native
  def rebootInstance(callback: js.Function2[/* err */ AWSError, /* data */ RebootInstanceResult, Unit]): Request[RebootInstanceResult, AWSError] = js.native
  /**
    * Restarts a specific instance. The reboot instance operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def rebootInstance(params: RebootInstanceRequest): Request[RebootInstanceResult, AWSError] = js.native
  def rebootInstance(
    params: RebootInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RebootInstanceResult, Unit]
  ): Request[RebootInstanceResult, AWSError] = js.native
  
  /**
    * Restarts a specific database in Amazon Lightsail. The reboot relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def rebootRelationalDatabase(): Request[RebootRelationalDatabaseResult, AWSError] = js.native
  def rebootRelationalDatabase(callback: js.Function2[/* err */ AWSError, /* data */ RebootRelationalDatabaseResult, Unit]): Request[RebootRelationalDatabaseResult, AWSError] = js.native
  /**
    * Restarts a specific database in Amazon Lightsail. The reboot relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def rebootRelationalDatabase(params: RebootRelationalDatabaseRequest): Request[RebootRelationalDatabaseResult, AWSError] = js.native
  def rebootRelationalDatabase(
    params: RebootRelationalDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RebootRelationalDatabaseResult, Unit]
  ): Request[RebootRelationalDatabaseResult, AWSError] = js.native
  
  /**
    * Registers a container image to your Amazon Lightsail container service.  This action is not required if you install and use the Lightsail Control (lightsailctl) plugin to push container images to your Lightsail container service. For more information, see Pushing and managing container images on your Amazon Lightsail container services in the Amazon Lightsail Developer Guide. 
    */
  def registerContainerImage(): Request[RegisterContainerImageResult, AWSError] = js.native
  def registerContainerImage(callback: js.Function2[/* err */ AWSError, /* data */ RegisterContainerImageResult, Unit]): Request[RegisterContainerImageResult, AWSError] = js.native
  /**
    * Registers a container image to your Amazon Lightsail container service.  This action is not required if you install and use the Lightsail Control (lightsailctl) plugin to push container images to your Lightsail container service. For more information, see Pushing and managing container images on your Amazon Lightsail container services in the Amazon Lightsail Developer Guide. 
    */
  def registerContainerImage(params: RegisterContainerImageRequest): Request[RegisterContainerImageResult, AWSError] = js.native
  def registerContainerImage(
    params: RegisterContainerImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterContainerImageResult, Unit]
  ): Request[RegisterContainerImageResult, AWSError] = js.native
  
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
    * Deletes currently cached content from your Amazon Lightsail content delivery network (CDN) distribution. After resetting the cache, the next time a content request is made, your distribution pulls, serves, and caches it from the origin.
    */
  def resetDistributionCache(): Request[ResetDistributionCacheResult, AWSError] = js.native
  def resetDistributionCache(callback: js.Function2[/* err */ AWSError, /* data */ ResetDistributionCacheResult, Unit]): Request[ResetDistributionCacheResult, AWSError] = js.native
  /**
    * Deletes currently cached content from your Amazon Lightsail content delivery network (CDN) distribution. After resetting the cache, the next time a content request is made, your distribution pulls, serves, and caches it from the origin.
    */
  def resetDistributionCache(params: ResetDistributionCacheRequest): Request[ResetDistributionCacheResult, AWSError] = js.native
  def resetDistributionCache(
    params: ResetDistributionCacheRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResetDistributionCacheResult, Unit]
  ): Request[ResetDistributionCacheResult, AWSError] = js.native
  
  /**
    * Sends a verification request to an email contact method to ensure it's owned by the requester. SMS contact methods don't need to be verified. A contact method is used to send you notifications about your Amazon Lightsail resources. You can add one email address and one mobile phone number contact method in each Amazon Web Services Region. However, SMS text messaging is not supported in some Amazon Web Services Regions, and SMS text messages cannot be sent to some countries/regions. For more information, see Notifications in Amazon Lightsail. A verification request is sent to the contact method when you initially create it. Use this action to send another verification request if a previous verification request was deleted, or has expired.  Notifications are not sent to an email contact method until after it is verified, and confirmed as valid. 
    */
  def sendContactMethodVerification(): Request[SendContactMethodVerificationResult, AWSError] = js.native
  def sendContactMethodVerification(callback: js.Function2[/* err */ AWSError, /* data */ SendContactMethodVerificationResult, Unit]): Request[SendContactMethodVerificationResult, AWSError] = js.native
  /**
    * Sends a verification request to an email contact method to ensure it's owned by the requester. SMS contact methods don't need to be verified. A contact method is used to send you notifications about your Amazon Lightsail resources. You can add one email address and one mobile phone number contact method in each Amazon Web Services Region. However, SMS text messaging is not supported in some Amazon Web Services Regions, and SMS text messages cannot be sent to some countries/regions. For more information, see Notifications in Amazon Lightsail. A verification request is sent to the contact method when you initially create it. Use this action to send another verification request if a previous verification request was deleted, or has expired.  Notifications are not sent to an email contact method until after it is verified, and confirmed as valid. 
    */
  def sendContactMethodVerification(params: SendContactMethodVerificationRequest): Request[SendContactMethodVerificationResult, AWSError] = js.native
  def sendContactMethodVerification(
    params: SendContactMethodVerificationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendContactMethodVerificationResult, Unit]
  ): Request[SendContactMethodVerificationResult, AWSError] = js.native
  
  /**
    * Sets the IP address type for an Amazon Lightsail resource. Use this action to enable dual-stack for a resource, which enables IPv4 and IPv6 for the specified resource. Alternately, you can use this action to disable dual-stack, and enable IPv4 only.
    */
  def setIpAddressType(): Request[SetIpAddressTypeResult, AWSError] = js.native
  def setIpAddressType(callback: js.Function2[/* err */ AWSError, /* data */ SetIpAddressTypeResult, Unit]): Request[SetIpAddressTypeResult, AWSError] = js.native
  /**
    * Sets the IP address type for an Amazon Lightsail resource. Use this action to enable dual-stack for a resource, which enables IPv4 and IPv6 for the specified resource. Alternately, you can use this action to disable dual-stack, and enable IPv4 only.
    */
  def setIpAddressType(params: SetIpAddressTypeRequest): Request[SetIpAddressTypeResult, AWSError] = js.native
  def setIpAddressType(
    params: SetIpAddressTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetIpAddressTypeResult, Unit]
  ): Request[SetIpAddressTypeResult, AWSError] = js.native
  
  /**
    * Sets the Amazon Lightsail resources that can access the specified Lightsail bucket. Lightsail buckets currently support setting access for Lightsail instances in the same Amazon Web Services Region.
    */
  def setResourceAccessForBucket(): Request[SetResourceAccessForBucketResult, AWSError] = js.native
  def setResourceAccessForBucket(callback: js.Function2[/* err */ AWSError, /* data */ SetResourceAccessForBucketResult, Unit]): Request[SetResourceAccessForBucketResult, AWSError] = js.native
  /**
    * Sets the Amazon Lightsail resources that can access the specified Lightsail bucket. Lightsail buckets currently support setting access for Lightsail instances in the same Amazon Web Services Region.
    */
  def setResourceAccessForBucket(params: SetResourceAccessForBucketRequest): Request[SetResourceAccessForBucketResult, AWSError] = js.native
  def setResourceAccessForBucket(
    params: SetResourceAccessForBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetResourceAccessForBucketResult, Unit]
  ): Request[SetResourceAccessForBucketResult, AWSError] = js.native
  
  /**
    * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the reboot instance operation.  When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP address after stopping and starting an instance, create a static IP address and attach it to the instance. For more information, see the Amazon Lightsail Developer Guide.  The start instance operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def startInstance(): Request[StartInstanceResult, AWSError] = js.native
  def startInstance(callback: js.Function2[/* err */ AWSError, /* data */ StartInstanceResult, Unit]): Request[StartInstanceResult, AWSError] = js.native
  /**
    * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the reboot instance operation.  When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP address after stopping and starting an instance, create a static IP address and attach it to the instance. For more information, see the Amazon Lightsail Developer Guide.  The start instance operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def startInstance(params: StartInstanceRequest): Request[StartInstanceResult, AWSError] = js.native
  def startInstance(
    params: StartInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartInstanceResult, Unit]
  ): Request[StartInstanceResult, AWSError] = js.native
  
  /**
    * Starts a specific database from a stopped state in Amazon Lightsail. To restart a database, use the reboot relational database operation. The start relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def startRelationalDatabase(): Request[StartRelationalDatabaseResult, AWSError] = js.native
  def startRelationalDatabase(callback: js.Function2[/* err */ AWSError, /* data */ StartRelationalDatabaseResult, Unit]): Request[StartRelationalDatabaseResult, AWSError] = js.native
  /**
    * Starts a specific database from a stopped state in Amazon Lightsail. To restart a database, use the reboot relational database operation. The start relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def startRelationalDatabase(params: StartRelationalDatabaseRequest): Request[StartRelationalDatabaseResult, AWSError] = js.native
  def startRelationalDatabase(
    params: StartRelationalDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartRelationalDatabaseResult, Unit]
  ): Request[StartRelationalDatabaseResult, AWSError] = js.native
  
  /**
    * Stops a specific Amazon Lightsail instance that is currently running.  When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP address after stopping and starting an instance, create a static IP address and attach it to the instance. For more information, see the Amazon Lightsail Developer Guide.  The stop instance operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def stopInstance(): Request[StopInstanceResult, AWSError] = js.native
  def stopInstance(callback: js.Function2[/* err */ AWSError, /* data */ StopInstanceResult, Unit]): Request[StopInstanceResult, AWSError] = js.native
  /**
    * Stops a specific Amazon Lightsail instance that is currently running.  When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP address after stopping and starting an instance, create a static IP address and attach it to the instance. For more information, see the Amazon Lightsail Developer Guide.  The stop instance operation supports tag-based access control via resource tags applied to the resource identified by instance name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def stopInstance(params: StopInstanceRequest): Request[StopInstanceResult, AWSError] = js.native
  def stopInstance(
    params: StopInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopInstanceResult, Unit]
  ): Request[StopInstanceResult, AWSError] = js.native
  
  /**
    * Stops a specific database that is currently running in Amazon Lightsail. The stop relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def stopRelationalDatabase(): Request[StopRelationalDatabaseResult, AWSError] = js.native
  def stopRelationalDatabase(callback: js.Function2[/* err */ AWSError, /* data */ StopRelationalDatabaseResult, Unit]): Request[StopRelationalDatabaseResult, AWSError] = js.native
  /**
    * Stops a specific database that is currently running in Amazon Lightsail. The stop relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def stopRelationalDatabase(params: StopRelationalDatabaseRequest): Request[StopRelationalDatabaseResult, AWSError] = js.native
  def stopRelationalDatabase(
    params: StopRelationalDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopRelationalDatabaseResult, Unit]
  ): Request[StopRelationalDatabaseResult, AWSError] = js.native
  
  /**
    * Adds one or more tags to the specified Amazon Lightsail resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see the Amazon Lightsail Developer Guide. The tag resource operation supports tag-based access control via request tags and resource tags applied to the resource identified by resource name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def tagResource(): Request[TagResourceResult, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]): Request[TagResourceResult, AWSError] = js.native
  /**
    * Adds one or more tags to the specified Amazon Lightsail resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see the Amazon Lightsail Developer Guide. The tag resource operation supports tag-based access control via request tags and resource tags applied to the resource identified by resource name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResult, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]
  ): Request[TagResourceResult, AWSError] = js.native
  
  /**
    * Tests an alarm by displaying a banner on the Amazon Lightsail console. If a notification trigger is configured for the specified alarm, the test also sends a notification to the notification protocol (Email and/or SMS) configured for the alarm. An alarm is used to monitor a single metric for one of your resources. When a metric condition is met, the alarm can notify you by email, SMS text message, and a banner displayed on the Amazon Lightsail console. For more information, see Alarms in Amazon Lightsail.
    */
  def testAlarm(): Request[TestAlarmResult, AWSError] = js.native
  def testAlarm(callback: js.Function2[/* err */ AWSError, /* data */ TestAlarmResult, Unit]): Request[TestAlarmResult, AWSError] = js.native
  /**
    * Tests an alarm by displaying a banner on the Amazon Lightsail console. If a notification trigger is configured for the specified alarm, the test also sends a notification to the notification protocol (Email and/or SMS) configured for the alarm. An alarm is used to monitor a single metric for one of your resources. When a metric condition is met, the alarm can notify you by email, SMS text message, and a banner displayed on the Amazon Lightsail console. For more information, see Alarms in Amazon Lightsail.
    */
  def testAlarm(params: TestAlarmRequest): Request[TestAlarmResult, AWSError] = js.native
  def testAlarm(
    params: TestAlarmRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TestAlarmResult, Unit]
  ): Request[TestAlarmResult, AWSError] = js.native
  
  /**
    * Unpeers the Lightsail VPC from the user's default VPC.
    */
  def unpeerVpc(): Request[UnpeerVpcResult, AWSError] = js.native
  def unpeerVpc(callback: js.Function2[/* err */ AWSError, /* data */ UnpeerVpcResult, Unit]): Request[UnpeerVpcResult, AWSError] = js.native
  /**
    * Unpeers the Lightsail VPC from the user's default VPC.
    */
  def unpeerVpc(params: UnpeerVpcRequest): Request[UnpeerVpcResult, AWSError] = js.native
  def unpeerVpc(
    params: UnpeerVpcRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UnpeerVpcResult, Unit]
  ): Request[UnpeerVpcResult, AWSError] = js.native
  
  /**
    * Deletes the specified set of tag keys and their values from the specified Amazon Lightsail resource. The untag resource operation supports tag-based access control via request tags and resource tags applied to the resource identified by resource name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def untagResource(): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]): Request[UntagResourceResult, AWSError] = js.native
  /**
    * Deletes the specified set of tag keys and their values from the specified Amazon Lightsail resource. The untag resource operation supports tag-based access control via request tags and resource tags applied to the resource identified by resource name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]
  ): Request[UntagResourceResult, AWSError] = js.native
  
  /**
    * Updates an existing Amazon Lightsail bucket. Use this action to update the configuration of an existing bucket, such as versioning, public accessibility, and the Amazon Web Services accounts that can access the bucket.
    */
  def updateBucket(): Request[UpdateBucketResult, AWSError] = js.native
  def updateBucket(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBucketResult, Unit]): Request[UpdateBucketResult, AWSError] = js.native
  /**
    * Updates an existing Amazon Lightsail bucket. Use this action to update the configuration of an existing bucket, such as versioning, public accessibility, and the Amazon Web Services accounts that can access the bucket.
    */
  def updateBucket(params: UpdateBucketRequest): Request[UpdateBucketResult, AWSError] = js.native
  def updateBucket(
    params: UpdateBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBucketResult, Unit]
  ): Request[UpdateBucketResult, AWSError] = js.native
  
  /**
    * Updates the bundle, or storage plan, of an existing Amazon Lightsail bucket. A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket. You can update a bucket's bundle only one time within a monthly AWS billing cycle. To determine if you can update a bucket's bundle, use the GetBuckets action. The ableToUpdateBundle parameter in the response will indicate whether you can currently update a bucket's bundle. Update a bucket's bundle if it's consistently going over its storage space or data transfer quota, or if a bucket's usage is consistently in the lower range of its storage space or data transfer quota. Due to the unpredictable usage fluctuations that a bucket might experience, we strongly recommend that you update a bucket's bundle only as a long-term strategy, instead of as a short-term, monthly cost-cutting measure. Choose a bucket bundle that will provide the bucket with ample storage space and data transfer for a long time to come.
    */
  def updateBucketBundle(): Request[UpdateBucketBundleResult, AWSError] = js.native
  def updateBucketBundle(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBucketBundleResult, Unit]): Request[UpdateBucketBundleResult, AWSError] = js.native
  /**
    * Updates the bundle, or storage plan, of an existing Amazon Lightsail bucket. A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket. You can update a bucket's bundle only one time within a monthly AWS billing cycle. To determine if you can update a bucket's bundle, use the GetBuckets action. The ableToUpdateBundle parameter in the response will indicate whether you can currently update a bucket's bundle. Update a bucket's bundle if it's consistently going over its storage space or data transfer quota, or if a bucket's usage is consistently in the lower range of its storage space or data transfer quota. Due to the unpredictable usage fluctuations that a bucket might experience, we strongly recommend that you update a bucket's bundle only as a long-term strategy, instead of as a short-term, monthly cost-cutting measure. Choose a bucket bundle that will provide the bucket with ample storage space and data transfer for a long time to come.
    */
  def updateBucketBundle(params: UpdateBucketBundleRequest): Request[UpdateBucketBundleResult, AWSError] = js.native
  def updateBucketBundle(
    params: UpdateBucketBundleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBucketBundleResult, Unit]
  ): Request[UpdateBucketBundleResult, AWSError] = js.native
  
  /**
    * Updates the configuration of your Amazon Lightsail container service, such as its power, scale, and public domain names.
    */
  def updateContainerService(): Request[UpdateContainerServiceResult, AWSError] = js.native
  def updateContainerService(callback: js.Function2[/* err */ AWSError, /* data */ UpdateContainerServiceResult, Unit]): Request[UpdateContainerServiceResult, AWSError] = js.native
  /**
    * Updates the configuration of your Amazon Lightsail container service, such as its power, scale, and public domain names.
    */
  def updateContainerService(params: UpdateContainerServiceRequest): Request[UpdateContainerServiceResult, AWSError] = js.native
  def updateContainerService(
    params: UpdateContainerServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContainerServiceResult, Unit]
  ): Request[UpdateContainerServiceResult, AWSError] = js.native
  
  /**
    * Updates an existing Amazon Lightsail content delivery network (CDN) distribution. Use this action to update the configuration of your existing distribution.
    */
  def updateDistribution(): Request[UpdateDistributionResult, AWSError] = js.native
  def updateDistribution(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDistributionResult, Unit]): Request[UpdateDistributionResult, AWSError] = js.native
  /**
    * Updates an existing Amazon Lightsail content delivery network (CDN) distribution. Use this action to update the configuration of your existing distribution.
    */
  def updateDistribution(params: UpdateDistributionRequest): Request[UpdateDistributionResult, AWSError] = js.native
  def updateDistribution(
    params: UpdateDistributionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDistributionResult, Unit]
  ): Request[UpdateDistributionResult, AWSError] = js.native
  
  /**
    * Updates the bundle of your Amazon Lightsail content delivery network (CDN) distribution. A distribution bundle specifies the monthly network transfer quota and monthly cost of your distribution. Update your distribution's bundle if your distribution is going over its monthly network transfer quota and is incurring an overage fee. You can update your distribution's bundle only one time within your monthly AWS billing cycle. To determine if you can update your distribution's bundle, use the GetDistributions action. The ableToUpdateBundle parameter in the result will indicate whether you can currently update your distribution's bundle.
    */
  def updateDistributionBundle(): Request[UpdateDistributionBundleResult, AWSError] = js.native
  def updateDistributionBundle(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDistributionBundleResult, Unit]): Request[UpdateDistributionBundleResult, AWSError] = js.native
  /**
    * Updates the bundle of your Amazon Lightsail content delivery network (CDN) distribution. A distribution bundle specifies the monthly network transfer quota and monthly cost of your distribution. Update your distribution's bundle if your distribution is going over its monthly network transfer quota and is incurring an overage fee. You can update your distribution's bundle only one time within your monthly AWS billing cycle. To determine if you can update your distribution's bundle, use the GetDistributions action. The ableToUpdateBundle parameter in the result will indicate whether you can currently update your distribution's bundle.
    */
  def updateDistributionBundle(params: UpdateDistributionBundleRequest): Request[UpdateDistributionBundleResult, AWSError] = js.native
  def updateDistributionBundle(
    params: UpdateDistributionBundleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDistributionBundleResult, Unit]
  ): Request[UpdateDistributionBundleResult, AWSError] = js.native
  
  /**
    * Updates a domain recordset after it is created. The update domain entry operation supports tag-based access control via resource tags applied to the resource identified by domain name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def updateDomainEntry(): Request[UpdateDomainEntryResult, AWSError] = js.native
  def updateDomainEntry(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainEntryResult, Unit]): Request[UpdateDomainEntryResult, AWSError] = js.native
  /**
    * Updates a domain recordset after it is created. The update domain entry operation supports tag-based access control via resource tags applied to the resource identified by domain name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def updateDomainEntry(params: UpdateDomainEntryRequest): Request[UpdateDomainEntryResult, AWSError] = js.native
  def updateDomainEntry(
    params: UpdateDomainEntryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainEntryResult, Unit]
  ): Request[UpdateDomainEntryResult, AWSError] = js.native
  
  /**
    * Modifies the Amazon Lightsail instance metadata parameters on a running or stopped instance. When you modify the parameters on a running instance, the GetInstance or GetInstances API operation initially responds with a state of pending. After the parameter modifications are successfully applied, the state changes to applied in subsequent GetInstance or GetInstances API calls. For more information, see Use IMDSv2 with an Amazon Lightsail instance in the Amazon Lightsail Developer Guide.
    */
  def updateInstanceMetadataOptions(): Request[UpdateInstanceMetadataOptionsResult, AWSError] = js.native
  def updateInstanceMetadataOptions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateInstanceMetadataOptionsResult, Unit]): Request[UpdateInstanceMetadataOptionsResult, AWSError] = js.native
  /**
    * Modifies the Amazon Lightsail instance metadata parameters on a running or stopped instance. When you modify the parameters on a running instance, the GetInstance or GetInstances API operation initially responds with a state of pending. After the parameter modifications are successfully applied, the state changes to applied in subsequent GetInstance or GetInstances API calls. For more information, see Use IMDSv2 with an Amazon Lightsail instance in the Amazon Lightsail Developer Guide.
    */
  def updateInstanceMetadataOptions(params: UpdateInstanceMetadataOptionsRequest): Request[UpdateInstanceMetadataOptionsResult, AWSError] = js.native
  def updateInstanceMetadataOptions(
    params: UpdateInstanceMetadataOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateInstanceMetadataOptionsResult, Unit]
  ): Request[UpdateInstanceMetadataOptionsResult, AWSError] = js.native
  
  /**
    * Updates the specified attribute for a load balancer. You can only update one attribute at a time. The update load balancer attribute operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def updateLoadBalancerAttribute(): Request[UpdateLoadBalancerAttributeResult, AWSError] = js.native
  def updateLoadBalancerAttribute(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLoadBalancerAttributeResult, Unit]): Request[UpdateLoadBalancerAttributeResult, AWSError] = js.native
  /**
    * Updates the specified attribute for a load balancer. You can only update one attribute at a time. The update load balancer attribute operation supports tag-based access control via resource tags applied to the resource identified by load balancer name. For more information, see the Amazon Lightsail Developer Guide.
    */
  def updateLoadBalancerAttribute(params: UpdateLoadBalancerAttributeRequest): Request[UpdateLoadBalancerAttributeResult, AWSError] = js.native
  def updateLoadBalancerAttribute(
    params: UpdateLoadBalancerAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLoadBalancerAttributeResult, Unit]
  ): Request[UpdateLoadBalancerAttributeResult, AWSError] = js.native
  
  /**
    * Allows the update of one or more attributes of a database in Amazon Lightsail. Updates are applied immediately, or in cases where the updates could result in an outage, are applied during the database's predefined maintenance window. The update relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def updateRelationalDatabase(): Request[UpdateRelationalDatabaseResult, AWSError] = js.native
  def updateRelationalDatabase(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRelationalDatabaseResult, Unit]): Request[UpdateRelationalDatabaseResult, AWSError] = js.native
  /**
    * Allows the update of one or more attributes of a database in Amazon Lightsail. Updates are applied immediately, or in cases where the updates could result in an outage, are applied during the database's predefined maintenance window. The update relational database operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def updateRelationalDatabase(params: UpdateRelationalDatabaseRequest): Request[UpdateRelationalDatabaseResult, AWSError] = js.native
  def updateRelationalDatabase(
    params: UpdateRelationalDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRelationalDatabaseResult, Unit]
  ): Request[UpdateRelationalDatabaseResult, AWSError] = js.native
  
  /**
    * Allows the update of one or more parameters of a database in Amazon Lightsail. Parameter updates don't cause outages; therefore, their application is not subject to the preferred maintenance window. However, there are two ways in which parameter updates are applied: dynamic or pending-reboot. Parameters marked with a dynamic apply type are applied immediately. Parameters marked with a pending-reboot apply type are applied only after the database is rebooted using the reboot relational database operation. The update relational database parameters operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def updateRelationalDatabaseParameters(): Request[UpdateRelationalDatabaseParametersResult, AWSError] = js.native
  def updateRelationalDatabaseParameters(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRelationalDatabaseParametersResult, Unit]
  ): Request[UpdateRelationalDatabaseParametersResult, AWSError] = js.native
  /**
    * Allows the update of one or more parameters of a database in Amazon Lightsail. Parameter updates don't cause outages; therefore, their application is not subject to the preferred maintenance window. However, there are two ways in which parameter updates are applied: dynamic or pending-reboot. Parameters marked with a dynamic apply type are applied immediately. Parameters marked with a pending-reboot apply type are applied only after the database is rebooted using the reboot relational database operation. The update relational database parameters operation supports tag-based access control via resource tags applied to the resource identified by relationalDatabaseName. For more information, see the Amazon Lightsail Developer Guide.
    */
  def updateRelationalDatabaseParameters(params: UpdateRelationalDatabaseParametersRequest): Request[UpdateRelationalDatabaseParametersResult, AWSError] = js.native
  def updateRelationalDatabaseParameters(
    params: UpdateRelationalDatabaseParametersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRelationalDatabaseParametersResult, Unit]
  ): Request[UpdateRelationalDatabaseParametersResult, AWSError] = js.native
}
