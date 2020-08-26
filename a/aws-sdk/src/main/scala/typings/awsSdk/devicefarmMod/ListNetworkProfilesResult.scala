package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNetworkProfilesResult extends js.Object {
  /**
    * A list of the available network profiles.
    */
  var networkProfiles: js.UndefOr[NetworkProfiles] = js.native
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListNetworkProfilesResult {
  @scala.inline
  def apply(): ListNetworkProfilesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNetworkProfilesResult]
  }
  @scala.inline
  implicit class ListNetworkProfilesResultOps[Self <: ListNetworkProfilesResult] (val x: Self) extends AnyVal {
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
    def setNetworkProfilesVarargs(value: NetworkProfile*): Self = this.set("networkProfiles", js.Array(value :_*))
    @scala.inline
    def setNetworkProfiles(value: NetworkProfiles): Self = this.set("networkProfiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkProfiles: Self = this.set("networkProfiles", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

