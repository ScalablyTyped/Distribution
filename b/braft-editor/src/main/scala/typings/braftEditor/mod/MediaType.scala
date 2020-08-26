package typings.braftEditor.mod

import typings.braftEditor.anon.Audio
import typings.braftEditor.anon.Embed
import typings.braftEditor.anon.Error
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaType extends js.Object {
  var accepts: js.UndefOr[Audio] = js.native
  var externals: js.UndefOr[Embed] = js.native
  var items: js.UndefOr[js.Array[_]] = js.native
  var onChange: js.UndefOr[js.Function] = js.native
  var onInsert: js.UndefOr[js.Function] = js.native
  var pasteImage: js.UndefOr[Boolean] = js.native
  var uploadFn: js.UndefOr[js.Function1[/* params */ Error, Unit]] = js.native
  var validateFn: js.UndefOr[js.Function1[/* file */ File, Boolean | js.Thenable[_]]] = js.native
}

object MediaType {
  @scala.inline
  def apply(): MediaType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaType]
  }
  @scala.inline
  implicit class MediaTypeOps[Self <: MediaType] (val x: Self) extends AnyVal {
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
    def setAccepts(value: Audio): Self = this.set("accepts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccepts: Self = this.set("accepts", js.undefined)
    @scala.inline
    def setExternals(value: Embed): Self = this.set("externals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternals: Self = this.set("externals", js.undefined)
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setOnChange(value: js.Function): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnInsert(value: js.Function): Self = this.set("onInsert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnInsert: Self = this.set("onInsert", js.undefined)
    @scala.inline
    def setPasteImage(value: Boolean): Self = this.set("pasteImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasteImage: Self = this.set("pasteImage", js.undefined)
    @scala.inline
    def setUploadFn(value: /* params */ Error => Unit): Self = this.set("uploadFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUploadFn: Self = this.set("uploadFn", js.undefined)
    @scala.inline
    def setValidateFn(value: /* file */ File => Boolean | js.Thenable[_]): Self = this.set("validateFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidateFn: Self = this.set("validateFn", js.undefined)
  }
  
}

