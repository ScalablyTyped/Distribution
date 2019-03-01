package typings
package browserDashSyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fn extends js.Object {
  var fn: js.UndefOr[js.Function2[/* snippet */ java.lang.String, /* match */ java.lang.String, _]] = js.undefined
  var `match`: js.UndefOr[stdLib.RegExp] = js.undefined
}

object Anon_Fn {
  @scala.inline
  def apply(
    fn: js.Function2[/* snippet */ java.lang.String, /* match */ java.lang.String, _] = null,
    `match`: stdLib.RegExp = null
  ): Anon_Fn = {
    val __obj = js.Dynamic.literal()
    if (fn != null) __obj.updateDynamic("fn")(fn)
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[Anon_Fn]
  }
}

