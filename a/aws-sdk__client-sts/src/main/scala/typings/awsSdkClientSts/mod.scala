package typings.awsSdkClientSts

import typings.awsSdkClientSts.anon.ExceptionOptionTypeExpire
import typings.awsSdkClientSts.anon.ExceptionOptionTypeIDPCom
import typings.awsSdkClientSts.anon.ExceptionOptionTypeIDPRej
import typings.awsSdkClientSts.anon.ExceptionOptionTypeInvali
import typings.awsSdkClientSts.anon.ExceptionOptionTypeMalfor
import typings.awsSdkClientSts.anon.ExceptionOptionTypePacked
import typings.awsSdkClientSts.anon.ExceptionOptionTypeRegion
import typings.awsSdkClientSts.anon.PickSTSClientConfiglogger
import typings.awsSdkClientSts.assumeRoleCommandMod.AssumeRoleCommandInput
import typings.awsSdkClientSts.assumeRoleWithSAMLCommandMod.AssumeRoleWithSAMLCommandInput
import typings.awsSdkClientSts.assumeRoleWithWebIdentityCommandMod.AssumeRoleWithWebIdentityCommandInput
import typings.awsSdkClientSts.decodeAuthorizationMessageCommandMod.DecodeAuthorizationMessageCommandInput
import typings.awsSdkClientSts.defaultStsRoleAssumersMod.DefaultCredentialProvider
import typings.awsSdkClientSts.defaultStsRoleAssumersMod.RoleAssumer
import typings.awsSdkClientSts.defaultStsRoleAssumersMod.RoleAssumerWithWebIdentity
import typings.awsSdkClientSts.getAccessKeyInfoCommandMod.GetAccessKeyInfoCommandInput
import typings.awsSdkClientSts.getCallerIdentityCommandMod.GetCallerIdentityCommandInput
import typings.awsSdkClientSts.getFederationTokenCommandMod.GetFederationTokenCommandInput
import typings.awsSdkClientSts.getSessionTokenCommandMod.GetSessionTokenCommandInput
import typings.awsSdkClientSts.models0Mod.AssumeRoleRequest
import typings.awsSdkClientSts.models0Mod.AssumeRoleResponse
import typings.awsSdkClientSts.models0Mod.AssumeRoleWithSAMLRequest
import typings.awsSdkClientSts.models0Mod.AssumeRoleWithSAMLResponse
import typings.awsSdkClientSts.models0Mod.AssumeRoleWithWebIdentityRequest
import typings.awsSdkClientSts.models0Mod.AssumeRoleWithWebIdentityResponse
import typings.awsSdkClientSts.models0Mod.AssumedRoleUser
import typings.awsSdkClientSts.models0Mod.Credentials
import typings.awsSdkClientSts.models0Mod.DecodeAuthorizationMessageRequest
import typings.awsSdkClientSts.models0Mod.DecodeAuthorizationMessageResponse
import typings.awsSdkClientSts.models0Mod.FederatedUser
import typings.awsSdkClientSts.models0Mod.GetAccessKeyInfoRequest
import typings.awsSdkClientSts.models0Mod.GetAccessKeyInfoResponse
import typings.awsSdkClientSts.models0Mod.GetCallerIdentityRequest
import typings.awsSdkClientSts.models0Mod.GetCallerIdentityResponse
import typings.awsSdkClientSts.models0Mod.GetFederationTokenRequest
import typings.awsSdkClientSts.models0Mod.GetFederationTokenResponse
import typings.awsSdkClientSts.models0Mod.GetSessionTokenRequest
import typings.awsSdkClientSts.models0Mod.GetSessionTokenResponse
import typings.awsSdkClientSts.models0Mod.PolicyDescriptorType
import typings.awsSdkClientSts.models0Mod.Tag
import typings.awsSdkClientSts.stsclientMod.STSClientConfig
import typings.awsSdkClientSts.stsclientMod.ServiceInputTypes
import typings.awsSdkClientSts.stsclientMod.ServiceOutputTypes
import typings.awsSdkSmithyClient.exceptionsMod.ServiceExceptionOptions
import typings.awsSdkTypes.middlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/client-sts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/client-sts", "AssumeRoleCommand")
  @js.native
  open class AssumeRoleCommand protected ()
    extends typings.awsSdkClientSts.commandsMod.AssumeRoleCommand {
    def this(input: AssumeRoleCommandInput) = this()
  }
  
  inline def AssumeRoleRequestFilterSensitiveLog(obj: AssumeRoleRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def AssumeRoleResponseFilterSensitiveLog(obj: AssumeRoleResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "AssumeRoleWithSAMLCommand")
  @js.native
  open class AssumeRoleWithSAMLCommand protected ()
    extends typings.awsSdkClientSts.commandsMod.AssumeRoleWithSAMLCommand {
    def this(input: AssumeRoleWithSAMLCommandInput) = this()
  }
  
  inline def AssumeRoleWithSAMLRequestFilterSensitiveLog(obj: AssumeRoleWithSAMLRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleWithSAMLRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def AssumeRoleWithSAMLResponseFilterSensitiveLog(obj: AssumeRoleWithSAMLResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleWithSAMLResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "AssumeRoleWithWebIdentityCommand")
  @js.native
  open class AssumeRoleWithWebIdentityCommand protected ()
    extends typings.awsSdkClientSts.commandsMod.AssumeRoleWithWebIdentityCommand {
    def this(input: AssumeRoleWithWebIdentityCommandInput) = this()
  }
  
  inline def AssumeRoleWithWebIdentityRequestFilterSensitiveLog(obj: AssumeRoleWithWebIdentityRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleWithWebIdentityRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def AssumeRoleWithWebIdentityResponseFilterSensitiveLog(obj: AssumeRoleWithWebIdentityResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleWithWebIdentityResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def AssumedRoleUserFilterSensitiveLog(obj: AssumedRoleUser): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumedRoleUserFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def CredentialsFilterSensitiveLog(obj: Credentials): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CredentialsFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "DecodeAuthorizationMessageCommand")
  @js.native
  open class DecodeAuthorizationMessageCommand protected ()
    extends typings.awsSdkClientSts.commandsMod.DecodeAuthorizationMessageCommand {
    def this(input: DecodeAuthorizationMessageCommandInput) = this()
  }
  
  inline def DecodeAuthorizationMessageRequestFilterSensitiveLog(obj: DecodeAuthorizationMessageRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeAuthorizationMessageRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def DecodeAuthorizationMessageResponseFilterSensitiveLog(obj: DecodeAuthorizationMessageResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeAuthorizationMessageResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "ExpiredTokenException")
  @js.native
  open class ExpiredTokenException protected ()
    extends typings.awsSdkClientSts.modelsMod.ExpiredTokenException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeExpire) = this()
  }
  
  inline def FederatedUserFilterSensitiveLog(obj: FederatedUser): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("FederatedUserFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "GetAccessKeyInfoCommand")
  @js.native
  open class GetAccessKeyInfoCommand protected ()
    extends typings.awsSdkClientSts.commandsMod.GetAccessKeyInfoCommand {
    def this(input: GetAccessKeyInfoCommandInput) = this()
  }
  
  inline def GetAccessKeyInfoRequestFilterSensitiveLog(obj: GetAccessKeyInfoRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAccessKeyInfoRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetAccessKeyInfoResponseFilterSensitiveLog(obj: GetAccessKeyInfoResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAccessKeyInfoResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "GetCallerIdentityCommand")
  @js.native
  open class GetCallerIdentityCommand protected ()
    extends typings.awsSdkClientSts.commandsMod.GetCallerIdentityCommand {
    def this(input: GetCallerIdentityCommandInput) = this()
  }
  
  inline def GetCallerIdentityRequestFilterSensitiveLog(obj: GetCallerIdentityRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCallerIdentityRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetCallerIdentityResponseFilterSensitiveLog(obj: GetCallerIdentityResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCallerIdentityResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "GetFederationTokenCommand")
  @js.native
  open class GetFederationTokenCommand protected ()
    extends typings.awsSdkClientSts.commandsMod.GetFederationTokenCommand {
    def this(input: GetFederationTokenCommandInput) = this()
  }
  
  inline def GetFederationTokenRequestFilterSensitiveLog(obj: GetFederationTokenRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetFederationTokenRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetFederationTokenResponseFilterSensitiveLog(obj: GetFederationTokenResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetFederationTokenResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "GetSessionTokenCommand")
  @js.native
  open class GetSessionTokenCommand protected ()
    extends typings.awsSdkClientSts.commandsMod.GetSessionTokenCommand {
    def this(input: GetSessionTokenCommandInput) = this()
  }
  
  inline def GetSessionTokenRequestFilterSensitiveLog(obj: GetSessionTokenRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSessionTokenRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetSessionTokenResponseFilterSensitiveLog(obj: GetSessionTokenResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSessionTokenResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "IDPCommunicationErrorException")
  @js.native
  open class IDPCommunicationErrorException protected ()
    extends typings.awsSdkClientSts.modelsMod.IDPCommunicationErrorException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeIDPCom) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "IDPRejectedClaimException")
  @js.native
  open class IDPRejectedClaimException protected ()
    extends typings.awsSdkClientSts.modelsMod.IDPRejectedClaimException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeIDPRej) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "InvalidAuthorizationMessageException")
  @js.native
  open class InvalidAuthorizationMessageException protected ()
    extends typings.awsSdkClientSts.modelsMod.InvalidAuthorizationMessageException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "InvalidIdentityTokenException")
  @js.native
  open class InvalidIdentityTokenException protected ()
    extends typings.awsSdkClientSts.modelsMod.InvalidIdentityTokenException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "MalformedPolicyDocumentException")
  @js.native
  open class MalformedPolicyDocumentException protected ()
    extends typings.awsSdkClientSts.modelsMod.MalformedPolicyDocumentException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeMalfor) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "PackedPolicyTooLargeException")
  @js.native
  open class PackedPolicyTooLargeException protected ()
    extends typings.awsSdkClientSts.modelsMod.PackedPolicyTooLargeException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypePacked) = this()
  }
  
  inline def PolicyDescriptorTypeFilterSensitiveLog(obj: PolicyDescriptorType): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("PolicyDescriptorTypeFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "RegionDisabledException")
  @js.native
  open class RegionDisabledException protected ()
    extends typings.awsSdkClientSts.modelsMod.RegionDisabledException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeRegion) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "STS")
  @js.native
  open class STS protected ()
    extends typings.awsSdkClientSts.stsMod.STS {
    def this(configuration: STSClientConfig) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "STSClient")
  @js.native
  open class STSClient protected ()
    extends typings.awsSdkClientSts.stsclientMod.STSClient {
    def this(configuration: STSClientConfig) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "STSServiceException")
  @js.native
  open class STSServiceException protected ()
    extends typings.awsSdkClientSts.stsserviceexceptionMod.STSServiceException {
    /**
      * @internal
      */
    def this(options: ServiceExceptionOptions) = this()
  }
  
  inline def TagFilterSensitiveLog(obj: Tag): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("TagFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def decorateDefaultCredentialProvider(provider: DefaultCredentialProvider): DefaultCredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("decorateDefaultCredentialProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[DefaultCredentialProvider]
  
  inline def getDefaultRoleAssumer(): RoleAssumer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumer")().asInstanceOf[RoleAssumer]
  inline def getDefaultRoleAssumer(stsOptions: Unit, stsPlugins: js.Array[Pluggable[ServiceInputTypes, ServiceOutputTypes]]): RoleAssumer = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumer")(stsOptions.asInstanceOf[js.Any], stsPlugins.asInstanceOf[js.Any])).asInstanceOf[RoleAssumer]
  inline def getDefaultRoleAssumer(stsOptions: PickSTSClientConfiglogger): RoleAssumer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumer")(stsOptions.asInstanceOf[js.Any]).asInstanceOf[RoleAssumer]
  inline def getDefaultRoleAssumer(
    stsOptions: PickSTSClientConfiglogger,
    stsPlugins: js.Array[Pluggable[ServiceInputTypes, ServiceOutputTypes]]
  ): RoleAssumer = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumer")(stsOptions.asInstanceOf[js.Any], stsPlugins.asInstanceOf[js.Any])).asInstanceOf[RoleAssumer]
  
  inline def getDefaultRoleAssumerWithWebIdentity(): RoleAssumerWithWebIdentity = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumerWithWebIdentity")().asInstanceOf[RoleAssumerWithWebIdentity]
  inline def getDefaultRoleAssumerWithWebIdentity(stsOptions: Unit, stsPlugins: js.Array[Pluggable[ServiceInputTypes, ServiceOutputTypes]]): RoleAssumerWithWebIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumerWithWebIdentity")(stsOptions.asInstanceOf[js.Any], stsPlugins.asInstanceOf[js.Any])).asInstanceOf[RoleAssumerWithWebIdentity]
  inline def getDefaultRoleAssumerWithWebIdentity(stsOptions: PickSTSClientConfiglogger): RoleAssumerWithWebIdentity = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumerWithWebIdentity")(stsOptions.asInstanceOf[js.Any]).asInstanceOf[RoleAssumerWithWebIdentity]
  inline def getDefaultRoleAssumerWithWebIdentity(
    stsOptions: PickSTSClientConfiglogger,
    stsPlugins: js.Array[Pluggable[ServiceInputTypes, ServiceOutputTypes]]
  ): RoleAssumerWithWebIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumerWithWebIdentity")(stsOptions.asInstanceOf[js.Any], stsPlugins.asInstanceOf[js.Any])).asInstanceOf[RoleAssumerWithWebIdentity]
}
