package typings.awsSdkClientXrayNode.typesBatchGetTracesOutputMod

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesTraceMod.UnmarshalledTrace
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetTracesOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>Pagination token. Not used.</p>
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * <p>Full traces for the specified requests.</p>
    */
  var Traces: js.UndefOr[js.Array[UnmarshalledTrace]] = js.native
  
  /**
    * <p>Trace IDs of requests that haven't been processed.</p>
    */
  var UnprocessedTraceIds: js.UndefOr[js.Array[String]] = js.native
}
object BatchGetTracesOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): BatchGetTracesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetTracesOutput]
  }
  
  @scala.inline
  implicit class BatchGetTracesOutputOps[Self <: BatchGetTracesOutput] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTracesVarargs(value: UnmarshalledTrace*): Self = this.set("Traces", js.Array(value :_*))
    
    @scala.inline
    def setTraces(value: js.Array[UnmarshalledTrace]): Self = this.set("Traces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraces: Self = this.set("Traces", js.undefined)
    
    @scala.inline
    def setUnprocessedTraceIdsVarargs(value: String*): Self = this.set("UnprocessedTraceIds", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedTraceIds(value: js.Array[String]): Self = this.set("UnprocessedTraceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnprocessedTraceIds: Self = this.set("UnprocessedTraceIds", js.undefined)
  }
}
