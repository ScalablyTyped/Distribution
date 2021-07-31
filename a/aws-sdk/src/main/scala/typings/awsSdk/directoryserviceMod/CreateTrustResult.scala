package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrustResult extends StObject {
  
  /**
    * A unique identifier for the trust relationship that was created.
    */
  var TrustId: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustId] = js.undefined
}
object CreateTrustResult {
  
  @scala.inline
  def apply(): CreateTrustResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTrustResult]
  }
  
  @scala.inline
  implicit class CreateTrustResultMutableBuilder[Self <: CreateTrustResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrustId(value: TrustId): Self = StObject.set(x, "TrustId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustIdUndefined: Self = StObject.set(x, "TrustId", js.undefined)
  }
}
