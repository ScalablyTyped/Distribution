package typings.awsSdk.transferMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transfer extends Service {
  @JSName("config")
  var config_Transfer: ConfigBase with ClientConfiguration = js.native
  /**
    * Instantiates an autoscaling virtual server based on Secure File Transfer Protocol (SFTP) in AWS. When you make updates to your server or when you work with users, use the service-generated ServerId property that is assigned to the newly created server.
    */
  def createServer(): Request[CreateServerResponse, AWSError] = js.native
  def createServer(callback: js.Function2[/* err */ AWSError, /* data */ CreateServerResponse, Unit]): Request[CreateServerResponse, AWSError] = js.native
  /**
    * Instantiates an autoscaling virtual server based on Secure File Transfer Protocol (SFTP) in AWS. When you make updates to your server or when you work with users, use the service-generated ServerId property that is assigned to the newly created server.
    */
  def createServer(params: CreateServerRequest): Request[CreateServerResponse, AWSError] = js.native
  def createServer(
    params: CreateServerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServerResponse, Unit]
  ): Request[CreateServerResponse, AWSError] = js.native
  /**
    * Creates a user and associates them with an existing Secure File Transfer Protocol (SFTP) server. You can only create and associate users with SFTP servers that have the IdentityProviderType set to SERVICE_MANAGED. Using parameters for CreateUser, you can specify the user name, set the home directory, store the user's public key, and assign the user's AWS Identity and Access Management (IAM) role. You can also optionally add a scope-down policy, and assign metadata with tags that can be used to group and search for users.
    */
  def createUser(): Request[CreateUserResponse, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Creates a user and associates them with an existing Secure File Transfer Protocol (SFTP) server. You can only create and associate users with SFTP servers that have the IdentityProviderType set to SERVICE_MANAGED. Using parameters for CreateUser, you can specify the user name, set the home directory, store the user's public key, and assign the user's AWS Identity and Access Management (IAM) role. You can also optionally add a scope-down policy, and assign metadata with tags that can be used to group and search for users.
    */
  def createUser(params: CreateUserRequest): Request[CreateUserResponse, AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]
  ): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Deletes the Secure File Transfer Protocol (SFTP) server that you specify. No response returns from this operation.
    */
  def deleteServer(): Request[js.Object, AWSError] = js.native
  def deleteServer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the Secure File Transfer Protocol (SFTP) server that you specify. No response returns from this operation.
    */
  def deleteServer(params: DeleteServerRequest): Request[js.Object, AWSError] = js.native
  def deleteServer(
    params: DeleteServerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a user's Secure Shell (SSH) public key. No response is returned from this operation.
    */
  def deleteSshPublicKey(): Request[js.Object, AWSError] = js.native
  def deleteSshPublicKey(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a user's Secure Shell (SSH) public key. No response is returned from this operation.
    */
  def deleteSshPublicKey(params: DeleteSshPublicKeyRequest): Request[js.Object, AWSError] = js.native
  def deleteSshPublicKey(
    params: DeleteSshPublicKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the user belonging to the server you specify. No response returns from this operation.  When you delete a user from a server, the user's information is lost. 
    */
  def deleteUser(): Request[js.Object, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the user belonging to the server you specify. No response returns from this operation.  When you delete a user from a server, the user's information is lost. 
    */
  def deleteUser(params: DeleteUserRequest): Request[js.Object, AWSError] = js.native
  def deleteUser(params: DeleteUserRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Describes the server that you specify by passing the ServerId parameter. The response contains a description of the server's properties. When you set EndpointType to VPC, the response will contain the EndpointDetails.
    */
  def describeServer(): Request[DescribeServerResponse, AWSError] = js.native
  def describeServer(callback: js.Function2[/* err */ AWSError, /* data */ DescribeServerResponse, Unit]): Request[DescribeServerResponse, AWSError] = js.native
  /**
    * Describes the server that you specify by passing the ServerId parameter. The response contains a description of the server's properties. When you set EndpointType to VPC, the response will contain the EndpointDetails.
    */
  def describeServer(params: DescribeServerRequest): Request[DescribeServerResponse, AWSError] = js.native
  def describeServer(
    params: DescribeServerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServerResponse, Unit]
  ): Request[DescribeServerResponse, AWSError] = js.native
  /**
    * Describes the user assigned to a specific server, as identified by its ServerId property. The response from this call returns the properties of the user associated with the ServerId value that was specified.
    */
  def describeUser(): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Describes the user assigned to a specific server, as identified by its ServerId property. The response from this call returns the properties of the user associated with the ServerId value that was specified.
    */
  def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(
    params: DescribeUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]
  ): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Adds a Secure Shell (SSH) public key to a user account identified by a UserName value assigned to a specific server, identified by ServerId. The response returns the UserName value, the ServerId value, and the name of the SshPublicKeyId.
    */
  def importSshPublicKey(): Request[ImportSshPublicKeyResponse, AWSError] = js.native
  def importSshPublicKey(callback: js.Function2[/* err */ AWSError, /* data */ ImportSshPublicKeyResponse, Unit]): Request[ImportSshPublicKeyResponse, AWSError] = js.native
  /**
    * Adds a Secure Shell (SSH) public key to a user account identified by a UserName value assigned to a specific server, identified by ServerId. The response returns the UserName value, the ServerId value, and the name of the SshPublicKeyId.
    */
  def importSshPublicKey(params: ImportSshPublicKeyRequest): Request[ImportSshPublicKeyResponse, AWSError] = js.native
  def importSshPublicKey(
    params: ImportSshPublicKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportSshPublicKeyResponse, Unit]
  ): Request[ImportSshPublicKeyResponse, AWSError] = js.native
  /**
    * Lists the Secure File Transfer Protocol (SFTP) servers that are associated with your AWS account.
    */
  def listServers(): Request[ListServersResponse, AWSError] = js.native
  def listServers(callback: js.Function2[/* err */ AWSError, /* data */ ListServersResponse, Unit]): Request[ListServersResponse, AWSError] = js.native
  /**
    * Lists the Secure File Transfer Protocol (SFTP) servers that are associated with your AWS account.
    */
  def listServers(params: ListServersRequest): Request[ListServersResponse, AWSError] = js.native
  def listServers(
    params: ListServersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServersResponse, Unit]
  ): Request[ListServersResponse, AWSError] = js.native
  /**
    * Lists all of the tags associated with the Amazon Resource Number (ARN) you specify. The resource can be a user, server, or role.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all of the tags associated with the Amazon Resource Number (ARN) you specify. The resource can be a user, server, or role.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the users for the server that you specify by passing the ServerId parameter.
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Lists the users for the server that you specify by passing the ServerId parameter.
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Changes the state of a Secure File Transfer Protocol (SFTP) server from OFFLINE to ONLINE. It has no impact on an SFTP server that is already ONLINE. An ONLINE server can accept and process file transfer jobs. The state of STARTING indicates that the server is in an intermediate state, either not fully able to respond, or not fully online. The values of START_FAILED can indicate an error condition.  No response is returned from this call.
    */
  def startServer(): Request[js.Object, AWSError] = js.native
  def startServer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Changes the state of a Secure File Transfer Protocol (SFTP) server from OFFLINE to ONLINE. It has no impact on an SFTP server that is already ONLINE. An ONLINE server can accept and process file transfer jobs. The state of STARTING indicates that the server is in an intermediate state, either not fully able to respond, or not fully online. The values of START_FAILED can indicate an error condition.  No response is returned from this call.
    */
  def startServer(params: StartServerRequest): Request[js.Object, AWSError] = js.native
  def startServer(params: StartServerRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Changes the state of an SFTP server from ONLINE to OFFLINE. An OFFLINE server cannot accept and process file transfer jobs. Information tied to your server such as server and user properties are not affected by stopping your server. Stopping a server will not reduce or impact your Secure File Transfer Protocol (SFTP) endpoint billing. The state of STOPPING indicates that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of STOP_FAILED can indicate an error condition. No response is returned from this call.
    */
  def stopServer(): Request[js.Object, AWSError] = js.native
  def stopServer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Changes the state of an SFTP server from ONLINE to OFFLINE. An OFFLINE server cannot accept and process file transfer jobs. Information tied to your server such as server and user properties are not affected by stopping your server. Stopping a server will not reduce or impact your Secure File Transfer Protocol (SFTP) endpoint billing. The state of STOPPING indicates that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of STOP_FAILED can indicate an error condition. No response is returned from this call.
    */
  def stopServer(params: StopServerRequest): Request[js.Object, AWSError] = js.native
  def stopServer(params: StopServerRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Attaches a key-value pair to a resource, as identified by its Amazon Resource Name (ARN). Resources are users, servers, roles, and other entities. There is no response returned from this call.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Attaches a key-value pair to a resource, as identified by its Amazon Resource Name (ARN). Resources are users, servers, roles, and other entities. There is no response returned from this call.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * If the IdentityProviderType of the server is API_Gateway, tests whether your API Gateway is set up successfully. We highly recommend that you call this operation to test your authentication method as soon as you create your server. By doing so, you can troubleshoot issues with the API Gateway integration to ensure that your users can successfully use the service.
    */
  def testIdentityProvider(): Request[TestIdentityProviderResponse, AWSError] = js.native
  def testIdentityProvider(callback: js.Function2[/* err */ AWSError, /* data */ TestIdentityProviderResponse, Unit]): Request[TestIdentityProviderResponse, AWSError] = js.native
  /**
    * If the IdentityProviderType of the server is API_Gateway, tests whether your API Gateway is set up successfully. We highly recommend that you call this operation to test your authentication method as soon as you create your server. By doing so, you can troubleshoot issues with the API Gateway integration to ensure that your users can successfully use the service.
    */
  def testIdentityProvider(params: TestIdentityProviderRequest): Request[TestIdentityProviderResponse, AWSError] = js.native
  def testIdentityProvider(
    params: TestIdentityProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TestIdentityProviderResponse, Unit]
  ): Request[TestIdentityProviderResponse, AWSError] = js.native
  /**
    * Detaches a key-value pair from a resource, as identified by its Amazon Resource Name (ARN). Resources are users, servers, roles, and other entities. No response is returned from this call.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Detaches a key-value pair from a resource, as identified by its Amazon Resource Name (ARN). Resources are users, servers, roles, and other entities. No response is returned from this call.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates the server properties after that server has been created. The UpdateServer call returns the ServerId of the Secure File Transfer Protocol (SFTP) server you updated.
    */
  def updateServer(): Request[UpdateServerResponse, AWSError] = js.native
  def updateServer(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServerResponse, Unit]): Request[UpdateServerResponse, AWSError] = js.native
  /**
    * Updates the server properties after that server has been created. The UpdateServer call returns the ServerId of the Secure File Transfer Protocol (SFTP) server you updated.
    */
  def updateServer(params: UpdateServerRequest): Request[UpdateServerResponse, AWSError] = js.native
  def updateServer(
    params: UpdateServerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServerResponse, Unit]
  ): Request[UpdateServerResponse, AWSError] = js.native
  /**
    * Assigns new properties to a user. Parameters you pass modify any or all of the following: the home directory, role, and policy for the UserName and ServerId you specify. The response returns the ServerId and the UserName for the updated user.
    */
  def updateUser(): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]): Request[UpdateUserResponse, AWSError] = js.native
  /**
    * Assigns new properties to a user. Parameters you pass modify any or all of the following: the home directory, role, and policy for the UserName and ServerId you specify. The response returns the ServerId and the UserName for the updated user.
    */
  def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(
    params: UpdateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]
  ): Request[UpdateUserResponse, AWSError] = js.native
}

