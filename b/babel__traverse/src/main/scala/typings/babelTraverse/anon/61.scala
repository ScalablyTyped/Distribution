package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.RecordExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `61` extends StObject {
  
  var `type`: RecordExpression
}
object `61` {
  
  inline def apply(): `61` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("RecordExpression")
    __obj.asInstanceOf[`61`]
  }
  
  extension [Self <: `61`](x: Self) {
    
    inline def setType(value: RecordExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
