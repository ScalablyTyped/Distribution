package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Defaults extends StObject {
  
  def defaults(options: PartialKeyboardDefaultsOp): Unit
}
object Defaults {
  
  inline def apply(defaults: PartialKeyboardDefaultsOp => Unit): Defaults = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
    __obj.asInstanceOf[Defaults]
  }
  
  extension [Self <: Defaults](x: Self) {
    
    inline def setDefaults(value: PartialKeyboardDefaultsOp => Unit): Self = StObject.set(x, "defaults", js.Any.fromFunction1(value))
  }
}
