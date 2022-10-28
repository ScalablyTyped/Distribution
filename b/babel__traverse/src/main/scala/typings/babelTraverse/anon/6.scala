package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSSatisfiesExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var `type`: TSSatisfiesExpression
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSSatisfiesExpression")
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setType(value: TSSatisfiesExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
