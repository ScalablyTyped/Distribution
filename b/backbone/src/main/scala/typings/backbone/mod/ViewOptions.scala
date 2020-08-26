package typings.backbone.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewOptions[TModel /* <: Model[_, ModelSetOptions] */] extends js.Object {
  var attributes: js.UndefOr[StringDictionary[js.Any]] = js.native
  var className: js.UndefOr[String] = js.native
  // TODO: quickfix, this can't be fixed easy. The collection does not need to have the same model as the parent view.
  var collection: js.UndefOr[Collection[_]] = js.native
   //was: Collection<TModel>;
  var el: js.UndefOr[js.Any] = js.native
  var events: js.UndefOr[EventsHash] = js.native
  var id: js.UndefOr[String] = js.native
  var model: js.UndefOr[TModel] = js.native
  var tagName: js.UndefOr[String] = js.native
}

object ViewOptions {
  @scala.inline
  def apply[/* <: typings.backbone.mod.Model[_, typings.backbone.mod.ModelSetOptions] */ TModel](): ViewOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions[TModel]]
  }
  @scala.inline
  implicit class ViewOptionsOps[Self <: ViewOptions[_], /* <: typings.backbone.mod.Model[_, typings.backbone.mod.ModelSetOptions] */ TModel] (val x: Self with ViewOptions[TModel]) extends AnyVal {
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
    def setAttributes(value: StringDictionary[js.Any]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCollection(value: Collection[_]): Self = this.set("collection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollection: Self = this.set("collection", js.undefined)
    @scala.inline
    def setEl(value: js.Any): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    @scala.inline
    def setEvents(value: EventsHash): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setModel(value: TModel): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
  }
  
}

