package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsListDataSummary extends js.Object {
  
  /**
    * An array of App objects in the AWS Firewall Manager applications list.
    */
  var AppsList: js.UndefOr[typings.awsSdk.fmsMod.AppsList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the applications list.
    */
  var ListArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The ID of the applications list.
    */
  var ListId: js.UndefOr[typings.awsSdk.fmsMod.ListId] = js.native
  
  /**
    * The name of the applications list.
    */
  var ListName: js.UndefOr[ResourceName] = js.native
}
object AppsListDataSummary {
  
  @scala.inline
  def apply(): AppsListDataSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsListDataSummary]
  }
  
  @scala.inline
  implicit class AppsListDataSummaryOps[Self <: AppsListDataSummary] (val x: Self) extends AnyVal {
    
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
    def deleteAppsList: Self = this.set("AppsList", js.undefined)
    
    @scala.inline
    def setListArn(value: ResourceArn): Self = this.set("ListArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListArn: Self = this.set("ListArn", js.undefined)
    
    @scala.inline
    def setListId(value: ListId): Self = this.set("ListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListId: Self = this.set("ListId", js.undefined)
    
    @scala.inline
    def setListName(value: ResourceName): Self = this.set("ListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListName: Self = this.set("ListName", js.undefined)
  }
}
