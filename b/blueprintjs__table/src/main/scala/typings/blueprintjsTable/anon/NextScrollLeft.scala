package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextScrollLeft extends StObject {
  
  var nextScrollLeft: Unit
  
  var nextScrollTop: Unit
}
object NextScrollLeft {
  
  inline def apply(nextScrollLeft: Unit, nextScrollTop: Unit): NextScrollLeft = {
    val __obj = js.Dynamic.literal(nextScrollLeft = nextScrollLeft.asInstanceOf[js.Any], nextScrollTop = nextScrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextScrollLeft]
  }
  
  extension [Self <: NextScrollLeft](x: Self) {
    
    inline def setNextScrollLeft(value: Unit): Self = StObject.set(x, "nextScrollLeft", value.asInstanceOf[js.Any])
    
    inline def setNextScrollTop(value: Unit): Self = StObject.set(x, "nextScrollTop", value.asInstanceOf[js.Any])
  }
}
