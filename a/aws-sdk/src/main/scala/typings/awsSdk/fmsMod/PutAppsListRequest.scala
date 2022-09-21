package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAppsListRequest extends StObject {
  
  /**
    * The details of the Firewall Manager applications list to be created.
    */
  var AppsList: AppsListData
  
  /**
    * The tags associated with the resource.
    */
  var TagList: js.UndefOr[typings.awsSdk.fmsMod.TagList] = js.undefined
}
object PutAppsListRequest {
  
  inline def apply(AppsList: AppsListData): PutAppsListRequest = {
    val __obj = js.Dynamic.literal(AppsList = AppsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAppsListRequest]
  }
  
  extension [Self <: PutAppsListRequest](x: Self) {
    
    inline def setAppsList(value: AppsListData): Self = StObject.set(x, "AppsList", value.asInstanceOf[js.Any])
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
  }
}
