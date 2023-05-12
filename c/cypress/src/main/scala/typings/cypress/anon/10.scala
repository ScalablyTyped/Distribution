package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  def defaults(options: PartialScreenshotDefaults): Unit
}
object `10` {
  
  inline def apply(defaults: PartialScreenshotDefaults => Unit): `10` = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `10`] (val x: Self) extends AnyVal {
    
    inline def setDefaults(value: PartialScreenshotDefaults => Unit): Self = StObject.set(x, "defaults", js.Any.fromFunction1(value))
  }
}
