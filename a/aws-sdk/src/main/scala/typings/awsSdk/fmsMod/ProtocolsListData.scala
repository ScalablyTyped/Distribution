package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtocolsListData extends StObject {
  
  /**
    * The time that the AWS Firewall Manager protocols list was created.
    */
  var CreateTime: js.UndefOr[TimeStamp] = js.native
  
  /**
    * The time that the AWS Firewall Manager protocols list was last updated.
    */
  var LastUpdateTime: js.UndefOr[TimeStamp] = js.native
  
  /**
    * The ID of the AWS Firewall Manager protocols list.
    */
  var ListId: js.UndefOr[typings.awsSdk.fmsMod.ListId] = js.native
  
  /**
    * The name of the AWS Firewall Manager protocols list.
    */
  var ListName: ResourceName = js.native
  
  /**
    * A unique identifier for each update to the list. When you update the list, the update token must match the token of the current version of the application list. You can retrieve the update token by getting the list. 
    */
  var ListUpdateToken: js.UndefOr[UpdateToken] = js.native
  
  /**
    * A map of previous version numbers to their corresponding protocol arrays.
    */
  var PreviousProtocolsList: js.UndefOr[typings.awsSdk.fmsMod.PreviousProtocolsList] = js.native
  
  /**
    * An array of protocols in the AWS Firewall Manager protocols list.
    */
  var ProtocolsList: typings.awsSdk.fmsMod.ProtocolsList = js.native
}
object ProtocolsListData {
  
  @scala.inline
  def apply(ListName: ResourceName, ProtocolsList: ProtocolsList): ProtocolsListData = {
    val __obj = js.Dynamic.literal(ListName = ListName.asInstanceOf[js.Any], ProtocolsList = ProtocolsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolsListData]
  }
  
  @scala.inline
  implicit class ProtocolsListDataMutableBuilder[Self <: ProtocolsListData] (val x: Self) extends AnyVal {
    
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
    def setPreviousProtocolsList(value: PreviousProtocolsList): Self = StObject.set(x, "PreviousProtocolsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousProtocolsListUndefined: Self = StObject.set(x, "PreviousProtocolsList", js.undefined)
    
    @scala.inline
    def setProtocolsList(value: ProtocolsList): Self = StObject.set(x, "ProtocolsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsListVarargs(value: Protocol*): Self = StObject.set(x, "ProtocolsList", js.Array(value :_*))
  }
}
