package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSAccountIdType = java.lang.String

type AccessTokenValidityType = scala.Double

type AccountTakeoverActionNotifyType = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BLOCK
  - typings.awsSdk.awsSdkStrings.MFA_IF_CONFIGURED
  - typings.awsSdk.awsSdkStrings.MFA_REQUIRED
  - typings.awsSdk.awsSdkStrings.NO_ACTION
  - java.lang.String
*/
type AccountTakeoverEventActionType = typings.awsSdk.cognitoidentityserviceproviderMod._AccountTakeoverEventActionType | java.lang.String

type AdminCreateUserUnusedAccountValidityDaysType = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.AUDIT
  - typings.awsSdk.awsSdkStrings.ENFORCED
  - java.lang.String
*/
type AdvancedSecurityModeType = typings.awsSdk.cognitoidentityserviceproviderMod._AdvancedSecurityModeType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.phone_number
  - typings.awsSdk.awsSdkStrings.email__
  - typings.awsSdk.awsSdkStrings.preferred_username
  - java.lang.String
*/
type AliasAttributeType = typings.awsSdk.cognitoidentityserviceproviderMod._AliasAttributeType | java.lang.String

type AliasAttributesListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.AliasAttributeType]

type ArnType = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.String_
  - typings.awsSdk.awsSdkStrings.Number_
  - typings.awsSdk.awsSdkStrings.DateTime_
  - typings.awsSdk.awsSdkStrings.Boolean_
  - java.lang.String
*/
type AttributeDataType = typings.awsSdk.cognitoidentityserviceproviderMod._AttributeDataType | java.lang.String

type AttributeListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.AttributeType]

type AttributeMappingKeyType = java.lang.String

type AttributeMappingType = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cognitoidentityserviceproviderMod.StringType]

type AttributeNameListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.AttributeNameType]

type AttributeNameType = java.lang.String

type AttributeValueType = java.lang.String

type AuthEventsType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.AuthEventType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER_SRP_AUTH
  - typings.awsSdk.awsSdkStrings.REFRESH_TOKEN_AUTH
  - typings.awsSdk.awsSdkStrings.REFRESH_TOKEN
  - typings.awsSdk.awsSdkStrings.CUSTOM_AUTH
  - typings.awsSdk.awsSdkStrings.ADMIN_NO_SRP_AUTH
  - typings.awsSdk.awsSdkStrings.USER_PASSWORD_AUTH
  - typings.awsSdk.awsSdkStrings.ADMIN_USER_PASSWORD_AUTH
  - java.lang.String
*/
type AuthFlowType = typings.awsSdk.cognitoidentityserviceproviderMod._AuthFlowType | java.lang.String

type AuthParametersType = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cognitoidentityserviceproviderMod.StringType]

type BlockedIPRangeListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.StringType]

type BooleanType = scala.Boolean

type CSSType = java.lang.String

type CSSVersionType = java.lang.String

type CallbackURLsListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.RedirectUrlType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Password_
  - typings.awsSdk.awsSdkStrings.Mfa
  - java.lang.String
*/
type ChallengeName = typings.awsSdk.cognitoidentityserviceproviderMod._ChallengeName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SMS_MFA
  - typings.awsSdk.awsSdkStrings.SOFTWARE_TOKEN_MFA
  - typings.awsSdk.awsSdkStrings.SELECT_MFA_TYPE
  - typings.awsSdk.awsSdkStrings.MFA_SETUP
  - typings.awsSdk.awsSdkStrings.PASSWORD_VERIFIER
  - typings.awsSdk.awsSdkStrings.CUSTOM_CHALLENGE
  - typings.awsSdk.awsSdkStrings.DEVICE_SRP_AUTH
  - typings.awsSdk.awsSdkStrings.DEVICE_PASSWORD_VERIFIER
  - typings.awsSdk.awsSdkStrings.ADMIN_NO_SRP_AUTH
  - typings.awsSdk.awsSdkStrings.NEW_PASSWORD_REQUIRED
  - java.lang.String
*/
type ChallengeNameType = typings.awsSdk.cognitoidentityserviceproviderMod._ChallengeNameType | java.lang.String

type ChallengeParametersType = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cognitoidentityserviceproviderMod.StringType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Success_
  - typings.awsSdk.awsSdkStrings.Failure_
  - java.lang.String
