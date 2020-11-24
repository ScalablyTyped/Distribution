package typings.awsSdk.personalizeeventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  /**
    * An ID associated with the event. If an event ID is not provided, Amazon Personalize generates a unique ID for the event. An event ID is not used as an input to the model. Amazon Personalize uses the event ID to distinquish unique events. Any subsequent events after the first with the same event ID are not used in model training.
    */
  var eventId: js.UndefOr[StringType] = js.native
  
  /**
    * The type of event, such as click or download. This property corresponds to the EVENT_TYPE field of your Interactions schema and depends on the types of events you are tracking.
    */
  var eventType: StringType = js.native
  
  /**
    * The event value that corresponds to the EVENT_VALUE field of the Interactions schema.
    */
  var eventValue: js.UndefOr[FloatType] = js.native
  
  /**
    * A list of item IDs that represents the sequence of items you have shown the user. For example, ["itemId1", "itemId2", "itemId3"].
    */
  var impression: js.UndefOr[Impression] = js.native
  
  /**
    * The item ID key that corresponds to the ITEM_ID field of the Interactions schema.
    */
  var itemId: js.UndefOr[ItemId] = js.native
  
  /**
    * A string map of event-specific data that you might choose to record. For example, if a user rates a movie on your site, other than movie ID (itemId) and rating (eventValue) , you might also send the number of movie ratings made by the user. Each item in the map consists of a key-value pair. For example,  {"numberOfRatings": "12"}  The keys use camel case names that match the fields in the Interactions schema. In the above example, the numberOfRatings would match the 'NUMBER_OF_RATINGS' field defined in the Interactions schema.
    */
  var properties: js.UndefOr[EventPropertiesJSON] = js.native
  
  /**
    * The ID of the recommendation.
    */
  var recommendationId: js.UndefOr[RecommendationId] = js.native
  
  /**
    * The timestamp (in Unix time) on the client side when the event occurred.
    */
  var sentAt: Date = js.native
}
object Event {
  
  @scala.inline
  def apply(eventType: StringType, sentAt: Date): Event = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], sentAt = sentAt.asInstanceOf[js.Any])
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
    def setEventType(value: StringType): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentAt(value: Date): Self = this.set("sentAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventId(value: StringType): Self = this.set("eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventId: Self = this.set("eventId", js.undefined)
    
    @scala.inline
    def setEventValue(value: FloatType): Self = this.set("eventValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventValue: Self = this.set("eventValue", js.undefined)
    
    @scala.inline
    def setImpressionVarargs(value: ItemId*): Self = this.set("impression", js.Array(value :_*))
    
    @scala.inline
    def setImpression(value: Impression): Self = this.set("impression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpression: Self = this.set("impression", js.undefined)
    
    @scala.inline
    def setItemId(value: ItemId): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    
    @scala.inline
    def setProperties(value: EventPropertiesJSON): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setRecommendationId(value: RecommendationId): Self = this.set("recommendationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationId: Self = this.set("recommendationId", js.undefined)
  }
}
