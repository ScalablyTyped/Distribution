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
  
  inline def apply(): ProtocolsListDataSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtocolsListDataSummary]
  }
  
  extension [Self <: ProtocolsListDataSummary](x: Self) {
    
    inline def setListArn(value: ResourceArn): Self = StObject.set(x, "ListArn", value.asInstanceOf[js.Any])
    
    inline def setListArnUndefined: Self = StObject.set(x, "ListArn", js.undefined)
    
    inline def setListId(value: ListId): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
    
    inline def setListIdUndefined: Self = StObject.set(x, "ListId", js.undefined)
    
    inline def setListName(value: ResourceName): Self = StObject.set(x, "ListName", value.asInstanceOf[js.Any])
    
    inline def setListNameUndefined: Self = StObject.set(x, "ListName", js.undefined)
    
    inline def setProtocolsList(value: ProtocolsList): Self = StObject.set(x, "ProtocolsList", value.asInstanceOf[js.Any])
    
    inline def setProtocolsListUndefined: Self = StObject.set(x, "ProtocolsList", js.undefined)
    
    inline def setProtocolsListVarargs(value: Protocol*): Self = StObject.set(x, "ProtocolsList", js.Array(value :_*))
  }
}
