package typings.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobileanalyticsMod {
  
  @JSImport("aws-sdk/clients/mobileanalytics", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends MobileAnalytics {
    def this(options: ClientConfiguration) = this()
  }
  
  trait Blob extends StObject
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.mobileanalyticsMod.apiVersion] = js.undefined
  }
  object ClientApiVersions {
    
    @scala.inline
    def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    @scala.inline
    implicit class ClientApiVersionsMutableBuilder[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  @js.native
  trait ClientConfiguration
    extends ServiceConfigurationOptions
       with ClientApiVersions
  
  type Double = scala.Double
  
  trait Event extends StObject {
    
    /**
      * A collection of key-value pairs that give additional context to the event. The key-value pairs are specified by the developer. This collection can be empty or the attribute object can be omitted.
      */
    var attributes: js.UndefOr[MapOfStringToString] = js.undefined
    
    /**
      * A name signifying an event that occurred in your app. This is used for grouping and aggregating like events together for reporting purposes.
      */
    var eventType: String50Chars
    
    /**
      * A collection of key-value pairs that gives additional, measurable context to the event. The key-value pairs are specified by the developer. This collection can be empty or the attribute object can be omitted.
      */
    var metrics: js.UndefOr[MapOfStringToNumber] = js.undefined
    
    /**
      * The session the event occured within. 
      */
    var session: js.UndefOr[Session] = js.undefined
    
    /**
      * The time the event occurred in ISO 8601 standard date time format. For example, 2014-06-30T19:07:47.885Z
      */
    var timestamp: ISO8601Timestamp
    
    /**
      * The version of the event.
      */
    var version: js.UndefOr[String10Chars] = js.undefined
  }
  object Event {
    
    @scala.inline
    def apply(eventType: String50Chars, timestamp: ISO8601Timestamp): Event = {
      val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: MapOfStringToString): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setEventType(value: String50Chars): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetrics(value: MapOfStringToNumber): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      @scala.inline
      def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setTimestamp(value: ISO8601Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String10Chars): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type EventListDefinition = js.Array[Event]
  
  type ISO8601Timestamp = java.lang.String
  
  type Long = scala.Double
  
  type MapOfStringToNumber = StringDictionary[Double]
  
  type MapOfStringToString = StringDictionary[String0to1000Chars]
  
  @js.native
  trait MobileAnalytics extends Service {
    
    @JSName("config")
    var config_MobileAnalytics: ConfigBase & ClientConfiguration = js.native
    
    /**
      * The PutEvents operation records one or more events. You can have up to 1,500 unique custom events per app, any combination of up to 40 attributes and metrics per custom event, and any number of attribute or metric values.
      */
    def putEvents(): Request[js.Object, AWSError] = js.native
    def putEvents(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    /**
      * The PutEvents operation records one or more events. You can have up to 1,500 unique custom events per app, any combination of up to 40 attributes and metrics per custom event, and any number of attribute or metric values.
      */
    def putEvents(params: PutEventsInput): Request[js.Object, AWSError] = js.native
    def putEvents(params: PutEventsInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  }
  
  trait PutEventsInput extends StObject {
    
    /**
      * The client context including the client ID, app title, app version and package name.
      */
    var clientContext: String
    
    /**
      * The encoding used for the client context.
      */
    var clientContextEncoding: js.UndefOr[String] = js.undefined
    
    /**
      * An array of Event JSON objects
      */
    var events: EventListDefinition
  }
  object PutEventsInput {
    
    @scala.inline
    def apply(clientContext: String, events: EventListDefinition): PutEventsInput = {
      val __obj = js.Dynamic.literal(clientContext = clientContext.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutEventsInput]
    }
    
    @scala.inline
    implicit class PutEventsInputMutableBuilder[Self <: PutEventsInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientContext(value: String): Self = StObject.set(x, "clientContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientContextEncoding(value: String): Self = StObject.set(x, "clientContextEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientContextEncodingUndefined: Self = StObject.set(x, "clientContextEncoding", js.undefined)
      
      @scala.inline
      def setEvents(value: EventListDefinition): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
    }
  }
  
  trait Session extends StObject {
    
    /**
      * The duration of the session.
      */
    var duration: js.UndefOr[Long] = js.undefined
    
    /**
      * A unique identifier for the session
      */
    var id: js.UndefOr[String50Chars] = js.undefined
    
    /**
      * The time the event started in ISO 8601 standard date time format. For example, 2014-06-30T19:07:47.885Z
      */
    var startTimestamp: js.UndefOr[ISO8601Timestamp] = js.undefined
    
    /**
      * The time the event terminated in ISO 8601 standard date time format. For example, 2014-06-30T19:07:47.885Z
      */
    var stopTimestamp: js.UndefOr[ISO8601Timestamp] = js.undefined
  }
  object Session {
    
    @scala.inline
    def apply(): Session = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Session]
    }
    
    @scala.inline
    implicit class SessionMutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Long): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setId(value: String50Chars): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setStartTimestamp(value: ISO8601Timestamp): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
      
      @scala.inline
      def setStopTimestamp(value: ISO8601Timestamp): Self = StObject.set(x, "stopTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopTimestampUndefined: Self = StObject.set(x, "stopTimestamp", js.undefined)
    }
  }
  
  type String = java.lang.String
  
  type String0to1000Chars = java.lang.String
  
  type String10Chars = java.lang.String
  
  type String50Chars = java.lang.String
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2014-06-05`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
