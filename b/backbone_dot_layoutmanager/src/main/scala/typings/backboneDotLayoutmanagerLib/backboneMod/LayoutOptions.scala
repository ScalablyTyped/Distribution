package typings
package backboneDotLayoutmanagerLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutOptions[TModel /* <: backboneLib.backboneMod.Model */]
  extends backboneLib.backboneMod.ViewOptions[TModel] {
  var template: js.UndefOr[java.lang.String] = js.undefined
  var views: js.UndefOr[org.scalablytyped.runtime.StringDictionary[backboneLib.backboneMod.View[TModel]]] = js.undefined
}

object LayoutOptions {
  @scala.inline
  def apply[TModel /* <: backboneLib.backboneMod.Model */](
    attributes: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    collection: backboneLib.backboneMod.Collection[_] = null,
    el: js.Any = null,
    events: backboneLib.backboneMod.EventsHash = null,
    id: java.lang.String = null,
    model: TModel = null,
    tagName: java.lang.String = null,
    template: java.lang.String = null,
    views: org.scalablytyped.runtime.StringDictionary[backboneLib.backboneMod.View[TModel]] = null
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

