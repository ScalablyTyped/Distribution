package typings.browserDashSync

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fn extends js.Object {
  var fn: js.UndefOr[js.Function2[/* snippet */ String, /* match */ String, _]] = js.undefined
  var `match`: js.UndefOr[RegExp] = js.undefined
}

object Anon_Fn {
  @scala.inline
  def apply(fn: (/* snippet */ String, /* match */ String) => _ = null, `match`: RegExp = null): Anon_Fn = {
    val __obj = js.Dynamic.literal()
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction2(fn))
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[Anon_Fn]
  }
}

