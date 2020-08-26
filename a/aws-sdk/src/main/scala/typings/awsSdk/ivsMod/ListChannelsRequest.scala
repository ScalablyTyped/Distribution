package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChannelsRequest extends js.Object {
  /**
    * Filters the channel list to match the specified name.
    */
  var filterByName: js.UndefOr[ChannelName] = js.native
  /**
    * Maximum number of channels to return.
    */
  var maxResults: js.UndefOr[MaxChannelResults] = js.native
  /**
    * The first channel to retrieve. This is used for pagination; see the nextToken response field.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListChannelsRequest {
  @scala.inline
  def apply(): ListChannelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelsRequest]
  }
  @scala.inline
  implicit class ListChannelsRequestOps[Self <: ListChannelsRequest] (val x: Self) extends AnyVal {
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
    def setFilterByName(value: ChannelName): Self = this.set("filterByName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterByName: Self = this.set("filterByName", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxChannelResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

