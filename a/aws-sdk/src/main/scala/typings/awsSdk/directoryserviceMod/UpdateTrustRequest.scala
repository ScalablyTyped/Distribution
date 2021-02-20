package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTrustRequest extends StObject {
  
  /**
    * Updates selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[typings.awsSdk.directoryserviceMod.SelectiveAuth] = js.native
  
  /**
    * Identifier of the trust relationship.
    */
  var TrustId: typings.awsSdk.directoryserviceMod.TrustId = js.native
}
object UpdateTrustRequest {
  
  @scala.inline
  def apply(TrustId: TrustId): UpdateTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrustRequest]
  }
  
  @scala.inline
  implicit class UpdateTrustRequestMutableBuilder[Self <: UpdateTrustRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectiveAuth(value: SelectiveAuth): Self = StObject.set(x, "SelectiveAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectiveAuthUndefined: Self = StObject.set(x, "SelectiveAuth", js.undefined)
    
    @scala.inline
    def setTrustId(value: TrustId): Self = StObject.set(x, "TrustId", value.asInstanceOf[js.Any])
  }
}
