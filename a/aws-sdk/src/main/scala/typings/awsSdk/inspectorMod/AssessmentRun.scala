package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentRun extends js.Object {
  /**
    * The ARN of the assessment run.
    */
  var arn: Arn = js.native
  /**
    * The ARN of the assessment template that is associated with the assessment run.
    */
  var assessmentTemplateArn: Arn = js.native
  /**
    * The assessment run completion time that corresponds to the rules packages evaluation completion time or failure.
    */
  var completedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The time when StartAssessmentRun was called.
    */
  var createdAt: Timestamp = js.native
  /**
    * A Boolean value (true or false) that specifies whether the process of collecting data from the agents is completed.
    */
  var dataCollected: Bool = js.native
  /**
    * The duration of the assessment run.
    */
  var durationInSeconds: AssessmentRunDuration = js.native
  /**
    * Provides a total count of generated findings per severity.
    */
  var findingCounts: AssessmentRunFindingCounts = js.native
  /**
    * The auto-generated name for the assessment run.
    */
  var name: AssessmentRunName = js.native
  /**
    * A list of notifications for the event subscriptions. A notification about a particular generated finding is added to this list only once.
    */
  var notifications: AssessmentRunNotificationList = js.native
  /**
    * The rules packages selected for the assessment run.
    */
  var rulesPackageArns: AssessmentRulesPackageArnList = js.native
  /**
    * The time when StartAssessmentRun was called.
    */
  var startedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The state of the assessment run.
    */
  var state: AssessmentRunState = js.native
  /**
    * The last time when the assessment run's state changed.
    */
  var stateChangedAt: Timestamp = js.native
  /**
    * A list of the assessment run state changes.
    */
  var stateChanges: AssessmentRunStateChangeList = js.native
  /**
    * The user-defined attributes that are assigned to every generated finding.
    */
  var userAttributesForFindings: UserAttributeList = js.native
}

object AssessmentRun {
  @scala.inline
  def apply(
    arn: Arn,
    assessmentTemplateArn: Arn,
    createdAt: Timestamp,
    dataCollected: Bool,
    durationInSeconds: AssessmentRunDuration,
    findingCounts: AssessmentRunFindingCounts,
    name: AssessmentRunName,
    notifications: AssessmentRunNotificationList,
    rulesPackageArns: AssessmentRulesPackageArnList,
    state: AssessmentRunState,
    stateChangedAt: Timestamp,
    stateChanges: AssessmentRunStateChangeList,
    userAttributesForFindings: UserAttributeList
  ): AssessmentRun = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], dataCollected = dataCollected.asInstanceOf[js.Any], durationInSeconds = durationInSeconds.asInstanceOf[js.Any], findingCounts = findingCounts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], rulesPackageArns = rulesPackageArns.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateChangedAt = stateChangedAt.asInstanceOf[js.Any], stateChanges = stateChanges.asInstanceOf[js.Any], userAttributesForFindings = userAttributesForFindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentRun]
  }
  @scala.inline
  implicit class AssessmentRunOps[Self <: AssessmentRun] (val x: Self) extends AnyVal {
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
    def setAssessmentTemplateArn(value: Arn): Self = this.set("assessmentTemplateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataCollected(value: Bool): Self = this.set("dataCollected", value.asInstanceOf[js.Any])
    @scala.inline
    def setDurationInSeconds(value: AssessmentRunDuration): Self = this.set("durationInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindingCounts(value: AssessmentRunFindingCounts): Self = this.set("findingCounts", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: AssessmentRunName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotificationsVarargs(value: AssessmentRunNotification*): Self = this.set("notifications", js.Array(value :_*))
    @scala.inline
    def setNotifications(value: AssessmentRunNotificationList): Self = this.set("notifications", value.asInstanceOf[js.Any])
    @scala.inline
    def setRulesPackageArnsVarargs(value: Arn*): Self = this.set("rulesPackageArns", js.Array(value :_*))
    @scala.inline
    def setRulesPackageArns(value: AssessmentRulesPackageArnList): Self = this.set("rulesPackageArns", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: AssessmentRunState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateChangedAt(value: Timestamp): Self = this.set("stateChangedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateChangesVarargs(value: AssessmentRunStateChange*): Self = this.set("stateChanges", js.Array(value :_*))
    @scala.inline
    def setStateChanges(value: AssessmentRunStateChangeList): Self = this.set("stateChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserAttributesForFindingsVarargs(value: Attribute*): Self = this.set("userAttributesForFindings", js.Array(value :_*))
    @scala.inline
    def setUserAttributesForFindings(value: UserAttributeList): Self = this.set("userAttributesForFindings", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompletedAt(value: Timestamp): Self = this.set("completedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedAt: Self = this.set("completedAt", js.undefined)
    @scala.inline
    def setStartedAt(value: Timestamp): Self = this.set("startedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedAt: Self = this.set("startedAt", js.undefined)
  }
  
}

