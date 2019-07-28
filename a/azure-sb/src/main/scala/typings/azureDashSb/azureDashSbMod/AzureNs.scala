package typings.azureDashSb.azureDashSbMod

import org.scalablytyped.runtime.StringDictionary
import typings.azureDashSb.Anon_Author
import typings.azureDashSb.Anon_Body
import typings.azureDashSb.Anon_ContentType
import typings.azureDashSb.Anon_Error
import typings.azureDashSb.Anon_PushChannel
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.BrokerProperties
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.CreateOptions
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.DateString
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.Duration
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.IBrokerProperties
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.IBrokerPropertiesResponse
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ICreateNotificationHubOptions
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ICreateRuleOptions
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ICreateSubscriptionOptions
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ICreateTopicIfNotExistsOptions
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ICreateTopicOptions
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.IQueueOptions
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.Message
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.PaginationOptions
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ReceiveQueueMessageOptions
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.Response
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Base
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.CorrelationFilter
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityAvailabilityStatus
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.ExtendedBase
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.SqlFilter
import typings.azureDashSb.azureDashSbStrings.`d2p1:ActiveMessageCount`
import typings.azureDashSb.azureDashSbStrings.`d2p1:DeadLetterMessageCount`
import typings.azureDashSb.azureDashSbStrings.`d2p1:ScheduledMessageCount`
import typings.azureDashSb.azureDashSbStrings.`d2p1:TransferDeadLetterMessageCount`
import typings.azureDashSb.azureDashSbStrings.`d2p1:TransferMessageCount`
import typings.azureDashSb.azureDashSbStrings.adm
import typings.azureDashSb.azureDashSbStrings.apns
import typings.azureDashSb.azureDashSbStrings.gcm
import typings.azureDashSb.azureDashSbStrings.mpns
import typings.azureDashSb.azureDashSbStrings.wns
import typings.std.Date
import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-sb", "Azure")
@js.native
object AzureNs extends js.Object {
  @JSName("ServiceBus")
  @js.native
  object ServiceBusNs extends js.Object {
    /*
      * Options interfaces
      */
    trait CreateOptions extends js.Object {
      var DefaultMessageTimeToLive: String
      var DuplicateDetectionHistoryTimeWindow: String
      var EnablePartitioning: Boolean
      var MaxSizeInMegabytes: Double
      var RequiresDuplicateDetection: Boolean
    }
    
    trait ErrorResponse extends Response {
      @JSName("body")
      var body_ErrorResponse: Anon_Error
    }
    
    trait IBrokerProperties extends js.Object {
      var CorrelationId: String
      var Label: String
      var MessageId: String
      var PartitionKey: String
      var ReplyTo: String
      var ReplyToSessionId: String
      var ScheduledEnqueueTimeUtc: String
      var SessionId: String
      var TimeToLive: String
      var To: String
    }
    
    trait IBrokerPropertiesResponse extends js.Object {
      val DeliveryCount: Double
      val LockToken: String
      val LockedUntil: DateString
      val SequenceNumber: Double
    }
    
    trait ICreateNotificationHubOptions extends js.Object {
      var apns: Dictionary[String]
      var gcm: Dictionary[String]
      var mpns: Dictionary[String]
      var wns: Dictionary[String]
    }
    
    trait ICreateRuleOptions extends js.Object {
      var correlationIdFilter: String
      var falseFilter: String
      var sqlExpressionFilter: String
      var sqlRuleAction: String
      var trueFilter: String
    }
    
    trait ICreateSubscriptionOptions extends js.Object {
      var DefaultMessageTimeToLive: String
      var EnableDeadLetteringOnFilterEvaluationExceptions: Boolean
      var EnableDeadLetteringOnMessageExpiration: Boolean
      var LockDuration: String
      var RequiresSession: Boolean
    }
    
    trait ICreateTopicIfNotExistsOptions extends ICreateTopicOptions {
      var EnableDeadLetteringOnFilterEvaluationExceptions: Boolean
      var EnableDeadLetteringOnMessageExpiration: Boolean
      var MaxCorrelationFiltersPerTopic: Double
      var MaxSqlFiltersPerTopic: Double
      var MaxSubscriptionsPerTopic: Double
    }
    
    trait ICreateTopicOptions extends CreateOptions {
      var EnableBatchedOperations: Boolean
      var SizeInBytes: Boolean
      var SupportOrdering: Boolean
    }
    
    trait IQueueOptions extends CreateOptions {
      var AutoDeleteOnIdle: String
      var DeadLetteringOnMessageExpiration: Boolean
      var LockDuration: String
      var RequiresSession: Boolean
    }
    
    trait Message extends js.Object {
      var body: String
      var brokerProperties: js.UndefOr[BrokerProperties] = js.undefined
      var contentType: js.UndefOr[String] = js.undefined
      var customProperties: js.UndefOr[Dictionary[_]] = js.undefined
    }
    
