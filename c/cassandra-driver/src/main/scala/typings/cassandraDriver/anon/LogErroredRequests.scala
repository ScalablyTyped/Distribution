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
  
  @scala.inline
  def apply(): LogErroredRequests = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogErroredRequests]
  }
  
  @scala.inline
  implicit class LogErroredRequestsMutableBuilder[Self <: LogErroredRequests] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogErroredRequests(value: Boolean): Self = StObject.set(x, "logErroredRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogErroredRequestsUndefined: Self = StObject.set(x, "logErroredRequests", js.undefined)
    
    @scala.inline
    def setLogNormalRequests(value: Boolean): Self = StObject.set(x, "logNormalRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogNormalRequestsUndefined: Self = StObject.set(x, "logNormalRequests", js.undefined)
    
    @scala.inline
    def setMessageMaxErrorStackTraceLength(value: Double): Self = StObject.set(x, "messageMaxErrorStackTraceLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageMaxErrorStackTraceLengthUndefined: Self = StObject.set(x, "messageMaxErrorStackTraceLength", js.undefined)
    
    @scala.inline
    def setMessageMaxParameterValueLength(value: Double): Self = StObject.set(x, "messageMaxParameterValueLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageMaxParameterValueLengthUndefined: Self = StObject.set(x, "messageMaxParameterValueLength", js.undefined)
    
    @scala.inline
    def setMessageMaxQueryLength(value: Double): Self = StObject.set(x, "messageMaxQueryLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageMaxQueryLengthUndefined: Self = StObject.set(x, "messageMaxQueryLength", js.undefined)
    
    @scala.inline
    def setSlowThreshold(value: Double): Self = StObject.set(x, "slowThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowThresholdUndefined: Self = StObject.set(x, "slowThreshold", js.undefined)
  }
}
