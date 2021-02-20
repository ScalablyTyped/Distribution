package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientXrayNode.typesHttpMod.Http
import typings.awsSdkClientXrayNode.typesHttpMod.UnmarshalledHttp
import typings.awsSdkClientXrayNode.typesServiceIdMod.ServiceId
import typings.awsSdkClientXrayNode.typesServiceIdMod.UnmarshalledServiceId
import typings.awsSdkClientXrayNode.typesTraceUserMod.TraceUser
import typings.awsSdkClientXrayNode.typesTraceUserMod.UnmarshalledTraceUser
import typings.awsSdkClientXrayNode.typesValueWithServiceIdsMod.UnmarshalledValueWithServiceIds
import typings.awsSdkClientXrayNode.typesValueWithServiceIdsMod.ValueWithServiceIds
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTraceSummaryMod {
  
  @js.native
  trait TraceSummary extends StObject {
    
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
    implicit class TraceSummaryMutableBuilder[Self <: TraceSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotations(
        value: (StringDictionary[js.Array[ValueWithServiceIds] | Iterable[ValueWithServiceIds]]) | (Iterable[js.Tuple2[String, js.Array[ValueWithServiceIds] | Iterable[ValueWithServiceIds]]])
      ): Self = StObject.set(x, "Annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationsUndefined: Self = StObject.set(x, "Annotations", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
      
      @scala.inline
      def setHasError(value: Boolean): Self = StObject.set(x, "HasError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasErrorUndefined: Self = StObject.set(x, "HasError", js.undefined)
      
      @scala.inline
      def setHasFault(value: Boolean): Self = StObject.set(x, "HasFault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasFaultUndefined: Self = StObject.set(x, "HasFault", js.undefined)
      
      @scala.inline
      def setHasThrottle(value: Boolean): Self = StObject.set(x, "HasThrottle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasThrottleUndefined: Self = StObject.set(x, "HasThrottle", js.undefined)
      
      @scala.inline
      def setHttp(value: Http): Self = StObject.set(x, "Http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpUndefined: Self = StObject.set(x, "Http", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      @scala.inline
      def setIsPartial(value: Boolean): Self = StObject.set(x, "IsPartial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPartialUndefined: Self = StObject.set(x, "IsPartial", js.undefined)
      
      @scala.inline
      def setResponseTime(value: Double): Self = StObject.set(x, "ResponseTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTimeUndefined: Self = StObject.set(x, "ResponseTime", js.undefined)
      
      @scala.inline
      def setServiceIds(value: js.Array[ServiceId] | Iterable[ServiceId]): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceIdsUndefined: Self = StObject.set(x, "ServiceIds", js.undefined)
      
      @scala.inline
      def setServiceIdsVarargs(value: ServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value :_*))
      
      @scala.inline
      def setUsers(value: js.Array[TraceUser] | Iterable[TraceUser]): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
      
      @scala.inline
      def setUsersVarargs(value: TraceUser*): Self = StObject.set(x, "Users", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledTraceSummary extends TraceSummary {
    
    /**
      * <p>Annotations from the trace's segment documents.</p>
      */
    @JSName("Annotations")
    var Annotations_UnmarshalledTraceSummary: js.UndefOr[StringDictionary[js.Array[UnmarshalledValueWithServiceIds]]] = js.native
    
    /**
      * <p>Information about the HTTP request served by the trace.</p>
      */
    @JSName("Http")
    var Http_UnmarshalledTraceSummary: js.UndefOr[UnmarshalledHttp] = js.native
    
    /**
      * <p>Service IDs from the trace's segment documents.</p>
      */
    @JSName("ServiceIds")
    var ServiceIds_UnmarshalledTraceSummary: js.UndefOr[js.Array[UnmarshalledServiceId]] = js.native
    
    /**
      * <p>Users from the trace's segment documents.</p>
      */
    @JSName("Users")
    var Users_UnmarshalledTraceSummary: js.UndefOr[js.Array[UnmarshalledTraceUser]] = js.native
  }
  object UnmarshalledTraceSummary {
    
    @scala.inline
    def apply(): UnmarshalledTraceSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledTraceSummary]
    }
    
    @scala.inline
    implicit class UnmarshalledTraceSummaryMutableBuilder[Self <: UnmarshalledTraceSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotations(value: StringDictionary[js.Array[UnmarshalledValueWithServiceIds]]): Self = StObject.set(x, "Annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationsUndefined: Self = StObject.set(x, "Annotations", js.undefined)
      
      @scala.inline
      def setHttp(value: UnmarshalledHttp): Self = StObject.set(x, "Http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpUndefined: Self = StObject.set(x, "Http", js.undefined)
      
      @scala.inline
      def setServiceIds(value: js.Array[UnmarshalledServiceId]): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceIdsUndefined: Self = StObject.set(x, "ServiceIds", js.undefined)
      
      @scala.inline
      def setServiceIdsVarargs(value: UnmarshalledServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value :_*))
      
      @scala.inline
      def setUsers(value: js.Array[UnmarshalledTraceUser]): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
      
      @scala.inline
      def setUsersVarargs(value: UnmarshalledTraceUser*): Self = StObject.set(x, "Users", js.Array(value :_*))
    }
  }
}
