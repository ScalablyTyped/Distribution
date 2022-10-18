package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  def defaults(options: PartialServerOptions): Unit
}
object `10` {
  
  inline def apply(defaults: PartialServerOptions => Unit): `10` = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setDefaults(value: PartialServerOptions => Unit): Self = StObject.set(x, "defaults", js.Any.fromFunction1(value))
  }
}
