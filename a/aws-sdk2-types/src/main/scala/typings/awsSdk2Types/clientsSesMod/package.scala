package typings.awsSdk2Types.clientsSesMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk2Types.awsSdk2TypesStrings.RuleSet
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Address = String

type AddressList = js.Array[Address]

type AmazonResourceName = String

type ArrivalDate = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.UseDefaultValue
  - typings.awsSdk2Types.awsSdk2TypesStrings.RejectMessage
  - java.lang.String
*/
type BehaviorOnMXFailure = _BehaviorOnMXFailure | String

type BounceMessage = String

type BounceSmtpReplyCode = String

type BounceStatusCode = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.DoesNotExist
  - typings.awsSdk2Types.awsSdk2TypesStrings.MessageTooLarge
  - typings.awsSdk2Types.awsSdk2TypesStrings.ExceededQuota
  - typings.awsSdk2Types.awsSdk2TypesStrings.ContentRejected
  - typings.awsSdk2Types.awsSdk2TypesStrings.Undefined
  - typings.awsSdk2Types.awsSdk2TypesStrings.TemporaryFailure
  - java.lang.String
*/
type BounceType = _BounceType | String

type BouncedRecipientInfoList = js.Array[BouncedRecipientInfo]

type BulkEmailDestinationList = js.Array[BulkEmailDestination]

type BulkEmailDestinationStatusList = js.Array[BulkEmailDestinationStatus]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Success_
  - typings.awsSdk2Types.awsSdk2TypesStrings.MessageRejected
  - typings.awsSdk2Types.awsSdk2TypesStrings.MailFromDomainNotVerified
  - typings.awsSdk2Types.awsSdk2TypesStrings.ConfigurationSetDoesNotExist
  - typings.awsSdk2Types.awsSdk2TypesStrings.TemplateDoesNotExist
  - typings.awsSdk2Types.awsSdk2TypesStrings.AccountSuspended
  - typings.awsSdk2Types.awsSdk2TypesStrings.AccountThrottled
  - typings.awsSdk2Types.awsSdk2TypesStrings.AccountDailyQuotaExceeded
  - typings.awsSdk2Types.awsSdk2TypesStrings.InvalidSendingPoolName
  - typings.awsSdk2Types.awsSdk2TypesStrings.AccountSendingPaused
  - typings.awsSdk2Types.awsSdk2TypesStrings.ConfigurationSetSendingPaused
  - typings.awsSdk2Types.awsSdk2TypesStrings.InvalidParameterValue
  - typings.awsSdk2Types.awsSdk2TypesStrings.TransientFailure
  - typings.awsSdk2Types.awsSdk2TypesStrings.Failed_
  - java.lang.String
*/
type BulkEmailStatus = _BulkEmailStatus | String

type Charset = String

type Cidr = String

