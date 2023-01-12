package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that control how a command is logged in the Reporter
  */
trait Loggable extends StObject {
  
  /**
    * Displays the command in the Command Log
    *
    * @default true
    */
  var log: Boolean
}
object Loggable {
  
  inline def apply(log: Boolean): Loggable = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loggable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Loggable] (val x: Self) extends AnyVal {
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
  }
}
