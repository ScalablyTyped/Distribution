package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.V1_0
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSAccountIdType = String

type AccessTokenValidityType = Double

type AccountTakeoverActionNotifyType = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BLOCK
  - typings.awsSdk.awsSdkStrings.MFA_IF_CONFIGURED
  - typings.awsSdk.awsSdkStrings.MFA_REQUIRED
  - typings.awsSdk.awsSdkStrings.NO_ACTION
  - java.lang.String
*/
type AccountTakeoverEventActionType = _AccountTakeoverEventActionType | String

type AdminCreateUserUnusedAccountValidityDaysType = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.AUDIT
  - typings.awsSdk.awsSdkStrings.ENFORCED
  - java.lang.String
*/
type AdvancedSecurityModeType = _AdvancedSecurityModeType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.phone_number_
  - typings.awsSdk.awsSdkStrings.email__
  - typings.awsSdk.awsSdkStrings.preferred_username_
  - java.lang.String
*/
type AliasAttributeType = _AliasAttributeType | String

type AliasAttributesListType = js.Array[AliasAttributeType]

type ArnType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.String_
  - typings.awsSdk.awsSdkStrings.Number_
  - typings.awsSdk.awsSdkStrings.DateTime_
  - typings.awsSdk.awsSdkStrings.Boolean_
  - java.lang.String
*/
type AttributeDataType = _AttributeDataType | String

type AttributeListType = js.Array[AttributeType]

type AttributeMappingKeyType = String

type AttributeMappingType = StringDictionary[StringType]

type AttributeNameListType = js.Array[AttributeNameType]

type AttributeNameType = String

type AttributeValueType = String

type AttributesRequireVerificationBeforeUpdateType = js.Array[VerifiedAttributeType]

type AuthEventsType = js.Array[AuthEventType]

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
type AuthFlowType = _AuthFlowType | String

type AuthParametersType = StringDictionary[StringType]

type AuthSessionValidityType = Double

type BlockedIPRangeListType = js.Array[StringType]

type BooleanType = Boolean

type CSSType = String

type CSSVersionType = String

