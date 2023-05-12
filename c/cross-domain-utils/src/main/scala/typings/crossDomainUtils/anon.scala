package typings.crossDomainUtils

import typings.crossDomainUtils.crossDomainUtilsInts.`0`
import typings.crossDomainUtils.crossDomainUtilsInts.`1`
import typings.crossDomainUtils.crossDomainUtilsInts.`2`
import typings.crossDomainUtils.crossDomainUtilsInts.`3`
import typings.crossDomainUtils.crossDomainUtilsInts.`4`
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
    val DONE: `4`
    
    /* standard dom */
    val HEADERS_RECEIVED: `2`
    
    /* standard dom */
    val LOADING: `3`
    
    /* standard dom */
    val OPENED: `1`
    
    /* standard dom */
    val UNSENT: `0`
  }
  object TypeofXMLHttpRequest {
    
    inline def apply(): TypeofXMLHttpRequest = {
      val __obj = js.Dynamic.literal(DONE = 4, HEADERS_RECEIVED = 2, LOADING = 3, OPENED = 1, UNSENT = 0)
      __obj.asInstanceOf[TypeofXMLHttpRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofXMLHttpRequest] (val x: Self) extends AnyVal {
      
      inline def setDONE(value: `4`): Self = StObject.set(x, "DONE", value.asInstanceOf[js.Any])
      
      inline def setHEADERS_RECEIVED(value: `2`): Self = StObject.set(x, "HEADERS_RECEIVED", value.asInstanceOf[js.Any])
      
      inline def setLOADING(value: `3`): Self = StObject.set(x, "LOADING", value.asInstanceOf[js.Any])
      
      inline def setOPENED(value: `1`): Self = StObject.set(x, "OPENED", value.asInstanceOf[js.Any])
      
      inline def setUNSENT(value: `0`): Self = StObject.set(x, "UNSENT", value.asInstanceOf[js.Any])
    }
  }
}
