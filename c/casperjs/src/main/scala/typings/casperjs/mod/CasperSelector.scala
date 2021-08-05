package typings.casperjs.mod

import typings.casperjs.casperjsStrings.css
import typings.casperjs.casperjsStrings.xpath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CasperSelector extends StObject {
  
  var path: String
  
  var `type`: js.UndefOr[xpath | css] = js.undefined
}
object CasperSelector {
  
  inline def apply(path: String): CasperSelector = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CasperSelector]
  }
  
  extension [Self <: CasperSelector](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setType(value: xpath | css): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
