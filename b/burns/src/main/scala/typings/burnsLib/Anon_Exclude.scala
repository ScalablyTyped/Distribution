package typings
package burnsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exclude extends js.Object {
  var exclude: js.UndefOr[js.Any] = js.undefined
}

object Anon_Exclude {
  @scala.inline
  def apply(exclude: js.Any = null): Anon_Exclude = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    __obj.asInstanceOf[Anon_Exclude]
  }
}

