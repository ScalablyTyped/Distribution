package typings
package azureDashSbLib.azureDashSbMod

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
      var DefaultMessageTimeToLive: java.lang.String
      var DuplicateDetectionHistoryTimeWindow: java.lang.String
      var EnablePartitioning: scala.Boolean
      var MaxSizeInMegabytes: scala.Double
      var RequiresDuplicateDetection: scala.Boolean
    }
    
    
    trait Dictionary[T]
      extends /* k */ ScalablyTyped.runtime.StringDictionary[T]
    
    
    trait ErrorResponse extends Response {
      @JSName("body")
      var body_ErrorResponse: azureDashSbLib.Anon_Error
    }
    
    
    trait IBrokerProperties extends js.Object {
      var CorrelationId: java.lang.String
      var Label: java.lang.String
      var MessageId: java.lang.String
      var PartitionKey: java.lang.String
      var ReplyTo: java.lang.String
      var ReplyToSessionId: java.lang.String
      var ScheduledEnqueueTimeUtc: java.lang.String
      var SessionId: java.lang.String
      var TimeToLive: java.lang.String
      var To: java.lang.String
    }
    
    
    trait IBrokerPropertiesResponse extends js.Object {
      val DeliveryCount: scala.Double
      val LockToken: java.lang.String
      val LockedUntil: DateString
      val SequenceNumber: scala.Double
    }
    
    
    trait ICreateNotificationHubOptions extends js.Object {
      var apns: Dictionary[java.lang.String]
      var gcm: Dictionary[java.lang.String]
      var mpns: Dictionary[java.lang.String]
      var wns: Dictionary[java.lang.String]
    }
    
    
    trait ICreateRuleOptions extends js.Object {
      var correlationIdFilter: java.lang.String
      var falseFilter: java.lang.String
      var sqlExpressionFilter: java.lang.String
      var sqlRuleAction: java.lang.String
      var trueFilter: java.lang.String
    }
    
    
    trait ICreateSubscriptionOptions extends js.Object {
      var DefaultMessageTimeToLive: java.lang.String
      var EnableDeadLetteringOnFilterEvaluationExceptions: scala.Boolean
      var EnableDeadLetteringOnMessageExpiration: scala.Boolean
      var LockDuration: java.lang.String
      var RequiresSession: scala.Boolean
    }
    
    
    trait ICreateTopicIfNotExistsOptions extends ICreateTopicOptions {
      var EnableDeadLetteringOnFilterEvaluationExceptions: scala.Boolean
      var EnableDeadLetteringOnMessageExpiration: scala.Boolean
      var MaxCorrelationFiltersPerTopic: scala.Double
      var MaxSqlFiltersPerTopic: scala.Double
      var MaxSubscriptionsPerTopic: scala.Double
    }
    
    
    trait ICreateTopicOptions extends CreateOptions {
      var EnableBatchedOperations: scala.Boolean
      var SizeInBytes: scala.Boolean
      var SupportOrdering: scala.Boolean
    }
    
    
    trait IQueueOptions extends CreateOptions {
      var AutoDeleteOnIdle: java.lang.String
      var DeadLetteringOnMessageExpiration: scala.Boolean
      var LockDuration: java.lang.String
      var RequiresSession: scala.Boolean
    }
    
    
    trait Message extends js.Object {
      var body: java.lang.String
      var brokerProperties: js.UndefOr[BrokerProperties] = js.undefined
      var contentType: js.UndefOr[java.lang.String] = js.undefined
      var customProperties: js.UndefOr[Dictionary[_]] = js.undefined
    }
    
    
    trait NotificationHubRegistration extends js.Object {
      var BodyTemplate: js.UndefOr[js.Any] = js.undefined
      var ChannelUri: js.UndefOr[java.lang.String] = js.undefined
      var DeviceToken: js.UndefOr[java.lang.String] = js.undefined
      var Expiry: js.UndefOr[stdLib.Date] = js.undefined
      var MpnsHeaders: js.UndefOr[js.Any] = js.undefined
      var RegistrationId: java.lang.String
      var Tags: js.UndefOr[java.lang.String] = js.undefined
      var WnsHeaders: js.UndefOr[js.Any] = js.undefined
      var gcmRegistrationId: js.UndefOr[java.lang.String] = js.undefined
    }
    
    
    trait PaginationOptions extends js.Object {
      var skip: scala.Double
      var top: scala.Double
    }
    
    
    trait ReceiveQueueMessageOptions extends js.Object {
      var timeoutIntervalInS: js.UndefOr[scala.Double] = js.undefined
    }
    
    
    trait ReceiveSubscriptionMessageOptions extends ReceiveQueueMessageOptions {
      var isPeekLock: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    
    trait Response extends js.Object {
      var body: Dictionary[java.lang.String | js.Object]
      var headers: Dictionary[java.lang.String]
      var isSuccessful: scala.Boolean
      var md5: js.UndefOr[java.lang.String] = js.undefined
      var statusCode: scala.Double
    }
    
    @JSName("Results")
    @js.native
    object ResultsNs extends js.Object {
      @JSName("Models")
      @js.native
      object ModelsNs extends js.Object {
        
        trait Base extends js.Object {
          var CreatedAt: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.DateString
          var `_`: azureDashSbLib.Anon_Author
        }
        
        @js.native
        sealed trait EntityAvailabilityStatus extends js.Object
        
        @js.native
        sealed trait EntityStatus extends js.Object
        
        
        trait ExtendedBase extends Base {
          var AuthorizationRules: java.lang.String
          var AutoDeleteOnIdle: java.lang.String
          var DefaultMessageTimeToLive: java.lang.String
          var DuplicateDetectionHistoryTimeWindow: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Duration
          var EnableBatchedOperations: java.lang.String
          var EnableExpress: java.lang.String
          var EnablePartitioning: java.lang.String
          var EntityAvailabilityStatus: java.lang.String
          var IsAnonymousAccessible: java.lang.String
          var MaxSizeInMegabytes: java.lang.String
          var RequiresDuplicateDetection: java.lang.String
          var SizeInBytes: java.lang.String
          var Status: EntityStatus
          var UpdatedAt: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.DateString
        }
        
        
        trait Queue extends ExtendedBase {
          var DeadLetteringOnMessageExpiration: java.lang.String
          var LockDuration: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Duration
          var MaxDeliveryCount: java.lang.String
          var MessageCount: java.lang.String
          var QueueName: java.lang.String
          var RequiresSession: java.lang.String
          var SupportOrdering: java.lang.String
        }
        
        
        trait Rule extends Base {
          var Action: java.lang.String | SqlFilter
          var Filter: SqlFilter | CorrelationFilter
          var Name: java.lang.String
          var RuleName: java.lang.String
          var SubscriptionName: java.lang.String
          var TopicName: java.lang.String
        }
        
        /**
                 * @see https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-messaging-sql-filter
                 */
        
        trait SqlFilter extends js.Object {
          val CompatibilityLevel: java.lang.String
          var Parameters: js.UndefOr[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary[_]] = js.undefined
          var RequiresPreprocessing: js.UndefOr[java.lang.String] = js.undefined
          var SqlExpression: java.lang.String
        }
        
        
        trait Subscription extends ExtendedBase {
          var CountDetails: ScalablyTyped.runtime.StringDictionary[java.lang.String]
          var DeadLetteringOnFilterEvaluationExceptions: java.lang.String
          var DeadLetteringOnMessageExpiration: java.lang.String
          var LockDuration: java.lang.String
          var MaxDeliveryCount: java.lang.String
          var MessageCount: java.lang.String
          var RequiresSession: java.lang.String
          var SubscriptionName: java.lang.String
          var TopicName: java.lang.String
        }
        
        
        trait Topic extends ExtendedBase {
          var AccessedAt: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.DateString
          var CountDetails: ScalablyTyped.runtime.StringDictionary[java.lang.String]
          var EnableSubscriptionPartitioning: java.lang.String
          var FilteringMessagesBeforePublishing: java.lang.String
          var IsExpress: java.lang.String
          var SubscriptionCount: java.lang.String
          var SupportOrdering: java.lang.String
          var TopicName: java.lang.String
        }
        
        val ActiveMessageCount: /* d2p1:ActiveMessageCount */ java.lang.String = js.native
        val DeadLetterMessageCount: /* d2p1:DeadLetterMessageCount */ java.lang.String = js.native
        val ScheduledMessageCount: /* d2p1:ScheduledMessageCount */ java.lang.String = js.native
        val TransferDeadLetterMessageCount: /* d2p1:TransferDeadLetterMessageCount */ java.lang.String = js.native
        val TransferMessageCount: /* d2p1:TransferMessageCount */ java.lang.String = js.native
        @js.native
        object EntityAvailabilityStatus extends js.Object {
          @js.native
          sealed trait Available
            extends azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityAvailabilityStatus
          
          @js.native
          sealed trait Limited
            extends azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityAvailabilityStatus
          
          @js.native
          sealed trait Renaming
            extends azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityAvailabilityStatus
          
          @js.native
          sealed trait Restoring
            extends azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityAvailabilityStatus
          
          @js.native
          sealed trait Unknown
            extends azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityAvailabilityStatus
          
          /* "Available" */ val Available: Available with java.lang.String = js.native
          /* "Limited" */ val Limited: Limited with java.lang.String = js.native
          /* "Renaming" */ val Renaming: Renaming with java.lang.String = js.native
          /* "Restoring" */ val Restoring: Restoring with java.lang.String = js.native
          /* "Unknown" */ val Unknown: Unknown with java.lang.String = js.native
          @JSBracketAccess
          def apply(value: java.lang.String): js.UndefOr[
                    azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityAvailabilityStatus with java.lang.String
                  ] = js.native
        }
        
        @js.native
        object EntityStatus extends js.Object {
          @js.native
          sealed trait Active
            extends azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus
          
          @js.native
          sealed trait Creating
            extends azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus
          
          @js.native
          sealed trait Deleting
            extends azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus
          
          @js.native
          sealed trait Disabled
            extends azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus
          
          @js.native
          sealed trait ReceiveDisabled
            extends azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus
          
          @js.native
          sealed trait Renaming
            extends azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus
          
          @js.native
          sealed trait Restoring
            extends azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus
          
          @js.native
          sealed trait SendDisabled
            extends azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus
          
          @js.native
          sealed trait Unknown
            extends azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus
          
          /* "Active" */ val Active: Active with java.lang.String = js.native
          /* "Creating" */ val Creating: Creating with java.lang.String = js.native
          /* "Deleting" */ val Deleting: Deleting with java.lang.String = js.native
          /* "Disabled" */ val Disabled: Disabled with java.lang.String = js.native
          /* "ReceiveDisabled" */ val ReceiveDisabled: ReceiveDisabled with java.lang.String = js.native
          /* "Renaming" */ val Renaming: Renaming with java.lang.String = js.native
          /* "Restoring" */ val Restoring: Restoring with java.lang.String = js.native
          /* "SendDisabled" */ val SendDisabled: SendDisabled with java.lang.String = js.native
          /* "Unknown" */ val Unknown: Unknown with java.lang.String = js.native
          @JSBracketAccess
          def apply(value: java.lang.String): js.UndefOr[
                    azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.EntityStatus with java.lang.String
                  ] = js.native
        }
        
        type CorrelationFilter = stdLib.Partial[azureDashSbLib.Anon_Properties]
      }
      
    }
    
    type BrokerProperties = stdLib.Partial[IBrokerProperties]
    type BrokerPropertiesResponse = IBrokerPropertiesResponse with stdLib.Partial[IBrokerProperties]
    type CreateNotificationHubOptions = stdLib.Partial[ICreateNotificationHubOptions]
    type CreateQueueOptions = stdLib.Partial[IQueueOptions]
    type CreateRuleOptions = stdLib.Partial[ICreateRuleOptions]
    type CreateSubscriptionOptions = stdLib.Partial[ICreateSubscriptionOptions]
    type CreateTopicIfNotExistsOptions = stdLib.Partial[ICreateTopicIfNotExistsOptions]
    type CreateTopicOptions = stdLib.Partial[ICreateTopicOptions]
    type DateString = java.lang.String
    type Duration = java.lang.String
    type ListNotificationHubsOptions = stdLib.Partial[PaginationOptions]
    type ListQueuesOptions = stdLib.Partial[PaginationOptions]
    type ListRulesOptions = stdLib.Partial[PaginationOptions]
    type ListSubscriptionsOptions = stdLib.Partial[PaginationOptions]
    type ListTopicsOptions = stdLib.Partial[PaginationOptions]
    type MessageOrName = Message | java.lang.String
    type ResponseCallback = js.Function2[/* error */ nodeLib.Error | scala.Null, /* response */ Response, scala.Unit]
    type ResultAndResponseCallback = js.Function3[
        /* error */ nodeLib.Error | scala.Null, 
        /* result */ scala.Boolean | azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Base | js.Array[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Base], 
        /* response */ Response, 
        scala.Unit
      ]
    type TypedResultAndResponseCallback[T] = js.Function3[
        /* error */ nodeLib.Error | scala.Null, 
        /* result */ T, 
        /* response */ Response, 
        scala.Unit
      ]
  }
  
}

