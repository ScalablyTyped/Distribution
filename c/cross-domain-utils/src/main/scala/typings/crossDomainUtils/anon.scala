package typings.crossDomainUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cancel extends StObject {
    
    def cancel(): Unit
  }
  object Cancel {
    
    inline def apply(cancel: () => Unit): Cancel = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
      __obj.asInstanceOf[Cancel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    }
  }
  
  trait MockUserAgent extends StObject {
    
    var mockUserAgent: js.UndefOr[String] = js.undefined
    
    var userAgent: String
  }
  object MockUserAgent {
    
    inline def apply(userAgent: String): MockUserAgent = {
      val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockUserAgent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MockUserAgent] (val x: Self) extends AnyVal {
      
      inline def setMockUserAgent(value: String): Self = StObject.set(x, "mockUserAgent", value.asInstanceOf[js.Any])
      
      inline def setMockUserAgentUndefined: Self = StObject.set(x, "mockUserAgent", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofXMLHttpRequest extends StObject {
    
    /* standard dom */
    val DONE: Double
    
    /* standard dom */
    val HEADERS_RECEIVED: Double
    
    /* standard dom */
    val LOADING: Double
    
    /* standard dom */
    val OPENED: Double
    
    /* standard dom */
    val UNSENT: Double
  }
  object TypeofXMLHttpRequest {
    
    inline def apply(DONE: Double, HEADERS_RECEIVED: Double, LOADING: Double, OPENED: Double, UNSENT: Double): TypeofXMLHttpRequest = {
      val __obj = js.Dynamic.literal(DONE = DONE.asInstanceOf[js.Any], HEADERS_RECEIVED = HEADERS_RECEIVED.asInstanceOf[js.Any], LOADING = LOADING.asInstanceOf[js.Any], OPENED = OPENED.asInstanceOf[js.Any], UNSENT = UNSENT.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofXMLHttpRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofXMLHttpRequest] (val x: Self) extends AnyVal {
      
      inline def setDONE(value: Double): Self = StObject.set(x, "DONE", value.asInstanceOf[js.Any])
      
      inline def setHEADERS_RECEIVED(value: Double): Self = StObject.set(x, "HEADERS_RECEIVED", value.asInstanceOf[js.Any])
      
      inline def setLOADING(value: Double): Self = StObject.set(x, "LOADING", value.asInstanceOf[js.Any])
      
      inline def setOPENED(value: Double): Self = StObject.set(x, "OPENED", value.asInstanceOf[js.Any])
      
      inline def setUNSENT(value: Double): Self = StObject.set(x, "UNSENT", value.asInstanceOf[js.Any])
    }
  }
}
