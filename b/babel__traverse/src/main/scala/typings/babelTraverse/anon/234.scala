package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ThisExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `234` extends StObject {
  
  var `type`: ThisExpression
}
object `234` {
  
  inline def apply(): `234` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[`234`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `234`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ThisExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
