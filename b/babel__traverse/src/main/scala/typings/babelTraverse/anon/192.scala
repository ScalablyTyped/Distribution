package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXMemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `192` extends StObject {
  
  var `type`: JSXMemberExpression
}
object `192` {
  
  inline def apply(): `192` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[`192`]
  }
  
  extension [Self <: `192`](x: Self) {
    
    inline def setType(value: JSXMemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
