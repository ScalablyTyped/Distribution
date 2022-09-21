package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mark extends StObject {
  
  var mark: line
}
object Mark {
  
  inline def apply(): Mark = {
    val __obj = js.Dynamic.literal(mark = "line")
    __obj.asInstanceOf[Mark]
  }
  
  extension [Self <: Mark](x: Self) {
    
    inline def setMark(value: line): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
  }
}
