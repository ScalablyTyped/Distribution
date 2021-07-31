package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtocolsListDataSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the specified protocols list.
    */
  var ListArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ID of the specified protocols list.
    */
  var ListId: js.UndefOr[typings.awsSdk.fmsMod.ListId] = js.undefined
  
  /**
    * The name of the specified protocols list.
    */
  var ListName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * An array of protocols in the AWS Firewall Manager protocols list.
    */
  var ProtocolsList: js.UndefOr[typings.awsSdk.fmsMod.ProtocolsList] = js.undefined
}
object ProtocolsListDataSummary {
  
  @scala.inline
  def apply(): ProtocolsListDataSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtocolsListDataSummary]
  }
  
  @scala.inline
  implicit class ProtocolsListDataSummaryMutableBuilder[Self <: ProtocolsListDataSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListArn(value: ResourceArn): Self = StObject.set(x, "ListArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListArnUndefined: Self = StObject.set(x, "ListArn", js.undefined)
    
    @scala.inline
    def setListId(value: ListId): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIdUndefined: Self = StObject.set(x, "ListId", js.undefined)
    
    @scala.inline
    def setListName(value: ResourceName): Self = StObject.set(x, "ListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListNameUndefined: Self = StObject.set(x, "ListName", js.undefined)
    
    @scala.inline
    def setProtocolsList(value: ProtocolsList): Self = StObject.set(x, "ProtocolsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsListUndefined: Self = StObject.set(x, "ProtocolsList", js.undefined)
    
    @scala.inline
    def setProtocolsListVarargs(value: Protocol*): Self = StObject.set(x, "ProtocolsList", js.Array(value :_*))
  }
}
