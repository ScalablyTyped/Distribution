package typings.cacache.enMod.tmp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var tmpPrefix: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(tmpPrefix: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (tmpPrefix != null) __obj.updateDynamic("tmpPrefix")(tmpPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

