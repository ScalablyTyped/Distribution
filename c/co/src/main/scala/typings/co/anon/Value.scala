package typings.co.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
}

object Value {
  @scala.inline
  def apply(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

