package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSNonNullExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `95` extends StObject {
  
  var `type`: TSNonNullExpression
}
object `95` {
  
  inline def apply(): `95` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[`95`]
  }
  
  extension [Self <: `95`](x: Self) {
    
    inline def setType(value: TSNonNullExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
