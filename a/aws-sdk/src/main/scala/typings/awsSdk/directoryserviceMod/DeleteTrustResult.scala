package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTrustResult extends StObject {
  
  /**
    * The Trust ID of the trust relationship that was deleted.
    */
  var TrustId: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustId] = js.native
}
object DeleteTrustResult {
  
  @scala.inline
  def apply(): DeleteTrustResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrustResult]
  }
  
  @scala.inline
  implicit class DeleteTrustResultMutableBuilder[Self <: DeleteTrustResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrustId(value: TrustId): Self = StObject.set(x, "TrustId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustIdUndefined: Self = StObject.set(x, "TrustId", js.undefined)
  }
}
