package typings.awsSdkClientXrayNode.typesTraceSummaryMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientXrayNode.typesHttpMod.Http
import typings.awsSdkClientXrayNode.typesServiceIdMod.ServiceId
import typings.awsSdkClientXrayNode.typesTraceUserMod.TraceUser
import typings.awsSdkClientXrayNode.typesValueWithServiceIdsMod.ValueWithServiceIds
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceSummary extends js.Object {
  
  /**
    * <p>Annotations from the trace's segment documents.</p>
    */
  var Annotations: js.UndefOr[
    (StringDictionary[js.Array[ValueWithServiceIds] | Iterable[ValueWithServiceIds]]) | (Iterable[js.Tuple2[String, js.Array[ValueWithServiceIds] | Iterable[ValueWithServiceIds]]])
  ] = js.native
  
  /**
    * <p>The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.</p>
    */
  var Duration: js.UndefOr[Double] = js.native
  
  /**
    * <p>One or more of the segment documents has a 400 series error.</p>
    */
  var HasError: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>One or more of the segment documents has a 500 series error.</p>
    */
  var HasFault: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>One or more of the segment documents has a 429 throttling error.</p>
    */
  var HasThrottle: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>Information about the HTTP request served by the trace.</p>
    */
  var Http: js.UndefOr[typings.awsSdkClientXrayNode.typesHttpMod.Http] = js.native
  
  /**
    * <p>The unique identifier for the request that generated the trace's segments and subsegments.</p>
    */
  var Id: js.UndefOr[String] = js.native
  
  /**
    * <p>One or more of the segment documents is in progress.</p>
    */
  var IsPartial: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>The length of time in seconds between the start and end times of the root segment. If the service performs work asynchronously, the response time measures the time before the response is sent to the user, while the duration measures the amount of time before the last traced activity completes.</p>
    */
  var ResponseTime: js.UndefOr[Double] = js.native
  
  /**
    * <p>Service IDs from the trace's segment documents.</p>
    */
  var ServiceIds: js.UndefOr[js.Array[ServiceId] | Iterable[ServiceId]] = js.native
  
  /**
    * <p>Users from the trace's segment documents.</p>
    */
  var Users: js.UndefOr[js.Array[TraceUser] | Iterable[TraceUser]] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnnotations(
      value: (StringDictionary[js.Array[ValueWithServiceIds] | Iterable[ValueWithServiceIds]]) | (Iterable[js.Tuple2[String, js.Array[ValueWithServiceIds] | Iterable[ValueWithServiceIds]]])
    ): Self = this.set("Annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("Annotations", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    
    @scala.inline
    def setHasError(value: Boolean): Self = this.set("HasError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasError: Self = this.set("HasError", js.undefined)
    
    @scala.inline
    def setHasFault(value: Boolean): Self = this.set("HasFault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasFault: Self = this.set("HasFault", js.undefined)
    
    @scala.inline
    def setHasThrottle(value: Boolean): Self = this.set("HasThrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasThrottle: Self = this.set("HasThrottle", js.undefined)
    
    @scala.inline
    def setHttp(value: Http): Self = this.set("Http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("Http", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setIsPartial(value: Boolean): Self = this.set("IsPartial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPartial: Self = this.set("IsPartial", js.undefined)
    
    @scala.inline
    def setResponseTime(value: Double): Self = this.set("ResponseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTime: Self = this.set("ResponseTime", js.undefined)
    
    @scala.inline
    def setServiceIdsVarargs(value: ServiceId*): Self = this.set("ServiceIds", js.Array(value :_*))
    
    @scala.inline
    def setServiceIds(value: js.Array[ServiceId] | Iterable[ServiceId]): Self = this.set("ServiceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceIds: Self = this.set("ServiceIds", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: TraceUser*): Self = this.set("Users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[TraceUser] | Iterable[TraceUser]): Self = this.set("Users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("Users", js.undefined)
  }
}
