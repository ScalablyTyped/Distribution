package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportTaskFilter extends js.Object {
  /**
    * The name, status, or import task ID for a specific import task.
    */
  var name: js.UndefOr[ImportTaskFilterName] = js.native
  /**
    * An array of strings that you can provide to match against a specific name, status, or import task ID to filter the results for your import task queries.
    */
  var values: js.UndefOr[ImportTaskFilterValueList] = js.native
}

object ImportTaskFilter {
  @scala.inline
  def apply(name: ImportTaskFilterName = null, values: ImportTaskFilterValueList = null): ImportTaskFilter = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportTaskFilter]
  }
}

