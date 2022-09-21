package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncidentRecord extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the incident record.
    */
  var arn: Arn
  
  /**
    * The runbook, or automation document, that's run at the beginning of the incident.
    */
  var automationExecutions: js.UndefOr[AutomationExecutionSet] = js.undefined
  
  /**
    * The chat channel used for collaboration during an incident.
    */
  var chatChannel: js.UndefOr[ChatChannel] = js.undefined
  
  /**
    * The time that Incident Manager created the incident record.
    */
  var creationTime: js.Date
  
  /**
    * The string Incident Manager uses to prevent duplicate incidents from being created by the same incident in the same account.
    */
  var dedupeString: DedupeString
  
  /**
    * The impact of the incident on customers and applications.
    */
  var impact: Impact
  
  /**
    * Details about the action that started the incident.
    */
  var incidentRecordSource: IncidentRecordSource
  
  /**
    * Who modified the incident most recently.
    */
  var lastModifiedBy: Arn
  
  /**
    * The time at which the incident was most recently modified.
    */
  var lastModifiedTime: js.Date
  
  /**
    * The Amazon SNS targets that are notified when updates are made to an incident.
    */
  var notificationTargets: js.UndefOr[NotificationTargetSet] = js.undefined
  
  /**
    * The time at which the incident was resolved. This appears as a timeline event.
    */
  var resolvedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current status of the incident.
    */
  var status: IncidentRecordStatus
  
  /**
    * The summary of the incident. The summary is a brief synopsis of what occurred, what's currently happening, and context of the incident.
    */
  var summary: js.UndefOr[IncidentSummary] = js.undefined
  
  /**
    * The title of the incident.
    */
  var title: IncidentTitle
}
object IncidentRecord {
  
  inline def apply(
    arn: Arn,
    creationTime: js.Date,
    dedupeString: DedupeString,
    impact: Impact,
    incidentRecordSource: IncidentRecordSource,
    lastModifiedBy: Arn,
    lastModifiedTime: js.Date,
    status: IncidentRecordStatus,
    title: IncidentTitle
  ): IncidentRecord = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], dedupeString = dedupeString.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], incidentRecordSource = incidentRecordSource.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedTime = lastModifiedTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncidentRecord]
  }
  
  extension [Self <: IncidentRecord](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setAutomationExecutions(value: AutomationExecutionSet): Self = StObject.set(x, "automationExecutions", value.asInstanceOf[js.Any])
    
    inline def setAutomationExecutionsUndefined: Self = StObject.set(x, "automationExecutions", js.undefined)
    
    inline def setAutomationExecutionsVarargs(value: AutomationExecution*): Self = StObject.set(x, "automationExecutions", js.Array(value*))
    
    inline def setChatChannel(value: ChatChannel): Self = StObject.set(x, "chatChannel", value.asInstanceOf[js.Any])
    
    inline def setChatChannelUndefined: Self = StObject.set(x, "chatChannel", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDedupeString(value: DedupeString): Self = StObject.set(x, "dedupeString", value.asInstanceOf[js.Any])
    
    inline def setImpact(value: Impact): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    inline def setIncidentRecordSource(value: IncidentRecordSource): Self = StObject.set(x, "incidentRecordSource", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedBy(value: Arn): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setNotificationTargets(value: NotificationTargetSet): Self = StObject.set(x, "notificationTargets", value.asInstanceOf[js.Any])
    
    inline def setNotificationTargetsUndefined: Self = StObject.set(x, "notificationTargets", js.undefined)
    
    inline def setNotificationTargetsVarargs(value: NotificationTargetItem*): Self = StObject.set(x, "notificationTargets", js.Array(value*))
    
    inline def setResolvedTime(value: js.Date): Self = StObject.set(x, "resolvedTime", value.asInstanceOf[js.Any])
    
    inline def setResolvedTimeUndefined: Self = StObject.set(x, "resolvedTime", js.undefined)
    
    inline def setStatus(value: IncidentRecordStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: IncidentSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setTitle(value: IncidentTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
