package typings.awsSdkClientCodecommitNode.typesGetCommitOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCommitMod.UnmarshalledCommit
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommitOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>A commit data type object that contains information about the specified commit.</p>
    */
  var commit: UnmarshalledCommit = js.native
}

object GetCommitOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, commit: UnmarshalledCommit): GetCommitOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommitOutput]
  }
  @scala.inline
  implicit class GetCommitOutputOps[Self <: GetCommitOutput] (val x: Self) extends AnyVal {
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
    def setCommit(value: UnmarshalledCommit): Self = this.set("commit", value.asInstanceOf[js.Any])
  }
  
}

