package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProtocolsListRequest extends StObject {
  
  /**
    * The ID of the protocols list that you want to delete. You can retrieve this ID from PutProtocolsList, ListProtocolsLists, and GetProtocolsLost.
    */
  var ListId: typings.awsSdk.fmsMod.ListId
}
object DeleteProtocolsListRequest {
  
  inline def apply(ListId: ListId): DeleteProtocolsListRequest = {
    val __obj = js.Dynamic.literal(ListId = ListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProtocolsListRequest]
  }
  
  extension [Self <: DeleteProtocolsListRequest](x: Self) {
    
    inline def setListId(value: ListId): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
  }
}
