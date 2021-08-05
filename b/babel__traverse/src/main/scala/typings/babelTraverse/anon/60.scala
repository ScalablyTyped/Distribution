package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.RecordExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `60` extends StObject {
  
  var `type`: RecordExpression
}
object `60` {
  
  inline def apply(): `60` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("RecordExpression")
    __obj.asInstanceOf[`60`]
  }
  
  extension [Self <: `60`](x: Self) {
    
    inline def setType(value: RecordExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
