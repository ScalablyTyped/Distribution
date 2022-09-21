package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentRun extends StObject {
  
  /**
    * The ARN of the assessment run.
    */
  var arn: Arn
  
  /**
    * The ARN of the assessment template that is associated with the assessment run.
    */
  var assessmentTemplateArn: Arn
  
  /**
    * The assessment run completion time that corresponds to the rules packages evaluation completion time or failure.
    */
  var completedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when StartAssessmentRun was called.
    */
  var createdAt: js.Date
  
  /**
    * A Boolean value (true or false) that specifies whether the process of collecting data from the agents is completed.
    */
  var dataCollected: Bool
  
  /**
    * The duration of the assessment run.
    */
  var durationInSeconds: AssessmentRunDuration
  
  /**
    * Provides a total count of generated findings per severity.
    */
  var findingCounts: AssessmentRunFindingCounts
  
  /**
    * The auto-generated name for the assessment run.
    */
  var name: AssessmentRunName
  
  /**
    * A list of notifications for the event subscriptions. A notification about a particular generated finding is added to this list only once.
    */
  var notifications: AssessmentRunNotificationList
  
  /**
    * The rules packages selected for the assessment run.
    */
  var rulesPackageArns: AssessmentRulesPackageArnList
  
  /**
    * The time when StartAssessmentRun was called.
    */
  var startedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the assessment run.
    */
  var state: AssessmentRunState
  
  /**
    * The last time when the assessment run's state changed.
    */
  var stateChangedAt: js.Date
  
  /**
    * A list of the assessment run state changes.
    */
  var stateChanges: AssessmentRunStateChangeList
  
  /**
    * The user-defined attributes that are assigned to every generated finding.
    */
  var userAttributesForFindings: UserAttributeList
}
object AssessmentRun {
  
  inline def apply(
    arn: Arn,
    assessmentTemplateArn: Arn,
    createdAt: js.Date,
    dataCollected: Bool,
    durationInSeconds: AssessmentRunDuration,
    findingCounts: AssessmentRunFindingCounts,
    name: AssessmentRunName,
    notifications: AssessmentRunNotificationList,
    rulesPackageArns: AssessmentRulesPackageArnList,
    state: AssessmentRunState,
    stateChangedAt: js.Date,
    stateChanges: AssessmentRunStateChangeList,
    userAttributesForFindings: UserAttributeList
  ): AssessmentRun = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], dataCollected = dataCollected.asInstanceOf[js.Any], durationInSeconds = durationInSeconds.asInstanceOf[js.Any], findingCounts = findingCounts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], rulesPackageArns = rulesPackageArns.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateChangedAt = stateChangedAt.asInstanceOf[js.Any], stateChanges = stateChanges.asInstanceOf[js.Any], userAttributesForFindings = userAttributesForFindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentRun]
  }
  
  extension [Self <: AssessmentRun](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setAssessmentTemplateArn(value: Arn): Self = StObject.set(x, "assessmentTemplateArn", value.asInstanceOf[js.Any])
    
    inline def setCompletedAt(value: js.Date): Self = StObject.set(x, "completedAt", value.asInstanceOf[js.Any])
    
    inline def setCompletedAtUndefined: Self = StObject.set(x, "completedAt", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDataCollected(value: Bool): Self = StObject.set(x, "dataCollected", value.asInstanceOf[js.Any])
    
    inline def setDurationInSeconds(value: AssessmentRunDuration): Self = StObject.set(x, "durationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setFindingCounts(value: AssessmentRunFindingCounts): Self = StObject.set(x, "findingCounts", value.asInstanceOf[js.Any])
    
    inline def setName(value: AssessmentRunName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNotifications(value: AssessmentRunNotificationList): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsVarargs(value: AssessmentRunNotification*): Self = StObject.set(x, "notifications", js.Array(value*))
    
    inline def setRulesPackageArns(value: AssessmentRulesPackageArnList): Self = StObject.set(x, "rulesPackageArns", value.asInstanceOf[js.Any])
    
    inline def setRulesPackageArnsVarargs(value: Arn*): Self = StObject.set(x, "rulesPackageArns", js.Array(value*))
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
    
    inline def setState(value: AssessmentRunState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateChangedAt(value: js.Date): Self = StObject.set(x, "stateChangedAt", value.asInstanceOf[js.Any])
    
    inline def setStateChanges(value: AssessmentRunStateChangeList): Self = StObject.set(x, "stateChanges", value.asInstanceOf[js.Any])
    
    inline def setStateChangesVarargs(value: AssessmentRunStateChange*): Self = StObject.set(x, "stateChanges", js.Array(value*))
    
    inline def setUserAttributesForFindings(value: UserAttributeList): Self = StObject.set(x, "userAttributesForFindings", value.asInstanceOf[js.Any])
    
    inline def setUserAttributesForFindingsVarargs(value: Attribute*): Self = StObject.set(x, "userAttributesForFindings", js.Array(value*))
  }
}
