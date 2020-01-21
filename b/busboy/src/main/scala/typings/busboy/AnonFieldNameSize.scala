package typings.busboy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFieldNameSize extends js.Object {
  var fieldNameSize: js.UndefOr[Double] = js.undefined
  var fieldSize: js.UndefOr[Double] = js.undefined
  var fields: js.UndefOr[Double] = js.undefined
  var fileSize: js.UndefOr[Double] = js.undefined
  var files: js.UndefOr[Double] = js.undefined
  var headerPairs: js.UndefOr[Double] = js.undefined
  var parts: js.UndefOr[Double] = js.undefined
}

object AnonFieldNameSize {
  @scala.inline
  def apply(
    fieldNameSize: Int | Double = null,
    fieldSize: Int | Double = null,
    fields: Int | Double = null,
    fileSize: Int | Double = null,
    files: Int | Double = null,
    headerPairs: Int | Double = null,
    parts: Int | Double = null
  ): AnonFieldNameSize = {
    val __obj = js.Dynamic.literal()
    if (fieldNameSize != null) __obj.updateDynamic("fieldNameSize")(fieldNameSize.asInstanceOf[js.Any])
    if (fieldSize != null) __obj.updateDynamic("fieldSize")(fieldSize.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (headerPairs != null) __obj.updateDynamic("headerPairs")(headerPairs.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFieldNameSize]
  }
}

