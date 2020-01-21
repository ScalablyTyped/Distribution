package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInventoryDeletionsResult extends js.Object {
  /**
    * A list of status items for deleted inventory.
    */
  var InventoryDeletions: js.UndefOr[InventoryDeletionsList] = js.native
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeInventoryDeletionsResult {
  @scala.inline
  def apply(InventoryDeletions: InventoryDeletionsList = null, NextToken: NextToken = null): DescribeInventoryDeletionsResult = {
    val __obj = js.Dynamic.literal()
    if (InventoryDeletions != null) __obj.updateDynamic("InventoryDeletions")(InventoryDeletions.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInventoryDeletionsResult]
  }
}

