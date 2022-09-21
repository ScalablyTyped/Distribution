package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_CREATED
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_MERGE_STATE_CHANGED
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_SOURCE_REFERENCE_UPDATED
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_STATUS_CHANGED
import typings.awsSdkClientCodecommitNode.typesPullRequestCreatedEventMetadataMod.PullRequestCreatedEventMetadata
import typings.awsSdkClientCodecommitNode.typesPullRequestCreatedEventMetadataMod.UnmarshalledPullRequestCreatedEventMetadata
import typings.awsSdkClientCodecommitNode.typesPullRequestMergedStateChangedEventMetadataMod.PullRequestMergedStateChangedEventMetadata
import typings.awsSdkClientCodecommitNode.typesPullRequestMergedStateChangedEventMetadataMod.UnmarshalledPullRequestMergedStateChangedEventMetadata
import typings.awsSdkClientCodecommitNode.typesPullRequestSourceReferenceUpdatedEventMetadataMod.PullRequestSourceReferenceUpdatedEventMetadata
import typings.awsSdkClientCodecommitNode.typesPullRequestSourceReferenceUpdatedEventMetadataMod.UnmarshalledPullRequestSourceReferenceUpdatedEventMetadata
import typings.awsSdkClientCodecommitNode.typesPullRequestStatusChangedEventMetadataMod.PullRequestStatusChangedEventMetadata
import typings.awsSdkClientCodecommitNode.typesPullRequestStatusChangedEventMetadataMod.UnmarshalledPullRequestStatusChangedEventMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPullRequestEventMod {
  
  trait PullRequestEvent extends StObject {
    
    /**
      * <p>The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the pull request with additional commits or changing the status of a pull request.</p>
      */
    var actorArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The day and time of the pull request event, in timestamp format.</p>
      */
    var eventDate: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>Information about the source and destination branches for the pull request.</p>
      */
    var pullRequestCreatedEventMetadata: js.UndefOr[PullRequestCreatedEventMetadata] = js.undefined
    
    /**
      * <p>The type of the pull request event, for example a status change event (PULL_REQUEST_STATUS_CHANGED) or update event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED).</p>
      */
    var pullRequestEventType: js.UndefOr[
        PULL_REQUEST_CREATED | PULL_REQUEST_STATUS_CHANGED | PULL_REQUEST_SOURCE_REFERENCE_UPDATED | PULL_REQUEST_MERGE_STATE_CHANGED | String
      ] = js.undefined
    
    /**
      * <p>The system-generated ID of the pull request.</p>
      */
    var pullRequestId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Information about the change in mergability state for the pull request event.</p>
      */
    var pullRequestMergedStateChangedEventMetadata: js.UndefOr[PullRequestMergedStateChangedEventMetadata] = js.undefined
    
    /**
      * <p>Information about the updated source branch for the pull request event. </p>
      */
    var pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[PullRequestSourceReferenceUpdatedEventMetadata] = js.undefined
    
    /**
      * <p>Information about the change in status for the pull request event.</p>
      */
    var pullRequestStatusChangedEventMetadata: js.UndefOr[PullRequestStatusChangedEventMetadata] = js.undefined
  }
  object PullRequestEvent {
    
    inline def apply(): PullRequestEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PullRequestEvent]
    }
    
    extension [Self <: PullRequestEvent](x: Self) {
      
      inline def setActorArn(value: String): Self = StObject.set(x, "actorArn", value.asInstanceOf[js.Any])
      
      inline def setActorArnUndefined: Self = StObject.set(x, "actorArn", js.undefined)
      
      inline def setEventDate(value: js.Date | String | Double): Self = StObject.set(x, "eventDate", value.asInstanceOf[js.Any])
      
      inline def setEventDateUndefined: Self = StObject.set(x, "eventDate", js.undefined)
      
      inline def setPullRequestCreatedEventMetadata(value: PullRequestCreatedEventMetadata): Self = StObject.set(x, "pullRequestCreatedEventMetadata", value.asInstanceOf[js.Any])
      
      inline def setPullRequestCreatedEventMetadataUndefined: Self = StObject.set(x, "pullRequestCreatedEventMetadata", js.undefined)
      
      inline def setPullRequestEventType(
        value: PULL_REQUEST_CREATED | PULL_REQUEST_STATUS_CHANGED | PULL_REQUEST_SOURCE_REFERENCE_UPDATED | PULL_REQUEST_MERGE_STATE_CHANGED | String
      ): Self = StObject.set(x, "pullRequestEventType", value.asInstanceOf[js.Any])
      
      inline def setPullRequestEventTypeUndefined: Self = StObject.set(x, "pullRequestEventType", js.undefined)
      
      inline def setPullRequestId(value: String): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
      
      inline def setPullRequestIdUndefined: Self = StObject.set(x, "pullRequestId", js.undefined)
      
      inline def setPullRequestMergedStateChangedEventMetadata(value: PullRequestMergedStateChangedEventMetadata): Self = StObject.set(x, "pullRequestMergedStateChangedEventMetadata", value.asInstanceOf[js.Any])
      
      inline def setPullRequestMergedStateChangedEventMetadataUndefined: Self = StObject.set(x, "pullRequestMergedStateChangedEventMetadata", js.undefined)
      
      inline def setPullRequestSourceReferenceUpdatedEventMetadata(value: PullRequestSourceReferenceUpdatedEventMetadata): Self = StObject.set(x, "pullRequestSourceReferenceUpdatedEventMetadata", value.asInstanceOf[js.Any])
      
      inline def setPullRequestSourceReferenceUpdatedEventMetadataUndefined: Self = StObject.set(x, "pullRequestSourceReferenceUpdatedEventMetadata", js.undefined)
      
      inline def setPullRequestStatusChangedEventMetadata(value: PullRequestStatusChangedEventMetadata): Self = StObject.set(x, "pullRequestStatusChangedEventMetadata", value.asInstanceOf[js.Any])
      
      inline def setPullRequestStatusChangedEventMetadataUndefined: Self = StObject.set(x, "pullRequestStatusChangedEventMetadata", js.undefined)
    }
  }
  
  trait UnmarshalledPullRequestEvent
    extends StObject
       with PullRequestEvent {
    
    /**
      * <p>The day and time of the pull request event, in timestamp format.</p>
      */
    @JSName("eventDate")
    var eventDate_UnmarshalledPullRequestEvent: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>Information about the source and destination branches for the pull request.</p>
      */
    @JSName("pullRequestCreatedEventMetadata")
    var pullRequestCreatedEventMetadata_UnmarshalledPullRequestEvent: js.UndefOr[UnmarshalledPullRequestCreatedEventMetadata] = js.undefined
    
    /**
      * <p>Information about the change in mergability state for the pull request event.</p>
      */
    @JSName("pullRequestMergedStateChangedEventMetadata")
    var pullRequestMergedStateChangedEventMetadata_UnmarshalledPullRequestEvent: js.UndefOr[UnmarshalledPullRequestMergedStateChangedEventMetadata] = js.undefined
    
    /**
      * <p>Information about the updated source branch for the pull request event. </p>
      */
    @JSName("pullRequestSourceReferenceUpdatedEventMetadata")
    var pullRequestSourceReferenceUpdatedEventMetadata_UnmarshalledPullRequestEvent: js.UndefOr[UnmarshalledPullRequestSourceReferenceUpdatedEventMetadata] = js.undefined
    
    /**
      * <p>Information about the change in status for the pull request event.</p>
      */
    @JSName("pullRequestStatusChangedEventMetadata")
    var pullRequestStatusChangedEventMetadata_UnmarshalledPullRequestEvent: js.UndefOr[UnmarshalledPullRequestStatusChangedEventMetadata] = js.undefined
  }
  object UnmarshalledPullRequestEvent {
    
    inline def apply(): UnmarshalledPullRequestEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledPullRequestEvent]
    }
    
    extension [Self <: UnmarshalledPullRequestEvent](x: Self) {
      
      inline def setEventDate(value: js.Date): Self = StObject.set(x, "eventDate", value.asInstanceOf[js.Any])
      
      inline def setEventDateUndefined: Self = StObject.set(x, "eventDate", js.undefined)
      
      inline def setPullRequestCreatedEventMetadata(value: UnmarshalledPullRequestCreatedEventMetadata): Self = StObject.set(x, "pullRequestCreatedEventMetadata", value.asInstanceOf[js.Any])
      
      inline def setPullRequestCreatedEventMetadataUndefined: Self = StObject.set(x, "pullRequestCreatedEventMetadata", js.undefined)
      
      inline def setPullRequestMergedStateChangedEventMetadata(value: UnmarshalledPullRequestMergedStateChangedEventMetadata): Self = StObject.set(x, "pullRequestMergedStateChangedEventMetadata", value.asInstanceOf[js.Any])
      
      inline def setPullRequestMergedStateChangedEventMetadataUndefined: Self = StObject.set(x, "pullRequestMergedStateChangedEventMetadata", js.undefined)
      
      inline def setPullRequestSourceReferenceUpdatedEventMetadata(value: UnmarshalledPullRequestSourceReferenceUpdatedEventMetadata): Self = StObject.set(x, "pullRequestSourceReferenceUpdatedEventMetadata", value.asInstanceOf[js.Any])
      
      inline def setPullRequestSourceReferenceUpdatedEventMetadataUndefined: Self = StObject.set(x, "pullRequestSourceReferenceUpdatedEventMetadata", js.undefined)
      
      inline def setPullRequestStatusChangedEventMetadata(value: UnmarshalledPullRequestStatusChangedEventMetadata): Self = StObject.set(x, "pullRequestStatusChangedEventMetadata", value.asInstanceOf[js.Any])
      
      inline def setPullRequestStatusChangedEventMetadataUndefined: Self = StObject.set(x, "pullRequestStatusChangedEventMetadata", js.undefined)
    }
  }
}
