package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /**
    *  The name of the filter. Filter names are case-sensitive. 
    */
  var name: js.UndefOr[FilterName] = js.native
  /**
    *  The filter values. Filter values are case-sensitive. 
    */
  var values: js.UndefOr[FilterValues] = js.native
}

object Filter {
  @scala.inline
  def apply(name: FilterName = null, values: FilterValues = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

