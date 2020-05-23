package typings.browserfs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flag extends js.Object {
  var flag: js.UndefOr[String] = js.undefined
}

object Flag {
  @scala.inline
  def apply(flag: String = null): Flag = {
    val __obj = js.Dynamic.literal()
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flag]
  }
}

