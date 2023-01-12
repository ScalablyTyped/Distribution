package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowDomOptions extends StObject {
  
  var includeShadowDom: js.UndefOr[Boolean] = js.undefined
}
object ShadowDomOptions {
  
  inline def apply(): ShadowDomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowDomOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowDomOptions] (val x: Self) extends AnyVal {
    
    inline def setIncludeShadowDom(value: Boolean): Self = StObject.set(x, "includeShadowDom", value.asInstanceOf[js.Any])
    
    inline def setIncludeShadowDomUndefined: Self = StObject.set(x, "includeShadowDom", js.undefined)
  }
}
