package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.SequenceExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `171` extends StObject {
  
  var `type`: SequenceExpression
}
object `171` {
  
  inline def apply(): `171` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[`171`]
  }
  
  extension [Self <: `171`](x: Self) {
    
    inline def setType(value: SequenceExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
