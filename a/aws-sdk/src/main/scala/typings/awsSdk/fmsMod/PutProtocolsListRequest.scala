package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutProtocolsListRequest extends StObject {
  
  /**
    * The details of the AWS Firewall Manager protocols list to be created.
    */
  var ProtocolsList: ProtocolsListData
  
  /**
    * The tags associated with the resource.
    */
  var TagList: js.UndefOr[typings.awsSdk.fmsMod.TagList] = js.undefined
}
object PutProtocolsListRequest {
  
  @scala.inline
  def apply(ProtocolsList: ProtocolsListData): PutProtocolsListRequest = {
    val __obj = js.Dynamic.literal(ProtocolsList = ProtocolsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutProtocolsListRequest]
  }
  
  @scala.inline
  implicit class PutProtocolsListRequestMutableBuilder[Self <: PutProtocolsListRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtocolsList(value: ProtocolsListData): Self = StObject.set(x, "ProtocolsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value :_*))
  }
}
