package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPartnerEventSourcesResponse extends js.Object {
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.NextToken] = js.native
  /**
    * The list of partner event sources returned by the operation.
    */
  var PartnerEventSources: js.UndefOr[PartnerEventSourceList] = js.native
}

object ListPartnerEventSourcesResponse {
  @scala.inline
  def apply(): ListPartnerEventSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartnerEventSourcesResponse]
  }
  @scala.inline
  implicit class ListPartnerEventSourcesResponseOps[Self <: ListPartnerEventSourcesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPartnerEventSourcesVarargs(value: PartnerEventSource*): Self = this.set("PartnerEventSources", js.Array(value :_*))
    @scala.inline
    def setPartnerEventSources(value: PartnerEventSourceList): Self = this.set("PartnerEventSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartnerEventSources: Self = this.set("PartnerEventSources", js.undefined)
  }
  
}

