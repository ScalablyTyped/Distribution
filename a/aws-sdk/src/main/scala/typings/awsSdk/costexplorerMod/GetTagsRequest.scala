package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTagsRequest extends js.Object {
  /**
    * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * The value that you want to search for.
    */
  var SearchString: js.UndefOr[typings.awsSdk.costexplorerMod.SearchString] = js.native
  /**
    * The key of the tag that you want to return values for.
    */
  var TagKey: js.UndefOr[typings.awsSdk.costexplorerMod.TagKey] = js.native
  /**
    * The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date is exclusive. For example, if start is 2017-01-01 and end is 2017-05-01, then the cost and usage data is retrieved from 2017-01-01 up to and including 2017-04-30 but not including 2017-05-01.
    */
  var TimePeriod: DateInterval = js.native
}

object GetTagsRequest {
  @scala.inline
  def apply(TimePeriod: DateInterval): GetTagsRequest = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagsRequest]
  }
  @scala.inline
  implicit class GetTagsRequestOps[Self <: GetTagsRequest] (val x: Self) extends AnyVal {
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
    def setTimePeriod(value: DateInterval): Self = this.set("TimePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    @scala.inline
    def setSearchString(value: SearchString): Self = this.set("SearchString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchString: Self = this.set("SearchString", js.undefined)
    @scala.inline
    def setTagKey(value: TagKey): Self = this.set("TagKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagKey: Self = this.set("TagKey", js.undefined)
  }
  
}

