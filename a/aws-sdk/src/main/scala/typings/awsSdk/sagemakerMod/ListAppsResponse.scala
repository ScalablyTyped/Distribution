package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAppsResponse extends js.Object {
  /**
    * The list of apps.
    */
  var Apps: js.UndefOr[AppList] = js.native
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListAppsResponse {
  @scala.inline
  def apply(): ListAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppsResponse]
  }
  @scala.inline
  implicit class ListAppsResponseOps[Self <: ListAppsResponse] (val x: Self) extends AnyVal {
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
    def setAppsVarargs(value: AppDetails*): Self = this.set("Apps", js.Array(value :_*))
    @scala.inline
    def setApps(value: AppList): Self = this.set("Apps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApps: Self = this.set("Apps", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

