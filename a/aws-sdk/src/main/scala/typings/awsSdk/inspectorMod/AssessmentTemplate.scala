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
    userAttributesForFindings: UserAttributeList,
    lastAssessmentRunArn: Arn = null
  ): AssessmentTemplate = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], assessmentRunCount = assessmentRunCount.asInstanceOf[js.Any], assessmentTargetArn = assessmentTargetArn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], durationInSeconds = durationInSeconds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rulesPackageArns = rulesPackageArns.asInstanceOf[js.Any], userAttributesForFindings = userAttributesForFindings.asInstanceOf[js.Any])
    if (lastAssessmentRunArn != null) __obj.updateDynamic("lastAssessmentRunArn")(lastAssessmentRunArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentTemplate]
  }
}

