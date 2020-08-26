package typings.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesPullRequestMod.UnmarshalledPullRequest
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergePullRequestByFastForwardOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>Information about the specified pull request, including information about the merge.</p>
    */
  var pullRequest: js.UndefOr[UnmarshalledPullRequest] = js.native
}

object MergePullRequestByFastForwardOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): MergePullRequestByFastForwardOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergePullRequestByFastForwardOutput]
  }
  @scala.inline
  implicit class MergePullRequestByFastForwardOutputOps[Self <: MergePullRequestByFastForwardOutput] (val x: Self) extends AnyVal {
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setPullRequest(value: UnmarshalledPullRequest): Self = this.set("pullRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequest: Self = this.set("pullRequest", js.undefined)
  }
  
}

