package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /**
    * The name of the filter.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * A list of values.
    */
  var values: js.UndefOr[FilterValues] = js.native
}

object Filter {
  @scala.inline
  def apply(name: Name = null, values: FilterValues = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

