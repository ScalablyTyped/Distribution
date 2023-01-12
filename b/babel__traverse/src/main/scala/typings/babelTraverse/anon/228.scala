package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.FunctionTypeParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `228` extends StObject {
  
  var `type`: FunctionTypeParam
}
object `228` {
  
  inline def apply(): `228` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("FunctionTypeParam")
    __obj.asInstanceOf[`228`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `228`] (val x: Self) extends AnyVal {
    
    inline def setType(value: FunctionTypeParam): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
