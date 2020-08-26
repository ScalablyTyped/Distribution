package typings.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlaybackConfigurationsRequest extends js.Object {
  /**
    * Maximum number of records to return. 
    */
  var MaxResults: js.UndefOr[integerMin1Max100] = js.native
  /**
    * Pagination token returned by the GET list request when results exceed the maximum allowed. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListPlaybackConfigurationsRequest {
  @scala.inline
  def apply(): ListPlaybackConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlaybackConfigurationsRequest]
  }
  @scala.inline
  implicit class ListPlaybackConfigurationsRequestOps[Self <: ListPlaybackConfigurationsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: integerMin1Max100): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

