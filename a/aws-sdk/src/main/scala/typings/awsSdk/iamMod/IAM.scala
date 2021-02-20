package typings.awsSdk.iamMod

import typings.awsSdk.anon.GetPolicyRequestwaiterWai
import typings.awsSdk.anon.GetRoleRequestwaiterWaite
import typings.awsSdk.anon.GetUserRequestwaiterWaite
import typings.awsSdk.awsSdkStrings.instanceProfileExists
import typings.awsSdk.awsSdkStrings.policyExists
import typings.awsSdk.awsSdkStrings.roleExists
import typings.awsSdk.awsSdkStrings.userExists
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAM extends Service {
  
  /**
    * Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM OpenID Connect (OIDC) provider resource. This operation is idempotent; it does not fail or return an error if you add an existing client ID to the provider.
    */
  def addClientIDToOpenIDConnectProvider(): Request[js.Object, AWSError] = js.native
  def addClientIDToOpenIDConnectProvider(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM OpenID Connect (OIDC) provider resource. This operation is idempotent; it does not fail or return an error if you add an existing client ID to the provider.
    */
  def addClientIDToOpenIDConnectProvider(params: AddClientIDToOpenIDConnectProviderRequest): Request[js.Object, AWSError] = js.native
  def addClientIDToOpenIDConnectProvider(
    params: AddClientIDToOpenIDConnectProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds the specified IAM role to the specified instance profile. An instance profile can contain only one role. (The number and size of IAM resources in an AWS account are limited. For more information, see IAM and STS Quotas in the IAM User Guide.) You can remove the existing role and then add a different role to an instance profile. You must then wait for the change to appear across all of AWS because of eventual consistency. To force the change, you must disassociate the instance profile and then associate the instance profile, or you can stop your instance and then restart it.  The caller of this API must be granted the PassRole permission on the IAM role by a permissions policy.  For more information about roles, go to Working with Roles. For more information about instance profiles, go to About Instance Profiles.
    */
  def addRoleToInstanceProfile(): Request[js.Object, AWSError] = js.native
  def addRoleToInstanceProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds the specified IAM role to the specified instance profile. An instance profile can contain only one role. (The number and size of IAM resources in an AWS account are limited. For more information, see IAM and STS Quotas in the IAM User Guide.) You can remove the existing role and then add a different role to an instance profile. You must then wait for the change to appear across all of AWS because of eventual consistency. To force the change, you must disassociate the instance profile and then associate the instance profile, or you can stop your instance and then restart it.  The caller of this API must be granted the PassRole permission on the IAM role by a permissions policy.  For more information about roles, go to Working with Roles. For more information about instance profiles, go to About Instance Profiles.
    */
  def addRoleToInstanceProfile(params: AddRoleToInstanceProfileRequest): Request[js.Object, AWSError] = js.native
  def addRoleToInstanceProfile(
    params: AddRoleToInstanceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds the specified user to the specified group.
    */
  def addUserToGroup(): Request[js.Object, AWSError] = js.native
  def addUserToGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds the specified user to the specified group.
    */
  def addUserToGroup(params: AddUserToGroupRequest): Request[js.Object, AWSError] = js.native
  def addUserToGroup(
    params: AddUserToGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Attaches the specified managed policy to the specified IAM group. You use this API to attach a managed policy to a group. To embed an inline policy in a group, use PutGroupPolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def attachGroupPolicy(): Request[js.Object, AWSError] = js.native
  def attachGroupPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Attaches the specified managed policy to the specified IAM group. You use this API to attach a managed policy to a group. To embed an inline policy in a group, use PutGroupPolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def attachGroupPolicy(params: AttachGroupPolicyRequest): Request[js.Object, AWSError] = js.native
  def attachGroupPolicy(
    params: AttachGroupPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Attaches the specified managed policy to the specified IAM role. When you attach a managed policy to a role, the managed policy becomes part of the role's permission (access) policy.  You cannot use a managed policy as the role's trust policy. The role's trust policy is created at the same time as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy.  Use this API to attach a managed policy to a role. To embed an inline policy in a role, use PutRolePolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def attachRolePolicy(): Request[js.Object, AWSError] = js.native
  def attachRolePolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Attaches the specified managed policy to the specified IAM role. When you attach a managed policy to a role, the managed policy becomes part of the role's permission (access) policy.  You cannot use a managed policy as the role's trust policy. The role's trust policy is created at the same time as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy.  Use this API to attach a managed policy to a role. To embed an inline policy in a role, use PutRolePolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def attachRolePolicy(params: AttachRolePolicyRequest): Request[js.Object, AWSError] = js.native
  def attachRolePolicy(
    params: AttachRolePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Attaches the specified managed policy to the specified user. You use this API to attach a managed policy to a user. To embed an inline policy in a user, use PutUserPolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def attachUserPolicy(): Request[js.Object, AWSError] = js.native
  def attachUserPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Attaches the specified managed policy to the specified user. You use this API to attach a managed policy to a user. To embed an inline policy in a user, use PutUserPolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def attachUserPolicy(params: AttachUserPolicyRequest): Request[js.Object, AWSError] = js.native
  def attachUserPolicy(
    params: AttachUserPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Changes the password of the IAM user who is calling this operation. The AWS account root user password is not affected by this operation. To change the password for a different user, see UpdateLoginProfile. For more information about modifying passwords, see Managing Passwords in the IAM User Guide.
    */
  def changePassword(): Request[js.Object, AWSError] = js.native
  def changePassword(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Changes the password of the IAM user who is calling this operation. The AWS account root user password is not affected by this operation. To change the password for a different user, see UpdateLoginProfile. For more information about modifying passwords, see Managing Passwords in the IAM User Guide.
    */
  def changePassword(params: ChangePasswordRequest): Request[js.Object, AWSError] = js.native
  def changePassword(
    params: ChangePasswordRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  @JSName("config")
  var config_IAM: ConfigBase with ClientConfiguration = js.native
  
  /**
    *  Creates a new AWS secret access key and corresponding AWS access key ID for the specified user. The default status for new keys is Active. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials. This is true even if the AWS account has no associated users. The number and size of IAM resources in an AWS account are limited. For more information, see IAM and STS Quotas in the IAM User Guide.  To ensure the security of your AWS account, the secret access key is accessible only during key and user creation. You must save the key (for example, in a text file) if you want to be able to access it again. If a secret key is lost, you can delete the access keys for the associated user and then create new keys. 
    */
  def createAccessKey(): Request[CreateAccessKeyResponse, AWSError] = js.native
  def createAccessKey(callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessKeyResponse, Unit]): Request[CreateAccessKeyResponse, AWSError] = js.native
  /**
    *  Creates a new AWS secret access key and corresponding AWS access key ID for the specified user. The default status for new keys is Active. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials. This is true even if the AWS account has no associated users. The number and size of IAM resources in an AWS account are limited. For more information, see IAM and STS Quotas in the IAM User Guide.  To ensure the security of your AWS account, the secret access key is accessible only during key and user creation. You must save the key (for example, in a text file) if you want to be able to access it again. If a secret key is lost, you can delete the access keys for the associated user and then create new keys. 
    */
  def createAccessKey(params: CreateAccessKeyRequest): Request[CreateAccessKeyResponse, AWSError] = js.native
  def createAccessKey(
    params: CreateAccessKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessKeyResponse, Unit]
  ): Request[CreateAccessKeyResponse, AWSError] = js.native
  
  /**
    * Creates an alias for your AWS account. For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
    */
  def createAccountAlias(): Request[js.Object, AWSError] = js.native
  def createAccountAlias(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates an alias for your AWS account. For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
    */
  def createAccountAlias(params: CreateAccountAliasRequest): Request[js.Object, AWSError] = js.native
  def createAccountAlias(
    params: CreateAccountAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates a new group. The number and size of IAM resources in an AWS account are limited. For more information, see IAM and STS Quotas in the IAM User Guide.
    */
  def createGroup(): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]): Request[CreateGroupResponse, AWSError] = js.native
  /**
    * Creates a new group. The number and size of IAM resources in an AWS account are limited. For more information, see IAM and STS Quotas in the IAM User Guide.
    */
  def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(
    params: CreateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]
  ): Request[CreateGroupResponse, AWSError] = js.native
  
  /**
    *  Creates a new instance profile. For information about instance profiles, go to About Instance Profiles. The number and size of IAM resources in an AWS account are limited. For more information, see IAM and STS Quotas in the IAM User Guide.
    */
  def createInstanceProfile(): Request[CreateInstanceProfileResponse, AWSError] = js.native
  def createInstanceProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateInstanceProfileResponse, Unit]): Request[CreateInstanceProfileResponse, AWSError] = js.native
  /**
    *  Creates a new instance profile. For information about instance profiles, go to About Instance Profiles. The number and size of IAM resources in an AWS account are limited. For more information, see IAM and STS Quotas in the IAM User Guide.
    */
  def createInstanceProfile(params: CreateInstanceProfileRequest): Request[CreateInstanceProfileResponse, AWSError] = js.native
  def createInstanceProfile(
    params: CreateInstanceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInstanceProfileResponse, Unit]
  ): Request[CreateInstanceProfileResponse, AWSError] = js.native
  
  /**
    *  Creates a password for the specified user, giving the user the ability to access AWS services through the AWS Management Console. For more information about managing passwords, see Managing Passwords in the IAM User Guide.
    */
  def createLoginProfile(): Request[CreateLoginProfileResponse, AWSError] = js.native
  def createLoginProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateLoginProfileResponse, Unit]): Request[CreateLoginProfileResponse, AWSError] = js.native
  /**
    *  Creates a password for the specified user, giving the user the ability to access AWS services through the AWS Management Console. For more information about managing passwords, see Managing Passwords in the IAM User Guide.
    */
  def createLoginProfile(params: CreateLoginProfileRequest): Request[CreateLoginProfileResponse, AWSError] = js.native
  def createLoginProfile(
    params: CreateLoginProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLoginProfileResponse, Unit]
  ): Request[CreateLoginProfileResponse, AWSError] = js.native
  
  /**
    * Creates an IAM entity to describe an identity provider (IdP) that supports OpenID Connect (OIDC). The OIDC provider that you create with this operation can be used as a principal in a role's trust policy. Such a policy establishes a trust relationship between AWS and the OIDC provider. When you create the IAM OIDC provider, you specify the following:   The URL of the OIDC identity provider (IdP) to trust   A list of client IDs (also known as audiences) that identify the application or applications that are allowed to authenticate using the OIDC provider   A list of thumbprints of one or more server certificates that the IdP uses   You get all of this information from the OIDC IdP that you want to use to access AWS.  The trust for the OIDC provider is derived from the IAM provider that this operation creates. Therefore, it is best to limit access to the CreateOpenIDConnectProvider operation to highly privileged users. 
    */
  def createOpenIDConnectProvider(): Request[CreateOpenIDConnectProviderResponse, AWSError] = js.native
  def createOpenIDConnectProvider(callback: js.Function2[/* err */ AWSError, /* data */ CreateOpenIDConnectProviderResponse, Unit]): Request[CreateOpenIDConnectProviderResponse, AWSError] = js.native
  /**
    * Creates an IAM entity to describe an identity provider (IdP) that supports OpenID Connect (OIDC). The OIDC provider that you create with this operation can be used as a principal in a role's trust policy. Such a policy establishes a trust relationship between AWS and the OIDC provider. When you create the IAM OIDC provider, you specify the following:   The URL of the OIDC identity provider (IdP) to trust   A list of client IDs (also known as audiences) that identify the application or applications that are allowed to authenticate using the OIDC provider   A list of thumbprints of one or more server certificates that the IdP uses   You get all of this information from the OIDC IdP that you want to use to access AWS.  The trust for the OIDC provider is derived from the IAM provider that this operation creates. Therefore, it is best to limit access to the CreateOpenIDConnectProvider operation to highly privileged users. 
    */
  def createOpenIDConnectProvider(params: CreateOpenIDConnectProviderRequest): Request[CreateOpenIDConnectProviderResponse, AWSError] = js.native
  def createOpenIDConnectProvider(
    params: CreateOpenIDConnectProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateOpenIDConnectProviderResponse, Unit]
  ): Request[CreateOpenIDConnectProviderResponse, AWSError] = js.native
  
  /**
    * Creates a new managed policy for your AWS account. This operation creates a policy version with a version identifier of v1 and sets v1 as the policy's default version. For more information about policy versions, see Versioning for Managed Policies in the IAM User Guide. For more information about managed policies in general, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def createPolicy(): Request[CreatePolicyResponse, AWSError] = js.native
  def createPolicy(callback: js.Function2[/* err */ AWSError, /* data */ CreatePolicyResponse, Unit]): Request[CreatePolicyResponse, AWSError] = js.native
  /**
    * Creates a new managed policy for your AWS account. This operation creates a policy version with a version identifier of v1 and sets v1 as the policy's default version. For more information about policy versions, see Versioning for Managed Policies in the IAM User Guide. For more information about managed policies in general, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def createPolicy(params: CreatePolicyRequest): Request[CreatePolicyResponse, AWSError] = js.native
  def createPolicy(
    params: CreatePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePolicyResponse, Unit]
  ): Request[CreatePolicyResponse, AWSError] = js.native
  
  /**
    * Creates a new version of the specified managed policy. To update a managed policy, you create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must delete an existing version using DeletePolicyVersion before you create a new version. Optionally, you can set the new version as the policy's default version. The default version is the version that is in effect for the IAM users, groups, and roles to which the policy is attached. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
    */
  def createPolicyVersion(): Request[CreatePolicyVersionResponse, AWSError] = js.native
  def createPolicyVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreatePolicyVersionResponse, Unit]): Request[CreatePolicyVersionResponse, AWSError] = js.native
  /**
    * Creates a new version of the specified managed policy. To update a managed policy, you create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must delete an existing version using DeletePolicyVersion before you create a new version. Optionally, you can set the new version as the policy's default version. The default version is the version that is in effect for the IAM users, groups, and roles to which the policy is attached. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
    */
  def createPolicyVersion(params: CreatePolicyVersionRequest): Request[CreatePolicyVersionResponse, AWSError] = js.native
  def createPolicyVersion(
    params: CreatePolicyVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePolicyVersionResponse, Unit]
  ): Request[CreatePolicyVersionResponse, AWSError] = js.native
  
  /**
    * Creates a new role for your AWS account. For more information about roles, go to IAM Roles. The number and size of IAM resources in an AWS account are limited. For more information, see IAM and STS Quotas in the IAM User Guide.
    */
  def createRole(): Request[CreateRoleResponse, AWSError] = js.native
  def createRole(callback: js.Function2[/* err */ AWSError, /* data */ CreateRoleResponse, Unit]): Request[CreateRoleResponse, AWSError] = js.native
  /**
    * Creates a new role for your AWS account. For more information about roles, go to IAM Roles. The number and size of IAM resources in an AWS account are limited. For more information, see IAM and STS Quotas in the IAM User Guide.
    */
  def createRole(params: CreateRoleRequest): Request[CreateRoleResponse, AWSError] = js.native
  def createRole(
    params: CreateRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRoleResponse, Unit]
  ): Request[CreateRoleResponse, AWSError] = js.native
  
  /**
    * Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0. The SAML provider resource that you create with this operation can be used as a principal in an IAM role's trust policy. Such a policy can enable federated users who sign in using the SAML IdP to assume the role. You can create an IAM role that supports Web-based single sign-on (SSO) to the AWS Management Console or one that supports API access to AWS. When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that the IdP sends. You must generate the metadata document using the identity management software that is used as your organization's IdP.   This operation requires Signature Version 4.   For more information, see Enabling SAML 2.0 Federated Users to Access the AWS Management Console and About SAML 2.0-based Federation in the IAM User Guide.
    */
  def createSAMLProvider(): Request[CreateSAMLProviderResponse, AWSError] = js.native
  def createSAMLProvider(callback: js.Function2[/* err */ AWSError, /* data */ CreateSAMLProviderResponse, Unit]): Request[CreateSAMLProviderResponse, AWSError] = js.native
  /**
    * Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0. The SAML provider resource that you create with this operation can be used as a principal in an IAM role's trust policy. Such a policy can enable federated users who sign in using the SAML IdP to assume the role. You can create an IAM role that supports Web-based single sign-on (SSO) to the AWS Management Console or one that supports API access to AWS. When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that the IdP sends. You must generate the metadata document using the identity management software that is used as your organization's IdP.   This operation requires Signature Version 4.   For more information, see Enabling SAML 2.0 Federated Users to Access the AWS Management Console and About SAML 2.0-based Federation in the IAM User Guide.
    */
  def createSAMLProvider(params: CreateSAMLProviderRequest): Request[CreateSAMLProviderResponse, AWSError] = js.native
  def createSAMLProvider(
    params: CreateSAMLProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSAMLProviderResponse, Unit]
  ): Request[CreateSAMLProviderResponse, AWSError] = js.native
  
  /**
    * Creates an IAM role that is linked to a specific AWS service. The service controls the attached policies and when the role can be deleted. This helps ensure that the service is not broken by an unexpectedly changed or deleted role, which could put your AWS resources into an unknown state. Allowing the service to control the role helps improve service stability and proper cleanup when a service and its role are no longer needed. For more information, see Using Service-Linked Roles in the IAM User Guide.  To attach a policy to this service-linked role, you must make the request using the AWS service that depends on this role.
    */
  def createServiceLinkedRole(): Request[CreateServiceLinkedRoleResponse, AWSError] = js.native
  def createServiceLinkedRole(callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceLinkedRoleResponse, Unit]): Request[CreateServiceLinkedRoleResponse, AWSError] = js.native
  /**
    * Creates an IAM role that is linked to a specific AWS service. The service controls the attached policies and when the role can be deleted. This helps ensure that the service is not broken by an unexpectedly changed or deleted role, which could put your AWS resources into an unknown state. Allowing the service to control the role helps improve service stability and proper cleanup when a service and its role are no longer needed. For more information, see Using Service-Linked Roles in the IAM User Guide.  To attach a policy to this service-linked role, you must make the request using the AWS service that depends on this role.
    */
  def createServiceLinkedRole(params: CreateServiceLinkedRoleRequest): Request[CreateServiceLinkedRoleResponse, AWSError] = js.native
  def createServiceLinkedRole(
    params: CreateServiceLinkedRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceLinkedRoleResponse, Unit]
  ): Request[CreateServiceLinkedRoleResponse, AWSError] = js.native
  
  /**
    * Generates a set of credentials consisting of a user name and password that can be used to access the service specified in the request. These credentials are generated by IAM, and can be used only for the specified service.  You can have a maximum of two sets of service-specific credentials for each supported service per user. The only supported service at this time is AWS CodeCommit. You can reset the password to a new service-generated value by calling ResetServiceSpecificCredential. For more information about service-specific credentials, see Using IAM with AWS CodeCommit: Git Credentials, SSH Keys, and AWS Access Keys in the IAM User Guide.
    */
  def createServiceSpecificCredential(): Request[CreateServiceSpecificCredentialResponse, AWSError] = js.native
  def createServiceSpecificCredential(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceSpecificCredentialResponse, Unit]
  ): Request[CreateServiceSpecificCredentialResponse, AWSError] = js.native
  /**
    * Generates a set of credentials consisting of a user name and password that can be used to access the service specified in the request. These credentials are generated by IAM, and can be used only for the specified service.  You can have a maximum of two sets of service-specific credentials for each supported service per user. The only supported service at this time is AWS CodeCommit. You can reset the password to a new service-generated value by calling ResetServiceSpecificCredential. For more information about service-specific credentials, see Using IAM with AWS CodeCommit: Git Credentials, SSH Keys, and AWS Access Keys in the IAM User Guide.
    */
  def createServiceSpecificCredential(params: CreateServiceSpecificCredentialRequest): Request[CreateServiceSpecificCredentialResponse, AWSError] = js.native
  def createServiceSpecificCredential(
    params: CreateServiceSpecificCredentialRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceSpecificCredentialResponse, Unit]
  ): Request[CreateServiceSpecificCredentialResponse, AWSError] = js.native
  
  /**
    * Creates a new IAM user for your AWS account. The number and size of IAM resources in an AWS account are limited. For more information, see IAM and STS Quotas in the IAM User Guide.
    */
  def createUser(): Request[CreateUserResponse, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Creates a new IAM user for your AWS account. The number and size of IAM resources in an AWS account are limited. For more information, see IAM and STS Quotas in the IAM User Guide.
    */
  def createUser(params: CreateUserRequest): Request[CreateUserResponse, AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]
  ): Request[CreateUserResponse, AWSError] = js.native
  
  /**
    * Creates a new virtual MFA device for the AWS account. After creating the virtual MFA, use EnableMFADevice to attach the MFA device to an IAM user. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide. The number and size of IAM resources in an AWS account are limited. For more information, see IAM and STS Quotas in the IAM User Guide.  The seed information contained in the QR code and the Base32 string should be treated like any other secret access information. In other words, protect the seed information as you would your AWS access keys or your passwords. After you provision your virtual device, you should ensure that the information is destroyed following secure procedures. 
    */
  def createVirtualMFADevice(): Request[CreateVirtualMFADeviceResponse, AWSError] = js.native
  def createVirtualMFADevice(callback: js.Function2[/* err */ AWSError, /* data */ CreateVirtualMFADeviceResponse, Unit]): Request[CreateVirtualMFADeviceResponse, AWSError] = js.native
  /**
    * Creates a new virtual MFA device for the AWS account. After creating the virtual MFA, use EnableMFADevice to attach the MFA device to an IAM user. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide. The number and size of IAM resources in an AWS account are limited. For more information, see IAM and STS Quotas in the IAM User Guide.  The seed information contained in the QR code and the Base32 string should be treated like any other secret access information. In other words, protect the seed information as you would your AWS access keys or your passwords. After you provision your virtual device, you should ensure that the information is destroyed following secure procedures. 
    */
  def createVirtualMFADevice(params: CreateVirtualMFADeviceRequest): Request[CreateVirtualMFADeviceResponse, AWSError] = js.native
  def createVirtualMFADevice(
    params: CreateVirtualMFADeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVirtualMFADeviceResponse, Unit]
  ): Request[CreateVirtualMFADeviceResponse, AWSError] = js.native
  
  /**
    * Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled. For more information about creating and working with virtual MFA devices, go to Enabling a Virtual Multi-factor Authentication (MFA) Device in the IAM User Guide.
    */
  def deactivateMFADevice(): Request[js.Object, AWSError] = js.native
  def deactivateMFADevice(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled. For more information about creating and working with virtual MFA devices, go to Enabling a Virtual Multi-factor Authentication (MFA) Device in the IAM User Guide.
    */
  def deactivateMFADevice(params: DeactivateMFADeviceRequest): Request[js.Object, AWSError] = js.native
  def deactivateMFADevice(
    params: DeactivateMFADeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the access key pair associated with the specified IAM user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
    */
  def deleteAccessKey(): Request[js.Object, AWSError] = js.native
  def deleteAccessKey(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the access key pair associated with the specified IAM user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
    */
  def deleteAccessKey(params: DeleteAccessKeyRequest): Request[js.Object, AWSError] = js.native
  def deleteAccessKey(
    params: DeleteAccessKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  Deletes the specified AWS account alias. For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
    */
  def deleteAccountAlias(): Request[js.Object, AWSError] = js.native
  def deleteAccountAlias(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  Deletes the specified AWS account alias. For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
    */
  def deleteAccountAlias(params: DeleteAccountAliasRequest): Request[js.Object, AWSError] = js.native
  def deleteAccountAlias(
    params: DeleteAccountAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the password policy for the AWS account. There are no parameters.
    */
  def deleteAccountPasswordPolicy(): Request[js.Object, AWSError] = js.native
  def deleteAccountPasswordPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified IAM group. The group must not contain any users or have any attached policies.
    */
  def deleteGroup(): Request[js.Object, AWSError] = js.native
  def deleteGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified IAM group. The group must not contain any users or have any attached policies.
    */
  def deleteGroup(params: DeleteGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteGroup(params: DeleteGroupRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified inline policy that is embedded in the specified IAM group. A group can also have managed policies attached to it. To detach a managed policy from a group, use DetachGroupPolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
    */
  def deleteGroupPolicy(): Request[js.Object, AWSError] = js.native
  def deleteGroupPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified inline policy that is embedded in the specified IAM group. A group can also have managed policies attached to it. To detach a managed policy from a group, use DetachGroupPolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
    */
  def deleteGroupPolicy(params: DeleteGroupPolicyRequest): Request[js.Object, AWSError] = js.native
  def deleteGroupPolicy(
    params: DeleteGroupPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified instance profile. The instance profile must not have an associated role.  Make sure that you do not have any Amazon EC2 instances running with the instance profile you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.  For more information about instance profiles, go to About Instance Profiles.
    */
  def deleteInstanceProfile(): Request[js.Object, AWSError] = js.native
  def deleteInstanceProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified instance profile. The instance profile must not have an associated role.  Make sure that you do not have any Amazon EC2 instances running with the instance profile you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.  For more information about instance profiles, go to About Instance Profiles.
    */
  def deleteInstanceProfile(params: DeleteInstanceProfileRequest): Request[js.Object, AWSError] = js.native
  def deleteInstanceProfile(
    params: DeleteInstanceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the password for the specified IAM user, which terminates the user's ability to access AWS services through the AWS Management Console.   Deleting a user's password does not prevent a user from accessing AWS through the command line interface or the API. To prevent all user access, you must also either make any access keys inactive or delete them. For more information about making keys inactive or deleting them, see UpdateAccessKey and DeleteAccessKey.  
    */
  def deleteLoginProfile(): Request[js.Object, AWSError] = js.native
  def deleteLoginProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the password for the specified IAM user, which terminates the user's ability to access AWS services through the AWS Management Console.   Deleting a user's password does not prevent a user from accessing AWS through the command line interface or the API. To prevent all user access, you must also either make any access keys inactive or delete them. For more information about making keys inactive or deleting them, see UpdateAccessKey and DeleteAccessKey.  
    */
  def deleteLoginProfile(params: DeleteLoginProfileRequest): Request[js.Object, AWSError] = js.native
  def deleteLoginProfile(
    params: DeleteLoginProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an OpenID Connect identity provider (IdP) resource object in IAM. Deleting an IAM OIDC provider resource does not update any roles that reference the provider as a principal in their trust policies. Any attempt to assume a role that references a deleted provider fails. This operation is idempotent; it does not fail or return an error if you call the operation for a provider that does not exist.
    */
  def deleteOpenIDConnectProvider(): Request[js.Object, AWSError] = js.native
  def deleteOpenIDConnectProvider(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an OpenID Connect identity provider (IdP) resource object in IAM. Deleting an IAM OIDC provider resource does not update any roles that reference the provider as a principal in their trust policies. Any attempt to assume a role that references a deleted provider fails. This operation is idempotent; it does not fail or return an error if you call the operation for a provider that does not exist.
    */
  def deleteOpenIDConnectProvider(params: DeleteOpenIDConnectProviderRequest): Request[js.Object, AWSError] = js.native
  def deleteOpenIDConnectProvider(
    params: DeleteOpenIDConnectProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified managed policy. Before you can delete a managed policy, you must first detach the policy from all users, groups, and roles that it is attached to. In addition, you must delete all the policy's versions. The following steps describe the process for deleting a managed policy:   Detach the policy from all users, groups, and roles that the policy is attached to, using the DetachUserPolicy, DetachGroupPolicy, or DetachRolePolicy API operations. To list all the users, groups, and roles that a policy is attached to, use ListEntitiesForPolicy.   Delete all versions of the policy using DeletePolicyVersion. To list the policy's versions, use ListPolicyVersions. You cannot use DeletePolicyVersion to delete the version that is marked as the default version. You delete the policy's default version in the next step of the process.   Delete the policy (this automatically deletes the policy's default version) using this API.   For information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def deletePolicy(): Request[js.Object, AWSError] = js.native
  def deletePolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified managed policy. Before you can delete a managed policy, you must first detach the policy from all users, groups, and roles that it is attached to. In addition, you must delete all the policy's versions. The following steps describe the process for deleting a managed policy:   Detach the policy from all users, groups, and roles that the policy is attached to, using the DetachUserPolicy, DetachGroupPolicy, or DetachRolePolicy API operations. To list all the users, groups, and roles that a policy is attached to, use ListEntitiesForPolicy.   Delete all versions of the policy using DeletePolicyVersion. To list the policy's versions, use ListPolicyVersions. You cannot use DeletePolicyVersion to delete the version that is marked as the default version. You delete the policy's default version in the next step of the process.   Delete the policy (this automatically deletes the policy's default version) using this API.   For information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def deletePolicy(params: DeletePolicyRequest): Request[js.Object, AWSError] = js.native
  def deletePolicy(
    params: DeletePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified version from the specified managed policy. You cannot delete the default version from a policy using this API. To delete the default version from a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions. For information about versions for managed policies, see Versioning for Managed Policies in the IAM User Guide.
    */
  def deletePolicyVersion(): Request[js.Object, AWSError] = js.native
  def deletePolicyVersion(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified version from the specified managed policy. You cannot delete the default version from a policy using this API. To delete the default version from a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions. For information about versions for managed policies, see Versioning for Managed Policies in the IAM User Guide.
    */
  def deletePolicyVersion(params: DeletePolicyVersionRequest): Request[js.Object, AWSError] = js.native
  def deletePolicyVersion(
    params: DeletePolicyVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified role. The role must not have any policies attached. For more information about roles, go to Working with Roles.  Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance. 
    */
  def deleteRole(): Request[js.Object, AWSError] = js.native
  def deleteRole(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified role. The role must not have any policies attached. For more information about roles, go to Working with Roles.  Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance. 
    */
  def deleteRole(params: DeleteRoleRequest): Request[js.Object, AWSError] = js.native
  def deleteRole(params: DeleteRoleRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the permissions boundary for the specified IAM role.   Deleting the permissions boundary for a role might increase its permissions. For example, it might allow anyone who assumes the role to perform all the actions granted in its permissions policies.  
    */
  def deleteRolePermissionsBoundary(): Request[js.Object, AWSError] = js.native
  def deleteRolePermissionsBoundary(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the permissions boundary for the specified IAM role.   Deleting the permissions boundary for a role might increase its permissions. For example, it might allow anyone who assumes the role to perform all the actions granted in its permissions policies.  
    */
  def deleteRolePermissionsBoundary(params: DeleteRolePermissionsBoundaryRequest): Request[js.Object, AWSError] = js.native
  def deleteRolePermissionsBoundary(
    params: DeleteRolePermissionsBoundaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified inline policy that is embedded in the specified IAM role. A role can also have managed policies attached to it. To detach a managed policy from a role, use DetachRolePolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
    */
  def deleteRolePolicy(): Request[js.Object, AWSError] = js.native
  def deleteRolePolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified inline policy that is embedded in the specified IAM role. A role can also have managed policies attached to it. To detach a managed policy from a role, use DetachRolePolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
    */
  def deleteRolePolicy(params: DeleteRolePolicyRequest): Request[js.Object, AWSError] = js.native
  def deleteRolePolicy(
    params: DeleteRolePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a SAML provider resource in IAM. Deleting the provider resource from IAM does not update any roles that reference the SAML provider resource's ARN as a principal in their trust policies. Any attempt to assume a role that references a non-existent provider resource ARN fails.   This operation requires Signature Version 4. 
    */
  def deleteSAMLProvider(): Request[js.Object, AWSError] = js.native
  def deleteSAMLProvider(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a SAML provider resource in IAM. Deleting the provider resource from IAM does not update any roles that reference the SAML provider resource's ARN as a principal in their trust policies. Any attempt to assume a role that references a non-existent provider resource ARN fails.   This operation requires Signature Version 4. 
    */
  def deleteSAMLProvider(params: DeleteSAMLProviderRequest): Request[js.Object, AWSError] = js.native
  def deleteSAMLProvider(
    params: DeleteSAMLProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified SSH public key. The SSH public key deleted by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
    */
  def deleteSSHPublicKey(): Request[js.Object, AWSError] = js.native
  def deleteSSHPublicKey(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified SSH public key. The SSH public key deleted by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
    */
  def deleteSSHPublicKey(params: DeleteSSHPublicKeyRequest): Request[js.Object, AWSError] = js.native
  def deleteSSHPublicKey(
    params: DeleteSSHPublicKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified server certificate. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.   If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have implications for your application. If Elastic Load Balancing doesn't detect the deletion of bound certificates, it may continue to use the certificates. This could cause Elastic Load Balancing to stop accepting traffic. We recommend that you remove the reference to the certificate from Elastic Load Balancing before using this command to delete the certificate. For more information, go to DeleteLoadBalancerListeners in the Elastic Load Balancing API Reference. 
    */
  def deleteServerCertificate(): Request[js.Object, AWSError] = js.native
  def deleteServerCertificate(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified server certificate. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.   If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have implications for your application. If Elastic Load Balancing doesn't detect the deletion of bound certificates, it may continue to use the certificates. This could cause Elastic Load Balancing to stop accepting traffic. We recommend that you remove the reference to the certificate from Elastic Load Balancing before using this command to delete the certificate. For more information, go to DeleteLoadBalancerListeners in the Elastic Load Balancing API Reference. 
    */
  def deleteServerCertificate(params: DeleteServerCertificateRequest): Request[js.Object, AWSError] = js.native
  def deleteServerCertificate(
    params: DeleteServerCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Submits a service-linked role deletion request and returns a DeletionTaskId, which you can use to check the status of the deletion. Before you call this operation, confirm that the role has no active sessions and that any resources used by the role in the linked service are deleted. If you call this operation more than once for the same service-linked role and an earlier deletion task is not complete, then the DeletionTaskId of the earlier request is returned. If you submit a deletion request for a service-linked role whose linked service is still accessing a resource, then the deletion task fails. If it fails, the GetServiceLinkedRoleDeletionStatus API operation returns the reason for the failure, usually including the resources that must be deleted. To delete the service-linked role, you must first remove those resources from the linked service and then submit the deletion request again. Resources are specific to the service that is linked to the role. For more information about removing resources from a service, see the AWS documentation for your service. For more information about service-linked roles, see Roles Terms and Concepts: AWS Service-Linked Role in the IAM User Guide.
    */
  def deleteServiceLinkedRole(): Request[DeleteServiceLinkedRoleResponse, AWSError] = js.native
  def deleteServiceLinkedRole(callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceLinkedRoleResponse, Unit]): Request[DeleteServiceLinkedRoleResponse, AWSError] = js.native
  /**
    * Submits a service-linked role deletion request and returns a DeletionTaskId, which you can use to check the status of the deletion. Before you call this operation, confirm that the role has no active sessions and that any resources used by the role in the linked service are deleted. If you call this operation more than once for the same service-linked role and an earlier deletion task is not complete, then the DeletionTaskId of the earlier request is returned. If you submit a deletion request for a service-linked role whose linked service is still accessing a resource, then the deletion task fails. If it fails, the GetServiceLinkedRoleDeletionStatus API operation returns the reason for the failure, usually including the resources that must be deleted. To delete the service-linked role, you must first remove those resources from the linked service and then submit the deletion request again. Resources are specific to the service that is linked to the role. For more information about removing resources from a service, see the AWS documentation for your service. For more information about service-linked roles, see Roles Terms and Concepts: AWS Service-Linked Role in the IAM User Guide.
    */
  def deleteServiceLinkedRole(params: DeleteServiceLinkedRoleRequest): Request[DeleteServiceLinkedRoleResponse, AWSError] = js.native
  def deleteServiceLinkedRole(
    params: DeleteServiceLinkedRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceLinkedRoleResponse, Unit]
  ): Request[DeleteServiceLinkedRoleResponse, AWSError] = js.native
  
  /**
    * Deletes the specified service-specific credential.
    */
  def deleteServiceSpecificCredential(): Request[js.Object, AWSError] = js.native
  def deleteServiceSpecificCredential(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified service-specific credential.
    */
  def deleteServiceSpecificCredential(params: DeleteServiceSpecificCredentialRequest): Request[js.Object, AWSError] = js.native
  def deleteServiceSpecificCredential(
    params: DeleteServiceSpecificCredentialRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a signing certificate associated with the specified IAM user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated IAM users.
    */
  def deleteSigningCertificate(): Request[js.Object, AWSError] = js.native
  def deleteSigningCertificate(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a signing certificate associated with the specified IAM user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated IAM users.
    */
  def deleteSigningCertificate(params: DeleteSigningCertificateRequest): Request[js.Object, AWSError] = js.native
  def deleteSigningCertificate(
    params: DeleteSigningCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified IAM user. Unlike the AWS Management Console, when you delete a user programmatically, you must delete the items attached to the user manually, or the deletion fails. For more information, see Deleting an IAM User. Before attempting to delete a user, remove the following items:   Password (DeleteLoginProfile)   Access keys (DeleteAccessKey)   Signing certificate (DeleteSigningCertificate)   SSH public key (DeleteSSHPublicKey)   Git credentials (DeleteServiceSpecificCredential)   Multi-factor authentication (MFA) device (DeactivateMFADevice, DeleteVirtualMFADevice)   Inline policies (DeleteUserPolicy)   Attached managed policies (DetachUserPolicy)   Group memberships (RemoveUserFromGroup)  
    */
  def deleteUser(): Request[js.Object, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified IAM user. Unlike the AWS Management Console, when you delete a user programmatically, you must delete the items attached to the user manually, or the deletion fails. For more information, see Deleting an IAM User. Before attempting to delete a user, remove the following items:   Password (DeleteLoginProfile)   Access keys (DeleteAccessKey)   Signing certificate (DeleteSigningCertificate)   SSH public key (DeleteSSHPublicKey)   Git credentials (DeleteServiceSpecificCredential)   Multi-factor authentication (MFA) device (DeactivateMFADevice, DeleteVirtualMFADevice)   Inline policies (DeleteUserPolicy)   Attached managed policies (DetachUserPolicy)   Group memberships (RemoveUserFromGroup)  
    */
  def deleteUser(params: DeleteUserRequest): Request[js.Object, AWSError] = js.native
  def deleteUser(params: DeleteUserRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the permissions boundary for the specified IAM user.  Deleting the permissions boundary for a user might increase its permissions by allowing the user to perform all the actions granted in its permissions policies.  
    */
  def deleteUserPermissionsBoundary(): Request[js.Object, AWSError] = js.native
  def deleteUserPermissionsBoundary(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the permissions boundary for the specified IAM user.  Deleting the permissions boundary for a user might increase its permissions by allowing the user to perform all the actions granted in its permissions policies.  
    */
  def deleteUserPermissionsBoundary(params: DeleteUserPermissionsBoundaryRequest): Request[js.Object, AWSError] = js.native
  def deleteUserPermissionsBoundary(
    params: DeleteUserPermissionsBoundaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified inline policy that is embedded in the specified IAM user. A user can also have managed policies attached to it. To detach a managed policy from a user, use DetachUserPolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
    */
  def deleteUserPolicy(): Request[js.Object, AWSError] = js.native
  def deleteUserPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified inline policy that is embedded in the specified IAM user. A user can also have managed policies attached to it. To detach a managed policy from a user, use DetachUserPolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
    */
  def deleteUserPolicy(params: DeleteUserPolicyRequest): Request[js.Object, AWSError] = js.native
  def deleteUserPolicy(
    params: DeleteUserPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a virtual MFA device.   You must deactivate a user's virtual MFA device before you can delete it. For information about deactivating MFA devices, see DeactivateMFADevice.  
    */
  def deleteVirtualMFADevice(): Request[js.Object, AWSError] = js.native
  def deleteVirtualMFADevice(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a virtual MFA device.   You must deactivate a user's virtual MFA device before you can delete it. For information about deactivating MFA devices, see DeactivateMFADevice.  
    */
  def deleteVirtualMFADevice(params: DeleteVirtualMFADeviceRequest): Request[js.Object, AWSError] = js.native
  def deleteVirtualMFADevice(
    params: DeleteVirtualMFADeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the specified managed policy from the specified IAM group. A group can also have inline policies embedded with it. To delete an inline policy, use the DeleteGroupPolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def detachGroupPolicy(): Request[js.Object, AWSError] = js.native
  def detachGroupPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified managed policy from the specified IAM group. A group can also have inline policies embedded with it. To delete an inline policy, use the DeleteGroupPolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def detachGroupPolicy(params: DetachGroupPolicyRequest): Request[js.Object, AWSError] = js.native
  def detachGroupPolicy(
    params: DetachGroupPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the specified managed policy from the specified role. A role can also have inline policies embedded with it. To delete an inline policy, use the DeleteRolePolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def detachRolePolicy(): Request[js.Object, AWSError] = js.native
  def detachRolePolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified managed policy from the specified role. A role can also have inline policies embedded with it. To delete an inline policy, use the DeleteRolePolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def detachRolePolicy(params: DetachRolePolicyRequest): Request[js.Object, AWSError] = js.native
  def detachRolePolicy(
    params: DetachRolePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the specified managed policy from the specified user. A user can also have inline policies embedded with it. To delete an inline policy, use the DeleteUserPolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def detachUserPolicy(): Request[js.Object, AWSError] = js.native
  def detachUserPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified managed policy from the specified user. A user can also have inline policies embedded with it. To delete an inline policy, use the DeleteUserPolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def detachUserPolicy(params: DetachUserPolicyRequest): Request[js.Object, AWSError] = js.native
  def detachUserPolicy(
    params: DetachUserPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Enables the specified MFA device and associates it with the specified IAM user. When enabled, the MFA device is required for every subsequent login by the IAM user associated with the device.
    */
  def enableMFADevice(): Request[js.Object, AWSError] = js.native
  def enableMFADevice(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Enables the specified MFA device and associates it with the specified IAM user. When enabled, the MFA device is required for every subsequent login by the IAM user associated with the device.
    */
  def enableMFADevice(params: EnableMFADeviceRequest): Request[js.Object, AWSError] = js.native
  def enableMFADevice(
    params: EnableMFADeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  Generates a credential report for the AWS account. For more information about the credential report, see Getting Credential Reports in the IAM User Guide.
    */
  def generateCredentialReport(): Request[GenerateCredentialReportResponse, AWSError] = js.native
  def generateCredentialReport(callback: js.Function2[/* err */ AWSError, /* data */ GenerateCredentialReportResponse, Unit]): Request[GenerateCredentialReportResponse, AWSError] = js.native
  
  /**
    * Generates a report for service last accessed data for AWS Organizations. You can generate a report for any entities (organization root, organizational unit, or account) or policies in your organization. To call this operation, you must be signed in using your AWS Organizations master account credentials. You can use your long-term IAM user or root user credentials, or temporary credentials from assuming an IAM role. SCPs must be enabled for your organization root. You must have the required IAM and AWS Organizations permissions. For more information, see Refining Permissions Using Service Last Accessed Data in the IAM User Guide. You can generate a service last accessed data report for entities by specifying only the entity's path. This data includes a list of services that are allowed by any service control policies (SCPs) that apply to the entity. You can generate a service last accessed data report for a policy by specifying an entity's path and an optional AWS Organizations policy ID. This data includes a list of services that are allowed by the specified SCP. For each service in both report types, the data includes the most recent account activity that the policy allows to account principals in the entity or the entity's children. For important information about the data, reporting period, permissions required, troubleshooting, and supported Regions see Reducing Permissions Using Service Last Accessed Data in the IAM User Guide.  The data includes all attempts to access AWS, not just the successful ones. This includes all attempts that were made using the AWS Management Console, the AWS API through any of the SDKs, or any of the command line tools. An unexpected entry in the service last accessed data does not mean that an account has been compromised, because the request might have been denied. Refer to your CloudTrail logs as the authoritative source for information about all API calls and whether they were successful or denied access. For more information, see Logging IAM Events with CloudTrail in the IAM User Guide.  This operation returns a JobId. Use this parameter in the  GetOrganizationsAccessReport  operation to check the status of the report generation. To check the status of this request, use the JobId parameter in the  GetOrganizationsAccessReport  operation and test the JobStatus response parameter. When the job is complete, you can retrieve the report. To generate a service last accessed data report for entities, specify an entity path without specifying the optional AWS Organizations policy ID. The type of entity that you specify determines the data returned in the report.    Root – When you specify the organizations root as the entity, the resulting report lists all of the services allowed by SCPs that are attached to your root. For each service, the report includes data for all accounts in your organization except the master account, because the master account is not limited by SCPs.    OU – When you specify an organizational unit (OU) as the entity, the resulting report lists all of the services allowed by SCPs that are attached to the OU and its parents. For each service, the report includes data for all accounts in the OU or its children. This data excludes the master account, because the master account is not limited by SCPs.    Master account – When you specify the master account, the resulting report lists all AWS services, because the master account is not limited by SCPs. For each service, the report includes data for only the master account.    Account – When you specify another account as the entity, the resulting report lists all of the services allowed by SCPs that are attached to the account and its parents. For each service, the report includes data for only the specified account.   To generate a service last accessed data report for policies, specify an entity path and the optional AWS Organizations policy ID. The type of entity that you specify determines the data returned for each service.    Root – When you specify the root entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for all accounts in your organization to which the SCP applies. This data excludes the master account, because the master account is not limited by SCPs. If the SCP is not attached to any entities in the organization, then the report will return a list of services with no data.    OU – When you specify an OU entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for all accounts in the OU or its children to which the SCP applies. This means that other accounts outside the OU that are affected by the SCP might not be included in the data. This data excludes the master account, because the master account is not limited by SCPs. If the SCP is not attached to the OU or one of its children, the report will return a list of services with no data.    Master account – When you specify the master account, the resulting report lists all AWS services, because the master account is not limited by SCPs. If you specify a policy ID in the CLI or API, the policy is ignored. For each service, the report includes data for only the master account.    Account – When you specify another account entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for only the specified account. This means that other accounts in the organization that are affected by the SCP might not be included in the data. If the SCP is not attached to the account, the report will return a list of services with no data.    Service last accessed data does not use other policy types when determining whether a principal could access a service. These other policy types include identity-based policies, resource-based policies, access control lists, IAM permissions boundaries, and STS assume role policies. It only applies SCP logic. For more about the evaluation of policy types, see Evaluating Policies in the IAM User Guide.  For more information about service last accessed data, see Reducing Policy Scope by Viewing User Activity in the IAM User Guide.
    */
  def generateOrganizationsAccessReport(): Request[GenerateOrganizationsAccessReportResponse, AWSError] = js.native
  def generateOrganizationsAccessReport(
    callback: js.Function2[/* err */ AWSError, /* data */ GenerateOrganizationsAccessReportResponse, Unit]
  ): Request[GenerateOrganizationsAccessReportResponse, AWSError] = js.native
  /**
    * Generates a report for service last accessed data for AWS Organizations. You can generate a report for any entities (organization root, organizational unit, or account) or policies in your organization. To call this operation, you must be signed in using your AWS Organizations master account credentials. You can use your long-term IAM user or root user credentials, or temporary credentials from assuming an IAM role. SCPs must be enabled for your organization root. You must have the required IAM and AWS Organizations permissions. For more information, see Refining Permissions Using Service Last Accessed Data in the IAM User Guide. You can generate a service last accessed data report for entities by specifying only the entity's path. This data includes a list of services that are allowed by any service control policies (SCPs) that apply to the entity. You can generate a service last accessed data report for a policy by specifying an entity's path and an optional AWS Organizations policy ID. This data includes a list of services that are allowed by the specified SCP. For each service in both report types, the data includes the most recent account activity that the policy allows to account principals in the entity or the entity's children. For important information about the data, reporting period, permissions required, troubleshooting, and supported Regions see Reducing Permissions Using Service Last Accessed Data in the IAM User Guide.  The data includes all attempts to access AWS, not just the successful ones. This includes all attempts that were made using the AWS Management Console, the AWS API through any of the SDKs, or any of the command line tools. An unexpected entry in the service last accessed data does not mean that an account has been compromised, because the request might have been denied. Refer to your CloudTrail logs as the authoritative source for information about all API calls and whether they were successful or denied access. For more information, see Logging IAM Events with CloudTrail in the IAM User Guide.  This operation returns a JobId. Use this parameter in the  GetOrganizationsAccessReport  operation to check the status of the report generation. To check the status of this request, use the JobId parameter in the  GetOrganizationsAccessReport  operation and test the JobStatus response parameter. When the job is complete, you can retrieve the report. To generate a service last accessed data report for entities, specify an entity path without specifying the optional AWS Organizations policy ID. The type of entity that you specify determines the data returned in the report.    Root – When you specify the organizations root as the entity, the resulting report lists all of the services allowed by SCPs that are attached to your root. For each service, the report includes data for all accounts in your organization except the master account, because the master account is not limited by SCPs.    OU – When you specify an organizational unit (OU) as the entity, the resulting report lists all of the services allowed by SCPs that are attached to the OU and its parents. For each service, the report includes data for all accounts in the OU or its children. This data excludes the master account, because the master account is not limited by SCPs.    Master account – When you specify the master account, the resulting report lists all AWS services, because the master account is not limited by SCPs. For each service, the report includes data for only the master account.    Account – When you specify another account as the entity, the resulting report lists all of the services allowed by SCPs that are attached to the account and its parents. For each service, the report includes data for only the specified account.   To generate a service last accessed data report for policies, specify an entity path and the optional AWS Organizations policy ID. The type of entity that you specify determines the data returned for each service.    Root – When you specify the root entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for all accounts in your organization to which the SCP applies. This data excludes the master account, because the master account is not limited by SCPs. If the SCP is not attached to any entities in the organization, then the report will return a list of services with no data.    OU – When you specify an OU entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for all accounts in the OU or its children to which the SCP applies. This means that other accounts outside the OU that are affected by the SCP might not be included in the data. This data excludes the master account, because the master account is not limited by SCPs. If the SCP is not attached to the OU or one of its children, the report will return a list of services with no data.    Master account – When you specify the master account, the resulting report lists all AWS services, because the master account is not limited by SCPs. If you specify a policy ID in the CLI or API, the policy is ignored. For each service, the report includes data for only the master account.    Account – When you specify another account entity and a policy ID, the resulting report lists all of the services that are allowed by the specified SCP. For each service, the report includes data for only the specified account. This means that other accounts in the organization that are affected by the SCP might not be included in the data. If the SCP is not attached to the account, the report will return a list of services with no data.    Service last accessed data does not use other policy types when determining whether a principal could access a service. These other policy types include identity-based policies, resource-based policies, access control lists, IAM permissions boundaries, and STS assume role policies. It only applies SCP logic. For more about the evaluation of policy types, see Evaluating Policies in the IAM User Guide.  For more information about service last accessed data, see Reducing Policy Scope by Viewing User Activity in the IAM User Guide.
    */
  def generateOrganizationsAccessReport(params: GenerateOrganizationsAccessReportRequest): Request[GenerateOrganizationsAccessReportResponse, AWSError] = js.native
  def generateOrganizationsAccessReport(
    params: GenerateOrganizationsAccessReportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GenerateOrganizationsAccessReportResponse, Unit]
  ): Request[GenerateOrganizationsAccessReportResponse, AWSError] = js.native
  
  /**
    * Generates a report that includes details about when an IAM resource (user, group, role, or policy) was last used in an attempt to access AWS services. Recent activity usually appears within four hours. IAM reports activity for the last 365 days, or less if your Region began supporting this feature within the last year. For more information, see Regions Where Data Is Tracked.  The service last accessed data includes all attempts to access an AWS API, not just the successful ones. This includes all attempts that were made using the AWS Management Console, the AWS API through any of the SDKs, or any of the command line tools. An unexpected entry in the service last accessed data does not mean that your account has been compromised, because the request might have been denied. Refer to your CloudTrail logs as the authoritative source for information about all API calls and whether they were successful or denied access. For more information, see Logging IAM Events with CloudTrail in the IAM User Guide.  The GenerateServiceLastAccessedDetails operation returns a JobId. Use this parameter in the following operations to retrieve the following details from your report:     GetServiceLastAccessedDetails – Use this operation for users, groups, roles, or policies to list every AWS service that the resource could access using permissions policies. For each service, the response includes information about the most recent access attempt. The JobId returned by GenerateServiceLastAccessedDetail must be used by the same role within a session, or by the same user when used to call GetServiceLastAccessedDetail.    GetServiceLastAccessedDetailsWithEntities – Use this operation for groups and policies to list information about the associated entities (users or roles) that attempted to access a specific AWS service.    To check the status of the GenerateServiceLastAccessedDetails request, use the JobId parameter in the same operations and test the JobStatus response parameter. For additional information about the permissions policies that allow an identity (user, group, or role) to access specific services, use the ListPoliciesGrantingServiceAccess operation.  Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, AWS Organizations policies, IAM permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see Evaluating Policies in the IAM User Guide.  For more information about service and action last accessed data, see Reducing Permissions Using Service Last Accessed Data in the IAM User Guide.
    */
  def generateServiceLastAccessedDetails(): Request[GenerateServiceLastAccessedDetailsResponse, AWSError] = js.native
  def generateServiceLastAccessedDetails(
    callback: js.Function2[/* err */ AWSError, /* data */ GenerateServiceLastAccessedDetailsResponse, Unit]
  ): Request[GenerateServiceLastAccessedDetailsResponse, AWSError] = js.native
  /**
    * Generates a report that includes details about when an IAM resource (user, group, role, or policy) was last used in an attempt to access AWS services. Recent activity usually appears within four hours. IAM reports activity for the last 365 days, or less if your Region began supporting this feature within the last year. For more information, see Regions Where Data Is Tracked.  The service last accessed data includes all attempts to access an AWS API, not just the successful ones. This includes all attempts that were made using the AWS Management Console, the AWS API through any of the SDKs, or any of the command line tools. An unexpected entry in the service last accessed data does not mean that your account has been compromised, because the request might have been denied. Refer to your CloudTrail logs as the authoritative source for information about all API calls and whether they were successful or denied access. For more information, see Logging IAM Events with CloudTrail in the IAM User Guide.  The GenerateServiceLastAccessedDetails operation returns a JobId. Use this parameter in the following operations to retrieve the following details from your report:     GetServiceLastAccessedDetails – Use this operation for users, groups, roles, or policies to list every AWS service that the resource could access using permissions policies. For each service, the response includes information about the most recent access attempt. The JobId returned by GenerateServiceLastAccessedDetail must be used by the same role within a session, or by the same user when used to call GetServiceLastAccessedDetail.    GetServiceLastAccessedDetailsWithEntities – Use this operation for groups and policies to list information about the associated entities (users or roles) that attempted to access a specific AWS service.    To check the status of the GenerateServiceLastAccessedDetails request, use the JobId parameter in the same operations and test the JobStatus response parameter. For additional information about the permissions policies that allow an identity (user, group, or role) to access specific services, use the ListPoliciesGrantingServiceAccess operation.  Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, AWS Organizations policies, IAM permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see Evaluating Policies in the IAM User Guide.  For more information about service and action last accessed data, see Reducing Permissions Using Service Last Accessed Data in the IAM User Guide.
    */
  def generateServiceLastAccessedDetails(params: GenerateServiceLastAccessedDetailsRequest): Request[GenerateServiceLastAccessedDetailsResponse, AWSError] = js.native
  def generateServiceLastAccessedDetails(
    params: GenerateServiceLastAccessedDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GenerateServiceLastAccessedDetailsResponse, Unit]
  ): Request[GenerateServiceLastAccessedDetailsResponse, AWSError] = js.native
  
  /**
    * Retrieves information about when the specified access key was last used. The information includes the date and time of last use, along with the AWS service and Region that were specified in the last request made with that key.
    */
  def getAccessKeyLastUsed(): Request[GetAccessKeyLastUsedResponse, AWSError] = js.native
  def getAccessKeyLastUsed(callback: js.Function2[/* err */ AWSError, /* data */ GetAccessKeyLastUsedResponse, Unit]): Request[GetAccessKeyLastUsedResponse, AWSError] = js.native
  /**
    * Retrieves information about when the specified access key was last used. The information includes the date and time of last use, along with the AWS service and Region that were specified in the last request made with that key.
    */
  def getAccessKeyLastUsed(params: GetAccessKeyLastUsedRequest): Request[GetAccessKeyLastUsedResponse, AWSError] = js.native
  def getAccessKeyLastUsed(
    params: GetAccessKeyLastUsedRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessKeyLastUsedResponse, Unit]
  ): Request[GetAccessKeyLastUsedResponse, AWSError] = js.native
  
  /**
    * Retrieves information about all IAM users, groups, roles, and policies in your AWS account, including their relationships to one another. Use this API to obtain a snapshot of the configuration of IAM permissions (users, groups, roles, and policies) in your account.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  You can optionally filter the results using the Filter parameter. You can paginate the results using the MaxItems and Marker parameters.
    */
  def getAccountAuthorizationDetails(): Request[GetAccountAuthorizationDetailsResponse, AWSError] = js.native
  def getAccountAuthorizationDetails(
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccountAuthorizationDetailsResponse, Unit]
  ): Request[GetAccountAuthorizationDetailsResponse, AWSError] = js.native
  /**
    * Retrieves information about all IAM users, groups, roles, and policies in your AWS account, including their relationships to one another. Use this API to obtain a snapshot of the configuration of IAM permissions (users, groups, roles, and policies) in your account.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  You can optionally filter the results using the Filter parameter. You can paginate the results using the MaxItems and Marker parameters.
    */
  def getAccountAuthorizationDetails(params: GetAccountAuthorizationDetailsRequest): Request[GetAccountAuthorizationDetailsResponse, AWSError] = js.native
  def getAccountAuthorizationDetails(
    params: GetAccountAuthorizationDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccountAuthorizationDetailsResponse, Unit]
  ): Request[GetAccountAuthorizationDetailsResponse, AWSError] = js.native
  
  /**
    * Retrieves the password policy for the AWS account. For more information about using a password policy, go to Managing an IAM Password Policy.
    */
  def getAccountPasswordPolicy(): Request[GetAccountPasswordPolicyResponse, AWSError] = js.native
  def getAccountPasswordPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetAccountPasswordPolicyResponse, Unit]): Request[GetAccountPasswordPolicyResponse, AWSError] = js.native
  
  /**
    * Retrieves information about IAM entity usage and IAM quotas in the AWS account. The number and size of IAM resources in an AWS account are limited. For more information, see IAM and STS Quotas in the IAM User Guide.
    */
  def getAccountSummary(): Request[GetAccountSummaryResponse, AWSError] = js.native
  def getAccountSummary(callback: js.Function2[/* err */ AWSError, /* data */ GetAccountSummaryResponse, Unit]): Request[GetAccountSummaryResponse, AWSError] = js.native
  
  /**
    * Gets a list of all of the context keys referenced in the input policies. The policies are supplied as a list of one or more strings. To get the context keys from policies associated with an IAM user, group, or role, use GetContextKeysForPrincipalPolicy. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value specified in an IAM policy. Use GetContextKeysForCustomPolicy to understand what key names and values you must supply when you call SimulateCustomPolicy. Note that all parameters are shown in unencoded form here for clarity but must be URL encoded to be included as a part of a real HTML request.
    */
  def getContextKeysForCustomPolicy(): Request[GetContextKeysForPolicyResponse, AWSError] = js.native
  def getContextKeysForCustomPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetContextKeysForPolicyResponse, Unit]): Request[GetContextKeysForPolicyResponse, AWSError] = js.native
  /**
    * Gets a list of all of the context keys referenced in the input policies. The policies are supplied as a list of one or more strings. To get the context keys from policies associated with an IAM user, group, or role, use GetContextKeysForPrincipalPolicy. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value specified in an IAM policy. Use GetContextKeysForCustomPolicy to understand what key names and values you must supply when you call SimulateCustomPolicy. Note that all parameters are shown in unencoded form here for clarity but must be URL encoded to be included as a part of a real HTML request.
    */
  def getContextKeysForCustomPolicy(params: GetContextKeysForCustomPolicyRequest): Request[GetContextKeysForPolicyResponse, AWSError] = js.native
  def getContextKeysForCustomPolicy(
    params: GetContextKeysForCustomPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContextKeysForPolicyResponse, Unit]
  ): Request[GetContextKeysForPolicyResponse, AWSError] = js.native
  
  /**
    * Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all of the policies attached to groups that the user is a member of. You can optionally include a list of one or more additional policies, specified as strings. If you want to include only a list of policies by string, use GetContextKeysForCustomPolicy instead.  Note: This API discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use GetContextKeysForCustomPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value in an IAM policy. Use GetContextKeysForPrincipalPolicy to understand what key names and values you must supply when you call SimulatePrincipalPolicy.
    */
  def getContextKeysForPrincipalPolicy(): Request[GetContextKeysForPolicyResponse, AWSError] = js.native
  def getContextKeysForPrincipalPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetContextKeysForPolicyResponse, Unit]): Request[GetContextKeysForPolicyResponse, AWSError] = js.native
  /**
    * Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all of the policies attached to groups that the user is a member of. You can optionally include a list of one or more additional policies, specified as strings. If you want to include only a list of policies by string, use GetContextKeysForCustomPolicy instead.  Note: This API discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use GetContextKeysForCustomPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value in an IAM policy. Use GetContextKeysForPrincipalPolicy to understand what key names and values you must supply when you call SimulatePrincipalPolicy.
    */
  def getContextKeysForPrincipalPolicy(params: GetContextKeysForPrincipalPolicyRequest): Request[GetContextKeysForPolicyResponse, AWSError] = js.native
  def getContextKeysForPrincipalPolicy(
    params: GetContextKeysForPrincipalPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContextKeysForPolicyResponse, Unit]
  ): Request[GetContextKeysForPolicyResponse, AWSError] = js.native
  
  /**
    *  Retrieves a credential report for the AWS account. For more information about the credential report, see Getting Credential Reports in the IAM User Guide.
    */
  def getCredentialReport(): Request[GetCredentialReportResponse, AWSError] = js.native
  def getCredentialReport(callback: js.Function2[/* err */ AWSError, /* data */ GetCredentialReportResponse, Unit]): Request[GetCredentialReportResponse, AWSError] = js.native
  
  /**
    *  Returns a list of IAM users that are in the specified IAM group. You can paginate the results using the MaxItems and Marker parameters.
    */
  def getGroup(): Request[GetGroupResponse, AWSError] = js.native
  def getGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetGroupResponse, Unit]): Request[GetGroupResponse, AWSError] = js.native
  /**
    *  Returns a list of IAM users that are in the specified IAM group. You can paginate the results using the MaxItems and Marker parameters.
    */
  def getGroup(params: GetGroupRequest): Request[GetGroupResponse, AWSError] = js.native
  def getGroup(
    params: GetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGroupResponse, Unit]
  ): Request[GetGroupResponse, AWSError] = js.native
  
  /**
    * Retrieves the specified inline policy document that is embedded in the specified IAM group.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM group can also have managed policies attached to it. To retrieve a managed policy document that is attached to a group, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def getGroupPolicy(): Request[GetGroupPolicyResponse, AWSError] = js.native
  def getGroupPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetGroupPolicyResponse, Unit]): Request[GetGroupPolicyResponse, AWSError] = js.native
  /**
    * Retrieves the specified inline policy document that is embedded in the specified IAM group.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM group can also have managed policies attached to it. To retrieve a managed policy document that is attached to a group, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def getGroupPolicy(params: GetGroupPolicyRequest): Request[GetGroupPolicyResponse, AWSError] = js.native
  def getGroupPolicy(
    params: GetGroupPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGroupPolicyResponse, Unit]
  ): Request[GetGroupPolicyResponse, AWSError] = js.native
  
  /**
    *  Retrieves information about the specified instance profile, including the instance profile's path, GUID, ARN, and role. For more information about instance profiles, see About Instance Profiles in the IAM User Guide.
    */
  def getInstanceProfile(): Request[GetInstanceProfileResponse, AWSError] = js.native
  def getInstanceProfile(callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceProfileResponse, Unit]): Request[GetInstanceProfileResponse, AWSError] = js.native
  /**
    *  Retrieves information about the specified instance profile, including the instance profile's path, GUID, ARN, and role. For more information about instance profiles, see About Instance Profiles in the IAM User Guide.
    */
  def getInstanceProfile(params: GetInstanceProfileRequest): Request[GetInstanceProfileResponse, AWSError] = js.native
  def getInstanceProfile(
    params: GetInstanceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceProfileResponse, Unit]
  ): Request[GetInstanceProfileResponse, AWSError] = js.native
  
  /**
    * Retrieves the user name and password-creation date for the specified IAM user. If the user has not been assigned a password, the operation returns a 404 (NoSuchEntity) error.
    */
  def getLoginProfile(): Request[GetLoginProfileResponse, AWSError] = js.native
  def getLoginProfile(callback: js.Function2[/* err */ AWSError, /* data */ GetLoginProfileResponse, Unit]): Request[GetLoginProfileResponse, AWSError] = js.native
  /**
    * Retrieves the user name and password-creation date for the specified IAM user. If the user has not been assigned a password, the operation returns a 404 (NoSuchEntity) error.
    */
  def getLoginProfile(params: GetLoginProfileRequest): Request[GetLoginProfileResponse, AWSError] = js.native
  def getLoginProfile(
    params: GetLoginProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLoginProfileResponse, Unit]
  ): Request[GetLoginProfileResponse, AWSError] = js.native
  
  /**
    * Returns information about the specified OpenID Connect (OIDC) provider resource object in IAM.
    */
  def getOpenIDConnectProvider(): Request[GetOpenIDConnectProviderResponse, AWSError] = js.native
  def getOpenIDConnectProvider(callback: js.Function2[/* err */ AWSError, /* data */ GetOpenIDConnectProviderResponse, Unit]): Request[GetOpenIDConnectProviderResponse, AWSError] = js.native
  /**
    * Returns information about the specified OpenID Connect (OIDC) provider resource object in IAM.
    */
  def getOpenIDConnectProvider(params: GetOpenIDConnectProviderRequest): Request[GetOpenIDConnectProviderResponse, AWSError] = js.native
  def getOpenIDConnectProvider(
    params: GetOpenIDConnectProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOpenIDConnectProviderResponse, Unit]
  ): Request[GetOpenIDConnectProviderResponse, AWSError] = js.native
  
  /**
    * Retrieves the service last accessed data report for AWS Organizations that was previously generated using the  GenerateOrganizationsAccessReport  operation. This operation retrieves the status of your report job and the report contents. Depending on the parameters that you passed when you generated the report, the data returned could include different information. For details, see GenerateOrganizationsAccessReport. To call this operation, you must be signed in to the master account in your organization. SCPs must be enabled for your organization root. You must have permissions to perform this operation. For more information, see Refining Permissions Using Service Last Accessed Data in the IAM User Guide. For each service that principals in an account (root users, IAM users, or IAM roles) could access using SCPs, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, it returns the reason that it failed. By default, the list is sorted by service namespace.
    */
  def getOrganizationsAccessReport(): Request[GetOrganizationsAccessReportResponse, AWSError] = js.native
  def getOrganizationsAccessReport(callback: js.Function2[/* err */ AWSError, /* data */ GetOrganizationsAccessReportResponse, Unit]): Request[GetOrganizationsAccessReportResponse, AWSError] = js.native
  /**
    * Retrieves the service last accessed data report for AWS Organizations that was previously generated using the  GenerateOrganizationsAccessReport  operation. This operation retrieves the status of your report job and the report contents. Depending on the parameters that you passed when you generated the report, the data returned could include different information. For details, see GenerateOrganizationsAccessReport. To call this operation, you must be signed in to the master account in your organization. SCPs must be enabled for your organization root. You must have permissions to perform this operation. For more information, see Refining Permissions Using Service Last Accessed Data in the IAM User Guide. For each service that principals in an account (root users, IAM users, or IAM roles) could access using SCPs, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, it returns the reason that it failed. By default, the list is sorted by service namespace.
    */
  def getOrganizationsAccessReport(params: GetOrganizationsAccessReportRequest): Request[GetOrganizationsAccessReportResponse, AWSError] = js.native
  def getOrganizationsAccessReport(
    params: GetOrganizationsAccessReportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOrganizationsAccessReportResponse, Unit]
  ): Request[GetOrganizationsAccessReportResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the specified managed policy, including the policy's default version and the total number of IAM users, groups, and roles to which the policy is attached. To retrieve the list of the specific users, groups, and roles that the policy is attached to, use the ListEntitiesForPolicy API. This API returns metadata about the policy. To retrieve the actual policy document for a specific version of the policy, use GetPolicyVersion. This API retrieves information about managed policies. To retrieve information about an inline policy that is embedded with an IAM user, group, or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy API. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def getPolicy(): Request[GetPolicyResponse, AWSError] = js.native
  def getPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyResponse, Unit]): Request[GetPolicyResponse, AWSError] = js.native
  /**
    * Retrieves information about the specified managed policy, including the policy's default version and the total number of IAM users, groups, and roles to which the policy is attached. To retrieve the list of the specific users, groups, and roles that the policy is attached to, use the ListEntitiesForPolicy API. This API returns metadata about the policy. To retrieve the actual policy document for a specific version of the policy, use GetPolicyVersion. This API retrieves information about managed policies. To retrieve information about an inline policy that is embedded with an IAM user, group, or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy API. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse, AWSError] = js.native
  def getPolicy(
    params: GetPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyResponse, Unit]
  ): Request[GetPolicyResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the specified version of the specified managed policy, including the policy document.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  To list the available versions for a policy, use ListPolicyVersions. This API retrieves information about managed policies. To retrieve information about an inline policy that is embedded in a user, group, or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy API. For more information about the types of policies, see Managed Policies and Inline Policies in the IAM User Guide. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
    */
  def getPolicyVersion(): Request[GetPolicyVersionResponse, AWSError] = js.native
  def getPolicyVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyVersionResponse, Unit]): Request[GetPolicyVersionResponse, AWSError] = js.native
  /**
    * Retrieves information about the specified version of the specified managed policy, including the policy document.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  To list the available versions for a policy, use ListPolicyVersions. This API retrieves information about managed policies. To retrieve information about an inline policy that is embedded in a user, group, or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy API. For more information about the types of policies, see Managed Policies and Inline Policies in the IAM User Guide. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
    */
  def getPolicyVersion(params: GetPolicyVersionRequest): Request[GetPolicyVersionResponse, AWSError] = js.native
  def getPolicyVersion(
    params: GetPolicyVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyVersionResponse, Unit]
  ): Request[GetPolicyVersionResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the specified role, including the role's path, GUID, ARN, and the role's trust policy that grants permission to assume the role. For more information about roles, see Working with Roles.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality. 
    */
  def getRole(): Request[GetRoleResponse, AWSError] = js.native
  def getRole(callback: js.Function2[/* err */ AWSError, /* data */ GetRoleResponse, Unit]): Request[GetRoleResponse, AWSError] = js.native
  /**
    * Retrieves information about the specified role, including the role's path, GUID, ARN, and the role's trust policy that grants permission to assume the role. For more information about roles, see Working with Roles.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality. 
    */
  def getRole(params: GetRoleRequest): Request[GetRoleResponse, AWSError] = js.native
  def getRole(
    params: GetRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRoleResponse, Unit]
  ): Request[GetRoleResponse, AWSError] = js.native
  
  /**
    * Retrieves the specified inline policy document that is embedded with the specified IAM role.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM role can also have managed policies attached to it. To retrieve a managed policy document that is attached to a role, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For more information about roles, see Using Roles to Delegate Permissions and Federate Identities.
    */
  def getRolePolicy(): Request[GetRolePolicyResponse, AWSError] = js.native
  def getRolePolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetRolePolicyResponse, Unit]): Request[GetRolePolicyResponse, AWSError] = js.native
  /**
    * Retrieves the specified inline policy document that is embedded with the specified IAM role.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM role can also have managed policies attached to it. To retrieve a managed policy document that is attached to a role, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For more information about roles, see Using Roles to Delegate Permissions and Federate Identities.
    */
  def getRolePolicy(params: GetRolePolicyRequest): Request[GetRolePolicyResponse, AWSError] = js.native
  def getRolePolicy(
    params: GetRolePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRolePolicyResponse, Unit]
  ): Request[GetRolePolicyResponse, AWSError] = js.native
  
  /**
    * Returns the SAML provider metadocument that was uploaded when the IAM SAML provider resource object was created or updated.  This operation requires Signature Version 4. 
    */
  def getSAMLProvider(): Request[GetSAMLProviderResponse, AWSError] = js.native
  def getSAMLProvider(callback: js.Function2[/* err */ AWSError, /* data */ GetSAMLProviderResponse, Unit]): Request[GetSAMLProviderResponse, AWSError] = js.native
  /**
    * Returns the SAML provider metadocument that was uploaded when the IAM SAML provider resource object was created or updated.  This operation requires Signature Version 4. 
    */
  def getSAMLProvider(params: GetSAMLProviderRequest): Request[GetSAMLProviderResponse, AWSError] = js.native
  def getSAMLProvider(
    params: GetSAMLProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSAMLProviderResponse, Unit]
  ): Request[GetSAMLProviderResponse, AWSError] = js.native
  
  /**
    * Retrieves the specified SSH public key, including metadata about the key. The SSH public key retrieved by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
    */
  def getSSHPublicKey(): Request[GetSSHPublicKeyResponse, AWSError] = js.native
  def getSSHPublicKey(callback: js.Function2[/* err */ AWSError, /* data */ GetSSHPublicKeyResponse, Unit]): Request[GetSSHPublicKeyResponse, AWSError] = js.native
  /**
    * Retrieves the specified SSH public key, including metadata about the key. The SSH public key retrieved by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
    */
  def getSSHPublicKey(params: GetSSHPublicKeyRequest): Request[GetSSHPublicKeyResponse, AWSError] = js.native
  def getSSHPublicKey(
    params: GetSSHPublicKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSSHPublicKeyResponse, Unit]
  ): Request[GetSSHPublicKeyResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the specified server certificate stored in IAM. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server certificates that you manage with IAM.
    */
  def getServerCertificate(): Request[GetServerCertificateResponse, AWSError] = js.native
  def getServerCertificate(callback: js.Function2[/* err */ AWSError, /* data */ GetServerCertificateResponse, Unit]): Request[GetServerCertificateResponse, AWSError] = js.native
  /**
    * Retrieves information about the specified server certificate stored in IAM. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server certificates that you manage with IAM.
    */
  def getServerCertificate(params: GetServerCertificateRequest): Request[GetServerCertificateResponse, AWSError] = js.native
  def getServerCertificate(
    params: GetServerCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServerCertificateResponse, Unit]
  ): Request[GetServerCertificateResponse, AWSError] = js.native
  
  /**
    * Retrieves a service last accessed report that was created using the GenerateServiceLastAccessedDetails operation. You can use the JobId parameter in GetServiceLastAccessedDetails to retrieve the status of your report job. When the report is complete, you can retrieve the generated report. The report includes a list of AWS services that the resource (user, group, role, or managed policy) can access.  Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, AWS Organizations policies, IAM permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see Evaluating Policies in the IAM User Guide.  For each service that the resource could access using permissions policies, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, the GetServiceLastAccessedDetails operation returns the reason that it failed. The GetServiceLastAccessedDetails operation returns a list of services. This list includes the number of entities that have attempted to access the service and the date and time of the last attempt. It also returns the ARN of the following entity, depending on the resource ARN that you used to generate the report:    User – Returns the user ARN that you used to generate the report    Group – Returns the ARN of the group member (user) that last attempted to access the service    Role – Returns the role ARN that you used to generate the report    Policy – Returns the ARN of the user or role that last used the policy to attempt to access the service   By default, the list is sorted by service namespace. If you specified ACTION_LEVEL granularity when you generated the report, this operation returns service and action last accessed data. This includes the most recent access attempt for each tracked action within a service. Otherwise, this operation returns only service data. For more information about service and action last accessed data, see Reducing Permissions Using Service Last Accessed Data in the IAM User Guide.
    */
  def getServiceLastAccessedDetails(): Request[GetServiceLastAccessedDetailsResponse, AWSError] = js.native
  def getServiceLastAccessedDetails(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceLastAccessedDetailsResponse, Unit]): Request[GetServiceLastAccessedDetailsResponse, AWSError] = js.native
  /**
    * Retrieves a service last accessed report that was created using the GenerateServiceLastAccessedDetails operation. You can use the JobId parameter in GetServiceLastAccessedDetails to retrieve the status of your report job. When the report is complete, you can retrieve the generated report. The report includes a list of AWS services that the resource (user, group, role, or managed policy) can access.  Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, AWS Organizations policies, IAM permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see Evaluating Policies in the IAM User Guide.  For each service that the resource could access using permissions policies, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, the GetServiceLastAccessedDetails operation returns the reason that it failed. The GetServiceLastAccessedDetails operation returns a list of services. This list includes the number of entities that have attempted to access the service and the date and time of the last attempt. It also returns the ARN of the following entity, depending on the resource ARN that you used to generate the report:    User – Returns the user ARN that you used to generate the report    Group – Returns the ARN of the group member (user) that last attempted to access the service    Role – Returns the role ARN that you used to generate the report    Policy – Returns the ARN of the user or role that last used the policy to attempt to access the service   By default, the list is sorted by service namespace. If you specified ACTION_LEVEL granularity when you generated the report, this operation returns service and action last accessed data. This includes the most recent access attempt for each tracked action within a service. Otherwise, this operation returns only service data. For more information about service and action last accessed data, see Reducing Permissions Using Service Last Accessed Data in the IAM User Guide.
    */
  def getServiceLastAccessedDetails(params: GetServiceLastAccessedDetailsRequest): Request[GetServiceLastAccessedDetailsResponse, AWSError] = js.native
  def getServiceLastAccessedDetails(
    params: GetServiceLastAccessedDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceLastAccessedDetailsResponse, Unit]
  ): Request[GetServiceLastAccessedDetailsResponse, AWSError] = js.native
  
  /**
    * After you generate a group or policy report using the GenerateServiceLastAccessedDetails operation, you can use the JobId parameter in GetServiceLastAccessedDetailsWithEntities. This operation retrieves the status of your report job and a list of entities that could have used group or policy permissions to access the specified service.    Group – For a group report, this operation returns a list of users in the group that could have used the group’s policies in an attempt to access the service.    Policy – For a policy report, this operation returns a list of entities (users or roles) that could have used the policy in an attempt to access the service.   You can also use this operation for user or role reports to retrieve details about those entities. If the operation fails, the GetServiceLastAccessedDetailsWithEntities operation returns the reason that it failed. By default, the list of associated entities is sorted by date, with the most recent access listed first.
    */
  def getServiceLastAccessedDetailsWithEntities(): Request[GetServiceLastAccessedDetailsWithEntitiesResponse, AWSError] = js.native
  def getServiceLastAccessedDetailsWithEntities(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetServiceLastAccessedDetailsWithEntitiesResponse, 
      Unit
    ]
  ): Request[GetServiceLastAccessedDetailsWithEntitiesResponse, AWSError] = js.native
  /**
    * After you generate a group or policy report using the GenerateServiceLastAccessedDetails operation, you can use the JobId parameter in GetServiceLastAccessedDetailsWithEntities. This operation retrieves the status of your report job and a list of entities that could have used group or policy permissions to access the specified service.    Group – For a group report, this operation returns a list of users in the group that could have used the group’s policies in an attempt to access the service.    Policy – For a policy report, this operation returns a list of entities (users or roles) that could have used the policy in an attempt to access the service.   You can also use this operation for user or role reports to retrieve details about those entities. If the operation fails, the GetServiceLastAccessedDetailsWithEntities operation returns the reason that it failed. By default, the list of associated entities is sorted by date, with the most recent access listed first.
    */
  def getServiceLastAccessedDetailsWithEntities(params: GetServiceLastAccessedDetailsWithEntitiesRequest): Request[GetServiceLastAccessedDetailsWithEntitiesResponse, AWSError] = js.native
  def getServiceLastAccessedDetailsWithEntities(
    params: GetServiceLastAccessedDetailsWithEntitiesRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetServiceLastAccessedDetailsWithEntitiesResponse, 
      Unit
    ]
  ): Request[GetServiceLastAccessedDetailsWithEntitiesResponse, AWSError] = js.native
  
  /**
    * Retrieves the status of your service-linked role deletion. After you use the DeleteServiceLinkedRole API operation to submit a service-linked role for deletion, you can use the DeletionTaskId parameter in GetServiceLinkedRoleDeletionStatus to check the status of the deletion. If the deletion fails, this operation returns the reason that it failed, if that information is returned by the service.
    */
  def getServiceLinkedRoleDeletionStatus(): Request[GetServiceLinkedRoleDeletionStatusResponse, AWSError] = js.native
  def getServiceLinkedRoleDeletionStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceLinkedRoleDeletionStatusResponse, Unit]
  ): Request[GetServiceLinkedRoleDeletionStatusResponse, AWSError] = js.native
  /**
    * Retrieves the status of your service-linked role deletion. After you use the DeleteServiceLinkedRole API operation to submit a service-linked role for deletion, you can use the DeletionTaskId parameter in GetServiceLinkedRoleDeletionStatus to check the status of the deletion. If the deletion fails, this operation returns the reason that it failed, if that information is returned by the service.
    */
  def getServiceLinkedRoleDeletionStatus(params: GetServiceLinkedRoleDeletionStatusRequest): Request[GetServiceLinkedRoleDeletionStatusResponse, AWSError] = js.native
  def getServiceLinkedRoleDeletionStatus(
    params: GetServiceLinkedRoleDeletionStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceLinkedRoleDeletionStatusResponse, Unit]
  ): Request[GetServiceLinkedRoleDeletionStatusResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the specified IAM user, including the user's creation date, path, unique ID, and ARN. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID used to sign the request to this API.
    */
  def getUser(): Request[GetUserResponse, AWSError] = js.native
  def getUser(callback: js.Function2[/* err */ AWSError, /* data */ GetUserResponse, Unit]): Request[GetUserResponse, AWSError] = js.native
  /**
    * Retrieves information about the specified IAM user, including the user's creation date, path, unique ID, and ARN. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID used to sign the request to this API.
    */
  def getUser(params: GetUserRequest): Request[GetUserResponse, AWSError] = js.native
  def getUser(
    params: GetUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUserResponse, Unit]
  ): Request[GetUserResponse, AWSError] = js.native
  
  /**
    * Retrieves the specified inline policy document that is embedded in the specified IAM user.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM user can also have managed policies attached to it. To retrieve a managed policy document that is attached to a user, use GetPolicy to determine the policy's default version. Then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def getUserPolicy(): Request[GetUserPolicyResponse, AWSError] = js.native
  def getUserPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetUserPolicyResponse, Unit]): Request[GetUserPolicyResponse, AWSError] = js.native
  /**
    * Retrieves the specified inline policy document that is embedded in the specified IAM user.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM user can also have managed policies attached to it. To retrieve a managed policy document that is attached to a user, use GetPolicy to determine the policy's default version. Then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def getUserPolicy(params: GetUserPolicyRequest): Request[GetUserPolicyResponse, AWSError] = js.native
  def getUserPolicy(
    params: GetUserPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUserPolicyResponse, Unit]
  ): Request[GetUserPolicyResponse, AWSError] = js.native
  
  /**
    * Returns information about the access key IDs associated with the specified IAM user. If there is none, the operation returns an empty list. Although each user is limited to a small number of keys, you can still paginate the results using the MaxItems and Marker parameters. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.  To ensure the security of your AWS account, the secret access key is accessible only during key and user creation. 
    */
  def listAccessKeys(): Request[ListAccessKeysResponse, AWSError] = js.native
  def listAccessKeys(callback: js.Function2[/* err */ AWSError, /* data */ ListAccessKeysResponse, Unit]): Request[ListAccessKeysResponse, AWSError] = js.native
  /**
    * Returns information about the access key IDs associated with the specified IAM user. If there is none, the operation returns an empty list. Although each user is limited to a small number of keys, you can still paginate the results using the MaxItems and Marker parameters. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.  To ensure the security of your AWS account, the secret access key is accessible only during key and user creation. 
    */
  def listAccessKeys(params: ListAccessKeysRequest): Request[ListAccessKeysResponse, AWSError] = js.native
  def listAccessKeys(
    params: ListAccessKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccessKeysResponse, Unit]
  ): Request[ListAccessKeysResponse, AWSError] = js.native
  
  /**
    * Lists the account alias associated with the AWS account (Note: you can have only one). For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
    */
  def listAccountAliases(): Request[ListAccountAliasesResponse, AWSError] = js.native
  def listAccountAliases(callback: js.Function2[/* err */ AWSError, /* data */ ListAccountAliasesResponse, Unit]): Request[ListAccountAliasesResponse, AWSError] = js.native
  /**
    * Lists the account alias associated with the AWS account (Note: you can have only one). For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
    */
  def listAccountAliases(params: ListAccountAliasesRequest): Request[ListAccountAliasesResponse, AWSError] = js.native
  def listAccountAliases(
    params: ListAccountAliasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccountAliasesResponse, Unit]
  ): Request[ListAccountAliasesResponse, AWSError] = js.native
  
  /**
    * Lists all managed policies that are attached to the specified IAM group. An IAM group can also have inline policies embedded with it. To list the inline policies for a group, use the ListGroupPolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.
    */
  def listAttachedGroupPolicies(): Request[ListAttachedGroupPoliciesResponse, AWSError] = js.native
  def listAttachedGroupPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListAttachedGroupPoliciesResponse, Unit]): Request[ListAttachedGroupPoliciesResponse, AWSError] = js.native
  /**
    * Lists all managed policies that are attached to the specified IAM group. An IAM group can also have inline policies embedded with it. To list the inline policies for a group, use the ListGroupPolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.
    */
  def listAttachedGroupPolicies(params: ListAttachedGroupPoliciesRequest): Request[ListAttachedGroupPoliciesResponse, AWSError] = js.native
  def listAttachedGroupPolicies(
    params: ListAttachedGroupPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAttachedGroupPoliciesResponse, Unit]
  ): Request[ListAttachedGroupPoliciesResponse, AWSError] = js.native
  
  /**
    * Lists all managed policies that are attached to the specified IAM role. An IAM role can also have inline policies embedded with it. To list the inline policies for a role, use the ListRolePolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified role (or none that match the specified path prefix), the operation returns an empty list.
    */
  def listAttachedRolePolicies(): Request[ListAttachedRolePoliciesResponse, AWSError] = js.native
  def listAttachedRolePolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListAttachedRolePoliciesResponse, Unit]): Request[ListAttachedRolePoliciesResponse, AWSError] = js.native
  /**
    * Lists all managed policies that are attached to the specified IAM role. An IAM role can also have inline policies embedded with it. To list the inline policies for a role, use the ListRolePolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified role (or none that match the specified path prefix), the operation returns an empty list.
    */
  def listAttachedRolePolicies(params: ListAttachedRolePoliciesRequest): Request[ListAttachedRolePoliciesResponse, AWSError] = js.native
  def listAttachedRolePolicies(
    params: ListAttachedRolePoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAttachedRolePoliciesResponse, Unit]
  ): Request[ListAttachedRolePoliciesResponse, AWSError] = js.native
  
  /**
    * Lists all managed policies that are attached to the specified IAM user. An IAM user can also have inline policies embedded with it. To list the inline policies for a user, use the ListUserPolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.
    */
  def listAttachedUserPolicies(): Request[ListAttachedUserPoliciesResponse, AWSError] = js.native
  def listAttachedUserPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListAttachedUserPoliciesResponse, Unit]): Request[ListAttachedUserPoliciesResponse, AWSError] = js.native
  /**
    * Lists all managed policies that are attached to the specified IAM user. An IAM user can also have inline policies embedded with it. To list the inline policies for a user, use the ListUserPolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.
    */
  def listAttachedUserPolicies(params: ListAttachedUserPoliciesRequest): Request[ListAttachedUserPoliciesResponse, AWSError] = js.native
  def listAttachedUserPolicies(
    params: ListAttachedUserPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAttachedUserPoliciesResponse, Unit]
  ): Request[ListAttachedUserPoliciesResponse, AWSError] = js.native
  
  /**
    * Lists all IAM users, groups, and roles that the specified managed policy is attached to. You can use the optional EntityFilter parameter to limit the results to a particular type of entity (users, groups, or roles). For example, to list only the roles that are attached to the specified policy, set EntityFilter to Role. You can paginate the results using the MaxItems and Marker parameters.
    */
  def listEntitiesForPolicy(): Request[ListEntitiesForPolicyResponse, AWSError] = js.native
  def listEntitiesForPolicy(callback: js.Function2[/* err */ AWSError, /* data */ ListEntitiesForPolicyResponse, Unit]): Request[ListEntitiesForPolicyResponse, AWSError] = js.native
  /**
    * Lists all IAM users, groups, and roles that the specified managed policy is attached to. You can use the optional EntityFilter parameter to limit the results to a particular type of entity (users, groups, or roles). For example, to list only the roles that are attached to the specified policy, set EntityFilter to Role. You can paginate the results using the MaxItems and Marker parameters.
    */
  def listEntitiesForPolicy(params: ListEntitiesForPolicyRequest): Request[ListEntitiesForPolicyResponse, AWSError] = js.native
  def listEntitiesForPolicy(
    params: ListEntitiesForPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEntitiesForPolicyResponse, Unit]
  ): Request[ListEntitiesForPolicyResponse, AWSError] = js.native
  
  /**
    * Lists the names of the inline policies that are embedded in the specified IAM group. An IAM group can also have managed policies attached to it. To list the managed policies that are attached to a group, use ListAttachedGroupPolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified group, the operation returns an empty list.
    */
  def listGroupPolicies(): Request[ListGroupPoliciesResponse, AWSError] = js.native
  def listGroupPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupPoliciesResponse, Unit]): Request[ListGroupPoliciesResponse, AWSError] = js.native
  /**
    * Lists the names of the inline policies that are embedded in the specified IAM group. An IAM group can also have managed policies attached to it. To list the managed policies that are attached to a group, use ListAttachedGroupPolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified group, the operation returns an empty list.
    */
  def listGroupPolicies(params: ListGroupPoliciesRequest): Request[ListGroupPoliciesResponse, AWSError] = js.native
  def listGroupPolicies(
    params: ListGroupPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupPoliciesResponse, Unit]
  ): Request[ListGroupPoliciesResponse, AWSError] = js.native
  
  /**
    * Lists the IAM groups that have the specified path prefix.  You can paginate the results using the MaxItems and Marker parameters.
    */
  def listGroups(): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]): Request[ListGroupsResponse, AWSError] = js.native
  /**
    * Lists the IAM groups that have the specified path prefix.  You can paginate the results using the MaxItems and Marker parameters.
    */
  def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(
    params: ListGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]
  ): Request[ListGroupsResponse, AWSError] = js.native
  
  /**
    * Lists the IAM groups that the specified IAM user belongs to. You can paginate the results using the MaxItems and Marker parameters.
    */
  def listGroupsForUser(): Request[ListGroupsForUserResponse, AWSError] = js.native
  def listGroupsForUser(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsForUserResponse, Unit]): Request[ListGroupsForUserResponse, AWSError] = js.native
  /**
    * Lists the IAM groups that the specified IAM user belongs to. You can paginate the results using the MaxItems and Marker parameters.
    */
  def listGroupsForUser(params: ListGroupsForUserRequest): Request[ListGroupsForUserResponse, AWSError] = js.native
  def listGroupsForUser(
    params: ListGroupsForUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsForUserResponse, Unit]
  ): Request[ListGroupsForUserResponse, AWSError] = js.native
  
  /**
    * Lists the instance profiles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about instance profiles, go to About Instance Profiles. You can paginate the results using the MaxItems and Marker parameters.
    */
  def listInstanceProfiles(): Request[ListInstanceProfilesResponse, AWSError] = js.native
  def listInstanceProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceProfilesResponse, Unit]): Request[ListInstanceProfilesResponse, AWSError] = js.native
  /**
    * Lists the instance profiles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about instance profiles, go to About Instance Profiles. You can paginate the results using the MaxItems and Marker parameters.
    */
  def listInstanceProfiles(params: ListInstanceProfilesRequest): Request[ListInstanceProfilesResponse, AWSError] = js.native
  def listInstanceProfiles(
    params: ListInstanceProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceProfilesResponse, Unit]
  ): Request[ListInstanceProfilesResponse, AWSError] = js.native
  
  /**
    * Lists the instance profiles that have the specified associated IAM role. If there are none, the operation returns an empty list. For more information about instance profiles, go to About Instance Profiles. You can paginate the results using the MaxItems and Marker parameters.
    */
  def listInstanceProfilesForRole(): Request[ListInstanceProfilesForRoleResponse, AWSError] = js.native
  def listInstanceProfilesForRole(callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceProfilesForRoleResponse, Unit]): Request[ListInstanceProfilesForRoleResponse, AWSError] = js.native
  /**
    * Lists the instance profiles that have the specified associated IAM role. If there are none, the operation returns an empty list. For more information about instance profiles, go to About Instance Profiles. You can paginate the results using the MaxItems and Marker parameters.
    */
  def listInstanceProfilesForRole(params: ListInstanceProfilesForRoleRequest): Request[ListInstanceProfilesForRoleResponse, AWSError] = js.native
  def listInstanceProfilesForRole(
    params: ListInstanceProfilesForRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceProfilesForRoleResponse, Unit]
  ): Request[ListInstanceProfilesForRoleResponse, AWSError] = js.native
  
  /**
    * Lists the MFA devices for an IAM user. If the request includes a IAM user name, then this operation lists all the MFA devices associated with the specified user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request for this API. You can paginate the results using the MaxItems and Marker parameters.
    */
  def listMFADevices(): Request[ListMFADevicesResponse, AWSError] = js.native
  def listMFADevices(callback: js.Function2[/* err */ AWSError, /* data */ ListMFADevicesResponse, Unit]): Request[ListMFADevicesResponse, AWSError] = js.native
  /**
    * Lists the MFA devices for an IAM user. If the request includes a IAM user name, then this operation lists all the MFA devices associated with the specified user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request for this API. You can paginate the results using the MaxItems and Marker parameters.
    */
  def listMFADevices(params: ListMFADevicesRequest): Request[ListMFADevicesResponse, AWSError] = js.native
  def listMFADevices(
    params: ListMFADevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMFADevicesResponse, Unit]
  ): Request[ListMFADevicesResponse, AWSError] = js.native
  
  /**
    * Lists information about the IAM OpenID Connect (OIDC) provider resource objects defined in the AWS account.
    */
  def listOpenIDConnectProviders(): Request[ListOpenIDConnectProvidersResponse, AWSError] = js.native
  def listOpenIDConnectProviders(callback: js.Function2[/* err */ AWSError, /* data */ ListOpenIDConnectProvidersResponse, Unit]): Request[ListOpenIDConnectProvidersResponse, AWSError] = js.native
  /**
    * Lists information about the IAM OpenID Connect (OIDC) provider resource objects defined in the AWS account.
    */
  def listOpenIDConnectProviders(params: ListOpenIDConnectProvidersRequest): Request[ListOpenIDConnectProvidersResponse, AWSError] = js.native
  def listOpenIDConnectProviders(
    params: ListOpenIDConnectProvidersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOpenIDConnectProvidersResponse, Unit]
  ): Request[ListOpenIDConnectProvidersResponse, AWSError] = js.native
  
  /**
    * Lists all the managed policies that are available in your AWS account, including your own customer-defined managed policies and all AWS managed policies. You can filter the list of policies that is returned using the optional OnlyAttached, Scope, and PathPrefix parameters. For example, to list only the customer managed policies in your AWS account, set Scope to Local. To list only AWS managed policies, set Scope to AWS. You can paginate the results using the MaxItems and Marker parameters. For more information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def listPolicies(): Request[ListPoliciesResponse, AWSError] = js.native
  def listPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListPoliciesResponse, Unit]): Request[ListPoliciesResponse, AWSError] = js.native
  /**
    * Lists all the managed policies that are available in your AWS account, including your own customer-defined managed policies and all AWS managed policies. You can filter the list of policies that is returned using the optional OnlyAttached, Scope, and PathPrefix parameters. For example, to list only the customer managed policies in your AWS account, set Scope to Local. To list only AWS managed policies, set Scope to AWS. You can paginate the results using the MaxItems and Marker parameters. For more information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse, AWSError] = js.native
  def listPolicies(
    params: ListPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPoliciesResponse, Unit]
  ): Request[ListPoliciesResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of policies that the IAM identity (user, group, or role) can use to access each specified service.  This operation does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, AWS Organizations policies, IAM permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see Evaluating Policies in the IAM User Guide.  The list of policies returned by the operation depends on the ARN of the identity that you provide.    User – The list of policies includes the managed and inline policies that are attached to the user directly. The list also includes any additional managed and inline policies that are attached to the group to which the user belongs.     Group – The list of policies includes only the managed and inline policies that are attached to the group directly. Policies that are attached to the group’s user are not included.    Role – The list of policies includes only the managed and inline policies that are attached to the role.   For each managed policy, this operation returns the ARN and policy name. For each inline policy, it returns the policy name and the entity to which it is attached. Inline policies do not have an ARN. For more information about these policy types, see Managed Policies and Inline Policies in the IAM User Guide. Policies that are attached to users and roles as permissions boundaries are not returned. To view which managed policy is currently used to set the permissions boundary for a user or role, use the GetUser or GetRole operations.
    */
  def listPoliciesGrantingServiceAccess(): Request[ListPoliciesGrantingServiceAccessResponse, AWSError] = js.native
  def listPoliciesGrantingServiceAccess(
    callback: js.Function2[/* err */ AWSError, /* data */ ListPoliciesGrantingServiceAccessResponse, Unit]
  ): Request[ListPoliciesGrantingServiceAccessResponse, AWSError] = js.native
  /**
    * Retrieves a list of policies that the IAM identity (user, group, or role) can use to access each specified service.  This operation does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, AWS Organizations policies, IAM permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see Evaluating Policies in the IAM User Guide.  The list of policies returned by the operation depends on the ARN of the identity that you provide.    User – The list of policies includes the managed and inline policies that are attached to the user directly. The list also includes any additional managed and inline policies that are attached to the group to which the user belongs.     Group – The list of policies includes only the managed and inline policies that are attached to the group directly. Policies that are attached to the group’s user are not included.    Role – The list of policies includes only the managed and inline policies that are attached to the role.   For each managed policy, this operation returns the ARN and policy name. For each inline policy, it returns the policy name and the entity to which it is attached. Inline policies do not have an ARN. For more information about these policy types, see Managed Policies and Inline Policies in the IAM User Guide. Policies that are attached to users and roles as permissions boundaries are not returned. To view which managed policy is currently used to set the permissions boundary for a user or role, use the GetUser or GetRole operations.
    */
  def listPoliciesGrantingServiceAccess(params: ListPoliciesGrantingServiceAccessRequest): Request[ListPoliciesGrantingServiceAccessResponse, AWSError] = js.native
  def listPoliciesGrantingServiceAccess(
    params: ListPoliciesGrantingServiceAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPoliciesGrantingServiceAccessResponse, Unit]
  ): Request[ListPoliciesGrantingServiceAccessResponse, AWSError] = js.native
  
  /**
    * Lists information about the versions of the specified managed policy, including the version that is currently set as the policy's default version. For more information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def listPolicyVersions(): Request[ListPolicyVersionsResponse, AWSError] = js.native
  def listPolicyVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListPolicyVersionsResponse, Unit]): Request[ListPolicyVersionsResponse, AWSError] = js.native
  /**
    * Lists information about the versions of the specified managed policy, including the version that is currently set as the policy's default version. For more information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def listPolicyVersions(params: ListPolicyVersionsRequest): Request[ListPolicyVersionsResponse, AWSError] = js.native
  def listPolicyVersions(
    params: ListPolicyVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPolicyVersionsResponse, Unit]
  ): Request[ListPolicyVersionsResponse, AWSError] = js.native
  
  /**
    * Lists the names of the inline policies that are embedded in the specified IAM role. An IAM role can also have managed policies attached to it. To list the managed policies that are attached to a role, use ListAttachedRolePolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified role, the operation returns an empty list.
    */
  def listRolePolicies(): Request[ListRolePoliciesResponse, AWSError] = js.native
  def listRolePolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListRolePoliciesResponse, Unit]): Request[ListRolePoliciesResponse, AWSError] = js.native
  /**
    * Lists the names of the inline policies that are embedded in the specified IAM role. An IAM role can also have managed policies attached to it. To list the managed policies that are attached to a role, use ListAttachedRolePolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified role, the operation returns an empty list.
    */
  def listRolePolicies(params: ListRolePoliciesRequest): Request[ListRolePoliciesResponse, AWSError] = js.native
  def listRolePolicies(
    params: ListRolePoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRolePoliciesResponse, Unit]
  ): Request[ListRolePoliciesResponse, AWSError] = js.native
  
  /**
    * Lists the tags that are attached to the specified role. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  def listRoleTags(): Request[ListRoleTagsResponse, AWSError] = js.native
  def listRoleTags(callback: js.Function2[/* err */ AWSError, /* data */ ListRoleTagsResponse, Unit]): Request[ListRoleTagsResponse, AWSError] = js.native
  /**
    * Lists the tags that are attached to the specified role. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  def listRoleTags(params: ListRoleTagsRequest): Request[ListRoleTagsResponse, AWSError] = js.native
  def listRoleTags(
    params: ListRoleTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRoleTagsResponse, Unit]
  ): Request[ListRoleTagsResponse, AWSError] = js.native
  
  /**
    * Lists the IAM roles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about roles, go to Working with Roles. You can paginate the results using the MaxItems and Marker parameters.
    */
  def listRoles(): Request[ListRolesResponse, AWSError] = js.native
  def listRoles(callback: js.Function2[/* err */ AWSError, /* data */ ListRolesResponse, Unit]): Request[ListRolesResponse, AWSError] = js.native
  /**
    * Lists the IAM roles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about roles, go to Working with Roles. You can paginate the results using the MaxItems and Marker parameters.
    */
  def listRoles(params: ListRolesRequest): Request[ListRolesResponse, AWSError] = js.native
  def listRoles(
    params: ListRolesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRolesResponse, Unit]
  ): Request[ListRolesResponse, AWSError] = js.native
  
  /**
    * Lists the SAML provider resource objects defined in IAM in the account.   This operation requires Signature Version 4. 
    */
  def listSAMLProviders(): Request[ListSAMLProvidersResponse, AWSError] = js.native
  def listSAMLProviders(callback: js.Function2[/* err */ AWSError, /* data */ ListSAMLProvidersResponse, Unit]): Request[ListSAMLProvidersResponse, AWSError] = js.native
  /**
    * Lists the SAML provider resource objects defined in IAM in the account.   This operation requires Signature Version 4. 
    */
  def listSAMLProviders(params: ListSAMLProvidersRequest): Request[ListSAMLProvidersResponse, AWSError] = js.native
  def listSAMLProviders(
    params: ListSAMLProvidersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSAMLProvidersResponse, Unit]
  ): Request[ListSAMLProvidersResponse, AWSError] = js.native
  
  /**
    * Returns information about the SSH public keys associated with the specified IAM user. If none exists, the operation returns an empty list. The SSH public keys returned by this operation are used only for authenticating the IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide. Although each user is limited to a small number of keys, you can still paginate the results using the MaxItems and Marker parameters.
    */
  def listSSHPublicKeys(): Request[ListSSHPublicKeysResponse, AWSError] = js.native
  def listSSHPublicKeys(callback: js.Function2[/* err */ AWSError, /* data */ ListSSHPublicKeysResponse, Unit]): Request[ListSSHPublicKeysResponse, AWSError] = js.native
  /**
    * Returns information about the SSH public keys associated with the specified IAM user. If none exists, the operation returns an empty list. The SSH public keys returned by this operation are used only for authenticating the IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide. Although each user is limited to a small number of keys, you can still paginate the results using the MaxItems and Marker parameters.
    */
  def listSSHPublicKeys(params: ListSSHPublicKeysRequest): Request[ListSSHPublicKeysResponse, AWSError] = js.native
  def listSSHPublicKeys(
    params: ListSSHPublicKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSSHPublicKeysResponse, Unit]
  ): Request[ListSSHPublicKeysResponse, AWSError] = js.native
  
  /**
    * Lists the server certificates stored in IAM that have the specified path prefix. If none exist, the operation returns an empty list.  You can paginate the results using the MaxItems and Marker parameters. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.
    */
  def listServerCertificates(): Request[ListServerCertificatesResponse, AWSError] = js.native
  def listServerCertificates(callback: js.Function2[/* err */ AWSError, /* data */ ListServerCertificatesResponse, Unit]): Request[ListServerCertificatesResponse, AWSError] = js.native
  /**
    * Lists the server certificates stored in IAM that have the specified path prefix. If none exist, the operation returns an empty list.  You can paginate the results using the MaxItems and Marker parameters. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.
    */
  def listServerCertificates(params: ListServerCertificatesRequest): Request[ListServerCertificatesResponse, AWSError] = js.native
  def listServerCertificates(
    params: ListServerCertificatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServerCertificatesResponse, Unit]
  ): Request[ListServerCertificatesResponse, AWSError] = js.native
  
  /**
    * Returns information about the service-specific credentials associated with the specified IAM user. If none exists, the operation returns an empty list. The service-specific credentials returned by this operation are used only for authenticating the IAM user to a specific service. For more information about using service-specific credentials to authenticate to an AWS service, see Set Up service-specific credentials in the AWS CodeCommit User Guide.
    */
  def listServiceSpecificCredentials(): Request[ListServiceSpecificCredentialsResponse, AWSError] = js.native
  def listServiceSpecificCredentials(
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceSpecificCredentialsResponse, Unit]
  ): Request[ListServiceSpecificCredentialsResponse, AWSError] = js.native
  /**
    * Returns information about the service-specific credentials associated with the specified IAM user. If none exists, the operation returns an empty list. The service-specific credentials returned by this operation are used only for authenticating the IAM user to a specific service. For more information about using service-specific credentials to authenticate to an AWS service, see Set Up service-specific credentials in the AWS CodeCommit User Guide.
    */
  def listServiceSpecificCredentials(params: ListServiceSpecificCredentialsRequest): Request[ListServiceSpecificCredentialsResponse, AWSError] = js.native
  def listServiceSpecificCredentials(
    params: ListServiceSpecificCredentialsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceSpecificCredentialsResponse, Unit]
  ): Request[ListServiceSpecificCredentialsResponse, AWSError] = js.native
  
  /**
    * Returns information about the signing certificates associated with the specified IAM user. If none exists, the operation returns an empty list. Although each user is limited to a small number of signing certificates, you can still paginate the results using the MaxItems and Marker parameters. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request for this API. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
    */
  def listSigningCertificates(): Request[ListSigningCertificatesResponse, AWSError] = js.native
  def listSigningCertificates(callback: js.Function2[/* err */ AWSError, /* data */ ListSigningCertificatesResponse, Unit]): Request[ListSigningCertificatesResponse, AWSError] = js.native
  /**
    * Returns information about the signing certificates associated with the specified IAM user. If none exists, the operation returns an empty list. Although each user is limited to a small number of signing certificates, you can still paginate the results using the MaxItems and Marker parameters. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request for this API. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
    */
  def listSigningCertificates(params: ListSigningCertificatesRequest): Request[ListSigningCertificatesResponse, AWSError] = js.native
  def listSigningCertificates(
    params: ListSigningCertificatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSigningCertificatesResponse, Unit]
  ): Request[ListSigningCertificatesResponse, AWSError] = js.native
  
  /**
    * Lists the names of the inline policies embedded in the specified IAM user. An IAM user can also have managed policies attached to it. To list the managed policies that are attached to a user, use ListAttachedUserPolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified user, the operation returns an empty list.
    */
  def listUserPolicies(): Request[ListUserPoliciesResponse, AWSError] = js.native
  def listUserPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListUserPoliciesResponse, Unit]): Request[ListUserPoliciesResponse, AWSError] = js.native
  /**
    * Lists the names of the inline policies embedded in the specified IAM user. An IAM user can also have managed policies attached to it. To list the managed policies that are attached to a user, use ListAttachedUserPolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified user, the operation returns an empty list.
    */
  def listUserPolicies(params: ListUserPoliciesRequest): Request[ListUserPoliciesResponse, AWSError] = js.native
  def listUserPolicies(
    params: ListUserPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUserPoliciesResponse, Unit]
  ): Request[ListUserPoliciesResponse, AWSError] = js.native
  
  /**
    * Lists the tags that are attached to the specified user. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  def listUserTags(): Request[ListUserTagsResponse, AWSError] = js.native
  def listUserTags(callback: js.Function2[/* err */ AWSError, /* data */ ListUserTagsResponse, Unit]): Request[ListUserTagsResponse, AWSError] = js.native
  /**
    * Lists the tags that are attached to the specified user. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  def listUserTags(params: ListUserTagsRequest): Request[ListUserTagsResponse, AWSError] = js.native
  def listUserTags(
    params: ListUserTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUserTagsResponse, Unit]
  ): Request[ListUserTagsResponse, AWSError] = js.native
  
  /**
    * Lists the IAM users that have the specified path prefix. If no path prefix is specified, the operation returns all users in the AWS account. If there are none, the operation returns an empty list. You can paginate the results using the MaxItems and Marker parameters.
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Lists the IAM users that have the specified path prefix. If no path prefix is specified, the operation returns all users in the AWS account. If there are none, the operation returns an empty list. You can paginate the results using the MaxItems and Marker parameters.
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  
  /**
    * Lists the virtual MFA devices defined in the AWS account by assignment status. If you do not specify an assignment status, the operation returns a list of all virtual MFA devices. Assignment status can be Assigned, Unassigned, or Any. You can paginate the results using the MaxItems and Marker parameters.
    */
  def listVirtualMFADevices(): Request[ListVirtualMFADevicesResponse, AWSError] = js.native
  def listVirtualMFADevices(callback: js.Function2[/* err */ AWSError, /* data */ ListVirtualMFADevicesResponse, Unit]): Request[ListVirtualMFADevicesResponse, AWSError] = js.native
  /**
    * Lists the virtual MFA devices defined in the AWS account by assignment status. If you do not specify an assignment status, the operation returns a list of all virtual MFA devices. Assignment status can be Assigned, Unassigned, or Any. You can paginate the results using the MaxItems and Marker parameters.
    */
  def listVirtualMFADevices(params: ListVirtualMFADevicesRequest): Request[ListVirtualMFADevicesResponse, AWSError] = js.native
  def listVirtualMFADevices(
    params: ListVirtualMFADevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVirtualMFADevicesResponse, Unit]
  ): Request[ListVirtualMFADevicesResponse, AWSError] = js.native
  
  /**
    * Adds or updates an inline policy document that is embedded in the specified IAM group. A user can also have managed policies attached to it. To attach a managed policy to a group, use AttachGroupPolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed in a group, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutGroupPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
    */
  def putGroupPolicy(): Request[js.Object, AWSError] = js.native
  def putGroupPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or updates an inline policy document that is embedded in the specified IAM group. A user can also have managed policies attached to it. To attach a managed policy to a group, use AttachGroupPolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed in a group, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutGroupPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
    */
  def putGroupPolicy(params: PutGroupPolicyRequest): Request[js.Object, AWSError] = js.native
  def putGroupPolicy(
    params: PutGroupPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds or updates the policy that is specified as the IAM role's permissions boundary. You can use an AWS managed policy or a customer managed policy to set the boundary for a role. Use the boundary to control the maximum permissions that the role can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the role. You cannot set the boundary for a service-linked role.   Policies used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the role. To learn how the effective permissions for a role are evaluated, see IAM JSON Policy Evaluation Logic in the IAM User Guide.  
    */
  def putRolePermissionsBoundary(): Request[js.Object, AWSError] = js.native
  def putRolePermissionsBoundary(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or updates the policy that is specified as the IAM role's permissions boundary. You can use an AWS managed policy or a customer managed policy to set the boundary for a role. Use the boundary to control the maximum permissions that the role can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the role. You cannot set the boundary for a service-linked role.   Policies used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the role. To learn how the effective permissions for a role are evaluated, see IAM JSON Policy Evaluation Logic in the IAM User Guide.  
    */
  def putRolePermissionsBoundary(params: PutRolePermissionsBoundaryRequest): Request[js.Object, AWSError] = js.native
  def putRolePermissionsBoundary(
    params: PutRolePermissionsBoundaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds or updates an inline policy document that is embedded in the specified IAM role. When you embed an inline policy in a role, the inline policy is used as part of the role's access (permissions) policy. The role's trust policy is created at the same time as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy. For more information about IAM roles, go to Using Roles to Delegate Permissions and Federate Identities. A role can also have a managed policy attached to it. To attach a managed policy to a role, use AttachRolePolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed with a role, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutRolePolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
    */
  def putRolePolicy(): Request[js.Object, AWSError] = js.native
  def putRolePolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or updates an inline policy document that is embedded in the specified IAM role. When you embed an inline policy in a role, the inline policy is used as part of the role's access (permissions) policy. The role's trust policy is created at the same time as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy. For more information about IAM roles, go to Using Roles to Delegate Permissions and Federate Identities. A role can also have a managed policy attached to it. To attach a managed policy to a role, use AttachRolePolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed with a role, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutRolePolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
    */
  def putRolePolicy(params: PutRolePolicyRequest): Request[js.Object, AWSError] = js.native
  def putRolePolicy(
    params: PutRolePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds or updates the policy that is specified as the IAM user's permissions boundary. You can use an AWS managed policy or a customer managed policy to set the boundary for a user. Use the boundary to control the maximum permissions that the user can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the user.  Policies that are used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the user. To learn how the effective permissions for a user are evaluated, see IAM JSON Policy Evaluation Logic in the IAM User Guide.  
    */
  def putUserPermissionsBoundary(): Request[js.Object, AWSError] = js.native
  def putUserPermissionsBoundary(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or updates the policy that is specified as the IAM user's permissions boundary. You can use an AWS managed policy or a customer managed policy to set the boundary for a user. Use the boundary to control the maximum permissions that the user can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the user.  Policies that are used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the user. To learn how the effective permissions for a user are evaluated, see IAM JSON Policy Evaluation Logic in the IAM User Guide.  
    */
  def putUserPermissionsBoundary(params: PutUserPermissionsBoundaryRequest): Request[js.Object, AWSError] = js.native
  def putUserPermissionsBoundary(
    params: PutUserPermissionsBoundaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds or updates an inline policy document that is embedded in the specified IAM user. An IAM user can also have a managed policy attached to it. To attach a managed policy to a user, use AttachUserPolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed in a user, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutUserPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
    */
  def putUserPolicy(): Request[js.Object, AWSError] = js.native
  def putUserPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or updates an inline policy document that is embedded in the specified IAM user. An IAM user can also have a managed policy attached to it. To attach a managed policy to a user, use AttachUserPolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed in a user, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutUserPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
    */
  def putUserPolicy(params: PutUserPolicyRequest): Request[js.Object, AWSError] = js.native
  def putUserPolicy(
    params: PutUserPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the specified client ID (also known as audience) from the list of client IDs registered for the specified IAM OpenID Connect (OIDC) provider resource object. This operation is idempotent; it does not fail or return an error if you try to remove a client ID that does not exist.
    */
  def removeClientIDFromOpenIDConnectProvider(): Request[js.Object, AWSError] = js.native
  def removeClientIDFromOpenIDConnectProvider(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified client ID (also known as audience) from the list of client IDs registered for the specified IAM OpenID Connect (OIDC) provider resource object. This operation is idempotent; it does not fail or return an error if you try to remove a client ID that does not exist.
    */
  def removeClientIDFromOpenIDConnectProvider(params: RemoveClientIDFromOpenIDConnectProviderRequest): Request[js.Object, AWSError] = js.native
  def removeClientIDFromOpenIDConnectProvider(
    params: RemoveClientIDFromOpenIDConnectProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the specified IAM role from the specified EC2 instance profile.  Make sure that you do not have any Amazon EC2 instances running with the role you are about to remove from the instance profile. Removing a role from an instance profile that is associated with a running instance might break any applications running on the instance.   For more information about IAM roles, go to Working with Roles. For more information about instance profiles, go to About Instance Profiles.
    */
  def removeRoleFromInstanceProfile(): Request[js.Object, AWSError] = js.native
  def removeRoleFromInstanceProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified IAM role from the specified EC2 instance profile.  Make sure that you do not have any Amazon EC2 instances running with the role you are about to remove from the instance profile. Removing a role from an instance profile that is associated with a running instance might break any applications running on the instance.   For more information about IAM roles, go to Working with Roles. For more information about instance profiles, go to About Instance Profiles.
    */
  def removeRoleFromInstanceProfile(params: RemoveRoleFromInstanceProfileRequest): Request[js.Object, AWSError] = js.native
  def removeRoleFromInstanceProfile(
    params: RemoveRoleFromInstanceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the specified user from the specified group.
    */
  def removeUserFromGroup(): Request[js.Object, AWSError] = js.native
  def removeUserFromGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified user from the specified group.
    */
  def removeUserFromGroup(params: RemoveUserFromGroupRequest): Request[js.Object, AWSError] = js.native
  def removeUserFromGroup(
    params: RemoveUserFromGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Resets the password for a service-specific credential. The new password is AWS generated and cryptographically strong. It cannot be configured by the user. Resetting the password immediately invalidates the previous password associated with this user.
    */
  def resetServiceSpecificCredential(): Request[ResetServiceSpecificCredentialResponse, AWSError] = js.native
  def resetServiceSpecificCredential(
    callback: js.Function2[/* err */ AWSError, /* data */ ResetServiceSpecificCredentialResponse, Unit]
  ): Request[ResetServiceSpecificCredentialResponse, AWSError] = js.native
  /**
    * Resets the password for a service-specific credential. The new password is AWS generated and cryptographically strong. It cannot be configured by the user. Resetting the password immediately invalidates the previous password associated with this user.
    */
  def resetServiceSpecificCredential(params: ResetServiceSpecificCredentialRequest): Request[ResetServiceSpecificCredentialResponse, AWSError] = js.native
  def resetServiceSpecificCredential(
    params: ResetServiceSpecificCredentialRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResetServiceSpecificCredentialResponse, Unit]
  ): Request[ResetServiceSpecificCredentialResponse, AWSError] = js.native
  
  /**
    * Synchronizes the specified MFA device with its IAM resource object on the AWS servers. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide.
    */
  def resyncMFADevice(): Request[js.Object, AWSError] = js.native
  def resyncMFADevice(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Synchronizes the specified MFA device with its IAM resource object on the AWS servers. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide.
    */
  def resyncMFADevice(params: ResyncMFADeviceRequest): Request[js.Object, AWSError] = js.native
  def resyncMFADevice(
    params: ResyncMFADeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Sets the specified version of the specified policy as the policy's default (operative) version. This operation affects all users, groups, and roles that the policy is attached to. To list the users, groups, and roles that the policy is attached to, use the ListEntitiesForPolicy API. For information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def setDefaultPolicyVersion(): Request[js.Object, AWSError] = js.native
  def setDefaultPolicyVersion(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the specified version of the specified policy as the policy's default (operative) version. This operation affects all users, groups, and roles that the policy is attached to. To list the users, groups, and roles that the policy is attached to, use the ListEntitiesForPolicy API. For information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  def setDefaultPolicyVersion(params: SetDefaultPolicyVersionRequest): Request[js.Object, AWSError] = js.native
  def setDefaultPolicyVersion(
    params: SetDefaultPolicyVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Sets the specified version of the global endpoint token as the token version used for the AWS account. By default, AWS Security Token Service (STS) is available as a global service, and all STS requests go to a single endpoint at https://sts.amazonaws.com. AWS recommends using Regional STS endpoints to reduce latency, build in redundancy, and increase session token availability. For information about Regional endpoints for STS, see AWS Regions and Endpoints in the AWS General Reference. If you make an STS call to the global endpoint, the resulting session tokens might be valid in some Regions but not others. It depends on the version that is set in this operation. Version 1 tokens are valid only in AWS Regions that are available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily store tokens. For information, see Activating and Deactivating STS in an AWS Region in the IAM User Guide. To view the current session token version, see the GlobalEndpointTokenVersion entry in the response of the GetAccountSummary operation.
    */
  def setSecurityTokenServicePreferences(): Request[js.Object, AWSError] = js.native
  def setSecurityTokenServicePreferences(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the specified version of the global endpoint token as the token version used for the AWS account. By default, AWS Security Token Service (STS) is available as a global service, and all STS requests go to a single endpoint at https://sts.amazonaws.com. AWS recommends using Regional STS endpoints to reduce latency, build in redundancy, and increase session token availability. For information about Regional endpoints for STS, see AWS Regions and Endpoints in the AWS General Reference. If you make an STS call to the global endpoint, the resulting session tokens might be valid in some Regions but not others. It depends on the version that is set in this operation. Version 1 tokens are valid only in AWS Regions that are available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily store tokens. For information, see Activating and Deactivating STS in an AWS Region in the IAM User Guide. To view the current session token version, see the GlobalEndpointTokenVersion entry in the response of the GetAccountSummary operation.
    */
  def setSecurityTokenServicePreferences(params: SetSecurityTokenServicePreferencesRequest): Request[js.Object, AWSError] = js.native
  def setSecurityTokenServicePreferences(
    params: SetSecurityTokenServicePreferencesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Simulate how a set of IAM policies and optionally a resource-based policy works with a list of API operations and AWS resources to determine the policies' effective permissions. The policies are provided as strings. The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations. If you want to simulate existing policies that are attached to an IAM user, group, or role, use SimulatePrincipalPolicy instead. Context keys are variables that are maintained by AWS and its services and which provide details about the context of an API query request. You can use the Condition element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use GetContextKeysForCustomPolicy. If the output is long, you can use MaxItems and Marker parameters to paginate the results.
    */
  def simulateCustomPolicy(): Request[SimulatePolicyResponse, AWSError] = js.native
  def simulateCustomPolicy(callback: js.Function2[/* err */ AWSError, /* data */ SimulatePolicyResponse, Unit]): Request[SimulatePolicyResponse, AWSError] = js.native
  /**
    * Simulate how a set of IAM policies and optionally a resource-based policy works with a list of API operations and AWS resources to determine the policies' effective permissions. The policies are provided as strings. The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations. If you want to simulate existing policies that are attached to an IAM user, group, or role, use SimulatePrincipalPolicy instead. Context keys are variables that are maintained by AWS and its services and which provide details about the context of an API query request. You can use the Condition element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use GetContextKeysForCustomPolicy. If the output is long, you can use MaxItems and Marker parameters to paginate the results.
    */
  def simulateCustomPolicy(params: SimulateCustomPolicyRequest): Request[SimulatePolicyResponse, AWSError] = js.native
  def simulateCustomPolicy(
    params: SimulateCustomPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SimulatePolicyResponse, Unit]
  ): Request[SimulatePolicyResponse, AWSError] = js.native
  
  /**
    * Simulate how a set of IAM policies attached to an IAM entity works with a list of API operations and AWS resources to determine the policies' effective permissions. The entity can be an IAM user, group, or role. If you specify a user, then the simulation also includes all of the policies that are attached to groups that the user belongs to. You can optionally include a list of one or more additional policies specified as strings to include in the simulation. If you want to simulate only policies specified as strings, use SimulateCustomPolicy instead. You can also optionally include one resource-based policy to be evaluated with each of the resources included in the simulation. The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations.  Note: This API discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use SimulateCustomPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. You can use the Condition element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use GetContextKeysForPrincipalPolicy. If the output is long, you can use the MaxItems and Marker parameters to paginate the results.
    */
  def simulatePrincipalPolicy(): Request[SimulatePolicyResponse, AWSError] = js.native
  def simulatePrincipalPolicy(callback: js.Function2[/* err */ AWSError, /* data */ SimulatePolicyResponse, Unit]): Request[SimulatePolicyResponse, AWSError] = js.native
  /**
    * Simulate how a set of IAM policies attached to an IAM entity works with a list of API operations and AWS resources to determine the policies' effective permissions. The entity can be an IAM user, group, or role. If you specify a user, then the simulation also includes all of the policies that are attached to groups that the user belongs to. You can optionally include a list of one or more additional policies specified as strings to include in the simulation. If you want to simulate only policies specified as strings, use SimulateCustomPolicy instead. You can also optionally include one resource-based policy to be evaluated with each of the resources included in the simulation. The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations.  Note: This API discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use SimulateCustomPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. You can use the Condition element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use GetContextKeysForPrincipalPolicy. If the output is long, you can use the MaxItems and Marker parameters to paginate the results.
    */
  def simulatePrincipalPolicy(params: SimulatePrincipalPolicyRequest): Request[SimulatePolicyResponse, AWSError] = js.native
  def simulatePrincipalPolicy(
    params: SimulatePrincipalPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SimulatePolicyResponse, Unit]
  ): Request[SimulatePolicyResponse, AWSError] = js.native
  
  /**
    * Adds one or more tags to an IAM role. The role can be a regular role or a service-linked role. If a tag with the same key name already exists, then that tag is overwritten with the new value. A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:    Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name Project and the value MyImportantProject. Or search for all resources with the key name Cost Center and the value 41200.     Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM user or role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see Control Access Using IAM Tags in the IAM User Guide.    Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.      Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either case, the entire request fails and no tags are added to the role.   AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.    For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  def tagRole(): Request[js.Object, AWSError] = js.native
  def tagRole(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds one or more tags to an IAM role. The role can be a regular role or a service-linked role. If a tag with the same key name already exists, then that tag is overwritten with the new value. A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:    Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name Project and the value MyImportantProject. Or search for all resources with the key name Cost Center and the value 41200.     Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM user or role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see Control Access Using IAM Tags in the IAM User Guide.    Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.      Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either case, the entire request fails and no tags are added to the role.   AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.    For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  def tagRole(params: TagRoleRequest): Request[js.Object, AWSError] = js.native
  def tagRole(params: TagRoleRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds one or more tags to an IAM user. If a tag with the same key name already exists, then that tag is overwritten with the new value. A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:    Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name Project and the value MyImportantProject. Or search for all resources with the key name Cost Center and the value 41200.     Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM requesting user or to a role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see Control Access Using IAM Tags in the IAM User Guide.    Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.      Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either case, the entire request fails and no tags are added to the role.   AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.    For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  def tagUser(): Request[js.Object, AWSError] = js.native
  def tagUser(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds one or more tags to an IAM user. If a tag with the same key name already exists, then that tag is overwritten with the new value. A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:    Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name Project and the value MyImportantProject. Or search for all resources with the key name Cost Center and the value 41200.     Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM requesting user or to a role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see Control Access Using IAM Tags in the IAM User Guide.    Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.      Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either case, the entire request fails and no tags are added to the role.   AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.    For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  def tagUser(params: TagUserRequest): Request[js.Object, AWSError] = js.native
  def tagUser(params: TagUserRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the specified tags from the role. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  def untagRole(): Request[js.Object, AWSError] = js.native
  def untagRole(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified tags from the role. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  def untagRole(params: UntagRoleRequest): Request[js.Object, AWSError] = js.native
  def untagRole(params: UntagRoleRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the specified tags from the user. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  def untagUser(): Request[js.Object, AWSError] = js.native
  def untagUser(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified tags from the user. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  def untagUser(params: UntagUserRequest): Request[js.Object, AWSError] = js.native
  def untagUser(params: UntagUserRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Changes the status of the specified access key from Active to Inactive, or vice versa. This operation can be used to disable a user's key as part of a key rotation workflow. If the UserName is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users. For information about rotating keys, see Managing Keys and Certificates in the IAM User Guide.
    */
  def updateAccessKey(): Request[js.Object, AWSError] = js.native
  def updateAccessKey(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Changes the status of the specified access key from Active to Inactive, or vice versa. This operation can be used to disable a user's key as part of a key rotation workflow. If the UserName is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users. For information about rotating keys, see Managing Keys and Certificates in the IAM User Guide.
    */
  def updateAccessKey(params: UpdateAccessKeyRequest): Request[js.Object, AWSError] = js.native
  def updateAccessKey(
    params: UpdateAccessKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the password policy settings for the AWS account.    This operation does not support partial updates. No parameters are required, but if you do not specify a parameter, that parameter's value reverts to its default value. See the Request Parameters section for each parameter's default value. Also note that some parameters do not allow the default parameter to be explicitly set. Instead, to invoke the default value, do not include that parameter when you invoke the operation.     For more information about using a password policy, see Managing an IAM Password Policy in the IAM User Guide.
    */
  def updateAccountPasswordPolicy(): Request[js.Object, AWSError] = js.native
  def updateAccountPasswordPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the password policy settings for the AWS account.    This operation does not support partial updates. No parameters are required, but if you do not specify a parameter, that parameter's value reverts to its default value. See the Request Parameters section for each parameter's default value. Also note that some parameters do not allow the default parameter to be explicitly set. Instead, to invoke the default value, do not include that parameter when you invoke the operation.     For more information about using a password policy, see Managing an IAM Password Policy in the IAM User Guide.
    */
  def updateAccountPasswordPolicy(params: UpdateAccountPasswordPolicyRequest): Request[js.Object, AWSError] = js.native
  def updateAccountPasswordPolicy(
    params: UpdateAccountPasswordPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the policy that grants an IAM entity permission to assume a role. This is typically referred to as the "role trust policy". For more information about roles, go to Using Roles to Delegate Permissions and Federate Identities.
    */
  def updateAssumeRolePolicy(): Request[js.Object, AWSError] = js.native
  def updateAssumeRolePolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the policy that grants an IAM entity permission to assume a role. This is typically referred to as the "role trust policy". For more information about roles, go to Using Roles to Delegate Permissions and Federate Identities.
    */
  def updateAssumeRolePolicy(params: UpdateAssumeRolePolicyRequest): Request[js.Object, AWSError] = js.native
  def updateAssumeRolePolicy(
    params: UpdateAssumeRolePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the name and/or the path of the specified IAM group.   You should understand the implications of changing a group's path or name. For more information, see Renaming Users and Groups in the IAM User Guide.   The person making the request (the principal), must have permission to change the role group with the old name and the new name. For example, to change the group named Managers to MGRs, the principal must have a policy that allows them to update both groups. If the principal has permission to update the Managers group, but not the MGRs group, then the update fails. For more information about permissions, see Access Management.  
    */
  def updateGroup(): Request[js.Object, AWSError] = js.native
  def updateGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the name and/or the path of the specified IAM group.   You should understand the implications of changing a group's path or name. For more information, see Renaming Users and Groups in the IAM User Guide.   The person making the request (the principal), must have permission to change the role group with the old name and the new name. For example, to change the group named Managers to MGRs, the principal must have a policy that allows them to update both groups. If the principal has permission to update the Managers group, but not the MGRs group, then the update fails. For more information about permissions, see Access Management.  
    */
  def updateGroup(params: UpdateGroupRequest): Request[js.Object, AWSError] = js.native
  def updateGroup(params: UpdateGroupRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Changes the password for the specified IAM user. IAM users can change their own passwords by calling ChangePassword. For more information about modifying passwords, see Managing Passwords in the IAM User Guide.
    */
  def updateLoginProfile(): Request[js.Object, AWSError] = js.native
  def updateLoginProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Changes the password for the specified IAM user. IAM users can change their own passwords by calling ChangePassword. For more information about modifying passwords, see Managing Passwords in the IAM User Guide.
    */
  def updateLoginProfile(params: UpdateLoginProfileRequest): Request[js.Object, AWSError] = js.native
  def updateLoginProfile(
    params: UpdateLoginProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Replaces the existing list of server certificate thumbprints associated with an OpenID Connect (OIDC) provider resource object with a new list of thumbprints. The list that you pass with this operation completely replaces the existing list of thumbprints. (The lists are not merged.) Typically, you need to update a thumbprint only when the identity provider's certificate changes, which occurs rarely. However, if the provider's certificate does change, any attempt to assume an IAM role that specifies the OIDC provider as a principal fails until the certificate thumbprint is updated.  Trust for the OIDC provider is derived from the provider's certificate and is validated by the thumbprint. Therefore, it is best to limit access to the UpdateOpenIDConnectProviderThumbprint operation to highly privileged users. 
    */
  def updateOpenIDConnectProviderThumbprint(): Request[js.Object, AWSError] = js.native
  def updateOpenIDConnectProviderThumbprint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Replaces the existing list of server certificate thumbprints associated with an OpenID Connect (OIDC) provider resource object with a new list of thumbprints. The list that you pass with this operation completely replaces the existing list of thumbprints. (The lists are not merged.) Typically, you need to update a thumbprint only when the identity provider's certificate changes, which occurs rarely. However, if the provider's certificate does change, any attempt to assume an IAM role that specifies the OIDC provider as a principal fails until the certificate thumbprint is updated.  Trust for the OIDC provider is derived from the provider's certificate and is validated by the thumbprint. Therefore, it is best to limit access to the UpdateOpenIDConnectProviderThumbprint operation to highly privileged users. 
    */
  def updateOpenIDConnectProviderThumbprint(params: UpdateOpenIDConnectProviderThumbprintRequest): Request[js.Object, AWSError] = js.native
  def updateOpenIDConnectProviderThumbprint(
    params: UpdateOpenIDConnectProviderThumbprintRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the description or maximum session duration setting of a role.
    */
  def updateRole(): Request[UpdateRoleResponse, AWSError] = js.native
  def updateRole(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoleResponse, Unit]): Request[UpdateRoleResponse, AWSError] = js.native
  /**
    * Updates the description or maximum session duration setting of a role.
    */
  def updateRole(params: UpdateRoleRequest): Request[UpdateRoleResponse, AWSError] = js.native
  def updateRole(
    params: UpdateRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoleResponse, Unit]
  ): Request[UpdateRoleResponse, AWSError] = js.native
  
  /**
    * Use UpdateRole instead. Modifies only the description of a role. This operation performs the same function as the Description parameter in the UpdateRole operation.
    */
  def updateRoleDescription(): Request[UpdateRoleDescriptionResponse, AWSError] = js.native
  def updateRoleDescription(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoleDescriptionResponse, Unit]): Request[UpdateRoleDescriptionResponse, AWSError] = js.native
  /**
    * Use UpdateRole instead. Modifies only the description of a role. This operation performs the same function as the Description parameter in the UpdateRole operation.
    */
  def updateRoleDescription(params: UpdateRoleDescriptionRequest): Request[UpdateRoleDescriptionResponse, AWSError] = js.native
  def updateRoleDescription(
    params: UpdateRoleDescriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoleDescriptionResponse, Unit]
  ): Request[UpdateRoleDescriptionResponse, AWSError] = js.native
  
  /**
    * Updates the metadata document for an existing SAML provider resource object.  This operation requires Signature Version 4. 
    */
  def updateSAMLProvider(): Request[UpdateSAMLProviderResponse, AWSError] = js.native
  def updateSAMLProvider(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSAMLProviderResponse, Unit]): Request[UpdateSAMLProviderResponse, AWSError] = js.native
  /**
    * Updates the metadata document for an existing SAML provider resource object.  This operation requires Signature Version 4. 
    */
  def updateSAMLProvider(params: UpdateSAMLProviderRequest): Request[UpdateSAMLProviderResponse, AWSError] = js.native
  def updateSAMLProvider(
    params: UpdateSAMLProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSAMLProviderResponse, Unit]
  ): Request[UpdateSAMLProviderResponse, AWSError] = js.native
  
  /**
    * Sets the status of an IAM user's SSH public key to active or inactive. SSH public keys that are inactive cannot be used for authentication. This operation can be used to disable a user's SSH public key as part of a key rotation work flow. The SSH public key affected by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
    */
  def updateSSHPublicKey(): Request[js.Object, AWSError] = js.native
  def updateSSHPublicKey(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the status of an IAM user's SSH public key to active or inactive. SSH public keys that are inactive cannot be used for authentication. This operation can be used to disable a user's SSH public key as part of a key rotation work flow. The SSH public key affected by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
    */
  def updateSSHPublicKey(params: UpdateSSHPublicKeyRequest): Request[js.Object, AWSError] = js.native
  def updateSSHPublicKey(
    params: UpdateSSHPublicKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the name and/or the path of the specified server certificate stored in IAM. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.  You should understand the implications of changing a server certificate's path or name. For more information, see Renaming a Server Certificate in the IAM User Guide.   The person making the request (the principal), must have permission to change the server certificate with the old name and the new name. For example, to change the certificate named ProductionCert to ProdCert, the principal must have a policy that allows them to update both certificates. If the principal has permission to update the ProductionCert group, but not the ProdCert certificate, then the update fails. For more information about permissions, see Access Management in the IAM User Guide. 
    */
  def updateServerCertificate(): Request[js.Object, AWSError] = js.native
  def updateServerCertificate(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the name and/or the path of the specified server certificate stored in IAM. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.  You should understand the implications of changing a server certificate's path or name. For more information, see Renaming a Server Certificate in the IAM User Guide.   The person making the request (the principal), must have permission to change the server certificate with the old name and the new name. For example, to change the certificate named ProductionCert to ProdCert, the principal must have a policy that allows them to update both certificates. If the principal has permission to update the ProductionCert group, but not the ProdCert certificate, then the update fails. For more information about permissions, see Access Management in the IAM User Guide. 
    */
  def updateServerCertificate(params: UpdateServerCertificateRequest): Request[js.Object, AWSError] = js.native
  def updateServerCertificate(
    params: UpdateServerCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Sets the status of a service-specific credential to Active or Inactive. Service-specific credentials that are inactive cannot be used for authentication to the service. This operation can be used to disable a user's service-specific credential as part of a credential rotation work flow.
    */
  def updateServiceSpecificCredential(): Request[js.Object, AWSError] = js.native
  def updateServiceSpecificCredential(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the status of a service-specific credential to Active or Inactive. Service-specific credentials that are inactive cannot be used for authentication to the service. This operation can be used to disable a user's service-specific credential as part of a credential rotation work flow.
    */
  def updateServiceSpecificCredential(params: UpdateServiceSpecificCredentialRequest): Request[js.Object, AWSError] = js.native
  def updateServiceSpecificCredential(
    params: UpdateServiceSpecificCredentialRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Changes the status of the specified user signing certificate from active to disabled, or vice versa. This operation can be used to disable an IAM user's signing certificate as part of a certificate rotation work flow. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
    */
  def updateSigningCertificate(): Request[js.Object, AWSError] = js.native
  def updateSigningCertificate(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Changes the status of the specified user signing certificate from active to disabled, or vice versa. This operation can be used to disable an IAM user's signing certificate as part of a certificate rotation work flow. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
    */
  def updateSigningCertificate(params: UpdateSigningCertificateRequest): Request[js.Object, AWSError] = js.native
  def updateSigningCertificate(
    params: UpdateSigningCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the name and/or the path of the specified IAM user.   You should understand the implications of changing an IAM user's path or name. For more information, see Renaming an IAM User and Renaming an IAM Group in the IAM User Guide.    To change a user name, the requester must have appropriate permissions on both the source object and the target object. For example, to change Bob to Robert, the entity making the request must have permission on Bob and Robert, or must have permission on all (*). For more information about permissions, see Permissions and Policies.  
    */
  def updateUser(): Request[js.Object, AWSError] = js.native
  def updateUser(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the name and/or the path of the specified IAM user.   You should understand the implications of changing an IAM user's path or name. For more information, see Renaming an IAM User and Renaming an IAM Group in the IAM User Guide.    To change a user name, the requester must have appropriate permissions on both the source object and the target object. For example, to change Bob to Robert, the entity making the request must have permission on Bob and Robert, or must have permission on all (*). For more information about permissions, see Permissions and Policies.  
    */
  def updateUser(params: UpdateUserRequest): Request[js.Object, AWSError] = js.native
  def updateUser(params: UpdateUserRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Uploads an SSH public key and associates it with the specified IAM user. The SSH public key uploaded by this operation can be used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
    */
  def uploadSSHPublicKey(): Request[UploadSSHPublicKeyResponse, AWSError] = js.native
  def uploadSSHPublicKey(callback: js.Function2[/* err */ AWSError, /* data */ UploadSSHPublicKeyResponse, Unit]): Request[UploadSSHPublicKeyResponse, AWSError] = js.native
  /**
    * Uploads an SSH public key and associates it with the specified IAM user. The SSH public key uploaded by this operation can be used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
    */
  def uploadSSHPublicKey(params: UploadSSHPublicKeyRequest): Request[UploadSSHPublicKeyResponse, AWSError] = js.native
  def uploadSSHPublicKey(
    params: UploadSSHPublicKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UploadSSHPublicKeyResponse, Unit]
  ): Request[UploadSSHPublicKeyResponse, AWSError] = js.native
  
  /**
    * Uploads a server certificate entity for the AWS account. The server certificate entity includes a public key certificate, a private key, and an optional certificate chain, which should all be PEM-encoded. We recommend that you use AWS Certificate Manager to provision, manage, and deploy your server certificates. With ACM you can request a certificate, deploy it to AWS resources, and let ACM handle certificate renewals for you. Certificates provided by ACM are free. For more information about using ACM, see the AWS Certificate Manager User Guide. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server certificates that you manage with IAM. For information about the number of server certificates you can upload, see Limitations on IAM Entities and Objects in the IAM User Guide.  Because the body of the public key certificate, private key, and the certificate chain can be large, you should use POST rather than GET when calling UploadServerCertificate. For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in the AWS General Reference. For general information about using the Query API with IAM, go to Calling the API by Making HTTP Query Requests in the IAM User Guide. 
    */
  def uploadServerCertificate(): Request[UploadServerCertificateResponse, AWSError] = js.native
  def uploadServerCertificate(callback: js.Function2[/* err */ AWSError, /* data */ UploadServerCertificateResponse, Unit]): Request[UploadServerCertificateResponse, AWSError] = js.native
  /**
    * Uploads a server certificate entity for the AWS account. The server certificate entity includes a public key certificate, a private key, and an optional certificate chain, which should all be PEM-encoded. We recommend that you use AWS Certificate Manager to provision, manage, and deploy your server certificates. With ACM you can request a certificate, deploy it to AWS resources, and let ACM handle certificate renewals for you. Certificates provided by ACM are free. For more information about using ACM, see the AWS Certificate Manager User Guide. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server certificates that you manage with IAM. For information about the number of server certificates you can upload, see Limitations on IAM Entities and Objects in the IAM User Guide.  Because the body of the public key certificate, private key, and the certificate chain can be large, you should use POST rather than GET when calling UploadServerCertificate. For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in the AWS General Reference. For general information about using the Query API with IAM, go to Calling the API by Making HTTP Query Requests in the IAM User Guide. 
    */
  def uploadServerCertificate(params: UploadServerCertificateRequest): Request[UploadServerCertificateResponse, AWSError] = js.native
  def uploadServerCertificate(
    params: UploadServerCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UploadServerCertificateResponse, Unit]
  ): Request[UploadServerCertificateResponse, AWSError] = js.native
  
  /**
    * Uploads an X.509 signing certificate and associates it with the specified IAM user. Some AWS services use X.509 signing certificates to validate requests that are signed with a corresponding private key. When you upload the certificate, its default status is Active. If the UserName is not specified, the IAM user name is determined implicitly based on the AWS access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.  Because the body of an X.509 certificate can be large, you should use POST rather than GET when calling UploadSigningCertificate. For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in the AWS General Reference. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
    */
  def uploadSigningCertificate(): Request[UploadSigningCertificateResponse, AWSError] = js.native
  def uploadSigningCertificate(callback: js.Function2[/* err */ AWSError, /* data */ UploadSigningCertificateResponse, Unit]): Request[UploadSigningCertificateResponse, AWSError] = js.native
  /**
    * Uploads an X.509 signing certificate and associates it with the specified IAM user. Some AWS services use X.509 signing certificates to validate requests that are signed with a corresponding private key. When you upload the certificate, its default status is Active. If the UserName is not specified, the IAM user name is determined implicitly based on the AWS access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.  Because the body of an X.509 certificate can be large, you should use POST rather than GET when calling UploadSigningCertificate. For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in the AWS General Reference. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
    */
  def uploadSigningCertificate(params: UploadSigningCertificateRequest): Request[UploadSigningCertificateResponse, AWSError] = js.native
  def uploadSigningCertificate(
    params: UploadSigningCertificateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UploadSigningCertificateResponse, Unit]
  ): Request[UploadSigningCertificateResponse, AWSError] = js.native
  
  /**
    * Waits for the instanceProfileExists state by periodically calling the underlying IAM.getInstanceProfileoperation every 1 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceProfileExists(state: instanceProfileExists): Request[GetInstanceProfileResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceProfileExists(
    state: instanceProfileExists,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceProfileResponse, Unit]
  ): Request[GetInstanceProfileResponse, AWSError] = js.native
  /**
    * Waits for the instanceProfileExists state by periodically calling the underlying IAM.getInstanceProfileoperation every 1 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceProfileExists(state: instanceProfileExists, params: typings.awsSdk.anon.GetInstanceProfileRequest): Request[GetInstanceProfileResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceProfileExists(
    state: instanceProfileExists,
    params: typings.awsSdk.anon.GetInstanceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInstanceProfileResponse, Unit]
  ): Request[GetInstanceProfileResponse, AWSError] = js.native
  /**
    * Waits for the policyExists state by periodically calling the underlying IAM.getPolicyoperation every 1 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_policyExists(state: policyExists): Request[GetPolicyResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_policyExists(
    state: policyExists,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyResponse, Unit]
  ): Request[GetPolicyResponse, AWSError] = js.native
  /**
    * Waits for the policyExists state by periodically calling the underlying IAM.getPolicyoperation every 1 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_policyExists(state: policyExists, params: GetPolicyRequestwaiterWai): Request[GetPolicyResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_policyExists(
    state: policyExists,
    params: GetPolicyRequestwaiterWai,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPolicyResponse, Unit]
  ): Request[GetPolicyResponse, AWSError] = js.native
  /**
    * Waits for the roleExists state by periodically calling the underlying IAM.getRoleoperation every 1 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_roleExists(state: roleExists): Request[GetRoleResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_roleExists(state: roleExists, callback: js.Function2[/* err */ AWSError, /* data */ GetRoleResponse, Unit]): Request[GetRoleResponse, AWSError] = js.native
  /**
    * Waits for the roleExists state by periodically calling the underlying IAM.getRoleoperation every 1 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_roleExists(state: roleExists, params: GetRoleRequestwaiterWaite): Request[GetRoleResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_roleExists(
    state: roleExists,
    params: GetRoleRequestwaiterWaite,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRoleResponse, Unit]
  ): Request[GetRoleResponse, AWSError] = js.native
  /**
    * Waits for the userExists state by periodically calling the underlying IAM.getUseroperation every 1 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_userExists(state: userExists): Request[GetUserResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_userExists(state: userExists, callback: js.Function2[/* err */ AWSError, /* data */ GetUserResponse, Unit]): Request[GetUserResponse, AWSError] = js.native
  /**
    * Waits for the userExists state by periodically calling the underlying IAM.getUseroperation every 1 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_userExists(state: userExists, params: GetUserRequestwaiterWaite): Request[GetUserResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_userExists(
    state: userExists,
    params: GetUserRequestwaiterWaite,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUserResponse, Unit]
  ): Request[GetUserResponse, AWSError] = js.native
}
