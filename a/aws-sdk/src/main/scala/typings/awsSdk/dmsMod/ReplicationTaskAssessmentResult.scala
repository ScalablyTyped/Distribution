package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationTaskAssessmentResult extends js.Object {
  
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
  implicit class ReplicationTaskAssessmentResultOps[Self <: ReplicationTaskAssessmentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssessmentResults(value: String): Self = this.set("AssessmentResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssessmentResults: Self = this.set("AssessmentResults", js.undefined)
    
    @scala.inline
    def setAssessmentResultsFile(value: String): Self = this.set("AssessmentResultsFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssessmentResultsFile: Self = this.set("AssessmentResultsFile", js.undefined)
    
    @scala.inline
    def setAssessmentStatus(value: String): Self = this.set("AssessmentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssessmentStatus: Self = this.set("AssessmentStatus", js.undefined)
    
    @scala.inline
    def setReplicationTaskArn(value: String): Self = this.set("ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTaskArn: Self = this.set("ReplicationTaskArn", js.undefined)
    
    @scala.inline
    def setReplicationTaskIdentifier(value: String): Self = this.set("ReplicationTaskIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTaskIdentifier: Self = this.set("ReplicationTaskIdentifier", js.undefined)
    
    @scala.inline
    def setReplicationTaskLastAssessmentDate(value: TStamp): Self = this.set("ReplicationTaskLastAssessmentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTaskLastAssessmentDate: Self = this.set("ReplicationTaskLastAssessmentDate", js.undefined)
    
    @scala.inline
    def setS3ObjectUrl(value: String): Self = this.set("S3ObjectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3ObjectUrl: Self = this.set("S3ObjectUrl", js.undefined)
  }
}
