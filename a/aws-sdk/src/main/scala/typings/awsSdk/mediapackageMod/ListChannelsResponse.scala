package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChannelsResponse extends js.Object {
  /**
    * A list of Channel records.
    */
  var Channels: js.UndefOr[listOfChannel] = js.native
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListChannelsResponse {
  @scala.inline
  def apply(): ListChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelsResponse]
  }
  @scala.inline
  implicit class ListChannelsResponseOps[Self <: ListChannelsResponse] (val x: Self) extends AnyVal {
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
    def setChannelsVarargs(value: Channel*): Self = this.set("Channels", js.Array(value :_*))
    @scala.inline
    def setChannels(value: listOfChannel): Self = this.set("Channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("Channels", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

