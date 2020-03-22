package typings.braftEditor.mod

import typings.braftEditor.AnonAudio
import typings.braftEditor.AnonEmbed
import typings.braftEditor.AnonError
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType extends js.Object {
  var accepts: js.UndefOr[AnonAudio] = js.undefined
  var externals: js.UndefOr[AnonEmbed] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var onChange: js.UndefOr[js.Function] = js.undefined
  var onInsert: js.UndefOr[js.Function] = js.undefined
  var pasteImage: js.UndefOr[Boolean] = js.undefined
  var uploadFn: js.UndefOr[js.Function1[/* params */ AnonError, Unit]] = js.undefined
  var validateFn: js.UndefOr[js.Function1[/* file */ File, Boolean | js.Thenable[_]]] = js.undefined
}

object MediaType {
  @scala.inline
  def apply(
    accepts: AnonAudio = null,
    externals: AnonEmbed = null,
    items: js.Array[_] = null,
    onChange: js.Function = null,
    onInsert: js.Function = null,
    pasteImage: js.UndefOr[Boolean] = js.undefined,
    uploadFn: /* params */ AnonError => Unit = null,
    validateFn: /* file */ File => Boolean | js.Thenable[_] = null
  ): MediaType = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (externals != null) __obj.updateDynamic("externals")(externals.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onInsert != null) __obj.updateDynamic("onInsert")(onInsert.asInstanceOf[js.Any])
    if (!js.isUndefined(pasteImage)) __obj.updateDynamic("pasteImage")(pasteImage.asInstanceOf[js.Any])
    if (uploadFn != null) __obj.updateDynamic("uploadFn")(js.Any.fromFunction1(uploadFn))
    if (validateFn != null) __obj.updateDynamic("validateFn")(js.Any.fromFunction1(validateFn))
    __obj.asInstanceOf[MediaType]
  }
}

