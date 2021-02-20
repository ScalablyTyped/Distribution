package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAppsListRequest extends StObject {
  
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
  implicit class PutAppsListRequestMutableBuilder[Self <: PutAppsListRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppsList(value: AppsListData): Self = StObject.set(x, "AppsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value :_*))
  }
}
