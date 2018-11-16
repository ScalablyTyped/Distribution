package typings
package azureDashSbLib.libServicebusserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceBusService
  extends azureDashSbLib.libServicebusservicebaseMod.namespaced {
  /*
       * NotificationHub functions
       */
  
  def createNotificationHub(
    hubPath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultAndResponseCallback
  ): scala.Unit = js.native
  def createNotificationHub(
    hubPath: java.lang.String,
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.CreateNotificationHubOptions,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultAndResponseCallback
  ): scala.Unit = js.native
  /*
       * Queue Management functions
       */
  
  def createQueue(
    queuePath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Queue]
  ): scala.Unit = js.native
  def createQueue(
    queuePath: java.lang.String,
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.CreateQueueOptions,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Queue]
  ): scala.Unit = js.native
  def createQueueIfNotExists(
    queuePath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[scala.Boolean]
  ): scala.Unit = js.native
  def createQueueIfNotExists(
    queuePath: java.lang.String,
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.CreateQueueOptions,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[scala.Boolean]
  ): scala.Unit = js.native
  /*
       * Rule functions
       */
  
  def createRule(
    topicPath: java.lang.String,
    subscriptionPath: java.lang.String,
    rulePath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Rule]
  ): scala.Unit = js.native
  def createRule(
    topicPath: java.lang.String,
    subscriptionPath: java.lang.String,
    rulePath: java.lang.String,
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.CreateRuleOptions,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Rule]
  ): scala.Unit = js.native
  /*
       * Subscription functions
       */
  
  def createSubscription(
    topicPath: java.lang.String,
    subscriptionPath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[
      azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Subscription
    ]
  ): scala.Unit = js.native
  def createSubscription(
    topicPath: java.lang.String,
    subscriptionPath: java.lang.String,
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.CreateSubscriptionOptions,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[
      azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Subscription
    ]
  ): scala.Unit = js.native
  /*
       * Topic Management functions
       */
  
  def createTopic(
    topicPath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Topic]
  ): scala.Unit = js.native
  def createTopic(
    topicPath: java.lang.String,
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.CreateTopicOptions,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Topic]
  ): scala.Unit = js.native
  def createTopicIfNotExists(
    topicPath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[scala.Boolean]
  ): scala.Unit = js.native
  def createTopicIfNotExists(
    topicPath: java.lang.String,
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.CreateTopicIfNotExistsOptions,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[scala.Boolean]
  ): scala.Unit = js.native
  def deleteMessage(
    message: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.MessageOrName,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def deleteNotificationHub(
    hubPath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def deleteQueue(
    queuePath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def deleteRule(
    topicPath: java.lang.String,
    subscriptionPath: java.lang.String,
    rulePath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def deleteSubscription(
    topicPath: java.lang.String,
    subscriptionPath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def deleteTopic(
    topicPath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def getNotificationHub(
    hubPath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultAndResponseCallback
  ): scala.Unit = js.native
  def getQueue(
    queuePath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Queue]
  ): scala.Unit = js.native
  def getRule(
    topicPath: java.lang.String,
    subscriptionPath: java.lang.String,
    rulePath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Rule]
  ): scala.Unit = js.native
  def getSubscription(
    topicPath: java.lang.String,
    subscriptionPath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[
      azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Subscription
    ]
  ): scala.Unit = js.native
  def getTopic(
    topicPath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Topic]
  ): scala.Unit = js.native
  def listNotificationHubs(callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultAndResponseCallback): scala.Unit = js.native
  def listNotificationHubs(
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ListNotificationHubsOptions,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultAndResponseCallback
  ): scala.Unit = js.native
  def listQueues(
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[
      js.Array[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Queue]
    ]
  ): scala.Unit = js.native
  def listQueues(
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ListQueuesOptions,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[
      js.Array[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Queue]
    ]
  ): scala.Unit = js.native
  def listRules(
    topicPath: java.lang.String,
    subscriptionPath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[
      js.Array[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Rule]
    ]
  ): scala.Unit = js.native
  def listRules(
    topicPath: java.lang.String,
    subscriptionPath: java.lang.String,
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ListRulesOptions,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[
      js.Array[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Rule]
    ]
  ): scala.Unit = js.native
  def listSubscriptions(
    topicPath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[
      js.Array[
        azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Subscription
      ]
    ]
  ): scala.Unit = js.native
  def listSubscriptions(
    topicPath: java.lang.String,
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ListSubscriptionsOptions,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[
      js.Array[
        azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Subscription
      ]
    ]
  ): scala.Unit = js.native
  def listTopics(
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[
      js.Array[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Topic]
    ]
  ): scala.Unit = js.native
  def listTopics(
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ListTopicsOptions,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[
      js.Array[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResultsNs.ModelsNs.Topic]
    ]
  ): scala.Unit = js.native
  def receiveQueueMessage(
    queuePath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Message]
  ): scala.Unit = js.native
  def receiveQueueMessage(
    queuePath: java.lang.String,
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ReceiveQueueMessageOptions,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Message]
  ): scala.Unit = js.native
  def receiveSubscriptionMessage(
    topicPath: java.lang.String,
    subscriptionPath: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Message]
  ): scala.Unit = js.native
  def receiveSubscriptionMessage(
    topicPath: java.lang.String,
    subscriptionPath: java.lang.String,
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ReceiveSubscriptionMessageOptions,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.TypedResultAndResponseCallback[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Message]
  ): scala.Unit = js.native
  def renewLockForMessage(
    message: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.MessageOrName,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def sendQueueMessage(
    queuePath: java.lang.String,
    message: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.MessageOrName,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def sendTopicMessage(
    topicPath: java.lang.String,
    message: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.MessageOrName,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def unlockMessage(
    message: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.MessageOrName,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
}

