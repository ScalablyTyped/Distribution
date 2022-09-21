package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.InterpreterDirective
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `87` extends StObject {
  
  var `type`: InterpreterDirective
}
object `87` {
  
  inline def apply(): `87` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("InterpreterDirective")
    __obj.asInstanceOf[`87`]
  }
  
  extension [Self <: `87`](x: Self) {
    
    inline def setType(value: InterpreterDirective): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
