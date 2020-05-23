package typings.co.anon

import typings.co.coBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Done extends js.Object {
  var done: `true`
  var value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
}

object Done {
  @scala.inline
  def apply(
    done: `true`,
    value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  ): Done = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done]
  }
}

