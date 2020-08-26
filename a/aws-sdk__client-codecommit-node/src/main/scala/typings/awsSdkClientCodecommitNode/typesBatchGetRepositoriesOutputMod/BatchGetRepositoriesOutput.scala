package typings.awsSdkClientCodecommitNode.typesBatchGetRepositoriesOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryMetadataMod.UnmarshalledRepositoryMetadata
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetRepositoriesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>A list of repositories returned by the batch get repositories operation.</p>
    */
  var repositories: js.UndefOr[js.Array[UnmarshalledRepositoryMetadata]] = js.native
  /**
    * <p>Returns a list of repository names for which information could not be found.</p>
    */
  var repositoriesNotFound: js.UndefOr[js.Array[String]] = js.native
}

object BatchGetRepositoriesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): BatchGetRepositoriesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetRepositoriesOutput]
  }
  @scala.inline
  implicit class BatchGetRepositoriesOutputOps[Self <: BatchGetRepositoriesOutput] (val x: Self) extends AnyVal {
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
    def setRepositoriesVarargs(value: UnmarshalledRepositoryMetadata*): Self = this.set("repositories", js.Array(value :_*))
    @scala.inline
    def setRepositories(value: js.Array[UnmarshalledRepositoryMetadata]): Self = this.set("repositories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositories: Self = this.set("repositories", js.undefined)
    @scala.inline
    def setRepositoriesNotFoundVarargs(value: String*): Self = this.set("repositoriesNotFound", js.Array(value :_*))
    @scala.inline
    def setRepositoriesNotFound(value: js.Array[String]): Self = this.set("repositoriesNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoriesNotFound: Self = this.set("repositoriesNotFound", js.undefined)
  }
  
}

