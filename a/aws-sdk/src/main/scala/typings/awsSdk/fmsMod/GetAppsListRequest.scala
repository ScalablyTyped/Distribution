package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppsListRequest extends StObject {
  
  /**
    * Specifies whether the list to retrieve is a default list owned by AWS Firewall Manager.
    */
  var DefaultList: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the AWS Firewall Manager applications list that you want the details for.
    */
  var ListId: typings.awsSdk.fmsMod.ListId
}
object GetAppsListRequest {
  
  @scala.inline
  def apply(ListId: ListId): GetAppsListRequest = {
    val __obj = js.Dynamic.literal(ListId = ListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppsListRequest]
  }
  
  @scala.inline
  implicit class GetAppsListRequestMutableBuilder[Self <: GetAppsListRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultList(value: Boolean): Self = StObject.set(x, "DefaultList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultListUndefined: Self = StObject.set(x, "DefaultList", js.undefined)
    
    @scala.inline
    def setListId(value: ListId): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
  }
}
