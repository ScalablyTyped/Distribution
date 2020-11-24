package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  /**
    * Specifies the date and time of the event.
    */
  var Date: js.UndefOr[TStamp] = js.native
  
  /**
    * Specifies the category for the event.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.native
  
  /**
    * Provides the text of this event.
    */
  var Message: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the event.
    */
  var SourceArn: js.UndefOr[String] = js.native
  
  /**
    * Provides the identifier for the source of the event.
    */
  var SourceIdentifier: js.UndefOr[String] = js.native
  
  /**
    * Specifies the source type for this event.
    */
  var SourceType: js.UndefOr[typings.awsSdk.rdsMod.SourceType] = js.native
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
    def setDate(value: TStamp): Self = this.set("Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("Date", js.undefined)
    
    @scala.inline
    def setEventCategoriesVarargs(value: String*): Self = this.set("EventCategories", js.Array(value :_*))
    
    @scala.inline
    def setEventCategories(value: EventCategoriesList): Self = this.set("EventCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventCategories: Self = this.set("EventCategories", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    
    @scala.inline
    def setSourceArn(value: String): Self = this.set("SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceArn: Self = this.set("SourceArn", js.undefined)
    
    @scala.inline
    def setSourceIdentifier(value: String): Self = this.set("SourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceIdentifier: Self = this.set("SourceIdentifier", js.undefined)
    
    @scala.inline
    def setSourceType(value: SourceType): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("SourceType", js.undefined)
  }
}
