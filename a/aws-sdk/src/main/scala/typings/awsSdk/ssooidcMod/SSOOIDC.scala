package typings.awsSdk.ssooidcMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSOOIDC extends Service {
  @JSName("config")
  var config_SSOOIDC: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates and returns an access token for the authorized client. The access token issued will be used to fetch short-term credentials for the assigned roles in the AWS account.
    */
  def createToken(): Request[CreateTokenResponse, AWSError] = js.native
  def createToken(callback: js.Function2[/* err */ AWSError, /* data */ CreateTokenResponse, Unit]): Request[CreateTokenResponse, AWSError] = js.native
  /**
    * Creates and returns an access token for the authorized client. The access token issued will be used to fetch short-term credentials for the assigned roles in the AWS account.
    */
  def createToken(params: CreateTokenRequest): Request[CreateTokenResponse, AWSError] = js.native
  def createToken(
    params: CreateTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTokenResponse, Unit]
  ): Request[CreateTokenResponse, AWSError] = js.native
  /**
    * Registers a client with AWS SSO. This allows clients to initiate device authorization. The output should be persisted for reuse through many authentication requests.
    */
  def registerClient(): Request[RegisterClientResponse, AWSError] = js.native
  def registerClient(callback: js.Function2[/* err */ AWSError, /* data */ RegisterClientResponse, Unit]): Request[RegisterClientResponse, AWSError] = js.native
  /**
    * Registers a client with AWS SSO. This allows clients to initiate device authorization. The output should be persisted for reuse through many authentication requests.
    */
  def registerClient(params: RegisterClientRequest): Request[RegisterClientResponse, AWSError] = js.native
  def registerClient(
    params: RegisterClientRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterClientResponse, Unit]
  ): Request[RegisterClientResponse, AWSError] = js.native
  /**
    * Initiates device authorization by requesting a pair of verification codes from the authorization service.
    */
  def startDeviceAuthorization(): Request[StartDeviceAuthorizationResponse, AWSError] = js.native
  def startDeviceAuthorization(callback: js.Function2[/* err */ AWSError, /* data */ StartDeviceAuthorizationResponse, Unit]): Request[StartDeviceAuthorizationResponse, AWSError] = js.native
  /**
    * Initiates device authorization by requesting a pair of verification codes from the authorization service.
    */
  def startDeviceAuthorization(params: StartDeviceAuthorizationRequest): Request[StartDeviceAuthorizationResponse, AWSError] = js.native
  def startDeviceAuthorization(
    params: StartDeviceAuthorizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDeviceAuthorizationResponse, Unit]
  ): Request[StartDeviceAuthorizationResponse, AWSError] = js.native
}

