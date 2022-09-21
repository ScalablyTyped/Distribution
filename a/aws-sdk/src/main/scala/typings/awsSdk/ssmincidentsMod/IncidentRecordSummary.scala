package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncidentRecordSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the incident.
    */
  var arn: Arn
  
  /**
    * The time the incident was created.
    */
  var creationTime: js.Date
  
  /**
    * Defines the impact to customers and applications.
    */
  var impact: Impact
  
  /**
    * What caused Incident Manager to create the incident.
    */
  var incidentRecordSource: IncidentRecordSource
  
  /**
    * The time the incident was resolved.
    */
  var resolvedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current status of the incident.
    */
  var status: IncidentRecordStatus
  
  /**
    * The title of the incident. This value is either provided by the response plan or overwritten on creation.
    */
  var title: IncidentTitle
}
object IncidentRecordSummary {
  
  inline def apply(
    arn: Arn,
    creationTime: js.Date,
    impact: Impact,
    incidentRecordSource: IncidentRecordSource,
    status: IncidentRecordStatus,
    title: IncidentTitle
  ): IncidentRecordSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], incidentRecordSource = incidentRecordSource.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncidentRecordSummary]
  }
  
  extension [Self <: IncidentRecordSummary](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setImpact(value: Impact): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    inline def setIncidentRecordSource(value: IncidentRecordSource): Self = StObject.set(x, "incidentRecordSource", value.asInstanceOf[js.Any])
    
    inline def setResolvedTime(value: js.Date): Self = StObject.set(x, "resolvedTime", value.asInstanceOf[js.Any])
    
    inline def setResolvedTimeUndefined: Self = StObject.set(x, "resolvedTime", js.undefined)
    
    inline def setStatus(value: IncidentRecordStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: IncidentTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
