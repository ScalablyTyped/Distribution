package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sesMod {
  
  type Address = java.lang.String
  
  type AddressList = js.Array[typings.awsSdk.sesMod.Address]
  
  type AmazonResourceName = java.lang.String
  
  type ArrivalDate = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.UseDefaultValue
    - typings.awsSdk.awsSdkStrings.RejectMessage
    - java.lang.String
  */
  type BehaviorOnMXFailure = typings.awsSdk.sesMod._BehaviorOnMXFailure | java.lang.String
  
  type BounceMessage = java.lang.String
  
  type BounceSmtpReplyCode = java.lang.String
  
  type BounceStatusCode = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DoesNotExist
    - typings.awsSdk.awsSdkStrings.MessageTooLarge
    - typings.awsSdk.awsSdkStrings.ExceededQuota
    - typings.awsSdk.awsSdkStrings.ContentRejected
    - typings.awsSdk.awsSdkStrings.Undefined_
    - typings.awsSdk.awsSdkStrings.TemporaryFailure
    - java.lang.String
  */
  type BounceType = typings.awsSdk.sesMod._BounceType | java.lang.String
  
  type BouncedRecipientInfoList = js.Array[typings.awsSdk.sesMod.BouncedRecipientInfo]
  
  type BulkEmailDestinationList = js.Array[typings.awsSdk.sesMod.BulkEmailDestination]
  
  type BulkEmailDestinationStatusList = js.Array[typings.awsSdk.sesMod.BulkEmailDestinationStatus]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Success_
    - typings.awsSdk.awsSdkStrings.MessageRejected
    - typings.awsSdk.awsSdkStrings.MailFromDomainNotVerified
    - typings.awsSdk.awsSdkStrings.ConfigurationSetDoesNotExist
    - typings.awsSdk.awsSdkStrings.TemplateDoesNotExist
    - typings.awsSdk.awsSdkStrings.AccountSuspended
    - typings.awsSdk.awsSdkStrings.AccountThrottled
    - typings.awsSdk.awsSdkStrings.AccountDailyQuotaExceeded
    - typings.awsSdk.awsSdkStrings.InvalidSendingPoolName
    - typings.awsSdk.awsSdkStrings.AccountSendingPaused
    - typings.awsSdk.awsSdkStrings.ConfigurationSetSendingPaused
    - typings.awsSdk.awsSdkStrings.InvalidParameterValue
    - typings.awsSdk.awsSdkStrings.TransientFailure
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type BulkEmailStatus = typings.awsSdk.sesMod._BulkEmailStatus | java.lang.String
  
  type Charset = java.lang.String
  
  type Cidr = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.sesMod.ClientApiVersions
  
  type CloudWatchDimensionConfigurations = js.Array[typings.awsSdk.sesMod.CloudWatchDimensionConfiguration]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.eventDestinations
    - typings.awsSdk.awsSdkStrings.trackingOptions
    - typings.awsSdk.awsSdkStrings.deliveryOptions
    - typings.awsSdk.awsSdkStrings.reputationOptions
    - java.lang.String
  */
  type ConfigurationSetAttribute = typings.awsSdk.sesMod._ConfigurationSetAttribute | java.lang.String
  
  type ConfigurationSetAttributeList = js.Array[typings.awsSdk.sesMod.ConfigurationSetAttribute]
  
  type ConfigurationSetName = java.lang.String
  
  type ConfigurationSets = js.Array[typings.awsSdk.sesMod.ConfigurationSet]
  
  type Counter = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Success_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.TemporaryFailure
    - java.lang.String
  */
  type CustomMailFromStatus = typings.awsSdk.sesMod._CustomMailFromStatus | java.lang.String
  
  type CustomRedirectDomain = java.lang.String
  
  type CustomVerificationEmailTemplates = js.Array[typings.awsSdk.sesMod.CustomVerificationEmailTemplate]
  
  type DefaultDimensionValue = java.lang.String
  
  type DiagnosticCode = java.lang.String
  
  type DimensionName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.messageTag
    - typings.awsSdk.awsSdkStrings.emailHeader
    - typings.awsSdk.awsSdkStrings.linkTag
    - java.lang.String
  */
  type DimensionValueSource = typings.awsSdk.sesMod._DimensionValueSource | java.lang.String
  
  type DkimAttributes = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sesMod.IdentityDkimAttributes]
  
  type Domain = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.failed__
    - typings.awsSdk.awsSdkStrings.delayed_
    - typings.awsSdk.awsSdkStrings.delivered
    - typings.awsSdk.awsSdkStrings.relayed
    - typings.awsSdk.awsSdkStrings.expanded_
    - java.lang.String
  */
  type DsnAction = typings.awsSdk.sesMod._DsnAction | java.lang.String
  
  type DsnStatus = java.lang.String
  
  type Enabled = scala.Boolean
  
  type Error = java.lang.String
  
  type EventDestinationName = java.lang.String
  
  type EventDestinations = js.Array[typings.awsSdk.sesMod.EventDestination]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.send_
    - typings.awsSdk.awsSdkStrings.reject__
    - typings.awsSdk.awsSdkStrings.bounce__
    - typings.awsSdk.awsSdkStrings.complaint__
    - typings.awsSdk.awsSdkStrings.delivery__
    - typings.awsSdk.awsSdkStrings.open__
    - typings.awsSdk.awsSdkStrings.click_
    - typings.awsSdk.awsSdkStrings.renderingFailure
    - java.lang.String
  */
  type EventType = typings.awsSdk.sesMod._EventType | java.lang.String
  
  type EventTypes = js.Array[typings.awsSdk.sesMod.EventType]
  
  type Explanation = java.lang.String
  
  type ExtensionFieldList = js.Array[typings.awsSdk.sesMod.ExtensionField]
  
  type ExtensionFieldName = java.lang.String
  
  type ExtensionFieldValue = java.lang.String
  
  type FailureRedirectionURL = java.lang.String
  
  type FromAddress = java.lang.String
  
  type HeaderName = java.lang.String
  
  type HeaderValue = java.lang.String
  
  type HtmlPart = java.lang.String
  
  type Identity = java.lang.String
  
  type IdentityList = js.Array[typings.awsSdk.sesMod.Identity]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EmailAddress
    - typings.awsSdk.awsSdkStrings.Domain_
    - java.lang.String
  */
  type IdentityType = typings.awsSdk.sesMod._IdentityType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Event_
    - typings.awsSdk.awsSdkStrings.RequestResponse
    - java.lang.String
  */
  type InvocationType = typings.awsSdk.sesMod._InvocationType | java.lang.String
  
  type LastAttemptDate = typings.std.Date
  
  type LastFreshStart = typings.std.Date
  
  type MailFromDomainAttributes = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sesMod.IdentityMailFromDomainAttributes]
  
  type MailFromDomainName = java.lang.String
  
  type Max24HourSend = scala.Double
  
  type MaxItems = scala.Double
  
  type MaxResults = scala.Double
  
  type MaxSendRate = scala.Double
  
  type MessageData = java.lang.String
  
  type MessageId = java.lang.String
  
  type MessageTagList = js.Array[typings.awsSdk.sesMod.MessageTag]
  
  type MessageTagName = java.lang.String
  
  type MessageTagValue = java.lang.String
  
  type NextToken = java.lang.String
  
  type NotificationAttributes = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sesMod.IdentityNotificationAttributes]
  
  type NotificationTopic = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Bounce_
    - typings.awsSdk.awsSdkStrings.Complaint_
    - typings.awsSdk.awsSdkStrings.Delivery_
    - java.lang.String
  */
  type NotificationType = typings.awsSdk.sesMod._NotificationType | java.lang.String
  
  type Policy = java.lang.String
  
  type PolicyMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sesMod.Policy]
  
  type PolicyName = java.lang.String
  
  type PolicyNameList = js.Array[typings.awsSdk.sesMod.PolicyName]
  
  type RawMessageData = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.sesMod.Blob | java.lang.String
  
  type ReceiptActionsList = js.Array[typings.awsSdk.sesMod.ReceiptAction]
  
  type ReceiptFilterList = js.Array[typings.awsSdk.sesMod.ReceiptFilter]
  
  type ReceiptFilterName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Block_
    - typings.awsSdk.awsSdkStrings.Allow_
    - java.lang.String
  */
  type ReceiptFilterPolicy = typings.awsSdk.sesMod._ReceiptFilterPolicy | java.lang.String
  
  type ReceiptRuleName = java.lang.String
  
  type ReceiptRuleNamesList = js.Array[typings.awsSdk.sesMod.ReceiptRuleName]
  
  type ReceiptRuleSetName = java.lang.String
  
  type ReceiptRuleSetsLists = js.Array[typings.awsSdk.sesMod.ReceiptRuleSetMetadata]
  
  type ReceiptRulesList = js.Array[typings.awsSdk.sesMod.ReceiptRule]
  
  type Recipient = java.lang.String
  
  type RecipientsList = js.Array[typings.awsSdk.sesMod.Recipient]
  
  type RemoteMta = java.lang.String
  
  type RenderedTemplate = java.lang.String
  
  type ReportingMta = java.lang.String
  
  type S3BucketName = java.lang.String
  
  type S3KeyPrefix = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`UTF-8`
    - typings.awsSdk.awsSdkStrings.Base64
    - java.lang.String
  */
  type SNSActionEncoding = typings.awsSdk.sesMod._SNSActionEncoding | java.lang.String
  
  type SendDataPointList = js.Array[typings.awsSdk.sesMod.SendDataPoint]
  
  type SentLast24Hours = scala.Double
  
  type StopScope = typings.awsSdk.awsSdkStrings.RuleSet | java.lang.String
  
  type Subject = java.lang.String
  
  type SubjectPart = java.lang.String
  
  type SuccessRedirectionURL = java.lang.String
  
  type TemplateContent = java.lang.String
  
  type TemplateData = java.lang.String
  
  type TemplateMetadataList = js.Array[typings.awsSdk.sesMod.TemplateMetadata]
  
  type TemplateName = java.lang.String
  
  type TextPart = java.lang.String
  
  type Timestamp = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Require_
    - typings.awsSdk.awsSdkStrings.Optional_
    - java.lang.String
  */
  type TlsPolicy = typings.awsSdk.sesMod._TlsPolicy | java.lang.String
  
  type VerificationAttributes = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sesMod.IdentityVerificationAttributes]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Success_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.TemporaryFailure
    - typings.awsSdk.awsSdkStrings.NotStarted
    - java.lang.String
  */
  type VerificationStatus = typings.awsSdk.sesMod._VerificationStatus | java.lang.String
  
  type VerificationToken = java.lang.String
  
  type VerificationTokenList = js.Array[typings.awsSdk.sesMod.VerificationToken]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2010-12-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.sesMod._apiVersion | java.lang.String
}
