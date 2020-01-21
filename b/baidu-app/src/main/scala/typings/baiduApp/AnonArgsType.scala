package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsType extends js.Object {
  var value: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  ] = js.undefined
  def `type`(args: js.Any*): /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
}

object AnonArgsType {
  @scala.inline
  def apply(
    `type`: /* repeated */ js.Any => /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any,
    value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any = null
  ): AnonArgsType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgsType]
  }
}

