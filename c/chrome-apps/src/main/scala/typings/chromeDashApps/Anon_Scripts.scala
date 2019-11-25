package typings.chromeDashApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scripts extends js.Object {
  var scripts: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Scripts {
  @scala.inline
  def apply(scripts: js.Array[String] = null): Anon_Scripts = {
    val __obj = js.Dynamic.literal()
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Scripts]
  }
}

