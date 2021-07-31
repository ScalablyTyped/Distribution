package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  /**
    * The package name of the app that's recording the event.
    */
  var AppPackageName: js.UndefOr[string] = js.undefined
  
  /**
    * The title of the app that's recording the event.
    */
  var AppTitle: js.UndefOr[string] = js.undefined
  
  /**
    * The version number of the app that's recording the event.
    */
  var AppVersionCode: js.UndefOr[string] = js.undefined
  
  /**
    * One or more custom attributes that are associated with the event.
    */
  var Attributes: js.UndefOr[MapOfString] = js.undefined
  
  /**
    * The version of the SDK that's running on the client device.
    */
  var ClientSdkVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the event.
    */
  var EventType: string
  
  /**
    * One or more custom metrics that are associated with the event.
    */
  var Metrics: js.UndefOr[MapOfDouble] = js.undefined
  
  /**
    * The name of the SDK that's being used to record the event.
    */
  var SdkName: js.UndefOr[string] = js.undefined
  
  /**
    * Information about the session in which the event occurred.
    */
  var Session: js.UndefOr[typings.awsSdk.pinpointMod.Session] = js.undefined
  
  /**
    * The date and time, in ISO 8601 format, when the event occurred.
    */
  var Timestamp: string
}
object Event {
  
  @scala.inline
  def apply(EventType: string, Timestamp: string): Event = {
    val __obj = js.Dynamic.literal(EventType = EventType.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppPackageName(value: string): Self = StObject.set(x, "AppPackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppPackageNameUndefined: Self = StObject.set(x, "AppPackageName", js.undefined)
    
    @scala.inline
    def setAppTitle(value: string): Self = StObject.set(x, "AppTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppTitleUndefined: Self = StObject.set(x, "AppTitle", js.undefined)
    
    @scala.inline
    def setAppVersionCode(value: string): Self = StObject.set(x, "AppVersionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersionCodeUndefined: Self = StObject.set(x, "AppVersionCode", js.undefined)
    
    @scala.inline
    def setAttributes(value: MapOfString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setClientSdkVersion(value: string): Self = StObject.set(x, "ClientSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSdkVersionUndefined: Self = StObject.set(x, "ClientSdkVersion", js.undefined)
    
    @scala.inline
    def setEventType(value: string): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: MapOfDouble): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    @scala.inline
    def setSdkName(value: string): Self = StObject.set(x, "SdkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdkNameUndefined: Self = StObject.set(x, "SdkName", js.undefined)
    
    @scala.inline
    def setSession(value: Session): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
    
    @scala.inline
    def setTimestamp(value: string): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}
