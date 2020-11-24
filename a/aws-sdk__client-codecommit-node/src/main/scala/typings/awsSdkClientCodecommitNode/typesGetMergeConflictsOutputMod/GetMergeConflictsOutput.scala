package typings.awsSdkClientCodecommitNode.typesGetMergeConflictsOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMergeConflictsOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>The commit ID of the destination commit specifier that was used in the merge evaluation.</p>
    */
  var destinationCommitId: String = js.native
  
  /**
    * <p>A Boolean value that indicates whether the code is mergable by the specified merge option.</p>
    */
  var mergeable: Boolean = js.native
  
  /**
    * <p>The commit ID of the source commit specifier that was used in the merge evaluation.</p>
    */
  var sourceCommitId: String = js.native
}
object GetMergeConflictsOutput {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    destinationCommitId: String,
    mergeable: Boolean,
    sourceCommitId: String
  ): GetMergeConflictsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMergeConflictsOutput]
  }
  
  @scala.inline
  implicit class GetMergeConflictsOutputOps[Self <: GetMergeConflictsOutput] (val x: Self) extends AnyVal {
    
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
    def setDestinationCommitId(value: String): Self = this.set("destinationCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeable(value: Boolean): Self = this.set("mergeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCommitId(value: String): Self = this.set("sourceCommitId", value.asInstanceOf[js.Any])
  }
}
