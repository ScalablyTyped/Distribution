package typings
package axeDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var id: java.lang.String
  def callback(args: js.Any*): scala.Unit
}

object Anon_Args {
  @scala.inline
  def apply(callback: js.Function1[/* repeated */ js.Any, scala.Unit], id: java.lang.String): Anon_Args = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_Args]
  }
}

