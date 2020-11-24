package typings.awsSdkClientCodecommitNode.typesDeleteBranchOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesBranchInfoMod.UnmarshalledBranchInfo
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBranchOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>Information about the branch deleted by the operation, including the branch name and the commit ID that was the tip of the branch.</p>
    */
  var deletedBranch: js.UndefOr[UnmarshalledBranchInfo] = js.native
}
object DeleteBranchOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBranchOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBranchOutput]
  }
  
  @scala.inline
  implicit class DeleteBranchOutputOps[Self <: DeleteBranchOutput] (val x: Self) extends AnyVal {
    
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
    def setDeletedBranch(value: UnmarshalledBranchInfo): Self = this.set("deletedBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedBranch: Self = this.set("deletedBranch", js.undefined)
  }
}
