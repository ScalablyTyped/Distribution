package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DoExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `212` extends StObject {
  
  var `type`: DoExpression
}
object `212` {
  
  inline def apply(): `212` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DoExpression")
    __obj.asInstanceOf[`212`]
  }
  
  extension [Self <: `212`](x: Self) {
    
    inline def setType(value: DoExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
