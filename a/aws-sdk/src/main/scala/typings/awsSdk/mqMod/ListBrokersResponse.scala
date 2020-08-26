package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBrokersResponse extends js.Object {
  /**
    * A list of information about all brokers.
    */
  var BrokerSummaries: js.UndefOr[listOfBrokerSummary] = js.native
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListBrokersResponse {
  @scala.inline
  def apply(): ListBrokersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBrokersResponse]
  }
  @scala.inline
  implicit class ListBrokersResponseOps[Self <: ListBrokersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBrokerSummariesVarargs(value: BrokerSummary*): Self = this.set("BrokerSummaries", js.Array(value :_*))
    @scala.inline
    def setBrokerSummaries(value: listOfBrokerSummary): Self = this.set("BrokerSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrokerSummaries: Self = this.set("BrokerSummaries", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

