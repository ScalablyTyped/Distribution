package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXEmptyExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `125` extends StObject {
  
  var `type`: JSXEmptyExpression
}
object `125` {
  
  inline def apply(): `125` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[`125`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `125`] (val x: Self) extends AnyVal {
    
    inline def setType(value: JSXEmptyExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
