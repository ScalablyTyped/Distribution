package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationTaskAssessmentRunProgress extends js.Object {
  
  /**
    * The number of individual assessments that have completed, successfully or not.
    */
  var IndividualAssessmentCompletedCount: js.UndefOr[Integer] = js.native
  
  /**
    * The number of individual assessments that are specified to run.
    */
  var IndividualAssessmentCount: js.UndefOr[Integer] = js.native
}
object ReplicationTaskAssessmentRunProgress {
  
  @scala.inline
  def apply(): ReplicationTaskAssessmentRunProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTaskAssessmentRunProgress]
  }
  
  @scala.inline
  implicit class ReplicationTaskAssessmentRunProgressOps[Self <: ReplicationTaskAssessmentRunProgress] (val x: Self) extends AnyVal {
    
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
    def setIndividualAssessmentCompletedCount(value: Integer): Self = this.set("IndividualAssessmentCompletedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndividualAssessmentCompletedCount: Self = this.set("IndividualAssessmentCompletedCount", js.undefined)
    
    @scala.inline
    def setIndividualAssessmentCount(value: Integer): Self = this.set("IndividualAssessmentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndividualAssessmentCount: Self = this.set("IndividualAssessmentCount", js.undefined)
  }
}
