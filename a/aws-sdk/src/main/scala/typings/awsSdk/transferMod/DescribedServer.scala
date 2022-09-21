package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribedServer extends StObject {
  
  /**
    * Specifies the unique Amazon Resource Name (ARN) of the server.
    */
  var Arn: typings.awsSdk.transferMod.Arn
  
  /**
    * Specifies the ARN of the Amazon Web ServicesCertificate Manager (ACM) certificate. Required when Protocols is set to FTPS.
    */
  var Certificate: js.UndefOr[typings.awsSdk.transferMod.Certificate] = js.undefined
  
  /**
    * Specifies the domain of the storage system that is used for file transfers.
    */
  var Domain: js.UndefOr[typings.awsSdk.transferMod.Domain] = js.undefined
  
  /**
    * The virtual private cloud (VPC) endpoint settings that are configured for your server. When you host your endpoint within your VPC, you can make your endpoint accessible only to resources within your VPC, or you can attach Elastic IP addresses and make your endpoint accessible to clients over the internet. Your VPC's default security groups are automatically assigned to your endpoint.
    */
  var EndpointDetails: js.UndefOr[typings.awsSdk.transferMod.EndpointDetails] = js.undefined
  
  /**
    * Defines the type of endpoint that your server is connected to. If your server is connected to a VPC endpoint, your server isn't accessible over the public internet.
    */
  var EndpointType: js.UndefOr[typings.awsSdk.transferMod.EndpointType] = js.undefined
  
  /**
    * Specifies the Base64-encoded SHA256 fingerprint of the server's host key. This value is equivalent to the output of the ssh-keygen -l -f my-new-server-key command.
    */
  var HostKeyFingerprint: js.UndefOr[typings.awsSdk.transferMod.HostKeyFingerprint] = js.undefined
  
  /**
    * Specifies information to call a customer-supplied authentication API. This field is not populated when the IdentityProviderType of a server is AWS_DIRECTORY_SERVICE or SERVICE_MANAGED.
    */
  var IdentityProviderDetails: js.UndefOr[typings.awsSdk.transferMod.IdentityProviderDetails] = js.undefined
  
  /**
    * The mode of authentication for a server. The default value is SERVICE_MANAGED, which allows you to store and access user credentials within the Transfer Family service. Use AWS_DIRECTORY_SERVICE to provide access to Active Directory groups in Directory Service for Microsoft Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon Web Services using AD Connector. This option also requires you to provide a Directory ID by using the IdentityProviderDetails parameter. Use the API_GATEWAY value to integrate with an identity provider of your choosing. The API_GATEWAY setting requires you to provide an Amazon API Gateway endpoint URL to call for authentication by using the IdentityProviderDetails parameter. Use the AWS_LAMBDA value to directly use an Lambda function as your identity provider. If you choose this value, you must specify the ARN for the Lambda function in the Function parameter or the IdentityProviderDetails data type.
    */
  var IdentityProviderType: js.UndefOr[typings.awsSdk.transferMod.IdentityProviderType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents. When set, you can view user activity in your CloudWatch logs.
    */
  var LoggingRole: js.UndefOr[Role] = js.undefined
  
  /**
    * Specifies a string to display when users connect to a server. This string is displayed after the user authenticates.  The SFTP protocol does not support post-authentication display banners. 
    */
  var PostAuthenticationLoginBanner: js.UndefOr[typings.awsSdk.transferMod.PostAuthenticationLoginBanner] = js.undefined
  
  /**
    * Specifies a string to display when users connect to a server. This string is displayed before the user authenticates. For example, the following banner displays details about using the system:  This system is for the use of authorized users only. Individuals using this computer system without authority, or in excess of their authority, are subject to having all of their activities on this system monitored and recorded by system personnel. 
    */
  var PreAuthenticationLoginBanner: js.UndefOr[typings.awsSdk.transferMod.PreAuthenticationLoginBanner] = js.undefined
  
  /**
    * The protocol settings that are configured for your server.    To indicate passive mode (for FTP and FTPS protocols), use the PassiveIp parameter. Enter a single dotted-quad IPv4 address, such as the external IP address of a firewall, router, or load balancer.    To ignore the error that is generated when the client attempts to use the SETSTAT command on a file that you are uploading to an Amazon S3 bucket, use the SetStatOption parameter. To have the Transfer Family server ignore the SETSTAT command and upload files without needing to make any changes to your SFTP client, set the value to ENABLE_NO_OP. If you set the SetStatOption parameter to ENABLE_NO_OP, Transfer Family generates a log entry to Amazon CloudWatch Logs, so that you can determine when the client is making a SETSTAT call.   To determine whether your Transfer Family server resumes recent, negotiated sessions through a unique session ID, use the TlsSessionResumptionMode parameter.    As2Transports indicates the transport method for the AS2 messages. Currently, only HTTP is supported.  
    */
  var ProtocolDetails: js.UndefOr[typings.awsSdk.transferMod.ProtocolDetails] = js.undefined
  
  /**
    * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to your server's endpoint. The available protocols are:    SFTP (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH    FTPS (File Transfer Protocol Secure): File transfer with TLS encryption    FTP (File Transfer Protocol): Unencrypted file transfer    AS2 (Applicability Statement 2): used for transporting structured business-to-business data      If you select FTPS, you must choose a certificate stored in Certificate Manager (ACM) which is used to identify your server when clients connect to it over FTPS.   If Protocol includes either FTP or FTPS, then the EndpointType must be VPC and the IdentityProviderType must be AWS_DIRECTORY_SERVICE or API_GATEWAY.   If Protocol includes FTP, then AddressAllocationIds cannot be associated.   If Protocol is set only to SFTP, the EndpointType can be set to PUBLIC and the IdentityProviderType can be set to SERVICE_MANAGED.   If Protocol includes AS2, then the EndpointType must be VPC, and domain must be Amazon S3.   
    */
  var Protocols: js.UndefOr[typings.awsSdk.transferMod.Protocols] = js.undefined
  
  /**
    * Specifies the name of the security policy that is attached to the server.
    */
  var SecurityPolicyName: js.UndefOr[typings.awsSdk.transferMod.SecurityPolicyName] = js.undefined
  
  /**
    * Specifies the unique system-assigned identifier for a server that you instantiate.
    */
  var ServerId: js.UndefOr[typings.awsSdk.transferMod.ServerId] = js.undefined
  
  /**
    * The condition of the server that was described. A value of ONLINE indicates that the server can accept jobs and transfer files. A State value of OFFLINE means that the server cannot perform file transfer operations. The states of STARTING and STOPPING indicate that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of START_FAILED or STOP_FAILED can indicate an error condition.
    */
  var State: js.UndefOr[typings.awsSdk.transferMod.State] = js.undefined
  
  /**
    * Specifies the key-value pairs that you can use to search for and group servers that were assigned to the server that was described.
    */
  var Tags: js.UndefOr[typings.awsSdk.transferMod.Tags] = js.undefined
  
  /**
    * Specifies the number of users that are assigned to a server you specified with the ServerId.
    */
  var UserCount: js.UndefOr[typings.awsSdk.transferMod.UserCount] = js.undefined
  
  /**
    * Specifies the workflow ID for the workflow to assign and the execution role that's used for executing the workflow.
    */
  var WorkflowDetails: js.UndefOr[typings.awsSdk.transferMod.WorkflowDetails] = js.undefined
}
object DescribedServer {
  
  inline def apply(Arn: Arn): DescribedServer = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedServer]
  }
  
  extension [Self <: DescribedServer](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setEndpointDetails(value: EndpointDetails): Self = StObject.set(x, "EndpointDetails", value.asInstanceOf[js.Any])
    
    inline def setEndpointDetailsUndefined: Self = StObject.set(x, "EndpointDetails", js.undefined)
    
    inline def setEndpointType(value: EndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    inline def setHostKeyFingerprint(value: HostKeyFingerprint): Self = StObject.set(x, "HostKeyFingerprint", value.asInstanceOf[js.Any])
    
    inline def setHostKeyFingerprintUndefined: Self = StObject.set(x, "HostKeyFingerprint", js.undefined)
    
    inline def setIdentityProviderDetails(value: IdentityProviderDetails): Self = StObject.set(x, "IdentityProviderDetails", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderDetailsUndefined: Self = StObject.set(x, "IdentityProviderDetails", js.undefined)
    
    inline def setIdentityProviderType(value: IdentityProviderType): Self = StObject.set(x, "IdentityProviderType", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderTypeUndefined: Self = StObject.set(x, "IdentityProviderType", js.undefined)
    
    inline def setLoggingRole(value: Role): Self = StObject.set(x, "LoggingRole", value.asInstanceOf[js.Any])
    
    inline def setLoggingRoleUndefined: Self = StObject.set(x, "LoggingRole", js.undefined)
    
    inline def setPostAuthenticationLoginBanner(value: PostAuthenticationLoginBanner): Self = StObject.set(x, "PostAuthenticationLoginBanner", value.asInstanceOf[js.Any])
    
    inline def setPostAuthenticationLoginBannerUndefined: Self = StObject.set(x, "PostAuthenticationLoginBanner", js.undefined)
    
    inline def setPreAuthenticationLoginBanner(value: PreAuthenticationLoginBanner): Self = StObject.set(x, "PreAuthenticationLoginBanner", value.asInstanceOf[js.Any])
    
    inline def setPreAuthenticationLoginBannerUndefined: Self = StObject.set(x, "PreAuthenticationLoginBanner", js.undefined)
    
    inline def setProtocolDetails(value: ProtocolDetails): Self = StObject.set(x, "ProtocolDetails", value.asInstanceOf[js.Any])
    
    inline def setProtocolDetailsUndefined: Self = StObject.set(x, "ProtocolDetails", js.undefined)
    
    inline def setProtocols(value: Protocols): Self = StObject.set(x, "Protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "Protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "Protocols", js.Array(value*))
    
    inline def setSecurityPolicyName(value: SecurityPolicyName): Self = StObject.set(x, "SecurityPolicyName", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyNameUndefined: Self = StObject.set(x, "SecurityPolicyName", js.undefined)
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setServerIdUndefined: Self = StObject.set(x, "ServerId", js.undefined)
    
    inline def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUserCount(value: UserCount): Self = StObject.set(x, "UserCount", value.asInstanceOf[js.Any])
    
    inline def setUserCountUndefined: Self = StObject.set(x, "UserCount", js.undefined)
    
    inline def setWorkflowDetails(value: WorkflowDetails): Self = StObject.set(x, "WorkflowDetails", value.asInstanceOf[js.Any])
    
    inline def setWorkflowDetailsUndefined: Self = StObject.set(x, "WorkflowDetails", js.undefined)
  }
}
