package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraceSummary extends StObject {
  
  /**
    * Annotations from the trace's segment documents.
    */
  var Annotations: js.UndefOr[typings.awsSdk.clientsXrayMod.Annotations] = js.undefined
  
  /**
    * A list of Availability Zones for any zone corresponding to the trace segments.
    */
  var AvailabilityZones: js.UndefOr[TraceAvailabilityZones] = js.undefined
  
  /**
    * The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.
    */
  var Duration: js.UndefOr[NullableDouble] = js.undefined
  
  /**
    * The root of a trace.
    */
  var EntryPoint: js.UndefOr[ServiceId] = js.undefined
  
  /**
    * A collection of ErrorRootCause structures corresponding to the trace segments.
    */
  var ErrorRootCauses: js.UndefOr[typings.awsSdk.clientsXrayMod.ErrorRootCauses] = js.undefined
  
  /**
    * A collection of FaultRootCause structures corresponding to the trace segments.
    */
  var FaultRootCauses: js.UndefOr[typings.awsSdk.clientsXrayMod.FaultRootCauses] = js.undefined
  
  /**
    * The root segment document has a 400 series error.
    */
  var HasError: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The root segment document has a 500 series error.
    */
  var HasFault: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * One or more of the segment documents has a 429 throttling error.
    */
  var HasThrottle: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Information about the HTTP request served by the trace.
    */
  var Http: js.UndefOr[typings.awsSdk.clientsXrayMod.Http] = js.undefined
  
  /**
    * The unique identifier for the request that generated the trace's segments and subsegments.
    */
  var Id: js.UndefOr[TraceId] = js.undefined
  
  /**
    * A list of EC2 instance IDs for any instance corresponding to the trace segments.
    */
  var InstanceIds: js.UndefOr[TraceInstanceIds] = js.undefined
  
  /**
    * One or more of the segment documents is in progress.
    */
  var IsPartial: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The matched time stamp of a defined event.
    */
  var MatchedEventTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of resource ARNs for any resource corresponding to the trace segments.
    */
  var ResourceARNs: js.UndefOr[TraceResourceARNs] = js.undefined
  
  /**
    * The length of time in seconds between the start and end times of the root segment. If the service performs work asynchronously, the response time measures the time before the response is sent to the user, while the duration measures the amount of time before the last traced activity completes.
    */
  var ResponseTime: js.UndefOr[NullableDouble] = js.undefined
  
  /**
    * A collection of ResponseTimeRootCause structures corresponding to the trace segments.
    */
  var ResponseTimeRootCauses: js.UndefOr[typings.awsSdk.clientsXrayMod.ResponseTimeRootCauses] = js.undefined
  
  /**
    * The revision number of a trace.
    */
  var Revision: js.UndefOr[Integer] = js.undefined
  
  /**
    * Service IDs from the trace's segment documents.
    */
  var ServiceIds: js.UndefOr[typings.awsSdk.clientsXrayMod.ServiceIds] = js.undefined
  
  /**
    * Users from the trace's segment documents.
    */
  var Users: js.UndefOr[TraceUsers] = js.undefined
}
object TraceSummary {
  
