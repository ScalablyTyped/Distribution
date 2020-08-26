package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsListData extends js.Object {
  /**
    * An array of applications in the AWS Firewall Manager applications list.
    */
  var AppsList: typings.awsSdk.fmsMod.AppsList = js.native
  /**
    * The time that the AWS Firewall Manager applications list was created.
    */
  var CreateTime: js.UndefOr[TimeStamp] = js.native
  /**
    * The time that the AWS Firewall Manager applications list was last updated.
    */
  var LastUpdateTime: js.UndefOr[TimeStamp] = js.native
  /**
    * The ID of the AWS Firewall Manager applications list.
    */
  var ListId: js.UndefOr[typings.awsSdk.fmsMod.ListId] = js.native
  /**
    * The name of the AWS Firewall Manager applications list.
    */
  var ListName: ResourceName = js.native
  /**
    * A unique identifier for each update to the list. When you update the list, the update token must match the token of the current version of the application list. You can retrieve the update token by getting the list. 
    */
  var ListUpdateToken: js.UndefOr[UpdateToken] = js.native
  /**
    * A map of previous version numbers to their corresponding App object arrays.
    */
  var PreviousAppsList: js.UndefOr[typings.awsSdk.fmsMod.PreviousAppsList] = js.native
}

object AppsListData {
  @scala.inline
  def apply(AppsList: AppsList, ListName: ResourceName): AppsListData = {
    val __obj = js.Dynamic.literal(AppsList = AppsList.asInstanceOf[js.Any], ListName = ListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListData]
  }
  @scala.inline
  implicit class AppsListDataOps[Self <: AppsListData] (val x: Self) extends AnyVal {
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
    def setAppsListVarargs(value: App*): Self = this.set("AppsList", js.Array(value :_*))
    @scala.inline
    def setAppsList(value: AppsList): Self = this.set("AppsList", value.asInstanceOf[js.Any])
    @scala.inline
    def setListName(value: ResourceName): Self = this.set("ListName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateTime(value: TimeStamp): Self = this.set("CreateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("CreateTime", js.undefined)
    @scala.inline
    def setLastUpdateTime(value: TimeStamp): Self = this.set("LastUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("LastUpdateTime", js.undefined)
    @scala.inline
    def setListId(value: ListId): Self = this.set("ListId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListId: Self = this.set("ListId", js.undefined)
    @scala.inline
    def setListUpdateToken(value: UpdateToken): Self = this.set("ListUpdateToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListUpdateToken: Self = this.set("ListUpdateToken", js.undefined)
    @scala.inline
    def setPreviousAppsList(value: PreviousAppsList): Self = this.set("PreviousAppsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousAppsList: Self = this.set("PreviousAppsList", js.undefined)
  }
  
}

