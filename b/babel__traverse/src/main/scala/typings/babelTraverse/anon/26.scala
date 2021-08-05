package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.OptionalMemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  var `type`: OptionalMemberExpression
}
object `26` {
  
  inline def apply(): `26` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("OptionalMemberExpression")
    __obj.asInstanceOf[`26`]
  }
  
  extension [Self <: `26`](x: Self) {
    
    inline def setType(value: OptionalMemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
