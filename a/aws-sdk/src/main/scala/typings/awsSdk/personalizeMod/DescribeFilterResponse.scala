package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFilterResponse extends js.Object {
  /**
    * The filter's details.
    */
  var filter: js.UndefOr[Filter] = js.native
}

object DescribeFilterResponse {
  @scala.inline
  def apply(filter: Filter = null): DescribeFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFilterResponse]
  }
}

