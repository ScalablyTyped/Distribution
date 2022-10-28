package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.NewExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `59` extends StObject {
  
  var `type`: NewExpression
}
object `59` {
  
  inline def apply(): `59` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[`59`]
  }
  
  extension [Self <: `59`](x: Self) {
    
    inline def setType(value: NewExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
