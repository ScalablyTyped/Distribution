package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAppsRequest extends js.Object {
  /**
    * 
    */
  var appIds: js.UndefOr[AppIds] = js.native
  /**
    * The maximum number of results to return in a single call. The default value is 50. To retrieve the remaining results, make another call with the returned NextToken value. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListAppsRequest {
  @scala.inline
  def apply(): ListAppsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppsRequest]
  }
  @scala.inline
  implicit class ListAppsRequestOps[Self <: ListAppsRequest] (val x: Self) extends AnyVal {
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
    def setAppIdsVarargs(value: AppId*): Self = this.set("appIds", js.Array(value :_*))
    @scala.inline
    def setAppIds(value: AppIds): Self = this.set("appIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppIds: Self = this.set("appIds", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

