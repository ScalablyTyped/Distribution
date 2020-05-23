package typings.codemirror

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MimeType extends js.Object {
  var alias: js.UndefOr[js.Array[String]] = js.undefined
  var ext: js.UndefOr[js.Array[String]] = js.undefined
  var file: js.UndefOr[RegExp] = js.undefined
  var mime: js.UndefOr[String] = js.undefined
  var mimes: js.UndefOr[String] = js.undefined
  var mode: String
  var name: String
}

object MimeType {
  @scala.inline
  def apply(
    mode: String,
    name: String,
    alias: js.Array[String] = null,
    ext: js.Array[String] = null,
    file: RegExp = null,
    mime: String = null,
    mimes: String = null
  ): MimeType = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (mimes != null) __obj.updateDynamic("mimes")(mimes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimeType]
  }
}

