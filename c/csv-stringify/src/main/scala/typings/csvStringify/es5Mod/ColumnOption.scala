package typings.csvStringify.es5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnOption extends js.Object {
  var header: js.UndefOr[String] = js.undefined
  var key: String
}

object ColumnOption {
  @scala.inline
  def apply(key: String, header: String = null): ColumnOption = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnOption]
  }
}

