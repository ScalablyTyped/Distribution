package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBuiltinIntentsRequest extends js.Object {
  /**
    * A list of locales that the intent supports.
    */
  var locale: js.UndefOr[Locale] = js.native
  /**
    * The maximum number of intents to return in the response. The default is 10.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * A pagination token that fetches the next page of intents. If this API call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of intents, use the pagination token in the next request.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Substring to match in built-in intent signatures. An intent will be returned if any part of its signature matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz." To find the signature for an intent, see Standard Built-in Intents in the Alexa Skills Kit.
    */
  var signatureContains: js.UndefOr[String] = js.native
}

object GetBuiltinIntentsRequest {
  @scala.inline
  def apply(): GetBuiltinIntentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBuiltinIntentsRequest]
  }
  @scala.inline
  implicit class GetBuiltinIntentsRequestOps[Self <: GetBuiltinIntentsRequest] (val x: Self) extends AnyVal {
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

