package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBuiltinSlotTypesResponse extends js.Object {
  /**
    * If the response is truncated, the response includes a pagination token that you can use in your next request to fetch the next page of slot types.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An array of BuiltInSlotTypeMetadata objects, one entry for each slot type returned.
    */
  var slotTypes: js.UndefOr[BuiltinSlotTypeMetadataList] = js.native
}

object GetBuiltinSlotTypesResponse {
  @scala.inline
  def apply(): GetBuiltinSlotTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBuiltinSlotTypesResponse]
  }
  @scala.inline
  implicit class GetBuiltinSlotTypesResponseOps[Self <: GetBuiltinSlotTypesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setSlotTypesVarargs(value: BuiltinSlotTypeMetadata*): Self = this.set("slotTypes", js.Array(value :_*))
    @scala.inline
    def setSlotTypes(value: BuiltinSlotTypeMetadataList): Self = this.set("slotTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlotTypes: Self = this.set("slotTypes", js.undefined)
  }
  
}

