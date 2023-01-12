package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ArrayExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `56` extends StObject {
  
  var `type`: ArrayExpression
}
object `56` {
  
  inline def apply(): `56` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[`56`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `56`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ArrayExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
