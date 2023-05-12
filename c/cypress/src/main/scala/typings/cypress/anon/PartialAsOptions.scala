package typings.cypress.anon

import typings.cypress.cypressStrings.query
import typings.cypress.cypressStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.AsOptions> */
trait PartialAsOptions extends StObject {
  
  var `type`: js.UndefOr[query | static] = js.undefined
}
object PartialAsOptions {
  
  inline def apply(): PartialAsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialAsOptions] (val x: Self) extends AnyVal {
    
    inline def setType(value: query | static): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
