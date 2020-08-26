package typings.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlaybackConfigurationsResponse extends js.Object {
  /**
    * Array of playback configurations. This might be all the available configurations or a subset, depending on the settings that you provide and the total number of configurations stored. 
    */
  var Items: js.UndefOr[listOfPlaybackConfigurations] = js.native
  /**
    * Pagination token returned by the GET list request when results exceed the maximum allowed. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListPlaybackConfigurationsResponse {
  @scala.inline
  def apply(): ListPlaybackConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlaybackConfigurationsResponse]
  }
  @scala.inline
  implicit class ListPlaybackConfigurationsResponseOps[Self <: ListPlaybackConfigurationsResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: PlaybackConfiguration*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: listOfPlaybackConfigurations): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

