package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXExpressionContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `32` extends StObject {
  
  var `type`: JSXExpressionContainer
}
object `32` {
  
  inline def apply(): `32` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[`32`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `32`] (val x: Self) extends AnyVal {
    
    inline def setType(value: JSXExpressionContainer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
