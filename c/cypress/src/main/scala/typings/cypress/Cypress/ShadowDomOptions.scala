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
  
  extension [Self <: ShadowDomOptions](x: Self) {
    
    inline def setIncludeShadowDom(value: Boolean): Self = StObject.set(x, "includeShadowDom", value.asInstanceOf[js.Any])
    
    inline def setIncludeShadowDomUndefined: Self = StObject.set(x, "includeShadowDom", js.undefined)
  }
}
