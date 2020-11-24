package typings.awsSdkClientPinpointBrowser.typesEventMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesSessionMod.Session
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  /**
    * Custom attributes that are associated with the event you're adding or updating.
    */
  var Attributes: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
  
  /**
    * The version of the SDK that's running on the client device.
    */
  var ClientSdkVersion: js.UndefOr[String] = js.native
  
  /**
    * The name of the custom event that you're recording.
    */
  var EventType: js.UndefOr[String] = js.native
  
  /**
    * Custom metrics related to the event.
    */
  var Metrics: js.UndefOr[StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])] = js.native
  
  /**
    * Information about the session in which the event occurred.
    */
  var Session: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesSessionMod.Session] = js.native
  
  /**
    * The date and time when the event occurred, in ISO 8601 format.
    */
  var Timestamp: js.UndefOr[String] = js.native
}
object Event {
  
  @scala.inline
  def apply(): Event = {
    val __obj = js.Dynamic.literal()
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
    def setAttributes(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setClientSdkVersion(value: String): Self = this.set("ClientSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientSdkVersion: Self = this.set("ClientSdkVersion", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = this.set("EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("EventType", js.undefined)
    
    @scala.inline
    def setMetrics(value: StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
    
    @scala.inline
    def setSession(value: Session): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("Session", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
}
