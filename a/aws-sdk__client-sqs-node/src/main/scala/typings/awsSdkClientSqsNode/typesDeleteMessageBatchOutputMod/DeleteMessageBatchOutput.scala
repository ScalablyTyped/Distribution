package typings.awsSdkClientSqsNode.typesDeleteMessageBatchOutputMod

import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.typesBatchResultErrorEntryMod.UnmarshalledBatchResultErrorEntry
import typings.awsSdkClientSqsNode.typesDeleteMessageBatchResultEntryMod.UnmarshalledDeleteMessageBatchResultEntry
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMessageBatchOutput extends OutputTypesUnion {
  
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
    * <p>A list of <code> <a>DeleteMessageBatchResultEntry</a> </code> items.</p>
    */
  var Successful: js.Array[UnmarshalledDeleteMessageBatchResultEntry] = js.native
}
object DeleteMessageBatchOutput {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Failed: js.Array[UnmarshalledBatchResultErrorEntry],
    Successful: js.Array[UnmarshalledDeleteMessageBatchResultEntry]
  ): DeleteMessageBatchOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessageBatchOutput]
  }
  
  @scala.inline
  implicit class DeleteMessageBatchOutputOps[Self <: DeleteMessageBatchOutput] (val x: Self) extends AnyVal {
    
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
    def setSuccessfulVarargs(value: UnmarshalledDeleteMessageBatchResultEntry*): Self = this.set("Successful", js.Array(value :_*))
    
    @scala.inline
    def setSuccessful(value: js.Array[UnmarshalledDeleteMessageBatchResultEntry]): Self = this.set("Successful", value.asInstanceOf[js.Any])
  }
}
