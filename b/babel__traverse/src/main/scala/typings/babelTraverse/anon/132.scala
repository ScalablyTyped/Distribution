package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.AssignmentExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `132` extends StObject {
  
  var `type`: AssignmentExpression
}
object `132` {
  
  inline def apply(): `132` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[`132`]
  }
  
  extension [Self <: `132`](x: Self) {
    
    inline def setType(value: AssignmentExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
