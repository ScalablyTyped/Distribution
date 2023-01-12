package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogErroredRequests extends StObject {
  
  var logErroredRequests: js.UndefOr[Boolean] = js.undefined
  
  var logNormalRequests: js.UndefOr[Boolean] = js.undefined
  
  var messageMaxErrorStackTraceLength: js.UndefOr[Double] = js.undefined
  
  var messageMaxParameterValueLength: js.UndefOr[Double] = js.undefined
  
  var messageMaxQueryLength: js.UndefOr[Double] = js.undefined
  
  var slowThreshold: js.UndefOr[Double] = js.undefined
}
object LogErroredRequests {
  
  inline def apply(): LogErroredRequests = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogErroredRequests]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogErroredRequests] (val x: Self) extends AnyVal {
    
    inline def setLogErroredRequests(value: Boolean): Self = StObject.set(x, "logErroredRequests", value.asInstanceOf[js.Any])
    
    inline def setLogErroredRequestsUndefined: Self = StObject.set(x, "logErroredRequests", js.undefined)
    
    inline def setLogNormalRequests(value: Boolean): Self = StObject.set(x, "logNormalRequests", value.asInstanceOf[js.Any])
    
    inline def setLogNormalRequestsUndefined: Self = StObject.set(x, "logNormalRequests", js.undefined)
    
    inline def setMessageMaxErrorStackTraceLength(value: Double): Self = StObject.set(x, "messageMaxErrorStackTraceLength", value.asInstanceOf[js.Any])
    
    inline def setMessageMaxErrorStackTraceLengthUndefined: Self = StObject.set(x, "messageMaxErrorStackTraceLength", js.undefined)
    
    inline def setMessageMaxParameterValueLength(value: Double): Self = StObject.set(x, "messageMaxParameterValueLength", value.asInstanceOf[js.Any])
    
    inline def setMessageMaxParameterValueLengthUndefined: Self = StObject.set(x, "messageMaxParameterValueLength", js.undefined)
    
    inline def setMessageMaxQueryLength(value: Double): Self = StObject.set(x, "messageMaxQueryLength", value.asInstanceOf[js.Any])
    
    inline def setMessageMaxQueryLengthUndefined: Self = StObject.set(x, "messageMaxQueryLength", js.undefined)
    
    inline def setSlowThreshold(value: Double): Self = StObject.set(x, "slowThreshold", value.asInstanceOf[js.Any])
    
    inline def setSlowThresholdUndefined: Self = StObject.set(x, "slowThreshold", js.undefined)
  }
}
