package typings.awsSdk.devicefarmMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceFarm extends Service {
  
  @JSName("config")
  var config_DeviceFarm: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a device pool.
    */
  def createDevicePool(): Request[CreateDevicePoolResult, AWSError] = js.native
  def createDevicePool(callback: js.Function2[/* err */ AWSError, /* data */ CreateDevicePoolResult, Unit]): Request[CreateDevicePoolResult, AWSError] = js.native
  /**
    * Creates a device pool.
    */
  def createDevicePool(params: CreateDevicePoolRequest): Request[CreateDevicePoolResult, AWSError] = js.native
  def createDevicePool(
    params: CreateDevicePoolRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDevicePoolResult, Unit]
  ): Request[CreateDevicePoolResult, AWSError] = js.native
  
  /**
    * Creates a profile that can be applied to one or more private fleet device instances.
    */
  def createInstanceProfile(): Request[CreateInstanceProfileResult, AWSError] = js.native
  def createInstanceProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateInstanceProfileResult, Unit]): Request[CreateInstanceProfileResult, AWSError] = js.native
  /**
    * Creates a profile that can be applied to one or more private fleet device instances.
    */
  def createInstanceProfile(params: CreateInstanceProfileRequest): Request[CreateInstanceProfileResult, AWSError] = js.native
  def createInstanceProfile(
    params: CreateInstanceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInstanceProfileResult, Unit]
  ): Request[CreateInstanceProfileResult, AWSError] = js.native
  
  /**
    * Creates a network profile.
    */
  def createNetworkProfile(): Request[CreateNetworkProfileResult, AWSError] = js.native
  def createNetworkProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkProfileResult, Unit]): Request[CreateNetworkProfileResult, AWSError] = js.native
  /**
    * Creates a network profile.
    */
  def createNetworkProfile(params: CreateNetworkProfileRequest): Request[CreateNetworkProfileResult, AWSError] = js.native
  def createNetworkProfile(
    params: CreateNetworkProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkProfileResult, Unit]
  ): Request[CreateNetworkProfileResult, AWSError] = js.native
  
  /**
    * Creates a project.
    */
  def createProject(): Request[CreateProjectResult, AWSError] = js.native
  def createProject(callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResult, Unit]): Request[CreateProjectResult, AWSError] = js.native
  /**
    * Creates a project.
    */
  def createProject(params: CreateProjectRequest): Request[CreateProjectResult, AWSError] = js.native
  def createProject(
    params: CreateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResult, Unit]
  ): Request[CreateProjectResult, AWSError] = js.native
  
  /**
    * Specifies and starts a remote access session.
    */
  def createRemoteAccessSession(): Request[CreateRemoteAccessSessionResult, AWSError] = js.native
  def createRemoteAccessSession(callback: js.Function2[/* err */ AWSError, /* data */ CreateRemoteAccessSessionResult, Unit]): Request[CreateRemoteAccessSessionResult, AWSError] = js.native
  /**
    * Specifies and starts a remote access session.
    */
  def createRemoteAccessSession(params: CreateRemoteAccessSessionRequest): Request[CreateRemoteAccessSessionResult, AWSError] = js.native
  def createRemoteAccessSession(
    params: CreateRemoteAccessSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRemoteAccessSessionResult, Unit]
  ): Request[CreateRemoteAccessSessionResult, AWSError] = js.native
  
  /**
    * Creates a Selenium testing project. Projects are used to track TestGridSession instances.
    */
  def createTestGridProject(): Request[CreateTestGridProjectResult, AWSError] = js.native
  def createTestGridProject(callback: js.Function2[/* err */ AWSError, /* data */ CreateTestGridProjectResult, Unit]): Request[CreateTestGridProjectResult, AWSError] = js.native
  /**
    * Creates a Selenium testing project. Projects are used to track TestGridSession instances.
    */
  def createTestGridProject(params: CreateTestGridProjectRequest): Request[CreateTestGridProjectResult, AWSError] = js.native
  def createTestGridProject(
    params: CreateTestGridProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTestGridProjectResult, Unit]
  ): Request[CreateTestGridProjectResult, AWSError] = js.native
  
  /**
    * Creates a signed, short-term URL that can be passed to a Selenium RemoteWebDriver constructor.
    */
  def createTestGridUrl(): Request[CreateTestGridUrlResult, AWSError] = js.native
  def createTestGridUrl(callback: js.Function2[/* err */ AWSError, /* data */ CreateTestGridUrlResult, Unit]): Request[CreateTestGridUrlResult, AWSError] = js.native
  /**
    * Creates a signed, short-term URL that can be passed to a Selenium RemoteWebDriver constructor.
    */
  def createTestGridUrl(params: CreateTestGridUrlRequest): Request[CreateTestGridUrlResult, AWSError] = js.native
  def createTestGridUrl(
    params: CreateTestGridUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTestGridUrlResult, Unit]
  ): Request[CreateTestGridUrlResult, AWSError] = js.native
  
  /**
    * Uploads an app or test scripts.
    */
  def createUpload(): Request[CreateUploadResult, AWSError] = js.native
  def createUpload(callback: js.Function2[/* err */ AWSError, /* data */ CreateUploadResult, Unit]): Request[CreateUploadResult, AWSError] = js.native
  /**
    * Uploads an app or test scripts.
    */
  def createUpload(params: CreateUploadRequest): Request[CreateUploadResult, AWSError] = js.native
  def createUpload(
    params: CreateUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUploadResult, Unit]
  ): Request[CreateUploadResult, AWSError] = js.native
  
  /**
    * Creates a configuration record in Device Farm for your Amazon Virtual Private Cloud (VPC) endpoint.
    */
  def createVPCEConfiguration(): Request[CreateVPCEConfigurationResult, AWSError] = js.native
  def createVPCEConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ CreateVPCEConfigurationResult, Unit]): Request[CreateVPCEConfigurationResult, AWSError] = js.native
  /**
    * Creates a configuration record in Device Farm for your Amazon Virtual Private Cloud (VPC) endpoint.
    */
  def createVPCEConfiguration(params: CreateVPCEConfigurationRequest): Request[CreateVPCEConfigurationResult, AWSError] = js.native
  def createVPCEConfiguration(
    params: CreateVPCEConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVPCEConfigurationResult, Unit]
  ): Request[CreateVPCEConfigurationResult, AWSError] = js.native
  
  /**
    * Deletes a device pool given the pool ARN. Does not allow deletion of curated pools owned by the system.
    */
  def deleteDevicePool(): Request[DeleteDevicePoolResult, AWSError] = js.native
  def deleteDevicePool(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDevicePoolResult, Unit]): Request[DeleteDevicePoolResult, AWSError] = js.native
  /**
    * Deletes a device pool given the pool ARN. Does not allow deletion of curated pools owned by the system.
    */
  def deleteDevicePool(params: DeleteDevicePoolRequest): Request[DeleteDevicePoolResult, AWSError] = js.native
  def deleteDevicePool(
    params: DeleteDevicePoolRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDevicePoolResult, Unit]
  ): Request[DeleteDevicePoolResult, AWSError] = js.native
  
  /**
    * Deletes a profile that can be applied to one or more private device instances.
    */
  def deleteInstanceProfile(): Request[DeleteInstanceProfileResult, AWSError] = js.native
  def deleteInstanceProfile(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInstanceProfileResult, Unit]): Request[DeleteInstanceProfileResult, AWSError] = js.native
  /**
    * Deletes a profile that can be applied to one or more private device instances.
    */
  def deleteInstanceProfile(params: DeleteInstanceProfileRequest): Request[DeleteInstanceProfileResult, AWSError] = js.native
  def deleteInstanceProfile(
    params: DeleteInstanceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInstanceProfileResult, Unit]
  ): Request[DeleteInstanceProfileResult, AWSError] = js.native
  
  /**
    * Deletes a network profile.
    */
  def deleteNetworkProfile(): Request[DeleteNetworkProfileResult, AWSError] = js.native
  def deleteNetworkProfile(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNetworkProfileResult, Unit]): Request[DeleteNetworkProfileResult, AWSError] = js.native
  /**
    * Deletes a network profile.
    */
  def deleteNetworkProfile(params: DeleteNetworkProfileRequest): Request[DeleteNetworkProfileResult, AWSError] = js.native
  def deleteNetworkProfile(
    params: DeleteNetworkProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNetworkProfileResult, Unit]
  ): Request[DeleteNetworkProfileResult, AWSError] = js.native
  
  /**
    * Deletes an AWS Device Farm project, given the project ARN.  Deleting this resource does not stop an in-progress run.
    */
  def deleteProject(): Request[DeleteProjectResult, AWSError] = js.native
  def deleteProject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResult, Unit]): Request[DeleteProjectResult, AWSError] = js.native
  /**
    * Deletes an AWS Device Farm project, given the project ARN.  Deleting this resource does not stop an in-progress run.
    */
  def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResult, AWSError] = js.native
  def deleteProject(
    params: DeleteProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResult, Unit]
  ): Request[DeleteProjectResult, AWSError] = js.native
  
  /**
    * Deletes a completed remote access session and its results.
    */
  def deleteRemoteAccessSession(): Request[DeleteRemoteAccessSessionResult, AWSError] = js.native
  def deleteRemoteAccessSession(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRemoteAccessSessionResult, Unit]): Request[DeleteRemoteAccessSessionResult, AWSError] = js.native
  /**
    * Deletes a completed remote access session and its results.
    */
  def deleteRemoteAccessSession(params: DeleteRemoteAccessSessionRequest): Request[DeleteRemoteAccessSessionResult, AWSError] = js.native
  def deleteRemoteAccessSession(
    params: DeleteRemoteAccessSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRemoteAccessSessionResult, Unit]
  ): Request[DeleteRemoteAccessSessionResult, AWSError] = js.native
  
  /**
    * Deletes the run, given the run ARN.  Deleting this resource does not stop an in-progress run.
    */
  def deleteRun(): Request[DeleteRunResult, AWSError] = js.native
  def deleteRun(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRunResult, Unit]): Request[DeleteRunResult, AWSError] = js.native
  /**
    * Deletes the run, given the run ARN.  Deleting this resource does not stop an in-progress run.
    */
  def deleteRun(params: DeleteRunRequest): Request[DeleteRunResult, AWSError] = js.native
  def deleteRun(
    params: DeleteRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRunResult, Unit]
  ): Request[DeleteRunResult, AWSError] = js.native
  
  /**
    *  Deletes a Selenium testing project and all content generated under it.   You cannot undo this operation.   You cannot delete a project if it has active sessions. 
    */
  def deleteTestGridProject(): Request[DeleteTestGridProjectResult, AWSError] = js.native
  def deleteTestGridProject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTestGridProjectResult, Unit]): Request[DeleteTestGridProjectResult, AWSError] = js.native
  /**
    *  Deletes a Selenium testing project and all content generated under it.   You cannot undo this operation.   You cannot delete a project if it has active sessions. 
    */
  def deleteTestGridProject(params: DeleteTestGridProjectRequest): Request[DeleteTestGridProjectResult, AWSError] = js.native
  def deleteTestGridProject(
    params: DeleteTestGridProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTestGridProjectResult, Unit]
  ): Request[DeleteTestGridProjectResult, AWSError] = js.native
  
  /**
    * Deletes an upload given the upload ARN.
    */
  def deleteUpload(): Request[DeleteUploadResult, AWSError] = js.native
  def deleteUpload(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUploadResult, Unit]): Request[DeleteUploadResult, AWSError] = js.native
  /**
    * Deletes an upload given the upload ARN.
    */
  def deleteUpload(params: DeleteUploadRequest): Request[DeleteUploadResult, AWSError] = js.native
  def deleteUpload(
    params: DeleteUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUploadResult, Unit]
  ): Request[DeleteUploadResult, AWSError] = js.native
  
  /**
    * Deletes a configuration for your Amazon Virtual Private Cloud (VPC) endpoint.
    */
  def deleteVPCEConfiguration(): Request[DeleteVPCEConfigurationResult, AWSError] = js.native
  def deleteVPCEConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVPCEConfigurationResult, Unit]): Request[DeleteVPCEConfigurationResult, AWSError] = js.native
  /**
    * Deletes a configuration for your Amazon Virtual Private Cloud (VPC) endpoint.
    */
  def deleteVPCEConfiguration(params: DeleteVPCEConfigurationRequest): Request[DeleteVPCEConfigurationResult, AWSError] = js.native
  def deleteVPCEConfiguration(
    params: DeleteVPCEConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVPCEConfigurationResult, Unit]
  ): Request[DeleteVPCEConfigurationResult, AWSError] = js.native
  
  /**
    * Returns the number of unmetered iOS or unmetered Android devices that have been purchased by the account.
    */
  def getAccountSettings(): Request[GetAccountSettingsResult, AWSError] = js.native
  def getAccountSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetAccountSettingsResult, Unit]): Request[GetAccountSettingsResult, AWSError] = js.native
  /**
    * Returns the number of unmetered iOS or unmetered Android devices that have been purchased by the account.
    */
  def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResult, AWSError] = js.native
  def getAccountSettings(
    params: GetAccountSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccountSettingsResult, Unit]
  ): Request[GetAccountSettingsResult, AWSError] = js.native
  
  /**
    * Gets information about a unique device type.
    */
  def getDevice(): Request[GetDeviceResult, AWSError] = js.native
  def getDevice(callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceResult, Unit]): Request[GetDeviceResult, AWSError] = js.native
  /**
    * Gets information about a unique device type.
    */
  def getDevice(params: GetDeviceRequest): Request[GetDeviceResult, AWSError] = js.native
  def getDevice(
    params: GetDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceResult, Unit]
  ): Request[GetDeviceResult, AWSError] = js.native
  
  /**
    * Returns information about a device instance that belongs to a private device fleet.
    */
  def getDeviceInstance(): Request[GetDeviceInstanceResult, AWSError] = js.native
  def getDeviceInstance(callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceInstanceResult, Unit]): Request[GetDeviceInstanceResult, AWSError] = js.native
  /**
    * Returns information about a device instance that belongs to a private device fleet.
    */
  def getDeviceInstance(params: GetDeviceInstanceRequest): Request[GetDeviceInstanceResult, AWSError] = js.native
  def getDeviceInstance(
    params: GetDeviceInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceInstanceResult, Unit]
  ): Request[GetDeviceInstanceResult, AWSError] = js.native
  
  /**
    * Gets information about a device pool.
    */
  def getDevicePool(): Request[GetDevicePoolResult, AWSError] = js.native
  def getDevicePool(callback: js.Function2[/* err */ AWSError, /* data */ GetDevicePoolResult, Unit]): Request[GetDevicePoolResult, AWSError] = js.native
  /**
    * Gets information about a device pool.
    */
  def getDevicePool(params: GetDevicePoolRequest): Request[GetDevicePoolResult, AWSError] = js.native
  def getDevicePool(
    params: GetDevicePoolRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDevicePoolResult, Unit]
  ): Request[GetDevicePoolResult, AWSError] = js.native
  
  /**
    * Gets information about compatibility with a device pool.
    */
  def getDevicePoolCompatibility(): Request[GetDevicePoolCompatibilityResult, AWSError] = js.native
  def getDevicePoolCompatibility(callback: js.Function2[/* err */ AWSError, /* data */ GetDevicePoolCompatibilityResult, Unit]): Request[GetDevicePoolCompatibilityResult, AWSError] = js.native
  /**
    * Gets information about compatibility with a device pool.
    */
  def getDevicePoolCompatibility(params: GetDevicePoolCompatibilityRequest): Request[GetDevicePoolCompatibilityResult, AWSError] = js.native
  def getDevicePoolCompatibility(
    params: GetDevicePoolCompatibilityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDevicePoolCompatibilityResult, Unit]
  ): Request[GetDevicePoolCompatibilityResult, AWSError] = js.native
  
  /**
    * Returns information about the specified instance profile.
    */
  def getInstanceProfile(): Request[GetInstanceProfileResult, AWSError] = js.native
  def getInstanceProfile(callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceProfileResult, Unit]): Request[GetInstanceProfileResult, AWSError] = js.native
  /**
    * Returns information about the specified instance profile.
    */
  def getInstanceProfile(params: GetInstanceProfileRequest): Request[GetInstanceProfileResult, AWSError] = js.native
  def getInstanceProfile(
    params: GetInstanceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceProfileResult, Unit]
  ): Request[GetInstanceProfileResult, AWSError] = js.native
  
  /**
    * Gets information about a job.
    */
  def getJob(): Request[GetJobResult, AWSError] = js.native
  def getJob(callback: js.Function2[/* err */ AWSError, /* data */ GetJobResult, Unit]): Request[GetJobResult, AWSError] = js.native
  /**
    * Gets information about a job.
    */
  def getJob(params: GetJobRequest): Request[GetJobResult, AWSError] = js.native
  def getJob(params: GetJobRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetJobResult, Unit]): Request[GetJobResult, AWSError] = js.native
  
  /**
    * Returns information about a network profile.
    */
  def getNetworkProfile(): Request[GetNetworkProfileResult, AWSError] = js.native
  def getNetworkProfile(callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkProfileResult, Unit]): Request[GetNetworkProfileResult, AWSError] = js.native
  /**
    * Returns information about a network profile.
    */
  def getNetworkProfile(params: GetNetworkProfileRequest): Request[GetNetworkProfileResult, AWSError] = js.native
  def getNetworkProfile(
    params: GetNetworkProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkProfileResult, Unit]
  ): Request[GetNetworkProfileResult, AWSError] = js.native
  
  /**
    * Gets the current status and future status of all offerings purchased by an AWS account. The response indicates how many offerings are currently available and the offerings that will be available in the next period. The API returns a NotEligible error if the user is not permitted to invoke the operation. If you must be able to invoke this operation, contact aws-devicefarm-support@amazon.com.
    */
  def getOfferingStatus(): Request[GetOfferingStatusResult, AWSError] = js.native
  def getOfferingStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetOfferingStatusResult, Unit]): Request[GetOfferingStatusResult, AWSError] = js.native
  /**
    * Gets the current status and future status of all offerings purchased by an AWS account. The response indicates how many offerings are currently available and the offerings that will be available in the next period. The API returns a NotEligible error if the user is not permitted to invoke the operation. If you must be able to invoke this operation, contact aws-devicefarm-support@amazon.com.
    */
  def getOfferingStatus(params: GetOfferingStatusRequest): Request[GetOfferingStatusResult, AWSError] = js.native
  def getOfferingStatus(
    params: GetOfferingStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOfferingStatusResult, Unit]
  ): Request[GetOfferingStatusResult, AWSError] = js.native
  
  /**
    * Gets information about a project.
    */
  def getProject(): Request[GetProjectResult, AWSError] = js.native
  def getProject(callback: js.Function2[/* err */ AWSError, /* data */ GetProjectResult, Unit]): Request[GetProjectResult, AWSError] = js.native
  /**
    * Gets information about a project.
    */
  def getProject(params: GetProjectRequest): Request[GetProjectResult, AWSError] = js.native
  def getProject(
    params: GetProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProjectResult, Unit]
  ): Request[GetProjectResult, AWSError] = js.native
  
  /**
    * Returns a link to a currently running remote access session.
    */
  def getRemoteAccessSession(): Request[GetRemoteAccessSessionResult, AWSError] = js.native
  def getRemoteAccessSession(callback: js.Function2[/* err */ AWSError, /* data */ GetRemoteAccessSessionResult, Unit]): Request[GetRemoteAccessSessionResult, AWSError] = js.native
  /**
    * Returns a link to a currently running remote access session.
    */
  def getRemoteAccessSession(params: GetRemoteAccessSessionRequest): Request[GetRemoteAccessSessionResult, AWSError] = js.native
  def getRemoteAccessSession(
    params: GetRemoteAccessSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRemoteAccessSessionResult, Unit]
  ): Request[GetRemoteAccessSessionResult, AWSError] = js.native
  
  /**
    * Gets information about a run.
    */
  def getRun(): Request[GetRunResult, AWSError] = js.native
  def getRun(callback: js.Function2[/* err */ AWSError, /* data */ GetRunResult, Unit]): Request[GetRunResult, AWSError] = js.native
  /**
    * Gets information about a run.
    */
  def getRun(params: GetRunRequest): Request[GetRunResult, AWSError] = js.native
  def getRun(params: GetRunRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetRunResult, Unit]): Request[GetRunResult, AWSError] = js.native
  
  /**
    * Gets information about a suite.
    */
  def getSuite(): Request[GetSuiteResult, AWSError] = js.native
  def getSuite(callback: js.Function2[/* err */ AWSError, /* data */ GetSuiteResult, Unit]): Request[GetSuiteResult, AWSError] = js.native
  /**
    * Gets information about a suite.
    */
  def getSuite(params: GetSuiteRequest): Request[GetSuiteResult, AWSError] = js.native
  def getSuite(
    params: GetSuiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSuiteResult, Unit]
  ): Request[GetSuiteResult, AWSError] = js.native
  
  /**
    * Gets information about a test.
    */
  def getTest(): Request[GetTestResult, AWSError] = js.native
  def getTest(callback: js.Function2[/* err */ AWSError, /* data */ GetTestResult, Unit]): Request[GetTestResult, AWSError] = js.native
  /**
    * Gets information about a test.
    */
  def getTest(params: GetTestRequest): Request[GetTestResult, AWSError] = js.native
  def getTest(params: GetTestRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetTestResult, Unit]): Request[GetTestResult, AWSError] = js.native
  
  /**
    * Retrieves information about a Selenium testing project.
    */
  def getTestGridProject(): Request[GetTestGridProjectResult, AWSError] = js.native
  def getTestGridProject(callback: js.Function2[/* err */ AWSError, /* data */ GetTestGridProjectResult, Unit]): Request[GetTestGridProjectResult, AWSError] = js.native
  /**
    * Retrieves information about a Selenium testing project.
    */
  def getTestGridProject(params: GetTestGridProjectRequest): Request[GetTestGridProjectResult, AWSError] = js.native
  def getTestGridProject(
    params: GetTestGridProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTestGridProjectResult, Unit]
  ): Request[GetTestGridProjectResult, AWSError] = js.native
  
  /**
    * A session is an instance of a browser created through a RemoteWebDriver with the URL from CreateTestGridUrlResult$url. You can use the following to look up sessions:   The session ARN (GetTestGridSessionRequest$sessionArn).   The project ARN and a session ID (GetTestGridSessionRequest$projectArn and GetTestGridSessionRequest$sessionId).   
    */
  def getTestGridSession(): Request[GetTestGridSessionResult, AWSError] = js.native
  def getTestGridSession(callback: js.Function2[/* err */ AWSError, /* data */ GetTestGridSessionResult, Unit]): Request[GetTestGridSessionResult, AWSError] = js.native
  /**
    * A session is an instance of a browser created through a RemoteWebDriver with the URL from CreateTestGridUrlResult$url. You can use the following to look up sessions:   The session ARN (GetTestGridSessionRequest$sessionArn).   The project ARN and a session ID (GetTestGridSessionRequest$projectArn and GetTestGridSessionRequest$sessionId).   
    */
  def getTestGridSession(params: GetTestGridSessionRequest): Request[GetTestGridSessionResult, AWSError] = js.native
  def getTestGridSession(
    params: GetTestGridSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTestGridSessionResult, Unit]
  ): Request[GetTestGridSessionResult, AWSError] = js.native
  
  /**
    * Gets information about an upload.
    */
  def getUpload(): Request[GetUploadResult, AWSError] = js.native
  def getUpload(callback: js.Function2[/* err */ AWSError, /* data */ GetUploadResult, Unit]): Request[GetUploadResult, AWSError] = js.native
  /**
    * Gets information about an upload.
    */
  def getUpload(params: GetUploadRequest): Request[GetUploadResult, AWSError] = js.native
  def getUpload(
    params: GetUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUploadResult, Unit]
  ): Request[GetUploadResult, AWSError] = js.native
  
  /**
    * Returns information about the configuration settings for your Amazon Virtual Private Cloud (VPC) endpoint.
    */
  def getVPCEConfiguration(): Request[GetVPCEConfigurationResult, AWSError] = js.native
  def getVPCEConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetVPCEConfigurationResult, Unit]): Request[GetVPCEConfigurationResult, AWSError] = js.native
  /**
    * Returns information about the configuration settings for your Amazon Virtual Private Cloud (VPC) endpoint.
    */
  def getVPCEConfiguration(params: GetVPCEConfigurationRequest): Request[GetVPCEConfigurationResult, AWSError] = js.native
  def getVPCEConfiguration(
    params: GetVPCEConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVPCEConfigurationResult, Unit]
  ): Request[GetVPCEConfigurationResult, AWSError] = js.native
  
  /**
    * Installs an application to the device in a remote access session. For Android applications, the file must be in .apk format. For iOS applications, the file must be in .ipa format.
    */
  def installToRemoteAccessSession(): Request[InstallToRemoteAccessSessionResult, AWSError] = js.native
  def installToRemoteAccessSession(callback: js.Function2[/* err */ AWSError, /* data */ InstallToRemoteAccessSessionResult, Unit]): Request[InstallToRemoteAccessSessionResult, AWSError] = js.native
  /**
    * Installs an application to the device in a remote access session. For Android applications, the file must be in .apk format. For iOS applications, the file must be in .ipa format.
    */
  def installToRemoteAccessSession(params: InstallToRemoteAccessSessionRequest): Request[InstallToRemoteAccessSessionResult, AWSError] = js.native
  def installToRemoteAccessSession(
    params: InstallToRemoteAccessSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InstallToRemoteAccessSessionResult, Unit]
  ): Request[InstallToRemoteAccessSessionResult, AWSError] = js.native
  
  /**
    * Gets information about artifacts.
    */
  def listArtifacts(): Request[ListArtifactsResult, AWSError] = js.native
  def listArtifacts(callback: js.Function2[/* err */ AWSError, /* data */ ListArtifactsResult, Unit]): Request[ListArtifactsResult, AWSError] = js.native
  /**
    * Gets information about artifacts.
    */
  def listArtifacts(params: ListArtifactsRequest): Request[ListArtifactsResult, AWSError] = js.native
  def listArtifacts(
    params: ListArtifactsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListArtifactsResult, Unit]
  ): Request[ListArtifactsResult, AWSError] = js.native
  
  /**
    * Returns information about the private device instances associated with one or more AWS accounts.
    */
  def listDeviceInstances(): Request[ListDeviceInstancesResult, AWSError] = js.native
  def listDeviceInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceInstancesResult, Unit]): Request[ListDeviceInstancesResult, AWSError] = js.native
  /**
    * Returns information about the private device instances associated with one or more AWS accounts.
    */
  def listDeviceInstances(params: ListDeviceInstancesRequest): Request[ListDeviceInstancesResult, AWSError] = js.native
  def listDeviceInstances(
    params: ListDeviceInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceInstancesResult, Unit]
  ): Request[ListDeviceInstancesResult, AWSError] = js.native
  
  /**
    * Gets information about device pools.
    */
  def listDevicePools(): Request[ListDevicePoolsResult, AWSError] = js.native
  def listDevicePools(callback: js.Function2[/* err */ AWSError, /* data */ ListDevicePoolsResult, Unit]): Request[ListDevicePoolsResult, AWSError] = js.native
  /**
    * Gets information about device pools.
    */
  def listDevicePools(params: ListDevicePoolsRequest): Request[ListDevicePoolsResult, AWSError] = js.native
  def listDevicePools(
    params: ListDevicePoolsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDevicePoolsResult, Unit]
  ): Request[ListDevicePoolsResult, AWSError] = js.native
  
  /**
    * Gets information about unique device types.
    */
  def listDevices(): Request[ListDevicesResult, AWSError] = js.native
  def listDevices(callback: js.Function2[/* err */ AWSError, /* data */ ListDevicesResult, Unit]): Request[ListDevicesResult, AWSError] = js.native
  /**
    * Gets information about unique device types.
    */
  def listDevices(params: ListDevicesRequest): Request[ListDevicesResult, AWSError] = js.native
  def listDevices(
    params: ListDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDevicesResult, Unit]
  ): Request[ListDevicesResult, AWSError] = js.native
  
  /**
    * Returns information about all the instance profiles in an AWS account.
    */
  def listInstanceProfiles(): Request[ListInstanceProfilesResult, AWSError] = js.native
  def listInstanceProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceProfilesResult, Unit]): Request[ListInstanceProfilesResult, AWSError] = js.native
  /**
    * Returns information about all the instance profiles in an AWS account.
    */
  def listInstanceProfiles(params: ListInstanceProfilesRequest): Request[ListInstanceProfilesResult, AWSError] = js.native
  def listInstanceProfiles(
    params: ListInstanceProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceProfilesResult, Unit]
  ): Request[ListInstanceProfilesResult, AWSError] = js.native
  
  /**
    * Gets information about jobs for a given test run.
    */
  def listJobs(): Request[ListJobsResult, AWSError] = js.native
  def listJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResult, Unit]): Request[ListJobsResult, AWSError] = js.native
  /**
    * Gets information about jobs for a given test run.
    */
  def listJobs(params: ListJobsRequest): Request[ListJobsResult, AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResult, Unit]
  ): Request[ListJobsResult, AWSError] = js.native
  
  /**
    * Returns the list of available network profiles.
    */
  def listNetworkProfiles(): Request[ListNetworkProfilesResult, AWSError] = js.native
  def listNetworkProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListNetworkProfilesResult, Unit]): Request[ListNetworkProfilesResult, AWSError] = js.native
  /**
    * Returns the list of available network profiles.
    */
  def listNetworkProfiles(params: ListNetworkProfilesRequest): Request[ListNetworkProfilesResult, AWSError] = js.native
  def listNetworkProfiles(
    params: ListNetworkProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNetworkProfilesResult, Unit]
  ): Request[ListNetworkProfilesResult, AWSError] = js.native
  
  /**
    * Returns a list of offering promotions. Each offering promotion record contains the ID and description of the promotion. The API returns a NotEligible error if the caller is not permitted to invoke the operation. Contact aws-devicefarm-support@amazon.com if you must be able to invoke this operation.
    */
  def listOfferingPromotions(): Request[ListOfferingPromotionsResult, AWSError] = js.native
  def listOfferingPromotions(callback: js.Function2[/* err */ AWSError, /* data */ ListOfferingPromotionsResult, Unit]): Request[ListOfferingPromotionsResult, AWSError] = js.native
  /**
    * Returns a list of offering promotions. Each offering promotion record contains the ID and description of the promotion. The API returns a NotEligible error if the caller is not permitted to invoke the operation. Contact aws-devicefarm-support@amazon.com if you must be able to invoke this operation.
    */
  def listOfferingPromotions(params: ListOfferingPromotionsRequest): Request[ListOfferingPromotionsResult, AWSError] = js.native
  def listOfferingPromotions(
    params: ListOfferingPromotionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOfferingPromotionsResult, Unit]
  ): Request[ListOfferingPromotionsResult, AWSError] = js.native
  
  /**
    * Returns a list of all historical purchases, renewals, and system renewal transactions for an AWS account. The list is paginated and ordered by a descending timestamp (most recent transactions are first). The API returns a NotEligible error if the user is not permitted to invoke the operation. If you must be able to invoke this operation, contact aws-devicefarm-support@amazon.com.
    */
  def listOfferingTransactions(): Request[ListOfferingTransactionsResult, AWSError] = js.native
  def listOfferingTransactions(callback: js.Function2[/* err */ AWSError, /* data */ ListOfferingTransactionsResult, Unit]): Request[ListOfferingTransactionsResult, AWSError] = js.native
  /**
    * Returns a list of all historical purchases, renewals, and system renewal transactions for an AWS account. The list is paginated and ordered by a descending timestamp (most recent transactions are first). The API returns a NotEligible error if the user is not permitted to invoke the operation. If you must be able to invoke this operation, contact aws-devicefarm-support@amazon.com.
    */
  def listOfferingTransactions(params: ListOfferingTransactionsRequest): Request[ListOfferingTransactionsResult, AWSError] = js.native
  def listOfferingTransactions(
    params: ListOfferingTransactionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOfferingTransactionsResult, Unit]
  ): Request[ListOfferingTransactionsResult, AWSError] = js.native
  
  /**
    * Returns a list of products or offerings that the user can manage through the API. Each offering record indicates the recurring price per unit and the frequency for that offering. The API returns a NotEligible error if the user is not permitted to invoke the operation. If you must be able to invoke this operation, contact aws-devicefarm-support@amazon.com.
    */
  def listOfferings(): Request[ListOfferingsResult, AWSError] = js.native
  def listOfferings(callback: js.Function2[/* err */ AWSError, /* data */ ListOfferingsResult, Unit]): Request[ListOfferingsResult, AWSError] = js.native
  /**
    * Returns a list of products or offerings that the user can manage through the API. Each offering record indicates the recurring price per unit and the frequency for that offering. The API returns a NotEligible error if the user is not permitted to invoke the operation. If you must be able to invoke this operation, contact aws-devicefarm-support@amazon.com.
    */
  def listOfferings(params: ListOfferingsRequest): Request[ListOfferingsResult, AWSError] = js.native
  def listOfferings(
    params: ListOfferingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOfferingsResult, Unit]
  ): Request[ListOfferingsResult, AWSError] = js.native
  
  /**
    * Gets information about projects.
    */
  def listProjects(): Request[ListProjectsResult, AWSError] = js.native
  def listProjects(callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResult, Unit]): Request[ListProjectsResult, AWSError] = js.native
  /**
    * Gets information about projects.
    */
  def listProjects(params: ListProjectsRequest): Request[ListProjectsResult, AWSError] = js.native
  def listProjects(
    params: ListProjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResult, Unit]
  ): Request[ListProjectsResult, AWSError] = js.native
  
  /**
    * Returns a list of all currently running remote access sessions.
    */
  def listRemoteAccessSessions(): Request[ListRemoteAccessSessionsResult, AWSError] = js.native
  def listRemoteAccessSessions(callback: js.Function2[/* err */ AWSError, /* data */ ListRemoteAccessSessionsResult, Unit]): Request[ListRemoteAccessSessionsResult, AWSError] = js.native
  /**
    * Returns a list of all currently running remote access sessions.
    */
  def listRemoteAccessSessions(params: ListRemoteAccessSessionsRequest): Request[ListRemoteAccessSessionsResult, AWSError] = js.native
  def listRemoteAccessSessions(
    params: ListRemoteAccessSessionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRemoteAccessSessionsResult, Unit]
  ): Request[ListRemoteAccessSessionsResult, AWSError] = js.native
  
  /**
    * Gets information about runs, given an AWS Device Farm project ARN.
    */
  def listRuns(): Request[ListRunsResult, AWSError] = js.native
  def listRuns(callback: js.Function2[/* err */ AWSError, /* data */ ListRunsResult, Unit]): Request[ListRunsResult, AWSError] = js.native
  /**
    * Gets information about runs, given an AWS Device Farm project ARN.
    */
  def listRuns(params: ListRunsRequest): Request[ListRunsResult, AWSError] = js.native
  def listRuns(
    params: ListRunsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRunsResult, Unit]
  ): Request[ListRunsResult, AWSError] = js.native
  
  /**
    * Gets information about samples, given an AWS Device Farm job ARN.
    */
  def listSamples(): Request[ListSamplesResult, AWSError] = js.native
  def listSamples(callback: js.Function2[/* err */ AWSError, /* data */ ListSamplesResult, Unit]): Request[ListSamplesResult, AWSError] = js.native
  /**
    * Gets information about samples, given an AWS Device Farm job ARN.
    */
  def listSamples(params: ListSamplesRequest): Request[ListSamplesResult, AWSError] = js.native
  def listSamples(
    params: ListSamplesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSamplesResult, Unit]
  ): Request[ListSamplesResult, AWSError] = js.native
  
  /**
    * Gets information about test suites for a given job.
    */
  def listSuites(): Request[ListSuitesResult, AWSError] = js.native
  def listSuites(callback: js.Function2[/* err */ AWSError, /* data */ ListSuitesResult, Unit]): Request[ListSuitesResult, AWSError] = js.native
  /**
    * Gets information about test suites for a given job.
    */
  def listSuites(params: ListSuitesRequest): Request[ListSuitesResult, AWSError] = js.native
  def listSuites(
    params: ListSuitesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSuitesResult, Unit]
  ): Request[ListSuitesResult, AWSError] = js.native
  
  /**
    * List the tags for an AWS Device Farm resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List the tags for an AWS Device Farm resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Gets a list of all Selenium testing projects in your account.
    */
  def listTestGridProjects(): Request[ListTestGridProjectsResult, AWSError] = js.native
  def listTestGridProjects(callback: js.Function2[/* err */ AWSError, /* data */ ListTestGridProjectsResult, Unit]): Request[ListTestGridProjectsResult, AWSError] = js.native
  /**
    * Gets a list of all Selenium testing projects in your account.
    */
  def listTestGridProjects(params: ListTestGridProjectsRequest): Request[ListTestGridProjectsResult, AWSError] = js.native
  def listTestGridProjects(
    params: ListTestGridProjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTestGridProjectsResult, Unit]
  ): Request[ListTestGridProjectsResult, AWSError] = js.native
  
  /**
    * Returns a list of the actions taken in a TestGridSession.
    */
  def listTestGridSessionActions(): Request[ListTestGridSessionActionsResult, AWSError] = js.native
  def listTestGridSessionActions(callback: js.Function2[/* err */ AWSError, /* data */ ListTestGridSessionActionsResult, Unit]): Request[ListTestGridSessionActionsResult, AWSError] = js.native
  /**
    * Returns a list of the actions taken in a TestGridSession.
    */
  def listTestGridSessionActions(params: ListTestGridSessionActionsRequest): Request[ListTestGridSessionActionsResult, AWSError] = js.native
  def listTestGridSessionActions(
    params: ListTestGridSessionActionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTestGridSessionActionsResult, Unit]
  ): Request[ListTestGridSessionActionsResult, AWSError] = js.native
  
  /**
    * Retrieves a list of artifacts created during the session.
    */
  def listTestGridSessionArtifacts(): Request[ListTestGridSessionArtifactsResult, AWSError] = js.native
  def listTestGridSessionArtifacts(callback: js.Function2[/* err */ AWSError, /* data */ ListTestGridSessionArtifactsResult, Unit]): Request[ListTestGridSessionArtifactsResult, AWSError] = js.native
  /**
    * Retrieves a list of artifacts created during the session.
    */
  def listTestGridSessionArtifacts(params: ListTestGridSessionArtifactsRequest): Request[ListTestGridSessionArtifactsResult, AWSError] = js.native
  def listTestGridSessionArtifacts(
    params: ListTestGridSessionArtifactsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTestGridSessionArtifactsResult, Unit]
  ): Request[ListTestGridSessionArtifactsResult, AWSError] = js.native
  
  /**
    * Retrieves a list of sessions for a TestGridProject.
    */
  def listTestGridSessions(): Request[ListTestGridSessionsResult, AWSError] = js.native
  def listTestGridSessions(callback: js.Function2[/* err */ AWSError, /* data */ ListTestGridSessionsResult, Unit]): Request[ListTestGridSessionsResult, AWSError] = js.native
  /**
    * Retrieves a list of sessions for a TestGridProject.
    */
  def listTestGridSessions(params: ListTestGridSessionsRequest): Request[ListTestGridSessionsResult, AWSError] = js.native
  def listTestGridSessions(
    params: ListTestGridSessionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTestGridSessionsResult, Unit]
  ): Request[ListTestGridSessionsResult, AWSError] = js.native
  
  /**
    * Gets information about tests in a given test suite.
    */
  def listTests(): Request[ListTestsResult, AWSError] = js.native
  def listTests(callback: js.Function2[/* err */ AWSError, /* data */ ListTestsResult, Unit]): Request[ListTestsResult, AWSError] = js.native
  /**
    * Gets information about tests in a given test suite.
    */
  def listTests(params: ListTestsRequest): Request[ListTestsResult, AWSError] = js.native
  def listTests(
    params: ListTestsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTestsResult, Unit]
  ): Request[ListTestsResult, AWSError] = js.native
  
  /**
    * Gets information about unique problems, such as exceptions or crashes. Unique problems are defined as a single instance of an error across a run, job, or suite. For example, if a call in your application consistently raises an exception (OutOfBoundsException in MyActivity.java:386), ListUniqueProblems returns a single entry instead of many individual entries for that exception.
    */
  def listUniqueProblems(): Request[ListUniqueProblemsResult, AWSError] = js.native
  def listUniqueProblems(callback: js.Function2[/* err */ AWSError, /* data */ ListUniqueProblemsResult, Unit]): Request[ListUniqueProblemsResult, AWSError] = js.native
  /**
    * Gets information about unique problems, such as exceptions or crashes. Unique problems are defined as a single instance of an error across a run, job, or suite. For example, if a call in your application consistently raises an exception (OutOfBoundsException in MyActivity.java:386), ListUniqueProblems returns a single entry instead of many individual entries for that exception.
    */
  def listUniqueProblems(params: ListUniqueProblemsRequest): Request[ListUniqueProblemsResult, AWSError] = js.native
  def listUniqueProblems(
    params: ListUniqueProblemsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUniqueProblemsResult, Unit]
  ): Request[ListUniqueProblemsResult, AWSError] = js.native
  
  /**
    * Gets information about uploads, given an AWS Device Farm project ARN.
    */
  def listUploads(): Request[ListUploadsResult, AWSError] = js.native
  def listUploads(callback: js.Function2[/* err */ AWSError, /* data */ ListUploadsResult, Unit]): Request[ListUploadsResult, AWSError] = js.native
  /**
    * Gets information about uploads, given an AWS Device Farm project ARN.
    */
  def listUploads(params: ListUploadsRequest): Request[ListUploadsResult, AWSError] = js.native
  def listUploads(
    params: ListUploadsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUploadsResult, Unit]
  ): Request[ListUploadsResult, AWSError] = js.native
  
  /**
    * Returns information about all Amazon Virtual Private Cloud (VPC) endpoint configurations in the AWS account.
    */
  def listVPCEConfigurations(): Request[ListVPCEConfigurationsResult, AWSError] = js.native
  def listVPCEConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListVPCEConfigurationsResult, Unit]): Request[ListVPCEConfigurationsResult, AWSError] = js.native
  /**
    * Returns information about all Amazon Virtual Private Cloud (VPC) endpoint configurations in the AWS account.
    */
  def listVPCEConfigurations(params: ListVPCEConfigurationsRequest): Request[ListVPCEConfigurationsResult, AWSError] = js.native
  def listVPCEConfigurations(
    params: ListVPCEConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVPCEConfigurationsResult, Unit]
  ): Request[ListVPCEConfigurationsResult, AWSError] = js.native
  
  /**
    * Immediately purchases offerings for an AWS account. Offerings renew with the latest total purchased quantity for an offering, unless the renewal was overridden. The API returns a NotEligible error if the user is not permitted to invoke the operation. If you must be able to invoke this operation, contact aws-devicefarm-support@amazon.com.
    */
  def purchaseOffering(): Request[PurchaseOfferingResult, AWSError] = js.native
  def purchaseOffering(callback: js.Function2[/* err */ AWSError, /* data */ PurchaseOfferingResult, Unit]): Request[PurchaseOfferingResult, AWSError] = js.native
  /**
    * Immediately purchases offerings for an AWS account. Offerings renew with the latest total purchased quantity for an offering, unless the renewal was overridden. The API returns a NotEligible error if the user is not permitted to invoke the operation. If you must be able to invoke this operation, contact aws-devicefarm-support@amazon.com.
    */
  def purchaseOffering(params: PurchaseOfferingRequest): Request[PurchaseOfferingResult, AWSError] = js.native
  def purchaseOffering(
    params: PurchaseOfferingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PurchaseOfferingResult, Unit]
  ): Request[PurchaseOfferingResult, AWSError] = js.native
  
  /**
    * Explicitly sets the quantity of devices to renew for an offering, starting from the effectiveDate of the next period. The API returns a NotEligible error if the user is not permitted to invoke the operation. If you must be able to invoke this operation, contact aws-devicefarm-support@amazon.com.
    */
  def renewOffering(): Request[RenewOfferingResult, AWSError] = js.native
  def renewOffering(callback: js.Function2[/* err */ AWSError, /* data */ RenewOfferingResult, Unit]): Request[RenewOfferingResult, AWSError] = js.native
  /**
    * Explicitly sets the quantity of devices to renew for an offering, starting from the effectiveDate of the next period. The API returns a NotEligible error if the user is not permitted to invoke the operation. If you must be able to invoke this operation, contact aws-devicefarm-support@amazon.com.
    */
  def renewOffering(params: RenewOfferingRequest): Request[RenewOfferingResult, AWSError] = js.native
  def renewOffering(
    params: RenewOfferingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RenewOfferingResult, Unit]
  ): Request[RenewOfferingResult, AWSError] = js.native
  
  /**
    * Schedules a run.
    */
  def scheduleRun(): Request[ScheduleRunResult, AWSError] = js.native
  def scheduleRun(callback: js.Function2[/* err */ AWSError, /* data */ ScheduleRunResult, Unit]): Request[ScheduleRunResult, AWSError] = js.native
  /**
    * Schedules a run.
    */
  def scheduleRun(params: ScheduleRunRequest): Request[ScheduleRunResult, AWSError] = js.native
  def scheduleRun(
    params: ScheduleRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ScheduleRunResult, Unit]
  ): Request[ScheduleRunResult, AWSError] = js.native
  
  /**
    * Initiates a stop request for the current job. AWS Device Farm immediately stops the job on the device where tests have not started. You are not billed for this device. On the device where tests have started, setup suite and teardown suite tests run to completion on the device. You are billed for setup, teardown, and any tests that were in progress or already completed.
    */
  def stopJob(): Request[StopJobResult, AWSError] = js.native
  def stopJob(callback: js.Function2[/* err */ AWSError, /* data */ StopJobResult, Unit]): Request[StopJobResult, AWSError] = js.native
  /**
    * Initiates a stop request for the current job. AWS Device Farm immediately stops the job on the device where tests have not started. You are not billed for this device. On the device where tests have started, setup suite and teardown suite tests run to completion on the device. You are billed for setup, teardown, and any tests that were in progress or already completed.
    */
  def stopJob(params: StopJobRequest): Request[StopJobResult, AWSError] = js.native
  def stopJob(params: StopJobRequest, callback: js.Function2[/* err */ AWSError, /* data */ StopJobResult, Unit]): Request[StopJobResult, AWSError] = js.native
  
  /**
    * Ends a specified remote access session.
    */
  def stopRemoteAccessSession(): Request[StopRemoteAccessSessionResult, AWSError] = js.native
  def stopRemoteAccessSession(callback: js.Function2[/* err */ AWSError, /* data */ StopRemoteAccessSessionResult, Unit]): Request[StopRemoteAccessSessionResult, AWSError] = js.native
  /**
    * Ends a specified remote access session.
    */
  def stopRemoteAccessSession(params: StopRemoteAccessSessionRequest): Request[StopRemoteAccessSessionResult, AWSError] = js.native
  def stopRemoteAccessSession(
    params: StopRemoteAccessSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopRemoteAccessSessionResult, Unit]
  ): Request[StopRemoteAccessSessionResult, AWSError] = js.native
  
  /**
    * Initiates a stop request for the current test run. AWS Device Farm immediately stops the run on devices where tests have not started. You are not billed for these devices. On devices where tests have started executing, setup suite and teardown suite tests run to completion on those devices. You are billed for setup, teardown, and any tests that were in progress or already completed.
    */
  def stopRun(): Request[StopRunResult, AWSError] = js.native
  def stopRun(callback: js.Function2[/* err */ AWSError, /* data */ StopRunResult, Unit]): Request[StopRunResult, AWSError] = js.native
  /**
    * Initiates a stop request for the current test run. AWS Device Farm immediately stops the run on devices where tests have not started. You are not billed for these devices. On devices where tests have started executing, setup suite and teardown suite tests run to completion on those devices. You are billed for setup, teardown, and any tests that were in progress or already completed.
    */
  def stopRun(params: StopRunRequest): Request[StopRunResult, AWSError] = js.native
  def stopRun(params: StopRunRequest, callback: js.Function2[/* err */ AWSError, /* data */ StopRunResult, Unit]): Request[StopRunResult, AWSError] = js.native
  
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are also deleted.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are also deleted.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Deletes the specified tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Deletes the specified tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates information about a private device instance.
    */
  def updateDeviceInstance(): Request[UpdateDeviceInstanceResult, AWSError] = js.native
  def updateDeviceInstance(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeviceInstanceResult, Unit]): Request[UpdateDeviceInstanceResult, AWSError] = js.native
  /**
    * Updates information about a private device instance.
    */
  def updateDeviceInstance(params: UpdateDeviceInstanceRequest): Request[UpdateDeviceInstanceResult, AWSError] = js.native
  def updateDeviceInstance(
    params: UpdateDeviceInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeviceInstanceResult, Unit]
  ): Request[UpdateDeviceInstanceResult, AWSError] = js.native
  
  /**
    * Modifies the name, description, and rules in a device pool given the attributes and the pool ARN. Rule updates are all-or-nothing, meaning they can only be updated as a whole (or not at all).
    */
  def updateDevicePool(): Request[UpdateDevicePoolResult, AWSError] = js.native
  def updateDevicePool(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDevicePoolResult, Unit]): Request[UpdateDevicePoolResult, AWSError] = js.native
  /**
    * Modifies the name, description, and rules in a device pool given the attributes and the pool ARN. Rule updates are all-or-nothing, meaning they can only be updated as a whole (or not at all).
    */
  def updateDevicePool(params: UpdateDevicePoolRequest): Request[UpdateDevicePoolResult, AWSError] = js.native
  def updateDevicePool(
    params: UpdateDevicePoolRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDevicePoolResult, Unit]
  ): Request[UpdateDevicePoolResult, AWSError] = js.native
  
  /**
    * Updates information about an existing private device instance profile.
    */
  def updateInstanceProfile(): Request[UpdateInstanceProfileResult, AWSError] = js.native
  def updateInstanceProfile(callback: js.Function2[/* err */ AWSError, /* data */ UpdateInstanceProfileResult, Unit]): Request[UpdateInstanceProfileResult, AWSError] = js.native
  /**
    * Updates information about an existing private device instance profile.
    */
  def updateInstanceProfile(params: UpdateInstanceProfileRequest): Request[UpdateInstanceProfileResult, AWSError] = js.native
  def updateInstanceProfile(
    params: UpdateInstanceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateInstanceProfileResult, Unit]
  ): Request[UpdateInstanceProfileResult, AWSError] = js.native
  
  /**
    * Updates the network profile.
    */
  def updateNetworkProfile(): Request[UpdateNetworkProfileResult, AWSError] = js.native
  def updateNetworkProfile(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNetworkProfileResult, Unit]): Request[UpdateNetworkProfileResult, AWSError] = js.native
  /**
    * Updates the network profile.
    */
  def updateNetworkProfile(params: UpdateNetworkProfileRequest): Request[UpdateNetworkProfileResult, AWSError] = js.native
  def updateNetworkProfile(
    params: UpdateNetworkProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNetworkProfileResult, Unit]
  ): Request[UpdateNetworkProfileResult, AWSError] = js.native
  
  /**
    * Modifies the specified project name, given the project ARN and a new name.
    */
  def updateProject(): Request[UpdateProjectResult, AWSError] = js.native
  def updateProject(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectResult, Unit]): Request[UpdateProjectResult, AWSError] = js.native
  /**
    * Modifies the specified project name, given the project ARN and a new name.
    */
  def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResult, AWSError] = js.native
  def updateProject(
    params: UpdateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectResult, Unit]
  ): Request[UpdateProjectResult, AWSError] = js.native
  
  /**
    * Change details of a project.
    */
  def updateTestGridProject(): Request[UpdateTestGridProjectResult, AWSError] = js.native
  def updateTestGridProject(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTestGridProjectResult, Unit]): Request[UpdateTestGridProjectResult, AWSError] = js.native
  /**
    * Change details of a project.
    */
  def updateTestGridProject(params: UpdateTestGridProjectRequest): Request[UpdateTestGridProjectResult, AWSError] = js.native
  def updateTestGridProject(
    params: UpdateTestGridProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTestGridProjectResult, Unit]
  ): Request[UpdateTestGridProjectResult, AWSError] = js.native
  
  /**
    * Updates an uploaded test spec.
    */
  def updateUpload(): Request[UpdateUploadResult, AWSError] = js.native
  def updateUpload(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUploadResult, Unit]): Request[UpdateUploadResult, AWSError] = js.native
  /**
    * Updates an uploaded test spec.
    */
  def updateUpload(params: UpdateUploadRequest): Request[UpdateUploadResult, AWSError] = js.native
  def updateUpload(
    params: UpdateUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUploadResult, Unit]
  ): Request[UpdateUploadResult, AWSError] = js.native
  
  /**
    * Updates information about an Amazon Virtual Private Cloud (VPC) endpoint configuration.
    */
  def updateVPCEConfiguration(): Request[UpdateVPCEConfigurationResult, AWSError] = js.native
  def updateVPCEConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVPCEConfigurationResult, Unit]): Request[UpdateVPCEConfigurationResult, AWSError] = js.native
  /**
    * Updates information about an Amazon Virtual Private Cloud (VPC) endpoint configuration.
    */
  def updateVPCEConfiguration(params: UpdateVPCEConfigurationRequest): Request[UpdateVPCEConfigurationResult, AWSError] = js.native
  def updateVPCEConfiguration(
    params: UpdateVPCEConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVPCEConfigurationResult, Unit]
  ): Request[UpdateVPCEConfigurationResult, AWSError] = js.native
}
