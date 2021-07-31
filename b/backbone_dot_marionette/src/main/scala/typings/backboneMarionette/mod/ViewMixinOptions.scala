package typings.backboneMarionette.mod

import typings.backboneMarionette.backboneMarionetteBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewMixinOptions extends StObject {
  
  /**
    * Behavior objects to assign to this View.
    */
  var behaviors: js.UndefOr[js.Array[Behavior]] = js.undefined
  
  /**
    * Customize the event prefix for events that are forwarded through the
    * collection view.
    */
  var childViewEventPrefix: js.UndefOr[String | `false`] = js.undefined
  
  /**
    * Use the childViewEvents attribute to map child events to methods on the
    * parent view.
    */
  var childViewEvents: js.UndefOr[EventsHash] = js.undefined
  
  /**
    * A childViewTriggers hash or method permits proxying of child view events
    * without manually setting bindings. The values of the hash should be a
    * string of the event to trigger on the parent.
    */
  var childViewTriggers: js.UndefOr[EventsHash] = js.undefined
  
  /**
    * Bind to events that occur on attached collections.
    */
  var collectionEvents: js.UndefOr[EventsHash] = js.undefined
  
  /**
    * Bind to events that occur on attached models.
    */
  var modelEvents: js.UndefOr[EventsHash] = js.undefined
  
  /**
    * The view triggers attribute binds DOM events to Marionette View events
    * that can be responded to at the view or parent level.
    */
  var triggers: js.UndefOr[EventsHash] = js.undefined
  
  /**
    * Name parts of your template to be used
    * throughout the view with the ui attribute.
    */
  var ui: js.UndefOr[js.Any] = js.undefined
}
object ViewMixinOptions {
  
  @scala.inline
  def apply(): ViewMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewMixinOptions]
  }
  
  @scala.inline
  implicit class ViewMixinOptionsMutableBuilder[Self <: ViewMixinOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehaviors(value: js.Array[Behavior]): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviorsUndefined: Self = StObject.set(x, "behaviors", js.undefined)
    
    @scala.inline
    def setBehaviorsVarargs(value: Behavior*): Self = StObject.set(x, "behaviors", js.Array(value :_*))
    
    @scala.inline
    def setChildViewEventPrefix(value: String | `false`): Self = StObject.set(x, "childViewEventPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildViewEventPrefixUndefined: Self = StObject.set(x, "childViewEventPrefix", js.undefined)
    
    @scala.inline
    def setChildViewEvents(value: EventsHash): Self = StObject.set(x, "childViewEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildViewEventsUndefined: Self = StObject.set(x, "childViewEvents", js.undefined)
    
    @scala.inline
    def setChildViewTriggers(value: EventsHash): Self = StObject.set(x, "childViewTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildViewTriggersUndefined: Self = StObject.set(x, "childViewTriggers", js.undefined)
    
    @scala.inline
    def setCollectionEvents(value: EventsHash): Self = StObject.set(x, "collectionEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionEventsUndefined: Self = StObject.set(x, "collectionEvents", js.undefined)
    
    @scala.inline
    def setModelEvents(value: EventsHash): Self = StObject.set(x, "modelEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelEventsUndefined: Self = StObject.set(x, "modelEvents", js.undefined)
    
    @scala.inline
    def setTriggers(value: EventsHash): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    
    @scala.inline
    def setUi(value: js.Any): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
  }
}
