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
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPullRequestEventMod {
  
  @js.native
  trait PullRequestEvent extends StObject {
    
    /**
      * <p>The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the pull request with additional commits or changing the status of a pull request.</p>
      */
    var actorArn: js.UndefOr[String] = js.native
    
    /**
      * <p>The day and time of the pull request event, in timestamp format.</p>
      */
    var eventDate: js.UndefOr[Date | String | Double] = js.native
    
    /**
      * <p>Information about the source and destination branches for the pull request.</p>
      */
    var pullRequestCreatedEventMetadata: js.UndefOr[PullRequestCreatedEventMetadata] = js.native
    
    /**
      * <p>The type of the pull request event, for example a status change event (PULL_REQUEST_STATUS_CHANGED) or update event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED).</p>
      */
    var pullRequestEventType: js.UndefOr[
        PULL_REQUEST_CREATED | PULL_REQUEST_STATUS_CHANGED | PULL_REQUEST_SOURCE_REFERENCE_UPDATED | PULL_REQUEST_MERGE_STATE_CHANGED | String
      ] = js.native
    
    /**
      * <p>The system-generated ID of the pull request.</p>
      */
    var pullRequestId: js.UndefOr[String] = js.native
    
    /**
      * <p>Information about the change in mergability state for the pull request event.</p>
      */
    var pullRequestMergedStateChangedEventMetadata: js.UndefOr[PullRequestMergedStateChangedEventMetadata] = js.native
    
    /**
      * <p>Information about the updated source branch for the pull request event. </p>
      */
    var pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[PullRequestSourceReferenceUpdatedEventMetadata] = js.native
    
    /**
      * <p>Information about the change in status for the pull request event.</p>
      */
    var pullRequestStatusChangedEventMetadata: js.UndefOr[PullRequestStatusChangedEventMetadata] = js.native
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
      def setActorArn(value: String): Self = StObject.set(x, "actorArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActorArnUndefined: Self = StObject.set(x, "actorArn", js.undefined)
      
      @scala.inline
      def setEventDate(value: Date | String | Double): Self = StObject.set(x, "eventDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventDateUndefined: Self = StObject.set(x, "eventDate", js.undefined)
      
      @scala.inline
      def setPullRequestCreatedEventMetadata(value: PullRequestCreatedEventMetadata): Self = StObject.set(x, "pullRequestCreatedEventMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequestCreatedEventMetadataUndefined: Self = StObject.set(x, "pullRequestCreatedEventMetadata", js.undefined)
      
      @scala.inline
      def setPullRequestEventType(
        value: PULL_REQUEST_CREATED | PULL_REQUEST_STATUS_CHANGED | PULL_REQUEST_SOURCE_REFERENCE_UPDATED | PULL_REQUEST_MERGE_STATE_CHANGED | String
      ): Self = StObject.set(x, "pullRequestEventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequestEventTypeUndefined: Self = StObject.set(x, "pullRequestEventType", js.undefined)
      
      @scala.inline
      def setPullRequestId(value: String): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
      
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
  
  @js.native
  trait UnmarshalledPullRequestEvent extends PullRequestEvent {
    
    /**
      * <p>The day and time of the pull request event, in timestamp format.</p>
      */
    @JSName("eventDate")
    var eventDate_UnmarshalledPullRequestEvent: js.UndefOr[Date] = js.native
    
    /**
      * <p>Information about the source and destination branches for the pull request.</p>
      */
    @JSName("pullRequestCreatedEventMetadata")
    var pullRequestCreatedEventMetadata_UnmarshalledPullRequestEvent: js.UndefOr[UnmarshalledPullRequestCreatedEventMetadata] = js.native
    
    /**
      * <p>Information about the change in mergability state for the pull request event.</p>
      */
    @JSName("pullRequestMergedStateChangedEventMetadata")
    var pullRequestMergedStateChangedEventMetadata_UnmarshalledPullRequestEvent: js.UndefOr[UnmarshalledPullRequestMergedStateChangedEventMetadata] = js.native
    
    /**
      * <p>Information about the updated source branch for the pull request event. </p>
      */
    @JSName("pullRequestSourceReferenceUpdatedEventMetadata")
    var pullRequestSourceReferenceUpdatedEventMetadata_UnmarshalledPullRequestEvent: js.UndefOr[UnmarshalledPullRequestSourceReferenceUpdatedEventMetadata] = js.native
    
    /**
      * <p>Information about the change in status for the pull request event.</p>
      */
    @JSName("pullRequestStatusChangedEventMetadata")
    var pullRequestStatusChangedEventMetadata_UnmarshalledPullRequestEvent: js.UndefOr[UnmarshalledPullRequestStatusChangedEventMetadata] = js.native
  }
  object UnmarshalledPullRequestEvent {
    
    @scala.inline
    def apply(): UnmarshalledPullRequestEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledPullRequestEvent]
    }
    
    @scala.inline
    implicit class UnmarshalledPullRequestEventMutableBuilder[Self <: UnmarshalledPullRequestEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventDate(value: Date): Self = StObject.set(x, "eventDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventDateUndefined: Self = StObject.set(x, "eventDate", js.undefined)
      
      @scala.inline
      def setPullRequestCreatedEventMetadata(value: UnmarshalledPullRequestCreatedEventMetadata): Self = StObject.set(x, "pullRequestCreatedEventMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequestCreatedEventMetadataUndefined: Self = StObject.set(x, "pullRequestCreatedEventMetadata", js.undefined)
      
      @scala.inline
      def setPullRequestMergedStateChangedEventMetadata(value: UnmarshalledPullRequestMergedStateChangedEventMetadata): Self = StObject.set(x, "pullRequestMergedStateChangedEventMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequestMergedStateChangedEventMetadataUndefined: Self = StObject.set(x, "pullRequestMergedStateChangedEventMetadata", js.undefined)
      
      @scala.inline
      def setPullRequestSourceReferenceUpdatedEventMetadata(value: UnmarshalledPullRequestSourceReferenceUpdatedEventMetadata): Self = StObject.set(x, "pullRequestSourceReferenceUpdatedEventMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequestSourceReferenceUpdatedEventMetadataUndefined: Self = StObject.set(x, "pullRequestSourceReferenceUpdatedEventMetadata", js.undefined)
      
      @scala.inline
      def setPullRequestStatusChangedEventMetadata(value: UnmarshalledPullRequestStatusChangedEventMetadata): Self = StObject.set(x, "pullRequestStatusChangedEventMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequestStatusChangedEventMetadataUndefined: Self = StObject.set(x, "pullRequestStatusChangedEventMetadata", js.undefined)
    }
  }
}
