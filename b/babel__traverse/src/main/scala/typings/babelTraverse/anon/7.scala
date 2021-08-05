package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSAsExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var `type`: TSAsExpression
}
object `7` {
  
  inline def apply(): `7` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setType(value: TSAsExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
