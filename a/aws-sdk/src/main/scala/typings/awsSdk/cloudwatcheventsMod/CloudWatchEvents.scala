package typings.awsSdk.cloudwatcheventsMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchEvents extends Service {
  
  /**
    * Activates a partner event source that has been deactivated. Once activated, your matching event bus will start receiving events from the event source.
    */
  def activateEventSource(): Request[js.Object, AWSError] = js.native
  def activateEventSource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Activates a partner event source that has been deactivated. Once activated, your matching event bus will start receiving events from the event source.
    */
  def activateEventSource(params: ActivateEventSourceRequest): Request[js.Object, AWSError] = js.native
  def activateEventSource(
    params: ActivateEventSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Cancels the specified replay.
    */
  def cancelReplay(): Request[CancelReplayResponse, AWSError] = js.native
  def cancelReplay(callback: js.Function2[/* err */ AWSError, /* data */ CancelReplayResponse, Unit]): Request[CancelReplayResponse, AWSError] = js.native
  /**
    * Cancels the specified replay.
    */
  def cancelReplay(params: CancelReplayRequest): Request[CancelReplayResponse, AWSError] = js.native
  def cancelReplay(
    params: CancelReplayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelReplayResponse, Unit]
  ): Request[CancelReplayResponse, AWSError] = js.native
  
  @JSName("config")
  var config_CloudWatchEvents: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an archive of events with the specified settings. When you create an archive, incoming events might not immediately start being sent to the archive. Allow a short period of time for changes to take effect. If you do not specify a pattern to filter events sent to the archive, all events are sent to the archive except replayed events. Replayed events are not sent to an archive.
    */
  def createArchive(): Request[CreateArchiveResponse, AWSError] = js.native
  def createArchive(callback: js.Function2[/* err */ AWSError, /* data */ CreateArchiveResponse, Unit]): Request[CreateArchiveResponse, AWSError] = js.native
  /**
    * Creates an archive of events with the specified settings. When you create an archive, incoming events might not immediately start being sent to the archive. Allow a short period of time for changes to take effect. If you do not specify a pattern to filter events sent to the archive, all events are sent to the archive except replayed events. Replayed events are not sent to an archive.
    */
  def createArchive(params: CreateArchiveRequest): Request[CreateArchiveResponse, AWSError] = js.native
  def createArchive(
    params: CreateArchiveRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateArchiveResponse, Unit]
  ): Request[CreateArchiveResponse, AWSError] = js.native
  
  /**
    * Creates a new event bus within your account. This can be a custom event bus which you can use to receive events from your custom applications and services, or it can be a partner event bus which can be matched to a partner event source.
    */
  def createEventBus(): Request[CreateEventBusResponse, AWSError] = js.native
  def createEventBus(callback: js.Function2[/* err */ AWSError, /* data */ CreateEventBusResponse, Unit]): Request[CreateEventBusResponse, AWSError] = js.native
  /**
    * Creates a new event bus within your account. This can be a custom event bus which you can use to receive events from your custom applications and services, or it can be a partner event bus which can be matched to a partner event source.
    */
  def createEventBus(params: CreateEventBusRequest): Request[CreateEventBusResponse, AWSError] = js.native
  def createEventBus(
    params: CreateEventBusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEventBusResponse, Unit]
  ): Request[CreateEventBusResponse, AWSError] = js.native
  
  /**
    * Called by an SaaS partner to create a partner event source. This operation is not used by AWS customers. Each partner event source can be used by one AWS account to create a matching partner event bus in that AWS account. A SaaS partner must create one partner event source for each AWS account that wants to receive those event types.  A partner event source creates events based on resources within the SaaS partner's service or application. An AWS account that creates a partner event bus that matches the partner event source can use that event bus to receive events from the partner, and then process them using AWS Events rules and targets. Partner event source names follow this format:   partner_name/event_namespace/event_name    partner_name is determined during partner registration and identifies the partner to AWS customers. event_namespace is determined by the partner and is a way for the partner to categorize their events. event_name is determined by the partner, and should uniquely identify an event-generating resource within the partner system. The combination of event_namespace and event_name should help AWS customers decide whether to create an event bus to receive these events.
    */
  def createPartnerEventSource(): Request[CreatePartnerEventSourceResponse, AWSError] = js.native
  def createPartnerEventSource(callback: js.Function2[/* err */ AWSError, /* data */ CreatePartnerEventSourceResponse, Unit]): Request[CreatePartnerEventSourceResponse, AWSError] = js.native
  /**
    * Called by an SaaS partner to create a partner event source. This operation is not used by AWS customers. Each partner event source can be used by one AWS account to create a matching partner event bus in that AWS account. A SaaS partner must create one partner event source for each AWS account that wants to receive those event types.  A partner event source creates events based on resources within the SaaS partner's service or application. An AWS account that creates a partner event bus that matches the partner event source can use that event bus to receive events from the partner, and then process them using AWS Events rules and targets. Partner event source names follow this format:   partner_name/event_namespace/event_name    partner_name is determined during partner registration and identifies the partner to AWS customers. event_namespace is determined by the partner and is a way for the partner to categorize their events. event_name is determined by the partner, and should uniquely identify an event-generating resource within the partner system. The combination of event_namespace and event_name should help AWS customers decide whether to create an event bus to receive these events.
    */
  def createPartnerEventSource(params: CreatePartnerEventSourceRequest): Request[CreatePartnerEventSourceResponse, AWSError] = js.native
  def createPartnerEventSource(
    params: CreatePartnerEventSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePartnerEventSourceResponse, Unit]
  ): Request[CreatePartnerEventSourceResponse, AWSError] = js.native
  
  /**
    * You can use this operation to temporarily stop receiving events from the specified partner event source. The matching event bus is not deleted.  When you deactivate a partner event source, the source goes into PENDING state. If it remains in PENDING state for more than two weeks, it is deleted. To activate a deactivated partner event source, use ActivateEventSource.
    */
  def deactivateEventSource(): Request[js.Object, AWSError] = js.native
  def deactivateEventSource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * You can use this operation to temporarily stop receiving events from the specified partner event source. The matching event bus is not deleted.  When you deactivate a partner event source, the source goes into PENDING state. If it remains in PENDING state for more than two weeks, it is deleted. To activate a deactivated partner event source, use ActivateEventSource.
    */
  def deactivateEventSource(params: DeactivateEventSourceRequest): Request[js.Object, AWSError] = js.native
  def deactivateEventSource(
    params: DeactivateEventSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified archive.
    */
  def deleteArchive(): Request[DeleteArchiveResponse, AWSError] = js.native
  def deleteArchive(callback: js.Function2[/* err */ AWSError, /* data */ DeleteArchiveResponse, Unit]): Request[DeleteArchiveResponse, AWSError] = js.native
  /**
    * Deletes the specified archive.
    */
  def deleteArchive(params: DeleteArchiveRequest): Request[DeleteArchiveResponse, AWSError] = js.native
  def deleteArchive(
    params: DeleteArchiveRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteArchiveResponse, Unit]
  ): Request[DeleteArchiveResponse, AWSError] = js.native
  
  /**
    * Deletes the specified custom event bus or partner event bus. All rules associated with this event bus need to be deleted. You can't delete your account's default event bus.
    */
  def deleteEventBus(): Request[js.Object, AWSError] = js.native
  def deleteEventBus(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified custom event bus or partner event bus. All rules associated with this event bus need to be deleted. You can't delete your account's default event bus.
    */
  def deleteEventBus(params: DeleteEventBusRequest): Request[js.Object, AWSError] = js.native
  def deleteEventBus(
    params: DeleteEventBusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This operation is used by SaaS partners to delete a partner event source. This operation is not used by AWS customers. When you delete an event source, the status of the corresponding partner event bus in the AWS customer account becomes DELETED. 
    */
  def deletePartnerEventSource(): Request[js.Object, AWSError] = js.native
  def deletePartnerEventSource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This operation is used by SaaS partners to delete a partner event source. This operation is not used by AWS customers. When you delete an event source, the status of the corresponding partner event bus in the AWS customer account becomes DELETED. 
    */
  def deletePartnerEventSource(params: DeletePartnerEventSourceRequest): Request[js.Object, AWSError] = js.native
  def deletePartnerEventSource(
    params: DeletePartnerEventSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified rule. Before you can delete the rule, you must remove all targets, using RemoveTargets. When you delete a rule, incoming events might continue to match to the deleted rule. Allow a short period of time for changes to take effect. Managed rules are rules created and managed by another AWS service on your behalf. These rules are created by those other AWS services to support functionality in those services. You can delete these rules using the Force option, but you should do so only if you are sure the other service is not still using that rule.
    */
  def deleteRule(): Request[js.Object, AWSError] = js.native
  def deleteRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified rule. Before you can delete the rule, you must remove all targets, using RemoveTargets. When you delete a rule, incoming events might continue to match to the deleted rule. Allow a short period of time for changes to take effect. Managed rules are rules created and managed by another AWS service on your behalf. These rules are created by those other AWS services to support functionality in those services. You can delete these rules using the Force option, but you should do so only if you are sure the other service is not still using that rule.
    */
  def deleteRule(params: DeleteRuleRequest): Request[js.Object, AWSError] = js.native
  def deleteRule(params: DeleteRuleRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Retrieves details about an archive.
    */
  def describeArchive(): Request[DescribeArchiveResponse, AWSError] = js.native
  def describeArchive(callback: js.Function2[/* err */ AWSError, /* data */ DescribeArchiveResponse, Unit]): Request[DescribeArchiveResponse, AWSError] = js.native
  /**
    * Retrieves details about an archive.
    */
  def describeArchive(params: DescribeArchiveRequest): Request[DescribeArchiveResponse, AWSError] = js.native
  def describeArchive(
    params: DescribeArchiveRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeArchiveResponse, Unit]
  ): Request[DescribeArchiveResponse, AWSError] = js.native
  
  /**
    * Displays details about an event bus in your account. This can include the external AWS accounts that are permitted to write events to your default event bus, and the associated policy. For custom event buses and partner event buses, it displays the name, ARN, policy, state, and creation time.  To enable your account to receive events from other accounts on its default event bus, use PutPermission. For more information about partner event buses, see CreateEventBus.
    */
  def describeEventBus(): Request[DescribeEventBusResponse, AWSError] = js.native
  def describeEventBus(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventBusResponse, Unit]): Request[DescribeEventBusResponse, AWSError] = js.native
  /**
    * Displays details about an event bus in your account. This can include the external AWS accounts that are permitted to write events to your default event bus, and the associated policy. For custom event buses and partner event buses, it displays the name, ARN, policy, state, and creation time.  To enable your account to receive events from other accounts on its default event bus, use PutPermission. For more information about partner event buses, see CreateEventBus.
    */
  def describeEventBus(params: DescribeEventBusRequest): Request[DescribeEventBusResponse, AWSError] = js.native
  def describeEventBus(
    params: DescribeEventBusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventBusResponse, Unit]
  ): Request[DescribeEventBusResponse, AWSError] = js.native
  
  /**
    * This operation lists details about a partner event source that is shared with your account.
    */
  def describeEventSource(): Request[DescribeEventSourceResponse, AWSError] = js.native
  def describeEventSource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventSourceResponse, Unit]): Request[DescribeEventSourceResponse, AWSError] = js.native
  /**
    * This operation lists details about a partner event source that is shared with your account.
    */
  def describeEventSource(params: DescribeEventSourceRequest): Request[DescribeEventSourceResponse, AWSError] = js.native
  def describeEventSource(
    params: DescribeEventSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventSourceResponse, Unit]
  ): Request[DescribeEventSourceResponse, AWSError] = js.native
  
  /**
    * An SaaS partner can use this operation to list details about a partner event source that they have created. AWS customers do not use this operation. Instead, AWS customers can use DescribeEventSource to see details about a partner event source that is shared with them.
    */
  def describePartnerEventSource(): Request[DescribePartnerEventSourceResponse, AWSError] = js.native
  def describePartnerEventSource(callback: js.Function2[/* err */ AWSError, /* data */ DescribePartnerEventSourceResponse, Unit]): Request[DescribePartnerEventSourceResponse, AWSError] = js.native
  /**
    * An SaaS partner can use this operation to list details about a partner event source that they have created. AWS customers do not use this operation. Instead, AWS customers can use DescribeEventSource to see details about a partner event source that is shared with them.
    */
  def describePartnerEventSource(params: DescribePartnerEventSourceRequest): Request[DescribePartnerEventSourceResponse, AWSError] = js.native
  def describePartnerEventSource(
    params: DescribePartnerEventSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePartnerEventSourceResponse, Unit]
  ): Request[DescribePartnerEventSourceResponse, AWSError] = js.native
  
  /**
    * Retrieves details about a replay. Use DescribeReplay to determine the progress of a running replay. A replay processes events to replay based on the time in the event, and replays them using 1 minute intervals. If you use StartReplay and specify an EventStartTime and an EventEndTime that covers a 20 minute time range, the events are replayed from the first minute of that 20 minute range first. Then the events from the second minute are replayed. You can use DescribeReplay to determine the progress of a replay. The value returned for EventLastReplayedTime indicates the time within the specified time range associated with the last event replayed.
    */
  def describeReplay(): Request[DescribeReplayResponse, AWSError] = js.native
  def describeReplay(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplayResponse, Unit]): Request[DescribeReplayResponse, AWSError] = js.native
  /**
    * Retrieves details about a replay. Use DescribeReplay to determine the progress of a running replay. A replay processes events to replay based on the time in the event, and replays them using 1 minute intervals. If you use StartReplay and specify an EventStartTime and an EventEndTime that covers a 20 minute time range, the events are replayed from the first minute of that 20 minute range first. Then the events from the second minute are replayed. You can use DescribeReplay to determine the progress of a replay. The value returned for EventLastReplayedTime indicates the time within the specified time range associated with the last event replayed.
    */
  def describeReplay(params: DescribeReplayRequest): Request[DescribeReplayResponse, AWSError] = js.native
  def describeReplay(
    params: DescribeReplayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReplayResponse, Unit]
  ): Request[DescribeReplayResponse, AWSError] = js.native
  
  /**
    * Describes the specified rule. DescribeRule does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
    */
  def describeRule(): Request[DescribeRuleResponse, AWSError] = js.native
  def describeRule(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRuleResponse, Unit]): Request[DescribeRuleResponse, AWSError] = js.native
  /**
    * Describes the specified rule. DescribeRule does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
    */
  def describeRule(params: DescribeRuleRequest): Request[DescribeRuleResponse, AWSError] = js.native
  def describeRule(
    params: DescribeRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRuleResponse, Unit]
  ): Request[DescribeRuleResponse, AWSError] = js.native
  
  /**
    * Disables the specified rule. A disabled rule won't match any events, and won't self-trigger if it has a schedule expression. When you disable a rule, incoming events might continue to match to the disabled rule. Allow a short period of time for changes to take effect.
    */
  def disableRule(): Request[js.Object, AWSError] = js.native
  def disableRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disables the specified rule. A disabled rule won't match any events, and won't self-trigger if it has a schedule expression. When you disable a rule, incoming events might continue to match to the disabled rule. Allow a short period of time for changes to take effect.
    */
  def disableRule(params: DisableRuleRequest): Request[js.Object, AWSError] = js.native
  def disableRule(params: DisableRuleRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Enables the specified rule. If the rule does not exist, the operation fails. When you enable a rule, incoming events might not immediately start matching to a newly enabled rule. Allow a short period of time for changes to take effect.
    */
  def enableRule(): Request[js.Object, AWSError] = js.native
  def enableRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Enables the specified rule. If the rule does not exist, the operation fails. When you enable a rule, incoming events might not immediately start matching to a newly enabled rule. Allow a short period of time for changes to take effect.
    */
  def enableRule(params: EnableRuleRequest): Request[js.Object, AWSError] = js.native
  def enableRule(params: EnableRuleRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Lists your archives. You can either list all the archives or you can provide a prefix to match to the archive names. Filter parameters are exclusive.
    */
  def listArchives(): Request[ListArchivesResponse, AWSError] = js.native
  def listArchives(callback: js.Function2[/* err */ AWSError, /* data */ ListArchivesResponse, Unit]): Request[ListArchivesResponse, AWSError] = js.native
  /**
    * Lists your archives. You can either list all the archives or you can provide a prefix to match to the archive names. Filter parameters are exclusive.
    */
  def listArchives(params: ListArchivesRequest): Request[ListArchivesResponse, AWSError] = js.native
  def listArchives(
    params: ListArchivesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListArchivesResponse, Unit]
  ): Request[ListArchivesResponse, AWSError] = js.native
  
  /**
    * Lists all the event buses in your account, including the default event bus, custom event buses, and partner event buses.
    */
  def listEventBuses(): Request[ListEventBusesResponse, AWSError] = js.native
  def listEventBuses(callback: js.Function2[/* err */ AWSError, /* data */ ListEventBusesResponse, Unit]): Request[ListEventBusesResponse, AWSError] = js.native
  /**
    * Lists all the event buses in your account, including the default event bus, custom event buses, and partner event buses.
    */
  def listEventBuses(params: ListEventBusesRequest): Request[ListEventBusesResponse, AWSError] = js.native
  def listEventBuses(
    params: ListEventBusesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEventBusesResponse, Unit]
  ): Request[ListEventBusesResponse, AWSError] = js.native
  
  /**
    * You can use this to see all the partner event sources that have been shared with your AWS account. For more information about partner event sources, see CreateEventBus.
    */
  def listEventSources(): Request[ListEventSourcesResponse, AWSError] = js.native
  def listEventSources(callback: js.Function2[/* err */ AWSError, /* data */ ListEventSourcesResponse, Unit]): Request[ListEventSourcesResponse, AWSError] = js.native
  /**
    * You can use this to see all the partner event sources that have been shared with your AWS account. For more information about partner event sources, see CreateEventBus.
    */
  def listEventSources(params: ListEventSourcesRequest): Request[ListEventSourcesResponse, AWSError] = js.native
  def listEventSources(
    params: ListEventSourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEventSourcesResponse, Unit]
  ): Request[ListEventSourcesResponse, AWSError] = js.native
  
  /**
    * An SaaS partner can use this operation to display the AWS account ID that a particular partner event source name is associated with. This operation is not used by AWS customers.
    */
  def listPartnerEventSourceAccounts(): Request[ListPartnerEventSourceAccountsResponse, AWSError] = js.native
  def listPartnerEventSourceAccounts(
    callback: js.Function2[/* err */ AWSError, /* data */ ListPartnerEventSourceAccountsResponse, Unit]
  ): Request[ListPartnerEventSourceAccountsResponse, AWSError] = js.native
  /**
    * An SaaS partner can use this operation to display the AWS account ID that a particular partner event source name is associated with. This operation is not used by AWS customers.
    */
  def listPartnerEventSourceAccounts(params: ListPartnerEventSourceAccountsRequest): Request[ListPartnerEventSourceAccountsResponse, AWSError] = js.native
  def listPartnerEventSourceAccounts(
    params: ListPartnerEventSourceAccountsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPartnerEventSourceAccountsResponse, Unit]
  ): Request[ListPartnerEventSourceAccountsResponse, AWSError] = js.native
  
  /**
    * An SaaS partner can use this operation to list all the partner event source names that they have created. This operation is not used by AWS customers.
    */
  def listPartnerEventSources(): Request[ListPartnerEventSourcesResponse, AWSError] = js.native
  def listPartnerEventSources(callback: js.Function2[/* err */ AWSError, /* data */ ListPartnerEventSourcesResponse, Unit]): Request[ListPartnerEventSourcesResponse, AWSError] = js.native
  /**
    * An SaaS partner can use this operation to list all the partner event source names that they have created. This operation is not used by AWS customers.
    */
  def listPartnerEventSources(params: ListPartnerEventSourcesRequest): Request[ListPartnerEventSourcesResponse, AWSError] = js.native
  def listPartnerEventSources(
    params: ListPartnerEventSourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPartnerEventSourcesResponse, Unit]
  ): Request[ListPartnerEventSourcesResponse, AWSError] = js.native
  
  /**
    * Lists your replays. You can either list all the replays or you can provide a prefix to match to the replay names. Filter parameters are exclusive.
    */
  def listReplays(): Request[ListReplaysResponse, AWSError] = js.native
  def listReplays(callback: js.Function2[/* err */ AWSError, /* data */ ListReplaysResponse, Unit]): Request[ListReplaysResponse, AWSError] = js.native
  /**
    * Lists your replays. You can either list all the replays or you can provide a prefix to match to the replay names. Filter parameters are exclusive.
    */
  def listReplays(params: ListReplaysRequest): Request[ListReplaysResponse, AWSError] = js.native
  def listReplays(
    params: ListReplaysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReplaysResponse, Unit]
  ): Request[ListReplaysResponse, AWSError] = js.native
  
  /**
    * Lists the rules for the specified target. You can see which of the rules in Amazon EventBridge can invoke a specific target in your account.
    */
  def listRuleNamesByTarget(): Request[ListRuleNamesByTargetResponse, AWSError] = js.native
  def listRuleNamesByTarget(callback: js.Function2[/* err */ AWSError, /* data */ ListRuleNamesByTargetResponse, Unit]): Request[ListRuleNamesByTargetResponse, AWSError] = js.native
  /**
    * Lists the rules for the specified target. You can see which of the rules in Amazon EventBridge can invoke a specific target in your account.
    */
  def listRuleNamesByTarget(params: ListRuleNamesByTargetRequest): Request[ListRuleNamesByTargetResponse, AWSError] = js.native
  def listRuleNamesByTarget(
    params: ListRuleNamesByTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRuleNamesByTargetResponse, Unit]
  ): Request[ListRuleNamesByTargetResponse, AWSError] = js.native
  
  /**
    * Lists your Amazon EventBridge rules. You can either list all the rules or you can provide a prefix to match to the rule names. ListRules does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
    */
  def listRules(): Request[ListRulesResponse, AWSError] = js.native
  def listRules(callback: js.Function2[/* err */ AWSError, /* data */ ListRulesResponse, Unit]): Request[ListRulesResponse, AWSError] = js.native
  /**
    * Lists your Amazon EventBridge rules. You can either list all the rules or you can provide a prefix to match to the rule names. ListRules does not list the targets of a rule. To see the targets associated with a rule, use ListTargetsByRule.
    */
  def listRules(params: ListRulesRequest): Request[ListRulesResponse, AWSError] = js.native
  def listRules(
    params: ListRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRulesResponse, Unit]
  ): Request[ListRulesResponse, AWSError] = js.native
  
  /**
    * Displays the tags associated with an EventBridge resource. In EventBridge, rules and event buses can be tagged.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Displays the tags associated with an EventBridge resource. In EventBridge, rules and event buses can be tagged.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists the targets assigned to the specified rule.
    */
  def listTargetsByRule(): Request[ListTargetsByRuleResponse, AWSError] = js.native
  def listTargetsByRule(callback: js.Function2[/* err */ AWSError, /* data */ ListTargetsByRuleResponse, Unit]): Request[ListTargetsByRuleResponse, AWSError] = js.native
  /**
    * Lists the targets assigned to the specified rule.
    */
  def listTargetsByRule(params: ListTargetsByRuleRequest): Request[ListTargetsByRuleResponse, AWSError] = js.native
  def listTargetsByRule(
    params: ListTargetsByRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTargetsByRuleResponse, Unit]
  ): Request[ListTargetsByRuleResponse, AWSError] = js.native
  
  /**
    * Sends custom events to Amazon EventBridge so that they can be matched to rules.
    */
  def putEvents(): Request[PutEventsResponse, AWSError] = js.native
  def putEvents(callback: js.Function2[/* err */ AWSError, /* data */ PutEventsResponse, Unit]): Request[PutEventsResponse, AWSError] = js.native
  /**
    * Sends custom events to Amazon EventBridge so that they can be matched to rules.
    */
  def putEvents(params: PutEventsRequest): Request[PutEventsResponse, AWSError] = js.native
  def putEvents(
    params: PutEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutEventsResponse, Unit]
  ): Request[PutEventsResponse, AWSError] = js.native
  
  /**
    * This is used by SaaS partners to write events to a customer's partner event bus. AWS customers do not use this operation.
    */
  def putPartnerEvents(): Request[PutPartnerEventsResponse, AWSError] = js.native
  def putPartnerEvents(callback: js.Function2[/* err */ AWSError, /* data */ PutPartnerEventsResponse, Unit]): Request[PutPartnerEventsResponse, AWSError] = js.native
  /**
    * This is used by SaaS partners to write events to a customer's partner event bus. AWS customers do not use this operation.
    */
  def putPartnerEvents(params: PutPartnerEventsRequest): Request[PutPartnerEventsResponse, AWSError] = js.native
  def putPartnerEvents(
    params: PutPartnerEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutPartnerEventsResponse, Unit]
  ): Request[PutPartnerEventsResponse, AWSError] = js.native
  
  /**
    * Running PutPermission permits the specified AWS account or AWS organization to put events to the specified event bus. Amazon EventBridge (CloudWatch Events) rules in your account are triggered by these events arriving to an event bus in your account.  For another account to send events to your account, that external account must have an EventBridge rule with your account's event bus as a target. To enable multiple AWS accounts to put events to your event bus, run PutPermission once for each of these accounts. Or, if all the accounts are members of the same AWS organization, you can run PutPermission once specifying Principal as "*" and specifying the AWS organization ID in Condition, to grant permissions to all accounts in that organization. If you grant permissions using an organization, then accounts in that organization must specify a RoleArn with proper permissions when they use PutTarget to add your account's event bus as a target. For more information, see Sending and Receiving Events Between AWS Accounts in the Amazon EventBridge User Guide. The permission policy on the default event bus cannot exceed 10 KB in size.
    */
  def putPermission(): Request[js.Object, AWSError] = js.native
  def putPermission(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Running PutPermission permits the specified AWS account or AWS organization to put events to the specified event bus. Amazon EventBridge (CloudWatch Events) rules in your account are triggered by these events arriving to an event bus in your account.  For another account to send events to your account, that external account must have an EventBridge rule with your account's event bus as a target. To enable multiple AWS accounts to put events to your event bus, run PutPermission once for each of these accounts. Or, if all the accounts are members of the same AWS organization, you can run PutPermission once specifying Principal as "*" and specifying the AWS organization ID in Condition, to grant permissions to all accounts in that organization. If you grant permissions using an organization, then accounts in that organization must specify a RoleArn with proper permissions when they use PutTarget to add your account's event bus as a target. For more information, see Sending and Receiving Events Between AWS Accounts in the Amazon EventBridge User Guide. The permission policy on the default event bus cannot exceed 10 KB in size.
    */
  def putPermission(params: PutPermissionRequest): Request[js.Object, AWSError] = js.native
  def putPermission(
    params: PutPermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates or updates the specified rule. Rules are enabled by default, or based on value of the state. You can disable a rule using DisableRule. A single rule watches for events from a single event bus. Events generated by AWS services go to your account's default event bus. Events generated by SaaS partner services or applications go to the matching partner event bus. If you have custom applications or services, you can specify whether their events go to your default event bus or a custom event bus that you have created. For more information, see CreateEventBus. If you are updating an existing rule, the rule is replaced with what you specify in this PutRule command. If you omit arguments in PutRule, the old values for those arguments are not kept. Instead, they are replaced with null values. When you create or update a rule, incoming events might not immediately start matching to new or updated rules. Allow a short period of time for changes to take effect. A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns are triggered when a matching event is observed. Rules with ScheduleExpressions self-trigger based on the given schedule. A rule can have both an EventPattern and a ScheduleExpression, in which case the rule triggers on matching events as well as on a schedule. When you initially create a rule, you can optionally assign one or more tags to the rule. Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only rules with certain tag values. To use the PutRule operation and assign tags, you must have both the events:PutRule and events:TagResource permissions. If you are updating an existing rule, any tags you specify in the PutRule operation are ignored. To update the tags of an existing rule, use TagResource and UntagResource. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, EventBridge uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match. In EventBridge, it is possible to create rules that lead to infinite loops, where a rule is fired repeatedly. For example, a rule might detect that ACLs have changed on an S3 bucket, and trigger software to change them to the desired state. If the rule is not written carefully, the subsequent change to the ACLs fires the rule again, creating an infinite loop. To prevent this, write the rules so that the triggered actions do not re-fire the same rule. For example, your rule could fire only if ACLs are found to be in a bad state, instead of after any change.  An infinite loop can quickly cause higher than expected charges. We recommend that you use budgeting, which alerts you when charges exceed your specified limit. For more information, see Managing Your Costs with Budgets.
    */
  def putRule(): Request[PutRuleResponse, AWSError] = js.native
  def putRule(callback: js.Function2[/* err */ AWSError, /* data */ PutRuleResponse, Unit]): Request[PutRuleResponse, AWSError] = js.native
  /**
    * Creates or updates the specified rule. Rules are enabled by default, or based on value of the state. You can disable a rule using DisableRule. A single rule watches for events from a single event bus. Events generated by AWS services go to your account's default event bus. Events generated by SaaS partner services or applications go to the matching partner event bus. If you have custom applications or services, you can specify whether their events go to your default event bus or a custom event bus that you have created. For more information, see CreateEventBus. If you are updating an existing rule, the rule is replaced with what you specify in this PutRule command. If you omit arguments in PutRule, the old values for those arguments are not kept. Instead, they are replaced with null values. When you create or update a rule, incoming events might not immediately start matching to new or updated rules. Allow a short period of time for changes to take effect. A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns are triggered when a matching event is observed. Rules with ScheduleExpressions self-trigger based on the given schedule. A rule can have both an EventPattern and a ScheduleExpression, in which case the rule triggers on matching events as well as on a schedule. When you initially create a rule, you can optionally assign one or more tags to the rule. Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only rules with certain tag values. To use the PutRule operation and assign tags, you must have both the events:PutRule and events:TagResource permissions. If you are updating an existing rule, any tags you specify in the PutRule operation are ignored. To update the tags of an existing rule, use TagResource and UntagResource. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, EventBridge uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match. In EventBridge, it is possible to create rules that lead to infinite loops, where a rule is fired repeatedly. For example, a rule might detect that ACLs have changed on an S3 bucket, and trigger software to change them to the desired state. If the rule is not written carefully, the subsequent change to the ACLs fires the rule again, creating an infinite loop. To prevent this, write the rules so that the triggered actions do not re-fire the same rule. For example, your rule could fire only if ACLs are found to be in a bad state, instead of after any change.  An infinite loop can quickly cause higher than expected charges. We recommend that you use budgeting, which alerts you when charges exceed your specified limit. For more information, see Managing Your Costs with Budgets.
    */
  def putRule(params: PutRuleRequest): Request[PutRuleResponse, AWSError] = js.native
  def putRule(
    params: PutRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRuleResponse, Unit]
  ): Request[PutRuleResponse, AWSError] = js.native
  
  /**
    * Adds the specified targets to the specified rule, or updates the targets if they are already associated with the rule. Targets are the resources that are invoked when a rule is triggered. You can configure the following as targets for Events:   EC2 instances   SSM Run Command   SSM Automation   AWS Lambda functions   Data streams in Amazon Kinesis Data Streams   Data delivery streams in Amazon Kinesis Data Firehose   Amazon ECS tasks   AWS Step Functions state machines   AWS Batch jobs   AWS CodeBuild projects   Pipelines in AWS CodePipeline   Amazon Inspector assessment templates   Amazon SNS topics   Amazon SQS queues, including FIFO queues   The default event bus of another AWS account   Amazon API Gateway REST APIs   Redshift Clusters to invoke Data API ExecuteStatement on   Creating rules with built-in targets is supported only in the AWS Management Console. The built-in targets are EC2 CreateSnapshot API call, EC2 RebootInstances API call, EC2 StopInstances API call, and EC2 TerminateInstances API call.  For some target types, PutTargets provides target-specific parameters. If the target is a Kinesis data stream, you can optionally specify which shard the event goes to by using the KinesisParameters argument. To invoke a command on multiple EC2 instances with one rule, you can use the RunCommandParameters field. To be able to make API calls against the resources that you own, Amazon EventBridge (CloudWatch Events) needs the appropriate permissions. For AWS Lambda and Amazon SNS resources, EventBridge relies on resource-based policies. For EC2 instances, Kinesis data streams, AWS Step Functions state machines and API Gateway REST APIs, EventBridge relies on IAM roles that you specify in the RoleARN argument in PutTargets. For more information, see Authentication and Access Control in the Amazon EventBridge User Guide. If another AWS account is in the same region and has granted you permission (using PutPermission), you can send events to that account. Set that account's event bus as a target of the rules in your account. To send the matched events to the other account, specify that account's event bus as the Arn value when you run PutTargets. If your account sends events to another account, your account is charged for each sent event. Each event sent to another account is charged as a custom event. The account receiving the event is not charged. For more information, see Amazon EventBridge (CloudWatch Events) Pricing.   Input, InputPath, and InputTransformer are not available with PutTarget if the target is an event bus of a different AWS account.  If you are setting the event bus of another account as the target, and that account granted permission to your account through an organization instead of directly by the account ID, then you must specify a RoleArn with proper permissions in the Target structure. For more information, see Sending and Receiving Events Between AWS Accounts in the Amazon EventBridge User Guide. For more information about enabling cross-account events, see PutPermission.  Input, InputPath, and InputTransformer are mutually exclusive and optional parameters of a target. When a rule is triggered due to a matched event:   If none of the following arguments are specified for a target, then the entire event is passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS task, in which case nothing from the event is passed to the target).   If Input is specified in the form of valid JSON, then the matched event is overridden with this constant.   If InputPath is specified in the form of JSONPath (for example, $.detail), then only the part of the event specified in the path is passed to the target (for example, only the detail part of the event is passed).   If InputTransformer is specified, then one or more specified JSONPaths are extracted from the event and used as values in a template that you specify as the input to the target.   When you specify InputPath or InputTransformer, you must use JSON dot notation, not bracket notation. When you add targets to a rule and the associated rule triggers soon after, new or updated targets might not be immediately invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
    */
  def putTargets(): Request[PutTargetsResponse, AWSError] = js.native
  def putTargets(callback: js.Function2[/* err */ AWSError, /* data */ PutTargetsResponse, Unit]): Request[PutTargetsResponse, AWSError] = js.native
  /**
    * Adds the specified targets to the specified rule, or updates the targets if they are already associated with the rule. Targets are the resources that are invoked when a rule is triggered. You can configure the following as targets for Events:   EC2 instances   SSM Run Command   SSM Automation   AWS Lambda functions   Data streams in Amazon Kinesis Data Streams   Data delivery streams in Amazon Kinesis Data Firehose   Amazon ECS tasks   AWS Step Functions state machines   AWS Batch jobs   AWS CodeBuild projects   Pipelines in AWS CodePipeline   Amazon Inspector assessment templates   Amazon SNS topics   Amazon SQS queues, including FIFO queues   The default event bus of another AWS account   Amazon API Gateway REST APIs   Redshift Clusters to invoke Data API ExecuteStatement on   Creating rules with built-in targets is supported only in the AWS Management Console. The built-in targets are EC2 CreateSnapshot API call, EC2 RebootInstances API call, EC2 StopInstances API call, and EC2 TerminateInstances API call.  For some target types, PutTargets provides target-specific parameters. If the target is a Kinesis data stream, you can optionally specify which shard the event goes to by using the KinesisParameters argument. To invoke a command on multiple EC2 instances with one rule, you can use the RunCommandParameters field. To be able to make API calls against the resources that you own, Amazon EventBridge (CloudWatch Events) needs the appropriate permissions. For AWS Lambda and Amazon SNS resources, EventBridge relies on resource-based policies. For EC2 instances, Kinesis data streams, AWS Step Functions state machines and API Gateway REST APIs, EventBridge relies on IAM roles that you specify in the RoleARN argument in PutTargets. For more information, see Authentication and Access Control in the Amazon EventBridge User Guide. If another AWS account is in the same region and has granted you permission (using PutPermission), you can send events to that account. Set that account's event bus as a target of the rules in your account. To send the matched events to the other account, specify that account's event bus as the Arn value when you run PutTargets. If your account sends events to another account, your account is charged for each sent event. Each event sent to another account is charged as a custom event. The account receiving the event is not charged. For more information, see Amazon EventBridge (CloudWatch Events) Pricing.   Input, InputPath, and InputTransformer are not available with PutTarget if the target is an event bus of a different AWS account.  If you are setting the event bus of another account as the target, and that account granted permission to your account through an organization instead of directly by the account ID, then you must specify a RoleArn with proper permissions in the Target structure. For more information, see Sending and Receiving Events Between AWS Accounts in the Amazon EventBridge User Guide. For more information about enabling cross-account events, see PutPermission.  Input, InputPath, and InputTransformer are mutually exclusive and optional parameters of a target. When a rule is triggered due to a matched event:   If none of the following arguments are specified for a target, then the entire event is passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS task, in which case nothing from the event is passed to the target).   If Input is specified in the form of valid JSON, then the matched event is overridden with this constant.   If InputPath is specified in the form of JSONPath (for example, $.detail), then only the part of the event specified in the path is passed to the target (for example, only the detail part of the event is passed).   If InputTransformer is specified, then one or more specified JSONPaths are extracted from the event and used as values in a template that you specify as the input to the target.   When you specify InputPath or InputTransformer, you must use JSON dot notation, not bracket notation. When you add targets to a rule and the associated rule triggers soon after, new or updated targets might not be immediately invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
    */
  def putTargets(params: PutTargetsRequest): Request[PutTargetsResponse, AWSError] = js.native
  def putTargets(
    params: PutTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutTargetsResponse, Unit]
  ): Request[PutTargetsResponse, AWSError] = js.native
  
  /**
    * Revokes the permission of another AWS account to be able to put events to the specified event bus. Specify the account to revoke by the StatementId value that you associated with the account when you granted it permission with PutPermission. You can find the StatementId by using DescribeEventBus.
    */
  def removePermission(): Request[js.Object, AWSError] = js.native
  def removePermission(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Revokes the permission of another AWS account to be able to put events to the specified event bus. Specify the account to revoke by the StatementId value that you associated with the account when you granted it permission with PutPermission. You can find the StatementId by using DescribeEventBus.
    */
  def removePermission(params: RemovePermissionRequest): Request[js.Object, AWSError] = js.native
  def removePermission(
    params: RemovePermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the specified targets from the specified rule. When the rule is triggered, those targets are no longer be invoked. When you remove a target, when the associated rule triggers, removed targets might continue to be invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
    */
  def removeTargets(): Request[RemoveTargetsResponse, AWSError] = js.native
  def removeTargets(callback: js.Function2[/* err */ AWSError, /* data */ RemoveTargetsResponse, Unit]): Request[RemoveTargetsResponse, AWSError] = js.native
  /**
    * Removes the specified targets from the specified rule. When the rule is triggered, those targets are no longer be invoked. When you remove a target, when the associated rule triggers, removed targets might continue to be invoked. Allow a short period of time for changes to take effect. This action can partially fail if too many requests are made at the same time. If that happens, FailedEntryCount is non-zero in the response and each entry in FailedEntries provides the ID of the failed target and the error code.
    */
  def removeTargets(params: RemoveTargetsRequest): Request[RemoveTargetsResponse, AWSError] = js.native
  def removeTargets(
    params: RemoveTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveTargetsResponse, Unit]
  ): Request[RemoveTargetsResponse, AWSError] = js.native
  
  /**
    * Starts the specified replay. Events are not necessarily replayed in the exact same order that they were added to the archive. A replay processes events to replay based on the time in the event, and replays them using 1 minute intervals. If you specify an EventStartTime and an EventEndTime that covers a 20 minute time range, the events are replayed from the first minute of that 20 minute range first. Then the events from the second minute are replayed. You can use DescribeReplay to determine the progress of a replay. The value returned for EventLastReplayedTime indicates the time within the specified time range associated with the last event replayed.
    */
  def startReplay(): Request[StartReplayResponse, AWSError] = js.native
  def startReplay(callback: js.Function2[/* err */ AWSError, /* data */ StartReplayResponse, Unit]): Request[StartReplayResponse, AWSError] = js.native
  /**
    * Starts the specified replay. Events are not necessarily replayed in the exact same order that they were added to the archive. A replay processes events to replay based on the time in the event, and replays them using 1 minute intervals. If you specify an EventStartTime and an EventEndTime that covers a 20 minute time range, the events are replayed from the first minute of that 20 minute range first. Then the events from the second minute are replayed. You can use DescribeReplay to determine the progress of a replay. The value returned for EventLastReplayedTime indicates the time within the specified time range associated with the last event replayed.
    */
  def startReplay(params: StartReplayRequest): Request[StartReplayResponse, AWSError] = js.native
  def startReplay(
    params: StartReplayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartReplayResponse, Unit]
  ): Request[StartReplayResponse, AWSError] = js.native
  
  /**
    * Assigns one or more tags (key-value pairs) to the specified EventBridge resource. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. In EventBridge, rules and event buses can be tagged. Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters. You can use the TagResource action with a resource that already has tags. If you specify a new tag key, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified EventBridge resource. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. In EventBridge, rules and event buses can be tagged. Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters. You can use the TagResource action with a resource that already has tags. If you specify a new tag key, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Tests whether the specified event pattern matches the provided event. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, EventBridge uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match.
    */
  def testEventPattern(): Request[TestEventPatternResponse, AWSError] = js.native
  def testEventPattern(callback: js.Function2[/* err */ AWSError, /* data */ TestEventPatternResponse, Unit]): Request[TestEventPatternResponse, AWSError] = js.native
  /**
    * Tests whether the specified event pattern matches the provided event. Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, EventBridge uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event patterns so that they match the ARN syntax in the event you want to match.
    */
  def testEventPattern(params: TestEventPatternRequest): Request[TestEventPatternResponse, AWSError] = js.native
  def testEventPattern(
    params: TestEventPatternRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TestEventPatternResponse, Unit]
  ): Request[TestEventPatternResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from the specified EventBridge resource. In Amazon EventBridge (CloudWatch Events, rules and event buses can be tagged.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from the specified EventBridge resource. In Amazon EventBridge (CloudWatch Events, rules and event buses can be tagged.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the specified archive.
    */
  def updateArchive(): Request[UpdateArchiveResponse, AWSError] = js.native
  def updateArchive(callback: js.Function2[/* err */ AWSError, /* data */ UpdateArchiveResponse, Unit]): Request[UpdateArchiveResponse, AWSError] = js.native
  /**
    * Updates the specified archive.
    */
  def updateArchive(params: UpdateArchiveRequest): Request[UpdateArchiveResponse, AWSError] = js.native
  def updateArchive(
    params: UpdateArchiveRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateArchiveResponse, Unit]
  ): Request[UpdateArchiveResponse, AWSError] = js.native
}
