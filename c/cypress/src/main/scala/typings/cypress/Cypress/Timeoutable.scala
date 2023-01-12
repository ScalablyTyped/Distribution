package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that control how long Test Runner is waiting for command to succeed
  */
trait Timeoutable extends StObject {
  
  /**
    * Time to wait (ms)
    *
    * @default defaultCommandTimeout
    * @see https://docs.cypress.io/guides/references/configuration.html#Timeouts
    */
  var timeout: Double
}
object Timeoutable {
  
  inline def apply(timeout: Double): Timeoutable = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeoutable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Timeoutable] (val x: Self) extends AnyVal {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
