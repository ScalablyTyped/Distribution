package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseTimeRootCause extends StObject {
  
  /**
    * A flag that denotes that the root cause impacts the trace client.
    */
  var ClientImpacting: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * A list of corresponding services. A service identifies a segment and contains a name, account ID, type, and inferred flag.
    */
  var Services: js.UndefOr[ResponseTimeRootCauseServices] = js.undefined
}
object ResponseTimeRootCause {
  
  @scala.inline
  def apply(): ResponseTimeRootCause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseTimeRootCause]
  }
  
  @scala.inline
  implicit class ResponseTimeRootCauseMutableBuilder[Self <: ResponseTimeRootCause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientImpacting(value: NullableBoolean): Self = StObject.set(x, "ClientImpacting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientImpactingUndefined: Self = StObject.set(x, "ClientImpacting", js.undefined)
    
    @scala.inline
    def setServices(value: ResponseTimeRootCauseServices): Self = StObject.set(x, "Services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "Services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: ResponseTimeRootCauseService*): Self = StObject.set(x, "Services", js.Array(value :_*))
  }
}
