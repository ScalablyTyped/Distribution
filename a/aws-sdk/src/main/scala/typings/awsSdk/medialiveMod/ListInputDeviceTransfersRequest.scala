package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInputDeviceTransfersRequest extends StObject {
  
  var MaxResults: js.UndefOr[typings.awsSdk.medialiveMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[string] = js.undefined
  
  var TransferType: string
}
object ListInputDeviceTransfersRequest {
  
  @scala.inline
  def apply(TransferType: string): ListInputDeviceTransfersRequest = {
    val __obj = js.Dynamic.literal(TransferType = TransferType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInputDeviceTransfersRequest]
  }
  
  @scala.inline
  implicit class ListInputDeviceTransfersRequestMutableBuilder[Self <: ListInputDeviceTransfersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTransferType(value: string): Self = StObject.set(x, "TransferType", value.asInstanceOf[js.Any])
  }
}
