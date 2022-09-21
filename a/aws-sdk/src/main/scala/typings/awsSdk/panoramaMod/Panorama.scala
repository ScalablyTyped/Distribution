package typings.awsSdk.panoramaMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Panorama extends Service {
  
  @JSName("config")
  var config_Panorama: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an application instance and deploys it to a device.
    */
  def createApplicationInstance(): Request[CreateApplicationInstanceResponse, AWSError] = js.native
  def createApplicationInstance(callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationInstanceResponse, Unit]): Request[CreateApplicationInstanceResponse, AWSError] = js.native
  /**
    * Creates an application instance and deploys it to a device.
    */
  def createApplicationInstance(params: CreateApplicationInstanceRequest): Request[CreateApplicationInstanceResponse, AWSError] = js.native
  def createApplicationInstance(
    params: CreateApplicationInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationInstanceResponse, Unit]
  ): Request[CreateApplicationInstanceResponse, AWSError] = js.native
  
  /**
    * Creates a job to run on one or more devices.
    */
  def createJobForDevices(): Request[CreateJobForDevicesResponse, AWSError] = js.native
  def createJobForDevices(callback: js.Function2[/* err */ AWSError, /* data */ CreateJobForDevicesResponse, Unit]): Request[CreateJobForDevicesResponse, AWSError] = js.native
  /**
    * Creates a job to run on one or more devices.
    */
  def createJobForDevices(params: CreateJobForDevicesRequest): Request[CreateJobForDevicesResponse, AWSError] = js.native
  def createJobForDevices(
    params: CreateJobForDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateJobForDevicesResponse, Unit]
  ): Request[CreateJobForDevicesResponse, AWSError] = js.native
  
  /**
    * Creates a camera stream node.
    */
  def createNodeFromTemplateJob(): Request[CreateNodeFromTemplateJobResponse, AWSError] = js.native
  def createNodeFromTemplateJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateNodeFromTemplateJobResponse, Unit]): Request[CreateNodeFromTemplateJobResponse, AWSError] = js.native
  /**
    * Creates a camera stream node.
    */
  def createNodeFromTemplateJob(params: CreateNodeFromTemplateJobRequest): Request[CreateNodeFromTemplateJobResponse, AWSError] = js.native
  def createNodeFromTemplateJob(
    params: CreateNodeFromTemplateJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNodeFromTemplateJobResponse, Unit]
  ): Request[CreateNodeFromTemplateJobResponse, AWSError] = js.native
  
  /**
    * Creates a package and storage location in an Amazon S3 access point.
    */
  def createPackage(): Request[CreatePackageResponse, AWSError] = js.native
  def createPackage(callback: js.Function2[/* err */ AWSError, /* data */ CreatePackageResponse, Unit]): Request[CreatePackageResponse, AWSError] = js.native
  /**
    * Creates a package and storage location in an Amazon S3 access point.
    */
  def createPackage(params: CreatePackageRequest): Request[CreatePackageResponse, AWSError] = js.native
  def createPackage(
    params: CreatePackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePackageResponse, Unit]
  ): Request[CreatePackageResponse, AWSError] = js.native
  
  /**
    * Imports a node package.
    */
  def createPackageImportJob(): Request[CreatePackageImportJobResponse, AWSError] = js.native
  def createPackageImportJob(callback: js.Function2[/* err */ AWSError, /* data */ CreatePackageImportJobResponse, Unit]): Request[CreatePackageImportJobResponse, AWSError] = js.native
  /**
    * Imports a node package.
    */
  def createPackageImportJob(params: CreatePackageImportJobRequest): Request[CreatePackageImportJobResponse, AWSError] = js.native
  def createPackageImportJob(
    params: CreatePackageImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePackageImportJobResponse, Unit]
  ): Request[CreatePackageImportJobResponse, AWSError] = js.native
  
  /**
    * Deletes a device.
    */
  def deleteDevice(): Request[DeleteDeviceResponse, AWSError] = js.native
  def deleteDevice(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDeviceResponse, Unit]): Request[DeleteDeviceResponse, AWSError] = js.native
  /**
    * Deletes a device.
    */
  def deleteDevice(params: DeleteDeviceRequest): Request[DeleteDeviceResponse, AWSError] = js.native
  def deleteDevice(
    params: DeleteDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDeviceResponse, Unit]
  ): Request[DeleteDeviceResponse, AWSError] = js.native
  
  /**
    * Deletes a package.  To delete a package, you need permission to call s3:DeleteObject in addition to permissions for the AWS Panorama API. 
    */
  def deletePackage(): Request[DeletePackageResponse, AWSError] = js.native
  def deletePackage(callback: js.Function2[/* err */ AWSError, /* data */ DeletePackageResponse, Unit]): Request[DeletePackageResponse, AWSError] = js.native
  /**
    * Deletes a package.  To delete a package, you need permission to call s3:DeleteObject in addition to permissions for the AWS Panorama API. 
    */
  def deletePackage(params: DeletePackageRequest): Request[DeletePackageResponse, AWSError] = js.native
  def deletePackage(
    params: DeletePackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePackageResponse, Unit]
  ): Request[DeletePackageResponse, AWSError] = js.native
  
  /**
    * Deregisters a package version.
    */
  def deregisterPackageVersion(): Request[DeregisterPackageVersionResponse, AWSError] = js.native
  def deregisterPackageVersion(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterPackageVersionResponse, Unit]): Request[DeregisterPackageVersionResponse, AWSError] = js.native
  /**
    * Deregisters a package version.
    */
  def deregisterPackageVersion(params: DeregisterPackageVersionRequest): Request[DeregisterPackageVersionResponse, AWSError] = js.native
  def deregisterPackageVersion(
    params: DeregisterPackageVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterPackageVersionResponse, Unit]
  ): Request[DeregisterPackageVersionResponse, AWSError] = js.native
  
  /**
    * Returns information about an application instance on a device.
    */
  def describeApplicationInstance(): Request[DescribeApplicationInstanceResponse, AWSError] = js.native
  def describeApplicationInstance(callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicationInstanceResponse, Unit]): Request[DescribeApplicationInstanceResponse, AWSError] = js.native
  /**
    * Returns information about an application instance on a device.
    */
  def describeApplicationInstance(params: DescribeApplicationInstanceRequest): Request[DescribeApplicationInstanceResponse, AWSError] = js.native
  def describeApplicationInstance(
    params: DescribeApplicationInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicationInstanceResponse, Unit]
  ): Request[DescribeApplicationInstanceResponse, AWSError] = js.native
  
  /**
    * Returns information about an application instance's configuration manifest.
    */
  def describeApplicationInstanceDetails(): Request[DescribeApplicationInstanceDetailsResponse, AWSError] = js.native
  def describeApplicationInstanceDetails(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicationInstanceDetailsResponse, Unit]
  ): Request[DescribeApplicationInstanceDetailsResponse, AWSError] = js.native
  /**
    * Returns information about an application instance's configuration manifest.
    */
  def describeApplicationInstanceDetails(params: DescribeApplicationInstanceDetailsRequest): Request[DescribeApplicationInstanceDetailsResponse, AWSError] = js.native
  def describeApplicationInstanceDetails(
    params: DescribeApplicationInstanceDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicationInstanceDetailsResponse, Unit]
  ): Request[DescribeApplicationInstanceDetailsResponse, AWSError] = js.native
  
  /**
    * Returns information about a device.
    */
  def describeDevice(): Request[DescribeDeviceResponse, AWSError] = js.native
  def describeDevice(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeviceResponse, Unit]): Request[DescribeDeviceResponse, AWSError] = js.native
  /**
    * Returns information about a device.
    */
  def describeDevice(params: DescribeDeviceRequest): Request[DescribeDeviceResponse, AWSError] = js.native
  def describeDevice(
    params: DescribeDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeviceResponse, Unit]
  ): Request[DescribeDeviceResponse, AWSError] = js.native
  
  /**
    * Returns information about a device job.
    */
  def describeDeviceJob(): Request[DescribeDeviceJobResponse, AWSError] = js.native
  def describeDeviceJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeviceJobResponse, Unit]): Request[DescribeDeviceJobResponse, AWSError] = js.native
  /**
    * Returns information about a device job.
    */
  def describeDeviceJob(params: DescribeDeviceJobRequest): Request[DescribeDeviceJobResponse, AWSError] = js.native
  def describeDeviceJob(
    params: DescribeDeviceJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeviceJobResponse, Unit]
  ): Request[DescribeDeviceJobResponse, AWSError] = js.native
  
  /**
    * Returns information about a node.
    */
  def describeNode(): Request[DescribeNodeResponse, AWSError] = js.native
  def describeNode(callback: js.Function2[/* err */ AWSError, /* data */ DescribeNodeResponse, Unit]): Request[DescribeNodeResponse, AWSError] = js.native
  /**
    * Returns information about a node.
    */
  def describeNode(params: DescribeNodeRequest): Request[DescribeNodeResponse, AWSError] = js.native
  def describeNode(
    params: DescribeNodeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNodeResponse, Unit]
  ): Request[DescribeNodeResponse, AWSError] = js.native
  
  /**
    * Returns information about a job to create a camera stream node.
    */
  def describeNodeFromTemplateJob(): Request[DescribeNodeFromTemplateJobResponse, AWSError] = js.native
  def describeNodeFromTemplateJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeNodeFromTemplateJobResponse, Unit]): Request[DescribeNodeFromTemplateJobResponse, AWSError] = js.native
  /**
    * Returns information about a job to create a camera stream node.
    */
  def describeNodeFromTemplateJob(params: DescribeNodeFromTemplateJobRequest): Request[DescribeNodeFromTemplateJobResponse, AWSError] = js.native
  def describeNodeFromTemplateJob(
    params: DescribeNodeFromTemplateJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNodeFromTemplateJobResponse, Unit]
  ): Request[DescribeNodeFromTemplateJobResponse, AWSError] = js.native
  
  /**
    * Returns information about a package.
    */
  def describePackage(): Request[DescribePackageResponse, AWSError] = js.native
  def describePackage(callback: js.Function2[/* err */ AWSError, /* data */ DescribePackageResponse, Unit]): Request[DescribePackageResponse, AWSError] = js.native
  /**
    * Returns information about a package.
    */
  def describePackage(params: DescribePackageRequest): Request[DescribePackageResponse, AWSError] = js.native
  def describePackage(
    params: DescribePackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePackageResponse, Unit]
  ): Request[DescribePackageResponse, AWSError] = js.native
  
  /**
    * Returns information about a package import job.
    */
  def describePackageImportJob(): Request[DescribePackageImportJobResponse, AWSError] = js.native
  def describePackageImportJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribePackageImportJobResponse, Unit]): Request[DescribePackageImportJobResponse, AWSError] = js.native
  /**
    * Returns information about a package import job.
    */
  def describePackageImportJob(params: DescribePackageImportJobRequest): Request[DescribePackageImportJobResponse, AWSError] = js.native
  def describePackageImportJob(
    params: DescribePackageImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePackageImportJobResponse, Unit]
  ): Request[DescribePackageImportJobResponse, AWSError] = js.native
  
  /**
    * Returns information about a package version.
    */
  def describePackageVersion(): Request[DescribePackageVersionResponse, AWSError] = js.native
  def describePackageVersion(callback: js.Function2[/* err */ AWSError, /* data */ DescribePackageVersionResponse, Unit]): Request[DescribePackageVersionResponse, AWSError] = js.native
  /**
    * Returns information about a package version.
    */
  def describePackageVersion(params: DescribePackageVersionRequest): Request[DescribePackageVersionResponse, AWSError] = js.native
  def describePackageVersion(
    params: DescribePackageVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePackageVersionResponse, Unit]
  ): Request[DescribePackageVersionResponse, AWSError] = js.native
  
  /**
    * Returns a list of application instance dependencies.
    */
  def listApplicationInstanceDependencies(): Request[ListApplicationInstanceDependenciesResponse, AWSError] = js.native
  def listApplicationInstanceDependencies(
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationInstanceDependenciesResponse, Unit]
  ): Request[ListApplicationInstanceDependenciesResponse, AWSError] = js.native
  /**
    * Returns a list of application instance dependencies.
    */
  def listApplicationInstanceDependencies(params: ListApplicationInstanceDependenciesRequest): Request[ListApplicationInstanceDependenciesResponse, AWSError] = js.native
  def listApplicationInstanceDependencies(
    params: ListApplicationInstanceDependenciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationInstanceDependenciesResponse, Unit]
  ): Request[ListApplicationInstanceDependenciesResponse, AWSError] = js.native
  
  /**
    * Returns a list of application node instances.
    */
  def listApplicationInstanceNodeInstances(): Request[ListApplicationInstanceNodeInstancesResponse, AWSError] = js.native
  def listApplicationInstanceNodeInstances(
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationInstanceNodeInstancesResponse, Unit]
  ): Request[ListApplicationInstanceNodeInstancesResponse, AWSError] = js.native
  /**
    * Returns a list of application node instances.
    */
  def listApplicationInstanceNodeInstances(params: ListApplicationInstanceNodeInstancesRequest): Request[ListApplicationInstanceNodeInstancesResponse, AWSError] = js.native
  def listApplicationInstanceNodeInstances(
    params: ListApplicationInstanceNodeInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationInstanceNodeInstancesResponse, Unit]
  ): Request[ListApplicationInstanceNodeInstancesResponse, AWSError] = js.native
  
  /**
    * Returns a list of application instances.
    */
  def listApplicationInstances(): Request[ListApplicationInstancesResponse, AWSError] = js.native
  def listApplicationInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationInstancesResponse, Unit]): Request[ListApplicationInstancesResponse, AWSError] = js.native
  /**
    * Returns a list of application instances.
    */
  def listApplicationInstances(params: ListApplicationInstancesRequest): Request[ListApplicationInstancesResponse, AWSError] = js.native
  def listApplicationInstances(
    params: ListApplicationInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationInstancesResponse, Unit]
  ): Request[ListApplicationInstancesResponse, AWSError] = js.native
  
  /**
    * Returns a list of devices.
    */
  def listDevices(): Request[ListDevicesResponse, AWSError] = js.native
  def listDevices(callback: js.Function2[/* err */ AWSError, /* data */ ListDevicesResponse, Unit]): Request[ListDevicesResponse, AWSError] = js.native
  /**
    * Returns a list of devices.
    */
  def listDevices(params: ListDevicesRequest): Request[ListDevicesResponse, AWSError] = js.native
  def listDevices(
    params: ListDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDevicesResponse, Unit]
  ): Request[ListDevicesResponse, AWSError] = js.native
  
  /**
    * Returns a list of jobs.
    */
  def listDevicesJobs(): Request[ListDevicesJobsResponse, AWSError] = js.native
  def listDevicesJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListDevicesJobsResponse, Unit]): Request[ListDevicesJobsResponse, AWSError] = js.native
  /**
    * Returns a list of jobs.
    */
  def listDevicesJobs(params: ListDevicesJobsRequest): Request[ListDevicesJobsResponse, AWSError] = js.native
  def listDevicesJobs(
    params: ListDevicesJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDevicesJobsResponse, Unit]
  ): Request[ListDevicesJobsResponse, AWSError] = js.native
  
  /**
    * Returns a list of camera stream node jobs.
    */
  def listNodeFromTemplateJobs(): Request[ListNodeFromTemplateJobsResponse, AWSError] = js.native
  def listNodeFromTemplateJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListNodeFromTemplateJobsResponse, Unit]): Request[ListNodeFromTemplateJobsResponse, AWSError] = js.native
  /**
    * Returns a list of camera stream node jobs.
    */
  def listNodeFromTemplateJobs(params: ListNodeFromTemplateJobsRequest): Request[ListNodeFromTemplateJobsResponse, AWSError] = js.native
  def listNodeFromTemplateJobs(
    params: ListNodeFromTemplateJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNodeFromTemplateJobsResponse, Unit]
  ): Request[ListNodeFromTemplateJobsResponse, AWSError] = js.native
  
  /**
    * Returns a list of nodes.
    */
  def listNodes(): Request[ListNodesResponse, AWSError] = js.native
  def listNodes(callback: js.Function2[/* err */ AWSError, /* data */ ListNodesResponse, Unit]): Request[ListNodesResponse, AWSError] = js.native
  /**
    * Returns a list of nodes.
    */
  def listNodes(params: ListNodesRequest): Request[ListNodesResponse, AWSError] = js.native
  def listNodes(
    params: ListNodesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNodesResponse, Unit]
  ): Request[ListNodesResponse, AWSError] = js.native
  
  /**
    * Returns a list of package import jobs.
    */
  def listPackageImportJobs(): Request[ListPackageImportJobsResponse, AWSError] = js.native
  def listPackageImportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListPackageImportJobsResponse, Unit]): Request[ListPackageImportJobsResponse, AWSError] = js.native
  /**
    * Returns a list of package import jobs.
    */
  def listPackageImportJobs(params: ListPackageImportJobsRequest): Request[ListPackageImportJobsResponse, AWSError] = js.native
  def listPackageImportJobs(
    params: ListPackageImportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPackageImportJobsResponse, Unit]
  ): Request[ListPackageImportJobsResponse, AWSError] = js.native
  
  /**
    * Returns a list of packages.
    */
  def listPackages(): Request[ListPackagesResponse, AWSError] = js.native
  def listPackages(callback: js.Function2[/* err */ AWSError, /* data */ ListPackagesResponse, Unit]): Request[ListPackagesResponse, AWSError] = js.native
  /**
    * Returns a list of packages.
    */
  def listPackages(params: ListPackagesRequest): Request[ListPackagesResponse, AWSError] = js.native
  def listPackages(
    params: ListPackagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPackagesResponse, Unit]
  ): Request[ListPackagesResponse, AWSError] = js.native
  
  /**
    * Returns a list of tags for a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of tags for a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Creates a device and returns a configuration archive. The configuration archive is a ZIP file that contains a provisioning certificate that is valid for 5 minutes. Name the configuration archive certificates-omni_device-name.zip and transfer it to the device within 5 minutes. Use the included USB storage device and connect it to the USB 3.0 port next to the HDMI output.
    */
  def provisionDevice(): Request[ProvisionDeviceResponse, AWSError] = js.native
  def provisionDevice(callback: js.Function2[/* err */ AWSError, /* data */ ProvisionDeviceResponse, Unit]): Request[ProvisionDeviceResponse, AWSError] = js.native
  /**
    * Creates a device and returns a configuration archive. The configuration archive is a ZIP file that contains a provisioning certificate that is valid for 5 minutes. Name the configuration archive certificates-omni_device-name.zip and transfer it to the device within 5 minutes. Use the included USB storage device and connect it to the USB 3.0 port next to the HDMI output.
    */
  def provisionDevice(params: ProvisionDeviceRequest): Request[ProvisionDeviceResponse, AWSError] = js.native
  def provisionDevice(
    params: ProvisionDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ProvisionDeviceResponse, Unit]
  ): Request[ProvisionDeviceResponse, AWSError] = js.native
  
  /**
    * Registers a package version.
    */
  def registerPackageVersion(): Request[RegisterPackageVersionResponse, AWSError] = js.native
  def registerPackageVersion(callback: js.Function2[/* err */ AWSError, /* data */ RegisterPackageVersionResponse, Unit]): Request[RegisterPackageVersionResponse, AWSError] = js.native
  /**
    * Registers a package version.
    */
  def registerPackageVersion(params: RegisterPackageVersionRequest): Request[RegisterPackageVersionResponse, AWSError] = js.native
  def registerPackageVersion(
    params: RegisterPackageVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterPackageVersionResponse, Unit]
  ): Request[RegisterPackageVersionResponse, AWSError] = js.native
  
  /**
    * Removes an application instance.
    */
  def removeApplicationInstance(): Request[RemoveApplicationInstanceResponse, AWSError] = js.native
  def removeApplicationInstance(callback: js.Function2[/* err */ AWSError, /* data */ RemoveApplicationInstanceResponse, Unit]): Request[RemoveApplicationInstanceResponse, AWSError] = js.native
  /**
    * Removes an application instance.
    */
  def removeApplicationInstance(params: RemoveApplicationInstanceRequest): Request[RemoveApplicationInstanceResponse, AWSError] = js.native
  def removeApplicationInstance(
    params: RemoveApplicationInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveApplicationInstanceResponse, Unit]
  ): Request[RemoveApplicationInstanceResponse, AWSError] = js.native
  
  /**
    * Tags a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Tags a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates a device's metadata.
    */
  def updateDeviceMetadata(): Request[UpdateDeviceMetadataResponse, AWSError] = js.native
  def updateDeviceMetadata(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeviceMetadataResponse, Unit]): Request[UpdateDeviceMetadataResponse, AWSError] = js.native
  /**
    * Updates a device's metadata.
    */
  def updateDeviceMetadata(params: UpdateDeviceMetadataRequest): Request[UpdateDeviceMetadataResponse, AWSError] = js.native
  def updateDeviceMetadata(
    params: UpdateDeviceMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeviceMetadataResponse, Unit]
  ): Request[UpdateDeviceMetadataResponse, AWSError] = js.native
}