    trait NotificationHubInstallation extends js.Object {
      val expirationTime: js.UndefOr[String] = js.undefined
      val expiredPushChannel: js.UndefOr[String] = js.undefined
      var installationId: String
      val lastActiveOn: js.UndefOr[String] = js.undefined
      val lastUpdate: js.UndefOr[String] = js.undefined
      var platform: apns | wns | mpns | adm | gcm
      var pushChannel: String
      var secondaryTile: js.UndefOr[StringDictionary[Anon_PushChannel]] = js.undefined
      var tags: js.UndefOr[js.Array[String]] = js.undefined
      var templates: js.UndefOr[StringDictionary[Anon_Body]] = js.undefined
    }
    
    trait NotificationHubRegistration extends js.Object {
      var BodyTemplate: js.UndefOr[js.Any] = js.undefined
      var ChannelUri: js.UndefOr[String] = js.undefined
      var DeviceToken: js.UndefOr[String] = js.undefined
      var Expiry: js.UndefOr[Date] = js.undefined
      var MpnsHeaders: js.UndefOr[js.Any] = js.undefined
      var RegistrationId: String
      var Tags: js.UndefOr[String] = js.undefined
      var WnsHeaders: js.UndefOr[js.Any] = js.undefined
      var gcmRegistrationId: js.UndefOr[String] = js.undefined
    }
    
    trait PaginationOptions extends js.Object {
      var skip: Double
      var top: Double
    }
    
    trait ReceiveQueueMessageOptions extends js.Object {
      var isPeekLock: js.UndefOr[Boolean] = js.undefined
      var timeoutIntervalInS: js.UndefOr[Double] = js.undefined
    }
    
    trait Response extends js.Object {
      var body: Dictionary[String | js.Object]
      var headers: Dictionary[String]
      var isSuccessful: Boolean
      var md5: js.UndefOr[String] = js.undefined
      var statusCode: Double
    }
    
    @JSName("Results")
    @js.native
    object ResultsNs extends js.Object {
      @JSName("Models")
      @js.native
      object ModelsNs extends js.Object {
        trait Base extends js.Object {
          var CreatedAt: DateString
          var `_`: Anon_Author
        }
        
        @js.native
        sealed trait EntityAvailabilityStatus extends js.Object
        
        @js.native
        sealed trait EntityStatus extends js.Object
        
        trait ExtendedBase extends Base {
          var AuthorizationRules: String
          var AutoDeleteOnIdle: String
          var DefaultMessageTimeToLive: String
          var DuplicateDetectionHistoryTimeWindow: Duration
          var EnableBatchedOperations: String
          var EnableExpress: String
          var EnablePartitioning: String
          var EntityAvailabilityStatus: String
          var IsAnonymousAccessible: String
          var MaxSizeInMegabytes: String
          var RequiresDuplicateDetection: String
          var SizeInBytes: String
          var Status: EntityStatus
          var UpdatedAt: DateString
        }
        
        trait Queue extends ExtendedBase {
          var DeadLetteringOnMessageExpiration: String
          var LockDuration: Duration
          var MaxDeliveryCount: String
          var MessageCount: String
          var QueueName: String
          var RequiresSession: String
          var SupportOrdering: String
        }
        
        trait Rule extends Base {
          var Action: String | SqlFilter
          var Filter: SqlFilter | CorrelationFilter
          var Name: String
          var RuleName: String
          var SubscriptionName: String
          var TopicName: String
        }
        
        /**
          * @see https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-messaging-sql-filter
          */
        trait SqlFilter extends js.Object {
          val CompatibilityLevel: String
          var Parameters: js.UndefOr[Dictionary[_]] = js.undefined
          var RequiresPreprocessing: js.UndefOr[String] = js.undefined
          var SqlExpression: String
        }
        
        trait Subscription extends ExtendedBase {
          var CountDetails: StringDictionary[String]
          var DeadLetteringOnFilterEvaluationExceptions: String
          var DeadLetteringOnMessageExpiration: String
          var LockDuration: String
          var MaxDeliveryCount: String
          var MessageCount: String
          var RequiresSession: String
          var SubscriptionName: String
          var TopicName: String
        }
        
        trait Topic extends ExtendedBase {
          var AccessedAt: DateString
          var CountDetails: StringDictionary[String]
          var EnableSubscriptionPartitioning: String
          var FilteringMessagesBeforePublishing: String
          var IsExpress: String
          var SubscriptionCount: String
          var SupportOrdering: String
          var TopicName: String
        }
        
