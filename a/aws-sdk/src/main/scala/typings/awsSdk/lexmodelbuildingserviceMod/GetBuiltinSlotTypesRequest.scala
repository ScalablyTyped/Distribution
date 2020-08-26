package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBuiltinSlotTypesRequest extends js.Object {
  /**
    * A list of locales that the slot type supports.
    */
  var locale: js.UndefOr[Locale] = js.native
  /**
    * The maximum number of slot types to return in the response. The default is 10.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * A pagination token that fetches the next page of slot types. If the response to this API call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of slot types, specify the pagination token in the next request.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Substring to match in built-in slot type signatures. A slot type will be returned if any part of its signature matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
    */
  var signatureContains: js.UndefOr[String] = js.native
}

object GetBuiltinSlotTypesRequest {
  @scala.inline
  def apply(): GetBuiltinSlotTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBuiltinSlotTypesRequest]
  }
  @scala.inline
  implicit class GetBuiltinSlotTypesRequestOps[Self <: GetBuiltinSlotTypesRequest] (val x: Self) extends AnyVal {
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
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setSignatureContains(value: String): Self = this.set("signatureContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignatureContains: Self = this.set("signatureContains", js.undefined)
  }
  
}

