package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlatformApplicationsResponse extends js.Object {
  /**
    * NextToken string is returned when calling ListPlatformApplications action if additional records are available after the first page results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Platform applications returned when calling ListPlatformApplications action.
    */
  var PlatformApplications: js.UndefOr[ListOfPlatformApplications] = js.native
}

object ListPlatformApplicationsResponse {
  @scala.inline
  def apply(): ListPlatformApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformApplicationsResponse]
  }
  @scala.inline
  implicit class ListPlatformApplicationsResponseOps[Self <: ListPlatformApplicationsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPlatformApplicationsVarargs(value: PlatformApplication*): Self = this.set("PlatformApplications", js.Array(value :_*))
    @scala.inline
    def setPlatformApplications(value: ListOfPlatformApplications): Self = this.set("PlatformApplications", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformApplications: Self = this.set("PlatformApplications", js.undefined)
  }
  
}

