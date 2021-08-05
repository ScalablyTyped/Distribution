package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.UpdateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `98` extends StObject {
  
  var `type`: UpdateExpression
}
object `98` {
  
  inline def apply(): `98` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[`98`]
  }
  
  extension [Self <: `98`](x: Self) {
    
    inline def setType(value: UpdateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
