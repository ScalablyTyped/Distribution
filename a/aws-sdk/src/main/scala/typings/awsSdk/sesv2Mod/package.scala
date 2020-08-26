package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sesv2Mod {
  type AdditionalContactEmailAddress = java.lang.String
  type AdditionalContactEmailAddresses = js.Array[typings.awsSdk.sesv2Mod.AdditionalContactEmailAddress]
  type AmazonResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.USE_DEFAULT_VALUE
    - typings.awsSdk.awsSdkStrings.REJECT_MESSAGE
    - java.lang.String
  */
  type BehaviorOnMxFailure = typings.awsSdk.sesv2Mod._BehaviorOnMxFailure | java.lang.String
  type BlacklistEntries = js.Array[typings.awsSdk.sesv2Mod.BlacklistEntry]
  type BlacklistItemName = java.lang.String
  type BlacklistItemNames = js.Array[typings.awsSdk.sesv2Mod.BlacklistItemName]
  type BlacklistReport = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sesv2Mod.BlacklistEntries]
  type BlacklistingDescription = java.lang.String
  type BulkEmailEntryList = js.Array[typings.awsSdk.sesv2Mod.BulkEmailEntry]
  type BulkEmailEntryResultList = js.Array[typings.awsSdk.sesv2Mod.BulkEmailEntryResult]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - typings.awsSdk.awsSdkStrings.MESSAGE_REJECTED
    - typings.awsSdk.awsSdkStrings.MAIL_FROM_DOMAIN_NOT_VERIFIED
    - typings.awsSdk.awsSdkStrings.CONFIGURATION_SET_NOT_FOUND
    - typings.awsSdk.awsSdkStrings.TEMPLATE_NOT_FOUND
    - typings.awsSdk.awsSdkStrings.ACCOUNT_SUSPENDED
    - typings.awsSdk.awsSdkStrings.ACCOUNT_THROTTLED
    - typings.awsSdk.awsSdkStrings.ACCOUNT_DAILY_QUOTA_EXCEEDED
    - typings.awsSdk.awsSdkStrings.INVALID_SENDING_POOL_NAME
    - typings.awsSdk.awsSdkStrings.ACCOUNT_SENDING_PAUSED
    - typings.awsSdk.awsSdkStrings.CONFIGURATION_SET_SENDING_PAUSED
    - typings.awsSdk.awsSdkStrings.INVALID_PARAMETER
    - typings.awsSdk.awsSdkStrings.TRANSIENT_FAILURE
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type BulkEmailStatus = typings.awsSdk.sesv2Mod._BulkEmailStatus | java.lang.String
  type CampaignId = java.lang.String
  type CaseId = java.lang.String
  type Charset = java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.sesv2Mod.ClientApiVersions
  type CloudWatchDimensionConfigurations = js.Array[typings.awsSdk.sesv2Mod.CloudWatchDimensionConfiguration]
  type ConfigurationSetName = java.lang.String
  type ConfigurationSetNameList = js.Array[typings.awsSdk.sesv2Mod.ConfigurationSetName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EN
    - typings.awsSdk.awsSdkStrings.JA
    - java.lang.String
  */
  type ContactLanguage = typings.awsSdk.sesv2Mod._ContactLanguage | java.lang.String
  type CustomRedirectDomain = java.lang.String
  type CustomVerificationEmailTemplatesList = js.Array[typings.awsSdk.sesv2Mod.CustomVerificationEmailTemplateMetadata]
  type DailyVolumes = js.Array[typings.awsSdk.sesv2Mod.DailyVolume]
  type DedicatedIpList = js.Array[typings.awsSdk.sesv2Mod.DedicatedIp]
  type DefaultDimensionValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.PENDING_EXPIRATION
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type DeliverabilityDashboardAccountStatus = typings.awsSdk.sesv2Mod._DeliverabilityDashboardAccountStatus | java.lang.String
  type DeliverabilityTestReports = js.Array[typings.awsSdk.sesv2Mod.DeliverabilityTestReport]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type DeliverabilityTestStatus = typings.awsSdk.sesv2Mod._DeliverabilityTestStatus | java.lang.String
  type DeliverabilityTestSubject = java.lang.String
  type DimensionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MESSAGE_TAG
    - typings.awsSdk.awsSdkStrings.EMAIL_HEADER
    - typings.awsSdk.awsSdkStrings.LINK_TAG
    - java.lang.String
  */
  type DimensionValueSource = typings.awsSdk.sesv2Mod._DimensionValueSource | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AWS_SES
    - typings.awsSdk.awsSdkStrings.EXTERNAL
    - java.lang.String
  */
  type DkimSigningAttributesOrigin = typings.awsSdk.sesv2Mod._DkimSigningAttributesOrigin | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.TEMPORARY_FAILURE
    - typings.awsSdk.awsSdkStrings.NOT_STARTED
    - java.lang.String
  */
  type DkimStatus = typings.awsSdk.sesv2Mod._DkimStatus | java.lang.String
  type DnsToken = java.lang.String
  type DnsTokenList = js.Array[typings.awsSdk.sesv2Mod.DnsToken]
  type Domain = java.lang.String
  type DomainDeliverabilityCampaignList = js.Array[typings.awsSdk.sesv2Mod.DomainDeliverabilityCampaign]
  type DomainDeliverabilityTrackingOptions = js.Array[typings.awsSdk.sesv2Mod.DomainDeliverabilityTrackingOption]
  type DomainIspPlacements = js.Array[typings.awsSdk.sesv2Mod.DomainIspPlacement]
  type EmailAddress = java.lang.String
  type EmailAddressList = js.Array[typings.awsSdk.sesv2Mod.EmailAddress]
  type EmailTemplateData = java.lang.String
  type EmailTemplateHtml = java.lang.String
  type EmailTemplateMetadataList = js.Array[typings.awsSdk.sesv2Mod.EmailTemplateMetadata]
  type EmailTemplateName = java.lang.String
  type EmailTemplateSubject = java.lang.String
  type EmailTemplateText = java.lang.String
  type Enabled = scala.Boolean
  type EnabledWrapper = scala.Boolean
  type ErrorMessage = java.lang.String
  type Esp = java.lang.String
  type Esps = js.Array[typings.awsSdk.sesv2Mod.Esp]
  type EventDestinationName = java.lang.String
  type EventDestinations = js.Array[typings.awsSdk.sesv2Mod.EventDestination]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SEND
    - typings.awsSdk.awsSdkStrings.REJECT
    - typings.awsSdk.awsSdkStrings.BOUNCE
    - typings.awsSdk.awsSdkStrings.COMPLAINT
    - typings.awsSdk.awsSdkStrings.DELIVERY
    - typings.awsSdk.awsSdkStrings.OPEN
    - typings.awsSdk.awsSdkStrings.CLICK
    - typings.awsSdk.awsSdkStrings.RENDERING_FAILURE
    - typings.awsSdk.awsSdkStrings.DELIVERY_DELAY
    - java.lang.String
  */
  type EventType = typings.awsSdk.sesv2Mod._EventType | java.lang.String
  type EventTypes = js.Array[typings.awsSdk.sesv2Mod.EventType]
  type FailureRedirectionURL = java.lang.String
  type FeedbackId = java.lang.String
  type GeneralEnforcementStatus = java.lang.String
  type Identity = java.lang.String
  type IdentityInfoList = js.Array[typings.awsSdk.sesv2Mod.IdentityInfo]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EMAIL_ADDRESS
    - typings.awsSdk.awsSdkStrings.DOMAIN
    - typings.awsSdk.awsSdkStrings.MANAGED_DOMAIN
    - java.lang.String
  */
  type IdentityType = typings.awsSdk.sesv2Mod._IdentityType | java.lang.String
  type ImageUrl = java.lang.String
  type Ip = java.lang.String
  type IpList = js.Array[typings.awsSdk.sesv2Mod.Ip]
  type IspName = java.lang.String
  type IspNameList = js.Array[typings.awsSdk.sesv2Mod.IspName]
  type IspPlacements = js.Array[typings.awsSdk.sesv2Mod.IspPlacement]
  type LastFreshStart = typings.std.Date
  type ListOfDedicatedIpPools = js.Array[typings.awsSdk.sesv2Mod.PoolName]
  type MailFromDomainName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.TEMPORARY_FAILURE
    - java.lang.String
  */
  type MailFromDomainStatus = typings.awsSdk.sesv2Mod._MailFromDomainStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MARKETING
    - typings.awsSdk.awsSdkStrings.TRANSACTIONAL
    - java.lang.String
  */
  type MailType = typings.awsSdk.sesv2Mod._MailType | java.lang.String
  type Max24HourSend = scala.Double
  type MaxItems = scala.Double
  type MaxSendRate = scala.Double
  type MessageContent = java.lang.String
  type MessageData = java.lang.String
  type MessageTagList = js.Array[typings.awsSdk.sesv2Mod.MessageTag]
  type MessageTagName = java.lang.String
  type MessageTagValue = java.lang.String
  type NextToken = java.lang.String
  type OutboundMessageId = java.lang.String
  type Percentage = scala.Double
  type Percentage100Wrapper = scala.Double
  type Policy = java.lang.String
  type PolicyMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sesv2Mod.Policy]
  type PolicyName = java.lang.String
  type PoolName = java.lang.String
  type PrivateKey = java.lang.String
  type RawMessageData = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.sesv2Mod.Blob | java.lang.String
  type RblName = java.lang.String
  type RenderedEmailTemplate = java.lang.String
  type ReportId = java.lang.String
  type ReportName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.GRANTED
    - typings.awsSdk.awsSdkStrings.DENIED
    - java.lang.String
  */
  type ReviewStatus = typings.awsSdk.sesv2Mod._ReviewStatus | java.lang.String
  type Selector = java.lang.String
  type SendingPoolName = java.lang.String
  type SentLast24Hours = scala.Double
  type Subject = java.lang.String
  type SuccessRedirectionURL = java.lang.String
  type SuppressedDestinationSummaries = js.Array[typings.awsSdk.sesv2Mod.SuppressedDestinationSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BOUNCE
    - typings.awsSdk.awsSdkStrings.COMPLAINT
    - java.lang.String
  */
  type SuppressionListReason = typings.awsSdk.sesv2Mod._SuppressionListReason | java.lang.String
  type SuppressionListReasons = js.Array[typings.awsSdk.sesv2Mod.SuppressionListReason]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.sesv2Mod.TagKey]
  type TagList = js.Array[typings.awsSdk.sesv2Mod.Tag]
  type TagValue = java.lang.String
  type TemplateContent = java.lang.String
  type Timestamp = typings.std.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.REQUIRE
    - typings.awsSdk.awsSdkStrings.OPTIONAL
    - java.lang.String
  */
  type TlsPolicy = typings.awsSdk.sesv2Mod._TlsPolicy | java.lang.String
  type UseCaseDescription = java.lang.String
  type Volume = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.DONE
    - java.lang.String
  */
  type WarmupStatus = typings.awsSdk.sesv2Mod._WarmupStatus | java.lang.String
  type WebsiteURL = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-09-27`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.sesv2Mod._apiVersion | java.lang.String
}
