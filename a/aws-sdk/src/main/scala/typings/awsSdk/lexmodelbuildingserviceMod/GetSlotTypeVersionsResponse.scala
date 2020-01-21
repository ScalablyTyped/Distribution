package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSlotTypeVersionsResponse extends js.Object {
  /**
    * A pagination token for fetching the next page of slot type versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An array of SlotTypeMetadata objects, one for each numbered version of the slot type plus one for the $LATEST version.
    */
  var slotTypes: js.UndefOr[SlotTypeMetadataList] = js.native
}

object GetSlotTypeVersionsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, slotTypes: SlotTypeMetadataList = null): GetSlotTypeVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (slotTypes != null) __obj.updateDynamic("slotTypes")(slotTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSlotTypeVersionsResponse]
  }
}

