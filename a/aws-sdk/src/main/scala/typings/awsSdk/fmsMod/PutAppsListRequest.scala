package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAppsListRequest extends js.Object {
  /**
    * The details of the AWS Firewall Manager applications list to be created.
    */
  var AppsList: AppsListData = js.native
  /**
    * The tags associated with the resource.
    */
  var TagList: js.UndefOr[typings.awsSdk.fmsMod.TagList] = js.native
}

object PutAppsListRequest {
  @scala.inline
  def apply(AppsList: AppsListData): PutAppsListRequest = {
    val __obj = js.Dynamic.literal(AppsList = AppsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAppsListRequest]
  }
  @scala.inline
  implicit class PutAppsListRequestOps[Self <: PutAppsListRequest] (val x: Self) extends AnyVal {
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
    def setTagListVarargs(value: Tag*): Self = this.set("TagList", js.Array(value :_*))
    @scala.inline
    def setTagList(value: TagList): Self = this.set("TagList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagList: Self = this.set("TagList", js.undefined)
  }
  
}

