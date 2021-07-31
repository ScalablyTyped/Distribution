package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutProtocolsListResponse extends StObject {
  
  /**
    * The details of the AWS Firewall Manager protocols list.
    */
  var ProtocolsList: js.UndefOr[ProtocolsListData] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the protocols list.
    */
  var ProtocolsListArn: js.UndefOr[ResourceArn] = js.undefined
}
object PutProtocolsListResponse {
  
  @scala.inline
  def apply(): PutProtocolsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutProtocolsListResponse]
  }
  
  @scala.inline
  implicit class PutProtocolsListResponseMutableBuilder[Self <: PutProtocolsListResponse] (val x: Self) extends AnyVal {
    
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
