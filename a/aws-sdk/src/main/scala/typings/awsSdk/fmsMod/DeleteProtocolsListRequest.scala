package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProtocolsListRequest extends StObject {
  
  /**
    * The ID of the protocols list that you want to delete. You can retrieve this ID from PutProtocolsList, ListProtocolsLists, and GetProtocolsLost.
    */
  var ListId: typings.awsSdk.fmsMod.ListId = js.native
}
object DeleteProtocolsListRequest {
  
  @scala.inline
  def apply(ListId: ListId): DeleteProtocolsListRequest = {
    val __obj = js.Dynamic.literal(ListId = ListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProtocolsListRequest]
  }
  
  @scala.inline
  implicit class DeleteProtocolsListRequestMutableBuilder[Self <: DeleteProtocolsListRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListId(value: ListId): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
  }
}
