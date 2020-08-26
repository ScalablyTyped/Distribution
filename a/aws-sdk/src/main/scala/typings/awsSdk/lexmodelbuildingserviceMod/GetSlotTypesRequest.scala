package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSlotTypesRequest extends js.Object {
  /**
    * The maximum number of slot types to return in the response. The default is 10.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * Substring to match in slot type names. A slot type will be returned if any part of its name matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
    */
  var nameContains: js.UndefOr[SlotTypeName] = js.native
  /**
    * A pagination token that fetches the next page of slot types. If the response to this API call is truncated, Amazon Lex returns a pagination token in the response. To fetch next page of slot types, specify the pagination token in the next request.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetSlotTypesRequest {
  @scala.inline
  def apply(): GetSlotTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSlotTypesRequest]
  }
  @scala.inline
  implicit class GetSlotTypesRequestOps[Self <: GetSlotTypesRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNameContains(value: SlotTypeName): Self = this.set("nameContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameContains: Self = this.set("nameContains", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

