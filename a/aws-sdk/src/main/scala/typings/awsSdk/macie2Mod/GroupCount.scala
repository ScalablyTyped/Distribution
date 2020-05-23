package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupCount extends js.Object {
  /**
    * The total number of findings in the group of query results.
    */
  var count: js.UndefOr[long] = js.native
  /**
    * The name of the property that defines the group in the query results, as specified by the groupBy property in the query request.
    */
  var groupKey: js.UndefOr[string] = js.native
}

object GroupCount {
  @scala.inline
  def apply(count: js.UndefOr[long] = js.undefined, groupKey: string = null): GroupCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (groupKey != null) __obj.updateDynamic("groupKey")(groupKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupCount]
  }
}

