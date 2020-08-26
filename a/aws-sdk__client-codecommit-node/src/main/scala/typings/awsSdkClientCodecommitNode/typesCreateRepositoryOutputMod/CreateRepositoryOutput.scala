package typings.awsSdkClientCodecommitNode.typesCreateRepositoryOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryMetadataMod.UnmarshalledRepositoryMetadata
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRepositoryOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>Information about the newly created repository.</p>
    */
  var repositoryMetadata: js.UndefOr[UnmarshalledRepositoryMetadata] = js.native
}

object CreateRepositoryOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): CreateRepositoryOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRepositoryOutput]
  }
  @scala.inline
  implicit class CreateRepositoryOutputOps[Self <: CreateRepositoryOutput] (val x: Self) extends AnyVal {
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
    def setRepositoryMetadata(value: UnmarshalledRepositoryMetadata): Self = this.set("repositoryMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryMetadata: Self = this.set("repositoryMetadata", js.undefined)
  }
  
}

