package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.CallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `46` extends StObject {
  
  var `type`: CallExpression
}
object `46` {
  
  inline def apply(): `46` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[`46`]
  }
  
  extension [Self <: `46`](x: Self) {
    
    inline def setType(value: CallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
