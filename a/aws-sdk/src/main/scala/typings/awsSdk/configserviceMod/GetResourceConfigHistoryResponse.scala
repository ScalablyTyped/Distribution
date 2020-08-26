package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceConfigHistoryResponse extends js.Object {
  /**
    * A list that contains the configuration history of one or more resources.
    */
  var configurationItems: js.UndefOr[ConfigurationItemList] = js.native
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetResourceConfigHistoryResponse {
  @scala.inline
  def apply(): GetResourceConfigHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceConfigHistoryResponse]
  }
  @scala.inline
  implicit class GetResourceConfigHistoryResponseOps[Self <: GetResourceConfigHistoryResponse] (val x: Self) extends AnyVal {
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
    def setConfigurationItemsVarargs(value: ConfigurationItem*): Self = this.set("configurationItems", js.Array(value :_*))
    @scala.inline
    def setConfigurationItems(value: ConfigurationItemList): Self = this.set("configurationItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationItems: Self = this.set("configurationItems", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

