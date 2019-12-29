package typings.backboneDotMarionette.backboneDotMarionetteMod

import typings.backboneDotMarionette.backboneDotMarionetteBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewMixinOptions extends js.Object {
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
  def apply(
    behaviors: js.Array[Behavior] = null,
    childViewEventPrefix: String | `false` = null,
    childViewEvents: EventsHash = null,
    childViewTriggers: EventsHash = null,
    collectionEvents: EventsHash = null,
    modelEvents: EventsHash = null,
    triggers: EventsHash = null,
    ui: js.Any = null
  ): ViewMixinOptions = {
    val __obj = js.Dynamic.literal()
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors.asInstanceOf[js.Any])
    if (childViewEventPrefix != null) __obj.updateDynamic("childViewEventPrefix")(childViewEventPrefix.asInstanceOf[js.Any])
    if (childViewEvents != null) __obj.updateDynamic("childViewEvents")(childViewEvents.asInstanceOf[js.Any])
    if (childViewTriggers != null) __obj.updateDynamic("childViewTriggers")(childViewTriggers.asInstanceOf[js.Any])
    if (collectionEvents != null) __obj.updateDynamic("collectionEvents")(collectionEvents.asInstanceOf[js.Any])
    if (modelEvents != null) __obj.updateDynamic("modelEvents")(modelEvents.asInstanceOf[js.Any])
    if (triggers != null) __obj.updateDynamic("triggers")(triggers.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewMixinOptions]
  }
}

