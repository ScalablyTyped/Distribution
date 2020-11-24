package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cognitoidentityMod {
  
  type ARNString = java.lang.String
  
  type AccessKeyString = java.lang.String
  
  type AccountId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AuthenticatedRole
    - typings.awsSdk.awsSdkStrings.Deny_
    - java.lang.String
  */
  type AmbiguousRoleResolutionType = typings.awsSdk.cognitoidentityMod._AmbiguousRoleResolutionType | java.lang.String
  
  type ClaimName = java.lang.String
  
  type ClaimValue = java.lang.String
  
  type ClassicFlow = scala.Boolean
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.cognitoidentityMod.ClientApiVersions
  
  type CognitoIdentityProviderClientId = java.lang.String
  
  type CognitoIdentityProviderList = js.Array[typings.awsSdk.cognitoidentityMod.CognitoIdentityProvider]
  
  type CognitoIdentityProviderName = java.lang.String
  
  type CognitoIdentityProviderTokenCheck = scala.Boolean
  
  type DateType = typings.std.Date
  
  type DeveloperProviderName = java.lang.String
  
  type DeveloperUserIdentifier = java.lang.String
  
  type DeveloperUserIdentifierList = js.Array[typings.awsSdk.cognitoidentityMod.DeveloperUserIdentifier]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AccessDenied
    - typings.awsSdk.awsSdkStrings.InternalServerError
    - java.lang.String
  */
  type ErrorCode = typings.awsSdk.cognitoidentityMod._ErrorCode | java.lang.String
  
  type HideDisabled = scala.Boolean
  
  type IdentitiesList = js.Array[typings.awsSdk.cognitoidentityMod.IdentityDescription]
  
  type IdentityId = java.lang.String
  
  type IdentityIdList = js.Array[typings.awsSdk.cognitoidentityMod.IdentityId]
  
  type IdentityPoolId = java.lang.String
  
  type IdentityPoolName = java.lang.String
  
  type IdentityPoolTagsListType = js.Array[typings.awsSdk.cognitoidentityMod.TagKeysType]
  
  type IdentityPoolTagsType = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cognitoidentityMod.TagValueType]
  
  type IdentityPoolUnauthenticated = scala.Boolean
  
  type IdentityPoolsList = js.Array[typings.awsSdk.cognitoidentityMod.IdentityPoolShortDescription]
  
  type IdentityProviderId = java.lang.String
  
  type IdentityProviderName = java.lang.String
  
  type IdentityProviderToken = java.lang.String
  
  type IdentityProviders = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cognitoidentityMod.IdentityProviderId]
  
  type LoginsList = js.Array[typings.awsSdk.cognitoidentityMod.IdentityProviderName]
  
  type LoginsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cognitoidentityMod.IdentityProviderToken]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Equals_
    - typings.awsSdk.awsSdkStrings.Contains_
    - typings.awsSdk.awsSdkStrings.StartsWith
    - typings.awsSdk.awsSdkStrings.NotEqual
    - java.lang.String
  */
  type MappingRuleMatchType = typings.awsSdk.cognitoidentityMod._MappingRuleMatchType | java.lang.String
  
  type MappingRulesList = js.Array[typings.awsSdk.cognitoidentityMod.MappingRule]
  
  type OIDCProviderList = js.Array[typings.awsSdk.cognitoidentityMod.ARNString]
  
  type OIDCToken = java.lang.String
  
  type PaginationKey = java.lang.String
  
  type QueryLimit = scala.Double
  
  type RoleMappingMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cognitoidentityMod.RoleMapping]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Token_
    - typings.awsSdk.awsSdkStrings.Rules
    - java.lang.String
  */
  type RoleMappingType = typings.awsSdk.cognitoidentityMod._RoleMappingType | java.lang.String
  
  type RoleType = java.lang.String
  
  type RolesMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cognitoidentityMod.ARNString]
  
  type SAMLProviderList = js.Array[typings.awsSdk.cognitoidentityMod.ARNString]
  
  type SecretKeyString = java.lang.String
  
  type SessionTokenString = java.lang.String
  
  type TagKeysType = java.lang.String
  
  type TagValueType = java.lang.String
  
  type TokenDuration = scala.Double
  
  type UnprocessedIdentityIdList = js.Array[typings.awsSdk.cognitoidentityMod.UnprocessedIdentityId]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2014-06-30`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.cognitoidentityMod._apiVersion | java.lang.String
}
