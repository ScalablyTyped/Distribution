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
import typings.awsSdkClientCognitoIdentity.models0Mod.CognitoIdentityProvider
import typings.awsSdkClientCognitoIdentity.models0Mod.CreateIdentityPoolInput
import typings.awsSdkClientCognitoIdentity.models0Mod.Credentials
import typings.awsSdkClientCognitoIdentity.models0Mod.DeleteIdentitiesInput
import typings.awsSdkClientCognitoIdentity.models0Mod.DeleteIdentitiesResponse
import typings.awsSdkClientCognitoIdentity.models0Mod.DeleteIdentityPoolInput
import typings.awsSdkClientCognitoIdentity.models0Mod.DescribeIdentityInput
import typings.awsSdkClientCognitoIdentity.models0Mod.DescribeIdentityPoolInput
import typings.awsSdkClientCognitoIdentity.models0Mod.GetCredentialsForIdentityInput
import typings.awsSdkClientCognitoIdentity.models0Mod.GetCredentialsForIdentityResponse
import typings.awsSdkClientCognitoIdentity.models0Mod.GetIdInput
import typings.awsSdkClientCognitoIdentity.models0Mod.GetIdResponse
import typings.awsSdkClientCognitoIdentity.models0Mod.GetIdentityPoolRolesInput
import typings.awsSdkClientCognitoIdentity.models0Mod.GetIdentityPoolRolesResponse
import typings.awsSdkClientCognitoIdentity.models0Mod.GetOpenIdTokenForDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentity.models0Mod.GetOpenIdTokenForDeveloperIdentityResponse
import typings.awsSdkClientCognitoIdentity.models0Mod.GetOpenIdTokenInput
import typings.awsSdkClientCognitoIdentity.models0Mod.GetOpenIdTokenResponse
import typings.awsSdkClientCognitoIdentity.models0Mod.GetPrincipalTagAttributeMapInput
import typings.awsSdkClientCognitoIdentity.models0Mod.GetPrincipalTagAttributeMapResponse
import typings.awsSdkClientCognitoIdentity.models0Mod.IdentityDescription
import typings.awsSdkClientCognitoIdentity.models0Mod.IdentityPool
import typings.awsSdkClientCognitoIdentity.models0Mod.IdentityPoolShortDescription
import typings.awsSdkClientCognitoIdentity.models0Mod.ListIdentitiesInput
import typings.awsSdkClientCognitoIdentity.models0Mod.ListIdentitiesResponse
import typings.awsSdkClientCognitoIdentity.models0Mod.ListIdentityPoolsInput
import typings.awsSdkClientCognitoIdentity.models0Mod.ListIdentityPoolsResponse
import typings.awsSdkClientCognitoIdentity.models0Mod.ListTagsForResourceInput
import typings.awsSdkClientCognitoIdentity.models0Mod.ListTagsForResourceResponse
import typings.awsSdkClientCognitoIdentity.models0Mod.LookupDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentity.models0Mod.LookupDeveloperIdentityResponse
import typings.awsSdkClientCognitoIdentity.models0Mod.MappingRule
import typings.awsSdkClientCognitoIdentity.models0Mod.MergeDeveloperIdentitiesInput
import typings.awsSdkClientCognitoIdentity.models0Mod.MergeDeveloperIdentitiesResponse
import typings.awsSdkClientCognitoIdentity.models0Mod.RoleMapping
import typings.awsSdkClientCognitoIdentity.models0Mod.RulesConfigurationType
import typings.awsSdkClientCognitoIdentity.models0Mod.SetIdentityPoolRolesInput
import typings.awsSdkClientCognitoIdentity.models0Mod.SetPrincipalTagAttributeMapInput
import typings.awsSdkClientCognitoIdentity.models0Mod.SetPrincipalTagAttributeMapResponse
import typings.awsSdkClientCognitoIdentity.models0Mod.TagResourceInput
import typings.awsSdkClientCognitoIdentity.models0Mod.TagResourceResponse
import typings.awsSdkClientCognitoIdentity.models0Mod.UnlinkDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentity.models0Mod.UnlinkIdentityInput
import typings.awsSdkClientCognitoIdentity.models0Mod.UnprocessedIdentityId
import typings.awsSdkClientCognitoIdentity.models0Mod.UntagResourceInput
import typings.awsSdkClientCognitoIdentity.models0Mod.UntagResourceResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "AmbiguousRoleResolutionType")
  @js.native
  object AmbiguousRoleResolutionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.awsSdkClientCognitoIdentity.models0Mod.AmbiguousRoleResolutionType & String
      ] = js.native
    
    /* "AuthenticatedRole" */ val AUTHENTICATED_ROLE: typings.awsSdkClientCognitoIdentity.models0Mod.AmbiguousRoleResolutionType.AUTHENTICATED_ROLE & String = js.native
    
    /* "Deny" */ val DENY: typings.awsSdkClientCognitoIdentity.models0Mod.AmbiguousRoleResolutionType.DENY & String = js.native
  }
  
  inline def CognitoIdentityProviderFilterSensitiveLog(obj: CognitoIdentityProvider): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CognitoIdentityProviderFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "ConcurrentModificationException")
  @js.native
  open class ConcurrentModificationException protected ()
    extends typings.awsSdkClientCognitoIdentity.models0Mod.ConcurrentModificationException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeConcur) = this()
  }
  
  inline def CreateIdentityPoolInputFilterSensitiveLog(obj: CreateIdentityPoolInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateIdentityPoolInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def CredentialsFilterSensitiveLog(obj: Credentials): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CredentialsFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def DeleteIdentitiesInputFilterSensitiveLog(obj: DeleteIdentitiesInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DeleteIdentitiesInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def DeleteIdentitiesResponseFilterSensitiveLog(obj: DeleteIdentitiesResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DeleteIdentitiesResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def DeleteIdentityPoolInputFilterSensitiveLog(obj: DeleteIdentityPoolInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DeleteIdentityPoolInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def DescribeIdentityInputFilterSensitiveLog(obj: DescribeIdentityInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DescribeIdentityInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def DescribeIdentityPoolInputFilterSensitiveLog(obj: DescribeIdentityPoolInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DescribeIdentityPoolInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "DeveloperUserAlreadyRegisteredException")
  @js.native
  open class DeveloperUserAlreadyRegisteredException protected ()
    extends typings.awsSdkClientCognitoIdentity.models0Mod.DeveloperUserAlreadyRegisteredException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeDevelo) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.awsSdkClientCognitoIdentity.models0Mod.ErrorCode & String] = js.native
    
    /* "AccessDenied" */ val ACCESS_DENIED: typings.awsSdkClientCognitoIdentity.models0Mod.ErrorCode.ACCESS_DENIED & String = js.native
    
    /* "InternalServerError" */ val INTERNAL_SERVER_ERROR: typings.awsSdkClientCognitoIdentity.models0Mod.ErrorCode.INTERNAL_SERVER_ERROR & String = js.native
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "ExternalServiceException")
  @js.native
  open class ExternalServiceException protected ()
    extends typings.awsSdkClientCognitoIdentity.models0Mod.ExternalServiceException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeExtern) = this()
  }
  
  inline def GetCredentialsForIdentityInputFilterSensitiveLog(obj: GetCredentialsForIdentityInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCredentialsForIdentityInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetCredentialsForIdentityResponseFilterSensitiveLog(obj: GetCredentialsForIdentityResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCredentialsForIdentityResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetIdInputFilterSensitiveLog(obj: GetIdInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetIdInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetIdResponseFilterSensitiveLog(obj: GetIdResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetIdResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetIdentityPoolRolesInputFilterSensitiveLog(obj: GetIdentityPoolRolesInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetIdentityPoolRolesInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetIdentityPoolRolesResponseFilterSensitiveLog(obj: GetIdentityPoolRolesResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetIdentityPoolRolesResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetOpenIdTokenForDeveloperIdentityInputFilterSensitiveLog(obj: GetOpenIdTokenForDeveloperIdentityInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetOpenIdTokenForDeveloperIdentityInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetOpenIdTokenForDeveloperIdentityResponseFilterSensitiveLog(obj: GetOpenIdTokenForDeveloperIdentityResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetOpenIdTokenForDeveloperIdentityResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetOpenIdTokenInputFilterSensitiveLog(obj: GetOpenIdTokenInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetOpenIdTokenInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetOpenIdTokenResponseFilterSensitiveLog(obj: GetOpenIdTokenResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetOpenIdTokenResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetPrincipalTagAttributeMapInputFilterSensitiveLog(obj: GetPrincipalTagAttributeMapInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetPrincipalTagAttributeMapInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetPrincipalTagAttributeMapResponseFilterSensitiveLog(obj: GetPrincipalTagAttributeMapResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetPrincipalTagAttributeMapResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def IdentityDescriptionFilterSensitiveLog(obj: IdentityDescription): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("IdentityDescriptionFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def IdentityPoolFilterSensitiveLog(obj: IdentityPool): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("IdentityPoolFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def IdentityPoolShortDescriptionFilterSensitiveLog(obj: IdentityPoolShortDescription): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("IdentityPoolShortDescriptionFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "InternalErrorException")
  @js.native
  open class InternalErrorException protected ()
    extends typings.awsSdkClientCognitoIdentity.models0Mod.InternalErrorException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeIntern) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "InvalidIdentityPoolConfigurationException")
  @js.native
  open class InvalidIdentityPoolConfigurationException protected ()
    extends typings.awsSdkClientCognitoIdentity.models0Mod.InvalidIdentityPoolConfigurationException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "InvalidParameterException")
  @js.native
  open class InvalidParameterException protected ()
    extends typings.awsSdkClientCognitoIdentity.models0Mod.InvalidParameterException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "LimitExceededException")
  @js.native
  open class LimitExceededException protected ()
    extends typings.awsSdkClientCognitoIdentity.models0Mod.LimitExceededException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeLimitE) = this()
  }
  
  inline def ListIdentitiesInputFilterSensitiveLog(obj: ListIdentitiesInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListIdentitiesInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ListIdentitiesResponseFilterSensitiveLog(obj: ListIdentitiesResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListIdentitiesResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ListIdentityPoolsInputFilterSensitiveLog(obj: ListIdentityPoolsInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListIdentityPoolsInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ListIdentityPoolsResponseFilterSensitiveLog(obj: ListIdentityPoolsResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListIdentityPoolsResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ListTagsForResourceInputFilterSensitiveLog(obj: ListTagsForResourceInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListTagsForResourceInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ListTagsForResourceResponseFilterSensitiveLog(obj: ListTagsForResourceResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListTagsForResourceResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def LookupDeveloperIdentityInputFilterSensitiveLog(obj: LookupDeveloperIdentityInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("LookupDeveloperIdentityInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def LookupDeveloperIdentityResponseFilterSensitiveLog(obj: LookupDeveloperIdentityResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("LookupDeveloperIdentityResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def MappingRuleFilterSensitiveLog(obj: MappingRule): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("MappingRuleFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "MappingRuleMatchType")
  @js.native
  object MappingRuleMatchType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.awsSdkClientCognitoIdentity.models0Mod.MappingRuleMatchType & String] = js.native
    
    /* "Contains" */ val CONTAINS: typings.awsSdkClientCognitoIdentity.models0Mod.MappingRuleMatchType.CONTAINS & String = js.native
    
    /* "Equals" */ val EQUALS: typings.awsSdkClientCognitoIdentity.models0Mod.MappingRuleMatchType.EQUALS & String = js.native
    
    /* "NotEqual" */ val NOT_EQUAL: typings.awsSdkClientCognitoIdentity.models0Mod.MappingRuleMatchType.NOT_EQUAL & String = js.native
    
    /* "StartsWith" */ val STARTS_WITH: typings.awsSdkClientCognitoIdentity.models0Mod.MappingRuleMatchType.STARTS_WITH & String = js.native
  }
  
  inline def MergeDeveloperIdentitiesInputFilterSensitiveLog(obj: MergeDeveloperIdentitiesInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("MergeDeveloperIdentitiesInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def MergeDeveloperIdentitiesResponseFilterSensitiveLog(obj: MergeDeveloperIdentitiesResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("MergeDeveloperIdentitiesResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "NotAuthorizedException")
  @js.native
  open class NotAuthorizedException protected ()
    extends typings.awsSdkClientCognitoIdentity.models0Mod.NotAuthorizedException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeNotAut) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "ResourceConflictException")
  @js.native
  open class ResourceConflictException protected ()
    extends typings.awsSdkClientCognitoIdentity.models0Mod.ResourceConflictException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeResour) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "ResourceNotFoundException")
  @js.native
  open class ResourceNotFoundException protected ()
    extends typings.awsSdkClientCognitoIdentity.models0Mod.ResourceNotFoundException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeResour) = this()
  }
  
  inline def RoleMappingFilterSensitiveLog(obj: RoleMapping): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RoleMappingFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "RoleMappingType")
  @js.native
  object RoleMappingType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.awsSdkClientCognitoIdentity.models0Mod.RoleMappingType & String] = js.native
    
    /* "Rules" */ val RULES: typings.awsSdkClientCognitoIdentity.models0Mod.RoleMappingType.RULES & String = js.native
    
    /* "Token" */ val TOKEN: typings.awsSdkClientCognitoIdentity.models0Mod.RoleMappingType.TOKEN & String = js.native
  }
  
  inline def RulesConfigurationTypeFilterSensitiveLog(obj: RulesConfigurationType): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RulesConfigurationTypeFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def SetIdentityPoolRolesInputFilterSensitiveLog(obj: SetIdentityPoolRolesInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("SetIdentityPoolRolesInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def SetPrincipalTagAttributeMapInputFilterSensitiveLog(obj: SetPrincipalTagAttributeMapInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("SetPrincipalTagAttributeMapInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def SetPrincipalTagAttributeMapResponseFilterSensitiveLog(obj: SetPrincipalTagAttributeMapResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("SetPrincipalTagAttributeMapResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def TagResourceInputFilterSensitiveLog(obj: TagResourceInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("TagResourceInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def TagResourceResponseFilterSensitiveLog(obj: TagResourceResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("TagResourceResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models", "TooManyRequestsException")
  @js.native
  open class TooManyRequestsException protected ()
    extends typings.awsSdkClientCognitoIdentity.models0Mod.TooManyRequestsException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeTooMan) = this()
  }
  
  inline def UnlinkDeveloperIdentityInputFilterSensitiveLog(obj: UnlinkDeveloperIdentityInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("UnlinkDeveloperIdentityInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def UnlinkIdentityInputFilterSensitiveLog(obj: UnlinkIdentityInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("UnlinkIdentityInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def UnprocessedIdentityIdFilterSensitiveLog(obj: UnprocessedIdentityId): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("UnprocessedIdentityIdFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def UntagResourceInputFilterSensitiveLog(obj: UntagResourceInput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("UntagResourceInputFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def UntagResourceResponseFilterSensitiveLog(obj: UntagResourceResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("UntagResourceResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
}
