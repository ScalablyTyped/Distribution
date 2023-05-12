package typings.awsSdkClientSts

import typings.awsSdkClientSts.anon.ExceptionOptionTypeExpire
import typings.awsSdkClientSts.anon.ExceptionOptionTypeIDPCom
import typings.awsSdkClientSts.anon.ExceptionOptionTypeIDPRej
import typings.awsSdkClientSts.anon.ExceptionOptionTypeInvali
import typings.awsSdkClientSts.anon.ExceptionOptionTypeMalfor
import typings.awsSdkClientSts.anon.ExceptionOptionTypePacked
import typings.awsSdkClientSts.anon.ExceptionOptionTypeRegion
import typings.awsSdkClientSts.anon.PickSTSClientConfiglogger
import typings.awsSdkClientSts.distTypesCommandsAssumeRoleCommandMod.AssumeRoleCommandInput
import typings.awsSdkClientSts.distTypesCommandsAssumeRoleWithSAMLCommandMod.AssumeRoleWithSAMLCommandInput
import typings.awsSdkClientSts.distTypesCommandsAssumeRoleWithWebIdentityCommandMod.AssumeRoleWithWebIdentityCommandInput
import typings.awsSdkClientSts.distTypesCommandsDecodeAuthorizationMessageCommandMod.DecodeAuthorizationMessageCommandInput
import typings.awsSdkClientSts.distTypesCommandsGetAccessKeyInfoCommandMod.GetAccessKeyInfoCommandInput
import typings.awsSdkClientSts.distTypesCommandsGetCallerIdentityCommandMod.GetCallerIdentityCommandInput
import typings.awsSdkClientSts.distTypesCommandsGetFederationTokenCommandMod.GetFederationTokenCommandInput
import typings.awsSdkClientSts.distTypesCommandsGetSessionTokenCommandMod.GetSessionTokenCommandInput
import typings.awsSdkClientSts.distTypesDefaultStsRoleAssumersMod.DefaultCredentialProvider
import typings.awsSdkClientSts.distTypesDefaultStsRoleAssumersMod.RoleAssumer
import typings.awsSdkClientSts.distTypesDefaultStsRoleAssumersMod.RoleAssumerWithWebIdentity
import typings.awsSdkClientSts.distTypesStsclientMod.STSClientConfig
import typings.awsSdkClientSts.distTypesStsclientMod.ServiceInputTypes
import typings.awsSdkClientSts.distTypesStsclientMod.ServiceOutputTypes
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import typings.awsSdkSmithyClient.distTypesExceptionsMod.ServiceExceptionOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
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
    extends typings.awsSdkClientSts.distTypesCommandsMod.AssumeRoleCommand {
    /**
      * @public
      */
    def this(input: AssumeRoleCommandInput) = this()
  }
  /* static members */
  object AssumeRoleCommand {
    
    @JSImport("@aws-sdk/client-sts", "AssumeRoleCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  @JSImport("@aws-sdk/client-sts", "AssumeRoleWithSAMLCommand")
  @js.native
  open class AssumeRoleWithSAMLCommand protected ()
    extends typings.awsSdkClientSts.distTypesCommandsMod.AssumeRoleWithSAMLCommand {
    /**
      * @public
      */
    def this(input: AssumeRoleWithSAMLCommandInput) = this()
  }
  /* static members */
  object AssumeRoleWithSAMLCommand {
    
    @JSImport("@aws-sdk/client-sts", "AssumeRoleWithSAMLCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  @JSImport("@aws-sdk/client-sts", "AssumeRoleWithWebIdentityCommand")
  @js.native
  open class AssumeRoleWithWebIdentityCommand protected ()
    extends typings.awsSdkClientSts.distTypesCommandsMod.AssumeRoleWithWebIdentityCommand {
    /**
      * @public
      */
    def this(input: AssumeRoleWithWebIdentityCommandInput) = this()
  }
  /* static members */
  object AssumeRoleWithWebIdentityCommand {
    
    @JSImport("@aws-sdk/client-sts", "AssumeRoleWithWebIdentityCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  @JSImport("@aws-sdk/client-sts", "DecodeAuthorizationMessageCommand")
  @js.native
  open class DecodeAuthorizationMessageCommand protected ()
    extends typings.awsSdkClientSts.distTypesCommandsMod.DecodeAuthorizationMessageCommand {
    /**
      * @public
      */
    def this(input: DecodeAuthorizationMessageCommandInput) = this()
  }
  /* static members */
  object DecodeAuthorizationMessageCommand {
    
    @JSImport("@aws-sdk/client-sts", "DecodeAuthorizationMessageCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  @JSImport("@aws-sdk/client-sts", "ExpiredTokenException")
  @js.native
  open class ExpiredTokenException protected ()
    extends typings.awsSdkClientSts.distTypesModelsMod.ExpiredTokenException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeExpire) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "GetAccessKeyInfoCommand")
  @js.native
  open class GetAccessKeyInfoCommand protected ()
    extends typings.awsSdkClientSts.distTypesCommandsMod.GetAccessKeyInfoCommand {
    /**
      * @public
      */
    def this(input: GetAccessKeyInfoCommandInput) = this()
  }
  /* static members */
  object GetAccessKeyInfoCommand {
    
    @JSImport("@aws-sdk/client-sts", "GetAccessKeyInfoCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  @JSImport("@aws-sdk/client-sts", "GetCallerIdentityCommand")
  @js.native
  open class GetCallerIdentityCommand protected ()
    extends typings.awsSdkClientSts.distTypesCommandsMod.GetCallerIdentityCommand {
    /**
      * @public
      */
    def this(input: GetCallerIdentityCommandInput) = this()
  }
  /* static members */
  object GetCallerIdentityCommand {
    
    @JSImport("@aws-sdk/client-sts", "GetCallerIdentityCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  @JSImport("@aws-sdk/client-sts", "GetFederationTokenCommand")
  @js.native
  open class GetFederationTokenCommand protected ()
    extends typings.awsSdkClientSts.distTypesCommandsMod.GetFederationTokenCommand {
    /**
      * @public
      */
    def this(input: GetFederationTokenCommandInput) = this()
  }
  /* static members */
  object GetFederationTokenCommand {
    
    @JSImport("@aws-sdk/client-sts", "GetFederationTokenCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  @JSImport("@aws-sdk/client-sts", "GetSessionTokenCommand")
  @js.native
  open class GetSessionTokenCommand protected ()
    extends typings.awsSdkClientSts.distTypesCommandsMod.GetSessionTokenCommand {
    /**
      * @public
      */
    def this(input: GetSessionTokenCommandInput) = this()
  }
  /* static members */
  object GetSessionTokenCommand {
    
    @JSImport("@aws-sdk/client-sts", "GetSessionTokenCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  @JSImport("@aws-sdk/client-sts", "IDPCommunicationErrorException")
  @js.native
  open class IDPCommunicationErrorException protected ()
    extends typings.awsSdkClientSts.distTypesModelsMod.IDPCommunicationErrorException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeIDPCom) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "IDPRejectedClaimException")
  @js.native
  open class IDPRejectedClaimException protected ()
    extends typings.awsSdkClientSts.distTypesModelsMod.IDPRejectedClaimException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeIDPRej) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "InvalidAuthorizationMessageException")
  @js.native
  open class InvalidAuthorizationMessageException protected ()
    extends typings.awsSdkClientSts.distTypesModelsMod.InvalidAuthorizationMessageException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "InvalidIdentityTokenException")
  @js.native
  open class InvalidIdentityTokenException protected ()
    extends typings.awsSdkClientSts.distTypesModelsMod.InvalidIdentityTokenException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "MalformedPolicyDocumentException")
  @js.native
  open class MalformedPolicyDocumentException protected ()
    extends typings.awsSdkClientSts.distTypesModelsMod.MalformedPolicyDocumentException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeMalfor) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "PackedPolicyTooLargeException")
  @js.native
  open class PackedPolicyTooLargeException protected ()
    extends typings.awsSdkClientSts.distTypesModelsMod.PackedPolicyTooLargeException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypePacked) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "RegionDisabledException")
  @js.native
  open class RegionDisabledException protected ()
    extends typings.awsSdkClientSts.distTypesModelsMod.RegionDisabledException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeRegion) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "STS")
  @js.native
  open class STS protected ()
    extends typings.awsSdkClientSts.distTypesStsMod.STS {
    def this(configuration: STSClientConfig) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "STSClient")
  @js.native
  open class STSClient protected ()
    extends typings.awsSdkClientSts.distTypesStsclientMod.STSClient {
    def this(configuration: STSClientConfig) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "STSServiceException")
  @js.native
  open class STSServiceException protected ()
    extends typings.awsSdkClientSts.distTypesModelsStsserviceexceptionMod.STSServiceException {
    /**
      * @internal
      */
    def this(options: ServiceExceptionOptions) = this()
  }
  
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
