package typings.backboneLayoutmanager.mod

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Collection
import typings.backbone.mod.EventsHash
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backbone.mod.View
import typings.backbone.mod.ViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutOptions[TModel /* <: Model[_, ModelSetOptions] */] extends ViewOptions[TModel] {
  var template: js.UndefOr[String] = js.undefined
  var views: js.UndefOr[StringDictionary[View[TModel]]] = js.undefined
}

object LayoutOptions {
  @scala.inline
  def apply[/* <: typings.backbone.mod.Model[_, typings.backbone.mod.ModelSetOptions] */ TModel](
    attributes: StringDictionary[js.Any] = null,
    className: String = null,
    collection: Collection[_] = null,
    el: js.Any = null,
    events: EventsHash = null,
    id: String = null,
    model: TModel = null,
    tagName: String = null,
    template: String = null,
    views: StringDictionary[View[TModel]] = null
  ): LayoutOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions[TModel]]
  }
}

