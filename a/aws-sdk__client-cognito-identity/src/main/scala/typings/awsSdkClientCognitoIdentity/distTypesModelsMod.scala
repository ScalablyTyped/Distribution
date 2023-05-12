package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeConcur
import typings.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeDevelo
import typings.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeExtern
import typings.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeIntern
import typings.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeInvali
import typings.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeLimitE
import typings.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeNotAut
import typings.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeResour
import typings.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeTooMan
import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.AccessDenied
import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.AuthenticatedRole
import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.Contains
import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.Deny
import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.Equals
import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InternalServerError
import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.NotEqual
import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.Rules
import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.StartsWith
import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModelsMod {
  
  object AmbiguousRoleResolutionType {
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "AmbiguousRoleResolutionType.AUTHENTICATED_ROLE")
    @js.native
    val AUTHENTICATED_ROLE: AuthenticatedRole = js.native
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "AmbiguousRoleResolutionType.DENY")
    @js.native
    val DENY: Deny = js.native
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "ConcurrentModificationException")
  @js.native
  open class ConcurrentModificationException protected ()
    extends typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.ConcurrentModificationException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeConcur) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "DeveloperUserAlreadyRegisteredException")
  @js.native
  open class DeveloperUserAlreadyRegisteredException protected ()
    extends typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.DeveloperUserAlreadyRegisteredException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeDevelo) = this()
  }
  
  object ErrorCode {
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "ErrorCode.ACCESS_DENIED")
    @js.native
    val ACCESS_DENIED: AccessDenied = js.native
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "ErrorCode.INTERNAL_SERVER_ERROR")
    @js.native
    val INTERNAL_SERVER_ERROR: InternalServerError = js.native
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "ExternalServiceException")
  @js.native
  open class ExternalServiceException protected ()
    extends typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.ExternalServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeExtern) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "InternalErrorException")
  @js.native
  open class InternalErrorException protected ()
    extends typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.InternalErrorException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeIntern) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "InvalidIdentityPoolConfigurationException")
  @js.native
  open class InvalidIdentityPoolConfigurationException protected ()
    extends typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.InvalidIdentityPoolConfigurationException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "InvalidParameterException")
  @js.native
  open class InvalidParameterException protected ()
    extends typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.InvalidParameterException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "LimitExceededException")
  @js.native
  open class LimitExceededException protected ()
    extends typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.LimitExceededException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeLimitE) = this()
  }
  
  object MappingRuleMatchType {
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "MappingRuleMatchType.CONTAINS")
    @js.native
    val CONTAINS: Contains = js.native
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "MappingRuleMatchType.EQUALS")
    @js.native
    val EQUALS: Equals = js.native
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "MappingRuleMatchType.NOT_EQUAL")
    @js.native
    val NOT_EQUAL: NotEqual = js.native
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "MappingRuleMatchType.STARTS_WITH")
    @js.native
    val STARTS_WITH: StartsWith = js.native
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "NotAuthorizedException")
  @js.native
  open class NotAuthorizedException protected ()
    extends typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.NotAuthorizedException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeNotAut) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "ResourceConflictException")
  @js.native
  open class ResourceConflictException protected ()
    extends typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.ResourceConflictException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeResour) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "ResourceNotFoundException")
  @js.native
  open class ResourceNotFoundException protected ()
    extends typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.ResourceNotFoundException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeResour) = this()
  }
  
  object RoleMappingType {
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "RoleMappingType.RULES")
    @js.native
    val RULES: Rules = js.native
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "RoleMappingType.TOKEN")
    @js.native
    val TOKEN: Token = js.native
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "TooManyRequestsException")
  @js.native
  open class TooManyRequestsException protected ()
    extends typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.TooManyRequestsException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeTooMan) = this()
  }
}
