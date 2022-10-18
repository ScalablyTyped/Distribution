package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`3Dot75rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `42` extends StObject {
  
  var fontSize: `3Dot75rem`
}
object `42` {
  
  inline def apply(): `42` = {
    val __obj = js.Dynamic.literal(fontSize = "3.75rem")
    __obj.asInstanceOf[`42`]
  }
  
  extension [Self <: `42`](x: Self) {
    
    inline def setFontSize(value: `3Dot75rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
  }
}
