package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSNonNullExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97` extends StObject {
  
  var `type`: TSNonNullExpression
}
object `97` {
  
  inline def apply(): `97` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[`97`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `97`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSNonNullExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
