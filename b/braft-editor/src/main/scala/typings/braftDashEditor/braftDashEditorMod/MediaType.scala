package typings.braftDashEditor.braftDashEditorMod

import typings.braftDashEditor.Anon_Audio
import typings.braftDashEditor.Anon_AudioEmbed
import typings.braftDashEditor.Anon_Err
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType extends js.Object {
  var accepts: js.UndefOr[Anon_Audio] = js.undefined
  var externals: js.UndefOr[Anon_AudioEmbed] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var onChange: js.UndefOr[js.Function] = js.undefined
  var onInsert: js.UndefOr[js.Function] = js.undefined
  var pasteImage: js.UndefOr[Boolean] = js.undefined
  var uploadFn: js.UndefOr[js.Function1[/* params */ Anon_Err, Unit]] = js.undefined
  var validateFn: js.UndefOr[js.Function1[/* file */ File, Boolean | js.Thenable[_]]] = js.undefined
}

object MediaType {
  @scala.inline
  def apply(
    accepts: Anon_Audio = null,
    externals: Anon_AudioEmbed = null,
    items: js.Array[_] = null,
    onChange: js.Function = null,
    onInsert: js.Function = null,
    pasteImage: js.UndefOr[Boolean] = js.undefined,
    uploadFn: /* params */ Anon_Err => Unit = null,
    validateFn: /* file */ File => Boolean | js.Thenable[_] = null
  ): MediaType = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (externals != null) __obj.updateDynamic("externals")(externals)
    if (items != null) __obj.updateDynamic("items")(items)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onInsert != null) __obj.updateDynamic("onInsert")(onInsert)
    if (!js.isUndefined(pasteImage)) __obj.updateDynamic("pasteImage")(pasteImage)
    if (uploadFn != null) __obj.updateDynamic("uploadFn")(js.Any.fromFunction1(uploadFn))
    if (validateFn != null) __obj.updateDynamic("validateFn")(js.Any.fromFunction1(validateFn))
    __obj.asInstanceOf[MediaType]
  }
}

