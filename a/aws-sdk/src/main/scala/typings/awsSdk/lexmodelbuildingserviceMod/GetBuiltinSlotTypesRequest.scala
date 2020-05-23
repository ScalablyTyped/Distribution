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
  def apply(
    locale: Locale = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    signatureContains: String = null
  ): GetBuiltinSlotTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (signatureContains != null) __obj.updateDynamic("signatureContains")(signatureContains.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBuiltinSlotTypesRequest]
  }
}

