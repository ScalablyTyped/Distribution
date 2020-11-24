package typings.awsSdkClientCodecommitNode.typesPullRequestEventMod

import typings.awsSdkClientCodecommitNode.typesPullRequestCreatedEventMetadataMod.UnmarshalledPullRequestCreatedEventMetadata
import typings.awsSdkClientCodecommitNode.typesPullRequestMergedStateChangedEventMetadataMod.UnmarshalledPullRequestMergedStateChangedEventMetadata
import typings.awsSdkClientCodecommitNode.typesPullRequestSourceReferenceUpdatedEventMetadataMod.UnmarshalledPullRequestSourceReferenceUpdatedEventMetadata
import typings.awsSdkClientCodecommitNode.typesPullRequestStatusChangedEventMetadataMod.UnmarshalledPullRequestStatusChangedEventMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class UnmarshalledPullRequestEventOps[Self <: UnmarshalledPullRequestEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventDate(value: Date): Self = this.set("eventDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventDate: Self = this.set("eventDate", js.undefined)
    
    @scala.inline
    def setPullRequestCreatedEventMetadata(value: UnmarshalledPullRequestCreatedEventMetadata): Self = this.set("pullRequestCreatedEventMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRequestCreatedEventMetadata: Self = this.set("pullRequestCreatedEventMetadata", js.undefined)
    
    @scala.inline
    def setPullRequestMergedStateChangedEventMetadata(value: UnmarshalledPullRequestMergedStateChangedEventMetadata): Self = this.set("pullRequestMergedStateChangedEventMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRequestMergedStateChangedEventMetadata: Self = this.set("pullRequestMergedStateChangedEventMetadata", js.undefined)
    
    @scala.inline
    def setPullRequestSourceReferenceUpdatedEventMetadata(value: UnmarshalledPullRequestSourceReferenceUpdatedEventMetadata): Self = this.set("pullRequestSourceReferenceUpdatedEventMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRequestSourceReferenceUpdatedEventMetadata: Self = this.set("pullRequestSourceReferenceUpdatedEventMetadata", js.undefined)
    
    @scala.inline
    def setPullRequestStatusChangedEventMetadata(value: UnmarshalledPullRequestStatusChangedEventMetadata): Self = this.set("pullRequestStatusChangedEventMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRequestStatusChangedEventMetadata: Self = this.set("pullRequestStatusChangedEventMetadata", js.undefined)
  }
}
