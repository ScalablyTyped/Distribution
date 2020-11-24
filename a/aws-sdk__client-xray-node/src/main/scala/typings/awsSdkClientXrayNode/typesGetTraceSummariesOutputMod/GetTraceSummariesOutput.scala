package typings.awsSdkClientXrayNode.typesGetTraceSummariesOutputMod

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesTraceSummaryMod.UnmarshalledTraceSummary
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTraceSummariesOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>The start time of this page of results.</p>
    */
  var ApproximateTime: js.UndefOr[Date] = js.native
  
  /**
    * <p>If the requested time frame contained more than one page of results, you can use this token to retrieve the next page. The first page contains the most most recent results, closest to the end of the time frame.</p>
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * <p>Trace IDs and metadata for traces that were found in the specified time frame.</p>
    */
  var TraceSummaries: js.UndefOr[js.Array[UnmarshalledTraceSummary]] = js.native
  
  /**
    * <p>The total number of traces processed, including traces that did not match the specified filter expression.</p>
    */
  var TracesProcessedCount: js.UndefOr[Double] = js.native
}
object GetTraceSummariesOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): GetTraceSummariesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTraceSummariesOutput]
  }
  
  @scala.inline
  implicit class GetTraceSummariesOutputOps[Self <: GetTraceSummariesOutput] (val x: Self) extends AnyVal {
    
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
    def setApproximateTime(value: Date): Self = this.set("ApproximateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproximateTime: Self = this.set("ApproximateTime", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTraceSummariesVarargs(value: UnmarshalledTraceSummary*): Self = this.set("TraceSummaries", js.Array(value :_*))
    
    @scala.inline
    def setTraceSummaries(value: js.Array[UnmarshalledTraceSummary]): Self = this.set("TraceSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceSummaries: Self = this.set("TraceSummaries", js.undefined)
    
    @scala.inline
    def setTracesProcessedCount(value: Double): Self = this.set("TracesProcessedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracesProcessedCount: Self = this.set("TracesProcessedCount", js.undefined)
  }
}
