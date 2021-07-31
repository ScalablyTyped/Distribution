package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppsListRequest extends StObject {
  
  /**
    * The ID of the applications list that you want to delete. You can retrieve this ID from PutAppsList, ListAppsLists, and GetAppsList.
    */
  var ListId: typings.awsSdk.fmsMod.ListId
}
object DeleteAppsListRequest {
  
  @scala.inline
  def apply(ListId: ListId): DeleteAppsListRequest = {
    val __obj = js.Dynamic.literal(ListId = ListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppsListRequest]
  }
  
  @scala.inline
  implicit class DeleteAppsListRequestMutableBuilder[Self <: DeleteAppsListRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListId(value: ListId): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
  }
}
