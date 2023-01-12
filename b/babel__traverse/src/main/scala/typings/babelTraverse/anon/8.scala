package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSAsExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var `type`: TSAsExpression
}
object `8` {
  
  inline def apply(): `8` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `8`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSAsExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
