package typings.awsSdkClientCodecommitNode.typesListRepositoriesOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryNameIdPairMod.UnmarshalledRepositoryNameIdPair
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRepositoriesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>An enumeration token that allows the operation to batch the results of the operation. Batch sizes are 1,000 for list repository operations. When the client sends the token back to AWS CodeCommit, another page of 1,000 records is retrieved.</p>
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * <p>Lists the repositories called by the list repositories operation.</p>
    */
  var repositories: js.UndefOr[js.Array[UnmarshalledRepositoryNameIdPair]] = js.native
}

object ListRepositoriesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListRepositoriesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRepositoriesOutput]
  }
  @scala.inline
  implicit class ListRepositoriesOutputOps[Self <: ListRepositoriesOutput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setRepositoriesVarargs(value: UnmarshalledRepositoryNameIdPair*): Self = this.set("repositories", js.Array(value :_*))
    @scala.inline
    def setRepositories(value: js.Array[UnmarshalledRepositoryNameIdPair]): Self = this.set("repositories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositories: Self = this.set("repositories", js.undefined)
  }
  
}

