package typings.awsSdk.sagemakeredgeMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SagemakerEdge extends Service {
  
  @JSName("config")
  var config_SagemakerEdge: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Use to get the active deployments from a device.
    */
  def getDeployments(): Request[GetDeploymentsResult, AWSError] = js.native
  def getDeployments(callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentsResult, Unit]): Request[GetDeploymentsResult, AWSError] = js.native
  /**
    * Use to get the active deployments from a device.
    */
  def getDeployments(params: GetDeploymentsRequest): Request[GetDeploymentsResult, AWSError] = js.native
  def getDeployments(
    params: GetDeploymentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentsResult, Unit]
  ): Request[GetDeploymentsResult, AWSError] = js.native
  
  /**
    * Use to check if a device is registered with SageMaker Edge Manager.
    */
  def getDeviceRegistration(): Request[GetDeviceRegistrationResult, AWSError] = js.native
  def getDeviceRegistration(callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceRegistrationResult, Unit]): Request[GetDeviceRegistrationResult, AWSError] = js.native
  /**
    * Use to check if a device is registered with SageMaker Edge Manager.
    */
  def getDeviceRegistration(params: GetDeviceRegistrationRequest): Request[GetDeviceRegistrationResult, AWSError] = js.native
  def getDeviceRegistration(
    params: GetDeviceRegistrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceRegistrationResult, Unit]
  ): Request[GetDeviceRegistrationResult, AWSError] = js.native
  
  /**
    * Use to get the current status of devices registered on SageMaker Edge Manager.
    */
  def sendHeartbeat(): Request[js.Object, AWSError] = js.native
  def sendHeartbeat(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Use to get the current status of devices registered on SageMaker Edge Manager.
    */
  def sendHeartbeat(params: SendHeartbeatRequest): Request[js.Object, AWSError] = js.native
  def sendHeartbeat(
    params: SendHeartbeatRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}
