package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Failable extends StObject {
  
  /**
    * Whether to fail on response codes other than 2xx and 3xx
    *
    * @default {true}
    */
  var failOnStatusCode: Boolean
  
  /**
    * Whether Cypress should automatically retry transient network errors under the hood
    *
    * @default {true}
    */
  var retryOnNetworkFailure: Boolean
  
  /**
    * Whether Cypress should automatically retry status code errors under the hood
    *
    * @default {false}
    */
  var retryOnStatusCodeFailure: Boolean
}
object Failable {
  
  inline def apply(failOnStatusCode: Boolean, retryOnNetworkFailure: Boolean, retryOnStatusCodeFailure: Boolean): Failable = {
    val __obj = js.Dynamic.literal(failOnStatusCode = failOnStatusCode.asInstanceOf[js.Any], retryOnNetworkFailure = retryOnNetworkFailure.asInstanceOf[js.Any], retryOnStatusCodeFailure = retryOnStatusCodeFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Failable] (val x: Self) extends AnyVal {
    
    inline def setFailOnStatusCode(value: Boolean): Self = StObject.set(x, "failOnStatusCode", value.asInstanceOf[js.Any])
    
    inline def setRetryOnNetworkFailure(value: Boolean): Self = StObject.set(x, "retryOnNetworkFailure", value.asInstanceOf[js.Any])
    
    inline def setRetryOnStatusCodeFailure(value: Boolean): Self = StObject.set(x, "retryOnStatusCodeFailure", value.asInstanceOf[js.Any])
  }
}
