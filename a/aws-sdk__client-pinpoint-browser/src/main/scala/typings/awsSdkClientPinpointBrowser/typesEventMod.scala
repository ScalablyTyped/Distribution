package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesSessionMod.Session
import typings.awsSdkClientPinpointBrowser.typesSessionMod.UnmarshalledSession
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventMod {
  
  trait Event extends StObject {
    
    /**
      * Custom attributes that are associated with the event you're adding or updating.
      */
    var Attributes: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
    
    /**
      * The version of the SDK that's running on the client device.
      */
    var ClientSdkVersion: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the custom event that you're recording.
      */
    var EventType: js.UndefOr[String] = js.undefined
    
    /**
      * Custom metrics related to the event.
      */
    var Metrics: js.UndefOr[StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])] = js.undefined
    
    /**
      * Information about the session in which the event occurred.
      */
    var Session: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesSessionMod.Session] = js.undefined
    
    /**
      * The date and time when the event occurred, in ISO 8601 format.
      */
    var Timestamp: js.UndefOr[String] = js.undefined
  }
  object Event {
    
    @scala.inline
    def apply(): Event = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setClientSdkVersion(value: String): Self = StObject.set(x, "ClientSdkVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSdkVersionUndefined: Self = StObject.set(x, "ClientSdkVersion", js.undefined)
      
      @scala.inline
      def setEventType(value: String): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
      
      @scala.inline
      def setMetrics(value: StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
      
      @scala.inline
      def setSession(value: Session): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    }
  }
  
  trait UnmarshalledEvent
    extends StObject
       with Event {
    
    /**
      * Custom attributes that are associated with the event you're adding or updating.
      */
    @JSName("Attributes")
    var Attributes_UnmarshalledEvent: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Custom metrics related to the event.
      */
    @JSName("Metrics")
    var Metrics_UnmarshalledEvent: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    /**
      * Information about the session in which the event occurred.
      */
    @JSName("Session")
    var Session_UnmarshalledEvent: js.UndefOr[UnmarshalledSession] = js.undefined
  }
  object UnmarshalledEvent {
    
    @scala.inline
    def apply(): UnmarshalledEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEvent]
    }
    
    @scala.inline
    implicit class UnmarshalledEventMutableBuilder[Self <: UnmarshalledEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setMetrics(value: StringDictionary[Double]): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
      
      @scala.inline
      def setSession(value: UnmarshalledSession): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
    }
  }
}
