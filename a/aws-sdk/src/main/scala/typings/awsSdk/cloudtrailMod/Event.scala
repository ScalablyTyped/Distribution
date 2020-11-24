package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  /**
    * The AWS access key ID that was used to sign the request. If the request was made with temporary security credentials, this is the access key ID of the temporary credentials.
    */
  var AccessKeyId: js.UndefOr[String] = js.native
  
  /**
    * A JSON string that contains a representation of the event returned.
    */
  var CloudTrailEvent: js.UndefOr[String] = js.native
  
  /**
    * The CloudTrail ID of the event returned.
    */
  var EventId: js.UndefOr[String] = js.native
  
  /**
    * The name of the event returned.
    */
  var EventName: js.UndefOr[String] = js.native
  
  /**
    * The AWS service that the request was made to.
    */
  var EventSource: js.UndefOr[String] = js.native
  
  /**
    * The date and time of the event returned.
    */
  var EventTime: js.UndefOr[Date] = js.native
  
  /**
    * Information about whether the event is a write event or a read event. 
    */
  var ReadOnly: js.UndefOr[String] = js.native
  
  /**
    * A list of resources referenced by the event returned.
    */
  var Resources: js.UndefOr[ResourceList] = js.native
  
  /**
    * A user name or role name of the requester that called the API in the event returned.
    */
  var Username: js.UndefOr[String] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessKeyId(value: String): Self = this.set("AccessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKeyId: Self = this.set("AccessKeyId", js.undefined)
    
    @scala.inline
    def setCloudTrailEvent(value: String): Self = this.set("CloudTrailEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudTrailEvent: Self = this.set("CloudTrailEvent", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = this.set("EventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventId: Self = this.set("EventId", js.undefined)
    
    @scala.inline
    def setEventName(value: String): Self = this.set("EventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventName: Self = this.set("EventName", js.undefined)
    
    @scala.inline
    def setEventSource(value: String): Self = this.set("EventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSource: Self = this.set("EventSource", js.undefined)
    
    @scala.inline
    def setEventTime(value: Date): Self = this.set("EventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTime: Self = this.set("EventTime", js.undefined)
    
    @scala.inline
    def setReadOnly(value: String): Self = this.set("ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("ReadOnly", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = this.set("Resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: ResourceList): Self = this.set("Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("Resources", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
}
