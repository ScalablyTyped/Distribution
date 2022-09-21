package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.AssignmentExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `134` extends StObject {
  
  var `type`: AssignmentExpression
}
object `134` {
  
  inline def apply(): `134` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[`134`]
  }
  
  extension [Self <: `134`](x: Self) {
    
    inline def setType(value: AssignmentExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
