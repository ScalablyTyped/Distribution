package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  useInstances  :boolean}> */
trait PartialuseInstancesboolea extends js.Object {
  var useInstances: js.UndefOr[Boolean] = js.undefined
}

object PartialuseInstancesboolea {
  @scala.inline
  def apply(useInstances: js.UndefOr[Boolean] = js.undefined): PartialuseInstancesboolea = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useInstances)) __obj.updateDynamic("useInstances")(useInstances.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialuseInstancesboolea]
  }
}

