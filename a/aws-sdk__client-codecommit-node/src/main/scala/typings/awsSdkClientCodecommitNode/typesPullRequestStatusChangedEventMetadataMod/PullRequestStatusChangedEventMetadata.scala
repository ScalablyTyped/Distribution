package typings.awsSdkClientCodecommitNode.typesPullRequestStatusChangedEventMetadataMod

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CLOSED
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.OPEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullRequestStatusChangedEventMetadata extends js.Object {
  
  /**
    * <p>The changed status of the pull request.</p>
    */
  var pullRequestStatus: js.UndefOr[OPEN | CLOSED | String] = js.native
}
object PullRequestStatusChangedEventMetadata {
  
  @scala.inline
  def apply(): PullRequestStatusChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestStatusChangedEventMetadata]
  }
  
  @scala.inline
  implicit class PullRequestStatusChangedEventMetadataOps[Self <: PullRequestStatusChangedEventMetadata] (val x: Self) extends AnyVal {
    
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
    def setPullRequestStatus(value: OPEN | CLOSED | String): Self = this.set("pullRequestStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRequestStatus: Self = this.set("pullRequestStatus", js.undefined)
  }
}
