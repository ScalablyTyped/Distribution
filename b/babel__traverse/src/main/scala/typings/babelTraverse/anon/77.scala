package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BindExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `77` extends StObject {
  
  var `type`: BindExpression
}
object `77` {
  
  inline def apply(): `77` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BindExpression")
    __obj.asInstanceOf[`77`]
  }
  
  extension [Self <: `77`](x: Self) {
    
    inline def setType(value: BindExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