type CallbackURLsListType = js.Array[RedirectUrlType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Password_
  - typings.awsSdk.awsSdkStrings.Mfa
  - java.lang.String
*/
type ChallengeName = _ChallengeName | String

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
type ChallengeNameType = _ChallengeNameType | String

type ChallengeParametersType = StringDictionary[StringType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Success_
  - typings.awsSdk.awsSdkStrings.Failure_
  - java.lang.String
*/
type ChallengeResponse = _ChallengeResponse | String

type ChallengeResponseListType = js.Array[ChallengeResponseType]

type ChallengeResponsesType = StringDictionary[StringType]

type ClientIdType = String

type ClientMetadataType = StringDictionary[StringType]

type ClientNameType = String

type ClientPermissionListType = js.Array[ClientPermissionType]

type ClientPermissionType = String

type ClientSecretType = String

type CodeDeliveryDetailsListType = js.Array[CodeDeliveryDetailsType]

type CompletionMessageType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BLOCK
  - typings.awsSdk.awsSdkStrings.NO_ACTION
  - java.lang.String
*/
type CompromisedCredentialsEventActionType = _CompromisedCredentialsEventActionType | String

type ConfirmationCodeType = String

type CustomAttributeNameType = String

type CustomAttributesListType = js.Array[SchemaAttributeType]

type CustomEmailSenderLambdaVersionType = V1_0 | String

type CustomSMSSenderLambdaVersionType = V1_0 | String

type DateType = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONFIRM_WITH_LINK
  - typings.awsSdk.awsSdkStrings.CONFIRM_WITH_CODE
  - java.lang.String
*/
type DefaultEmailOptionType = _DefaultEmailOptionType | String

type DeliveryMediumListType = js.Array[DeliveryMediumType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SMS
  - typings.awsSdk.awsSdkStrings.EMAIL
  - java.lang.String
*/
type DeliveryMediumType = _DeliveryMediumType | String

type DescriptionType = String

type DeviceKeyType = String

type DeviceListType = js.Array[DeviceType]

type DeviceNameType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.remembered
  - typings.awsSdk.awsSdkStrings.not_remembered
  - java.lang.String
*/
type DeviceRememberedStatusType = _DeviceRememberedStatusType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type DomainStatusType = _DomainStatusType | String

type DomainType = String

type DomainVersionType = String

type EmailAddressType = String

type EmailNotificationBodyType = String

type EmailNotificationSubjectType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COGNITO_DEFAULT
  - typings.awsSdk.awsSdkStrings.DEVELOPER
  - java.lang.String
*/
type EmailSendingAccountType = _EmailSendingAccountType | String

type EmailVerificationMessageByLinkType = String

type EmailVerificationMessageType = String

type EmailVerificationSubjectByLinkType = String

type EmailVerificationSubjectType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SIGN_IN
  - typings.awsSdk.awsSdkStrings.PASSWORD_CHANGE
  - typings.awsSdk.awsSdkStrings.SIGN_UP
  - java.lang.String
*/
type EventFilterType = _EventFilterType | String

type EventFiltersType = js.Array[EventFilterType]

type EventIdType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pass_
  - typings.awsSdk.awsSdkStrings.Fail_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - java.lang.String
*/
type EventResponseType = _EventResponseType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SignIn
  - typings.awsSdk.awsSdkStrings.SignUp
  - typings.awsSdk.awsSdkStrings.ForgotPassword
  - typings.awsSdk.awsSdkStrings.PasswordChange
  - typings.awsSdk.awsSdkStrings.ResendCode
  - java.lang.String
*/
type EventType = _EventType | String

type ExplicitAuthFlowsListType = js.Array[ExplicitAuthFlowsType]

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
type ExplicitAuthFlowsType = _ExplicitAuthFlowsType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Valid_
  - typings.awsSdk.awsSdkStrings.Invalid_
  - java.lang.String
*/
type FeedbackValueType = _FeedbackValueType | String

type ForceAliasCreation = Boolean

type GenerateSecret = Boolean

type GroupListType = js.Array[GroupType]

type GroupNameType = String

type HexStringType = String

type HttpHeaderList = js.Array[HttpHeader]

type IdTokenValidityType = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SAML
  - typings.awsSdk.awsSdkStrings.Facebook
  - typings.awsSdk.awsSdkStrings.Google
  - typings.awsSdk.awsSdkStrings.LoginWithAmazon
  - typings.awsSdk.awsSdkStrings.SignInWithApple
  - typings.awsSdk.awsSdkStrings.OIDC
  - java.lang.String
*/
type IdentityProviderTypeType = _IdentityProviderTypeType | String

type IdpIdentifierType = String

type IdpIdentifiersListType = js.Array[IdpIdentifierType]

type ImageFileType = Buffer | js.typedarray.Uint8Array | Blob | String

type ImageUrlType = String

type IntegerType = Double

type ListOfStringTypes = js.Array[StringType]

type ListProvidersLimitType = Double

type ListResourceServersLimitType = Double

type LogoutURLsListType = js.Array[RedirectUrlType]

type LongType = Double

type MFAOptionListType = js.Array[MFAOptionType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RESEND
  - typings.awsSdk.awsSdkStrings.SUPPRESS
  - java.lang.String
*/
type MessageActionType = _MessageActionType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.code_
  - typings.awsSdk.awsSdkStrings.implicit_
  - typings.awsSdk.awsSdkStrings.client_credentials_
  - java.lang.String
*/
type OAuthFlowType = _OAuthFlowType | String

type OAuthFlowsType = js.Array[OAuthFlowType]

type PaginationKey = String

type PaginationKeyType = String

type PasswordPolicyMinLengthType = Double

type PasswordType = String

type PoolQueryLimitType = Double

type PreSignedUrlType = String

type PrecedenceType = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LEGACY
  - typings.awsSdk.awsSdkStrings.ENABLED
  - java.lang.String
*/
type PreventUserExistenceErrorTypes = _PreventUserExistenceErrorTypes | String

type PriorityType = Double

type ProviderDetailsType = StringDictionary[StringType]

type ProviderNameType = String

type ProviderNameTypeV1 = String

type ProvidersListType = js.Array[ProviderDescription]

type QueryLimit = Double

type QueryLimitType = Double

type RecoveryMechanismsType = js.Array[RecoveryOptionType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.verified_email
  - typings.awsSdk.awsSdkStrings.verified_phone_number
  - typings.awsSdk.awsSdkStrings.admin_only
  - java.lang.String
*/
type RecoveryOptionNameType = _RecoveryOptionNameType | String

type RedirectUrlType = String

type RefreshTokenValidityType = Double

type RegionCodeType = String

type ResourceServerIdentifierType = String

type ResourceServerNameType = String

type ResourceServerScopeDescriptionType = String

type ResourceServerScopeListType = js.Array[ResourceServerScopeType]

type ResourceServerScopeNameType = String

type ResourceServersListType = js.Array[ResourceServerType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NoRisk
  - typings.awsSdk.awsSdkStrings.AccountTakeover
  - typings.awsSdk.awsSdkStrings.Block_
  - java.lang.String
*/
type RiskDecisionType = _RiskDecisionType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Low_
  - typings.awsSdk.awsSdkStrings.Medium_
  - typings.awsSdk.awsSdkStrings.High_
  - java.lang.String
*/
type RiskLevelType = _RiskLevelType | String

type S3BucketType = String

type SESConfigurationSet = String

type SchemaAttributesListType = js.Array[SchemaAttributeType]

type ScopeListType = js.Array[ScopeType]

type ScopeType = String

type SearchPaginationTokenType = String

type SearchedAttributeNamesListType = js.Array[AttributeNameType]

type SecretCodeType = String

type SecretHashType = String

type SessionType = String

type SkippedIPRangeListType = js.Array[StringType]

type SmsVerificationMessageType = String

type SoftwareTokenMFAUserCodeType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type StatusType = _StatusType | String

type StringType = String

type SupportedIdentityProvidersListType = js.Array[ProviderNameType]

type TagKeysType = String

type TagValueType = String

type TemporaryPasswordValidityDaysType = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.seconds__
  - typings.awsSdk.awsSdkStrings.minutes
  - typings.awsSdk.awsSdkStrings.hours__
  - typings.awsSdk.awsSdkStrings.days__
  - java.lang.String
*/
type TimeUnitsType = _TimeUnitsType | String

type TokenModelType = String

type UserFilterType = String

type UserImportJobIdType = String

type UserImportJobNameType = String

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
type UserImportJobStatusType = _UserImportJobStatusType | String

type UserImportJobsListType = js.Array[UserImportJobType]

type UserMFASettingListType = js.Array[StringType]

type UserPoolClientListType = js.Array[UserPoolClientDescription]

type UserPoolIdType = String

type UserPoolListType = js.Array[UserPoolDescriptionType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.ON
  - typings.awsSdk.awsSdkStrings.OPTIONAL
  - java.lang.String
*/
type UserPoolMfaType = _UserPoolMfaType | String

type UserPoolNameType = String

type UserPoolTagsListType = js.Array[TagKeysType]

type UserPoolTagsType = StringDictionary[TagValueType]

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
type UserStatusType = _UserStatusType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.phone_number_
  - typings.awsSdk.awsSdkStrings.email__
  - java.lang.String
*/
type UsernameAttributeType = _UsernameAttributeType | String

type UsernameAttributesListType = js.Array[UsernameAttributeType]

type UsernameType = String

type UsersListType = js.Array[UserType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.phone_number_
  - typings.awsSdk.awsSdkStrings.email__
  - java.lang.String
*/
type VerifiedAttributeType = _VerifiedAttributeType | String

type VerifiedAttributesListType = js.Array[VerifiedAttributeType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type VerifySoftwareTokenResponseType = _VerifySoftwareTokenResponseType | String

type WrappedBooleanType = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-04-18`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
