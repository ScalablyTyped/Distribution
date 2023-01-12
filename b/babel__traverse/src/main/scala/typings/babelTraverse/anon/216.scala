package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSInstantiationExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `216` extends StObject {
  
  var `type`: TSInstantiationExpression
}
object `216` {
  
  inline def apply(): `216` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSInstantiationExpression")
    __obj.asInstanceOf[`216`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `216`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSInstantiationExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
