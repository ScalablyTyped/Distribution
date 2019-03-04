package typings
package cassandraDashDriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: scala.Double
  var info: js.UndefOr[js.Any] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(code: scala.Double, info: js.Any = null): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code)
    if (info != null) __obj.updateDynamic("info")(info)
    __obj.asInstanceOf[Anon_Code]
  }
}

