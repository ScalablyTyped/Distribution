package typings.backbone.backboneMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewOptions[TModel /* <: Model */] extends js.Object {
  var attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  // TODO: quickfix, this can't be fixed easy. The collection does not need to have the same model as the parent view.
  var collection: js.UndefOr[Collection[_]] = js.undefined
   //was: Collection<TModel>;
  var el: js.UndefOr[js.Any] = js.undefined
  var events: js.UndefOr[EventsHash] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var model: js.UndefOr[TModel] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
}

object ViewOptions {
  @scala.inline
  def apply[TModel /* <: Model */](
    attributes: StringDictionary[js.Any] = null,
    className: String = null,
    collection: Collection[_] = null,
    el: js.Any = null,
    events: EventsHash = null,
    id: String = null,
    model: TModel = null,
    tagName: String = null
  ): ViewOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (collection != null) __obj.updateDynamic("collection")(collection)
    if (el != null) __obj.updateDynamic("el")(el)
    if (events != null) __obj.updateDynamic("events")(events)
    if (id != null) __obj.updateDynamic("id")(id)
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[ViewOptions[TModel]]
  }
}

