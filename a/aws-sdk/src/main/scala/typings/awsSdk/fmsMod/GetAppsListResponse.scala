package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppsListResponse extends js.Object {
  /**
    * Information about the specified AWS Firewall Manager applications list.
    */
  var AppsList: js.UndefOr[AppsListData] = js.native
  /**
    * The Amazon Resource Name (ARN) of the applications list.
    */
  var AppsListArn: js.UndefOr[ResourceArn] = js.native
}

object GetAppsListResponse {
  @scala.inline
  def apply(): GetAppsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppsListResponse]
  }
  @scala.inline
  implicit class GetAppsListResponseOps[Self <: GetAppsListResponse] (val x: Self) extends AnyVal {
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
    def setAppsList(value: AppsListData): Self = this.set("AppsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsList: Self = this.set("AppsList", js.undefined)
    @scala.inline
    def setAppsListArn(value: ResourceArn): Self = this.set("AppsListArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsListArn: Self = this.set("AppsListArn", js.undefined)
  }
  
}

