package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewOptions[TModel /* <: backboneLib.backboneMod.Model */]
  extends backboneLib.backboneMod.ViewOptions[TModel]
     with ViewMixinOptions {
  /**
    * The events attribute binds DOM events to actions to perform on the
    * view. It takes DOM event key and a mapping to the handler.
    */
  @JSName("events")
  var events_ViewOptions: js.UndefOr[EventsHash] = js.undefined
  /**
    * If you've created a custom region class, you can use it to define
    * your region.
    */
  var regionClass: js.UndefOr[js.Any] = js.undefined
  /**
    * Add regions to this View.
    */
  var regions: js.UndefOr[js.Any] = js.undefined
  /**
    * Set the template of this View.
    */
  var template: js.UndefOr[js.Any] = js.undefined
  /**
    * The templateContext attribute can be used to add extra information to
    * your templates
    */
  var templateContext: js.UndefOr[js.Any] = js.undefined
}

object ViewOptions {
  @scala.inline
  def apply[TModel /* <: backboneLib.backboneMod.Model */](
    attributes: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    behaviors: js.Array[Behavior] = null,
    childViewEventPrefix: java.lang.String | backboneDotMarionetteLib.backboneDotMarionetteLibNumbers.`false` = null,
    childViewEvents: EventsHash = null,
    childViewTriggers: EventsHash = null,
    className: java.lang.String = null,
    collection: backboneLib.backboneMod.Collection[_] = null,
    collectionEvents: EventsHash = null,
    el: js.Any = null,
    events: EventsHash = null,
    id: java.lang.String = null,
    model: TModel = null,
    modelEvents: EventsHash = null,
    regionClass: js.Any = null,
    regions: js.Any = null,
    tagName: java.lang.String = null,
    template: js.Any = null,
    templateContext: js.Any = null,
    triggers: EventsHash = null,
    ui: js.Any = null
  ): ViewOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors)
    if (childViewEventPrefix != null) __obj.updateDynamic("childViewEventPrefix")(childViewEventPrefix.asInstanceOf[js.Any])
    if (childViewEvents != null) __obj.updateDynamic("childViewEvents")(childViewEvents)
    if (childViewTriggers != null) __obj.updateDynamic("childViewTriggers")(childViewTriggers)
    if (className != null) __obj.updateDynamic("className")(className)
    if (collection != null) __obj.updateDynamic("collection")(collection)
    if (collectionEvents != null) __obj.updateDynamic("collectionEvents")(collectionEvents)
    if (el != null) __obj.updateDynamic("el")(el)
    if (events != null) __obj.updateDynamic("events")(events)
    if (id != null) __obj.updateDynamic("id")(id)
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (modelEvents != null) __obj.updateDynamic("modelEvents")(modelEvents)
    if (regionClass != null) __obj.updateDynamic("regionClass")(regionClass)
    if (regions != null) __obj.updateDynamic("regions")(regions)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateContext != null) __obj.updateDynamic("templateContext")(templateContext)
    if (triggers != null) __obj.updateDynamic("triggers")(triggers)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[ViewOptions[TModel]]
  }
}

