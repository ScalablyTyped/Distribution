package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.FunctionExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `192` extends StObject {
  
  var `type`: FunctionExpression
}
object `192` {
  
  inline def apply(): `192` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[`192`]
  }
  
  extension [Self <: `192`](x: Self) {
    
    inline def setType(value: FunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
