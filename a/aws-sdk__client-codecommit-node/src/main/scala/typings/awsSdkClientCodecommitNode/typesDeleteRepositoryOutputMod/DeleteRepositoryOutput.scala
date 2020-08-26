package typings.awsSdkClientCodecommitNode.typesDeleteRepositoryOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRepositoryOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The ID of the repository that was deleted.</p>
    */
  var repositoryId: js.UndefOr[String] = js.native
}

object DeleteRepositoryOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteRepositoryOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRepositoryOutput]
  }
  @scala.inline
  implicit class DeleteRepositoryOutputOps[Self <: DeleteRepositoryOutput] (val x: Self) extends AnyVal {
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
    def setRepositoryId(value: String): Self = this.set("repositoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryId: Self = this.set("repositoryId", js.undefined)
  }
  
}

