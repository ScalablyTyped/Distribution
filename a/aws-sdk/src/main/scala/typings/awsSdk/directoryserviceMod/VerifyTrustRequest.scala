package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyTrustRequest extends StObject {
  
  /**
    * The unique Trust ID of the trust relationship to verify.
    */
  var TrustId: typings.awsSdk.directoryserviceMod.TrustId
}
object VerifyTrustRequest {
  
  @scala.inline
  def apply(TrustId: TrustId): VerifyTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyTrustRequest]
  }
  
  @scala.inline
  implicit class VerifyTrustRequestMutableBuilder[Self <: VerifyTrustRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrustId(value: TrustId): Self = StObject.set(x, "TrustId", value.asInstanceOf[js.Any])
  }
}
