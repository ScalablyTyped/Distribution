package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProtocolsListResponse extends StObject {
  
  /**
    * Information about the specified AWS Firewall Manager protocols list.
    */
  var ProtocolsList: js.UndefOr[ProtocolsListData] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the specified protocols list.
    */
  var ProtocolsListArn: js.UndefOr[ResourceArn] = js.native
}
object GetProtocolsListResponse {
  
  @scala.inline
  def apply(): GetProtocolsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProtocolsListResponse]
  }
  
  @scala.inline
  implicit class GetProtocolsListResponseMutableBuilder[Self <: GetProtocolsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtocolsList(value: ProtocolsListData): Self = StObject.set(x, "ProtocolsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsListArn(value: ResourceArn): Self = StObject.set(x, "ProtocolsListArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsListArnUndefined: Self = StObject.set(x, "ProtocolsListArn", js.undefined)
    
    @scala.inline
    def setProtocolsListUndefined: Self = StObject.set(x, "ProtocolsList", js.undefined)
  }
}
