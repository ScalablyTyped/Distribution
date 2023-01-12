package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ArrowFunctionExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `147` extends StObject {
  
  var `type`: ArrowFunctionExpression
}
object `147` {
  
  inline def apply(): `147` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[`147`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `147`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ArrowFunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
