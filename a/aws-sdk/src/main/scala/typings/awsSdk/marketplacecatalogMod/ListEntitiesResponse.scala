package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEntitiesResponse extends js.Object {
  /**
    *  Array of EntitySummary object.
    */
  var EntitySummaryList: js.UndefOr[typings.awsSdk.marketplacecatalogMod.EntitySummaryList] = js.native
  /**
    * The value of the next token if it exists. Null if there is no more result.
    */
  var NextToken: js.UndefOr[typings.awsSdk.marketplacecatalogMod.NextToken] = js.native
}

object ListEntitiesResponse {
  @scala.inline
  def apply(EntitySummaryList: EntitySummaryList = null, NextToken: NextToken = null): ListEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (EntitySummaryList != null) __obj.updateDynamic("EntitySummaryList")(EntitySummaryList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntitiesResponse]
  }
}

