package typings.braftEditor.mod

import typings.braftEditor.anon.Audio
import typings.braftEditor.anon.Embed
import typings.braftEditor.anon.Error
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType extends js.Object {
  var accepts: js.UndefOr[Audio] = js.undefined
  var externals: js.UndefOr[Embed] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var onChange: js.UndefOr[js.Function] = js.undefined
  var onInsert: js.UndefOr[js.Function] = js.undefined
  var pasteImage: js.UndefOr[Boolean] = js.undefined
  var uploadFn: js.UndefOr[js.Function1[/* params */ Error, Unit]] = js.undefined
  var validateFn: js.UndefOr[js.Function1[/* file */ File, Boolean | js.Thenable[_]]] = js.undefined
}

object MediaType {
  @scala.inline
  def apply(
    accepts: Audio = null,
    externals: Embed = null,
    items: js.Array[_] = null,
    onChange: js.Function = null,
    onInsert: js.Function = null,
    pasteImage: js.UndefOr[Boolean] = js.undefined,
    uploadFn: /* params */ Error => Unit = null,
    validateFn: /* file */ File => Boolean | js.Thenable[_] = null
  ): MediaType = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (externals != null) __obj.updateDynamic("externals")(externals.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onInsert != null) __obj.updateDynamic("onInsert")(onInsert.asInstanceOf[js.Any])
    if (!js.isUndefined(pasteImage)) __obj.updateDynamic("pasteImage")(pasteImage.get.asInstanceOf[js.Any])
    if (uploadFn != null) __obj.updateDynamic("uploadFn")(js.Any.fromFunction1(uploadFn))
    if (validateFn != null) __obj.updateDynamic("validateFn")(js.Any.fromFunction1(validateFn))
    __obj.asInstanceOf[MediaType]
  }
}

