package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationTaskAssessmentResult extends StObject {
  
  /**
    *  The task assessment results in JSON format. 
    */
  var AssessmentResults: js.UndefOr[String] = js.native
  
  /**
    *  The file containing the results of the task assessment. 
    */
  var AssessmentResultsFile: js.UndefOr[String] = js.native
  
  /**
    *  The status of the task assessment. 
    */
  var AssessmentStatus: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the replication task. 
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.native
  
  /**
    *  The replication task identifier of the task on which the task assessment was run. 
    */
  var ReplicationTaskIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The date the task assessment was completed. 
    */
  var ReplicationTaskLastAssessmentDate: js.UndefOr[TStamp] = js.native
  
  /**
    *  The URL of the S3 object containing the task assessment results. 
    */
  var S3ObjectUrl: js.UndefOr[String] = js.native
}
object ReplicationTaskAssessmentResult {
  
  @scala.inline
  def apply(): ReplicationTaskAssessmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTaskAssessmentResult]
  }
  
  @scala.inline
  implicit class ReplicationTaskAssessmentResultMutableBuilder[Self <: ReplicationTaskAssessmentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentResults(value: String): Self = StObject.set(x, "AssessmentResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssessmentResultsFile(value: String): Self = StObject.set(x, "AssessmentResultsFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssessmentResultsFileUndefined: Self = StObject.set(x, "AssessmentResultsFile", js.undefined)
    
    @scala.inline
    def setAssessmentResultsUndefined: Self = StObject.set(x, "AssessmentResults", js.undefined)
    
    @scala.inline
    def setAssessmentStatus(value: String): Self = StObject.set(x, "AssessmentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssessmentStatusUndefined: Self = StObject.set(x, "AssessmentStatus", js.undefined)
    
    @scala.inline
    def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskArnUndefined: Self = StObject.set(x, "ReplicationTaskArn", js.undefined)
    
    @scala.inline
    def setReplicationTaskIdentifier(value: String): Self = StObject.set(x, "ReplicationTaskIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskIdentifierUndefined: Self = StObject.set(x, "ReplicationTaskIdentifier", js.undefined)
    
    @scala.inline
    def setReplicationTaskLastAssessmentDate(value: TStamp): Self = StObject.set(x, "ReplicationTaskLastAssessmentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskLastAssessmentDateUndefined: Self = StObject.set(x, "ReplicationTaskLastAssessmentDate", js.undefined)
    
    @scala.inline
    def setS3ObjectUrl(value: String): Self = StObject.set(x, "S3ObjectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ObjectUrlUndefined: Self = StObject.set(x, "S3ObjectUrl", js.undefined)
  }
}
