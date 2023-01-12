package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.OptionalCallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  var `type`: OptionalCallExpression
}
object `45` {
  
  inline def apply(): `45` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("OptionalCallExpression")
    __obj.asInstanceOf[`45`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `45`] (val x: Self) extends AnyVal {
    
    inline def setType(value: OptionalCallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
