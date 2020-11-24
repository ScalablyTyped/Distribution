package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  /**
    * The package name of the app that's recording the event.
    */
  var AppPackageName: js.UndefOr[string] = js.native
  
  /**
    * The title of the app that's recording the event.
    */
  var AppTitle: js.UndefOr[string] = js.native
  
  /**
    * The version number of the app that's recording the event.
    */
  var AppVersionCode: js.UndefOr[string] = js.native
  
  /**
    * One or more custom attributes that are associated with the event.
    */
  var Attributes: js.UndefOr[MapOfString] = js.native
  
  /**
    * The version of the SDK that's running on the client device.
    */
  var ClientSdkVersion: js.UndefOr[string] = js.native
  
  /**
    * The name of the event.
    */
  var EventType: string = js.native
  
  /**
    * One or more custom metrics that are associated with the event.
    */
  var Metrics: js.UndefOr[MapOfDouble] = js.native
  
  /**
    * The name of the SDK that's being used to record the event.
    */
  var SdkName: js.UndefOr[string] = js.native
  
  /**
    * Information about the session in which the event occurred.
    */
  var Session: js.UndefOr[typings.awsSdk.pinpointMod.Session] = js.native
  
  /**
    * The date and time, in ISO 8601 format, when the event occurred.
    */
  var Timestamp: string = js.native
}
object Event {
  
  @scala.inline
  def apply(EventType: string, Timestamp: string): Event = {
    val __obj = js.Dynamic.literal(EventType = EventType.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    
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
    def setEventType(value: string): Self = this.set("EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: string): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppPackageName(value: string): Self = this.set("AppPackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppPackageName: Self = this.set("AppPackageName", js.undefined)
    
    @scala.inline
    def setAppTitle(value: string): Self = this.set("AppTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppTitle: Self = this.set("AppTitle", js.undefined)
    
    @scala.inline
    def setAppVersionCode(value: string): Self = this.set("AppVersionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppVersionCode: Self = this.set("AppVersionCode", js.undefined)
    
    @scala.inline
    def setAttributes(value: MapOfString): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setClientSdkVersion(value: string): Self = this.set("ClientSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientSdkVersion: Self = this.set("ClientSdkVersion", js.undefined)
    
    @scala.inline
    def setMetrics(value: MapOfDouble): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
    
    @scala.inline
    def setSdkName(value: string): Self = this.set("SdkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdkName: Self = this.set("SdkName", js.undefined)
    
    @scala.inline
    def setSession(value: Session): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("Session", js.undefined)
  }
}
