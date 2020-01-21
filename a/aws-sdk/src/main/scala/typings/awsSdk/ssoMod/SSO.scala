package typings.awsSdk.ssoMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSO extends Service {
  @JSName("config")
  var config_SSO: ConfigBase with ClientConfiguration = js.native
  /**
    * Returns the STS short-term credentials for a given role name that is assigned to the user.
    */
  def getRoleCredentials(): Request[GetRoleCredentialsResponse, AWSError] = js.native
  def getRoleCredentials(callback: js.Function2[/* err */ AWSError, /* data */ GetRoleCredentialsResponse, Unit]): Request[GetRoleCredentialsResponse, AWSError] = js.native
  /**
    * Returns the STS short-term credentials for a given role name that is assigned to the user.
    */
  def getRoleCredentials(params: GetRoleCredentialsRequest): Request[GetRoleCredentialsResponse, AWSError] = js.native
  def getRoleCredentials(
    params: GetRoleCredentialsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRoleCredentialsResponse, Unit]
  ): Request[GetRoleCredentialsResponse, AWSError] = js.native
  /**
    * Lists all roles that are assigned to the user for a given AWS account.
    */
  def listAccountRoles(): Request[ListAccountRolesResponse, AWSError] = js.native
  def listAccountRoles(callback: js.Function2[/* err */ AWSError, /* data */ ListAccountRolesResponse, Unit]): Request[ListAccountRolesResponse, AWSError] = js.native
  /**
    * Lists all roles that are assigned to the user for a given AWS account.
    */
  def listAccountRoles(params: ListAccountRolesRequest): Request[ListAccountRolesResponse, AWSError] = js.native
  def listAccountRoles(
    params: ListAccountRolesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccountRolesResponse, Unit]
  ): Request[ListAccountRolesResponse, AWSError] = js.native
  /**
    * Lists all AWS accounts assigned to the user. These AWS accounts are assigned by the administrator of the account. For more information, see Assign User Access in the AWS SSO User Guide. This operation returns a paginated response.
    */
  def listAccounts(): Request[ListAccountsResponse, AWSError] = js.native
  def listAccounts(callback: js.Function2[/* err */ AWSError, /* data */ ListAccountsResponse, Unit]): Request[ListAccountsResponse, AWSError] = js.native
  /**
    * Lists all AWS accounts assigned to the user. These AWS accounts are assigned by the administrator of the account. For more information, see Assign User Access in the AWS SSO User Guide. This operation returns a paginated response.
    */
  def listAccounts(params: ListAccountsRequest): Request[ListAccountsResponse, AWSError] = js.native
  def listAccounts(
    params: ListAccountsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccountsResponse, Unit]
  ): Request[ListAccountsResponse, AWSError] = js.native
  /**
    * Removes the client- and server-side session that is associated with the user.
    */
  def logout(): Request[js.Object, AWSError] = js.native
  def logout(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the client- and server-side session that is associated with the user.
    */
  def logout(params: LogoutRequest): Request[js.Object, AWSError] = js.native
  def logout(params: LogoutRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
}

