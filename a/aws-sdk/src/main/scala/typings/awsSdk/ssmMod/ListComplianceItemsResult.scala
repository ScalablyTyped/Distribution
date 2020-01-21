package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComplianceItemsResult extends js.Object {
  /**
    * A list of compliance information for the specified resource ID. 
    */
  var ComplianceItems: js.UndefOr[ComplianceItemList] = js.native
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object ListComplianceItemsResult {
  @scala.inline
  def apply(ComplianceItems: ComplianceItemList = null, NextToken: NextToken = null): ListComplianceItemsResult = {
    val __obj = js.Dynamic.literal()
    if (ComplianceItems != null) __obj.updateDynamic("ComplianceItems")(ComplianceItems.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComplianceItemsResult]
  }
}

