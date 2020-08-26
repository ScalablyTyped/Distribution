package typings.backboneMarionette.mod

import typings.backboneMarionette.backboneMarionetteBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewMixinOptions extends js.Object {
  /**
    * Behavior objects to assign to this View.
    */
  var behaviors: js.UndefOr[js.Array[Behavior]] = js.native
  /**
    * Customize the event prefix for events that are forwarded through the
    * collection view.
    */
  var childViewEventPrefix: js.UndefOr[String | `false`] = js.native
  /**
    * Use the childViewEvents attribute to map child events to methods on the
    * parent view.
    */
  var childViewEvents: js.UndefOr[EventsHash] = js.native
  /**
    * A childViewTriggers hash or method permits proxying of child view events
    * without manually setting bindings. The values of the hash should be a
    * string of the event to trigger on the parent.
    */
  var childViewTriggers: js.UndefOr[EventsHash] = js.native
  /**
    * Bind to events that occur on attached collections.
    */
  var collectionEvents: js.UndefOr[EventsHash] = js.native
  /**
    * Bind to events that occur on attached models.
    */
  var modelEvents: js.UndefOr[EventsHash] = js.native
  /**
    * The view triggers attribute binds DOM events to Marionette View events
    * that can be responded to at the view or parent level.
    */
  var triggers: js.UndefOr[EventsHash] = js.native
  /**
    * Name parts of your template to be used
    * throughout the view with the ui attribute.
    */
  var ui: js.UndefOr[js.Any] = js.native
}

object ViewMixinOptions {
  @scala.inline
  def apply(): ViewMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewMixinOptions]
  }
  @scala.inline
  implicit class ViewMixinOptionsOps[Self <: ViewMixinOptions] (val x: Self) extends AnyVal {
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
    def setBehaviorsVarargs(value: Behavior*): Self = this.set("behaviors", js.Array(value :_*))
    @scala.inline
    def setBehaviors(value: js.Array[Behavior]): Self = this.set("behaviors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehaviors: Self = this.set("behaviors", js.undefined)
    @scala.inline
    def setChildViewEventPrefix(value: String | `false`): Self = this.set("childViewEventPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildViewEventPrefix: Self = this.set("childViewEventPrefix", js.undefined)
    @scala.inline
    def setChildViewEvents(value: EventsHash): Self = this.set("childViewEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildViewEvents: Self = this.set("childViewEvents", js.undefined)
    @scala.inline
    def setChildViewTriggers(value: EventsHash): Self = this.set("childViewTriggers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildViewTriggers: Self = this.set("childViewTriggers", js.undefined)
    @scala.inline
    def setCollectionEvents(value: EventsHash): Self = this.set("collectionEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionEvents: Self = this.set("collectionEvents", js.undefined)
    @scala.inline
    def setModelEvents(value: EventsHash): Self = this.set("modelEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelEvents: Self = this.set("modelEvents", js.undefined)
    @scala.inline
    def setTriggers(value: EventsHash): Self = this.set("triggers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggers: Self = this.set("triggers", js.undefined)
    @scala.inline
    def setUi(value: js.Any): Self = this.set("ui", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUi: Self = this.set("ui", js.undefined)
  }
  
}

