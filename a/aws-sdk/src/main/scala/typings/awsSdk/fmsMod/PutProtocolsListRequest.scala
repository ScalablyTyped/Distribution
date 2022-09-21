package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutProtocolsListRequest extends StObject {
  
  /**
    * The details of the Firewall Manager protocols list to be created.
    */
  var ProtocolsList: ProtocolsListData
  
  /**
    * The tags associated with the resource.
    */
  var TagList: js.UndefOr[typings.awsSdk.fmsMod.TagList] = js.undefined
}
object PutProtocolsListRequest {
  
  inline def apply(ProtocolsList: ProtocolsListData): PutProtocolsListRequest = {
    val __obj = js.Dynamic.literal(ProtocolsList = ProtocolsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutProtocolsListRequest]
  }
  
  extension [Self <: PutProtocolsListRequest](x: Self) {
    
    inline def setProtocolsList(value: ProtocolsListData): Self = StObject.set(x, "ProtocolsList", value.asInstanceOf[js.Any])
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
  }
}
