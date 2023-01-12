package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ParenthesizedExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `204` extends StObject {
  
  var `type`: ParenthesizedExpression
}
object `204` {
  
  inline def apply(): `204` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ParenthesizedExpression")
    __obj.asInstanceOf[`204`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `204`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ParenthesizedExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
