package typings.azureSb.mod.Azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ServiceBus {
  type BrokerProperties = typings.std.Partial[typings.azureSb.mod.Azure.ServiceBus.IBrokerProperties]
  type BrokerPropertiesResponse = typings.azureSb.mod.Azure.ServiceBus.IBrokerPropertiesResponse with typings.std.Partial[typings.azureSb.mod.Azure.ServiceBus.IBrokerProperties]
  type CreateNotificationHubOptions = typings.std.Partial[typings.azureSb.mod.Azure.ServiceBus.ICreateNotificationHubOptions]
  type CreateQueueOptions = typings.std.Partial[typings.azureSb.mod.Azure.ServiceBus.IQueueOptions]
  type CreateRuleOptions = typings.std.Partial[typings.azureSb.mod.Azure.ServiceBus.ICreateRuleOptions]
  type CreateSubscriptionOptions = typings.std.Partial[typings.azureSb.mod.Azure.ServiceBus.ICreateSubscriptionOptions]
  type CreateTopicIfNotExistsOptions = typings.std.Partial[typings.azureSb.mod.Azure.ServiceBus.ICreateTopicIfNotExistsOptions]
  type CreateTopicOptions = typings.std.Partial[typings.azureSb.mod.Azure.ServiceBus.ICreateTopicOptions]
  type DateString = java.lang.String
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Duration = java.lang.String
  type ListNotificationHubsOptions = typings.std.Partial[typings.azureSb.mod.Azure.ServiceBus.PaginationOptions]
  type ListQueuesOptions = typings.std.Partial[typings.azureSb.mod.Azure.ServiceBus.PaginationOptions]
  type ListRulesOptions = typings.std.Partial[typings.azureSb.mod.Azure.ServiceBus.PaginationOptions]
  type ListSubscriptionsOptions = typings.std.Partial[typings.azureSb.mod.Azure.ServiceBus.PaginationOptions]
  type ListTopicsOptions = typings.std.Partial[typings.azureSb.mod.Azure.ServiceBus.PaginationOptions]
  type MessageOrName = typings.azureSb.mod.Azure.ServiceBus.Message | java.lang.String
  type ReceiveSubscriptionMessageOptions = typings.azureSb.mod.Azure.ServiceBus.ReceiveQueueMessageOptions
  type ResponseCallback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* response */ typings.azureSb.mod.Azure.ServiceBus.Response, 
    scala.Unit
  ]
  type ResultAndResponseCallback = js.Function3[
    /* error */ typings.std.Error | scala.Null, 
    /* result */ scala.Boolean | typings.azureSb.mod.Azure.ServiceBus.Results.Models.Base | js.Array[typings.azureSb.mod.Azure.ServiceBus.Results.Models.Base], 
    /* response */ typings.azureSb.mod.Azure.ServiceBus.Response, 
    scala.Unit
  ]
  type TypedResultAndResponseCallback[T] = js.Function3[
    /* error */ typings.std.Error | scala.Null, 
    /* result */ T, 
    /* response */ typings.azureSb.mod.Azure.ServiceBus.Response, 
    scala.Unit
  ]
}
