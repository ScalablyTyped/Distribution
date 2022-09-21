package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchesNavSubmenu extends StObject {
  
  var matchesNavSubmenu: typings.std.Element
  
  var shouldBeCollapsed: Boolean
}
object MatchesNavSubmenu {
  
  inline def apply(matchesNavSubmenu: typings.std.Element, shouldBeCollapsed: Boolean): MatchesNavSubmenu = {
    val __obj = js.Dynamic.literal(matchesNavSubmenu = matchesNavSubmenu.asInstanceOf[js.Any], shouldBeCollapsed = shouldBeCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchesNavSubmenu]
  }
  
  extension [Self <: MatchesNavSubmenu](x: Self) {
    
    inline def setMatchesNavSubmenu(value: typings.std.Element): Self = StObject.set(x, "matchesNavSubmenu", value.asInstanceOf[js.Any])
    
    inline def setShouldBeCollapsed(value: Boolean): Self = StObject.set(x, "shouldBeCollapsed", value.asInstanceOf[js.Any])
  }
}
