package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ThisExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `233` extends StObject {
  
  var `type`: ThisExpression
}
object `233` {
  
  inline def apply(): `233` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[`233`]
  }
  
  extension [Self <: `233`](x: Self) {
    
    inline def setType(value: ThisExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
