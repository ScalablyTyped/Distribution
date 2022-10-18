package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlurOptions
  extends StObject
     with Loggable
     with Timeoutable
     with Forceable
object BlurOptions {
  
  inline def apply(force: Boolean, log: Boolean, timeout: Double): BlurOptions = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurOptions]
  }
}
