package typings.awsSdk.codestarnotificationsMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeStarNotifications extends Service {
  
  @JSName("config")
  var config_CodeStarNotifications: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a notification rule for a resource. The rule specifies the events you want notifications about and the targets (such as SNS topics) where you want to receive them.
    */
  def createNotificationRule(): Request[CreateNotificationRuleResult, AWSError] = js.native
  def createNotificationRule(callback: js.Function2[/* err */ AWSError, /* data */ CreateNotificationRuleResult, Unit]): Request[CreateNotificationRuleResult, AWSError] = js.native
  /**
    * Creates a notification rule for a resource. The rule specifies the events you want notifications about and the targets (such as SNS topics) where you want to receive them.
    */
  def createNotificationRule(params: CreateNotificationRuleRequest): Request[CreateNotificationRuleResult, AWSError] = js.native
  def createNotificationRule(
    params: CreateNotificationRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNotificationRuleResult, Unit]
  ): Request[CreateNotificationRuleResult, AWSError] = js.native
  
  /**
    * Deletes a notification rule for a resource.
    */
  def deleteNotificationRule(): Request[DeleteNotificationRuleResult, AWSError] = js.native
  def deleteNotificationRule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNotificationRuleResult, Unit]): Request[DeleteNotificationRuleResult, AWSError] = js.native
  /**
    * Deletes a notification rule for a resource.
    */
  def deleteNotificationRule(params: DeleteNotificationRuleRequest): Request[DeleteNotificationRuleResult, AWSError] = js.native
  def deleteNotificationRule(
    params: DeleteNotificationRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNotificationRuleResult, Unit]
  ): Request[DeleteNotificationRuleResult, AWSError] = js.native
  
  /**
    * Deletes a specified target for notifications.
    */
  def deleteTarget(): Request[DeleteTargetResult, AWSError] = js.native
  def deleteTarget(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTargetResult, Unit]): Request[DeleteTargetResult, AWSError] = js.native
  /**
    * Deletes a specified target for notifications.
    */
  def deleteTarget(params: DeleteTargetRequest): Request[DeleteTargetResult, AWSError] = js.native
  def deleteTarget(
    params: DeleteTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTargetResult, Unit]
  ): Request[DeleteTargetResult, AWSError] = js.native
  
  /**
    * Returns information about a specified notification rule.
    */
  def describeNotificationRule(): Request[DescribeNotificationRuleResult, AWSError] = js.native
  def describeNotificationRule(callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotificationRuleResult, Unit]): Request[DescribeNotificationRuleResult, AWSError] = js.native
  /**
    * Returns information about a specified notification rule.
    */
  def describeNotificationRule(params: DescribeNotificationRuleRequest): Request[DescribeNotificationRuleResult, AWSError] = js.native
  def describeNotificationRule(
    params: DescribeNotificationRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotificationRuleResult, Unit]
  ): Request[DescribeNotificationRuleResult, AWSError] = js.native
  
  /**
    * Returns information about the event types available for configuring notifications.
    */
  def listEventTypes(): Request[ListEventTypesResult, AWSError] = js.native
  def listEventTypes(callback: js.Function2[/* err */ AWSError, /* data */ ListEventTypesResult, Unit]): Request[ListEventTypesResult, AWSError] = js.native
  /**
    * Returns information about the event types available for configuring notifications.
    */
  def listEventTypes(params: ListEventTypesRequest): Request[ListEventTypesResult, AWSError] = js.native
  def listEventTypes(
    params: ListEventTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEventTypesResult, Unit]
  ): Request[ListEventTypesResult, AWSError] = js.native
  
  /**
    * Returns a list of the notification rules for an AWS account.
    */
  def listNotificationRules(): Request[ListNotificationRulesResult, AWSError] = js.native
  def listNotificationRules(callback: js.Function2[/* err */ AWSError, /* data */ ListNotificationRulesResult, Unit]): Request[ListNotificationRulesResult, AWSError] = js.native
  /**
    * Returns a list of the notification rules for an AWS account.
    */
  def listNotificationRules(params: ListNotificationRulesRequest): Request[ListNotificationRulesResult, AWSError] = js.native
  def listNotificationRules(
    params: ListNotificationRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNotificationRulesResult, Unit]
  ): Request[ListNotificationRulesResult, AWSError] = js.native
  
  /**
    * Returns a list of the tags associated with a notification rule.
    */
  def listTagsForResource(): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]): Request[ListTagsForResourceResult, AWSError] = js.native
  /**
    * Returns a list of the tags associated with a notification rule.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]
  ): Request[ListTagsForResourceResult, AWSError] = js.native
  
  /**
    * Returns a list of the notification rule targets for an AWS account.
    */
  def listTargets(): Request[ListTargetsResult, AWSError] = js.native
  def listTargets(callback: js.Function2[/* err */ AWSError, /* data */ ListTargetsResult, Unit]): Request[ListTargetsResult, AWSError] = js.native
  /**
    * Returns a list of the notification rule targets for an AWS account.
    */
  def listTargets(params: ListTargetsRequest): Request[ListTargetsResult, AWSError] = js.native
  def listTargets(
    params: ListTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTargetsResult, Unit]
  ): Request[ListTargetsResult, AWSError] = js.native
  
  /**
    * Creates an association between a notification rule and an SNS topic so that the associated target can receive notifications when the events described in the rule are triggered.
    */
  def subscribe(): Request[SubscribeResult, AWSError] = js.native
  def subscribe(callback: js.Function2[/* err */ AWSError, /* data */ SubscribeResult, Unit]): Request[SubscribeResult, AWSError] = js.native
  /**
    * Creates an association between a notification rule and an SNS topic so that the associated target can receive notifications when the events described in the rule are triggered.
    */
  def subscribe(params: SubscribeRequest): Request[SubscribeResult, AWSError] = js.native
  def subscribe(
    params: SubscribeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SubscribeResult, Unit]
  ): Request[SubscribeResult, AWSError] = js.native
  
  /**
    * Associates a set of provided tags with a notification rule.
    */
  def tagResource(): Request[TagResourceResult, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]): Request[TagResourceResult, AWSError] = js.native
  /**
    * Associates a set of provided tags with a notification rule.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResult, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]
  ): Request[TagResourceResult, AWSError] = js.native
  
  /**
    * Removes an association between a notification rule and an Amazon SNS topic so that subscribers to that topic stop receiving notifications when the events described in the rule are triggered.
    */
  def unsubscribe(): Request[UnsubscribeResult, AWSError] = js.native
  def unsubscribe(callback: js.Function2[/* err */ AWSError, /* data */ UnsubscribeResult, Unit]): Request[UnsubscribeResult, AWSError] = js.native
  /**
    * Removes an association between a notification rule and an Amazon SNS topic so that subscribers to that topic stop receiving notifications when the events described in the rule are triggered.
    */
  def unsubscribe(params: UnsubscribeRequest): Request[UnsubscribeResult, AWSError] = js.native
  def unsubscribe(
    params: UnsubscribeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UnsubscribeResult, Unit]
  ): Request[UnsubscribeResult, AWSError] = js.native
  
  /**
    * Removes the association between one or more provided tags and a notification rule.
    */
  def untagResource(): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]): Request[UntagResourceResult, AWSError] = js.native
  /**
    * Removes the association between one or more provided tags and a notification rule.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]
  ): Request[UntagResourceResult, AWSError] = js.native
  
  /**
    * Updates a notification rule for a resource. You can change the events that trigger the notification rule, the status of the rule, and the targets that receive the notifications.  To add or remove tags for a notification rule, you must use TagResource and UntagResource. 
    */
  def updateNotificationRule(): Request[UpdateNotificationRuleResult, AWSError] = js.native
  def updateNotificationRule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotificationRuleResult, Unit]): Request[UpdateNotificationRuleResult, AWSError] = js.native
  /**
    * Updates a notification rule for a resource. You can change the events that trigger the notification rule, the status of the rule, and the targets that receive the notifications.  To add or remove tags for a notification rule, you must use TagResource and UntagResource. 
    */
  def updateNotificationRule(params: UpdateNotificationRuleRequest): Request[UpdateNotificationRuleResult, AWSError] = js.native
  def updateNotificationRule(
    params: UpdateNotificationRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotificationRuleResult, Unit]
  ): Request[UpdateNotificationRuleResult, AWSError] = js.native
}
