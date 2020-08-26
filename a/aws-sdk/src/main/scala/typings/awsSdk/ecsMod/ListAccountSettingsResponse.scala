package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccountSettingsResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListAccountSettings request. When the results of a ListAccountSettings request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The account settings for the resource.
    */
  var settings: js.UndefOr[Settings] = js.native
}

object ListAccountSettingsResponse {
  @scala.inline
  def apply(): ListAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountSettingsResponse]
  }
  @scala.inline
  implicit class ListAccountSettingsResponseOps[Self <: ListAccountSettingsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setSettingsVarargs(value: Setting*): Self = this.set("settings", js.Array(value :_*))
    @scala.inline
    def setSettings(value: Settings): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
  
}

