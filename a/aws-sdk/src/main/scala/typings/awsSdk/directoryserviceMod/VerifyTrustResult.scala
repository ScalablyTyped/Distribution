package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyTrustResult extends StObject {
  
  /**
    * The unique Trust ID of the trust relationship that was verified.
    */
  var TrustId: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustId] = js.native
}
object VerifyTrustResult {
  
  @scala.inline
  def apply(): VerifyTrustResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyTrustResult]
  }
  
  @scala.inline
  implicit class VerifyTrustResultMutableBuilder[Self <: VerifyTrustResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrustId(value: TrustId): Self = StObject.set(x, "TrustId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustIdUndefined: Self = StObject.set(x, "TrustId", js.undefined)
  }
}