*/
type ChallengeResponse = typings.awsSdk.cognitoidentityserviceproviderMod._ChallengeResponse | java.lang.String

type ChallengeResponseListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.ChallengeResponseType]

type ChallengeResponsesType = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cognitoidentityserviceproviderMod.StringType]

type ClientIdType = java.lang.String

type ClientMetadataType = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cognitoidentityserviceproviderMod.StringType]

type ClientNameType = java.lang.String

type ClientPermissionListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.ClientPermissionType]

type ClientPermissionType = java.lang.String

type ClientSecretType = java.lang.String

type CodeDeliveryDetailsListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.CodeDeliveryDetailsType]

type CompletionMessageType = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BLOCK
  - typings.awsSdk.awsSdkStrings.NO_ACTION
  - java.lang.String
*/
type CompromisedCredentialsEventActionType = typings.awsSdk.cognitoidentityserviceproviderMod._CompromisedCredentialsEventActionType | java.lang.String

type ConfirmationCodeType = java.lang.String

type CustomAttributeNameType = java.lang.String

type CustomAttributesListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.SchemaAttributeType]

type DateType = typings.std.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONFIRM_WITH_LINK
  - typings.awsSdk.awsSdkStrings.CONFIRM_WITH_CODE
  - java.lang.String
*/
type DefaultEmailOptionType = typings.awsSdk.cognitoidentityserviceproviderMod._DefaultEmailOptionType | java.lang.String

type DeliveryMediumListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.DeliveryMediumType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SMS
  - typings.awsSdk.awsSdkStrings.EMAIL
  - java.lang.String
*/
type DeliveryMediumType = typings.awsSdk.cognitoidentityserviceproviderMod._DeliveryMediumType | java.lang.String

type DescriptionType = java.lang.String

type DeviceKeyType = java.lang.String

type DeviceListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.DeviceType]

type DeviceNameType = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.remembered
  - typings.awsSdk.awsSdkStrings.not_remembered
  - java.lang.String
*/
type DeviceRememberedStatusType = typings.awsSdk.cognitoidentityserviceproviderMod._DeviceRememberedStatusType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type DomainStatusType = typings.awsSdk.cognitoidentityserviceproviderMod._DomainStatusType | java.lang.String

type DomainType = java.lang.String

type DomainVersionType = java.lang.String

type EmailAddressType = java.lang.String

type EmailNotificationBodyType = java.lang.String

type EmailNotificationSubjectType = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COGNITO_DEFAULT
  - typings.awsSdk.awsSdkStrings.DEVELOPER
  - java.lang.String
*/
type EmailSendingAccountType = typings.awsSdk.cognitoidentityserviceproviderMod._EmailSendingAccountType | java.lang.String

type EmailVerificationMessageByLinkType = java.lang.String

type EmailVerificationMessageType = java.lang.String

type EmailVerificationSubjectByLinkType = java.lang.String

type EmailVerificationSubjectType = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SIGN_IN
  - typings.awsSdk.awsSdkStrings.PASSWORD_CHANGE
  - typings.awsSdk.awsSdkStrings.SIGN_UP
  - java.lang.String
*/
type EventFilterType = typings.awsSdk.cognitoidentityserviceproviderMod._EventFilterType | java.lang.String

type EventFiltersType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.EventFilterType]

type EventIdType = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Success_
  - typings.awsSdk.awsSdkStrings.Failure_
  - java.lang.String
*/
type EventResponseType = typings.awsSdk.cognitoidentityserviceproviderMod._EventResponseType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SignIn
  - typings.awsSdk.awsSdkStrings.SignUp
  - typings.awsSdk.awsSdkStrings.ForgotPassword
  - java.lang.String
*/
type EventType = typings.awsSdk.cognitoidentityserviceproviderMod._EventType | java.lang.String

type ExplicitAuthFlowsListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.ExplicitAuthFlowsType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ADMIN_NO_SRP_AUTH
  - typings.awsSdk.awsSdkStrings.CUSTOM_AUTH_FLOW_ONLY
  - typings.awsSdk.awsSdkStrings.USER_PASSWORD_AUTH
  - typings.awsSdk.awsSdkStrings.ALLOW_ADMIN_USER_PASSWORD_AUTH
  - typings.awsSdk.awsSdkStrings.ALLOW_CUSTOM_AUTH
  - typings.awsSdk.awsSdkStrings.ALLOW_USER_PASSWORD_AUTH
  - typings.awsSdk.awsSdkStrings.ALLOW_USER_SRP_AUTH
  - typings.awsSdk.awsSdkStrings.ALLOW_REFRESH_TOKEN_AUTH
  - java.lang.String
