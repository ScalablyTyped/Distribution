package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Whitelist extends js.Object {
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}

object Whitelist {
  @scala.inline
  def apply(whitelist: js.Array[String] = null): Whitelist = {
    val __obj = js.Dynamic.literal()
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Whitelist]
  }
}

