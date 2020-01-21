package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAggregateIdFormatResult extends js.Object {
  /**
    * Information about each resource's ID format.
    */
  var Statuses: js.UndefOr[IdFormatList] = js.native
  /**
    * Indicates whether all resource types in the Region are configured to use longer IDs. This value is only true if all users are configured to use longer IDs for all resources types in the Region.
    */
  var UseLongIdsAggregated: js.UndefOr[Boolean] = js.native
}

object DescribeAggregateIdFormatResult {
  @scala.inline
  def apply(Statuses: IdFormatList = null, UseLongIdsAggregated: js.UndefOr[scala.Boolean] = js.undefined): DescribeAggregateIdFormatResult = {
    val __obj = js.Dynamic.literal()
    if (Statuses != null) __obj.updateDynamic("Statuses")(Statuses.asInstanceOf[js.Any])
    if (!js.isUndefined(UseLongIdsAggregated)) __obj.updateDynamic("UseLongIdsAggregated")(UseLongIdsAggregated.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAggregateIdFormatResult]
  }
}

