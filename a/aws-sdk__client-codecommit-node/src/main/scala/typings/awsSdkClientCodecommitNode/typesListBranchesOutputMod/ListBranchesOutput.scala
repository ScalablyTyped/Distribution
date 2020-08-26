package typings.awsSdkClientCodecommitNode.typesListBranchesOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBranchesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The list of branch names.</p>
    */
  var branches: js.UndefOr[js.Array[String]] = js.native
  /**
    * <p>An enumeration token that returns the batch of the results.</p>
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListBranchesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListBranchesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBranchesOutput]
  }
  @scala.inline
  implicit class ListBranchesOutputOps[Self <: ListBranchesOutput] (val x: Self) extends AnyVal {
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
    def setBranchesVarargs(value: String*): Self = this.set("branches", js.Array(value :_*))
    @scala.inline
    def setBranches(value: js.Array[String]): Self = this.set("branches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranches: Self = this.set("branches", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

