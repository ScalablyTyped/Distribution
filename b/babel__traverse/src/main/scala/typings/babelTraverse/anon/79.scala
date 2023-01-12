package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BindExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `79` extends StObject {
  
  var `type`: BindExpression
}
object `79` {
  
  inline def apply(): `79` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BindExpression")
    __obj.asInstanceOf[`79`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `79`] (val x: Self) extends AnyVal {
    
    inline def setType(value: BindExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
