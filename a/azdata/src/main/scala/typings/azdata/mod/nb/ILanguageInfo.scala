package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageInfo extends js.Object {
  var codemirror_mode: js.UndefOr[String | ICodeMirrorMode] = js.undefined
  var mimetype: js.UndefOr[String] = js.undefined
  var name: String
  var version: js.UndefOr[String] = js.undefined
}

object ILanguageInfo {
  @scala.inline
  def apply(
    name: String,
    codemirror_mode: String | ICodeMirrorMode = null,
    mimetype: String = null,
    version: String = null
  ): ILanguageInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (codemirror_mode != null) __obj.updateDynamic("codemirror_mode")(codemirror_mode.asInstanceOf[js.Any])
    if (mimetype != null) __obj.updateDynamic("mimetype")(mimetype.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageInfo]
  }
}

