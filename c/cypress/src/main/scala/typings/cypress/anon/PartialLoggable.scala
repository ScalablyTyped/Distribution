package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.Loggable> */
trait PartialLoggable extends StObject {
  
  var log: js.UndefOr[Boolean] = js.undefined
}
object PartialLoggable {
  
  inline def apply(): PartialLoggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLoggable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialLoggable] (val x: Self) extends AnyVal {
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
  }
}
