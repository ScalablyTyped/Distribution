package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTrustRequest extends StObject {
  
  /**
    * Delete a conditional forwarder as part of a DeleteTrustRequest.
    */
  var DeleteAssociatedConditionalForwarder: js.UndefOr[typings.awsSdk.directoryserviceMod.DeleteAssociatedConditionalForwarder] = js.native
  
  /**
    * The Trust ID of the trust relationship to be deleted.
    */
  var TrustId: typings.awsSdk.directoryserviceMod.TrustId = js.native
}
object DeleteTrustRequest {
  
  @scala.inline
  def apply(TrustId: TrustId): DeleteTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrustRequest]
  }
  
  @scala.inline
  implicit class DeleteTrustRequestMutableBuilder[Self <: DeleteTrustRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteAssociatedConditionalForwarder(value: DeleteAssociatedConditionalForwarder): Self = StObject.set(x, "DeleteAssociatedConditionalForwarder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAssociatedConditionalForwarderUndefined: Self = StObject.set(x, "DeleteAssociatedConditionalForwarder", js.undefined)
    
    @scala.inline
    def setTrustId(value: TrustId): Self = StObject.set(x, "TrustId", value.asInstanceOf[js.Any])
  }
}
