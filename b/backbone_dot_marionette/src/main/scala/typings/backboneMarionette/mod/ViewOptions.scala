package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backboneMarionette.backboneMarionetteBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewOptions[TModel /* <: Model[_, ModelSetOptions] */]
  extends typings.backbone.mod.ViewOptions[TModel]
     with ViewMixinOptions {
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
  def apply[TModel](
    attributes: StringDictionary[js.Any] = null,
    behaviors: js.Array[Behavior] = null,
    childViewEventPrefix: String | `false` = null,
    childViewEvents: EventsHash = null,
    childViewTriggers: EventsHash = null,
    className: String = null,
    collection: Collection[_] = null,
    collectionEvents: EventsHash = null,
    el: js.Any = null,
    events: typings.backbone.mod.EventsHash = null,
    id: String = null,
    model: TModel = null,
    modelEvents: EventsHash = null,
    regionClass: js.Any = null,
    regions: js.Any = null,
    tagName: String = null,
    template: js.Any = null,
    templateContext: js.Any = null,
    triggers: EventsHash = null,
    ui: js.Any = null
  ): ViewOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors.asInstanceOf[js.Any])
    if (childViewEventPrefix != null) __obj.updateDynamic("childViewEventPrefix")(childViewEventPrefix.asInstanceOf[js.Any])
    if (childViewEvents != null) __obj.updateDynamic("childViewEvents")(childViewEvents.asInstanceOf[js.Any])
    if (childViewTriggers != null) __obj.updateDynamic("childViewTriggers")(childViewTriggers.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (collectionEvents != null) __obj.updateDynamic("collectionEvents")(collectionEvents.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (modelEvents != null) __obj.updateDynamic("modelEvents")(modelEvents.asInstanceOf[js.Any])
    if (regionClass != null) __obj.updateDynamic("regionClass")(regionClass.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateContext != null) __obj.updateDynamic("templateContext")(templateContext.asInstanceOf[js.Any])
    if (triggers != null) __obj.updateDynamic("triggers")(triggers.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewOptions[TModel]]
  }
}