  inline def apply(): TraceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TraceSummary] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: Annotations): Self = StObject.set(x, "Annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "Annotations", js.undefined)
    
    inline def setAvailabilityZones(value: TraceAvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: AvailabilityZoneDetail*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setDuration(value: NullableDouble): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setEntryPoint(value: ServiceId): Self = StObject.set(x, "EntryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointUndefined: Self = StObject.set(x, "EntryPoint", js.undefined)
    
    inline def setErrorRootCauses(value: ErrorRootCauses): Self = StObject.set(x, "ErrorRootCauses", value.asInstanceOf[js.Any])
    
    inline def setErrorRootCausesUndefined: Self = StObject.set(x, "ErrorRootCauses", js.undefined)
    
    inline def setErrorRootCausesVarargs(value: ErrorRootCause*): Self = StObject.set(x, "ErrorRootCauses", js.Array(value*))
    
    inline def setFaultRootCauses(value: FaultRootCauses): Self = StObject.set(x, "FaultRootCauses", value.asInstanceOf[js.Any])
    
    inline def setFaultRootCausesUndefined: Self = StObject.set(x, "FaultRootCauses", js.undefined)
    
    inline def setFaultRootCausesVarargs(value: FaultRootCause*): Self = StObject.set(x, "FaultRootCauses", js.Array(value*))
    
    inline def setHasError(value: NullableBoolean): Self = StObject.set(x, "HasError", value.asInstanceOf[js.Any])
    
    inline def setHasErrorUndefined: Self = StObject.set(x, "HasError", js.undefined)
    
    inline def setHasFault(value: NullableBoolean): Self = StObject.set(x, "HasFault", value.asInstanceOf[js.Any])
    
    inline def setHasFaultUndefined: Self = StObject.set(x, "HasFault", js.undefined)
    
    inline def setHasThrottle(value: NullableBoolean): Self = StObject.set(x, "HasThrottle", value.asInstanceOf[js.Any])
    
    inline def setHasThrottleUndefined: Self = StObject.set(x, "HasThrottle", js.undefined)
    
    inline def setHttp(value: Http): Self = StObject.set(x, "Http", value.asInstanceOf[js.Any])
    
    inline def setHttpUndefined: Self = StObject.set(x, "Http", js.undefined)
    
    inline def setId(value: TraceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInstanceIds(value: TraceInstanceIds): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    inline def setInstanceIdsVarargs(value: InstanceIdDetail*): Self = StObject.set(x, "InstanceIds", js.Array(value*))
    
    inline def setIsPartial(value: NullableBoolean): Self = StObject.set(x, "IsPartial", value.asInstanceOf[js.Any])
    
    inline def setIsPartialUndefined: Self = StObject.set(x, "IsPartial", js.undefined)
    
    inline def setMatchedEventTime(value: js.Date): Self = StObject.set(x, "MatchedEventTime", value.asInstanceOf[js.Any])
    
    inline def setMatchedEventTimeUndefined: Self = StObject.set(x, "MatchedEventTime", js.undefined)
    
    inline def setResourceARNs(value: TraceResourceARNs): Self = StObject.set(x, "ResourceARNs", value.asInstanceOf[js.Any])
    
    inline def setResourceARNsUndefined: Self = StObject.set(x, "ResourceARNs", js.undefined)
    
    inline def setResourceARNsVarargs(value: ResourceARNDetail*): Self = StObject.set(x, "ResourceARNs", js.Array(value*))
    
    inline def setResponseTime(value: NullableDouble): Self = StObject.set(x, "ResponseTime", value.asInstanceOf[js.Any])
    
    inline def setResponseTimeRootCauses(value: ResponseTimeRootCauses): Self = StObject.set(x, "ResponseTimeRootCauses", value.asInstanceOf[js.Any])
    
    inline def setResponseTimeRootCausesUndefined: Self = StObject.set(x, "ResponseTimeRootCauses", js.undefined)
    
    inline def setResponseTimeRootCausesVarargs(value: ResponseTimeRootCause*): Self = StObject.set(x, "ResponseTimeRootCauses", js.Array(value*))
    
    inline def setResponseTimeUndefined: Self = StObject.set(x, "ResponseTime", js.undefined)
    
    inline def setRevision(value: Integer): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "Revision", js.undefined)
    
    inline def setServiceIds(value: ServiceIds): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
    
    inline def setServiceIdsUndefined: Self = StObject.set(x, "ServiceIds", js.undefined)
    
    inline def setServiceIdsVarargs(value: ServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value*))
    
    inline def setUsers(value: TraceUsers): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
    
    inline def setUsersVarargs(value: TraceUser*): Self = StObject.set(x, "Users", js.Array(value*))
  }
}
