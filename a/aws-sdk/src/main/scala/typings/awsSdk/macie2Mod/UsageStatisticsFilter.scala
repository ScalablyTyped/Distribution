package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageStatisticsFilter extends js.Object {
  /**
    * The field to use to filter the results. The only supported value is accountId.
    */
  var key: js.UndefOr[UsageStatisticsFilterKey] = js.native
  /**
    * An array that lists the AWS account ID for each account to include in the results.
    */
  var values: js.UndefOr[listOfString] = js.native
}

object UsageStatisticsFilter {
  @scala.inline
  def apply(key: UsageStatisticsFilterKey = null, values: listOfString = null): UsageStatisticsFilter = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageStatisticsFilter]
  }
}

