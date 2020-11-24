package typings.awsSdk.mobileanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  /**
    * A collection of key-value pairs that give additional context to the event. The key-value pairs are specified by the developer. This collection can be empty or the attribute object can be omitted.
    */
  var attributes: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * A name signifying an event that occurred in your app. This is used for grouping and aggregating like events together for reporting purposes.
    */
  var eventType: String50Chars = js.native
  
  /**
    * A collection of key-value pairs that gives additional, measurable context to the event. The key-value pairs are specified by the developer. This collection can be empty or the attribute object can be omitted.
    */
  var metrics: js.UndefOr[MapOfStringToNumber] = js.native
  
  /**
    * The session the event occured within. 
    */
  var session: js.UndefOr[Session] = js.native
  
  /**
    * The time the event occurred in ISO 8601 standard date time format. For example, 2014-06-30T19:07:47.885Z
    */
  var timestamp: ISO8601Timestamp = js.native
  
  /**
    * The version of the event.
    */
  var version: js.UndefOr[String10Chars] = js.native
}
object Event {
  
  @scala.inline
  def apply(eventType: String50Chars, timestamp: ISO8601Timestamp): Event = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    
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
    def setEventType(value: String50Chars): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: ISO8601Timestamp): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: MapOfStringToString): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setMetrics(value: MapOfStringToNumber): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setSession(value: Session): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setVersion(value: String10Chars): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