        val ActiveMessageCount: `d2p1:ActiveMessageCount` = js.native
        val DeadLetterMessageCount: `d2p1:DeadLetterMessageCount` = js.native
        val ScheduledMessageCount: `d2p1:ScheduledMessageCount` = js.native
        val TransferDeadLetterMessageCount: `d2p1:TransferDeadLetterMessageCount` = js.native
        val TransferMessageCount: `d2p1:TransferMessageCount` = js.native
        @js.native
        object EntityAvailabilityStatus extends js.Object {
          @js.native
          sealed trait Available extends EntityAvailabilityStatus
          
          @js.native
          sealed trait Limited extends EntityAvailabilityStatus
          
          @js.native
          sealed trait Renaming extends EntityAvailabilityStatus
          
          @js.native
          sealed trait Restoring extends EntityAvailabilityStatus
          
          @js.native
          sealed trait Unknown extends EntityAvailabilityStatus
          
          /* "Available" */ val Available: typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityAvailabilityStatus.Available with String = js.native
          /* "Limited" */ val Limited: typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityAvailabilityStatus.Limited with String = js.native
          /* "Renaming" */ val Renaming: typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityAvailabilityStatus.Renaming with String = js.native
          /* "Restoring" */ val Restoring: typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityAvailabilityStatus.Restoring with String = js.native
          /* "Unknown" */ val Unknown: typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityAvailabilityStatus.Unknown with String = js.native
          @JSBracketAccess
          def apply(value: String): js.UndefOr[EntityAvailabilityStatus with String] = js.native
        }
        
        @js.native
        object EntityStatus extends js.Object {
          @js.native
          sealed trait Active extends EntityStatus
          
          @js.native
          sealed trait Creating extends EntityStatus
          
          @js.native
          sealed trait Deleting extends EntityStatus
          
          @js.native
          sealed trait Disabled extends EntityStatus
          
          @js.native
          sealed trait ReceiveDisabled extends EntityStatus
          
          @js.native
          sealed trait Renaming extends EntityStatus
          
          @js.native
          sealed trait Restoring extends EntityStatus
          
          @js.native
          sealed trait SendDisabled extends EntityStatus
          
          @js.native
          sealed trait Unknown extends EntityStatus
          
          /* "Active" */ val Active: typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus.Active with String = js.native
          /* "Creating" */ val Creating: typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus.Creating with String = js.native
          /* "Deleting" */ val Deleting: typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus.Deleting with String = js.native
          /* "Disabled" */ val Disabled: typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus.Disabled with String = js.native
          /* "ReceiveDisabled" */ val ReceiveDisabled: typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus.ReceiveDisabled with String = js.native
          /* "Renaming" */ val Renaming: typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus.Renaming with String = js.native
          /* "Restoring" */ val Restoring: typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus.Restoring with String = js.native
          /* "SendDisabled" */ val SendDisabled: typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus.SendDisabled with String = js.native
          /* "Unknown" */ val Unknown: typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus.Unknown with String = js.native
          @JSBracketAccess
          def apply(value: String): js.UndefOr[EntityStatus with String] = js.native
        }
        
        type CorrelationFilter = Partial[Anon_ContentType]
      }
      
    }
    
    type BrokerProperties = Partial[IBrokerProperties]
    type BrokerPropertiesResponse = IBrokerPropertiesResponse with Partial[IBrokerProperties]
    type CreateNotificationHubOptions = Partial[ICreateNotificationHubOptions]
    type CreateQueueOptions = Partial[IQueueOptions]
    type CreateRuleOptions = Partial[ICreateRuleOptions]
    type CreateSubscriptionOptions = Partial[ICreateSubscriptionOptions]
    type CreateTopicIfNotExistsOptions = Partial[ICreateTopicIfNotExistsOptions]
    type CreateTopicOptions = Partial[ICreateTopicOptions]
    type DateString = String
    type Dictionary[T] = StringDictionary[T]
    type Duration = String
    type ListNotificationHubsOptions = Partial[PaginationOptions]
    type ListQueuesOptions = Partial[PaginationOptions]
    type ListRulesOptions = Partial[PaginationOptions]
    type ListSubscriptionsOptions = Partial[PaginationOptions]
    type ListTopicsOptions = Partial[PaginationOptions]
    type MessageOrName = Message | String
    type ReceiveSubscriptionMessageOptions = ReceiveQueueMessageOptions
    type ResponseCallback = js.Function2[/* error */ Error | Null, /* response */ Response, Unit]
    type ResultAndResponseCallback = js.Function3[
        /* error */ Error | Null, 
        /* result */ Boolean | Base | js.Array[Base], 
        /* response */ Response, 
        Unit
      ]
    type TypedResultAndResponseCallback[T] = js.Function3[/* error */ Error | Null, /* result */ T, /* response */ Response, Unit]
  }
  
}

