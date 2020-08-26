package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBuiltinIntentsResponse extends js.Object {
  /**
    * An array of builtinIntentMetadata objects, one for each intent in the response.
    */
  var intents: js.UndefOr[BuiltinIntentMetadataList] = js.native
  /**
    * A pagination token that fetches the next page of intents. If the response to this API call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of intents, specify the pagination token in the next request.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetBuiltinIntentsResponse {
  @scala.inline
  def apply(): GetBuiltinIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBuiltinIntentsResponse]
  }
  @scala.inline
  implicit class GetBuiltinIntentsResponseOps[Self <: GetBuiltinIntentsResponse] (val x: Self) extends AnyVal {
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
    def setIntentsVarargs(value: BuiltinIntentMetadata*): Self = this.set("intents", js.Array(value :_*))
    @scala.inline
    def setIntents(value: BuiltinIntentMetadataList): Self = this.set("intents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntents: Self = this.set("intents", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

