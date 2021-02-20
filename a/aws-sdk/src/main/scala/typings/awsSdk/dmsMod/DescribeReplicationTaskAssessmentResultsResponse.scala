package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReplicationTaskAssessmentResultsResponse extends StObject {
  
  /**
    * - The Amazon S3 bucket where the task assessment report is located. 
    */
  var BucketName: js.UndefOr[String] = js.native
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    *  The task assessment report. 
    */
  var ReplicationTaskAssessmentResults: js.UndefOr[ReplicationTaskAssessmentResultList] = js.native
}
object DescribeReplicationTaskAssessmentResultsResponse {
  
  @scala.inline
  def apply(): DescribeReplicationTaskAssessmentResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationTaskAssessmentResultsResponse]
  }
  
  @scala.inline
  implicit class DescribeReplicationTaskAssessmentResultsResponseMutableBuilder[Self <: DescribeReplicationTaskAssessmentResultsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setReplicationTaskAssessmentResults(value: ReplicationTaskAssessmentResultList): Self = StObject.set(x, "ReplicationTaskAssessmentResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskAssessmentResultsUndefined: Self = StObject.set(x, "ReplicationTaskAssessmentResults", js.undefined)
    
    @scala.inline
    def setReplicationTaskAssessmentResultsVarargs(value: ReplicationTaskAssessmentResult*): Self = StObject.set(x, "ReplicationTaskAssessmentResults", js.Array(value :_*))
  }
}
