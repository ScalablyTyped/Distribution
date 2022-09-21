package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARNString = String

type AccessKeyString = String

type AccountId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AuthenticatedRole
  - typings.awsSdk.awsSdkStrings.Deny_
  - java.lang.String
*/
type AmbiguousRoleResolutionType = _AmbiguousRoleResolutionType | String

type ClaimName = String

type ClaimValue = String

type ClassicFlow = Boolean

type CognitoIdentityProviderClientId = String

type CognitoIdentityProviderList = js.Array[CognitoIdentityProvider]

type CognitoIdentityProviderName = String

type CognitoIdentityProviderTokenCheck = Boolean

type DateType = js.Date

type DeveloperProviderName = String

type DeveloperUserIdentifier = String

type DeveloperUserIdentifierList = js.Array[DeveloperUserIdentifier]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AccessDenied
  - typings.awsSdk.awsSdkStrings.InternalServerError
  - java.lang.String
*/
type ErrorCode = _ErrorCode | String

type HideDisabled = Boolean

type IdentitiesList = js.Array[IdentityDescription]

type IdentityId = String

type IdentityIdList = js.Array[IdentityId]

type IdentityPoolId = String

type IdentityPoolName = String

type IdentityPoolTagsListType = js.Array[TagKeysType]

type IdentityPoolTagsType = StringDictionary[TagValueType]

type IdentityPoolUnauthenticated = Boolean

type IdentityPoolsList = js.Array[IdentityPoolShortDescription]

type IdentityProviderId = String

type IdentityProviderName = String

type IdentityProviderToken = String

type IdentityProviders = StringDictionary[IdentityProviderId]

type LoginsList = js.Array[IdentityProviderName]

type LoginsMap = StringDictionary[IdentityProviderToken]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Equals_
  - typings.awsSdk.awsSdkStrings.Contains_
  - typings.awsSdk.awsSdkStrings.StartsWith
  - typings.awsSdk.awsSdkStrings.NotEqual
  - java.lang.String
*/
type MappingRuleMatchType = _MappingRuleMatchType | String

type MappingRulesList = js.Array[MappingRule]

type OIDCProviderList = js.Array[ARNString]

type OIDCToken = String

type PaginationKey = String

type PrincipalTagID = String

type PrincipalTagValue = String

type PrincipalTags = StringDictionary[PrincipalTagValue]

type QueryLimit = Double

type RoleMappingMap = StringDictionary[RoleMapping]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Token_
  - typings.awsSdk.awsSdkStrings.Rules
  - java.lang.String
*/
type RoleMappingType = _RoleMappingType | String

type RoleType = String

type RolesMap = StringDictionary[ARNString]

type SAMLProviderList = js.Array[ARNString]

type SecretKeyString = String

type SessionTokenString = String

type TagKeysType = String

type TagValueType = String

type TokenDuration = Double

type UnprocessedIdentityIdList = js.Array[UnprocessedIdentityId]

type UseDefaults = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2014-06-30`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
