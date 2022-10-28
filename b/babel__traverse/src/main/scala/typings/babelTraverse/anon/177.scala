package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.UnaryExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `177` extends StObject {
  
  var `type`: UnaryExpression
}
object `177` {
  
  inline def apply(): `177` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[`177`]
  }
  
  extension [Self <: `177`](x: Self) {
    
    inline def setType(value: UnaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
