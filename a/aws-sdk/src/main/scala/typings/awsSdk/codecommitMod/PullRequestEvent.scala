package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullRequestEvent extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the pull request with more commits or changing the status of a pull request.
    */
  var actorArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Information about a pull request event.
    */
  var approvalRuleEventMetadata: js.UndefOr[ApprovalRuleEventMetadata] = js.undefined
  
  /**
    * Information about an approval rule override event for a pull request.
    */
  var approvalRuleOverriddenEventMetadata: js.UndefOr[ApprovalRuleOverriddenEventMetadata] = js.undefined
  
  /**
    * Information about an approval state change for a pull request.
    */
  var approvalStateChangedEventMetadata: js.UndefOr[ApprovalStateChangedEventMetadata] = js.undefined
  
  /**
    * The day and time of the pull request event, in timestamp format.
    */
  var eventDate: js.UndefOr[EventDate] = js.undefined
  
  /**
    * Information about the source and destination branches for the pull request.
    */
  var pullRequestCreatedEventMetadata: js.UndefOr[PullRequestCreatedEventMetadata] = js.undefined
  
  /**
    * The type of the pull request event (for example, a status change event (PULL_REQUEST_STATUS_CHANGED) or update event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED)).
    */
  var pullRequestEventType: js.UndefOr[PullRequestEventType] = js.undefined
  
  /**
    * The system-generated ID of the pull request.
    */
  var pullRequestId: js.UndefOr[PullRequestId] = js.undefined
  
  /**
    * Information about the change in mergability state for the pull request event.
    */
  var pullRequestMergedStateChangedEventMetadata: js.UndefOr[PullRequestMergedStateChangedEventMetadata] = js.undefined
  
  /**
    * Information about the updated source branch for the pull request event. 
    */
  var pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[PullRequestSourceReferenceUpdatedEventMetadata] = js.undefined
  
  /**
    * Information about the change in status for the pull request event.
    */
  var pullRequestStatusChangedEventMetadata: js.UndefOr[PullRequestStatusChangedEventMetadata] = js.undefined
}
object PullRequestEvent {
  
  @scala.inline
  def apply(): PullRequestEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestEvent]
  }
  
  @scala.inline
  implicit class PullRequestEventMutableBuilder[Self <: PullRequestEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActorArn(value: Arn): Self = StObject.set(x, "actorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActorArnUndefined: Self = StObject.set(x, "actorArn", js.undefined)
    
    @scala.inline
    def setApprovalRuleEventMetadata(value: ApprovalRuleEventMetadata): Self = StObject.set(x, "approvalRuleEventMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalRuleEventMetadataUndefined: Self = StObject.set(x, "approvalRuleEventMetadata", js.undefined)
    
    @scala.inline
    def setApprovalRuleOverriddenEventMetadata(value: ApprovalRuleOverriddenEventMetadata): Self = StObject.set(x, "approvalRuleOverriddenEventMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalRuleOverriddenEventMetadataUndefined: Self = StObject.set(x, "approvalRuleOverriddenEventMetadata", js.undefined)
    
    @scala.inline
    def setApprovalStateChangedEventMetadata(value: ApprovalStateChangedEventMetadata): Self = StObject.set(x, "approvalStateChangedEventMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalStateChangedEventMetadataUndefined: Self = StObject.set(x, "approvalStateChangedEventMetadata", js.undefined)
    
    @scala.inline
    def setEventDate(value: EventDate): Self = StObject.set(x, "eventDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDateUndefined: Self = StObject.set(x, "eventDate", js.undefined)
    
    @scala.inline
    def setPullRequestCreatedEventMetadata(value: PullRequestCreatedEventMetadata): Self = StObject.set(x, "pullRequestCreatedEventMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestCreatedEventMetadataUndefined: Self = StObject.set(x, "pullRequestCreatedEventMetadata", js.undefined)
    
    @scala.inline
    def setPullRequestEventType(value: PullRequestEventType): Self = StObject.set(x, "pullRequestEventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestEventTypeUndefined: Self = StObject.set(x, "pullRequestEventType", js.undefined)
    
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestIdUndefined: Self = StObject.set(x, "pullRequestId", js.undefined)
    
    @scala.inline
    def setPullRequestMergedStateChangedEventMetadata(value: PullRequestMergedStateChangedEventMetadata): Self = StObject.set(x, "pullRequestMergedStateChangedEventMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestMergedStateChangedEventMetadataUndefined: Self = StObject.set(x, "pullRequestMergedStateChangedEventMetadata", js.undefined)
    
    @scala.inline
    def setPullRequestSourceReferenceUpdatedEventMetadata(value: PullRequestSourceReferenceUpdatedEventMetadata): Self = StObject.set(x, "pullRequestSourceReferenceUpdatedEventMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestSourceReferenceUpdatedEventMetadataUndefined: Self = StObject.set(x, "pullRequestSourceReferenceUpdatedEventMetadata", js.undefined)
    
    @scala.inline
    def setPullRequestStatusChangedEventMetadata(value: PullRequestStatusChangedEventMetadata): Self = StObject.set(x, "pullRequestStatusChangedEventMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestStatusChangedEventMetadataUndefined: Self = StObject.set(x, "pullRequestStatusChangedEventMetadata", js.undefined)
  }
}
