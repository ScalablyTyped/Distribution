package typings.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCommentsForPullRequestMod.UnmarshalledCommentsForPullRequest
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommentsForPullRequestOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>An array of comment objects on the pull request.</p>
    */
  var commentsForPullRequestData: js.UndefOr[js.Array[UnmarshalledCommentsForPullRequest]] = js.native
  /**
    * <p>An enumeration token that can be used in a request to return the next batch of the results.</p>
    */
  var nextToken: js.UndefOr[String] = js.native
}

object GetCommentsForPullRequestOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetCommentsForPullRequestOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentsForPullRequestOutput]
  }
  @scala.inline
  implicit class GetCommentsForPullRequestOutputOps[Self <: GetCommentsForPullRequestOutput] (val x: Self) extends AnyVal {
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
    def setCommentsForPullRequestDataVarargs(value: UnmarshalledCommentsForPullRequest*): Self = this.set("commentsForPullRequestData", js.Array(value :_*))
    @scala.inline
    def setCommentsForPullRequestData(value: js.Array[UnmarshalledCommentsForPullRequest]): Self = this.set("commentsForPullRequestData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommentsForPullRequestData: Self = this.set("commentsForPullRequestData", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

