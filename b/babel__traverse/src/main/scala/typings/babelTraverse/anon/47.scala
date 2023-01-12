package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.CallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47` extends StObject {
  
  var `type`: CallExpression
}
object `47` {
  
  inline def apply(): `47` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[`47`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `47`] (val x: Self) extends AnyVal {
    
    inline def setType(value: CallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
