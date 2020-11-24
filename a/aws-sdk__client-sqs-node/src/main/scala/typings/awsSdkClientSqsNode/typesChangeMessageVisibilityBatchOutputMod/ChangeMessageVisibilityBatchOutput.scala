package typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchOutputMod

import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.typesBatchResultErrorEntryMod.UnmarshalledBatchResultErrorEntry
import typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchResultEntryMod.UnmarshalledChangeMessageVisibilityBatchResultEntry
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeMessageVisibilityBatchOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>A list of <code> <a>BatchResultErrorEntry</a> </code> items.</p>
    */
  var Failed: js.Array[UnmarshalledBatchResultErrorEntry] = js.native
  
  /**
    * <p>A list of <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> items.</p>
    */
  var Successful: js.Array[UnmarshalledChangeMessageVisibilityBatchResultEntry] = js.native
}
object ChangeMessageVisibilityBatchOutput {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Failed: js.Array[UnmarshalledBatchResultErrorEntry],
    Successful: js.Array[UnmarshalledChangeMessageVisibilityBatchResultEntry]
  ): ChangeMessageVisibilityBatchOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMessageVisibilityBatchOutput]
  }
  
  @scala.inline
  implicit class ChangeMessageVisibilityBatchOutputOps[Self <: ChangeMessageVisibilityBatchOutput] (val x: Self) extends AnyVal {
    
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
    def setFailedVarargs(value: UnmarshalledBatchResultErrorEntry*): Self = this.set("Failed", js.Array(value :_*))
    
    @scala.inline
    def setFailed(value: js.Array[UnmarshalledBatchResultErrorEntry]): Self = this.set("Failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulVarargs(value: UnmarshalledChangeMessageVisibilityBatchResultEntry*): Self = this.set("Successful", js.Array(value :_*))
    
    @scala.inline
    def setSuccessful(value: js.Array[UnmarshalledChangeMessageVisibilityBatchResultEntry]): Self = this.set("Successful", value.asInstanceOf[js.Any])
  }
}
