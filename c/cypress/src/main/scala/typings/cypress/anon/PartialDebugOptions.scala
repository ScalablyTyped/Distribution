package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.DebugOptions> */
trait PartialDebugOptions extends StObject {
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object PartialDebugOptions {
  
  inline def apply(): PartialDebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDebugOptions]
  }
  
  extension [Self <: PartialDebugOptions](x: Self) {
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
