package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.NumericLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `217` extends StObject {
  
  var `type`: NumericLiteral
}
object `217` {
  
  inline def apply(): `217` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[`217`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `217`] (val x: Self) extends AnyVal {
    
    inline def setType(value: NumericLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
