package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.MemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `60` extends StObject {
  
  var `type`: MemberExpression
}
object `60` {
  
  inline def apply(): `60` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[`60`]
  }
  
  extension [Self <: `60`](x: Self) {
    
    inline def setType(value: MemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
