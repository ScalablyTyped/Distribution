package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ArrayExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `55` extends StObject {
  
  var `type`: ArrayExpression
}
object `55` {
  
  inline def apply(): `55` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[`55`]
  }
  
  extension [Self <: `55`](x: Self) {
    
    inline def setType(value: ArrayExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
