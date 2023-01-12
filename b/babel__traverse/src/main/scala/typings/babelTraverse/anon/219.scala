package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DoExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `219` extends StObject {
  
  var `type`: DoExpression
}
object `219` {
  
  inline def apply(): `219` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DoExpression")
    __obj.asInstanceOf[`219`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `219`] (val x: Self) extends AnyVal {
    
    inline def setType(value: DoExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