*/
type ExplicitAuthFlowsType = typings.awsSdk.cognitoidentityserviceproviderMod._ExplicitAuthFlowsType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Valid_
  - typings.awsSdk.awsSdkStrings.Invalid_
  - java.lang.String
*/
type FeedbackValueType = typings.awsSdk.cognitoidentityserviceproviderMod._FeedbackValueType | java.lang.String

type ForceAliasCreation = scala.Boolean

type GenerateSecret = scala.Boolean

type GroupListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.GroupType]

type GroupNameType = java.lang.String

type HexStringType = java.lang.String

type HttpHeaderList = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.HttpHeader]

type IdTokenValidityType = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SAML
  - typings.awsSdk.awsSdkStrings.Facebook
  - typings.awsSdk.awsSdkStrings.Google
  - typings.awsSdk.awsSdkStrings.LoginWithAmazon
  - typings.awsSdk.awsSdkStrings.SignInWithApple
  - typings.awsSdk.awsSdkStrings.OIDC
  - java.lang.String
*/
type IdentityProviderTypeType = typings.awsSdk.cognitoidentityserviceproviderMod._IdentityProviderTypeType | java.lang.String

type IdpIdentifierType = java.lang.String

type IdpIdentifiersListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.IdpIdentifierType]

type ImageFileType = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.cognitoidentityserviceproviderMod.Blob | java.lang.String

type ImageUrlType = java.lang.String

type IntegerType = scala.Double

type ListOfStringTypes = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.StringType]

type ListProvidersLimitType = scala.Double

type ListResourceServersLimitType = scala.Double

type LogoutURLsListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.RedirectUrlType]

type LongType = scala.Double

type MFAOptionListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.MFAOptionType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RESEND
  - typings.awsSdk.awsSdkStrings.SUPPRESS
  - java.lang.String
*/
type MessageActionType = typings.awsSdk.cognitoidentityserviceproviderMod._MessageActionType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.code
  - typings.awsSdk.awsSdkStrings.`implicit`
  - typings.awsSdk.awsSdkStrings.client_credentials
  - java.lang.String
*/
type OAuthFlowType = typings.awsSdk.cognitoidentityserviceproviderMod._OAuthFlowType | java.lang.String

type OAuthFlowsType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.OAuthFlowType]

type PaginationKey = java.lang.String

type PaginationKeyType = java.lang.String

type PasswordPolicyMinLengthType = scala.Double

type PasswordType = java.lang.String

type PoolQueryLimitType = scala.Double

type PreSignedUrlType = java.lang.String

type PrecedenceType = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LEGACY
  - typings.awsSdk.awsSdkStrings.ENABLED
  - java.lang.String
*/
type PreventUserExistenceErrorTypes = typings.awsSdk.cognitoidentityserviceproviderMod._PreventUserExistenceErrorTypes | java.lang.String

type PriorityType = scala.Double

type ProviderDetailsType = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cognitoidentityserviceproviderMod.StringType]

type ProviderNameType = java.lang.String

type ProviderNameTypeV1 = java.lang.String

type ProvidersListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.ProviderDescription]

type QueryLimit = scala.Double

type QueryLimitType = scala.Double

type RecoveryMechanismsType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.RecoveryOptionType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.verified_email
  - typings.awsSdk.awsSdkStrings.verified_phone_number
  - typings.awsSdk.awsSdkStrings.admin_only
  - java.lang.String
*/
type RecoveryOptionNameType = typings.awsSdk.cognitoidentityserviceproviderMod._RecoveryOptionNameType | java.lang.String

type RedirectUrlType = java.lang.String

type RefreshTokenValidityType = scala.Double

type ResourceServerIdentifierType = java.lang.String

type ResourceServerNameType = java.lang.String

type ResourceServerScopeDescriptionType = java.lang.String

type ResourceServerScopeListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.ResourceServerScopeType]

type ResourceServerScopeNameType = java.lang.String

type ResourceServersListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.ResourceServerType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NoRisk
  - typings.awsSdk.awsSdkStrings.AccountTakeover
  - typings.awsSdk.awsSdkStrings.Block_
  - java.lang.String
