package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShouldBeExpanded extends StObject {
  
  var shouldBeExpanded: Boolean
  
  var shouldFocusOnOpen: Boolean
}
object ShouldBeExpanded {
  
  inline def apply(shouldBeExpanded: Boolean, shouldFocusOnOpen: Boolean): ShouldBeExpanded = {
    val __obj = js.Dynamic.literal(shouldBeExpanded = shouldBeExpanded.asInstanceOf[js.Any], shouldFocusOnOpen = shouldFocusOnOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldBeExpanded]
  }
  
  extension [Self <: ShouldBeExpanded](x: Self) {
    
    inline def setShouldBeExpanded(value: Boolean): Self = StObject.set(x, "shouldBeExpanded", value.asInstanceOf[js.Any])
    
    inline def setShouldFocusOnOpen(value: Boolean): Self = StObject.set(x, "shouldFocusOnOpen", value.asInstanceOf[js.Any])
  }
}
