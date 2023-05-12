package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.AmbiguousRoleResolutionType
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.ErrorCode
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.MappingRuleMatchType
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.RoleMappingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object awsSdkClientCognitoIdentityStrings {
  
  @js.native
  sealed trait AccessDenied
    extends StObject
       with ErrorCode
  inline def AccessDenied: AccessDenied = "AccessDenied".asInstanceOf[AccessDenied]
  
  @js.native
  sealed trait AuthenticatedRole
    extends StObject
       with AmbiguousRoleResolutionType
  inline def AuthenticatedRole: AuthenticatedRole = "AuthenticatedRole".asInstanceOf[AuthenticatedRole]
  
  @js.native
  sealed trait ConcurrentModificationException extends StObject
  inline def ConcurrentModificationException: ConcurrentModificationException = "ConcurrentModificationException".asInstanceOf[ConcurrentModificationException]
  
  @js.native
  sealed trait Contains
    extends StObject
       with MappingRuleMatchType
  inline def Contains: Contains = "Contains".asInstanceOf[Contains]
  
  @js.native
  sealed trait Deny
    extends StObject
       with AmbiguousRoleResolutionType
  inline def Deny: Deny = "Deny".asInstanceOf[Deny]
  
  @js.native
  sealed trait DeveloperUserAlreadyRegisteredException extends StObject
  inline def DeveloperUserAlreadyRegisteredException: DeveloperUserAlreadyRegisteredException = "DeveloperUserAlreadyRegisteredException".asInstanceOf[DeveloperUserAlreadyRegisteredException]
  
  @js.native
  sealed trait Equals
    extends StObject
       with MappingRuleMatchType
  inline def Equals: Equals = "Equals".asInstanceOf[Equals]
  
  @js.native
  sealed trait ExternalServiceException extends StObject
  inline def ExternalServiceException: ExternalServiceException = "ExternalServiceException".asInstanceOf[ExternalServiceException]
  
  @js.native
  sealed trait InternalErrorException extends StObject
  inline def InternalErrorException: InternalErrorException = "InternalErrorException".asInstanceOf[InternalErrorException]
  
  @js.native
  sealed trait InternalServerError
    extends StObject
       with ErrorCode
  inline def InternalServerError: InternalServerError = "InternalServerError".asInstanceOf[InternalServerError]
  
  @js.native
  sealed trait InvalidIdentityPoolConfigurationException extends StObject
  inline def InvalidIdentityPoolConfigurationException: InvalidIdentityPoolConfigurationException = "InvalidIdentityPoolConfigurationException".asInstanceOf[InvalidIdentityPoolConfigurationException]
  
  @js.native
  sealed trait InvalidParameterException extends StObject
  inline def InvalidParameterException: InvalidParameterException = "InvalidParameterException".asInstanceOf[InvalidParameterException]
  
  @js.native
  sealed trait LimitExceededException extends StObject
  inline def LimitExceededException: LimitExceededException = "LimitExceededException".asInstanceOf[LimitExceededException]
  
  @js.native
  sealed trait NotAuthorizedException extends StObject
  inline def NotAuthorizedException: NotAuthorizedException = "NotAuthorizedException".asInstanceOf[NotAuthorizedException]
  
  @js.native
  sealed trait NotEqual
    extends StObject
       with MappingRuleMatchType
  inline def NotEqual: NotEqual = "NotEqual".asInstanceOf[NotEqual]
  
  @js.native
  sealed trait ResourceConflictException extends StObject
  inline def ResourceConflictException: ResourceConflictException = "ResourceConflictException".asInstanceOf[ResourceConflictException]
  
  @js.native
  sealed trait ResourceNotFoundException extends StObject
  inline def ResourceNotFoundException: ResourceNotFoundException = "ResourceNotFoundException".asInstanceOf[ResourceNotFoundException]
  
  @js.native
  sealed trait Rules
    extends StObject
       with RoleMappingType
  inline def Rules: Rules = "Rules".asInstanceOf[Rules]
  
  @js.native
  sealed trait StartsWith
    extends StObject
       with MappingRuleMatchType
  inline def StartsWith: StartsWith = "StartsWith".asInstanceOf[StartsWith]
  
  @js.native
  sealed trait Token
    extends StObject
       with RoleMappingType
  inline def Token: Token = "Token".asInstanceOf[Token]
  
  @js.native
  sealed trait TooManyRequestsException extends StObject
  inline def TooManyRequestsException: TooManyRequestsException = "TooManyRequestsException".asInstanceOf[TooManyRequestsException]
  
  @js.native
  sealed trait client extends StObject
  inline def client: client = "client".asInstanceOf[client]
  
  @js.native
  sealed trait server extends StObject
  inline def server: server = "server".asInstanceOf[server]
}
