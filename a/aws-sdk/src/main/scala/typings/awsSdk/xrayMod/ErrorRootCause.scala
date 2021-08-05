package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorRootCause extends StObject {
  
  /**
    * A flag that denotes that the root cause impacts the trace client.
    */
  var ClientImpacting: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * A list of services corresponding to an error. A service identifies a segment and it contains a name, account ID, type, and inferred flag.
    */
  var Services: js.UndefOr[ErrorRootCauseServices] = js.undefined
}
object ErrorRootCause {
  
  inline def apply(): ErrorRootCause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorRootCause]
  }
  
  extension [Self <: ErrorRootCause](x: Self) {
    
    inline def setClientImpacting(value: NullableBoolean): Self = StObject.set(x, "ClientImpacting", value.asInstanceOf[js.Any])
    
    inline def setClientImpactingUndefined: Self = StObject.set(x, "ClientImpacting", js.undefined)
    
    inline def setServices(value: ErrorRootCauseServices): Self = StObject.set(x, "Services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "Services", js.undefined)
    
    inline def setServicesVarargs(value: ErrorRootCauseService*): Self = StObject.set(x, "Services", js.Array(value :_*))
  }
}
