package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceSummary extends js.Object {
  
  /**
    * Annotations from the trace's segment documents.
    */
  var Annotations: js.UndefOr[typings.awsSdk.xrayMod.Annotations] = js.native
  
  /**
    * A list of Availability Zones for any zone corresponding to the trace segments.
    */
  var AvailabilityZones: js.UndefOr[TraceAvailabilityZones] = js.native
  
  /**
    * The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.
    */
  var Duration: js.UndefOr[NullableDouble] = js.native
  
  /**
    * The root of a trace.
    */
  var EntryPoint: js.UndefOr[ServiceId] = js.native
  
  /**
    * A collection of ErrorRootCause structures corresponding to the trace segments.
    */
  var ErrorRootCauses: js.UndefOr[typings.awsSdk.xrayMod.ErrorRootCauses] = js.native
  
  /**
    * A collection of FaultRootCause structures corresponding to the trace segments.
    */
  var FaultRootCauses: js.UndefOr[typings.awsSdk.xrayMod.FaultRootCauses] = js.native
  
  /**
    * The root segment document has a 400 series error.
    */
  var HasError: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * The root segment document has a 500 series error.
    */
  var HasFault: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * One or more of the segment documents has a 429 throttling error.
    */
  var HasThrottle: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * Information about the HTTP request served by the trace.
    */
  var Http: js.UndefOr[typings.awsSdk.xrayMod.Http] = js.native
  
  /**
    * The unique identifier for the request that generated the trace's segments and subsegments.
    */
  var Id: js.UndefOr[TraceId] = js.native
  
  /**
    * A list of EC2 instance IDs for any instance corresponding to the trace segments.
    */
  var InstanceIds: js.UndefOr[TraceInstanceIds] = js.native
  
  /**
    * One or more of the segment documents is in progress.
    */
  var IsPartial: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * The matched time stamp of a defined event.
    */
  var MatchedEventTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * A list of resource ARNs for any resource corresponding to the trace segments.
    */
  var ResourceARNs: js.UndefOr[TraceResourceARNs] = js.native
  
  /**
    * The length of time in seconds between the start and end times of the root segment. If the service performs work asynchronously, the response time measures the time before the response is sent to the user, while the duration measures the amount of time before the last traced activity completes.
    */
  var ResponseTime: js.UndefOr[NullableDouble] = js.native
  
  /**
    * A collection of ResponseTimeRootCause structures corresponding to the trace segments.
    */
  var ResponseTimeRootCauses: js.UndefOr[typings.awsSdk.xrayMod.ResponseTimeRootCauses] = js.native
  
  /**
    * The revision number of a trace.
    */
  var Revision: js.UndefOr[Integer] = js.native
  
  /**
    * Service IDs from the trace's segment documents.
    */
  var ServiceIds: js.UndefOr[typings.awsSdk.xrayMod.ServiceIds] = js.native
  
  /**
    * Users from the trace's segment documents.
    */
  var Users: js.UndefOr[TraceUsers] = js.native
}
object TraceSummary {
  
  @scala.inline
  def apply(): TraceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceSummary]
  }
  
  @scala.inline
  implicit class TraceSummaryOps[Self <: TraceSummary] (val x: Self) extends AnyVal {
    
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
    def setAnnotations(value: Annotations): Self = this.set("Annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("Annotations", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZoneDetail*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: TraceAvailabilityZones): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    
    @scala.inline
    def setDuration(value: NullableDouble): Self = this.set("Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    
    @scala.inline
    def setEntryPoint(value: ServiceId): Self = this.set("EntryPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryPoint: Self = this.set("EntryPoint", js.undefined)
    
    @scala.inline
    def setErrorRootCausesVarargs(value: ErrorRootCause*): Self = this.set("ErrorRootCauses", js.Array(value :_*))
    
    @scala.inline
    def setErrorRootCauses(value: ErrorRootCauses): Self = this.set("ErrorRootCauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorRootCauses: Self = this.set("ErrorRootCauses", js.undefined)
    
    @scala.inline
    def setFaultRootCausesVarargs(value: FaultRootCause*): Self = this.set("FaultRootCauses", js.Array(value :_*))
    
    @scala.inline
    def setFaultRootCauses(value: FaultRootCauses): Self = this.set("FaultRootCauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaultRootCauses: Self = this.set("FaultRootCauses", js.undefined)
    
    @scala.inline
    def setHasError(value: NullableBoolean): Self = this.set("HasError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasError: Self = this.set("HasError", js.undefined)
    
    @scala.inline
    def setHasFault(value: NullableBoolean): Self = this.set("HasFault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasFault: Self = this.set("HasFault", js.undefined)
    
    @scala.inline
    def setHasThrottle(value: NullableBoolean): Self = this.set("HasThrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasThrottle: Self = this.set("HasThrottle", js.undefined)
    
    @scala.inline
    def setHttp(value: Http): Self = this.set("Http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("Http", js.undefined)
    
    @scala.inline
    def setId(value: TraceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setInstanceIdsVarargs(value: InstanceIdDetail*): Self = this.set("InstanceIds", js.Array(value :_*))
    
    @scala.inline
    def setInstanceIds(value: TraceInstanceIds): Self = this.set("InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceIds: Self = this.set("InstanceIds", js.undefined)
    
    @scala.inline
    def setIsPartial(value: NullableBoolean): Self = this.set("IsPartial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPartial: Self = this.set("IsPartial", js.undefined)
    
    @scala.inline
    def setMatchedEventTime(value: Timestamp): Self = this.set("MatchedEventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchedEventTime: Self = this.set("MatchedEventTime", js.undefined)
    
    @scala.inline
    def setResourceARNsVarargs(value: ResourceARNDetail*): Self = this.set("ResourceARNs", js.Array(value :_*))
    
    @scala.inline
    def setResourceARNs(value: TraceResourceARNs): Self = this.set("ResourceARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceARNs: Self = this.set("ResourceARNs", js.undefined)
    
    @scala.inline
    def setResponseTime(value: NullableDouble): Self = this.set("ResponseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTime: Self = this.set("ResponseTime", js.undefined)
    
    @scala.inline
    def setResponseTimeRootCausesVarargs(value: ResponseTimeRootCause*): Self = this.set("ResponseTimeRootCauses", js.Array(value :_*))
    
    @scala.inline
    def setResponseTimeRootCauses(value: ResponseTimeRootCauses): Self = this.set("ResponseTimeRootCauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTimeRootCauses: Self = this.set("ResponseTimeRootCauses", js.undefined)
    
    @scala.inline
    def setRevision(value: Integer): Self = this.set("Revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevision: Self = this.set("Revision", js.undefined)
    
    @scala.inline
    def setServiceIdsVarargs(value: ServiceId*): Self = this.set("ServiceIds", js.Array(value :_*))
    
    @scala.inline
    def setServiceIds(value: ServiceIds): Self = this.set("ServiceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceIds: Self = this.set("ServiceIds", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: TraceUser*): Self = this.set("Users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: TraceUsers): Self = this.set("Users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("Users", js.undefined)
  }
}
