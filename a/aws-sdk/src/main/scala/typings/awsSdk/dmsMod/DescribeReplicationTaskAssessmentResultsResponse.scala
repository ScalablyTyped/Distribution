package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReplicationTaskAssessmentResultsResponse extends StObject {
  
  /**
    * - The Amazon S3 bucket where the task assessment report is located. 
    */
  var BucketName: js.UndefOr[String] = js.undefined
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    *  The task assessment report. 
    */
  var ReplicationTaskAssessmentResults: js.UndefOr[ReplicationTaskAssessmentResultList] = js.undefined
}
object DescribeReplicationTaskAssessmentResultsResponse {
  
  inline def apply(): DescribeReplicationTaskAssessmentResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationTaskAssessmentResultsResponse]
  }
  
  extension [Self <: DescribeReplicationTaskAssessmentResultsResponse](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setReplicationTaskAssessmentResults(value: ReplicationTaskAssessmentResultList): Self = StObject.set(x, "ReplicationTaskAssessmentResults", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskAssessmentResultsUndefined: Self = StObject.set(x, "ReplicationTaskAssessmentResults", js.undefined)
    
    inline def setReplicationTaskAssessmentResultsVarargs(value: ReplicationTaskAssessmentResult*): Self = StObject.set(x, "ReplicationTaskAssessmentResults", js.Array(value :_*))
  }
}
