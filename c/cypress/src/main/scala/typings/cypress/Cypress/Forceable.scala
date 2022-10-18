package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to force an event, skipping Actionability check
  * @see https://docs.cypress.io/guides/core-concepts/interacting-with-elements.html#Actionability
  */
trait Forceable extends StObject {
  
  /**
    * Forces the action, disables waiting for actionability
    *
    * @default false
    */
  var force: Boolean
}
object Forceable {
  
  inline def apply(force: Boolean): Forceable = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Forceable]
  }
  
  extension [Self <: Forceable](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
  }
}
