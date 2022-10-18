package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for Cypress.Keyboard.defaults()
  */
trait KeyboardDefaultsOptions extends StObject {
  
  /**
    * Time, in milliseconds, between each keystroke when typing. (Pass 0 to disable)
    *
    * @default 10
    */
  var keystrokeDelay: Double
}
object KeyboardDefaultsOptions {
  
  inline def apply(keystrokeDelay: Double): KeyboardDefaultsOptions = {
    val __obj = js.Dynamic.literal(keystrokeDelay = keystrokeDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardDefaultsOptions]
  }
  
  extension [Self <: KeyboardDefaultsOptions](x: Self) {
    
    inline def setKeystrokeDelay(value: Double): Self = StObject.set(x, "keystrokeDelay", value.asInstanceOf[js.Any])
  }
}
