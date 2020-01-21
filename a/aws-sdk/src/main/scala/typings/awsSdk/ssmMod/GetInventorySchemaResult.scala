package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInventorySchemaResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Inventory schemas returned by the request.
    */
  var Schemas: js.UndefOr[InventoryItemSchemaResultList] = js.native
}

object GetInventorySchemaResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Schemas: InventoryItemSchemaResultList = null): GetInventorySchemaResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Schemas != null) __obj.updateDynamic("Schemas")(Schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInventorySchemaResult]
  }
}

