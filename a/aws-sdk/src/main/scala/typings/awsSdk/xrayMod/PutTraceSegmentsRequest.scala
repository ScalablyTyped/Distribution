package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutTraceSegmentsRequest extends StObject {
  
  /**
    * A string containing a JSON document defining one or more segments or subsegments.
    */
  var TraceSegmentDocuments: TraceSegmentDocumentList = js.native
}
object PutTraceSegmentsRequest {
  
  @scala.inline
  def apply(TraceSegmentDocuments: TraceSegmentDocumentList): PutTraceSegmentsRequest = {
    val __obj = js.Dynamic.literal(TraceSegmentDocuments = TraceSegmentDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTraceSegmentsRequest]
  }
  
  @scala.inline
  implicit class PutTraceSegmentsRequestMutableBuilder[Self <: PutTraceSegmentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTraceSegmentDocuments(value: TraceSegmentDocumentList): Self = StObject.set(x, "TraceSegmentDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceSegmentDocumentsVarargs(value: TraceSegmentDocument*): Self = StObject.set(x, "TraceSegmentDocuments", js.Array(value :_*))
  }
}
