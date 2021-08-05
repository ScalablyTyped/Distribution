package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `121` extends StObject {
  
  var `type`: ObjectExpression
}
object `121` {
  
  inline def apply(): `121` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[`121`]
  }
  
  extension [Self <: `121`](x: Self) {
    
    inline def setType(value: ObjectExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
