package typings.cypress.typesNetStubbingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitOptions extends StObject {
  
  /**
    * Displays the command in the Command Log
    *
    * @default true
    */
  var log: Boolean
  
  /**
    * Time to wait for the request (ms)
    *
    * @default {@link Timeoutable#timeout}
    * @see https://on.cypress.io/configuration#Timeouts
    */
  var requestTimeout: Double
  
  /**
    * Time to wait for the response (ms)
    *
    * @default {@link Timeoutable#timeout}
    * @see https://on.cypress.io/configuration#Timeouts
    */
  var responseTimeout: Double
  
  /**
    * Time to wait (ms)
    *
    * @default defaultCommandTimeout
    * @see https://on.cypress.io/configuration#Timeouts
    */
  var timeout: Double
}
object WaitOptions {
  
  inline def apply(log: Boolean, requestTimeout: Double, responseTimeout: Double, timeout: Double): WaitOptions = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], requestTimeout = requestTimeout.asInstanceOf[js.Any], responseTimeout = responseTimeout.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitOptions]
  }
  
  extension [Self <: WaitOptions](x: Self) {
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    inline def setResponseTimeout(value: Double): Self = StObject.set(x, "responseTimeout", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
