package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.InterpreterDirective
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `88` extends StObject {
  
  var `type`: InterpreterDirective
}
object `88` {
  
  inline def apply(): `88` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("InterpreterDirective")
    __obj.asInstanceOf[`88`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `88`] (val x: Self) extends AnyVal {
    
    inline def setType(value: InterpreterDirective): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
