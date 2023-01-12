package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  def defaults(options: PartialScreenshotDefaults): Unit
}
object `11` {
  
  inline def apply(defaults: PartialScreenshotDefaults => Unit): `11` = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
    __obj.asInstanceOf[`11`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `11`] (val x: Self) extends AnyVal {
    
    inline def setDefaults(value: PartialScreenshotDefaults => Unit): Self = StObject.set(x, "defaults", js.Any.fromFunction1(value))
  }
}
