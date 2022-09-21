package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ArrowFunctionExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `146` extends StObject {
  
  var `type`: ArrowFunctionExpression
}
object `146` {
  
  inline def apply(): `146` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[`146`]
  }
  
  extension [Self <: `146`](x: Self) {
    
    inline def setType(value: ArrowFunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
