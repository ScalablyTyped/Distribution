package typings.awsSdk.clientsTransferMod

import typings.awsSdk.anon.DescribeServerRequestwait
import typings.awsSdk.awsSdkStrings.serverOffline
import typings.awsSdk.awsSdkStrings.serverOnline
import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transfer extends Service {
  
  @JSName("config")
  var config_Transfer: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Used by administrators to choose which groups in the directory should have access to upload and download files over the enabled protocols using Transfer Family. For example, a Microsoft Active Directory might contain 50,000 users, but only a small fraction might need the ability to transfer files to the server. An administrator can use CreateAccess to limit the access to the correct set of users who need this ability.
    */
  def createAccess(): Request[CreateAccessResponse, AWSError] = js.native
  def createAccess(callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessResponse, Unit]): Request[CreateAccessResponse, AWSError] = js.native
  /**
    * Used by administrators to choose which groups in the directory should have access to upload and download files over the enabled protocols using Transfer Family. For example, a Microsoft Active Directory might contain 50,000 users, but only a small fraction might need the ability to transfer files to the server. An administrator can use CreateAccess to limit the access to the correct set of users who need this ability.
    */
  def createAccess(params: CreateAccessRequest): Request[CreateAccessResponse, AWSError] = js.native
  def createAccess(
    params: CreateAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessResponse, Unit]
  ): Request[CreateAccessResponse, AWSError] = js.native
  
  /**
    * Creates an agreement. An agreement is a bilateral trading partner agreement, or partnership, between an Transfer Family server and an AS2 process. The agreement defines the file and message transfer relationship between the server and the AS2 process. To define an agreement, Transfer Family combines a server, local profile, partner profile, certificate, and other attributes. The partner is identified with the PartnerProfileId, and the AS2 process is identified with the LocalProfileId.
    */
  def createAgreement(): Request[CreateAgreementResponse, AWSError] = js.native
  def createAgreement(callback: js.Function2[/* err */ AWSError, /* data */ CreateAgreementResponse, Unit]): Request[CreateAgreementResponse, AWSError] = js.native
  /**
    * Creates an agreement. An agreement is a bilateral trading partner agreement, or partnership, between an Transfer Family server and an AS2 process. The agreement defines the file and message transfer relationship between the server and the AS2 process. To define an agreement, Transfer Family combines a server, local profile, partner profile, certificate, and other attributes. The partner is identified with the PartnerProfileId, and the AS2 process is identified with the LocalProfileId.
    */
  def createAgreement(params: CreateAgreementRequest): Request[CreateAgreementResponse, AWSError] = js.native
  def createAgreement(
    params: CreateAgreementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAgreementResponse, Unit]
  ): Request[CreateAgreementResponse, AWSError] = js.native
  
  /**
    * Creates the connector, which captures the parameters for an outbound connection for the AS2 protocol. The connector is required for sending files to an externally hosted AS2 server. For more details about connectors, see Create AS2 connectors.
    */
  def createConnector(): Request[CreateConnectorResponse, AWSError] = js.native
  def createConnector(callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectorResponse, Unit]): Request[CreateConnectorResponse, AWSError] = js.native
  /**
    * Creates the connector, which captures the parameters for an outbound connection for the AS2 protocol. The connector is required for sending files to an externally hosted AS2 server. For more details about connectors, see Create AS2 connectors.
    */
  def createConnector(params: CreateConnectorRequest): Request[CreateConnectorResponse, AWSError] = js.native
  def createConnector(
    params: CreateConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectorResponse, Unit]
  ): Request[CreateConnectorResponse, AWSError] = js.native
  
  /**
    * Creates the local or partner profile to use for AS2 transfers.
    */
  def createProfile(): Request[CreateProfileResponse, AWSError] = js.native
  def createProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateProfileResponse, Unit]): Request[CreateProfileResponse, AWSError] = js.native
  /**
    * Creates the local or partner profile to use for AS2 transfers.
    */
  def createProfile(params: CreateProfileRequest): Request[CreateProfileResponse, AWSError] = js.native
  def createProfile(
    params: CreateProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProfileResponse, Unit]
  ): Request[CreateProfileResponse, AWSError] = js.native
  
  /**
    * Instantiates an auto-scaling virtual server based on the selected file transfer protocol in Amazon Web Services. When you make updates to your file transfer protocol-enabled server or when you work with users, use the service-generated ServerId property that is assigned to the newly created server.
    */
  def createServer(): Request[CreateServerResponse, AWSError] = js.native
  def createServer(callback: js.Function2[/* err */ AWSError, /* data */ CreateServerResponse, Unit]): Request[CreateServerResponse, AWSError] = js.native
  /**
    * Instantiates an auto-scaling virtual server based on the selected file transfer protocol in Amazon Web Services. When you make updates to your file transfer protocol-enabled server or when you work with users, use the service-generated ServerId property that is assigned to the newly created server.
    */
  def createServer(params: CreateServerRequest): Request[CreateServerResponse, AWSError] = js.native
  def createServer(
    params: CreateServerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServerResponse, Unit]
  ): Request[CreateServerResponse, AWSError] = js.native
  
  /**
    * Creates a user and associates them with an existing file transfer protocol-enabled server. You can only create and associate users with servers that have the IdentityProviderType set to SERVICE_MANAGED. Using parameters for CreateUser, you can specify the user name, set the home directory, store the user's public key, and assign the user's Identity and Access Management (IAM) role. You can also optionally add a session policy, and assign metadata with tags that can be used to group and search for users.
    */
  def createUser(): Request[CreateUserResponse, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Creates a user and associates them with an existing file transfer protocol-enabled server. You can only create and associate users with servers that have the IdentityProviderType set to SERVICE_MANAGED. Using parameters for CreateUser, you can specify the user name, set the home directory, store the user's public key, and assign the user's Identity and Access Management (IAM) role. You can also optionally add a session policy, and assign metadata with tags that can be used to group and search for users.
    */
  def createUser(params: CreateUserRequest): Request[CreateUserResponse, AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]
  ): Request[CreateUserResponse, AWSError] = js.native
  
  /**
    *  Allows you to create a workflow with specified steps and step details the workflow invokes after file transfer completes. After creating a workflow, you can associate the workflow created with any transfer servers by specifying the workflow-details field in CreateServer and UpdateServer operations. 
    */
  def createWorkflow(): Request[CreateWorkflowResponse, AWSError] = js.native
  def createWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkflowResponse, Unit]): Request[CreateWorkflowResponse, AWSError] = js.native
  /**
    *  Allows you to create a workflow with specified steps and step details the workflow invokes after file transfer completes. After creating a workflow, you can associate the workflow created with any transfer servers by specifying the workflow-details field in CreateServer and UpdateServer operations. 
    */
  def createWorkflow(params: CreateWorkflowRequest): Request[CreateWorkflowResponse, AWSError] = js.native
  def createWorkflow(
    params: CreateWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkflowResponse, Unit]
  ): Request[CreateWorkflowResponse, AWSError] = js.native
  
  /**
    * Allows you to delete the access specified in the ServerID and ExternalID parameters.
    */
  def deleteAccess(): Request[js.Object, AWSError] = js.native
  def deleteAccess(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Allows you to delete the access specified in the ServerID and ExternalID parameters.
    */
  def deleteAccess(params: DeleteAccessRequest): Request[js.Object, AWSError] = js.native
  def deleteAccess(
    params: DeleteAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Delete the agreement that's specified in the provided AgreementId.
    */
  def deleteAgreement(): Request[js.Object, AWSError] = js.native
  def deleteAgreement(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete the agreement that's specified in the provided AgreementId.
    */
  def deleteAgreement(params: DeleteAgreementRequest): Request[js.Object, AWSError] = js.native
  def deleteAgreement(
    params: DeleteAgreementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the certificate that's specified in the CertificateId parameter.
    */
  def deleteCertificate(): Request[js.Object, AWSError] = js.native
  def deleteCertificate(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the certificate that's specified in the CertificateId parameter.
    */
  def deleteCertificate(params: DeleteCertificateRequest): Request[js.Object, AWSError] = js.native
  def deleteCertificate(
    params: DeleteCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the agreement that's specified in the provided ConnectorId.
    */
  def deleteConnector(): Request[js.Object, AWSError] = js.native
  def deleteConnector(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the agreement that's specified in the provided ConnectorId.
    */
  def deleteConnector(params: DeleteConnectorRequest): Request[js.Object, AWSError] = js.native
  def deleteConnector(
    params: DeleteConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the host key that's specified in the HoskKeyId parameter.
    */
  def deleteHostKey(): Request[js.Object, AWSError] = js.native
  def deleteHostKey(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the host key that's specified in the HoskKeyId parameter.
    */
  def deleteHostKey(params: DeleteHostKeyRequest): Request[js.Object, AWSError] = js.native
  def deleteHostKey(
    params: DeleteHostKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the profile that's specified in the ProfileId parameter.
    */
  def deleteProfile(): Request[js.Object, AWSError] = js.native
  def deleteProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the profile that's specified in the ProfileId parameter.
    */
  def deleteProfile(params: DeleteProfileRequest): Request[js.Object, AWSError] = js.native
  def deleteProfile(
    params: DeleteProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the file transfer protocol-enabled server that you specify. No response returns from this operation.
    */
  def deleteServer(): Request[js.Object, AWSError] = js.native
  def deleteServer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the file transfer protocol-enabled server that you specify. No response returns from this operation.
    */
  def deleteServer(params: DeleteServerRequest): Request[js.Object, AWSError] = js.native
  def deleteServer(
    params: DeleteServerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a user's Secure Shell (SSH) public key.
    */
  def deleteSshPublicKey(): Request[js.Object, AWSError] = js.native
  def deleteSshPublicKey(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a user's Secure Shell (SSH) public key.
    */
  def deleteSshPublicKey(params: DeleteSshPublicKeyRequest): Request[js.Object, AWSError] = js.native
  def deleteSshPublicKey(
    params: DeleteSshPublicKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the user belonging to a file transfer protocol-enabled server you specify. No response returns from this operation.  When you delete a user from a server, the user's information is lost. 
    */
  def deleteUser(): Request[js.Object, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the user belonging to a file transfer protocol-enabled server you specify. No response returns from this operation.  When you delete a user from a server, the user's information is lost. 
    */
  def deleteUser(params: DeleteUserRequest): Request[js.Object, AWSError] = js.native
  def deleteUser(params: DeleteUserRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified workflow.
    */
  def deleteWorkflow(): Request[js.Object, AWSError] = js.native
  def deleteWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified workflow.
    */
  def deleteWorkflow(params: DeleteWorkflowRequest): Request[js.Object, AWSError] = js.native
  def deleteWorkflow(
    params: DeleteWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Describes the access that is assigned to the specific file transfer protocol-enabled server, as identified by its ServerId property and its ExternalId. The response from this call returns the properties of the access that is associated with the ServerId value that was specified.
    */
  def describeAccess(): Request[DescribeAccessResponse, AWSError] = js.native
  def describeAccess(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccessResponse, Unit]): Request[DescribeAccessResponse, AWSError] = js.native
  /**
    * Describes the access that is assigned to the specific file transfer protocol-enabled server, as identified by its ServerId property and its ExternalId. The response from this call returns the properties of the access that is associated with the ServerId value that was specified.
    */
  def describeAccess(params: DescribeAccessRequest): Request[DescribeAccessResponse, AWSError] = js.native
  def describeAccess(
    params: DescribeAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccessResponse, Unit]
  ): Request[DescribeAccessResponse, AWSError] = js.native
  
  /**
    * Describes the agreement that's identified by the AgreementId.
    */
  def describeAgreement(): Request[DescribeAgreementResponse, AWSError] = js.native
  def describeAgreement(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAgreementResponse, Unit]): Request[DescribeAgreementResponse, AWSError] = js.native
  /**
    * Describes the agreement that's identified by the AgreementId.
    */
  def describeAgreement(params: DescribeAgreementRequest): Request[DescribeAgreementResponse, AWSError] = js.native
  def describeAgreement(
    params: DescribeAgreementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAgreementResponse, Unit]
  ): Request[DescribeAgreementResponse, AWSError] = js.native
  
  /**
    * Describes the certificate that's identified by the CertificateId.
    */
  def describeCertificate(): Request[DescribeCertificateResponse, AWSError] = js.native
  def describeCertificate(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCertificateResponse, Unit]): Request[DescribeCertificateResponse, AWSError] = js.native
  /**
    * Describes the certificate that's identified by the CertificateId.
    */
  def describeCertificate(params: DescribeCertificateRequest): Request[DescribeCertificateResponse, AWSError] = js.native
  def describeCertificate(
    params: DescribeCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCertificateResponse, Unit]
  ): Request[DescribeCertificateResponse, AWSError] = js.native
  
  /**
    * Describes the connector that's identified by the ConnectorId. 
    */
  def describeConnector(): Request[DescribeConnectorResponse, AWSError] = js.native
  def describeConnector(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectorResponse, Unit]): Request[DescribeConnectorResponse, AWSError] = js.native
  /**
    * Describes the connector that's identified by the ConnectorId. 
    */
  def describeConnector(params: DescribeConnectorRequest): Request[DescribeConnectorResponse, AWSError] = js.native
  def describeConnector(
    params: DescribeConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectorResponse, Unit]
  ): Request[DescribeConnectorResponse, AWSError] = js.native
  
  /**
    * You can use DescribeExecution to check the details of the execution of the specified workflow.
    */
  def describeExecution(): Request[DescribeExecutionResponse, AWSError] = js.native
  def describeExecution(callback: js.Function2[/* err */ AWSError, /* data */ DescribeExecutionResponse, Unit]): Request[DescribeExecutionResponse, AWSError] = js.native
  /**
    * You can use DescribeExecution to check the details of the execution of the specified workflow.
    */
  def describeExecution(params: DescribeExecutionRequest): Request[DescribeExecutionResponse, AWSError] = js.native
  def describeExecution(
    params: DescribeExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExecutionResponse, Unit]
  ): Request[DescribeExecutionResponse, AWSError] = js.native
  
  /**
    * Returns the details of the host key that's specified by the HostKeyId and ServerId.
    */
  def describeHostKey(): Request[DescribeHostKeyResponse, AWSError] = js.native
  def describeHostKey(callback: js.Function2[/* err */ AWSError, /* data */ DescribeHostKeyResponse, Unit]): Request[DescribeHostKeyResponse, AWSError] = js.native
  /**
    * Returns the details of the host key that's specified by the HostKeyId and ServerId.
    */
  def describeHostKey(params: DescribeHostKeyRequest): Request[DescribeHostKeyResponse, AWSError] = js.native
  def describeHostKey(
    params: DescribeHostKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHostKeyResponse, Unit]
  ): Request[DescribeHostKeyResponse, AWSError] = js.native
  
  /**
    * Returns the details of the profile that's specified by the ProfileId.
    */
  def describeProfile(): Request[DescribeProfileResponse, AWSError] = js.native
  def describeProfile(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProfileResponse, Unit]): Request[DescribeProfileResponse, AWSError] = js.native
  /**
    * Returns the details of the profile that's specified by the ProfileId.
    */
  def describeProfile(params: DescribeProfileRequest): Request[DescribeProfileResponse, AWSError] = js.native
  def describeProfile(
    params: DescribeProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProfileResponse, Unit]
  ): Request[DescribeProfileResponse, AWSError] = js.native
  
  /**
    * Describes the security policy that is attached to your file transfer protocol-enabled server. The response contains a description of the security policy's properties. For more information about security policies, see Working with security policies.
    */
  def describeSecurityPolicy(): Request[DescribeSecurityPolicyResponse, AWSError] = js.native
  def describeSecurityPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSecurityPolicyResponse, Unit]): Request[DescribeSecurityPolicyResponse, AWSError] = js.native
  /**
    * Describes the security policy that is attached to your file transfer protocol-enabled server. The response contains a description of the security policy's properties. For more information about security policies, see Working with security policies.
    */
  def describeSecurityPolicy(params: DescribeSecurityPolicyRequest): Request[DescribeSecurityPolicyResponse, AWSError] = js.native
  def describeSecurityPolicy(
    params: DescribeSecurityPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSecurityPolicyResponse, Unit]
  ): Request[DescribeSecurityPolicyResponse, AWSError] = js.native
  
  /**
    * Describes a file transfer protocol-enabled server that you specify by passing the ServerId parameter. The response contains a description of a server's properties. When you set EndpointType to VPC, the response will contain the EndpointDetails.
    */
  def describeServer(): Request[DescribeServerResponse, AWSError] = js.native
  def describeServer(callback: js.Function2[/* err */ AWSError, /* data */ DescribeServerResponse, Unit]): Request[DescribeServerResponse, AWSError] = js.native
  /**
    * Describes a file transfer protocol-enabled server that you specify by passing the ServerId parameter. The response contains a description of a server's properties. When you set EndpointType to VPC, the response will contain the EndpointDetails.
    */
  def describeServer(params: DescribeServerRequest): Request[DescribeServerResponse, AWSError] = js.native
  def describeServer(
    params: DescribeServerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServerResponse, Unit]
  ): Request[DescribeServerResponse, AWSError] = js.native
  
  /**
    * Describes the user assigned to the specific file transfer protocol-enabled server, as identified by its ServerId property. The response from this call returns the properties of the user associated with the ServerId value that was specified.
    */
  def describeUser(): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Describes the user assigned to the specific file transfer protocol-enabled server, as identified by its ServerId property. The response from this call returns the properties of the user associated with the ServerId value that was specified.
    */
  def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(
    params: DescribeUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]
  ): Request[DescribeUserResponse, AWSError] = js.native
  
  /**
    * Describes the specified workflow.
    */
  def describeWorkflow(): Request[DescribeWorkflowResponse, AWSError] = js.native
  def describeWorkflow(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkflowResponse, Unit]): Request[DescribeWorkflowResponse, AWSError] = js.native
  /**
    * Describes the specified workflow.
    */
  def describeWorkflow(params: DescribeWorkflowRequest): Request[DescribeWorkflowResponse, AWSError] = js.native
  def describeWorkflow(
    params: DescribeWorkflowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkflowResponse, Unit]
  ): Request[DescribeWorkflowResponse, AWSError] = js.native
  
  /**
    * Imports the signing and encryption certificates that you need to create local (AS2) profiles and partner profiles.
    */
  def importCertificate(): Request[ImportCertificateResponse, AWSError] = js.native
  def importCertificate(callback: js.Function2[/* err */ AWSError, /* data */ ImportCertificateResponse, Unit]): Request[ImportCertificateResponse, AWSError] = js.native
  /**
    * Imports the signing and encryption certificates that you need to create local (AS2) profiles and partner profiles.
    */
  def importCertificate(params: ImportCertificateRequest): Request[ImportCertificateResponse, AWSError] = js.native
  def importCertificate(
    params: ImportCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportCertificateResponse, Unit]
  ): Request[ImportCertificateResponse, AWSError] = js.native
  
  /**
    * Adds a host key to the server that's specified by the ServerId parameter.
    */
  def importHostKey(): Request[ImportHostKeyResponse, AWSError] = js.native
  def importHostKey(callback: js.Function2[/* err */ AWSError, /* data */ ImportHostKeyResponse, Unit]): Request[ImportHostKeyResponse, AWSError] = js.native
  /**
    * Adds a host key to the server that's specified by the ServerId parameter.
    */
  def importHostKey(params: ImportHostKeyRequest): Request[ImportHostKeyResponse, AWSError] = js.native
  def importHostKey(
    params: ImportHostKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportHostKeyResponse, Unit]
  ): Request[ImportHostKeyResponse, AWSError] = js.native
  
  /**
    * Adds a Secure Shell (SSH) public key to a user account identified by a UserName value assigned to the specific file transfer protocol-enabled server, identified by ServerId. The response returns the UserName value, the ServerId value, and the name of the SshPublicKeyId.
    */
  def importSshPublicKey(): Request[ImportSshPublicKeyResponse, AWSError] = js.native
  def importSshPublicKey(callback: js.Function2[/* err */ AWSError, /* data */ ImportSshPublicKeyResponse, Unit]): Request[ImportSshPublicKeyResponse, AWSError] = js.native
  /**
    * Adds a Secure Shell (SSH) public key to a user account identified by a UserName value assigned to the specific file transfer protocol-enabled server, identified by ServerId. The response returns the UserName value, the ServerId value, and the name of the SshPublicKeyId.
    */
  def importSshPublicKey(params: ImportSshPublicKeyRequest): Request[ImportSshPublicKeyResponse, AWSError] = js.native
  def importSshPublicKey(
    params: ImportSshPublicKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportSshPublicKeyResponse, Unit]
  ): Request[ImportSshPublicKeyResponse, AWSError] = js.native
  
  /**
    * Lists the details for all the accesses you have on your server.
    */
  def listAccesses(): Request[ListAccessesResponse, AWSError] = js.native
  def listAccesses(callback: js.Function2[/* err */ AWSError, /* data */ ListAccessesResponse, Unit]): Request[ListAccessesResponse, AWSError] = js.native
  /**
    * Lists the details for all the accesses you have on your server.
    */
  def listAccesses(params: ListAccessesRequest): Request[ListAccessesResponse, AWSError] = js.native
  def listAccesses(
    params: ListAccessesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccessesResponse, Unit]
  ): Request[ListAccessesResponse, AWSError] = js.native
  
  /**
    * Returns a list of the agreements for the server that's identified by the ServerId that you supply. If you want to limit the results to a certain number, supply a value for the MaxResults parameter. If you ran the command previously and received a value for NextToken, you can supply that value to continue listing agreements from where you left off.
    */
  def listAgreements(): Request[ListAgreementsResponse, AWSError] = js.native
  def listAgreements(callback: js.Function2[/* err */ AWSError, /* data */ ListAgreementsResponse, Unit]): Request[ListAgreementsResponse, AWSError] = js.native
  /**
    * Returns a list of the agreements for the server that's identified by the ServerId that you supply. If you want to limit the results to a certain number, supply a value for the MaxResults parameter. If you ran the command previously and received a value for NextToken, you can supply that value to continue listing agreements from where you left off.
    */
  def listAgreements(params: ListAgreementsRequest): Request[ListAgreementsResponse, AWSError] = js.native
  def listAgreements(
    params: ListAgreementsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAgreementsResponse, Unit]
  ): Request[ListAgreementsResponse, AWSError] = js.native
  
  /**
    * Returns a list of the current certificates that have been imported into Transfer Family. If you want to limit the results to a certain number, supply a value for the MaxResults parameter. If you ran the command previously and received a value for the NextToken parameter, you can supply that value to continue listing certificates from where you left off.
    */
  def listCertificates(): Request[ListCertificatesResponse, AWSError] = js.native
  def listCertificates(callback: js.Function2[/* err */ AWSError, /* data */ ListCertificatesResponse, Unit]): Request[ListCertificatesResponse, AWSError] = js.native
  /**
    * Returns a list of the current certificates that have been imported into Transfer Family. If you want to limit the results to a certain number, supply a value for the MaxResults parameter. If you ran the command previously and received a value for the NextToken parameter, you can supply that value to continue listing certificates from where you left off.
    */
  def listCertificates(params: ListCertificatesRequest): Request[ListCertificatesResponse, AWSError] = js.native
  def listCertificates(
    params: ListCertificatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCertificatesResponse, Unit]
  ): Request[ListCertificatesResponse, AWSError] = js.native
  
  /**
    * Lists the connectors for the specified Region.
    */
  def listConnectors(): Request[ListConnectorsResponse, AWSError] = js.native
  def listConnectors(callback: js.Function2[/* err */ AWSError, /* data */ ListConnectorsResponse, Unit]): Request[ListConnectorsResponse, AWSError] = js.native
  /**
    * Lists the connectors for the specified Region.
    */
  def listConnectors(params: ListConnectorsRequest): Request[ListConnectorsResponse, AWSError] = js.native
  def listConnectors(
    params: ListConnectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConnectorsResponse, Unit]
  ): Request[ListConnectorsResponse, AWSError] = js.native
  
  /**
    * Lists all executions for the specified workflow.
    */
  def listExecutions(): Request[ListExecutionsResponse, AWSError] = js.native
  def listExecutions(callback: js.Function2[/* err */ AWSError, /* data */ ListExecutionsResponse, Unit]): Request[ListExecutionsResponse, AWSError] = js.native
  /**
    * Lists all executions for the specified workflow.
    */
  def listExecutions(params: ListExecutionsRequest): Request[ListExecutionsResponse, AWSError] = js.native
  def listExecutions(
    params: ListExecutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExecutionsResponse, Unit]
  ): Request[ListExecutionsResponse, AWSError] = js.native
  
  /**
    * Returns a list of host keys for the server that's specified by the ServerId parameter.
    */
  def listHostKeys(): Request[ListHostKeysResponse, AWSError] = js.native
  def listHostKeys(callback: js.Function2[/* err */ AWSError, /* data */ ListHostKeysResponse, Unit]): Request[ListHostKeysResponse, AWSError] = js.native
  /**
    * Returns a list of host keys for the server that's specified by the ServerId parameter.
    */
  def listHostKeys(params: ListHostKeysRequest): Request[ListHostKeysResponse, AWSError] = js.native
  def listHostKeys(
    params: ListHostKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHostKeysResponse, Unit]
  ): Request[ListHostKeysResponse, AWSError] = js.native
  
  /**
    * Returns a list of the profiles for your system. If you want to limit the results to a certain number, supply a value for the MaxResults parameter. If you ran the command previously and received a value for NextToken, you can supply that value to continue listing profiles from where you left off.
    */
  def listProfiles(): Request[ListProfilesResponse, AWSError] = js.native
  def listProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListProfilesResponse, Unit]): Request[ListProfilesResponse, AWSError] = js.native
  /**
    * Returns a list of the profiles for your system. If you want to limit the results to a certain number, supply a value for the MaxResults parameter. If you ran the command previously and received a value for NextToken, you can supply that value to continue listing profiles from where you left off.
    */
  def listProfiles(params: ListProfilesRequest): Request[ListProfilesResponse, AWSError] = js.native
  def listProfiles(
    params: ListProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProfilesResponse, Unit]
  ): Request[ListProfilesResponse, AWSError] = js.native
  
  /**
    * Lists the security policies that are attached to your file transfer protocol-enabled servers.
    */
  def listSecurityPolicies(): Request[ListSecurityPoliciesResponse, AWSError] = js.native
  def listSecurityPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityPoliciesResponse, Unit]): Request[ListSecurityPoliciesResponse, AWSError] = js.native
  /**
    * Lists the security policies that are attached to your file transfer protocol-enabled servers.
    */
  def listSecurityPolicies(params: ListSecurityPoliciesRequest): Request[ListSecurityPoliciesResponse, AWSError] = js.native
  def listSecurityPolicies(
    params: ListSecurityPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityPoliciesResponse, Unit]
  ): Request[ListSecurityPoliciesResponse, AWSError] = js.native
  
  /**
    * Lists the file transfer protocol-enabled servers that are associated with your Amazon Web Services account.
    */
  def listServers(): Request[ListServersResponse, AWSError] = js.native
  def listServers(callback: js.Function2[/* err */ AWSError, /* data */ ListServersResponse, Unit]): Request[ListServersResponse, AWSError] = js.native
  /**
    * Lists the file transfer protocol-enabled servers that are associated with your Amazon Web Services account.
    */
  def listServers(params: ListServersRequest): Request[ListServersResponse, AWSError] = js.native
  def listServers(
    params: ListServersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServersResponse, Unit]
  ): Request[ListServersResponse, AWSError] = js.native
  
  /**
    * Lists all of the tags associated with the Amazon Resource Name (ARN) that you specify. The resource can be a user, server, or role.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all of the tags associated with the Amazon Resource Name (ARN) that you specify. The resource can be a user, server, or role.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists the users for a file transfer protocol-enabled server that you specify by passing the ServerId parameter.
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Lists the users for a file transfer protocol-enabled server that you specify by passing the ServerId parameter.
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  
  /**
    * Lists all of your workflows.
    */
  def listWorkflows(): Request[ListWorkflowsResponse, AWSError] = js.native
  def listWorkflows(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkflowsResponse, Unit]): Request[ListWorkflowsResponse, AWSError] = js.native
  /**
    * Lists all of your workflows.
    */
  def listWorkflows(params: ListWorkflowsRequest): Request[ListWorkflowsResponse, AWSError] = js.native
  def listWorkflows(
    params: ListWorkflowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkflowsResponse, Unit]
  ): Request[ListWorkflowsResponse, AWSError] = js.native
  
  /**
    * Sends a callback for asynchronous custom steps.  The ExecutionId, WorkflowId, and Token are passed to the target resource during execution of a custom step of a workflow. You must include those with their callback as well as providing a status. 
    */
  def sendWorkflowStepState(): Request[SendWorkflowStepStateResponse, AWSError] = js.native
  def sendWorkflowStepState(callback: js.Function2[/* err */ AWSError, /* data */ SendWorkflowStepStateResponse, Unit]): Request[SendWorkflowStepStateResponse, AWSError] = js.native
  /**
    * Sends a callback for asynchronous custom steps.  The ExecutionId, WorkflowId, and Token are passed to the target resource during execution of a custom step of a workflow. You must include those with their callback as well as providing a status. 
    */
  def sendWorkflowStepState(params: SendWorkflowStepStateRequest): Request[SendWorkflowStepStateResponse, AWSError] = js.native
  def sendWorkflowStepState(
    params: SendWorkflowStepStateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendWorkflowStepStateResponse, Unit]
  ): Request[SendWorkflowStepStateResponse, AWSError] = js.native
  
  /**
    * Begins an outbound file transfer to a remote AS2 server. You specify the ConnectorId and the file paths for where to send the files. 
    */
  def startFileTransfer(): Request[StartFileTransferResponse, AWSError] = js.native
  def startFileTransfer(callback: js.Function2[/* err */ AWSError, /* data */ StartFileTransferResponse, Unit]): Request[StartFileTransferResponse, AWSError] = js.native
  /**
    * Begins an outbound file transfer to a remote AS2 server. You specify the ConnectorId and the file paths for where to send the files. 
    */
  def startFileTransfer(params: StartFileTransferRequest): Request[StartFileTransferResponse, AWSError] = js.native
  def startFileTransfer(
    params: StartFileTransferRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartFileTransferResponse, Unit]
  ): Request[StartFileTransferResponse, AWSError] = js.native
  
  /**
    * Changes the state of a file transfer protocol-enabled server from OFFLINE to ONLINE. It has no impact on a server that is already ONLINE. An ONLINE server can accept and process file transfer jobs. The state of STARTING indicates that the server is in an intermediate state, either not fully able to respond, or not fully online. The values of START_FAILED can indicate an error condition. No response is returned from this call.
    */
  def startServer(): Request[js.Object, AWSError] = js.native
  def startServer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Changes the state of a file transfer protocol-enabled server from OFFLINE to ONLINE. It has no impact on a server that is already ONLINE. An ONLINE server can accept and process file transfer jobs. The state of STARTING indicates that the server is in an intermediate state, either not fully able to respond, or not fully online. The values of START_FAILED can indicate an error condition. No response is returned from this call.
    */
  def startServer(params: StartServerRequest): Request[js.Object, AWSError] = js.native
  def startServer(params: StartServerRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Changes the state of a file transfer protocol-enabled server from ONLINE to OFFLINE. An OFFLINE server cannot accept and process file transfer jobs. Information tied to your server, such as server and user properties, are not affected by stopping your server.  Stopping the server does not reduce or impact your file transfer protocol endpoint billing; you must delete the server to stop being billed.  The state of STOPPING indicates that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of STOP_FAILED can indicate an error condition. No response is returned from this call.
    */
  def stopServer(): Request[js.Object, AWSError] = js.native
  def stopServer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Changes the state of a file transfer protocol-enabled server from ONLINE to OFFLINE. An OFFLINE server cannot accept and process file transfer jobs. Information tied to your server, such as server and user properties, are not affected by stopping your server.  Stopping the server does not reduce or impact your file transfer protocol endpoint billing; you must delete the server to stop being billed.  The state of STOPPING indicates that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of STOP_FAILED can indicate an error condition. No response is returned from this call.
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
    * If the IdentityProviderType of a file transfer protocol-enabled server is AWS_DIRECTORY_SERVICE or API_Gateway, tests whether your identity provider is set up successfully. We highly recommend that you call this operation to test your authentication method as soon as you create your server. By doing so, you can troubleshoot issues with the identity provider integration to ensure that your users can successfully use the service.  The ServerId and UserName parameters are required. The ServerProtocol, SourceIp, and UserPassword are all optional.    You cannot use TestIdentityProvider if the IdentityProviderType of your server is SERVICE_MANAGED.      If you provide any incorrect values for any parameters, the Response field is empty.     If you provide a server ID for a server that uses service-managed users, you get an error:    An error occurred (InvalidRequestException) when calling the TestIdentityProvider operation: s-server-ID not configured for external auth      If you enter a Server ID for the --server-id parameter that does not identify an actual Transfer server, you receive the following error:   An error occurred (ResourceNotFoundException) when calling the TestIdentityProvider operation: Unknown server   
    */
  def testIdentityProvider(): Request[TestIdentityProviderResponse, AWSError] = js.native
  def testIdentityProvider(callback: js.Function2[/* err */ AWSError, /* data */ TestIdentityProviderResponse, Unit]): Request[TestIdentityProviderResponse, AWSError] = js.native
  /**
    * If the IdentityProviderType of a file transfer protocol-enabled server is AWS_DIRECTORY_SERVICE or API_Gateway, tests whether your identity provider is set up successfully. We highly recommend that you call this operation to test your authentication method as soon as you create your server. By doing so, you can troubleshoot issues with the identity provider integration to ensure that your users can successfully use the service.  The ServerId and UserName parameters are required. The ServerProtocol, SourceIp, and UserPassword are all optional.    You cannot use TestIdentityProvider if the IdentityProviderType of your server is SERVICE_MANAGED.      If you provide any incorrect values for any parameters, the Response field is empty.     If you provide a server ID for a server that uses service-managed users, you get an error:    An error occurred (InvalidRequestException) when calling the TestIdentityProvider operation: s-server-ID not configured for external auth      If you enter a Server ID for the --server-id parameter that does not identify an actual Transfer server, you receive the following error:   An error occurred (ResourceNotFoundException) when calling the TestIdentityProvider operation: Unknown server   
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
    * Allows you to update parameters for the access specified in the ServerID and ExternalID parameters.
    */
  def updateAccess(): Request[UpdateAccessResponse, AWSError] = js.native
  def updateAccess(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccessResponse, Unit]): Request[UpdateAccessResponse, AWSError] = js.native
  /**
    * Allows you to update parameters for the access specified in the ServerID and ExternalID parameters.
    */
  def updateAccess(params: UpdateAccessRequest): Request[UpdateAccessResponse, AWSError] = js.native
  def updateAccess(
    params: UpdateAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccessResponse, Unit]
  ): Request[UpdateAccessResponse, AWSError] = js.native
  
  /**
    * Updates some of the parameters for an existing agreement. Provide the AgreementId and the ServerId for the agreement that you want to update, along with the new values for the parameters to update.
    */
  def updateAgreement(): Request[UpdateAgreementResponse, AWSError] = js.native
  def updateAgreement(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAgreementResponse, Unit]): Request[UpdateAgreementResponse, AWSError] = js.native
  /**
    * Updates some of the parameters for an existing agreement. Provide the AgreementId and the ServerId for the agreement that you want to update, along with the new values for the parameters to update.
    */
  def updateAgreement(params: UpdateAgreementRequest): Request[UpdateAgreementResponse, AWSError] = js.native
  def updateAgreement(
    params: UpdateAgreementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAgreementResponse, Unit]
  ): Request[UpdateAgreementResponse, AWSError] = js.native
  
  /**
    * Updates the active and inactive dates for a certificate.
    */
  def updateCertificate(): Request[UpdateCertificateResponse, AWSError] = js.native
  def updateCertificate(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCertificateResponse, Unit]): Request[UpdateCertificateResponse, AWSError] = js.native
  /**
    * Updates the active and inactive dates for a certificate.
    */
  def updateCertificate(params: UpdateCertificateRequest): Request[UpdateCertificateResponse, AWSError] = js.native
  def updateCertificate(
    params: UpdateCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCertificateResponse, Unit]
  ): Request[UpdateCertificateResponse, AWSError] = js.native
  
  /**
    * Updates some of the parameters for an existing connector. Provide the ConnectorId for the connector that you want to update, along with the new values for the parameters to update.
    */
  def updateConnector(): Request[UpdateConnectorResponse, AWSError] = js.native
  def updateConnector(callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectorResponse, Unit]): Request[UpdateConnectorResponse, AWSError] = js.native
  /**
    * Updates some of the parameters for an existing connector. Provide the ConnectorId for the connector that you want to update, along with the new values for the parameters to update.
    */
  def updateConnector(params: UpdateConnectorRequest): Request[UpdateConnectorResponse, AWSError] = js.native
  def updateConnector(
    params: UpdateConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectorResponse, Unit]
  ): Request[UpdateConnectorResponse, AWSError] = js.native
  
  /**
    * Updates the description for the host key that's specified by the ServerId and HostKeyId parameters.
    */
  def updateHostKey(): Request[UpdateHostKeyResponse, AWSError] = js.native
  def updateHostKey(callback: js.Function2[/* err */ AWSError, /* data */ UpdateHostKeyResponse, Unit]): Request[UpdateHostKeyResponse, AWSError] = js.native
  /**
    * Updates the description for the host key that's specified by the ServerId and HostKeyId parameters.
    */
  def updateHostKey(params: UpdateHostKeyRequest): Request[UpdateHostKeyResponse, AWSError] = js.native
  def updateHostKey(
    params: UpdateHostKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateHostKeyResponse, Unit]
  ): Request[UpdateHostKeyResponse, AWSError] = js.native
  
  /**
    * Updates some of the parameters for an existing profile. Provide the ProfileId for the profile that you want to update, along with the new values for the parameters to update.
    */
  def updateProfile(): Request[UpdateProfileResponse, AWSError] = js.native
  def updateProfile(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProfileResponse, Unit]): Request[UpdateProfileResponse, AWSError] = js.native
  /**
    * Updates some of the parameters for an existing profile. Provide the ProfileId for the profile that you want to update, along with the new values for the parameters to update.
    */
  def updateProfile(params: UpdateProfileRequest): Request[UpdateProfileResponse, AWSError] = js.native
  def updateProfile(
    params: UpdateProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProfileResponse, Unit]
  ): Request[UpdateProfileResponse, AWSError] = js.native
  
  /**
    * Updates the file transfer protocol-enabled server's properties after that server has been created. The UpdateServer call returns the ServerId of the server you updated.
    */
  def updateServer(): Request[UpdateServerResponse, AWSError] = js.native
  def updateServer(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServerResponse, Unit]): Request[UpdateServerResponse, AWSError] = js.native
  /**
    * Updates the file transfer protocol-enabled server's properties after that server has been created. The UpdateServer call returns the ServerId of the server you updated.
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
  
  /**
    * Waits for the serverOffline state by periodically calling the underlying Transfer.describeServeroperation every 30 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_serverOffline(state: serverOffline): Request[DescribeServerResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_serverOffline(
    state: serverOffline,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServerResponse, Unit]
  ): Request[DescribeServerResponse, AWSError] = js.native
  /**
    * Waits for the serverOffline state by periodically calling the underlying Transfer.describeServeroperation every 30 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_serverOffline(state: serverOffline, params: DescribeServerRequestwait): Request[DescribeServerResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_serverOffline(
    state: serverOffline,
    params: DescribeServerRequestwait,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServerResponse, Unit]
  ): Request[DescribeServerResponse, AWSError] = js.native
  /**
    * Waits for the serverOnline state by periodically calling the underlying Transfer.describeServeroperation every 30 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_serverOnline(state: serverOnline): Request[DescribeServerResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_serverOnline(
    state: serverOnline,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServerResponse, Unit]
  ): Request[DescribeServerResponse, AWSError] = js.native
  /**
    * Waits for the serverOnline state by periodically calling the underlying Transfer.describeServeroperation every 30 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_serverOnline(state: serverOnline, params: DescribeServerRequestwait): Request[DescribeServerResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_serverOnline(
    state: serverOnline,
    params: DescribeServerRequestwait,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServerResponse, Unit]
  ): Request[DescribeServerResponse, AWSError] = js.native
}
