package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsListData extends StObject {
  
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
  implicit class AppsListDataMutableBuilder[Self <: AppsListData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppsList(value: AppsList): Self = StObject.set(x, "AppsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsListVarargs(value: App*): Self = StObject.set(x, "AppsList", js.Array(value :_*))
    
    @scala.inline
    def setCreateTime(value: TimeStamp): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: TimeStamp): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    @scala.inline
    def setListId(value: ListId): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIdUndefined: Self = StObject.set(x, "ListId", js.undefined)
    
    @scala.inline
    def setListName(value: ResourceName): Self = StObject.set(x, "ListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListUpdateToken(value: UpdateToken): Self = StObject.set(x, "ListUpdateToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListUpdateTokenUndefined: Self = StObject.set(x, "ListUpdateToken", js.undefined)
    
    @scala.inline
    def setPreviousAppsList(value: PreviousAppsList): Self = StObject.set(x, "PreviousAppsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousAppsListUndefined: Self = StObject.set(x, "PreviousAppsList", js.undefined)
  }
}
