package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var value: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  ] = js.undefined
  def `type`(args: js.Any*): /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
}

object Type {
  @scala.inline
  def apply(
    `type`: /* repeated */ js.Any => /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any,
    value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any = null
  ): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

