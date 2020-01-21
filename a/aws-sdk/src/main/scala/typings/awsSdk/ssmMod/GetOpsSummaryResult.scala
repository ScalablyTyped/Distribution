package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpsSummaryResult extends js.Object {
  /**
    * The list of aggregated and filtered OpsItems.
    */
  var Entities: js.UndefOr[OpsEntityList] = js.native
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object GetOpsSummaryResult {
  @scala.inline
  def apply(Entities: OpsEntityList = null, NextToken: NextToken = null): GetOpsSummaryResult = {
    val __obj = js.Dynamic.literal()
    if (Entities != null) __obj.updateDynamic("Entities")(Entities.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpsSummaryResult]
  }
}

