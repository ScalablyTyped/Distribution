package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arg extends js.Object {
  def error(arg: js.Any*): java.lang.String
  def log(arg: js.Any*): java.lang.String
}

object Anon_Arg {
  @scala.inline
  def apply(
    error: js.Function1[/* repeated */ js.Any, java.lang.String],
    log: js.Function1[/* repeated */ js.Any, java.lang.String]
  ): Anon_Arg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("log")(log)
    __obj.asInstanceOf[Anon_Arg]
  }
}

