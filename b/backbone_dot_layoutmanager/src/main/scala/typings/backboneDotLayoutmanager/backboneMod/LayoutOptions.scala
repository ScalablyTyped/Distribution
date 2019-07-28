package typings.backboneDotLayoutmanager.backboneMod

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.backboneMod.Collection
import typings.backbone.backboneMod.EventsHash
import typings.backbone.backboneMod.Model
import typings.backbone.backboneMod.View
import typings.backbone.backboneMod.ViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutOptions[TModel /* <: Model */] extends ViewOptions[TModel] {
  var template: js.UndefOr[String] = js.undefined
  var views: js.UndefOr[StringDictionary[View[TModel]]] = js.undefined
}

object LayoutOptions {
  @scala.inline
  def apply[TModel /* <: Model */](
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
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (collection != null) __obj.updateDynamic("collection")(collection)
    if (el != null) __obj.updateDynamic("el")(el)
    if (events != null) __obj.updateDynamic("events")(events)
    if (id != null) __obj.updateDynamic("id")(id)
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (template != null) __obj.updateDynamic("template")(template)
    if (views != null) __obj.updateDynamic("views")(views)
    __obj.asInstanceOf[LayoutOptions[TModel]]
  }
}

