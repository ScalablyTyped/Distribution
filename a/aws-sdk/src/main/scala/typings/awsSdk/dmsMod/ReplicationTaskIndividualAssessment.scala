package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationTaskIndividualAssessment extends js.Object {
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
  implicit class ReplicationTaskIndividualAssessmentOps[Self <: ReplicationTaskIndividualAssessment] (val x: Self) extends AnyVal {
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
    def setIndividualAssessmentName(value: String): Self = this.set("IndividualAssessmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndividualAssessmentName: Self = this.set("IndividualAssessmentName", js.undefined)
    @scala.inline
    def setReplicationTaskAssessmentRunArn(value: String): Self = this.set("ReplicationTaskAssessmentRunArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationTaskAssessmentRunArn: Self = this.set("ReplicationTaskAssessmentRunArn", js.undefined)
    @scala.inline
    def setReplicationTaskIndividualAssessmentArn(value: String): Self = this.set("ReplicationTaskIndividualAssessmentArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationTaskIndividualAssessmentArn: Self = this.set("ReplicationTaskIndividualAssessmentArn", js.undefined)
    @scala.inline
    def setReplicationTaskIndividualAssessmentStartDate(value: TStamp): Self = this.set("ReplicationTaskIndividualAssessmentStartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationTaskIndividualAssessmentStartDate: Self = this.set("ReplicationTaskIndividualAssessmentStartDate", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