type CloudWatchDimensionConfigurations = js.Array[CloudWatchDimensionConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.eventDestinations
  - typings.awsSdk2Types.awsSdk2TypesStrings.trackingOptions
  - typings.awsSdk2Types.awsSdk2TypesStrings.deliveryOptions
  - typings.awsSdk2Types.awsSdk2TypesStrings.reputationOptions
  - java.lang.String
*/
type ConfigurationSetAttribute = _ConfigurationSetAttribute | String

type ConfigurationSetAttributeList = js.Array[ConfigurationSetAttribute]

type ConfigurationSetName = String

type ConfigurationSets = js.Array[ConfigurationSet]

type Counter = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Pending_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Success_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Failed_
  - typings.awsSdk2Types.awsSdk2TypesStrings.TemporaryFailure
  - java.lang.String
*/
type CustomMailFromStatus = _CustomMailFromStatus | String

type CustomRedirectDomain = String

type CustomVerificationEmailTemplates = js.Array[CustomVerificationEmailTemplate]

type DefaultDimensionValue = String

type DiagnosticCode = String

type DimensionName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.messageTag
  - typings.awsSdk2Types.awsSdk2TypesStrings.emailHeader
  - typings.awsSdk2Types.awsSdk2TypesStrings.linkTag
  - java.lang.String
*/
type DimensionValueSource = _DimensionValueSource | String

type DkimAttributes = StringDictionary[IdentityDkimAttributes]

type Domain = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.failed__
  - typings.awsSdk2Types.awsSdk2TypesStrings.delayed_
  - typings.awsSdk2Types.awsSdk2TypesStrings.delivered
  - typings.awsSdk2Types.awsSdk2TypesStrings.relayed
  - typings.awsSdk2Types.awsSdk2TypesStrings.expanded
  - java.lang.String
*/
type DsnAction = _DsnAction | String

type DsnStatus = String

type Enabled = Boolean

type Error = String

type EventDestinationName = String

type EventDestinations = js.Array[EventDestination]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.send
  - typings.awsSdk2Types.awsSdk2TypesStrings.reject_
  - typings.awsSdk2Types.awsSdk2TypesStrings.bounce_
  - typings.awsSdk2Types.awsSdk2TypesStrings.complaint_
  - typings.awsSdk2Types.awsSdk2TypesStrings.delivery_
  - typings.awsSdk2Types.awsSdk2TypesStrings.open__
  - typings.awsSdk2Types.awsSdk2TypesStrings.click
  - typings.awsSdk2Types.awsSdk2TypesStrings.renderingFailure
  - java.lang.String
*/
type EventType = _EventType | String

type EventTypes = js.Array[EventType]

type Explanation = String

type ExtensionFieldList = js.Array[ExtensionField]

type ExtensionFieldName = String

type ExtensionFieldValue = String

type FailureRedirectionURL = String

type FromAddress = String

type HeaderName = String

type HeaderValue = String

type HtmlPart = String

type Identity = String

type IdentityList = js.Array[Identity]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.EmailAddress
  - typings.awsSdk2Types.awsSdk2TypesStrings.Domain
  - java.lang.String
*/
type IdentityType = _IdentityType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Event
  - typings.awsSdk2Types.awsSdk2TypesStrings.RequestResponse
  - java.lang.String
*/
type InvocationType = _InvocationType | String

type LastAttemptDate = js.Date

type LastFreshStart = js.Date

type MailFromDomainAttributes = StringDictionary[IdentityMailFromDomainAttributes]

type MailFromDomainName = String

type Max24HourSend = Double

type MaxItems = Double

type MaxResults = Double

type MaxSendRate = Double

type MessageData = String

type MessageId = String

type MessageTagList = js.Array[MessageTag]

type MessageTagName = String

type MessageTagValue = String

type NextToken = String

type NotificationAttributes = StringDictionary[IdentityNotificationAttributes]

type NotificationTopic = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Bounce
  - typings.awsSdk2Types.awsSdk2TypesStrings.Complaint
  - typings.awsSdk2Types.awsSdk2TypesStrings.Delivery
  - java.lang.String
*/
type NotificationType = _NotificationType | String

type Policy = String

type PolicyMap = StringDictionary[Policy]

type PolicyName = String

type PolicyNameList = js.Array[PolicyName]

type RawMessageData = Buffer | js.typedarray.Uint8Array | Blob | String

type ReceiptActionsList = js.Array[ReceiptAction]

type ReceiptFilterList = js.Array[ReceiptFilter]

type ReceiptFilterName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Block_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Allow
  - java.lang.String
*/
type ReceiptFilterPolicy = _ReceiptFilterPolicy | String

type ReceiptRuleName = String

type ReceiptRuleNamesList = js.Array[ReceiptRuleName]

type ReceiptRuleSetName = String

type ReceiptRuleSetsLists = js.Array[ReceiptRuleSetMetadata]

type ReceiptRulesList = js.Array[ReceiptRule]

type Recipient = String

type RecipientsList = js.Array[Recipient]

type RemoteMta = String

type RenderedTemplate = String

type ReportingMta = String

type S3BucketName = String

type S3KeyPrefix = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.`UTF-8`
  - typings.awsSdk2Types.awsSdk2TypesStrings.Base64
  - java.lang.String
*/
type SNSActionEncoding = _SNSActionEncoding | String

type SendDataPointList = js.Array[SendDataPoint]

type SentLast24Hours = Double

type StopScope = RuleSet | String

type Subject = String

type SubjectPart = String

type SuccessRedirectionURL = String

type TemplateContent = String

type TemplateData = String

type TemplateMetadataList = js.Array[TemplateMetadata]

type TemplateName = String

type TextPart = String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Require
  - typings.awsSdk2Types.awsSdk2TypesStrings.Optional
  - java.lang.String
*/
type TlsPolicy = _TlsPolicy | String

type VerificationAttributes = StringDictionary[IdentityVerificationAttributes]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Pending_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Success_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Failed_
  - typings.awsSdk2Types.awsSdk2TypesStrings.TemporaryFailure
  - typings.awsSdk2Types.awsSdk2TypesStrings.NotStarted
  - java.lang.String
*/
type VerificationStatus = _VerificationStatus | String

type VerificationToken = String

type VerificationTokenList = js.Array[VerificationToken]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.`2010-12-01`
  - typings.awsSdk2Types.awsSdk2TypesStrings.latest
  - java.lang.String
*/
type apiVersion = _apiVersion | String
