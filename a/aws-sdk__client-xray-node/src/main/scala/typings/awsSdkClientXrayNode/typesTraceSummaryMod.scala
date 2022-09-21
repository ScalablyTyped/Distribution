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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTraceSummaryMod {
  
  trait TraceSummary extends StObject {
    
    /**
      * <p>Annotations from the trace's segment documents.</p>
      */
    var Annotations: js.UndefOr[
        (StringDictionary[js.Array[ValueWithServiceIds] | js.Iterable[ValueWithServiceIds]]) | (js.Iterable[
          js.Tuple2[String, js.Array[ValueWithServiceIds] | js.Iterable[ValueWithServiceIds]]
        ])
      ] = js.undefined
    
    /**
      * <p>The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.</p>
      */
    var Duration: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>One or more of the segment documents has a 400 series error.</p>
      */
    var HasError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>One or more of the segment documents has a 500 series error.</p>
      */
    var HasFault: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>One or more of the segment documents has a 429 throttling error.</p>
      */
    var HasThrottle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>Information about the HTTP request served by the trace.</p>
      */
    var Http: js.UndefOr[typings.awsSdkClientXrayNode.typesHttpMod.Http] = js.undefined
    
    /**
      * <p>The unique identifier for the request that generated the trace's segments and subsegments.</p>
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /**
      * <p>One or more of the segment documents is in progress.</p>
      */
    var IsPartial: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>The length of time in seconds between the start and end times of the root segment. If the service performs work asynchronously, the response time measures the time before the response is sent to the user, while the duration measures the amount of time before the last traced activity completes.</p>
      */
    var ResponseTime: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Service IDs from the trace's segment documents.</p>
      */
    var ServiceIds: js.UndefOr[js.Array[ServiceId] | js.Iterable[ServiceId]] = js.undefined
    
    /**
      * <p>Users from the trace's segment documents.</p>
      */
    var Users: js.UndefOr[js.Array[TraceUser] | js.Iterable[TraceUser]] = js.undefined
  }
  object TraceSummary {
    
    inline def apply(): TraceSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraceSummary]
    }
    
    extension [Self <: TraceSummary](x: Self) {
      
      inline def setAnnotations(
        value: (StringDictionary[js.Array[ValueWithServiceIds] | js.Iterable[ValueWithServiceIds]]) | (js.Iterable[
              js.Tuple2[String, js.Array[ValueWithServiceIds] | js.Iterable[ValueWithServiceIds]]
            ])
      ): Self = StObject.set(x, "Annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "Annotations", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "HasError", value.asInstanceOf[js.Any])
      
      inline def setHasErrorUndefined: Self = StObject.set(x, "HasError", js.undefined)
      
      inline def setHasFault(value: Boolean): Self = StObject.set(x, "HasFault", value.asInstanceOf[js.Any])
      
      inline def setHasFaultUndefined: Self = StObject.set(x, "HasFault", js.undefined)
      
      inline def setHasThrottle(value: Boolean): Self = StObject.set(x, "HasThrottle", value.asInstanceOf[js.Any])
      
      inline def setHasThrottleUndefined: Self = StObject.set(x, "HasThrottle", js.undefined)
      
      inline def setHttp(value: Http): Self = StObject.set(x, "Http", value.asInstanceOf[js.Any])
      
      inline def setHttpUndefined: Self = StObject.set(x, "Http", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setIsPartial(value: Boolean): Self = StObject.set(x, "IsPartial", value.asInstanceOf[js.Any])
      
      inline def setIsPartialUndefined: Self = StObject.set(x, "IsPartial", js.undefined)
      
      inline def setResponseTime(value: Double): Self = StObject.set(x, "ResponseTime", value.asInstanceOf[js.Any])
      
      inline def setResponseTimeUndefined: Self = StObject.set(x, "ResponseTime", js.undefined)
      
      inline def setServiceIds(value: js.Array[ServiceId] | js.Iterable[ServiceId]): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
      
      inline def setServiceIdsUndefined: Self = StObject.set(x, "ServiceIds", js.undefined)
      
      inline def setServiceIdsVarargs(value: ServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value*))
      
      inline def setUsers(value: js.Array[TraceUser] | js.Iterable[TraceUser]): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
      
      inline def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
      
      inline def setUsersVarargs(value: TraceUser*): Self = StObject.set(x, "Users", js.Array(value*))
    }
  }
  
  trait UnmarshalledTraceSummary
    extends StObject
       with TraceSummary {
    
    /**
      * <p>Annotations from the trace's segment documents.</p>
      */
    @JSName("Annotations")
    var Annotations_UnmarshalledTraceSummary: js.UndefOr[StringDictionary[js.Array[UnmarshalledValueWithServiceIds]]] = js.undefined
    
    /**
      * <p>Information about the HTTP request served by the trace.</p>
      */
    @JSName("Http")
    var Http_UnmarshalledTraceSummary: js.UndefOr[UnmarshalledHttp] = js.undefined
    
    /**
      * <p>Service IDs from the trace's segment documents.</p>
      */
    @JSName("ServiceIds")
    var ServiceIds_UnmarshalledTraceSummary: js.UndefOr[js.Array[UnmarshalledServiceId]] = js.undefined
    
    /**
      * <p>Users from the trace's segment documents.</p>
      */
    @JSName("Users")
    var Users_UnmarshalledTraceSummary: js.UndefOr[js.Array[UnmarshalledTraceUser]] = js.undefined
  }
  object UnmarshalledTraceSummary {
    
    inline def apply(): UnmarshalledTraceSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledTraceSummary]
    }
    
    extension [Self <: UnmarshalledTraceSummary](x: Self) {
      
      inline def setAnnotations(value: StringDictionary[js.Array[UnmarshalledValueWithServiceIds]]): Self = StObject.set(x, "Annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "Annotations", js.undefined)
      
      inline def setHttp(value: UnmarshalledHttp): Self = StObject.set(x, "Http", value.asInstanceOf[js.Any])
      
      inline def setHttpUndefined: Self = StObject.set(x, "Http", js.undefined)
      
      inline def setServiceIds(value: js.Array[UnmarshalledServiceId]): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
      
      inline def setServiceIdsUndefined: Self = StObject.set(x, "ServiceIds", js.undefined)
      
      inline def setServiceIdsVarargs(value: UnmarshalledServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value*))
      
      inline def setUsers(value: js.Array[UnmarshalledTraceUser]): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
      
      inline def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
      
      inline def setUsersVarargs(value: UnmarshalledTraceUser*): Self = StObject.set(x, "Users", js.Array(value*))
    }
  }
}
