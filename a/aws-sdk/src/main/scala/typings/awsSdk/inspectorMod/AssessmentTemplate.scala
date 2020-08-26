package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentTemplate extends js.Object {
  /**
    * The ARN of the assessment template.
    */
  var arn: Arn = js.native
  /**
    * The number of existing assessment runs associated with this assessment template. This value can be zero or a positive integer.
    */
  var assessmentRunCount: ArnCount = js.native
  /**
    * The ARN of the assessment target that corresponds to this assessment template.
    */
  var assessmentTargetArn: Arn = js.native
  /**
    * The time at which the assessment template is created.
    */
  var createdAt: Timestamp = js.native
  /**
    * The duration in seconds specified for this assessment template. The default value is 3600 seconds (one hour). The maximum value is 86400 seconds (one day).
    */
  var durationInSeconds: AssessmentRunDuration = js.native
  /**
    * The Amazon Resource Name (ARN) of the most recent assessment run associated with this assessment template. This value exists only when the value of assessmentRunCount is greaterpa than zero.
    */
  var lastAssessmentRunArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the assessment template.
    */
  var name: AssessmentTemplateName = js.native
  /**
    * The rules packages that are specified for this assessment template.
    */
  var rulesPackageArns: AssessmentTemplateRulesPackageArnList = js.native
  /**
    * The user-defined attributes that are assigned to every generated finding from the assessment run that uses this assessment template.
    */
  var userAttributesForFindings: UserAttributeList = js.native
}

object AssessmentTemplate {
  @scala.inline
  def apply(
    arn: Arn,
    assessmentRunCount: ArnCount,
    assessmentTargetArn: Arn,
    createdAt: Timestamp,
    durationInSeconds: AssessmentRunDuration,
    name: AssessmentTemplateName,
    rulesPackageArns: AssessmentTemplateRulesPackageArnList,
    userAttributesForFindings: UserAttributeList
  ): AssessmentTemplate = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], assessmentRunCount = assessmentRunCount.asInstanceOf[js.Any], assessmentTargetArn = assessmentTargetArn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], durationInSeconds = durationInSeconds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rulesPackageArns = rulesPackageArns.asInstanceOf[js.Any], userAttributesForFindings = userAttributesForFindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentTemplate]
  }
  @scala.inline
  implicit class AssessmentTemplateOps[Self <: AssessmentTemplate] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssessmentRunCount(value: ArnCount): Self = this.set("assessmentRunCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssessmentTargetArn(value: Arn): Self = this.set("assessmentTargetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setDurationInSeconds(value: AssessmentRunDuration): Self = this.set("durationInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: AssessmentTemplateName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRulesPackageArnsVarargs(value: Arn*): Self = this.set("rulesPackageArns", js.Array(value :_*))
    @scala.inline
    def setRulesPackageArns(value: AssessmentTemplateRulesPackageArnList): Self = this.set("rulesPackageArns", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserAttributesForFindingsVarargs(value: Attribute*): Self = this.set("userAttributesForFindings", js.Array(value :_*))
    @scala.inline
    def setUserAttributesForFindings(value: UserAttributeList): Self = this.set("userAttributesForFindings", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastAssessmentRunArn(value: Arn): Self = this.set("lastAssessmentRunArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAssessmentRunArn: Self = this.set("lastAssessmentRunArn", js.undefined)
  }
  
}

