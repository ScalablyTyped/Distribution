package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationTaskIndividualAssessment extends StObject {
  
  /**
    * Name of this individual assessment.
    */
  var IndividualAssessmentName: js.UndefOr[String] = js.native
  
  /**
    * ARN of the premigration assessment run that is created to run this individual assessment.
    */
  var ReplicationTaskAssessmentRunArn: js.UndefOr[String] = js.native
  
  /**
    * Amazon Resource Name (ARN) of this individual assessment.
    */
  var ReplicationTaskIndividualAssessmentArn: js.UndefOr[String] = js.native
  
  /**
    * Date when this individual assessment was started as part of running the StartReplicationTaskAssessmentRun operation.
    */
  var ReplicationTaskIndividualAssessmentStartDate: js.UndefOr[TStamp] = js.native
  
  /**
    * Individual assessment status. This status can have one of the following values:    "cancelled"     "error"     "failed"     "passed"     "pending"     "running"   
    */
  var Status: js.UndefOr[String] = js.native
}
object ReplicationTaskIndividualAssessment {
  
  @scala.inline
  def apply(): ReplicationTaskIndividualAssessment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTaskIndividualAssessment]
  }
  
  @scala.inline
  implicit class ReplicationTaskIndividualAssessmentMutableBuilder[Self <: ReplicationTaskIndividualAssessment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndividualAssessmentName(value: String): Self = StObject.set(x, "IndividualAssessmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndividualAssessmentNameUndefined: Self = StObject.set(x, "IndividualAssessmentName", js.undefined)
    
    @scala.inline
    def setReplicationTaskAssessmentRunArn(value: String): Self = StObject.set(x, "ReplicationTaskAssessmentRunArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskAssessmentRunArnUndefined: Self = StObject.set(x, "ReplicationTaskAssessmentRunArn", js.undefined)
    
    @scala.inline
    def setReplicationTaskIndividualAssessmentArn(value: String): Self = StObject.set(x, "ReplicationTaskIndividualAssessmentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskIndividualAssessmentArnUndefined: Self = StObject.set(x, "ReplicationTaskIndividualAssessmentArn", js.undefined)
    
    @scala.inline
    def setReplicationTaskIndividualAssessmentStartDate(value: TStamp): Self = StObject.set(x, "ReplicationTaskIndividualAssessmentStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskIndividualAssessmentStartDateUndefined: Self = StObject.set(x, "ReplicationTaskIndividualAssessmentStartDate", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
