package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.OptionalCallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `44` extends StObject {
  
  var `type`: OptionalCallExpression
}
object `44` {
  
  inline def apply(): `44` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("OptionalCallExpression")
    __obj.asInstanceOf[`44`]
  }
  
  extension [Self <: `44`](x: Self) {
    
    inline def setType(value: OptionalCallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
