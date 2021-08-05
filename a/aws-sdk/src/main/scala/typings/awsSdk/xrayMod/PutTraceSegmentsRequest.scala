package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutTraceSegmentsRequest extends StObject {
  
  /**
    * A string containing a JSON document defining one or more segments or subsegments.
    */
  var TraceSegmentDocuments: TraceSegmentDocumentList
}
object PutTraceSegmentsRequest {
  
  inline def apply(TraceSegmentDocuments: TraceSegmentDocumentList): PutTraceSegmentsRequest = {
    val __obj = js.Dynamic.literal(TraceSegmentDocuments = TraceSegmentDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTraceSegmentsRequest]
  }
  
  extension [Self <: PutTraceSegmentsRequest](x: Self) {
    
    inline def setTraceSegmentDocuments(value: TraceSegmentDocumentList): Self = StObject.set(x, "TraceSegmentDocuments", value.asInstanceOf[js.Any])
    
    inline def setTraceSegmentDocumentsVarargs(value: TraceSegmentDocument*): Self = StObject.set(x, "TraceSegmentDocuments", js.Array(value :_*))
  }
}
