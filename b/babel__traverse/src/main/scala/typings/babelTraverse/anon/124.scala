package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `124` extends StObject {
  
  var `type`: ObjectExpression
}
object `124` {
  
  inline def apply(): `124` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[`124`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `124`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ObjectExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
