package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that control how long the Test Runner waits for an XHR request and response to succeed
  */
trait TimeoutableXHR extends StObject {
  
  /**
    * Time to wait for the request (ms)
    *
    * @default {@link Timeoutable#timeout}
    * @see https://docs.cypress.io/guides/references/configuration.html#Timeouts
    */
  var requestTimeout: Double
  
  /**
    * Time to wait for the response (ms)
    *
    * @default {@link Timeoutable#timeout}
    * @see https://docs.cypress.io/guides/references/configuration.html#Timeouts
    */
  var responseTimeout: Double
}
object TimeoutableXHR {
  
  inline def apply(requestTimeout: Double, responseTimeout: Double): TimeoutableXHR = {
    val __obj = js.Dynamic.literal(requestTimeout = requestTimeout.asInstanceOf[js.Any], responseTimeout = responseTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutableXHR]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeoutableXHR] (val x: Self) extends AnyVal {
    
    inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    inline def setResponseTimeout(value: Double): Self = StObject.set(x, "responseTimeout", value.asInstanceOf[js.Any])
  }
}
