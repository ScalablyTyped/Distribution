package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaultRootCause extends StObject {
  
  /**
    * A flag that denotes that the root cause impacts the trace client.
    */
  var ClientImpacting: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * A list of corresponding services. A service identifies a segment and it contains a name, account ID, type, and inferred flag.
    */
  var Services: js.UndefOr[FaultRootCauseServices] = js.undefined
}
object FaultRootCause {
  
  @scala.inline
  def apply(): FaultRootCause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaultRootCause]
  }
  
  @scala.inline
  implicit class FaultRootCauseMutableBuilder[Self <: FaultRootCause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientImpacting(value: NullableBoolean): Self = StObject.set(x, "ClientImpacting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientImpactingUndefined: Self = StObject.set(x, "ClientImpacting", js.undefined)
    
    @scala.inline
    def setServices(value: FaultRootCauseServices): Self = StObject.set(x, "Services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "Services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: FaultRootCauseService*): Self = StObject.set(x, "Services", js.Array(value :_*))
  }
}