*/
type RiskDecisionType = typings.awsSdk.cognitoidentityserviceproviderMod._RiskDecisionType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Low_
  - typings.awsSdk.awsSdkStrings.Medium_
  - typings.awsSdk.awsSdkStrings.High_
  - java.lang.String
*/
type RiskLevelType = typings.awsSdk.cognitoidentityserviceproviderMod._RiskLevelType | java.lang.String

type S3BucketType = java.lang.String

type SESConfigurationSet = java.lang.String

type SchemaAttributesListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.SchemaAttributeType]

type ScopeListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.ScopeType]

type ScopeType = java.lang.String

type SearchPaginationTokenType = java.lang.String

type SearchedAttributeNamesListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.AttributeNameType]

type SecretCodeType = java.lang.String

type SecretHashType = java.lang.String

type SessionType = java.lang.String

type SkippedIPRangeListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.StringType]

type SmsVerificationMessageType = java.lang.String

type SoftwareTokenMFAUserCodeType = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type StatusType = typings.awsSdk.cognitoidentityserviceproviderMod._StatusType | java.lang.String

type StringType = java.lang.String

type SupportedIdentityProvidersListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.ProviderNameType]

type TagKeysType = java.lang.String

type TagValueType = java.lang.String

type TemporaryPasswordValidityDaysType = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.seconds__
  - typings.awsSdk.awsSdkStrings.minutes
  - typings.awsSdk.awsSdkStrings.hours_
  - typings.awsSdk.awsSdkStrings.days_
  - java.lang.String
*/
type TimeUnitsType = typings.awsSdk.cognitoidentityserviceproviderMod._TimeUnitsType | java.lang.String

type TokenModelType = java.lang.String

type UserFilterType = java.lang.String

type UserImportJobIdType = java.lang.String

type UserImportJobNameType = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Created_
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Stopping_
  - typings.awsSdk.awsSdkStrings.Expired_
  - typings.awsSdk.awsSdkStrings.Stopped_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Succeeded_
  - java.lang.String
*/
type UserImportJobStatusType = typings.awsSdk.cognitoidentityserviceproviderMod._UserImportJobStatusType | java.lang.String

type UserImportJobsListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.UserImportJobType]

type UserMFASettingListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.StringType]

type UserPoolClientListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.UserPoolClientDescription]

type UserPoolIdType = java.lang.String

type UserPoolListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.UserPoolDescriptionType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.ON
  - typings.awsSdk.awsSdkStrings.OPTIONAL
  - java.lang.String
*/
type UserPoolMfaType = typings.awsSdk.cognitoidentityserviceproviderMod._UserPoolMfaType | java.lang.String

type UserPoolNameType = java.lang.String

type UserPoolTagsListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.TagKeysType]

type UserPoolTagsType = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cognitoidentityserviceproviderMod.TagValueType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNCONFIRMED
  - typings.awsSdk.awsSdkStrings.CONFIRMED
  - typings.awsSdk.awsSdkStrings.ARCHIVED
  - typings.awsSdk.awsSdkStrings.COMPROMISED
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - typings.awsSdk.awsSdkStrings.RESET_REQUIRED
  - typings.awsSdk.awsSdkStrings.FORCE_CHANGE_PASSWORD
  - java.lang.String
*/
type UserStatusType = typings.awsSdk.cognitoidentityserviceproviderMod._UserStatusType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.phone_number
  - typings.awsSdk.awsSdkStrings.email__
  - java.lang.String
*/
type UsernameAttributeType = typings.awsSdk.cognitoidentityserviceproviderMod._UsernameAttributeType | java.lang.String

type UsernameAttributesListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.UsernameAttributeType]

type UsernameType = java.lang.String

type UsersListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.UserType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.phone_number
  - typings.awsSdk.awsSdkStrings.email__
  - java.lang.String
*/
type VerifiedAttributeType = typings.awsSdk.cognitoidentityserviceproviderMod._VerifiedAttributeType | java.lang.String

type VerifiedAttributesListType = js.Array[typings.awsSdk.cognitoidentityserviceproviderMod.VerifiedAttributeType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type VerifySoftwareTokenResponseType = typings.awsSdk.cognitoidentityserviceproviderMod._VerifySoftwareTokenResponseType | java.lang.String

type WrappedBooleanType = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-04-18`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.cognitoidentityserviceproviderMod._apiVersion | java.lang.String
